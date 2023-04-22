package dandustry.recipe;

import gregtech.api.recipes.RecipeMaps;

import static dandustry.item.DandustryMaterials.*;
import static gregtech.api.GTValues.EV;
import static gregtech.api.GTValues.V;
import static gregtech.api.unification.material.Materials.Water;

public class PlasmaFuels {

    public static void init() {
        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getPlasma(1))
                .fluidOutputs(OmniversalLubricant.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(Water.getPlasma(1))
                .fluidOutputs(Water.getFluid(1))
                .duration(64)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(AssemblyLine.getPlasma(1))
                .fluidOutputs(AssemblyLine.getFluid(1))
                .duration(256)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(DestabilizedMatter.getPlasma(1))
                .fluidOutputs(DestabilizedMatter.getFluid(1))
                .duration(32)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(ExoticMatter.getPlasma(1))
                .fluidOutputs(ExoticMatter.getFluid(1))
                .duration(48)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(DarkMatter.getPlasma(1))
                .fluidOutputs(DarkMatter.getFluid(1))
                .duration(64)
                .EUt((int) V[EV])
                .buildAndRegister();

        RecipeMaps.PLASMA_GENERATOR_FUELS.recipeBuilder()
                .fluidInputs(RedMatter.getPlasma(1))
                .fluidOutputs(RedMatter.getFluid(1))
                .duration(72)
                .EUt((int) V[EV])
                .buildAndRegister();
    }
}
