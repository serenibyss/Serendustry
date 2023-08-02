package serendustry.machine

import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.builders.SimpleRecipeBuilder

class RecipeMapTranscendentPlasmaMixer(name: String, inputs: Int, outputs: Int, fluidInputs: Int, fluidOutputs: Int, hidden: Boolean):
    RecipeMap<SimpleRecipeBuilder>(name, inputs, outputs, fluidInputs, fluidOutputs, SimpleRecipeBuilder(), hidden) {

        // todo custom page
}
