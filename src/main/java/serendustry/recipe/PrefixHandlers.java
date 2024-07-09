package serendustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.OreProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.ConfigHolder;
import net.minecraft.item.ItemStack;
import static serendustry.item.material.ISHydrochloricAcid;
import static serendustry.item.material.ISHydrofluoricAcid;
import static serendustry.item.material.ISSulfuricAcid;
import static serendustry.machine.DIGESTER_RECIPES;

internal fun registerPrefixHandlers() {

    OrePrefix.ore.addProcessingHandler(PropertyKey.ORE, ::processOre)
    OrePrefix.oreNetherrack.addProcessingHandler(PropertyKey.ORE, ::processOre)
    OrePrefix.oreEndstone.addProcessingHandler(PropertyKey.ORE, ::processOre)
    if (ConfigHolder.worldgen.allUniqueStoneTypes) {
        OrePrefix.oreGranite.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreDiorite.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreAndesite.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreBasalt.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreBlackgranite.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreMarble.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreRedgranite.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreSand.addProcessingHandler(PropertyKey.ORE, ::processOre)
        OrePrefix.oreRedSand.addProcessingHandler(PropertyKey.ORE, ::processOre)
    }
}

private val fluids = mapOf(
    Pair(ISSulfuricAcid, 2),
    Pair(ISHydrochloricAcid, 3),
    Pair(ISHydrofluoricAcid, 4),
)

private fun processOre(prefix: OrePrefix, material: Material, property: OreProperty) {
    val amountOfCrushedOre = property.oreMultiplier
    val oreTypeMultiplier = if (prefix == OrePrefix.oreNetherrack || prefix == OrePrefix.oreEndstone) 2 else 1
    val byproduct = property.getOreByProduct(0, material)
    val byproductStack = OreDictUnifier.get(OrePrefix.gem, byproduct, 32).takeUnless { it.isEmpty() }
        ?: OreDictUnifier.get(OrePrefix.dust, byproduct, 32)

    val outputCrushed = amountOfCrushedOre * 8 * oreTypeMultiplier

    val builder = DIGESTER_RECIPES.recipeBuilder()
        .input(prefix, material, 8)
        .duration(500)
        .EUt(GTValues.VA[GTValues.HV])

    for (entry in fluids.entries) {
        val builder2 = builder.copy()
        val byproductStack2: ItemStack = byproductStack.copy()
        byproductStack2.count = byproductStack.count * entry.value
        builder2.chancedOutput(byproductStack2, 1400, 850)
        var outputCrushed2: Int = outputCrushed * entry.value
        while (outputCrushed2 > 0) {
            val amountToDo = outputCrushed2.coerceAtMost(64)
            builder2.output(OrePrefix.crushed, material, amountToDo)
            outputCrushed2 -= amountToDo
        }
        for (secondary in prefix.secondaryMaterials) {
            if (secondary.material.hasProperty(PropertyKey.DUST)) {
                val dustStack = OreDictUnifier.getGem(secondary)
                dustStack.count = 16 * entry.value
                builder2.chancedOutput(dustStack, 6700, 800)
            }
        }
        builder2.fluidInputs(entry.key.getFluid(1000))
        builder2.buildAndRegister();
    }
}
