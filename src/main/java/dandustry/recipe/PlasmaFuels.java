package dandustry.recipe;

import gregtech.api.recipes.RecipeMaps;

import static dandustry.item.DDMaterials.AssemblyLine;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.Water;

public class PlasmaFuels {

    public static void init() {
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
    }
}