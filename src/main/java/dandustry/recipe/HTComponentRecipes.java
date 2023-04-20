package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;

public class HTComponentRecipes {
	
    public static void init() {
	
		// Motors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic, 4)
                .input(stickLong, HighDurabilityCompoundSteel, 8)
                .input(ring, FluxedElectrum, 8)
                .input(round, FluxedElectrum, 16)
                .input(wireFine, EnrichedNaquadahAlloy.getWireFine(64))
                .input(wireFine, EnrichedNaquadahAlloy.getWireFine(64))
				.input(wireFine, Amogus.getWireFine(64))
                .input(wireFine, Amogus.getWireFine(64))
                .input(cableGtSingle, Pikyonium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(1800))
                .fluidInputs(Materials.Lubricant.getFluid(4000))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(1200))
                .output(ELECTRIC_MOTOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, SamariumMagnetic, 8)
                .input(stickLong, HastelloyK243, 8)
                .input(ring, Lafium, 8)
                .input(round, Lafium, 16)
                .input(wireFine, Aluminum.getWireFine(64))
                .input(wireFine, Aluminum.getWireFine(64))
				.input(wireFine, HastelloyK243.getWireFine(64))
                .input(wireFine, HastelloyK243.getWireFine(64))
                .input(cableGtSingle, Lafium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(Materials.Lubricant.getFluid(8000))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(2400))
                .output(ELECTRIC_MOTOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Conveyors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV, 2)
                .input(plate, HighDurabilityCompoundSteel, 4)
                .input(ring, HighDurabilityCompoundSteel, 8)
                .input(round, FluxedElectrum, 32)
				.input(screw, FluxedElectrum, 8)
                .input(cableGtSingle, Pikyonium, 4)
                .fluidInputs(Materials.SolderingAlloy.getFluid(1800))
                .fluidInputs(Materials.Lubricant.getFluid(4000))
				.fluidInputs(Materials.StyreneButadieneRubber.getFluid(12000))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(1200))
                .output(CONVEYOR_MODULE_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV, 2)
				.input(plate, HastelloyK243, 4)
                .input(ring, HastelloyK243, 8)
                .input(round, Lafium, 32)
				.input(screw, Lafium, 8)
                .input(cableGtSingle, Lafium, 4)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(Materials.Lubricant.getFluid(8000))
				.fluidInputs(Materials.StyreneButadieneRubber.getFluid(24000))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(2400))
                .output(CONVEYOR_MODULE_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Pumps
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV)
                .input(pipeLargeFluid, Cinobite, 2)
                .input(plate, HighDurabilityCompoundSteel, 4)
                .input(screw, HighDurabilityCompoundSteel, 16)
                .input(ring, SiliconeRubber, 32)
                .input(rotor, EnrichedNaquadahAlloy, 1)
                .input(cableGtSingle, Pikyonium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(1800))
                .fluidInputs(Materials.Lubricant.getFluid(4000))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(1200))
                .output(ELECTRIC_PUMP_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV)
				.input(pipeLargeFluid, Lafium, 2)
                .input(plate, HastelloyK243, 4)
                .input(screw, HastelloyK243, 16)
                .input(ring, SiliconeRubber, 64)
                .input(rotor, TastyNeutronium, 1)
                .input(cableGtSingle, Lafium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(Materials.Lubricant.getFluid(8000))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(2400))
                .output(ELECTRIC_PUMP_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Pistons
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV)
                .input(plate, HighDurabilityCompoundSteel, 4)
                .input(screw, HighDurabilityCompoundSteel, 16)
				.input(round, FluxedElectrum, 32)
                .input(gear, EnrichedNaquadahAlloy, 2)
                .input(gearSmall, Pikyonium, 4)
                .fluidInputs(Materials.SolderingAlloy.getFluid(1800))
                .fluidInputs(Materials.Lubricant.getFluid(4000))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(1200))
                .output(ELECTRIC_PISTON_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV)
				.input(plate, HastelloyK243, 4)
                .input(screw, HastelloyK243, 16)
				.input(round, Lafium, 32)
                .input(gear, Aluminum, 2)
                .input(gearSmall, Lafium, 4)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(Materials.Lubricant.getFluid(8000))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(2400))
                .output(ELECTRIC_PISTON_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Robot Arms
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, HighDurabilityCompoundSteel, 8)
				.input(gear, EnrichedNaquadahAlloy, 2)
				.input(gearSmall, Pikyonium, 6)
				.input(ELECTRIC_MOTOR_UHV, 2)
                .input(ELECTRIC_PISTON_UHV, 1)
				.input(circuit, Tier.UHV, 1)
				.input(circuit, Tier.UV, 2)
				.input(circuit, Tier.ZPM, 4)
                .input(cableGtSingle, Pikyonium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(Materials.Lubricant.getFluid(4000))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(2400))
                .output(ROBOT_ARM_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, HastelloyK243, 8)
				.input(gear, Aluminum, 2)
				.input(gearSmall, Lafium, 6)
				.input(ELECTRIC_MOTOR_UEV, 2)
                .input(ELECTRIC_PISTON_UEV, 1)
				.input(circuit, Tier.UHV, 2)
				.input(circuit, Tier.UV, 4)
				.input(circuit, Tier.ZPM, 8)
                .input(cableGtSingle, Lafium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(7200))
                .fluidInputs(Materials.Lubricant.getFluid(8000))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(4800))
                .output(ROBOT_ARM_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Field Generators
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frame, HighDurabilityCompoundSteel, 2)
				.input(plate, EnrichedNaquadahAlloy, 12)
				.input(GRAVI_STAR, 2)
				.input(EMITTER_UHV, 2)
				.input(circuit, Tier.UHV, 2)
                .input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
				.input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
				.input(wireFine, Amogus, 64)
				.input(wireFine, Amogus, 64)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(2400))
                .output(FIELD_GENERATOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
			ASSEMBLY_LINE_RECIPES.recipeBuilder()
				 .input(frame, HastelloyK243, 2)
				.input(plate, TastyNeutronium, 12)
				.input(GRAVI_STAR, 2)
				.input(EMITTER_UEV, 2)
				.input(circuit, Tier.UHV, 4)
                .input(wireFine, MagnetoResonaticCinobitePikyoniumAluminum, 64)
				.input(wireFine, MagnetoResonaticCinobitePikyoniumAluminum, 64)
				.input(wireFine, TastyNeutronium, 64)
				.input(wireFine, TastyNeutronium, 64)
                .fluidInputs(Materials.SolderingAlloy.getFluid(7200))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(4800))
                .output(FIELD_GENERATOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Sensors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frame, HighDurabilityCompoundSteel, 2)
				.input(ELECTRIC_MOTOR_UHV, 2)
				.input(plate, EnrichedNaquadahAlloy, 8)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 2)
                .input(foil, Cinobite, 64)
				.input(foil, Cinobite, 64)
				.input(cableGtSingle, Pikyonium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(2400))
                .output(SENSOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frame, HastelloyK243, 2)
				.input(ELECTRIC_MOTOR_UHV, 2)
				.input(plate, Aluminum, 8)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 4)
                .input(foil, TastyNeutronium, 64)
				.input(foil, TastyNeutronium, 64)
				.input(cableGtSingle, Lafium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(7200))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(4800))
                .output(SENSOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
				
		// Emitters
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frame, HighDurabilityCompoundSteel, 2)
				.input(ELECTRIC_MOTOR_UHV, 2)
				.input(stickLong, EnrichedNaquadahAlloy, 8)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 2)
                .input(foil, Cinobite, 64)
				.input(foil, Cinobite, 64)
				.input(cableGtSingle, Pikyonium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(3600))
                .fluidInputs(DDMaterials.FluxedElectrum.getFluid(2400))
                .output(EMITTER_UHV)
                .duration(800).EUt(300000).buildAndRegister();
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frame, HastelloyK243, 2)
				.input(ELECTRIC_MOTOR_UHV, 2)
				.input(stickLong, Aluminum, 8)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 4)
                .input(foil, TastyNeutronium, 64)
				.input(foil, TastyNeutronium, 64)
				.input(cableGtSingle, Lafium, 8)
                .fluidInputs(Materials.SolderingAlloy.getFluid(7200))
                .fluidInputs(DDMaterials.TastyNeutronium.getFluid(4800))
                .output(EMITTER_UEV)
                .duration(1200).EUt(800000).buildAndRegister();
    }
}
