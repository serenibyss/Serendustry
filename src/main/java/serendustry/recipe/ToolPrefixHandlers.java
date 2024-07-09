package serendustry.recipe;

import gregtech.api.unification.material.Material;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.properties.PropertyKey;
import static gregtech.api.unification.material.properties.PropertyKey.GEM;
import static gregtech.api.unification.material.properties.ToolProperty;
import static gregtech.api.unification.ore.OrePrefix;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.api.unification.stack.UnificationEntry;
import static gregtech.common.items.SerendustryToolItems;
import static gregtech.loaders.recipe.handlers.ToolRecipeHandler;

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

