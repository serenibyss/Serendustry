package serendustry.recipe

import gregtech.api.unification.material.Material
import gregtech.api.unification.material.info.MaterialFlags.*
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.PropertyKey.GEM
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.ore.OrePrefix.*
import gregtech.api.unification.stack.UnificationEntry
import gregtech.common.items.SerendustryToolItems
import gregtech.loaders.recipe.handlers.ToolRecipeHandler

internal fun registerToolPrefixHandler() {
       plate.addProcessingHandler(PropertyKey.TOOL, ::processTool)
}

private fun processTool(prefix: OrePrefix, material: Material, property: ToolProperty) {
    val block = UnificationEntry(OrePrefix.block, material)
    val plate = UnificationEntry(OrePrefix.plate, material)
    val ingot = UnificationEntry(
        if (material.hasProperty(GEM)) gem else OrePrefix.ingot,
        material
    )
    val stickLong = UnificationEntry(OrePrefix.stickLong, material)
    val screw = UnificationEntry(OrePrefix.screw, material)

    if (material.hasFlag(GENERATE_PLATE) && material.hasFlag(GENERATE_ROD) && material.hasFlag(GENERATE_BOLT_SCREW)) {
        SerendustryToolItems.SKOOKUM_CHOOCHER?.let {
            ToolRecipeHandler.addToolRecipe(
                material, it, true,
                "BdP", "IPP", "LS ",
                'B', block,
                'P', plate,
                'I', ingot,
                'L', stickLong,
                'S', screw
            )
        }
    }
}

