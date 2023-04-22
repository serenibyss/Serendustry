package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;

import static dandustry.Dandustry.QUANTIUM_STAR;
import static dandustry.Dandustry.QUANTUM_ANOMALY;
import static dandustry.item.DDMaterials.*;
import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import static gregtech.common.items.MetaItems.GRAVI_STAR;

public class MiscRecipes {
    public static void init() {
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Polytetrafluoroethylene, 15).input(dust, Polyethylene, 3).input(dust, Carbon)
                .fluidInputs(Sodium.getFluid(1000))
                .fluidOutputs(Teflon.getFluid(2880))
                .requireInside(RecipeMaps.ALLOY_SMELTER_RECIPES, GTValues.EV, 1)
                .duration(600).EUt(VA[IV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Glass, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, ChromaticGlass)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Redstone, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, OmniversalRedstone)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, OmniversalRedstone)
                .fluidInputs(Xenoxene.getFluid(1000))
                .fluidOutputs(OmniversalLubricant.getFluid(1000))
                .requireInside(RecipeMaps.MIXER_RECIPES, GTValues.UV, 1)
                .duration(400).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(GRAVI_STAR, 8)
                .fluidInputs(Quantium.getFluid(1000))
                .output(QUANTIUM_STAR)
                .duration(800).EUt(VA[UXV]).buildAndRegister();
    }
}