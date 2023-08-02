package serendustry.machine

import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMaps
import gregtech.api.recipes.builders.SimpleRecipeBuilder

val LABORATORY_RECIPES = RecipeMapIndustrialLaboratory("industrial_laboratory", 4, 4, 4, 4, false)
val PLASMA_MIXER_RECIPES = RecipeMapTranscendentPlasmaMixer("transcendent_plasma_mixer", 0, 0, 9, 2, false)
val DIGESTER_RECIPES = RecipeMap("digester", 3, 9, 3, 3, SimpleRecipeBuilder(), false)

class SerendustryRecipeMaps {
    companion object {
        fun preInit() {
            RecipeMaps.BLAST_RECIPES.maxFluidInputs = 2
            RecipeMaps.BLAST_RECIPES.maxFluidOutputs = 2
            RecipeMaps.CENTRIFUGE_RECIPES.maxOutputs = 9
            RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.maxOutputs = 6
            RecipeMaps.LASER_ENGRAVER_RECIPES.maxInputs = 4
            RecipeMaps.MIXER_RECIPES.maxInputs = 9
            RecipeMaps.MIXER_RECIPES.maxFluidInputs = 3
        }
    }
}
