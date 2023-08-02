package serendustry.machine

import gregtech.api.GTValues
import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.TieredMetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.pattern.PatternMatchContext
import gregtech.api.pattern.TraceabilityPredicate
import gregtech.api.recipes.Recipe
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMaps
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockGlassCasing
import gregtech.common.blocks.BlockMachineCasing
import gregtech.common.blocks.MetaBlocks
import net.minecraft.block.state.IBlockState
import net.minecraft.util.ResourceLocation
import net.minecraft.util.math.BlockPos

class MetaTileEntityIndustrialLaboratory(id: ResourceLocation): RecipeMapMultiblockController(id, LABORATORY_RECIPES) {

    private var mode = Mode.NORMAL

    private val laboratoryResources = LaboratoryResources()

    init {
        this.recipeMapWorkable = IndustrialLaboratoryRecipeLogic(this)
    }

    override fun createMetaTileEntity(te: IGregTechTileEntity) = MetaTileEntityIndustrialLaboratory(metaTileEntityId)

    override fun createStructurePattern(): BlockPattern =
        FactoryBlockPattern.start()
            .aisle("XXXXX", "XGGGX", "XGGGX", "XXXXX")
            .aisle("XXXXX", "G###G", "G###G", "XXXXX")
            .aisle("XXXXX", "G###G", "G###G", "XXXXX")
            .aisle("XXXXX", "G###G", "G###G", "XXXXX")
            .aisle("XXSXX", "XGGGX", "XGGGX", "XXXXX")
            .where('S', selfPredicate())
            .where('X', states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
            .where('G', states(getGlassState()))
            .where('#', innerPredicate())
            .build()

    override fun getBaseTexture(part: IMultiblockPart?): ICubeRenderer = Textures.INERT_PTFE_CASING // todo

    // todo
    private fun getCasingState(): IBlockState = MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.IV)

    // todo
    private fun getGlassState(): IBlockState = MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.LAMINATED_GLASS)

    private fun innerPredicate(): TraceabilityPredicate = TraceabilityPredicate { bws ->
        if (bws.blockState.block.isAir(bws.blockState, bws.world, bws.pos)) {
            return@TraceabilityPredicate true
        }
        val tileEntity = bws.tileEntity
        if (tileEntity !is IGregTechTileEntity) {
            laboratoryResources.removePos(bws.pos)
            return@TraceabilityPredicate false
        }

        val mte = (tileEntity as IGregTechTileEntity).metaTileEntity
        if (!LaboratoryProperty.isMachineAllowed(mte) || mte !is TieredMetaTileEntity) {
            return@TraceabilityPredicate false
        }
        laboratoryResources.putAtPos(bws.pos, mte)
        return@TraceabilityPredicate true
    }

    override fun invalidateStructure() {
        super.invalidateStructure()
        laboratoryResources.onInvalidateStructure()
    }

    override fun formStructure(context: PatternMatchContext?) {
        super.formStructure(context)
        mode = Mode.NORMAL
    }

    private enum class Mode {
        NORMAL, PARALLEL_REACTOR, // todo more modes
    }

    private class IndustrialLaboratoryRecipeLogic(te: RecipeMapMultiblockController): MultiblockRecipeLogic(te) {

        override fun getMetaTileEntity() = super.getMetaTileEntity() as MetaTileEntityIndustrialLaboratory

        override fun getParallelLimit() = if (getMetaTileEntity().mode == Mode.PARALLEL_REACTOR) 16 else 1

        override fun getRecipeMap(): RecipeMap<*> = if (getMetaTileEntity().mode == Mode.PARALLEL_REACTOR)
            RecipeMaps.CHEMICAL_RECIPES else LABORATORY_RECIPES

        override fun checkRecipe(recipe: Recipe): Boolean {
            if (!super.checkRecipe(recipe)) return false
            val entry = recipe.getProperty(LaboratoryProperty.getInstance(), null) ?: return true
            return getMetaTileEntity().laboratoryResources.matchesEntry(entry)
        }
    }

    private class LaboratoryResources {

        private val internalMachines = mutableMapOf<BlockPos, TieredMetaTileEntity>()
        private val internalRecipeData = mutableMapOf<RecipeMap<*>, RecipeMapData>()

        fun putAtPos(pos: BlockPos, machine: TieredMetaTileEntity) {
            if (!internalMachines.containsKey(pos) || internalMachines[pos] != machine) {
                val map = machine.recipeMap ?: return
                val tier = machine.tier.takeUnless { it < 0 } ?: return
                internalRecipeData.computeIfAbsent(map) { RecipeMapData() }.also { it.insertAtTier(tier, 1) }
                internalMachines[pos] = machine
            }
        }

        fun removePos(pos: BlockPos) {
            val tieredMte = internalMachines[pos] ?: return
            val map = tieredMte.recipeMap ?: return
            val tier = tieredMte.tier
            internalRecipeData[map]?.takeIf { tier >= 0 }?.removeFromTier(tier, 1)
            internalMachines.remove(pos)
        }

        fun onInvalidateStructure() {
            internalMachines.clear()
            internalRecipeData.clear()
        }

        fun matchesEntry(entry: LaboratoryProperty.LaboratoryEntry): Boolean {
            for (cell in entry.getMachineTable().cellSet()) {
                val map = cell.rowKey ?: continue
                val tier = cell.columnKey ?: continue
                val count = cell.value ?: continue
                val mapData = internalRecipeData[map] ?: continue
                if (mapData.getNumMatchingTier(tier) < count) return false
            }
            return true
        }
    }

    private class RecipeMapData {

        private val countArray = IntArray(GTValues.MAX)

        fun insertAtTier(tier: Int, count: Int) {
            if (tier !in 0 until GTValues.MAX) return
            for (i in 0..tier) {
                countArray[i] += count
            }
        }

        fun removeFromTier(tier: Int, count: Int) {
            if(tier !in 0 until GTValues.MAX) return
            for (i in 0..tier) {
                countArray[i] = (countArray[i] - count).coerceAtLeast(0)
            }
        }

        fun getNumMatchingTier(tier: Int) = countArray.getOrNull(tier) ?: 0
    }
}
