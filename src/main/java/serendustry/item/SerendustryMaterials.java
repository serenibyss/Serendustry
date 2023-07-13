package serendustry.item;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.*;
import serendustry.Serendustry;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class SerendustryMaterials {

    public static Material animalWaste;
    public static Material InfusedGold;
    public static Material FluxedElectrum;
    public static Material Amogus;
    public static Material HastelloyX78;
    public static Material HastelloyK243;
    public static Material Technetium22;
    public static Material Zeron100;
    public static Material Cinobite;
    public static Material Inconel792;
    public static Material EglinSteel;
    public static Material Platinium;
    public static Material SiliconCarbide;
    public static Material Onionium;
    public static Material Pikyonium;
    public static Material HastelloyN;
    public static Material Aluminum;
    public static Material Lafium;
    public static Material EnrichedNaquadahAlloy;
    public static Material BismuthTellurite;
    public static Material Prasiolite;
    public static Material CubicZirconia;
    public static Material MagnetoResonatic;
    public static Material HighDurabilityCompoundSteel;
    public static Material ScUev;
    public static Material TastyNeutronium;
    public static Material Luminessence;
    public static Material Lumiium;
    public static Material Signalium;
    public static Material EnderiiumBase;
    public static Material Enderiiium;
    public static Material PulsatingIron;
    public static Material EnergeticAlloy;
    public static Material VibrantAlloy;
    public static Material StellarAlloy;
    public static Material ScUiv;
    public static Material CrystalMatrix;
    public static Material InfinityCatalyst;
    public static Material Infinity;
    public static Material Draconium;
    public static Material ChargedDraconium;
    public static Material AwakenedDraconium;
    public static Material Bedrockium;
    public static Material ScUxv;
    public static Material Jasper;
    public static Material ArceusAlloy2B;
    public static Material AssemblyLine;
    public static Material Quantum;
    public static Material Quantium;
    public static Material CallistoIce;
    public static Material Ledox;
    public static Material NaquadriaticTaranium;
    public static Material ScOpv;
    // EMPTY ID
    public static Material MutatedLivingSolder;
    public static Material Thaumium;
    public static Material GalliumYttrium;
    public static Material Magic2;
    public static Material RealCupronickel;
    public static Material Xenoxene;
    public static Material RawRadox;
    public static Material LightRadox;
    public static Material HeavyRadox;
    public static Material CrackedLightRadox;
    public static Material CrackedHeavyRadox;
    public static Material PurifiedRadox;
    public static Material RadoxPolymer;
    public static Material Floppa;
    public static Material KerrBlackHole;
    public static Material DestabilizedMatter;
    public static Material ExoticMatter;
    public static Material DarkMatter;
    public static Material RedMatter;
    public static Material AtomicResonanceCatalyst;
    public static Material ChromaticGlass;
    public static Material Shirabon;
    public static Material Teflon;
    public static Material EnrichedHolmium;
    public static Material EnrichedTeflon;
    public static Material OmniversalRedstone;
    public static Material OmniversalLubricant;
    public static Material PartialAlkalis;
    public static Material Alkalis;
    public static Material RefractoryMetals;
    public static Material LightTransitionMetals;
    public static Material PreciousMetals;
    public static Material PartialPostTransitionMetals;
    public static Material PostTransitionMetals;
    public static Material PartialLanthanoids;
    public static Material Lanthanoids;
    public static Material PartialActinoids;
    public static Material Actinoids;
    public static Material Gases;
    public static Material NonMetals;

    public static Material PartialNobleGases;
    public static Material NobleGases;
    public static Material PartialSuperheavies;
    public static Material Superheavies;
    public static Material Periodicium;
    public static Material MultiversalAlloy;
    public static Material TransCataCrude;
    public static Material TransCataExcited;
    public static Material TransCataResplendent;
    public static Material TransResidue;
    public static Material TengamRaw;
    public static Material TengamPurified;
    public static Material TengamAttuned;

    public static void registerMaterials() {

        // This should probably be a loop, but I never intended for it to get this big; it just kind of slowly grew over time, and now it's too late for me to want to change it
        Oxygen.setProperty(PropertyKey.DUST, new DustProperty());
        Hydrogen.setProperty(PropertyKey.DUST, new DustProperty());
        Nitrogen.setProperty(PropertyKey.DUST, new DustProperty());
        Water.setProperty(PropertyKey.DUST, new DustProperty());

        Rhenium.setProperty(PropertyKey.DUST, new DustProperty());
        Gadolinium.setProperty(PropertyKey.DUST, new DustProperty());
        Polonium.setProperty(PropertyKey.DUST, new DustProperty());
        Strontium.setProperty(PropertyKey.DUST, new DustProperty());
        Promethium.setProperty(PropertyKey.DUST, new DustProperty());
        Technetium.setProperty(PropertyKey.DUST, new DustProperty());
        Ytterbium.setProperty(PropertyKey.DUST, new DustProperty());
        Rubidium.setProperty(PropertyKey.DUST, new DustProperty());
        Tellurium.setProperty(PropertyKey.DUST, new DustProperty());
        Zirconium.setProperty(PropertyKey.DUST, new DustProperty());
        Germanium.setProperty(PropertyKey.DUST, new DustProperty());
        Scandium.setProperty(PropertyKey.DUST, new DustProperty());
        Protactinium.setProperty(PropertyKey.DUST, new DustProperty());
        Holmium.setProperty(PropertyKey.DUST, new DustProperty());
        Radium.setProperty(PropertyKey.DUST, new DustProperty());
        Francium.setProperty(PropertyKey.DUST, new DustProperty());
        Terbium.setProperty(PropertyKey.DUST, new DustProperty());
        Thulium.setProperty(PropertyKey.DUST, new DustProperty());
        Erbium.setProperty(PropertyKey.DUST, new DustProperty());
        Dysprosium.setProperty(PropertyKey.DUST, new DustProperty());
        Praseodymium.setProperty(PropertyKey.DUST, new DustProperty());
        Actinium.setProperty(PropertyKey.DUST, new DustProperty());
        Curium.setProperty(PropertyKey.DUST, new DustProperty());
        Berkelium.setProperty(PropertyKey.DUST, new DustProperty());
        Neptunium.setProperty(PropertyKey.DUST, new DustProperty());
        Californium.setProperty(PropertyKey.DUST, new DustProperty());
        Iodine.setProperty(PropertyKey.DUST, new DustProperty());
        Hafnium.setProperty(PropertyKey.DUST, new DustProperty());
        Thallium.setProperty(PropertyKey.DUST, new DustProperty());
        Selenium.setProperty(PropertyKey.DUST, new DustProperty());
        Astatine.setProperty(PropertyKey.DUST, new DustProperty());

        Einsteinium.setProperty(PropertyKey.DUST, new DustProperty());
        Fermium.setProperty(PropertyKey.DUST, new DustProperty());
        Mendelevium.setProperty(PropertyKey.DUST, new DustProperty());
        Nobelium.setProperty(PropertyKey.DUST, new DustProperty());
        Lawrencium.setProperty(PropertyKey.DUST, new DustProperty());
        Rutherfordium.setProperty(PropertyKey.DUST, new DustProperty());
        Dubnium.setProperty(PropertyKey.DUST, new DustProperty());
        Seaborgium.setProperty(PropertyKey.DUST, new DustProperty());
        Bohrium.setProperty(PropertyKey.DUST, new DustProperty());
        Hassium.setProperty(PropertyKey.DUST, new DustProperty());
        Meitnerium.setProperty(PropertyKey.DUST, new DustProperty());
        Roentgenium.setProperty(PropertyKey.DUST, new DustProperty());
        Copernicium.setProperty(PropertyKey.DUST, new DustProperty());
        Nihonium.setProperty(PropertyKey.DUST, new DustProperty());
        Flerovium.setProperty(PropertyKey.DUST, new DustProperty());
        Moscovium.setProperty(PropertyKey.DUST, new DustProperty());
        Livermorium.setProperty(PropertyKey.DUST, new DustProperty());
        Tennessine.setProperty(PropertyKey.DUST, new DustProperty());
        Oganesson.setProperty(PropertyKey.DUST, new DustProperty());

        Oxygen.setProperty(PropertyKey.INGOT, new IngotProperty());
        Nitrogen.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hydrogen.setProperty(PropertyKey.INGOT, new IngotProperty());
        Water.setProperty(PropertyKey.INGOT, new IngotProperty());

        Rhenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Gadolinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Polonium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Strontium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Promethium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Technetium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Ytterbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rubidium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Tellurium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Zirconium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Germanium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Scandium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Protactinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Holmium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Radium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Francium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Terbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Thulium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Erbium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dysprosium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Praseodymium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Actinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Curium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Berkelium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Neptunium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Californium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Iodine.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Thallium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Selenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Astatine.setProperty(PropertyKey.INGOT, new IngotProperty());

        Einsteinium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Fermium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Mendelevium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Nobelium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Lawrencium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Rutherfordium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Dubnium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Seaborgium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Bohrium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Hassium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Meitnerium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Roentgenium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Copernicium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Nihonium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Flerovium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Moscovium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Livermorium.setProperty(PropertyKey.INGOT, new IngotProperty());
        Tennessine.setProperty(PropertyKey.INGOT, new IngotProperty());
        Oganesson.setProperty(PropertyKey.INGOT, new IngotProperty());

        Lutetium.setProperty(PropertyKey.INGOT, new IngotProperty());

        Sodium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Bromine.setProperty(PropertyKey.FLUID, new FluidProperty());
        Flerovium.setProperty(PropertyKey.FLUID, new FluidProperty());
        Phosphorus.setProperty(PropertyKey.FLUID, new FluidProperty());
        Protactinium.setProperty(PropertyKey.FLUID, new FluidProperty());

        Water.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Flerovium.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Phosphorus.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Protactinium.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Redstone.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Glass.setProperty(PropertyKey.PLASMA, new PlasmaProperty());
        Lead.setProperty(PropertyKey.PLASMA, new PlasmaProperty());

        TinAlloy.addFlags(GENERATE_FINE_WIRE, GENERATE_FOIL);
        Oxygen.addFlags(GENERATE_FOIL);
        RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FINE_WIRE);
        Europium.addFlags(GENERATE_SPRING_SMALL);
        PolyvinylChloride.addFlags(GENERATE_LENS);

        animalWaste = new Material.Builder(1, Serendustry.ID("animal_waste"))
                .gem().fluid().color(0x7B5C00)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build();

        InfusedGold = new Material.Builder(2, Serendustry.ID("infused_gold"))
                .ingot().fluid()
                .color(0xA59030).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Gold, 4)
                .build()
                .setFormula("(Au4Ma)", true);

        FluxedElectrum = new Material.Builder(3, Serendustry.ID("fluxed_electrum"))
                .ingot(3).fluid()
                .color(0xFFE049).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW)
                .components(RoseGold, 1, SterlingSilver, 1, Electrum, 2, InfusedGold, 2, Naquadria, 4, SolderingAlloy, 10)
                .blastTemp(8000, GasTier.HIGHEST, VA[UV], 8000)
                .cableProperties(VA[UEV], 1, 1536, false, 3)
                .fluidTemp(8000)
                .build();

        Amogus = new Material.Builder(4, Serendustry.ID("amogus"))
                .ingot(3).fluid()
                .color(0x15703F).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(Americium, 1, Oganesson, 1, Uranium238, 1, Sulfur, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 5000)
                .fluidTemp(6000)
                .build();

        HastelloyX78 = new Material.Builder(5, Serendustry.ID("hastelloyx_78"))
                .ingot(3).fluid()
                .color(0x5F90C9).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(NaquadahAlloy, 10, Rhenium, 5, Naquadria, 4, Polonium, 3, Rutherfordium, 2, Fermium, 1)
                .blastTemp(8500, GasTier.HIGHEST, VA[UV], 10000)
                .fluidTemp(7500)
                .build();

        HastelloyK243 = new Material.Builder(6, Serendustry.ID("hastelloyk_243"))
                .ingot(3).fluid()
                .color(0x9FEC60).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(HastelloyX78, 5, Tritanium, 4, TungstenCarbide, 4, Promethium, 4, NiobiumNitride, 2, Mendelevium, 1)
                .blastTemp(9000, GasTier.HIGHEST, VA[UHV], 12000)
                .fluidTemp(8500)
                .toolStats(ToolProperty.Builder.of(160.0F, 110.0F, 65535, 7)
                        .attackSpeed(0.5F).enchantability(33).magnetic().build())
                .build();

        Technetium22 = new Material.Builder(7, Serendustry.ID("technetium_22"))
                .ingot(3).fluid()
                .color(0xC6AA14).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Technetium, 22)
                .blastTemp(9000, GasTier.HIGH, VA[ULV], 120000)
                .fluidTemp(10000)
                .build()
                .setFormula("Tc-22", false);

        Zeron100 = new Material.Builder(8, Serendustry.ID("zeron_100")) // GCYM duplicates this
                .ingot(3).fluid()
                .color(0xA8A813).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Steel, 20, Chrome, 13, Copper, 10, Nickel, 3, Molybdenum, 2, Tungsten, 2)
                .blastTemp(3000, GasTier.HIGH, VA[IV], 1000)
                .fluidTemp(5000)
                .build();

        Cinobite = new Material.Builder(9, Serendustry.ID("cinobite"))
                .ingot(3).fluid()
                .color(0x010101).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Zeron100, 8, Titanium, 6, Naquadria, 4, Gadolinium, 3, Osmiridium, 1, Mercury, 1)
                .blastTemp(2500, GasTier.HIGHEST, VA[UV], 2000)
                .fluidPipeProperties(30000, 3500, true, true, true, true)
                .fluidTemp(6000)
                .build();

        Inconel792 = new Material.Builder(10, Serendustry.ID("inconel_792"))
                .ingot(3).fluid()
                .color(0x66E370).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_BOLT_SCREW)
                .components(Nickel, 2, Aluminium, 2, Niobium, 1, Nichrome, 1)
                .blastTemp(1500, GasTier.MID, VA[EV], 800)
                .fluidTemp(4000)
                .build();

        EglinSteel = new Material.Builder(11, Serendustry.ID("eglin_steel"))
                .ingot(3).fluid()
                .color(0x733910).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Invar, 5, Iron, 4, Kanthal, 1, Sulfur, 1, Silicon, 1, Carbon, 1)
                .blastTemp(1200, GasTier.MID, VA[EV], 800)
                .fluidTemp(4500)
                .build();

        Platinium = new Material.Builder(12, Serendustry.ID("platinium"))
                .ingot(3).fluid()
                .color(0xDDEECD).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Platinum, 3, Aluminium, 1)
                .blastTemp(1100, GasTier.MID, VA[EV], 600)
                .fluidTemp(3500)
                .build();

        SiliconCarbide = new Material.Builder(13, Serendustry.ID("silicon_carbide"))
                .dust(0)
                .color(0x606060).iconSet(SHINY)
                .components(Silicon, 1, Carbon, 1)
                .build();

        Onionium = new Material.Builder(14, Serendustry.ID("onionium"))
                .ingot(3).fluid()
                .color(0xFE82A3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Antimony, 2, Platinium, 2, Ytterbium, 1, Nichrome, 1, SiliconCarbide, 1)
                .blastTemp(3500, GasTier.HIGHER, VA[ZPM], 2000)
                .fluidTemp(3000)
                .build();

        Pikyonium = new Material.Builder(15, Serendustry.ID("pikyonium"))
                .ingot(3).fluid()
                .color(0x3160AE).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_SMALL_GEAR)
                .components(Inconel792, 8, EglinSteel, 5, NaquadahEnriched, 4, TungstenSteel, 4, Cerium, 3, Onionium, 7)
                .blastTemp(9000, GasTier.HIGHEST, VA[UV], 2000)
                .cableProperties(V[UHV], 2, 512)
                .fluidTemp(6000)
                .build();

        HastelloyN = new Material.Builder(16, Serendustry.ID("hastelloyn"))
                .ingot(3).fluid()
                .color(0xB3B3B3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Nickel, 15, Molybdenum, 4, Yttrium, 2, Chrome, 2, Titanium, 2)
                .blastTemp(1200, GasTier.MID, VA[EV], 600)
                .fluidTemp(3000)
                .build();

        Aluminum = new Material.Builder(17, Serendustry.ID("aluminum"))
                .ingot().fluid()
                .color(0x80C8F0).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Aluminium, 1)
                .build();

        Lafium = new Material.Builder(18, Serendustry.ID("lafium"))
                .ingot(3).fluid()
                .color(0x0D0D60).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW)
                .components(HastelloyN, 8, Nickel, 8, Aluminum, 6, Naquadah, 4, Tungsten, 4, Samarium, 2, Carbon, 2, Argon, 2)
                .cableProperties(V[UEV], 2, 2048)
                .fluidPipeProperties(65000, 5000, true, true, true, true)
                .blastTemp(1800, GasTier.HIGHEST, VA[UHV], 900)
                .fluidTemp(3450)
                .build();

        EnrichedNaquadahAlloy = new Material.Builder(19, Serendustry.ID("enriched_naquadah_alloy"))
                .ingot(3).fluid()
                .color(0x3C3C3A).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(NaquadahEnriched, 4, Rhodium, 2, Ruthenium, 2, Rubidium, 2, Dubnium, 1, Einsteinium, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 1800)
                .fluidTemp(8000)
                .build();

        BismuthTellurite = new Material.Builder(20, Serendustry.ID("bismuth_tellurite"))
                .dust(0)
                .color(0x00512A).iconSet(SHINY)
                .components(Bismuth, 2, Tellurium, 3)
                .build();

        Prasiolite = new Material.Builder(21, Serendustry.ID("prasiolite"))
                .dust(0)
                .color(0x768836).iconSet(SHINY)
                .components(Silicon, 5, Oxygen, 10, Iron, 1)
                .build();

        CubicZirconia = new Material.Builder(22, Serendustry.ID("cubic_zirconia"))
                .dust(0)
                .color(0xF1D3D6).iconSet(SHINY)
                .components(Zirconium, 1, Oxygen, 2)
                .build();

        MagnetoResonatic = new Material.Builder(23, Serendustry.ID("magneto_resonatic"))
                .gem().fluid()
                .color(0xD37DD3).iconSet(MAGNETIC)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .components(BismuthTellurite, 4, Prasiolite, 3, CubicZirconia, 1, SamariumMagnetic, 1)
                .fluidTemp(500)
                .build();

        HighDurabilityCompoundSteel = new Material.Builder(24, Serendustry.ID("high_durability_compound_steel"))
                .ingot(3).fluid()
                .color(0x304030).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(TungstenSteel, 12, HSSS, 9, HSSG, 6, Ruridit, 3, MagnetoResonatic, 2, Plutonium239, 1)
                .blastTemp(5000, GasTier.HIGHEST, VA[ZPM], 1200)
                .fluidTemp(6000)
                .build();

        ScUev = new Material.Builder(25, Serendustry.ID("sc_uev"))
                .ingot().fluid()
                .color(0x9B46BA).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(MagnetoResonatic, 3, Cinobite, 1, Pikyonium, 1, Aluminum, 1)
                .cableProperties(V[UEV], 24, 0, true, 3)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 2000)
                .fluidTemp(26000)
                .build();

        TastyNeutronium = new Material.Builder(26, Serendustry.ID("tasty_neutronium"))
                .ingot().fluid()
                .color(0x3E1446).iconSet(BRIGHT)
                .components(Neutronium, 1)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_ROTOR)
                .blastTemp(14000, GasTier.HIGHEST, VA[UHV], 8000)
                .fluidTemp(50000)
                .build()
                .setFormula("Nt:tooth:", true);

        Luminessence = new Material.Builder(27, Serendustry.ID("luminessence"))
                .dust(0)
                .color(0xFFE568).iconSet(BRIGHT)
                .components(Aluminum, 1, Phosphate, 1)
                .build();

        Lumiium = new Material.Builder(28, Serendustry.ID("lumiium"))
                .ingot(3).fluid()
                .color(0xFFE100).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Luminessence, 2, TinAlloy, 1, RoseGold, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3000)
                .fluidTemp(30000)
                .build();

        Signalium = new Material.Builder(29, Serendustry.ID("signalium"))
                .ingot(3).fluid()
                .color(0xFF9300).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(Lumiium, 3, Aluminum, 2, FluxedElectrum, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3500)
                .fluidTemp(35000)
                .cableProperties(V[UIV], 2, 8192)
                .build();

        EnderiiumBase = new Material.Builder(30, Serendustry.ID("enderiium_base"))
                .ingot(3).fluid()
                .color(0x3B7A9F).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_ROTOR)
                .components(Signalium, 4, EnderPearl, 2, TastyNeutronium, 2, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3800)
                .fluidTemp(40000)
                .build();

        Enderiiium = new Material.Builder(31, Serendustry.ID("enderiiium"))
                .ingot(3).fluid()
                .color(0x408587).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_FRAME, GENERATE_BOLT_SCREW)
                .components(EnderiiumBase, 4, InfusedGold, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 4200)
                .fluidTemp(50000)
                .build();

        PulsatingIron = new Material.Builder(32, Serendustry.ID("pulsating_iron"))
                .ingot(3).fluid()
                .color(0x5ACE92).iconSet(BRIGHT)
                .flags(STD_METAL)
                .components(Iron, 1, EnderPearl, 1, Uraninite, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[IV], 2500)
                .fluidTemp(5000)
                .build();

        EnergeticAlloy = new Material.Builder(33, Serendustry.ID("energetic_alloy"))
                .ingot(3).fluid()
                .color(0xFF8752).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(PulsatingIron, 4, Zeolite, 1, GarnetSand, 1, HSSS, 1, Mercury, 1)
                .blastTemp(6500, GasTier.HIGHER, VA[LuV], 2800)
                .fluidTemp(5500)
                .build();

        VibrantAlloy = new Material.Builder(34, Serendustry.ID("vibrant_alloy"))
                .ingot(3).fluid()
                .color(0x75FF66).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR)
                .components(EnergeticAlloy, 5, Zeolite, 1, BasalticMineralSand, 1, GraniticMineralSand, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 3000)
                .fluidTemp(5850)
                .build();

        StellarAlloy = new Material.Builder(35, Serendustry.ID("stellar_alloy"))
                .ingot(3).fluid()
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_RING, GENERATE_ROUND, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .components(VibrantAlloy, 8, TastyNeutronium, 2, Aluminum, 2, AluminiumSulfite, 1)
                .fluidPipeProperties(80000, 7500, true, true, true, true)
                .blastTemp(8000, GasTier.HIGHEST, VA[UHV], 4000)
                .toolStats(ToolProperty.Builder.of(200.0F, 120.0F, 65535, 8)
                        .attackSpeed(0.5F).enchantability(33).magnetic().build())
                .fluidTemp(12000)
                .build();

        ScUiv = new Material.Builder(36, Serendustry.ID("sc_uiv"))
                .ingot(3).fluid()
                .color(0xFF66A3).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(VibrantAlloy, 3, Naquadria, 2, FluxedElectrum, 2, EnderiiumBase, 2)
                .cableProperties(V[UIV], 24, 0, true)
                .blastTemp(8500, GasTier.HIGHEST, VA[UHV], 6000)
                .fluidTemp(50000)
                .build();

        CrystalMatrix = new Material.Builder(37, Serendustry.ID("crystal_matrix"))
                .ingot(3).fluid()
                .color(0x8EFFE6).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL)
                .components(Diamond, 1, NetherStar, 1)
                .blastTemp(8800, GasTier.HIGHEST, VA[UHV], 8000)
                .fluidTemp(45000)
                .build();

        InfinityCatalyst = new Material.Builder(38, Serendustry.ID("infinity_catalyst"))
                .ingot(3).fluid()
                .color(0xFFFFFF).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROTOR, GENERATE_FRAME)
                .components(CrystalMatrix, 8, Neutronium, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 8000)
                .fluidTemp(75000)
                .build()
                .setFormula("If");

        Infinity = new Material.Builder(39, Serendustry.ID("infinity"))
                .ingot(3).fluid().plasma()
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(InfinityCatalyst, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 12000)
                .fluidTemp(500000)
                .build()
                .setFormula("If*", true);

        Draconium = new Material.Builder(40, Serendustry.ID("draconium"))
                .ingot(3).fluid()
                .color(0x8E52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_SMALL_GEAR)
                .components(TinAlloy, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 7000)
                .fluidTemp(30000)
                .build()
                .setFormula("Dc", true);

        ChargedDraconium = new Material.Builder(41, Serendustry.ID("charged_draconium"))
                .ingot(3).fluid()
                .color(0xCD52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_FOIL)
                .components(Draconium, 1)
                .fluidPipeProperties(95000, 9000, true, true, true, true)
                .blastTemp(8850, GasTier.HIGHEST, VA[UEV], 7500)
                .fluidTemp(35000)
                .build()
                .setFormula("Dc+", true);

        AwakenedDraconium = new Material.Builder(42, Serendustry.ID("awakened_draconium"))
                .ingot(3).fluid()
                .color(0xDD520C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_DENSE)
                .components(Draconium, 1)
                .blastTemp(8950, GasTier.HIGHEST, VA[UIV], 8500)
                .fluidTemp(65000)
                .toolStats(ToolProperty.Builder.of(240.0F, 160.0F, 65535, 9)
                        .attackSpeed(0.5F).enchantability(33).magnetic().build())
                .build()
                .setFormula("Dc*", true);

        Bedrockium = new Material.Builder(43, Serendustry.ID("bedrockium"))
                .ingot(3).fluid()
                .color(0x262626).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(SiliconDioxide, 384)
                .cableProperties(V[UXV], 2, 32768)
                .blastTemp(9000, GasTier.HIGHEST, VA[UIV], 6000)
                .fluidTemp(45000)
                .build();

        ScUxv = new Material.Builder(44, Serendustry.ID("sc_uxv"))
                .ingot(3).fluid()
                .color(0xFF4F4F).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(ChargedDraconium, 4, StellarAlloy, 4, Luminessence, 3, InfinityCatalyst, 2)
                .cableProperties(V[UXV], 24, 0, true)
                .blastTemp(10000, GasTier.HIGHEST, VA[UIV], 7000)
                .fluidTemp(48000)
                .build();

        Jasper = new Material.Builder(45, Serendustry.ID("jasper"))
                .dust(0).fluid()
                .color(0xFF1484).iconSet(SHINY)
                .components(SiliconDioxide, 1)
                .build()
                .setFormula("?");

        ArceusAlloy2B = new Material.Builder(46, Serendustry.ID("arceus_alloy_2_b"))
                .ingot(3).fluid()
                .color(0xC4A415).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Trinium, 3, HSSS, 4, TungstenCarbide, 2, Osmiridium, 1, Strontium, 1)
                .blastTemp(10200, GasTier.HIGHER, VA[LuV], 7000)
                .fluidTemp(41000)
                .build();

        AssemblyLine = new Material.Builder(47, Serendustry.ID("assembly_line"))
                .fluid().plasma()
                .color(0x6C6D7A).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .fluidTemp(32768)
                .build()
                .setFormula("Assembly Line");

        Quantum = new Material.Builder(48, Serendustry.ID("quantum"))
                .ingot(3).fluid()
                .color(0x353535).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_FRAME)
                .components(StellarAlloy, 15, ArceusAlloy2B, 10, Lafium, 10, Jasper, 5, Americium, 5, Pikyonium, 5, Germanium, 5, SiliconCarbide, 5, AssemblyLine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .toolStats(ToolProperty.Builder.of(220.0F, 125.0F, 65535, 9)
                        .attackSpeed(0.5F).enchantability(33).magnetic().build())
                .fluidTemp(48000)
                .build();

        Quantium = new Material.Builder(49, Serendustry.ID("quantium"))
                .ingot(3).fluid()
                .color(0x00D100).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
                .components(Quantum, 1)
                .itemPipeProperties(16, 256)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 9500)
                .cableProperties(V[OpV], 2, 131072)
                .fluidTemp(70000)
                .build()
                .setFormula("Qt");

        CallistoIce = new Material.Builder(50, Serendustry.ID("callisto_ice"))
                .ingot(3).fluid()
                .color(0x00D1FF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROUND, GENERATE_RING, GENERATE_BOLT_SCREW)
                .components(Water, 1)
                .fluidTemp(1)
                .fluidPipeProperties(800000, 15000, true, true, true, true)
                .blastTemp(273, GasTier.HIGHEST, VA[UXV], 2000)
                .build()
                .setFormula("(SpH2O)", true);

        Ledox = new Material.Builder(51, Serendustry.ID("ledox"))
                .ingot(3).fluid()
                .color(0x1B2FE2).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
                .components(Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 7000)
                .fluidTemp(50000)
                .build()
                .setFormula("(SpPb)", true);

        NaquadriaticTaranium = new Material.Builder(52, Serendustry.ID("naquadriatic_taranium"))
                .ingot(3).fluid()
                .color(0x000000).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Naquadria, 4, CoalTar, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .fluidTemp(55000)
                .build();

        ScOpv = new Material.Builder(53, Serendustry.ID("sc_opv"))
                .ingot(3).fluid()
                .color(0x597C8C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(Quantum, 5, AwakenedDraconium, 3, Ledox, 3, Enderiiium, 3, Infinity, 3, NaquadriaticTaranium, 3, Amogus, 2)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 11000)
                .cableProperties(V[OpV], 24, 0, true)
                .fluidTemp(90000)
                .build();

        MutatedLivingSolder = new Material.Builder(54, Serendustry.ID("mutated_living_solder"))
                .ingot(3).fluid()
                .color(0x785B7E).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 5000)
                .fluidTemp(25000)
                .build()
                .setFormula("?");

        Thaumium = new Material.Builder(55, Serendustry.ID("thaumium"))
                .ingot(3).fluid()
                .color(0x802BA8).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[UV], 5000)
                .fluidTemp(25000)
                .build()
                .setFormula("DsMa");

        GalliumYttrium = new Material.Builder(56, Serendustry.ID("gallium_yttrium"))
                .ingot(3).fluid()
                .color(0x6D0054).iconSet(DULL)
                .flags(STD_METAL, GENERATE_RING)
                .components(Gallium, 1, Yttrium, 1)
                .blastTemp(3000, GasTier.MID, VA[HV], 1000)
                .fluidTemp(12000)
                .build();

        Magic2 = new Material.Builder(57, Serendustry.ID("magic_2"))
                .fluid()
                .color(0x6D0054).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .fluidTemp(0)
                .build()
                .setFormula("Ma");

        RealCupronickel = new Material.Builder(58, Serendustry.ID("real_cupronickel"))
                .ingot(3).fluid()
                .color(0xDCDCFF).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Copper, 40, Nickel, 22, Iron, 1, Manganese, 1)
                .fluidTemp(1100)
                .build()
                .setFormula("(Cu40Ni22Fe1Mn1)", true);

        Xenoxene = new Material.Builder(59, Serendustry.ID("xenoxene"))
                .fluid()
                .color(0x828282)
                .build();

        RawRadox = new Material.Builder(60, Serendustry.ID("raw_radox"))
                .fluid()
                .color(0x8914AD)
                .build();

        LightRadox = new Material.Builder(61, Serendustry.ID("light_radox"))
                .fluid()
                .color(0xA42CE0)
                .build();

        HeavyRadox = new Material.Builder(62, Serendustry.ID("heavy_radox"))
                .fluid()
                .color(0x631B87)
                .build();

        CrackedLightRadox = new Material.Builder(63, Serendustry.ID("cracked_light_radox"))
                .fluid()
                .color(0xA464C4)
                .build();

        CrackedHeavyRadox = new Material.Builder(64, Serendustry.ID("cracked_heavy_radox"))
                .fluid()
                .color(0x663F7A)
                .build();

        PurifiedRadox = new Material.Builder(65, Serendustry.ID("purified_radox"))
                .fluid()
                .color(0xBB71E0)
                .build();

        RadoxPolymer = new Material.Builder(66, Serendustry.ID("radox_polymer"))
                .polymer(3)
                .color(0xBB2BE0)
                .flags(GENERATE_FOIL, GENERATE_RING, GENERATE_DENSE)
                .fluidPipeProperties(8000, 5000, true, true, true, false)
                .build();

        Floppa = new Material.Builder(67, Serendustry.ID("floppa"))
                .ingot(3).fluid()
                .color(0x9E5625).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_DENSE, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_FOIL)
                .components(Flerovium, 1, Oxygen, 1, Phosphorus, 1, Protactinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 50000)
                .fluidTemp(800000)
                .cableProperties(V[MAX], 24, 0, true)
                .build();

        KerrBlackHole = new Material.Builder(68, Serendustry.ID("kerr_black_hole"))
                .ingot(3).fluid()
                .color(0x000000).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[UIV], 10000)
                .fluidTemp(0)
                .build();

        DestabilizedMatter = new Material.Builder(69, Serendustry.ID("destabilized_matter"))
                .fluid().plasma()
                .color(0x5E609B)
                .build();

        ExoticMatter = new Material.Builder(70,Serendustry.ID( "exotic_matter"))
                .fluid().plasma()
                .color(0x5E2B9B)
                .build();

        DarkMatter = new Material.Builder(71, Serendustry.ID("dark_matter"))
                .fluid().plasma()
                .color(0x180B28)
                .build();

        RedMatter = new Material.Builder(72, Serendustry.ID("red_matter"))
                .fluid().plasma()
                .color(0xFF0000)
                .build();

        AtomicResonanceCatalyst = new Material.Builder(73, Serendustry.ID("atomic_resonance_catalyst"))
                .dust().fluid()
                .color(0xEC4E42)
                .build();

        ChromaticGlass = new Material.Builder(74, Serendustry.ID("chromatic_glass"))
                .ingot(3).fluid()
                .color(0xFFFFFF).iconSet(GLASS) // TODO: Give it animated rainbow colors
                .flags(STD_METAL, GENERATE_FOIL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 6000)
                .fluidTemp(35000)
                .build();

        Shirabon = new Material.Builder(75, Serendustry.ID("shirabon"))
                .ingot(3).fluid().plasma()
                .color(0xE0156D).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FRAME, GENERATE_FOIL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 30000)
                .fluidPipeProperties(3200000, 40000, true, true, true, true)
                .fluidTemp(600000)
                .build()
                .setFormula("Sh");

        Teflon = new Material.Builder(76, Serendustry.ID("teflon"))
                .polymer(3)
                .color(0x222222)
                .flags(DISABLE_DECOMPOSITION, GENERATE_DENSE, GENERATE_RING, GENERATE_FOIL)
                .components(Polytetrafluoroethylene, 15, Polyethylene, 3, Carbon, 1, Sodium, 1)
                .build();

        EnrichedHolmium = new Material.Builder(77, Serendustry.ID("enriched_holmium"))
                .ingot(3).fluid()
                .color(0x5D15EE).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL)
                .components(NaquadahEnriched, 8, Holmium, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[LuV], 2000)
                .fluidTemp(4200)
                .build();

        EnrichedTeflon = new Material.Builder(78, Serendustry.ID("enriched_teflon"))
                .polymer(3)
                .color(0xE34500)
                .flags(DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_RING)
                .components(NaquadahEnriched, 1, Teflon, 1, EnrichedHolmium, 1, EnrichedNaquadahAlloy, 1, EglinSteel, 1, Zeron100, 1, HastelloyN, 1, MagnetoResonatic, 1, TungstenSteel, 1)
                .build();

        OmniversalRedstone = new Material.Builder(79,Serendustry.ID( "omniversal_redstone"))
                .dust().fluid()
                .color(0xD13830)
                .build();

        OmniversalLubricant = new Material.Builder(80,Serendustry.ID( "omniversal_lubricant"))
                .fluid().plasma()
                .color(0x97D344)
                .build();

        PartialAlkalis = new Material.Builder(81, Serendustry.ID("partial_alkalis"))
                .ingot(3).fluid()
                .color(0x643ECD).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Lithium, 1, Sodium, 1, Potassium, 1, Rubidium, 1, Caesium, 1, Francium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Alkalis = new Material.Builder(82, Serendustry.ID("alkalis"))
                .ingot(3).fluid()
                .color(0x75CE6D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialAlkalis, 1, Beryllium, 1, Magnesium, 1, Calcium, 1, Strontium, 1, Barium, 1, Radium, 1, Scandium, 1, Yttrium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        RefractoryMetals = new Material.Builder(83, Serendustry.ID("refractory_metals"))
                .ingot(3).fluid()
                .color(0x4141CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Zirconium, 1, Hafnium, 1, Niobium, 1, Tantalum, 1, Molybdenum, 1, Tungsten, 1, Technetium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        LightTransitionMetals = new Material.Builder(84, Serendustry.ID("light_transition_metals"))
                .ingot(3).fluid()
                .color(0xCC9A3D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Titanium, 1, Vanadium, 1, Manganese, 1, Chrome, 1, Iron, 1, Nickel, 1, Cobalt, 1, Copper, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PreciousMetals = new Material.Builder(85, Serendustry.ID("precious_metals"))
                .ingot(3).fluid()
                .color(0xCAC9CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, Rhodium, 1, Palladium, 1, Silver, 1, Rhenium, 1, Osmium, 1, Iridium, 1, Platinum, 1, Gold, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PartialPostTransitionMetals = new Material.Builder(86, Serendustry.ID("partial_post_transition_metals"))
                .ingot(3).fluid()
                .color(0xBB6E1A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Mercury, 1, Tin, 1, Gallium, 1, Indium, 1, Bismuth, 1, Polonium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PostTransitionMetals = new Material.Builder(87, Serendustry.ID("post_transition_metals"))
                .ingot(3).fluid()
                .color(0xCC8F9F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialPostTransitionMetals, 1, Zinc, 1, Cadmium, 1, Aluminum, 1, Silicon, 1, Germanium, 1, Antimony, 1, Thallium, 1, Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PartialLanthanoids = new Material.Builder(88, Serendustry.ID("partial_lanthanoids"))
                .ingot(3).fluid()
                .color(0x2A82E4).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Dysprosium, 1, Lanthanum, 1, Cerium, 1, Praseodymium, 1, Neodymium, 1, Europium, 1, Ytterbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Lanthanoids = new Material.Builder(89, Serendustry.ID("lanthanoids"))
                .ingot(3).fluid()
                .color(0x5DCCA3).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialLanthanoids, 1, Samarium, 1, Gadolinium, 1, Terbium, 1, Thulium, 1, Holmium, 1, Lutetium, 1, Promethium, 1, Erbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PartialActinoids = new Material.Builder(90, Serendustry.ID("partial_actinoids"))
                .ingot(3).fluid()
                .color(0x02B3F2).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Californium, 1, Neptunium, 1, Plutonium241, 1, Mendelevium, 1, Einsteinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Actinoids = new Material.Builder(91, Serendustry.ID("actinoids"))
                .ingot(3).fluid()
                .color(0xC9CC7A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialActinoids, 1, Actinium, 1, Thorium, 1, Protactinium, 1, Uranium235, 1, Americium, 1, Curium, 1, Berkelium, 1, Fermium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Gases = new Material.Builder(92, Serendustry.ID("gases"))
                .ingot(3).fluid()
                .color(0x25CBA8).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Oxygen, 1, Nitrogen, 1, Hydrogen, 1, Fluorine, 1, Chlorine, 1, Bromine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        NonMetals = new Material.Builder(93, Serendustry.ID("non_metals"))
                .ingot(3).fluid()
                .color(0xCC2AB9).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 1, Phosphorus, 1, Sulfur, 1, Arsenic, 1, Selenium, 1, Tellurium, 1, Iodine, 1, Astatine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PartialNobleGases = new Material.Builder(94, Serendustry.ID("partial_noble_gases"))
                .ingot(3).fluid()
                .color(0xBB420F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Helium, 1, Neon, 1, Argon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        NobleGases = new Material.Builder(95, Serendustry.ID("noble_gases"))
                .ingot(3).fluid()
                .color(0x70CC2E).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialNobleGases, 1, Krypton, 1, Xenon, 1, Radon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        PartialSuperheavies = new Material.Builder(96, Serendustry.ID("partial_superheavies"))
                .ingot(3).fluid()
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Nobelium, 1, Lawrencium, 1, Rutherfordium, 1, Dubnium, 1, Seaborgium, 1, Bohrium, 1, Hassium, 1, Meitnerium, 1, Darmstadtium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Superheavies = new Material.Builder(97, Serendustry.ID("superheavies"))
                .ingot(3).fluid()
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialSuperheavies, 1, Roentgenium, 1, Copernicium, 1, Nihonium, 1, Flerovium, 1, Moscovium, 1, Livermorium, 1, Tennessine, 1, Oganesson, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        Periodicium = new Material.Builder(98, Serendustry.ID("periodicium"))
                .ingot(3).fluid().plasma()
                .color(0x1111FF).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Alkalis, 1, RefractoryMetals, 1, LightTransitionMetals, 1, PreciousMetals, 1, PostTransitionMetals, 1, Lanthanoids, 1, Actinoids, 1, Superheavies, 1, Gases, 1, NonMetals, 1, NobleGases, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .fluidTemp(6000)
                .build();

        MultiversalAlloy = new Material.Builder(99, Serendustry.ID("multiversal_alloy"))
                .ingot(3).fluid()
                .color(0xE04A2C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME)
                .components(Infinity, 5, Shirabon, 3, ScOpv, 2, StellarAlloy, 2, ScUxv, 1, Quantum, 1, Actinoids, 1, Lanthanoids, 1, Periodicium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 16000)
                .fluidTemp(130000)
                .build();

        TransCataCrude = new Material.Builder(100, Serendustry.ID("trans_cata_crude"))
                .fluid()
                .color(0x631B45)
                .fluidTemp(800000)
                .build();

        TransCataExcited = new Material.Builder(101, Serendustry.ID("trans_cata_excited"))
                .fluid()
                .color(0xD88842)
                .fluidTemp(2400000)
                .build();

        TransCataResplendent = new Material.Builder(102, Serendustry.ID("trans_cata_resplendent"))
                .fluid()
                .color(0x4CFF71)
                .fluidTemp(3200000)
                .build();

        TransResidue = new Material.Builder(103, Serendustry.ID("trans_residue"))
                .fluid()
                .color(0x4944AF)
                .fluidTemp(2800000)
                .build();

        TengamRaw = new Material.Builder(104, Serendustry.ID("tengam_raw"))
                .dust(3).ore()
                .color(0xA0BF60).iconSet(METALLIC)
                .fluidTemp(5000)
                .build()
                .setFormula("M");

        OreProperty oreProp = TengamRaw.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(IronMagnetic, SteelMagnetic, NeodymiumMagnetic, SamariumMagnetic);
        oreProp.setWashedIn(Steel);
        oreProp.setDirectSmeltResult(NeodymiumMagnetic);

        TengamPurified = new Material.Builder(105, Serendustry.ID("tengam_purified"))
                .ingot(3).fluid()
                .color(0xD5FF80).iconSet(SHINY)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 5000)
                .fluidTemp(5000)
                .build()
                .setFormula("M");

        TengamAttuned = new Material.Builder(106, Serendustry.ID("tengam_attuned"))
                .ingot(3)
                .color(0xD5FF80).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(TengamPurified, 1)
                .ingotSmeltInto(TengamPurified)
                .arcSmeltInto(TengamPurified)
                .macerateInto(TengamPurified)
                .build();
        TengamPurified.getProperty(PropertyKey.INGOT).setMagneticMaterial(TengamAttuned);
    }
}
