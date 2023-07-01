package serendustry.machine;

import gregtech.api.capability.impl.FluidTankList;
import gregtech.api.gui.ModularUI;
import gregtech.api.recipes.RecipeMap;
import net.minecraftforge.items.IItemHandlerModifiable;

import javax.annotation.Nonnull;

public class RecipeMapTranscendentPlasmaMixer extends RecipeMap<TranscendentPlasmaMixerRecipeBuilder> {

    public RecipeMapTranscendentPlasmaMixer(@Nonnull String unlocalizedName, int maxInputs, int maxOutputs, int maxFluidInputs, int maxFluidOutputs, boolean isHidden) {
        super(unlocalizedName, maxInputs, maxOutputs, maxFluidInputs, maxFluidOutputs, new TranscendentPlasmaMixerRecipeBuilder(), isHidden);
    }

    @Override
    public ModularUI.Builder createJeiUITemplate(IItemHandlerModifiable importItems, IItemHandlerModifiable exportItems, FluidTankList importFluids, FluidTankList exportFluids, int yOffset) {
        return super.createJeiUITemplate(importItems, exportItems, importFluids, exportFluids, yOffset);
    }

    @Override
    protected void addInventorySlotGroup(ModularUI.Builder builder, IItemHandlerModifiable itemHandler, FluidTankList fluidHandler, boolean isOutputs, int yOffset) {
        super.addInventorySlotGroup(builder, itemHandler, fluidHandler, isOutputs, yOffset);
    }
}
