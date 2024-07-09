package serendustry.recipe

import gregtech.api.GTValues.*
import gregtech.api.recipes.RecipeMaps.ELECTROLYZER_RECIPES
import gregtech.api.unification.material.Materials.*
import serendustry.item.material.*

internal fun starMatterRecipes() {

    val amount = listOf(1F, 1.2F, 1.4F, 1.4F, 1.4F, 1.8F)
    val matter = listOf(YellowStarMatter, RedStarMatter, BlueStarMatter, WhiteStarMatter, BrownStarMatter, BlackStarMatter)

    for (i in 0..amount.size - 1) {
        ELECTROLYZER_RECIPES.recipeBuilder()
            .fluidInputs(matter[i].getFluid(10000))
            .fluidOutputs(Iron.getFluid(((144 * 64 * amount[i]).toInt())))
            .fluidOutputs(Copper.getFluid((144 * 64 * amount[i]).toInt()))
            .fluidOutputs(Chrome.getFluid((144 * 64 * amount[i]).toInt()))
            .fluidOutputs(CarbonMonoxide.getFluid((50000 * amount[i]).toInt()))
            .fluidOutputs(CarbonDioxide.getFluid((50000 * amount[i]).toInt()))
            .fluidOutputs(Methane.getFluid((100000 * amount[i]).toInt()))
            .duration(12000).EUt(VA[UHV]).buildAndRegister()
    }

    ELECTROLYZER_RECIPES.recipeBuilder()
        .fluidInputs(PulsarStarMatter.getFluid(10000))
        .fluidOutputs(TengamRaw.getFluid(144 * 16))
        .fluidOutputs(Neutronium.getFluid(144 * 32))
        .duration(12000).EUt(VA[UEV]).buildAndRegister()
}
