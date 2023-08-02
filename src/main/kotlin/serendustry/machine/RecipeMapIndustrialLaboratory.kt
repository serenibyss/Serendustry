package serendustry.machine

import gregtech.api.recipes.RecipeMap

class RecipeMapIndustrialLaboratory(name: String, inputs: Int, outputs: Int, fluidInputs: Int, fluidOutputs: Int, hidden: Boolean):
    RecipeMap<LaboratoryRecipeBuilder>(name, inputs, outputs, fluidInputs, fluidOutputs, LaboratoryRecipeBuilder(), hidden) {

    // todo custom layout
}
