package dandustry;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.event.HighTierEvent;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.loaders.recipe.CraftingComponent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

import static dandustry.item.DDMaterials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.*;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class DandustryEventHandler {

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
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);

        // Glass
        // todo: add chromatic glass?

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, HULL_PLATE, plate, RadoxPolymer);
        appendToComponent(GTValues.UIV, HULL_PLATE, plateDouble, RadoxPolymer, RadoxPolymer);
        appendToComponent(GTValues.OpV, HULL_PLATE, plateDense, RadoxPolymer);
        appendToComponent(GTValues.MAX, HULL_PLATE, plateDense, Floppa);

        // Rotor
        appendToComponent(ROTOR, rotor, EnrichedNaquadahAlloy, TastyNeutronium, EnderiiumBase, InfinityCatalyst, Quantium);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Sticks
        // todo: magnetic rods past samarium
        // STICK_MAGNETIC, STICK_ELECTROMAGNETIC, STICK_RADIOACTIVE
        appendToComponent(STICK_DISTILLATION, spring, Lafium, Signalium, Bedrockium, Quantium, Infinity);

        // Reactor Pipe
        appendToComponent(GTValues.UHV, PIPE_REACTOR, pipeTinyFluid, RadoxPolymer);
        appendToComponent(GTValues.UEV, PIPE_REACTOR, pipeSmallFluid, RadoxPolymer);
        appendToComponent(GTValues.UIV, PIPE_REACTOR, pipeNormalFluid, RadoxPolymer);
        appendToComponent(GTValues.UXV, PIPE_REACTOR, pipeLargeFluid, RadoxPolymer);
        appendToComponent(GTValues.OpV, PIPE_REACTOR, pipeHugeFluid, RadoxPolymer);

        // Power Component
        // Add something past UHPIC?

        // Voltage Coil
        // todo

        // Spring
        appendToComponent(GTValues.UEV, SPRING, spring, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
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