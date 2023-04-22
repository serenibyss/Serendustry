package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.common.metatileentities.MetaTileEntities;

import static dandustry.item.DDMaterials.Teflon;
import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

public class MiscRecipes {
    public static void init() {
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Polytetrafluoroethylene, 15).input(dust, Polyethylene, 3).input(dust, Carbon)
                .fluidInputs(Sodium.getFluid(1000))
                .fluidOutputs(Teflon.getFluid(2880))
                .requireInside(MetaTileEntities.ALLOY_SMELTER[GTValues.IV])
                .duration(600).EUt(VA[IV]).buildAndRegister();
    }
}