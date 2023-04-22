package dandustry;

import dandustry.machine.LaboratoryProperty;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.event.HighTierEvent;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.loaders.recipe.CraftingComponent;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

import static dandustry.item.DDMaterials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.*;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class DandustryEventHandler {

    // todo remove
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerAllowedLaboratoryMachines(RegistryEvent.Register<IRecipe> event) {
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.CHEMICAL_REACTOR);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.CHEMICAL_BATH);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.ELECTROLYZER);
    }

    @SubscribeEvent
	public static void enableHighTierEvent(HighTierEvent event) {
		event.enableHighTier();
	}

    @SubscribeEvent
    public static void appendCraftingComponent(GregTechAPI.RegisterEvent<CraftingComponent> event) {
        // Wires / Cables
        appendToComponent(WIRE_ELECTRIC, wireGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_QUAD, wireGtQuadruple, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_OCT, wireGtOctal, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_HEX, wireGtHex, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE, cableGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_QUAD, cableGtQuadruple, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_OCT, cableGtOctal, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_HEX, cableGtHex, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UV, CABLE_TIER_UP, wireGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, Quantium);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, Quantium);

        // Glass
        // todo

        // Plates
        appendToComponent(PLATE, plate, EnrichedNaquadahAlloy, TastyNeutronium, Signalium, Bedrockium, Quantium);
        appendToComponent(DOUBLE_PLATE, plateDouble, EnrichedNaquadahAlloy, TastyNeutronium, Signalium, Bedrockium, Quantium);
        appendToComponent(HULL_PLATE, plate, HastelloyK243, Enderiiium, AwakenedDraconium, Quantium);

        // Rotor
        appendToComponent(ROTOR, rotor, EnrichedNaquadahAlloy, TastyNeutronium, EnderiiumBase, InfinityCatalyst, Quantium);

        // Coils
        // todo

        // Sticks
        // todo

        // Pipe reactor
        // todo

        // Voltage Coil
        // todo

        // Spring
        appendToComponent(GTValues.UEV, SPRING, spring, Lafium, Signalium, Bedrockium, Quantium, Infinity);
    }

    private static void appendToComponent(Component component, OrePrefix prefix, Material... materials) {
        appendToComponent(GTValues.UHV, component, prefix, materials);
    }

    private static void appendToComponent(int startTier, Component component, OrePrefix prefix, Material... materials) {
        if (materials == null) return;
        if (startTier < GTValues.ULV || startTier > GTValues.MAX) return;
        int index = startTier;
        Map<Integer, Object> appendMap = new HashMap<>();
        for (Material material : materials) {
            if (index > GTValues.MAX) break;
            appendMap.put(index++, new UnificationEntry(prefix, material));
        }
        component.appendIngredients(appendMap);
    }
}