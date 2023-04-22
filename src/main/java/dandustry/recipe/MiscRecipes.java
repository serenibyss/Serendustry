package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.common.metatileentities.MetaTileEntities;

import static dandustry.Dandustry.QUANTUM_ANOMALY;
import static dandustry.item.DDMaterials.*;
import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.BLAST_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LASER_ENGRAVER_RECIPES;
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

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Redstone, 32)
                .input(QUANTUM_ANOMALY)
                .output(dust, OmniversalRedstone)
                .duration(400).EUt(VA[UV]).buildAndRegister();
        
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, OmniversalRedstone)
                .fluidInputs(Xenoxene.getFluid(1000))
                .fluidOutputs(OmniversalLubricant.getFluid(1000))
                .requireInside(MetaTileEntities.MIXER[GTValues.UV])
                .duration(400).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();
    }
}