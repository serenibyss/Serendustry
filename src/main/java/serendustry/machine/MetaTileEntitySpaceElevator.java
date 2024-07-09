package serendustry.machine;

import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

class MetaTileEntitySpaceElevator(rl: ResourceLocation): RecipeMapMultiblockController(rl, SPACE_ELEVATOR_RECIPES) {

    override fun createMetaTileEntity(te: IGregTechTileEntity) = MetaTileEntitySpaceElevator(metaTileEntityId)

    override fun createStructurePattern(): BlockPattern =
        FactoryBlockPattern.start()
            .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
            .aisle("XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX", "XXX")
            .aisle("XXX", "XXX", "XXX", "XXX", "XSX", "XXX", "XXX", "XXX", "XXX")
            .where('S', selfPredicate())
            .where('X', states(getCasingState()).setMinGlobalLimited(60).or(autoAbilities()))
            .build()

    override fun getBaseTexture(part: IMultiblockPart?): ICubeRenderer = Textures.INERT_PTFE_CASING // todo

    // todo: add custom ??? Casing
    private fun getCasingState(): IBlockState = MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UV)
}
