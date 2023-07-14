package serendustry.recipe;

import com.google.common.collect.ImmutableMap;
import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.OreProperty;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.util.GTUtility;
import gregtech.common.ConfigHolder;
import net.minecraft.item.ItemStack;
import serendustry.item.SerendustryMaterials;
import serendustry.machine.SerendustryRecipeMaps;

import java.util.Map;

public class PrefixHandlers {

    public static void register() {
        OrePrefix.ore.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        OrePrefix.oreNetherrack.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        OrePrefix.oreEndstone.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        if (ConfigHolder.worldgen.allUniqueStoneTypes) {
            OrePrefix.oreGranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreDiorite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreAndesite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreBasalt.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreBlackgranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreMarble.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreRedgranite.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreSand.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
            OrePrefix.oreRedSand.addProcessingHandler(PropertyKey.ORE, PrefixHandlers::processOre);
        }
    }

    private static final Map<Material, Integer> fluids = ImmutableMap.<Material, Integer>builder()
            .put(SerendustryMaterials.ISSulfuricAcid, 2)
            .put(SerendustryMaterials.ISHydrochloricAcid, 3)
            .put(SerendustryMaterials.ISHydrofluoricAcid, 4)
            .build();

    public static void processOre(OrePrefix prefix, Material material, OreProperty property) {
        int amountOfCrushedOre = property.getOreMultiplier();
        int oreTypeMultiplier = prefix == OrePrefix.oreNetherrack || prefix == OrePrefix.oreEndstone ? 2 : 1;
        Material byproduct = property.getOreByProduct(0, material);
        ItemStack byproductStack = OreDictUnifier.get(OrePrefix.gem, byproduct, 32);
        if (byproductStack.isEmpty()) byproductStack = OreDictUnifier.get(OrePrefix.dust, byproduct, 32);

        int outputCrushed = amountOfCrushedOre * 8 * oreTypeMultiplier;

        var builder = SerendustryRecipeMaps.DIGESTER_RECIPES.recipeBuilder()
                .input(prefix, material, 8)
                .duration(500)
                .EUt(GTValues.VA[GTValues.HV]);

        for (var entry :fluids.entrySet()) {
            var builder2 = builder.copy();
            var byproductStack2 = byproductStack.copy();
            byproductStack2.setCount(byproductStack.getCount() * entry.getValue());
            builder2.chancedOutput(byproductStack2, 1400, 850);
            int outputCrushed2 = outputCrushed * entry.getValue();
            while (outputCrushed2 > 0) {
                int amountToDo = Math.min(64, outputCrushed2);
                builder2.output(OrePrefix.crushed, material, amountToDo);
                outputCrushed2 -= amountToDo;
            }
            for (MaterialStack secondary : prefix.secondaryMaterials) {
                if (secondary.material.hasProperty(PropertyKey.DUST)) {
                    ItemStack dustStack = OreDictUnifier.getGem(secondary);
                    dustStack.setCount(16 * entry.getValue());
                    builder2.chancedOutput(dustStack, 6700, 800);
                }
            }
            builder2.fluidInputs(entry.getKey().getFluid(1000));
            builder2.buildAndRegister();
        }
    }
}
