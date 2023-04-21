package dandustry.machine;

import dandustry.machine.LaboratoryProperty.LaboratoryEntry;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.PatternMatchContext;
import gregtech.api.pattern.TraceabilityPredicate;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashSet;

public class MetaTileEntityIndustrialLaboratory extends RecipeMapMultiblockController {

    private Mode mode = Mode.NORMAL;
    private final Collection<ResourceLocation> laboratoryResources = new HashSet<>();

    public MetaTileEntityIndustrialLaboratory(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, DandustryRecipeMaps.LABORATORY_RECIPES);
        this.recipeMapWorkable = new IndustrialLaboratoryRecipeLogic(this);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityIndustrialLaboratory(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXX", "XGGGX", "XGGGX", "XXXXX")
                .aisle("XXXXX", "G###G", "G###G", "XXXXX")
                .aisle("XXXXX", "G###G", "G###G", "XXXXX")
                .aisle("XXXXX", "G###G", "G###G", "XXXXX")
                .aisle("XXSXX", "XGGGX", "XGGGX", "XXXXX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('G', states(getGlassState()))
                .where('#', innerPredicate())
                .build();
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.INERT_PTFE_CASING; // todo
    }

    protected IBlockState getCasingState() {
        // todo
        return MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.IV);
    }

    protected IBlockState getGlassState() {
        // todo
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.LAMINATED_GLASS);
    }

    @Override
    public void invalidateStructure() {
        super.invalidateStructure();
        this.laboratoryResources.clear();
    }

    @Nonnull
    protected TraceabilityPredicate innerPredicate() {
        return new TraceabilityPredicate(bws -> {
            // todo might want to be more allowing on what can be inside
            if (bws.getBlockState().getBlock().isAir(bws.getBlockState(), bws.getWorld(), bws.getPos())) {
                return true;
            }
            TileEntity tileEntity = bws.getTileEntity();
            if (!(tileEntity instanceof IGregTechTileEntity)) return false;

            MetaTileEntity metaTileEntity = ((IGregTechTileEntity) tileEntity).getMetaTileEntity();

            if (!LaboratoryProperty.isMachineAllowed(metaTileEntity)) return false;
            laboratoryResources.add(metaTileEntity.metaTileEntityId);
            return true;
        });
    }

    @Override
    protected void formStructure(PatternMatchContext context) {
        super.formStructure(context);
        mode = Mode.NORMAL; // todo determine mode based on structure here
    }

    private enum Mode {
        NORMAL, PARALLEL_REACTOR, // todo more modes
    }

    private static class IndustrialLaboratoryRecipeLogic extends MultiblockRecipeLogic {

        public IndustrialLaboratoryRecipeLogic(RecipeMapMultiblockController tileEntity) {
            super(tileEntity);
        }

        @Nonnull
        @Override
        public MetaTileEntityIndustrialLaboratory getMetaTileEntity() {
            return (MetaTileEntityIndustrialLaboratory) super.getMetaTileEntity();
        }

        @Override
        public int getParallelLimit() {
            switch (getMetaTileEntity().mode) {
                case PARALLEL_REACTOR:
                    return 16; // todo details
                case NORMAL:
                default:
                    return 1;
            }
        }

        @Nullable
        @Override
        public RecipeMap<?> getRecipeMap() {
            switch (getMetaTileEntity().mode) {
                case PARALLEL_REACTOR:
                    return RecipeMaps.CHEMICAL_RECIPES;
                case NORMAL:
                default:
                    return DandustryRecipeMaps.LABORATORY_RECIPES;
            }
        }

        @Override
        public boolean checkRecipe(@Nonnull Recipe recipe) {
            if (!super.checkRecipe(recipe)) {
                return false;
            }

            LaboratoryEntry entry = recipe.getProperty(LaboratoryProperty.getInstance(), null);
            if (entry != null) {
                // todo fix: this doesnt alloy for an IV chem reactor to satisfy EV chem reactor requirement
                return getMetaTileEntity().laboratoryResources.containsAll(entry.getMachines());
            }
            return true;
        }
    }
}
