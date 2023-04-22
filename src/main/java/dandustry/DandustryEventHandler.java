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
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.loaders.recipe.CraftingComponent.*;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class DandustryEventHandler {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void registerAllowedLaboratoryMachines(RegistryEvent.Register<IRecipe> event) {
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.CHEMICAL_REACTOR);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.CHEMICAL_BATH);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.ELECTROLYZER);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.FLUID_SOLIDIFIER);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.ALLOY_SMELTER);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.ELECTRIC_FURNACE);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.POLARIZER);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.CANNER);
        LaboratoryProperty.registerLaboratoryMachine(MetaTileEntities.ELECTROMAGNETIC_SEPARATOR);
    }

    @SubscribeEvent
	public static void enableHighTierEvent(HighTierEvent event) {
		event.enableHighTier();
	}

    @SubscribeEvent
    public static void appendCraftingComponent(GregTechAPI.RegisterEvent<CraftingComponent> event) {
        // Wires / Cables
        appendToComponent(GTValues.UEV, WIRE_ELECTRIC, wireGtSingle, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, WIRE_QUAD, wireGtQuadruple, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, WIRE_OCT, wireGtOctal, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, WIRE_HEX, wireGtHex, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, CABLE, cableGtSingle, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, CABLE_QUAD, cableGtQuadruple, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, CABLE_OCT, cableGtOctal, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UEV, CABLE_HEX, cableGtHex, Lafium, Signalium, Bedrockium, Quantium, Floppa);
        appendToComponent(GTValues.UV, CABLE_TIER_UP, wireGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium, Floppa);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);

        // Glass
        appendToComponent(GLASS, block, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass);

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(HULL_PLATE, plateDense, Teflon);
        appendToComponent(GTValues.UEV, HULL_PLATE, plate, RadoxPolymer);
        appendToComponent(GTValues.UIV, HULL_PLATE, plateDouble, RadoxPolymer, RadoxPolymer);
        appendToComponent(GTValues.OpV, HULL_PLATE, plateDense, RadoxPolymer);
        appendToComponent(GTValues.MAX, HULL_PLATE, plateDense, Floppa);

        // Rotor
        appendToComponent(ROTOR, rotor, EnrichedNaquadahAlloy, TastyNeutronium, EnderiiumBase, InfinityCatalyst, Quantium);

        // Grinder
        // TODO: More Grinding Head tiers?

        // Sawblade
        appendToComponent(SAWBLADE, toolHeadBuzzSaw, Neutronium, HastelloyK243, StellarAlloy, AwakenedDraconium, Quantum);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_HEATING_DOUBLE, wireGtQuadruple, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Sticks
        // todo: STICK_RADIOACTIVE
        appendToComponent(STICK_MAGNETIC, stickLong, SamariumMagnetic, SamariumMagnetic);
        appendToComponent(GTValues.UIV, STICK_MAGNETIC, stick, KerrBlackHole);
        appendToComponent(GTValues.UXV, STICK_MAGNETIC, stickLong, KerrBlackHole, KerrBlackHole);
        appendToComponent(STICK_ELECTROMAGNETIC, stickLong, EnrichedNaquadahAlloy, Aluminum, Lumiium, CrystalMatrix, Ledox);
        appendToComponent(STICK_DISTILLATION, spring, Pikyonium, Lafium, Signalium, Bedrockium, Quantium, Infinity);

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