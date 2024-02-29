package serendustry.item.material

import gregtech.api.GTValues.*
import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.store.FluidStorageKeys
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.material.info.MaterialFlags.*
import gregtech.api.unification.material.info.MaterialIconSet.*
import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import serendustry.Serendustry


lateinit var AnimalWaste: Material
lateinit var InfusedGold: Material
lateinit var FluxedElectrum: Material
lateinit var Amogus: Material
lateinit var HastelloyX78: Material
lateinit var HastelloyK243: Material
lateinit var Technetium22: Material
lateinit var Zeron100: Material
lateinit var Cinobite: Material
lateinit var Inconel792: Material
lateinit var EglinSteel: Material
lateinit var Platinium: Material
lateinit var SiliconCarbide: Material
lateinit var Onionium: Material
lateinit var Pikyonium: Material
lateinit var HastelloyN: Material
lateinit var Aluminum: Material
lateinit var Lafium: Material
lateinit var EnrichedNaquadahAlloy: Material
lateinit var BismuthTellurite: Material
lateinit var Prasiolite: Material
lateinit var CubicZirconia: Material
lateinit var MagnetoResonatic: Material
lateinit var HighDurabilityCompoundSteel: Material
lateinit var ScUev: Material
lateinit var TastyNeutronium: Material
lateinit var Luminessence: Material
lateinit var Lumiium: Material
lateinit var Signalium: Material
lateinit var EnderiiumBase: Material
lateinit var Enderiiium: Material
lateinit var PulsatingIron: Material
lateinit var EnergeticAlloy: Material
lateinit var VibrantAlloy: Material
lateinit var StellarAlloy: Material
lateinit var ScUiv: Material
lateinit var CrystalMatrix: Material
lateinit var InfinityCatalyst: Material
lateinit var Infinity: Material
lateinit var Draconium: Material
lateinit var ChargedDraconium: Material
lateinit var AwakenedDraconium: Material
lateinit var Bedrockium: Material
lateinit var ScUxv: Material
lateinit var Jasper: Material
lateinit var ArceusAlloy2B: Material
lateinit var AssemblyLine: Material
lateinit var Quantum: Material
lateinit var Quantium: Material
lateinit var CallistoIce: Material
lateinit var Ledox: Material
lateinit var NaquadriaticTaranium: Material
lateinit var ScOpv: Material

// EMPTY ID
lateinit var MutatedLivingSolder: Material
lateinit var Thaumium: Material
lateinit var GalliumYttrium: Material
lateinit var Magic2: Material
lateinit var RealCupronickel: Material
lateinit var Xenoxene: Material
lateinit var RawRadox: Material
lateinit var LightRadox: Material
lateinit var HeavyRadox: Material
lateinit var CrackedLightRadox: Material
lateinit var CrackedHeavyRadox: Material
lateinit var PurifiedRadox: Material
lateinit var RadoxPolymer: Material
lateinit var Floppa: Material
lateinit var KerrBlackHole: Material
lateinit var DestabilizedMatter: Material
lateinit var ExoticMatter: Material
lateinit var DarkMatter: Material
lateinit var RedMatter: Material
lateinit var AtomicResonanceCatalyst: Material
lateinit var ChromaticGlass: Material
lateinit var Shirabon: Material
lateinit var Teflon: Material
lateinit var EnrichedHolmium: Material
lateinit var EnrichedTeflon: Material
lateinit var OmniversalRedstone: Material
lateinit var OmniversalLubricant: Material
lateinit var PartialAlkalis: Material
lateinit var Alkalis: Material
lateinit var RefractoryMetals: Material
lateinit var LightTransitionMetals: Material
lateinit var PreciousMetals: Material
lateinit var PartialPostTransitionMetals: Material
lateinit var PostTransitionMetals: Material
lateinit var PartialLanthanoids: Material
lateinit var Lanthanoids: Material
lateinit var PartialActinoids: Material
lateinit var Actinoids: Material
lateinit var Gases: Material
lateinit var NonMetals: Material

lateinit var PartialNobleGases: Material
lateinit var NobleGases: Material
lateinit var PartialSuperheavies: Material
lateinit var Superheavies: Material
lateinit var Periodicium: Material
lateinit var MultiversalAlloy: Material
lateinit var TransCataCrude: Material
lateinit var TransCataExcited: Material
lateinit var TransCataResplendent: Material
lateinit var TransResidue: Material
lateinit var TengamRaw: Material
lateinit var TengamPurified: Material
lateinit var TengamAttuned: Material

// lanthanides stuff
lateinit var DissolutionWater: Material
lateinit var MonaziteSludge: Material
lateinit var MonaziteSulfate: Material
lateinit var InsolubleMonaziteSludge: Material
lateinit var SodiumOxalate: Material
lateinit var AmmoniumHydroxide: Material
lateinit var OxalicAcid: Material
lateinit var OxylatedMonazite: Material
lateinit var AlkalineOxalateMixture: Material
lateinit var UraniumSulfate: Material
lateinit var PhosphateFiltrate: Material
lateinit var ThoriumHydroxide: Material
lateinit var LanthanumHydroxide: Material
lateinit var CeriumHydroxide: Material // todo cerium is special

lateinit var PraseodymiumHydroxide: Material
lateinit var NeodymiumHydroxide: Material
lateinit var PromethiumHydroxide: Material
lateinit var SamariumHydroxide: Material
lateinit var EuropiumHydroxide: Material
lateinit var GadoliniumHydroxide: Material
lateinit var TerbiumHydroxide: Material
lateinit var DysprosiumHydroxide: Material
lateinit var HolmiumHydroxide: Material
lateinit var ErbiumHydroxide: Material
lateinit var ThuliumHydroxide: Material
lateinit var YtterbiumHydroxide: Material
lateinit var LutetiumHydroxide: Material
lateinit var ScandiumHydroxide: Material
lateinit var YttriumHydroxide: Material

// animal waste stuff
lateinit var DriedEarth: Material
lateinit var ManureByproduct: Material
lateinit var ManureSlurry: Material
lateinit var FertileManureSlurry: Material
lateinit var Blood: Material
lateinit var OrganicFertilizer: Material
lateinit var Peat: Material
lateinit var SulfuricApatiteMix: Material
lateinit var ISSulfuricAcid: Material
lateinit var ISHydrochloricAcid: Material
lateinit var ISHydrofluoricAcid: Material

lateinit var ErrorSerenibyss: Material
lateinit var ErrorEnvoidia: Material

lateinit var PrimedAir: Material
lateinit var ArgonPrime: Material
lateinit var HeliumPrime: Material
lateinit var HydrogenPrime: Material
lateinit var KryptonPrime: Material
lateinit var NeonPrime: Material
lateinit var NitrogenPrime: Material
lateinit var OxygenPrime: Material

lateinit var Rhopalthenit: Material
lateinit var Cheese: Material
lateinit var WroughtNeutronium: Material
lateinit var AmmoniumNitrate: Material
lateinit var SulfurousAcid: Material

class SerendustryMaterials {
    companion object {
        fun registerMaterials() {

            // This should probably be a loop, but I never intended for it to get this big; it just kind of slowly grew over time, and now it's too late for me to want to change it
            Oxygen.setProperty(PropertyKey.DUST, DustProperty())
            Hydrogen.setProperty(PropertyKey.DUST, DustProperty())
            Nitrogen.setProperty(PropertyKey.DUST, DustProperty())
            Water.setProperty(PropertyKey.DUST, DustProperty())

            Rhenium.setProperty(PropertyKey.DUST, DustProperty())
            Gadolinium.setProperty(PropertyKey.DUST, DustProperty())
            Polonium.setProperty(PropertyKey.DUST, DustProperty())
            Strontium.setProperty(PropertyKey.DUST, DustProperty())
            Promethium.setProperty(PropertyKey.DUST, DustProperty())
            Technetium.setProperty(PropertyKey.DUST, DustProperty())
            Ytterbium.setProperty(PropertyKey.DUST, DustProperty())
            Rubidium.setProperty(PropertyKey.DUST, DustProperty())
            Tellurium.setProperty(PropertyKey.DUST, DustProperty())
            Zirconium.setProperty(PropertyKey.DUST, DustProperty())
            Germanium.setProperty(PropertyKey.DUST, DustProperty())
            Scandium.setProperty(PropertyKey.DUST, DustProperty())
            Protactinium.setProperty(PropertyKey.DUST, DustProperty())
            Holmium.setProperty(PropertyKey.DUST, DustProperty())
            Radium.setProperty(PropertyKey.DUST, DustProperty())
            Francium.setProperty(PropertyKey.DUST, DustProperty())
            Terbium.setProperty(PropertyKey.DUST, DustProperty())
            Thulium.setProperty(PropertyKey.DUST, DustProperty())
            Erbium.setProperty(PropertyKey.DUST, DustProperty())
            Dysprosium.setProperty(PropertyKey.DUST, DustProperty())
            Praseodymium.setProperty(PropertyKey.DUST, DustProperty())
            Actinium.setProperty(PropertyKey.DUST, DustProperty())
            Curium.setProperty(PropertyKey.DUST, DustProperty())
            Berkelium.setProperty(PropertyKey.DUST, DustProperty())
            Neptunium.setProperty(PropertyKey.DUST, DustProperty())
            Californium.setProperty(PropertyKey.DUST, DustProperty())
            Iodine.setProperty(PropertyKey.DUST, DustProperty())
            Hafnium.setProperty(PropertyKey.DUST, DustProperty())
            Thallium.setProperty(PropertyKey.DUST, DustProperty())
            Selenium.setProperty(PropertyKey.DUST, DustProperty())
            Astatine.setProperty(PropertyKey.DUST, DustProperty())

            Einsteinium.setProperty(PropertyKey.DUST, DustProperty())
            Fermium.setProperty(PropertyKey.DUST, DustProperty())
            Mendelevium.setProperty(PropertyKey.DUST, DustProperty())
            Nobelium.setProperty(PropertyKey.DUST, DustProperty())
            Lawrencium.setProperty(PropertyKey.DUST, DustProperty())
            Rutherfordium.setProperty(PropertyKey.DUST, DustProperty())
            Dubnium.setProperty(PropertyKey.DUST, DustProperty())
            Seaborgium.setProperty(PropertyKey.DUST, DustProperty())
            Bohrium.setProperty(PropertyKey.DUST, DustProperty())
            Hassium.setProperty(PropertyKey.DUST, DustProperty())
            Meitnerium.setProperty(PropertyKey.DUST, DustProperty())
            Roentgenium.setProperty(PropertyKey.DUST, DustProperty())
            Copernicium.setProperty(PropertyKey.DUST, DustProperty())
            Nihonium.setProperty(PropertyKey.DUST, DustProperty())
            Flerovium.setProperty(PropertyKey.DUST, DustProperty())
            Moscovium.setProperty(PropertyKey.DUST, DustProperty())
            Livermorium.setProperty(PropertyKey.DUST, DustProperty())
            Tennessine.setProperty(PropertyKey.DUST, DustProperty())
            Oganesson.setProperty(PropertyKey.DUST, DustProperty())

            Oxygen.setProperty(PropertyKey.INGOT, IngotProperty())
            Nitrogen.setProperty(PropertyKey.INGOT, IngotProperty())
            Hydrogen.setProperty(PropertyKey.INGOT, IngotProperty())
            Water.setProperty(PropertyKey.INGOT, IngotProperty())

            Rhenium.setProperty(PropertyKey.INGOT, IngotProperty())
            Gadolinium.setProperty(PropertyKey.INGOT, IngotProperty())
            Polonium.setProperty(PropertyKey.INGOT, IngotProperty())
            Strontium.setProperty(PropertyKey.INGOT, IngotProperty())
            Promethium.setProperty(PropertyKey.INGOT, IngotProperty())
            Technetium.setProperty(PropertyKey.INGOT, IngotProperty())
            Ytterbium.setProperty(PropertyKey.INGOT, IngotProperty())
            Rubidium.setProperty(PropertyKey.INGOT, IngotProperty())
            Tellurium.setProperty(PropertyKey.INGOT, IngotProperty())
            Zirconium.setProperty(PropertyKey.INGOT, IngotProperty())
            Germanium.setProperty(PropertyKey.INGOT, IngotProperty())
            Scandium.setProperty(PropertyKey.INGOT, IngotProperty())
            Protactinium.setProperty(PropertyKey.INGOT, IngotProperty())
            Holmium.setProperty(PropertyKey.INGOT, IngotProperty())
            Radium.setProperty(PropertyKey.INGOT, IngotProperty())
            Francium.setProperty(PropertyKey.INGOT, IngotProperty())
            Terbium.setProperty(PropertyKey.INGOT, IngotProperty())
            Thulium.setProperty(PropertyKey.INGOT, IngotProperty())
            Erbium.setProperty(PropertyKey.INGOT, IngotProperty())
            Dysprosium.setProperty(PropertyKey.INGOT, IngotProperty())
            Praseodymium.setProperty(PropertyKey.INGOT, IngotProperty())
            Actinium.setProperty(PropertyKey.INGOT, IngotProperty())
            Curium.setProperty(PropertyKey.INGOT, IngotProperty())
            Berkelium.setProperty(PropertyKey.INGOT, IngotProperty())
            Neptunium.setProperty(PropertyKey.INGOT, IngotProperty())
            Californium.setProperty(PropertyKey.INGOT, IngotProperty())
            Iodine.setProperty(PropertyKey.INGOT, IngotProperty())
            Hafnium.setProperty(PropertyKey.INGOT, IngotProperty())
            Thallium.setProperty(PropertyKey.INGOT, IngotProperty())
            Selenium.setProperty(PropertyKey.INGOT, IngotProperty())
            Astatine.setProperty(PropertyKey.INGOT, IngotProperty())

            Einsteinium.setProperty(PropertyKey.INGOT, IngotProperty())
            Fermium.setProperty(PropertyKey.INGOT, IngotProperty())
            Mendelevium.setProperty(PropertyKey.INGOT, IngotProperty())
            Nobelium.setProperty(PropertyKey.INGOT, IngotProperty())
            Lawrencium.setProperty(PropertyKey.INGOT, IngotProperty())
            Rutherfordium.setProperty(PropertyKey.INGOT, IngotProperty())
            Dubnium.setProperty(PropertyKey.INGOT, IngotProperty())
            Seaborgium.setProperty(PropertyKey.INGOT, IngotProperty())
            Bohrium.setProperty(PropertyKey.INGOT, IngotProperty())
            Hassium.setProperty(PropertyKey.INGOT, IngotProperty())
            Meitnerium.setProperty(PropertyKey.INGOT, IngotProperty())
            Roentgenium.setProperty(PropertyKey.INGOT, IngotProperty())
            Copernicium.setProperty(PropertyKey.INGOT, IngotProperty())
            Nihonium.setProperty(PropertyKey.INGOT, IngotProperty())
            Flerovium.setProperty(PropertyKey.INGOT, IngotProperty())
            Moscovium.setProperty(PropertyKey.INGOT, IngotProperty())
            Livermorium.setProperty(PropertyKey.INGOT, IngotProperty())
            Tennessine.setProperty(PropertyKey.INGOT, IngotProperty())
            Oganesson.setProperty(PropertyKey.INGOT, IngotProperty())
            Lutetium.setProperty(PropertyKey.INGOT, IngotProperty())

            Sodium.setProperty(PropertyKey.FLUID, FluidProperty())
            Bromine.setProperty(PropertyKey.FLUID, FluidProperty())

            Water.getProperty(PropertyKey.FLUID).storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Redstone.getProperty(PropertyKey.FLUID).storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Glass.getProperty(PropertyKey.FLUID).storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Lead.getProperty(PropertyKey.FLUID).storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())

            var fp = FluidProperty()
            fp.storage.enqueueRegistration(FluidStorageKeys.LIQUID, FluidBuilder())
            fp.storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Flerovium.setProperty(PropertyKey.FLUID, fp)

            fp = FluidProperty()
            fp.storage.enqueueRegistration(FluidStorageKeys.LIQUID, FluidBuilder())
            fp.storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Phosphorus.setProperty(PropertyKey.FLUID, fp)

            fp = FluidProperty()
            fp.storage.enqueueRegistration(FluidStorageKeys.LIQUID, FluidBuilder())
            fp.storage.enqueueRegistration(FluidStorageKeys.PLASMA, FluidBuilder())
            Protactinium.setProperty(PropertyKey.FLUID, fp)

            TinAlloy.addFlags(GENERATE_FINE_WIRE, GENERATE_FOIL)
            Oxygen.addFlags(GENERATE_FOIL)
            RutheniumTriniumAmericiumNeutronate.addFlags(GENERATE_FINE_WIRE)
            Europium.addFlags(GENERATE_SPRING_SMALL)
            PolyvinylChloride.addFlags(GENERATE_LENS)

            AnimalWaste = Material.Builder(1, Serendustry.ID("animal_waste"))
                .gem().fluid().color(0x7B5C00)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .build()

            InfusedGold = Material.Builder(2, Serendustry.ID("infused_gold"))
                .ingot().fluid()
                .color(0xA59030).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Gold, 4)
                .build()
                .setFormula("(Au4Ma)", true)

            FluxedElectrum = Material.Builder(3, Serendustry.ID("fluxed_electrum"))
                .ingot(3).liquid(FluidBuilder().temperature(8000))
                .color(0xFFE049).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW)
                .components(RoseGold, 1, SterlingSilver, 1, Electrum, 2, InfusedGold, 2, Naquadria, 4, SolderingAlloy, 10)
                .blastTemp(8000, GasTier.HIGHEST, VA[UV], 8000)
                .cableProperties(VA[UEV].toLong(), 1, 1536, false, 3)
                .build()

            Amogus = Material.Builder(4, Serendustry.ID("amogus"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x15703F).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(Americium, 1, Oganesson, 1, Uranium238, 1, Sulfur, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 5000)
                .build()

            HastelloyX78 = Material.Builder(5, Serendustry.ID("hastelloyx_78"))
                .ingot(3).liquid(FluidBuilder().temperature(7500))
                .color(0x5F90C9).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(NaquadahAlloy, 10, Rhenium, 5, Naquadria, 4, Polonium, 3, Rutherfordium, 2, Fermium, 1)
                .blastTemp(8500, GasTier.HIGHEST, VA[UV], 10000)
                .build()

            HastelloyK243 = Material.Builder(6, Serendustry.ID("hastelloyk_243"))
                .ingot(3).liquid(FluidBuilder().temperature(8500))
                .color(0x9FEC60).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(HastelloyX78, 5, Tritanium, 4, TungstenCarbide, 4, Promethium, 4, NiobiumNitride, 2, Mendelevium, 1)
                .blastTemp(9000, GasTier.HIGHEST, VA[UHV], 12000)
                .toolStats(ToolProperty.Builder.of(160.0f, 110.0f, 65535, 7)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build()

            Technetium22 = Material.Builder(7, Serendustry.ID("technetium_22"))
                .ingot(3).liquid(FluidBuilder().temperature(10000))
                .color(0xC6AA14).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Technetium, 22)
                .blast { b ->
                    b.temp(9000, GasTier.HIGH)
                    b.blastStats(VA[ULV], 120000)
                }
                .build()
                .setFormula("Tc-22", false)

            Zeron100 = Material.Builder(8, Serendustry.ID("zeron_100")) // GCYM duplicates this
                .ingot(3).liquid(FluidBuilder().temperature(5000))
                .color(0xA8A813).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Steel, 20, Chrome, 13, Copper, 10, Nickel, 3, Molybdenum, 2, Tungsten, 2)
                .blastTemp(3000, GasTier.HIGH, VA[IV], 1000)
                .build()

            Cinobite = Material.Builder(9, Serendustry.ID("cinobite"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x010101).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Zeron100, 8, Titanium, 6, Naquadria, 4, Gadolinium, 3, Osmiridium, 1, Mercury, 1)
                .blastTemp(2500, GasTier.HIGHEST, VA[UV], 2000)
                .fluidPipeProperties(30000, 3500, true, true, true, true)
                .build()

            Inconel792 = Material.Builder(10, Serendustry.ID("inconel_792"))
                .ingot(3).liquid(FluidBuilder().temperature(4000))
                .color(0x66E370).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_BOLT_SCREW)
                .components(Nickel, 2, Aluminium, 2, Niobium, 1, Nichrome, 1)
                .blastTemp(1500, GasTier.MID, VA[EV], 800)
                .build()

            EglinSteel = Material.Builder(11, Serendustry.ID("eglin_steel"))
                .ingot(3).liquid(FluidBuilder().temperature(4500))
                .color(0x733910).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Invar, 5, Iron, 4, Kanthal, 1, Sulfur, 1, Silicon, 1, Carbon, 1)
                .blastTemp(1200, GasTier.MID, VA[EV], 800)
                .build()

            Platinium = Material.Builder(12, Serendustry.ID("platinium"))
                .ingot(3).liquid(FluidBuilder().temperature(3500))
                .color(0xDDEECD).iconSet(SHINY)
                .flags(STD_METAL)
                .components(Platinum, 3, Aluminium, 1)
                .blastTemp(1100, GasTier.MID, VA[EV], 600)
                .build()

            SiliconCarbide = Material.Builder(13, Serendustry.ID("silicon_carbide"))
                .dust(0)
                .color(0x606060).iconSet(SHINY)
                .components(Silicon, 1, Carbon, 1)
                .build()

            Onionium = Material.Builder(14, Serendustry.ID("onionium"))
                .ingot(3).liquid(FluidBuilder().temperature(3000))
                .color(0xFE82A3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Antimony, 2, Platinium, 2, Ytterbium, 1, Nichrome, 1, SiliconCarbide, 1)
                .blastTemp(3500, GasTier.HIGHER, VA[ZPM], 2000)
                .build()

            Pikyonium = Material.Builder(15, Serendustry.ID("pikyonium"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x3160AE).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_SMALL_GEAR)
                .components(Inconel792, 8, EglinSteel, 5, NaquadahEnriched, 4, TungstenSteel, 4, Cerium, 3, Onionium, 7)
                .blastTemp(9000, GasTier.HIGHEST, VA[UV], 2000)
                .cableProperties(V.get(UHV), 2, 512)
                .build()

            HastelloyN = Material.Builder(16, Serendustry.ID("hastelloyn"))
                .ingot(3).liquid(FluidBuilder().temperature(3000))
                .color(0xB3B3B3).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Nickel, 15, Molybdenum, 4, Yttrium, 2, Chrome, 2, Titanium, 2)
                .blastTemp(1200, GasTier.MID, VA[EV], 600)
                .build()

            Aluminum = Material.Builder(17, Serendustry.ID("aluminum"))
                .ingot().fluid()
                .color(0x80C8F0).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Aluminium, 1)
                .build()

            Lafium = Material.Builder(18, Serendustry.ID("lafium"))
                .ingot(3).liquid(FluidBuilder().temperature(3450))
                .color(0x0D0D60).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME, GENERATE_RING, GENERATE_ROUND, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW)
                .components(HastelloyN, 8, Nickel, 8, Aluminum, 6, Naquadah, 4, Tungsten, 4, Samarium, 2, Carbon, 2, Argon, 2)
                .cableProperties(V.get(UEV), 2, 2048)
                .fluidPipeProperties(65000, 5000, true, true, true, true)
                .blastTemp(1800, GasTier.HIGHEST, VA[UHV], 900)
                .build()

            EnrichedNaquadahAlloy = Material.Builder(19, Serendustry.ID("enriched_naquadah_alloy"))
                .ingot(3).liquid(FluidBuilder().temperature(8000))
                .color(0x3C3C3A).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(NaquadahEnriched, 4, Rhodium, 2, Ruthenium, 2, Rubidium, 2, Dubnium, 1, Einsteinium, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 1800)
                .build()

            BismuthTellurite = Material.Builder(20, Serendustry.ID("bismuth_tellurite"))
                .dust(0)
                .color(0x00512A).iconSet(SHINY)
                .components(Bismuth, 2, Tellurium, 3)
                .build()

            Prasiolite = Material.Builder(21, Serendustry.ID("prasiolite"))
                .dust(0)
                .color(0x768836).iconSet(SHINY)
                .components(Silicon, 5, Oxygen, 10, Iron, 1)
                .build()

            CubicZirconia = Material.Builder(22, Serendustry.ID("cubic_zirconia"))
                .dust(0)
                .color(0xF1D3D6).iconSet(SHINY)
                .components(Zirconium, 1, Oxygen, 2)
                .build()

            MagnetoResonatic = Material.Builder(23, Serendustry.ID("magneto_resonatic"))
                .gem().liquid(FluidBuilder().temperature(500))
                .color(0xD37DD3).iconSet(MAGNETIC)
                .flags(STD_METAL, NO_SMASHING, NO_SMELTING, GENERATE_LENS)
                .components(BismuthTellurite, 4, Prasiolite, 3, CubicZirconia, 1, SamariumMagnetic, 1)
                .build()

            HighDurabilityCompoundSteel = Material.Builder(24, Serendustry.ID("high_durability_compound_steel"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x304030).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(TungstenSteel, 12, HSSS, 9, HSSG, 6, Ruridit, 3, MagnetoResonatic, 2, Plutonium239, 1)
                .blastTemp(5000, GasTier.HIGHEST, VA[ZPM], 1200)
                .build()

            ScUev = Material.Builder(25, Serendustry.ID("sc_uev"))
                .ingot().liquid(FluidBuilder().temperature(26000))
                .color(0x9B46BA).iconSet(BRIGHT)
                .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(MagnetoResonatic, 3, Cinobite, 1, Pikyonium, 1, Aluminum, 1)
                .cableProperties(V.get(UEV), 24, 0, true, 3)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 2000)
                .build()

            TastyNeutronium = Material.Builder(26, Serendustry.ID("tasty_neutronium"))
                .ingot().liquid(FluidBuilder().temperature(50000))
                .color(0x3E1446).iconSet(BRIGHT)
                .components(Neutronium, 1)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_ROTOR)
                .blastTemp(14000, GasTier.HIGHEST, VA[UHV], 8000)
                .build()
                .setFormula("Nt:tooth:", true)

            Luminessence = Material.Builder(27, Serendustry.ID("luminessence"))
                .dust(0)
                .color(0xFFE568).iconSet(BRIGHT)
                .components(Aluminum, 1, Phosphate, 1)
                .build()

            Lumiium = Material.Builder(28, Serendustry.ID("lumiium"))
                .ingot(3).liquid(FluidBuilder().temperature(30000))
                .color(0xFFE100).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Luminessence, 2, TinAlloy, 1, RoseGold, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3000)
                .build()

            Signalium = Material.Builder(29, Serendustry.ID("signalium"))
                .ingot(3).liquid(FluidBuilder().temperature(35000))
                .color(0xFF9300).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(Lumiium, 3, Aluminum, 2, FluxedElectrum, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3500)
                .cableProperties(V[UIV], 2, 8192)
                .build()

            EnderiiumBase = Material.Builder(30, Serendustry.ID("enderiium_base"))
                .ingot(3).liquid(FluidBuilder().temperature(40000))
                .color(0x3B7A9F).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_ROTOR)
                .components(Signalium, 4, EnderPearl, 2, TastyNeutronium, 2, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 3800)
                .build()

            Enderiiium = Material.Builder(31, Serendustry.ID("enderiiium"))
                .ingot(3).liquid(FluidBuilder().temperature(50000))
                .color(0x408587).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_FRAME, GENERATE_BOLT_SCREW)
                .components(EnderiiumBase, 4, InfusedGold, 1, Phosphate, 1)
                .blastTemp(11000, GasTier.HIGHEST, VA[UHV], 4200)
                .build()

            PulsatingIron = Material.Builder(32, Serendustry.ID("pulsating_iron"))
                .ingot(3).liquid(FluidBuilder().temperature(5000))
                .color(0x5ACE92).iconSet(BRIGHT)
                .flags(STD_METAL)
                .components(Iron, 1, EnderPearl, 1, Uraninite, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[IV], 2500)
                .build()

            EnergeticAlloy = Material.Builder(33, Serendustry.ID("energetic_alloy"))
                .ingot(3).liquid(FluidBuilder().temperature(5500))
                .color(0xFF8752).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(PulsatingIron, 4, Zeolite, 1, GarnetSand, 1, HSSS, 1, Mercury, 1)
                .blastTemp(6500, GasTier.HIGHER, VA[LuV], 2800)
                .build()

            VibrantAlloy = Material.Builder(34, Serendustry.ID("vibrant_alloy"))
                .ingot(3).liquid(FluidBuilder().temperature(5850))
                .color(0x75FF66).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR)
                .components(EnergeticAlloy, 5, Zeolite, 1, BasalticMineralSand, 1, GraniticMineralSand, 1)
                .blastTemp(7000, GasTier.HIGHEST, VA[UV], 3000)
                .build()

            StellarAlloy = Material.Builder(35, Serendustry.ID("stellar_alloy"))
                .ingot(3).liquid(FluidBuilder().temperature(12000))
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_RING, GENERATE_ROUND, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .components(VibrantAlloy, 8, TastyNeutronium, 2, Aluminum, 2, AluminiumSulfite, 1)
                .fluidPipeProperties(80000, 7500, true, true, true, true)
                .blastTemp(8000, GasTier.HIGHEST, VA[UHV], 4000)
                .toolStats(ToolProperty.Builder.of(200.0f, 120.0f, 65535, 8)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build()

            ScUiv = Material.Builder(36, Serendustry.ID("sc_uiv"))
                .ingot(3).liquid(FluidBuilder().temperature(50000))
                .color(0xFF66A3).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(VibrantAlloy, 3, Naquadria, 2, FluxedElectrum, 2, EnderiiumBase, 2)
                .cableProperties(V.get(UIV), 24, 0, true)
                .blastTemp(8500, GasTier.HIGHEST, VA[UHV], 6000)
                .build()

            CrystalMatrix = Material.Builder(37, Serendustry.ID("crystal_matrix"))
                .ingot(3).liquid(FluidBuilder().temperature(45000))
                .color(0x8EFFE6).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
                .components(Diamond, 1, NetherStar, 1)
                .blastTemp(8800, GasTier.HIGHEST, VA[UHV], 8000)
                .build()

            InfinityCatalyst = Material.Builder(38, Serendustry.ID("infinity_catalyst"))
                .ingot(3).liquid(FluidBuilder().temperature(75000))
                .color(0xFFFFFF).iconSet(NETHERSTAR)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROTOR, GENERATE_FRAME)
                .components(CrystalMatrix, 8, Neutronium, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 8000)
                .build()
                .setFormula("If")

            Infinity = Material.Builder(39, Serendustry.ID("infinity"))
                .ingot(3).liquid(FluidBuilder().temperature(500000)).plasma()
                .color(0xFFFFFF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(InfinityCatalyst, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 12000)
                .build()
                .setFormula("If*", true)

            Draconium = Material.Builder(40, Serendustry.ID("draconium"))
                .ingot(3).liquid(FluidBuilder().temperature(30000))
                .color(0x8E52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_SMALL_GEAR)
                .components(TinAlloy, 8)
                .blastTemp(8800, GasTier.HIGHEST, VA[UEV], 7000)
                .build()
                .setFormula("Dc", true)

            ChargedDraconium = Material.Builder(41, Serendustry.ID("charged_draconium"))
                .ingot(3).liquid(FluidBuilder().temperature(35000))
                .color(0xCD52E6).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_FOIL)
                .components(Draconium, 1)
                .fluidPipeProperties(95000, 9000, true, true, true, true)
                .blastTemp(8850, GasTier.HIGHEST, VA[UEV], 7500)
                .build()
                .setFormula("Dc+", true)

            AwakenedDraconium = Material.Builder(42, Serendustry.ID("awakened_draconium"))
                .ingot(3).liquid(FluidBuilder().temperature(65000))
                .color(0xDD520C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_DENSE)
                .components(Draconium, 1)
                .blastTemp(8950, GasTier.HIGHEST, VA[UIV], 8500)
                .toolStats(ToolProperty.Builder.of(240.0f, 160.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build()
                .setFormula("Dc*", true)

            Bedrockium = Material.Builder(43, Serendustry.ID("bedrockium"))
                .ingot(3).liquid(FluidBuilder().temperature(45000))
                .color(0x262626).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_FOIL, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(SiliconDioxide, 384)
                .cableProperties(V.get(UXV), 2, 32768)
                .blastTemp(9000, GasTier.HIGHEST, VA[UIV], 6000)
                .build()

            ScUxv = Material.Builder(44, Serendustry.ID("sc_uxv"))
                .ingot(3).liquid(FluidBuilder().temperature(48000))
                .color(0xFF4F4F).iconSet(BRIGHT)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(ChargedDraconium, 4, StellarAlloy, 4, Luminessence, 3, InfinityCatalyst, 2)
                .cableProperties(V.get(UXV), 24, 0, true)
                .blastTemp(10000, GasTier.HIGHEST, VA[UIV], 7000)
                .build()

            Jasper = Material.Builder(45, Serendustry.ID("jasper"))
                .dust(0).fluid()
                .color(0xFF1484).iconSet(SHINY)
                .components(SiliconDioxide, 1)
                .build()
                .setFormula("?")

            ArceusAlloy2B = Material.Builder(46, Serendustry.ID("arceus_alloy_2_b"))
                .ingot(3).liquid(FluidBuilder().temperature(41000))
                .color(0xC4A415).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Trinium, 3, HSSS, 4, TungstenCarbide, 2, Osmiridium, 1, Strontium, 1)
                .blastTemp(10200, GasTier.HIGHER, VA[LuV], 7000)
                .build()

            AssemblyLine = Material.Builder(47, Serendustry.ID("assembly_line"))
                .dust().liquid(FluidBuilder().temperature(32768)).plasma()
                .color(0x6C6D7A).iconSet(DULL)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .toolStats(ToolProperty.Builder.of(80.0f, 15.0f, 6400, 5)
                    .attackSpeed(0.5f).enchantability(1).build())
                .rotorStats(9.5f, 4.0f, 4800)
                .build()
                .setFormula("Assembly Line")

            Quantum = Material.Builder(48, Serendustry.ID("quantum"))
                .ingot(3).liquid(FluidBuilder().temperature(48000))
                .color(0x353535).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_BOLT_SCREW, GENERATE_FRAME)
                .components(StellarAlloy, 15, ArceusAlloy2B, 10, Lafium, 10, Jasper, 5, Americium, 5, Pikyonium, 5, Germanium, 5, SiliconCarbide, 5, AssemblyLine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .toolStats(ToolProperty.Builder.of(220.0f, 125.0f, 65535, 9)
                        .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .build()

            Quantium = Material.Builder(49, Serendustry.ID("quantium"))
                .ingot(3).liquid(FluidBuilder().temperature(70000))
                .color(0x00D100).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL)
                .components(Quantum, 1)
                .itemPipeProperties(16, 256f)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 9500)
                .cableProperties(V[OpV], 2, 131072)
                .build()
                .setFormula("Qt")

            CallistoIce = Material.Builder(50, Serendustry.ID("callisto_ice"))
                .ingot(3).liquid(FluidBuilder().temperature(1))
                .color(0x00D1FF).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_ROUND, GENERATE_RING, GENERATE_BOLT_SCREW)
                .components(Water, 1)
                .fluidPipeProperties(800000, 15000, true, true, true, true)
                .blastTemp(273, GasTier.HIGHEST, VA[UXV], 2000)
                .build()
                .setFormula("(SpH2O)", true)

            Ledox = Material.Builder(51, Serendustry.ID("ledox"))
                .ingot(3).liquid(FluidBuilder().temperature(50000))
                .color(0x1B2FE2).iconSet(DULL)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
                .components(Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 7000)
                .build()
                .setFormula("(SpPb)", true)

            NaquadriaticTaranium = Material.Builder(52, Serendustry.ID("naquadriatic_taranium"))
                .ingot(3).liquid(FluidBuilder().temperature(55000))
                .color(0x000000).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Naquadria, 4, CoalTar, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 8000)
                .build()

            ScOpv = Material.Builder(53, Serendustry.ID("sc_opv"))
                .ingot(3).liquid(FluidBuilder().temperature(90000))
                .color(0x597C8C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE)
                .components(Quantum, 5, AwakenedDraconium, 3, Ledox, 3, Enderiiium, 3, Infinity, 3, NaquadriaticTaranium, 3, Amogus, 2)
                .blastTemp(10800, GasTier.HIGHEST, VA[UXV], 11000)
                .cableProperties(V[OpV], 24, 0, true)
                .build()

            MutatedLivingSolder = Material.Builder(54, Serendustry.ID("mutated_living_solder"))
                .ingot(3).liquid(FluidBuilder().temperature(25000))
                .color(0x785B7E).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blastTemp(6000, GasTier.HIGHEST, VA[UV], 5000)
                .build()
                .setFormula("?")

            Thaumium = Material.Builder(55, Serendustry.ID("thaumium"))
                .ingot(3).liquid(FluidBuilder().temperature(25000))
                .color(0x802BA8).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(SolderingAlloy, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[UV], 5000)
                .build()
                .setFormula("DsMa")

            GalliumYttrium = Material.Builder(56, Serendustry.ID("gallium_yttrium"))
                .ingot(3).liquid(FluidBuilder().temperature(12000))
                .color(0x6D0054).iconSet(DULL)
                .flags(STD_METAL, GENERATE_RING)
                .components(Gallium, 1, Yttrium, 1)
                .blastTemp(3000, GasTier.MID, VA[HV], 1000)
                .build()

            Magic2 = Material.Builder(57, Serendustry.ID("magic_2"))
                .liquid(FluidBuilder().temperature(1))
                .color(0x6D0054).iconSet(DULL)
                .flags(DISABLE_DECOMPOSITION)
                .components(Iron, 1)
                .build()
                .setFormula("Ma")

            RealCupronickel = Material.Builder(58, Serendustry.ID("real_cupronickel"))
                .ingot(3).liquid(FluidBuilder().temperature(1100))
                .color(0xDCDCFF).iconSet(DULL)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FOIL)
                .components(Copper, 40, Nickel, 22, Iron, 1, Manganese, 1)
                .build()
                .setFormula("(Cu40Ni22Fe1Mn1)", true)

            Xenoxene = Material.Builder(59, Serendustry.ID("xenoxene"))
                .fluid()
                .color(0x828282)
                .build()

            RawRadox = Material.Builder(60, Serendustry.ID("raw_radox"))
                .fluid()
                .color(0x8914AD)
                .build()

            LightRadox = Material.Builder(61, Serendustry.ID("light_radox"))
                .fluid()
                .color(0xA42CE0)
                .build()

            HeavyRadox = Material.Builder(62, Serendustry.ID("heavy_radox"))
                .fluid()
                .color(0x631B87)
                .build()

            CrackedLightRadox = Material.Builder(63, Serendustry.ID("cracked_light_radox"))
                .fluid()
                .color(0xA464C4)
                .build()

            CrackedHeavyRadox = Material.Builder(64, Serendustry.ID("cracked_heavy_radox"))
                .fluid()
                .color(0x663F7A)
                .build()

            PurifiedRadox = Material.Builder(65, Serendustry.ID("purified_radox"))
                .fluid()
                .color(0xBB71E0)
                .build()

            RadoxPolymer = Material.Builder(66, Serendustry.ID("radox_polymer"))
                .polymer(3).fluid()
                .color(0xBB2BE0)
                .flags(GENERATE_FOIL, GENERATE_RING, GENERATE_DENSE)
                .fluidPipeProperties(8000, 5000, true, true, true, false)
                .build()

            Floppa = Material.Builder(67, Serendustry.ID("floppa"))
                .ingot(3).liquid(FluidBuilder().temperature(800000))
                .color(0x9E5625).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_DENSE, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SMALL_GEAR, GENERATE_FOIL)
                .components(Flerovium, 1, Oxygen, 1, Phosphorus, 1, Protactinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 50000)
                .cableProperties(V[MAX], 24, 0, true)
                .build()

            KerrBlackHole = Material.Builder(68, Serendustry.ID("kerr_black_hole"))
                .ingot(3).liquid(FluidBuilder().temperature(1))
                .color(0x000000).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[UIV], 10000)
                .build()

            DestabilizedMatter = Material.Builder(69, Serendustry.ID("destabilized_matter"))
                .fluid().plasma()
                .color(0x5E609B)
                .build()

            ExoticMatter = Material.Builder(70, Serendustry.ID("exotic_matter"))
                .fluid().plasma()
                .color(0x5E2B9B)
                .build()

            DarkMatter = Material.Builder(71, Serendustry.ID("dark_matter"))
                .fluid().plasma()
                .color(0x180B28)
                .build()

            RedMatter = Material.Builder(72, Serendustry.ID("red_matter"))
                .fluid().plasma()
                .color(0xFF0000)
                .build()

            AtomicResonanceCatalyst = Material.Builder(73, Serendustry.ID("atomic_resonance_catalyst"))
                .dust().fluid()
                .color(0xEC4E42)
                .build()

            ChromaticGlass = Material.Builder(74, Serendustry.ID("chromatic_glass"))
                .ingot(3).liquid(FluidBuilder().temperature(35000))
                .color(0xFFFFFF).iconSet(GLASS) // TODO: Give it animated rainbow colors
                .flags(STD_METAL, GENERATE_FOIL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 6000)
                .build()

            Shirabon = Material.Builder(75, Serendustry.ID("shirabon"))
                .ingot(3).liquid(FluidBuilder().temperature(600000)).plasma()
                .color(0xE0156D).iconSet(BRIGHT)
                .flags(STD_METAL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_FRAME, GENERATE_FOIL, GENERATE_LONG_ROD)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 30000)
                .fluidPipeProperties(3200000, 40000, true, true, true, true)
                .build()
                .setFormula("Sh")

            Teflon = Material.Builder(76, Serendustry.ID("teflon"))
                .polymer(3).fluid()
                .color(0x222222)
                .flags(DISABLE_DECOMPOSITION, GENERATE_DENSE, GENERATE_RING, GENERATE_FOIL)
                .components(Polytetrafluoroethylene, 15, Polyethylene, 3, Carbon, 1, Sodium, 1)
                .build()

            EnrichedHolmium = Material.Builder(77, Serendustry.ID("enriched_holmium"))
                .ingot(3).liquid(FluidBuilder().temperature(4200))
                .color(0x5D15EE).iconSet(SHINY)
                .flags(STD_METAL, GENERATE_FOIL, GENERATE_GEAR)
                .components(NaquadahEnriched, 8, Holmium, 1)
                .blastTemp(6000, GasTier.HIGHER, VA[LuV], 2000)
                .build()

            EnrichedTeflon = Material.Builder(78, Serendustry.ID("enriched_teflon"))
                .polymer(3)
                .color(0xE34500)
                .flags(DISABLE_DECOMPOSITION, GENERATE_FOIL, GENERATE_RING)
                .components(NaquadahEnriched, 1, Teflon, 1, EnrichedHolmium, 1, EnrichedNaquadahAlloy, 1, EglinSteel, 1, Zeron100, 1, HastelloyN, 1, MagnetoResonatic, 1, TungstenSteel, 1)
                .build()

            OmniversalRedstone = Material.Builder(79, Serendustry.ID("omniversal_redstone"))
                .dust().fluid()
                .color(0xD13830)
                .build()

            OmniversalLubricant = Material.Builder(80, Serendustry.ID("omniversal_lubricant"))
                .fluid().plasma()
                .color(0x97D344)
                .build()

            PartialAlkalis = Material.Builder(81, Serendustry.ID("partial_alkalis"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x643ECD).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Lithium, 1, Sodium, 1, Potassium, 1, Rubidium, 1, Caesium, 1, Francium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Alkalis = Material.Builder(82, Serendustry.ID("alkalis"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x75CE6D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialAlkalis, 1, Beryllium, 1, Magnesium, 1, Calcium, 1, Strontium, 1, Barium, 1, Radium, 1, Scandium, 1, Yttrium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            RefractoryMetals = Material.Builder(83, Serendustry.ID("refractory_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x4141CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Zirconium, 1, Hafnium, 1, Niobium, 1, Tantalum, 1, Molybdenum, 1, Tungsten, 1, Technetium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            LightTransitionMetals = Material.Builder(84, Serendustry.ID("light_transition_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCC9A3D).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Titanium, 1, Vanadium, 1, Manganese, 1, Chrome, 1, Iron, 1, Nickel, 1, Cobalt, 1, Copper, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PreciousMetals = Material.Builder(85, Serendustry.ID("precious_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCAC9CC).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, Rhodium, 1, Palladium, 1, Silver, 1, Rhenium, 1, Osmium, 1, Iridium, 1, Platinum, 1, Gold, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PartialPostTransitionMetals = Material.Builder(86, Serendustry.ID("partial_post_transition_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xBB6E1A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Mercury, 1, Tin, 1, Gallium, 1, Indium, 1, Bismuth, 1, Polonium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PostTransitionMetals = Material.Builder(87, Serendustry.ID("post_transition_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCC8F9F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialPostTransitionMetals, 1, Zinc, 1, Cadmium, 1, Aluminum, 1, Silicon, 1, Germanium, 1, Antimony, 1, Thallium, 1, Lead, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PartialLanthanoids = Material.Builder(88, Serendustry.ID("partial_lanthanoids"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x2A82E4).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Dysprosium, 1, Lanthanum, 1, Cerium, 1, Praseodymium, 1, Neodymium, 1, Europium, 1, Ytterbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Lanthanoids = Material.Builder(89, Serendustry.ID("lanthanoids"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x5DCCA3).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialLanthanoids, 1, Samarium, 1, Gadolinium, 1, Terbium, 1, Thulium, 1, Holmium, 1, Lutetium, 1, Promethium, 1, Erbium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PartialActinoids = Material.Builder(90, Serendustry.ID("partial_actinoids"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x02B3F2).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Californium, 1, Neptunium, 1, Plutonium241, 1, Mendelevium, 1, Einsteinium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Actinoids = Material.Builder(91, Serendustry.ID("actinoids"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xC9CC7A).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialActinoids, 1, Actinium, 1, Thorium, 1, Protactinium, 1, Uranium235, 1, Americium, 1, Curium, 1, Berkelium, 1, Fermium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Gases = Material.Builder(92, Serendustry.ID("gases"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x25CBA8).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Oxygen, 1, Nitrogen, 1, Hydrogen, 1, Fluorine, 1, Chlorine, 1, Bromine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            NonMetals = Material.Builder(93, Serendustry.ID("non_metals"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCC2AB9).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Boron, 1, Carbon, 1, Phosphorus, 1, Sulfur, 1, Arsenic, 1, Selenium, 1, Tellurium, 1, Iodine, 1, Astatine, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PartialNobleGases = Material.Builder(94, Serendustry.ID("partial_noble_gases"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xBB420F).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Helium, 1, Neon, 1, Argon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            NobleGases = Material.Builder(95, Serendustry.ID("noble_gases"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0x70CC2E).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialNobleGases, 1, Krypton, 1, Xenon, 1, Radon, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            PartialSuperheavies = Material.Builder(96, Serendustry.ID("partial_superheavies"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Nobelium, 1, Lawrencium, 1, Rutherfordium, 1, Dubnium, 1, Seaborgium, 1, Bohrium, 1, Hassium, 1, Meitnerium, 1, Darmstadtium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Superheavies = Material.Builder(97, Serendustry.ID("superheavies"))
                .ingot(3).liquid(FluidBuilder().temperature(6000))
                .color(0xCC0A00).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(PartialSuperheavies, 1, Roentgenium, 1, Copernicium, 1, Nihonium, 1, Flerovium, 1, Moscovium, 1, Livermorium, 1, Tennessine, 1, Oganesson, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            Periodicium = Material.Builder(98, Serendustry.ID("periodicium"))
                .ingot(3).liquid(FluidBuilder().temperature(6000)).plasma()
                .color(0x1111FF).iconSet(SHINY)
                .flags(STD_METAL, DISABLE_DECOMPOSITION)
                .components(Alkalis, 1, RefractoryMetals, 1, LightTransitionMetals, 1, PreciousMetals, 1, PostTransitionMetals, 1, Lanthanoids, 1, Actinoids, 1, Superheavies, 1, Gases, 1, NonMetals, 1, NobleGases, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[UHV], 5000)
                .build()

            MultiversalAlloy = Material.Builder(99, Serendustry.ID("multiversal_alloy"))
                .ingot(3).liquid(FluidBuilder().temperature(130000))
                .color(0xE04A2C).iconSet(BRIGHT)
                .flags(STD_METAL, DISABLE_DECOMPOSITION, GENERATE_FRAME)
                .components(Infinity, 5, Shirabon, 3, ScOpv, 2, StellarAlloy, 2, ScUxv, 1, Quantum, 1, Actinoids, 1, Lanthanoids, 1, Periodicium, 1)
                .blastTemp(10800, GasTier.HIGHEST, VA[OpV], 16000)
                .build()

            TransCataCrude = Material.Builder(100, Serendustry.ID("trans_cata_crude"))
                .liquid(FluidBuilder().temperature(800000))
                .color(0x631B45)
                .build()

            TransCataExcited = Material.Builder(101, Serendustry.ID("trans_cata_excited"))
                .liquid(FluidBuilder().temperature(2400000))
                .color(0xD88842)
                .build()

            TransCataResplendent = Material.Builder(102, Serendustry.ID("trans_cata_resplendent"))
                .liquid(FluidBuilder().temperature(3200000))
                .color(0x4CFF71)
                .build()

            TransResidue = Material.Builder(103, Serendustry.ID("trans_residue"))
                .liquid(FluidBuilder().temperature(2800000))
                .color(0x4944AF)
                .build()

            TengamRaw = Material.Builder(104, Serendustry.ID("tengam_raw"))
                .dust(3).ore()
                .color(0xA0BF60).iconSet(METALLIC)
                .build()
                .setFormula("M")

            val oreProp = TengamRaw.getProperty(PropertyKey.ORE)
            oreProp.setOreByProducts(IronMagnetic, SteelMagnetic, NeodymiumMagnetic, SamariumMagnetic)
            oreProp.setWashedIn(Steel)
            oreProp.directSmeltResult = NeodymiumMagnetic

            TengamPurified = Material.Builder(105, Serendustry.ID("tengam_purified"))
                .ingot(3).liquid(FluidBuilder().temperature(5000))
                .color(0xD5FF80).iconSet(SHINY)
                .flags(STD_METAL)
                .blastTemp(10800, GasTier.HIGHEST, VA[UV], 5000)
                .build()
                .setFormula("M")

            TengamAttuned = Material.Builder(106, Serendustry.ID("tengam_attuned"))
                .ingot(3)
                .color(0xD5FF80).iconSet(MAGNETIC)
                .flags(STD_METAL, GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(TengamPurified, 1)
                .ingotSmeltInto(TengamPurified)
                .arcSmeltInto(TengamPurified)
                .macerateInto(TengamPurified)
                .build()
            TengamPurified.getProperty(PropertyKey.INGOT).setMagneticMaterial(TengamAttuned)

            DissolutionWater = Material.Builder(107, Serendustry.ID("dissolution_water"))
                .fluid().build()

            MonaziteSludge = Material.Builder(108, Serendustry.ID("monazite_sludge"))
                .fluid().build().setFormula("??????")

            MonaziteSulfate = Material.Builder(109, Serendustry.ID("monazite_sulfate"))
                .fluid().build().setFormula("??????SO4", true)

            InsolubleMonaziteSludge = Material.Builder(110, Serendustry.ID("insoluble_monazite_sludge"))
                .dust().build().setFormula("??????")

            SodiumOxalate = Material.Builder(111, Serendustry.ID("sodium_oxalate"))
                .dust()
                .components(Sodium, 2, Carbon, 2, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build()

            AmmoniumHydroxide = Material.Builder(112, Serendustry.ID("ammonium_hydroxide"))
                .fluid()
                .components(Nitrogen, 1, Hydrogen, 5, Oxygen, 1)
                .build()
                .setFormula("NH4OH", true)

            OxalicAcid = Material.Builder(113, Serendustry.ID("oxalic_acid"))
                .dust()
                .components(Carbon, 2, Hydrogen, 2, Oxygen, 4)
                .flags(DISABLE_DECOMPOSITION)
                .build()

            OxylatedMonazite = Material.Builder(114, Serendustry.ID("oxylated_monazite"))
                .fluid().build().setFormula("??????O4")

            AlkalineOxalateMixture = Material.Builder(115, Serendustry.ID("alkaline_oxalate_mixture"))
                .fluid().build().setFormula("?????O4")

            ErrorSerenibyss = Material.Builder(116, Serendustry.ID("error_serenibyss"))
                .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_DENSE)
                .fluid().color(0xc565f6)
                .toolStats(ToolProperty.Builder.of(480.0f, 320.0f, 65535, 9)
                .attackSpeed(0.5f).enchantability(33).magnetic().build())
                .rotorStats(100.0f, 100.0f, 65535)
                .build().setFormula("REPORT ERROR TO SERENIBYSS")

            ErrorEnvoidia = Material.Builder(117, Serendustry.ID("error_envoidia"))
                    .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_DENSE)
                    .fluid().color(0xe9aae4)
                    .toolStats(ToolProperty.Builder.of(480.0f, 320.0f, 65535, 9)
                    .attackSpeed(0.5f).enchantability(33).magnetic().build())
                    .rotorStats(100.0f, 100.0f, 65535)
                    .build().setFormula("REPORT ERROR TO ENVOIDIA")

            PrimedAir = Material.Builder(118, Serendustry.ID("primed_air"))
                .fluid().color(0xbb9898).build().setFormula("SiO2")

            ArgonPrime = Material.Builder(119, Serendustry.ID("argon_prime"))
                .fluid().color(0x1eff00).build().setFormula("ArΨ")

            HeliumPrime = Material.Builder(120, Serendustry.ID("helium_prime"))
                .fluid().color(0xefff59).build().setFormula("HeΨ")

            HydrogenPrime = Material.Builder(121, Serendustry.ID("hydrogen_prime"))
                .fluid().color(0x037cff).build().setFormula("HΨ")

            KryptonPrime = Material.Builder(122, Serendustry.ID("krypton_prime"))
                .fluid().color(0x06ff03).build().setFormula("KrΨ")

            NeonPrime = Material.Builder(123, Serendustry.ID("neon_prime"))
                .fluid().color(0xe15ee6).build().setFormula("NeΨ")

            NitrogenPrime = Material.Builder(124, Serendustry.ID("nitrogen_prime"))
                .fluid().color(0x5ee2e6).build().setFormula("NΨ")

            OxygenPrime = Material.Builder(125, Serendustry.ID("oxygen_prime"))
                .fluid().color(0x03a1c0).build().setFormula("OΨ")

            Rhopalthenit = Material.Builder(126, Serendustry.ID("rhopalthenit"))
                .ingot(3).liquid(FluidBuilder().temperature(8500))
                .color(0x03c073).iconSet(SHINY)
                .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FRAME, GENERATE_RING, GENERATE_FINE_WIRE, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW)
                .components(Rhodium, 1, Palladium, 1, Ruthenium, 1)
                .blastTemp(3500, GasTier.MID, VA[IV])
                .toolStats(ToolProperty.Builder.of(50.0f, 10.0f, 3600, 4)
                    .attackSpeed(0.5f).enchantability(29).build())
                .rotorStats(7.5f, 3.0f, 2500)
                .build()

            Cheese = Material.Builder(127, Serendustry.ID("cheese"))
                .fluid().dust(3).ore()
                .color(0xfffb00).iconSet(DULL)
                .flags(EXT2_METAL, GENERATE_FINE_WIRE)
                .toolStats(ToolProperty.Builder.of(5.0f, 1.0f, 360, 2)
                    .attackSpeed(0.5f).enchantability(666).build())
                .rotorStats(1.0f, 500.0f, 250)
                .build()
                .setFormula("Ch")

            val oreProp2 = Cheese.getProperty(PropertyKey.ORE)
            oreProp2.setOreByProducts(Cheese, Cheese, Cheese, Cheese)
            oreProp2.setWashedIn(Cheese)
            oreProp2.directSmeltResult = Cheese

            WroughtNeutronium = Material.Builder(128, Serendustry.ID("wrought_neutronium"))
                .ingot(3).liquid(FluidBuilder().temperature(200000))
                .color(0xffffff).iconSet(SHINY)
                .flags(EXT2_METAL, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_RING, GENERATE_FOIL, GENERATE_SMALL_GEAR)
                .components(Neutronium, 1)
                .blastTemp(19800, GasTier.HIGHEST, VA[UHV], 10000)
                .build()
                .setFormula("Nt*")

            AmmoniumNitrate = Material.Builder(129, Serendustry.ID("ammonium_nitrate"))
                .dust().color(0xa147c3).iconSet(DULL)
                .components(Ammonia, 1, Hydrogen, 1, Nitrogen, 1, Oxygen, 3)
                .build()
                .setFormula("(NH4NO3)")

            SulfurousAcid = Material.Builder(130, Serendustry.ID("sulfurous_acid"))
                .fluid().color(0xebb33c)
                .components(Hydrogen, 2, Sulfur, 1, Oxygen, 3)
                .build()

            DriedEarth = Material.Builder(131, Serendustry.ID("dried_earth"))
                .dust().color(0x5a2e01).iconSet(DULL)
                .build()

            SulfuricApatiteMix = Material.Builder(132, Serendustry.ID("sulfuric_apatite_mix"))
                .fluid().color(0x006a99)
                .build()
                .setFormula("(Ca5(PO4)3(F,Cl,OH))S?")

            ISSulfuricAcid = Material.Builder(133, Serendustry.ID("is_sulfuric_acid"))
                .fluid().color(0xffb15d)
                .components(SulfuricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build()

            ISHydrochloricAcid = Material.Builder(134, Serendustry.ID("is_hydrochloric_acid"))
                .fluid().color(0x8bfc7c)
                .components(HydrochloricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build()

            ISHydrofluoricAcid = Material.Builder(135, Serendustry.ID("is_hydrofluoric_acid"))
                .fluid().color(0x7cfcc8)
                .components(HydrofluoricAcid, 1).flags(DISABLE_DECOMPOSITION)
                .build()
        }
    }
}
