package serendustry.recipe;

import gregtech.api.unification.material.Material;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static serendustry.item.material.SerendustryMaterials.*;

public class StarMatterRecipes {
    public static void init() {

        float[] amount = {1F, 1.2F, 1.4F, 1.4F, 1.4F, 1.8F};
        Material[] matter = {YellowStarMatter, RedStarMatter, BlueStarMatter, WhiteStarMatter, BrownStarMatter, BlackStarMatter};

        for (int i = 0; i < amount.length; i++) {
            ELECTROLYZER_RECIPES.recipeBuilder()
                    .fluidInputs(matter[i].getFluid(10000))
                    .fluidOutputs(Iron.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(Copper.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(Chrome.getFluid((int) (144 * 64 * amount[i])))
                    .fluidOutputs(CarbonMonoxide.getFluid((int) (50000 * amount[i])))
                    .fluidOutputs(CarbonDioxide.getFluid((int) (50000 * amount[i])))
                    .fluidOutputs(Methane.getFluid((int) (100000 * amount[i])))
                    .duration(12000).EUt(VA[UHV]).buildAndRegister();
        }

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(PulsarStarMatter.getFluid(10000))
                .fluidOutputs(TengamRaw.getFluid(144 * 16))
                .fluidOutputs(Neutronium.getFluid(144 * 32))
                .duration(12000).EUt(VA[UEV]).buildAndRegister();
    }
}
