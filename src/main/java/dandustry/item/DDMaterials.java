package dandustry.item;

import gregtech.api.GTValues;
import gregtech.api.fluids.fluidType.FluidTypes;
/*
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.WireProperty;
import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.material.properties.IngotProperty;*/
import static gregtech.api.unification.material.*;
import gregtech.api.unification.material.info.MaterialFlags;

/*
import gregtech.api.GTValues;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material.;
import gregtech.api.unification.material.Materials.*;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.WireProperty;
import gregtech.api.unification.material.properties.DustProperty;
import gregtech.api.unification.material.properties.IngotProperty;
import static gregtech.api.unification.material.info.MaterialFlags.*;
*/

public class DDMaterials {

    public static Material animalWaste;
	public static Material InfusedGold;
	public static Material FluxedElectrum;
	public static Material Amogus;
	public static Material NiobiumNitride;
	public static Material Fermium258;
	public static Material HastelloyX78;
	public static Material Mendelevium261;
	public static Material HastelloyK243;
	public static Material Technetium22;
	public static Material Zeron100;
	public static Material Cinobite;
	public static Material Inconel792;
	public static Material EglinSteel;
	public static Material Platinium;
	public static Material Pikyonium;
	public static Material HastelloyN;
	public static Material Lafium;
	public static Material EnrichedNaquadahAlloy;
	public static Material BismuthTellurite;
	public static Material Prasiolite;
	public static Material CubicZirconia;
	public static Material MagnetoResonatic;
	public static Material HighDurabilityCompoundSteel;
	public static Material MagnetoResonaticCinobitePikyoniumAluminum;
	public static Material TastyNeutronium;

    public static void init() {
		
		Oxygen.setProperty(PropertyKey.DUST, new DustProperty());
		Hydrogen.setProperty(PropertyKey.DUST, new DustProperty());
		Water.setProperty(PropertyKey.DUST, new DustProperty());
		
		Einsteinium.setProperty(PropertyKey.DUST, new DustProperty());
		Fermium.setProperty(PropertyKey.DUST, new DustProperty());
		Mendelevium.setProperty(PropertyKey.DUST, new DustProperty());
		Dubnium.setProperty(PropertyKey.DUST, new DustProperty());
		Rutherfordium.setProperty(PropertyKey.DUST, new DustProperty());
		Oganesson.setProperty(PropertyKey.DUST, new DustProperty());
		
		Oxygen.setProperty(PropertyKey.INGOT, new DustProperty());
		Hydrogen.setProperty(PropertyKey.INGOT, new DustProperty());
		Water.setProperty(PropertyKey.INGOT, new DustProperty());
		
		Einsteinium.setProperty(PropertyKey.INGOT, new DustProperty());
		Fermium.setProperty(PropertyKey.INGOT, new DustProperty());
		Mendelevium.setProperty(PropertyKey.INGOT, new DustProperty());
		Dubnium.setProperty(PropertyKey.INGOT, new DustProperty());
		Rutherfordium.setProperty(PropertyKey.INGOT, new DustProperty());
		Oganesson.setProperty(PropertyKey.INGOT, new IngotProperty());
		
        animalWaste = new Material.Builder(19000, "animal_waste")
                .ingot().fluid().color(0x7B5C00)
                .build();
		
		InfusedGold = new Material.Builder(19001, "infused_gold")
                .ingot().fluid()
                .color(0xA59030).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Gold, 4)
                .build()
				.setFormula("(Au4Ma)", true);
				
		FluxedElectrum = new Material.Builder(19002, "fluxed_electrum")
                .ingot(3).fluid()
                .color(0xFFE049).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_RING, GENERATE_ROUND, GENERATE_SCREW)
                .components(RoseGold, 1, SterlingSilver, 1, Electrum, 2, InfusedGold, 2, Naquadria, 4, SolderingAlloy, 10)
                .blastTemp(8000, GasTier.HIGH, VA[UV], 8000)
				.cableProperties(VA[UEV], 4, 128, false, 3)
                .fluidTemp(8000)
                .build();
		
		Amogus = new Material.Builder(19003, "amogus")
                .ingot(3).fluid()
                .color(0xFEE13F).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FINE_WIRE)
                .components(Americium, 1, Oganesson, 1, Uranium, 1, Sulfur, 1)
                .blastTemp(7000, GasTier.HIGH, VA[UV], 5000)
                .fluidTemp(6000)
                .build();
		
		NiobiumNitride = new Material.Builder(19004, "niobium_nitride")
                .dust(0)
                .color(0x101710).iconSet(SHINY)
                .flags(GENERATE_DUST)
                .components(Niobium, 1, Nitrogen, 1)
                .build();
				
		HastelloyX78 = new Material.Builder(19005, "hastelloyx78")
                .ingot(3).fluid()
                .color(0x5F90C9).iconSet(SHINY)
                .flags(STD_METAL)
                .components(NaquadahAlloy, 10, Rhenium, 5, Naquadria, 4, Gadolinium, 3, Polonium, 3, Strontium, 2, Rutherfordium, 2, Fermium, 1)
                .blastTemp(8500, GasTier.HIGH, VA[UV], 10000)
                .fluidTemp(7500)
                .build();
				
		HastelloyK243 = new Material.Builder(19006, "hastelloyk243")
                .ingot(3).fluid()
                .color(0x9FEC60).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE)
                .components(HastelloyX78, 5, Tritanium, 4, TungstenCarbide, 4, Promethium, 4, NiobiumNitride, 2, Mendelevium, 1)
                .blastTemp(9000, GasTier.HIGHER, VA[UHV], 12000)
                .fluidTemp(8500)
                .build();
				
		Technetium22 = new Material.Builder(19007, "technetium22")
                .ingot(3).fluid()
                .color(0xC6AA14).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Technetium, 22)
                .blastTemp(9000, GasTier.HIGH, VA[ULV], 120000)
                .fluidTemp(10000)
                .build();
				
		Zeron100 = new Material.Builder(19008, "zeron100")
                .ingot(3).fluid()
                .color(0xA8A813).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Steel, 20, Chrome, 13, Copper, 10, Nickel, 3, Molybdenum, 2, Tungsten, 2)
                .blastTemp(3000, GasTier.HIGH, VA[IV], 1000)
                .fluidTemp(5000)
                .build();
				
		Cinobite = new Material.Builder(19009, "cinobite")
                .ingot(3).fluid()
                .color(0x010101).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL)
                .components(Zeron100, 8, Titanium, 6, Naquadria, 4, Gadolinium, 3, Aluminium, 2, Tin, 1, Osmiridium, 1, Mercury, 1)
                .blastTemp(2500, GasTier.HIGHER, VA[ZPM], 2000)
				.fluidPipeProperties(5000, 2000, true, true, true, true)
                .fluidTemp(6000)
                .build();
				
		Inconel792 = new Material.Builder(19010, "inconel792")
                .ingot(3).fluid()
                .color(0x66E370).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Nickel, 2, Aluminium, 2, Niobium, 1, Nichrome, 1)
                .blastTemp(1500, GasTier.MED, VA[EV], 800)
                .fluidTemp(4000)
                .build();
		
		EglinSteel = new Material.Builder(19011, "eglin_steel")
                .ingot(3).fluid()
                .color(0x733910).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Invar, 5, Iron, 4, Kanthal, 1, Sulfur, 1, Silicon, 1, Carbon, 1)
                .blastTemp(1200, GasTier.MED, VA[EV], 800)
                .fluidTemp(4500)
                .build();
		
		Platinium = new Material.Builder(19012, "platinium")
                .ingot(3).fluid()
                .color(0xDDEECD).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Platinum, 3, Aluminium, 1)
                .blastTemp(1100, GasTier.MED, VA[EV], 600)
                .fluidTemp(3500)
                .build();
				
		Pikyonium = new Material.Builder(19013, "pikyonium")
                .ingot(3).fluid()
                .color(0x3160AE).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_SMALL_GEAR)
                .components(Inconel792, 8, EglinSteel, 5, EnrichedNaquadah, 4, TungstenSteel, 4, Cerium, 3, Antimony, 2, Platinium, 2, Ytterbium, 1)
                .blastTemp(2500, GasTier.HIGHER, VA[ZPM], 2000)
				.cableProperties(VA[UHV], 4, 16)
                .fluidTemp(6000)
                .build();
				
		HastelloyN = new Material.Builder(19014, "hastelloyn")
                .ingot(3).fluid()
                .color(0xB3B3B3).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Nickel, 15, Molybdenum, 4, Yttrium, 2, Chrome, 2, Titanium, 2)
                .blastTemp(1200, GasTier.MED, VA[EV], 600)
                .fluidTemp(3000)
                .build();
		
		Aluminum = new Material.Builder(19015, "aluminum")
                .ingot().fluid()
                .color(0x80C8F0).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Aluminium, 1)
                .build();
				
		Lafium = new Material.Builder(19016, "lafium")
                .ingot(3).fluid()
                .color(0x0D0D60).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR)
                .components(HastelloyN, 8, Nickel, 8, Aluminum, 6, Naquadah, 4, Tungsten, 4, Samarium, 2, Carbon, 2, Argon, 2)
				.cableProperties(VA[UEV], 4, 16)
				.fluidPipeProperties(8000, 3000, true, true, true, true)
                .blastTemp(1800, GasTier.MED, VA[IV], 900)
                .fluidTemp(3450)
                .build();
				
		EnrichedNaquadahAlloy = new Material.Builder(19017, "enriched_naquadah_alloy")
                .ingot(3).fluid()
                .color(0x3C3C3A).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(EnrichedNaquadah, 4, Rhodium, 2, Ruthenium, 2, Rubidium, 2, Dubnium, 1, Einsteinium, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[UV], 1800)
                .fluidTemp(8000)
                .build();
		
		BismuthTellurite = new Material.Builder(19018, "bismuth_tellurite")
                .dust(0)
                .color(0x00512A).iconSet(SHINY)
                .flags(GENERATE_DUST)
                .components(Bismuth, 2, Tellurium, 3)
                .build();
		
		Prasiolite = new Material.Builder(19019, "prasiolite")
                .dust(0)
                .color(0x768836).iconSet(SHINY)
                .flags(GENERATE_DUST)
                .components(Silicon, 5, Oxygen, 10, Iron, 1)
                .build();
				
		CubicZirconia = new Material.Builder(19020, "cubic_zirconia")
                .dust(0)
                .color(0xF1D3D6).iconSet(SHINY)
                .flags(GENERATE_DUST)
                .components(Zirconium, 1, Oxygen, 2)
                .build();
				
		MagnetoResonatic = new Material.Builder(19021, "magneto_resonatic")
                .ingot(3).fluid()
                .color(0xD37DD3).iconSet(MAGNETIC)
                .flags(STD_METAL)
                .components(BismuthTellurite, 4, Prasiolite, 3, CubicZirconia, 1, SamariumMagnetic, 1)
                .blastTemp(2000, GasTier.MED, VA[EV], 400)
                .fluidTemp(500)
                .build();
				
		HighDurabilityCompoundSteel = new Material.Builder(19022, "high_durability_compound_steel")
                .ingot(3).fluid()
                .color(0x304030).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING)
                .components(TungstenSteel, 12, HSSS, 9, HSSG, 6, Ruridit, 3, MagnetoResonatic, 2, Plutonium, 1)
                .blastTemp(5000, GasTier.HIGHER, VA[ZPM], 1200)
                .fluidTemp(6000)
                .build();
				
		MagnetoResonaticCinobitePikyoniumAluminum = new Material.Builder(19023, "magneto_resonatic_cinobite_pikyonium_aluminum")
                .ingot().fluid()
                .color(0x9B46BA).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(MagnetoResonatic, 3, Cinobite, 1, Pikyonium, 1, Aluminum, 1)
                .cableProperties(VA[UEV], 24, 0, true, 3)
                .blastTemp(11000, GasTier.HIGHER, VA[UHV], 2000)
                .fluidTemp(26000)
                .build();
				
		TastyNeutronium = new Material.Builder(19024, "tasty_neutronium")
                .ingot().fluid()
                .color(0x3E1446).iconSet(BRIGHT)
                .components(Neutronium, 1)
				.flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_ROTOR)
                .blastTemp(14000, GasTier.HIGHER, VA[UHV], 8000)
                .fluidTemp(50000)
                .build()
				.setFormula("Nt🦷", true);
    }
}
