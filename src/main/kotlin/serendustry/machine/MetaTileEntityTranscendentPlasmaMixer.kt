package serendustry.machine

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockMachineCasing
import gregtech.common.blocks.MetaBlocks
import net.minecraft.block.state.IBlockState
import net.minecraft.util.ResourceLocation

class MetaTileEntityTranscendentPlasmaMixer(rl: ResourceLocation): RecipeMapMultiblockController(rl, PLASMA_MIXER_RECIPES) {

    override fun createMetaTileEntity(te: IGregTechTileEntity) = MetaTileEntityTranscendentPlasmaMixer(metaTileEntityId)

    override fun createStructurePattern(): BlockPattern =
        FactoryBlockPattern.start()
            .aisle("XXX", "XXX", "XXX")
            .aisle("XXX", "XXX", "XXX")
            .aisle("XXX", "XXX", "XXX")
            .aisle("XXX", "XXX", "XXX")
            .aisle("XXX", "XSX", "XXX")
            .where('S', selfPredicate())
            .where('X', states(getCasingState()).setMinGlobalLimited(60).or(autoAbilities()))
            .build()

    override fun getBaseTexture(part: IMultiblockPart?): ICubeRenderer = Textures.INERT_PTFE_CASING // todo

    // todo: add custom Physically Improbable Noble Gases Casing
    private fun getCasingState(): IBlockState = MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UIV)
}
