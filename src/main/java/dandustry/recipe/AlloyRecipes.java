package dandustry.recipe;

import static gregtech.api.GTValues.*;
import gregtech.api.unification.material.Materials;
import net.minecraft.init.Blocks;

import static dandustry.item.DDMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.QUANTUM_MAINFRAME_ZPM;
import static gregtech.common.items.MetaItems.STEM_CELLS;

public class AlloyRecipes {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .input(dust, RoseGold, 1).input(dust, SterlingSilver, 1).input(dust, Electrum, 2).input(dust, InfusedGold, 2).input(dust, Naquadria, 4)
				.fluidInputs(Materials.SolderingAlloy.getFluid(1440))
                .output(dust, FluxedElectrum, 4)
                .duration(1200).EUt(VA[ZPM]).buildAndRegister();

		 MIXER_RECIPES.recipeBuilder()
                .input(dust, Americium, 1).input(dust, Oganesson, 1).input(dust, Uranium238, 1).input(dust, Sulfur, 1)
                .output(dust, Amogus, 4)
                .duration(800).EUt(VA[ZPM] + 10).buildAndRegister();
				
		 MIXER_RECIPES.recipeBuilder()
                .input(dust, Niobium, 1)
				.fluidInputs(Materials.Nitrogen.getFluid(1000))
                .output(dust, NiobiumNitride, 2)
                .duration(40).EUt(VA[MV] + 2).buildAndRegister();
		
		 MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahAlloy, 10).input(dust, Rhenium, 5).input(dust, Naquadria, 4).input(dust, Polonium, 3).input(dust, Rutherfordium, 2).input(dust, Fermium, 1)
                .output(dust, HastelloyX78, 30)
                .duration(3000).EUt(VA[ZPM] + 25).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyX78, 5).input(dust, Tritanium, 4).input(dust, TungstenCarbide, 4).input(dust, Promethium, 4).input(dust, NiobiumNitride, 2).input(dust, Mendelevium, 1)
                .output(dust, HastelloyK243, 20)
                .duration(2500).EUt(VA[UV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Steel, 20).input(dust, Chrome, 13).input(dust, Copper, 10).input(dust, Nickel, 3).input(dust, Molybdenum, 2).input(dust, Tungsten, 2)
                .output(dust, Zeron100, 50)
                .duration(3500).EUt(VA[IV]).buildAndRegister();
		
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Zeron100, 8).input(dust, Titanium, 6).input(dust, Naquadria, 4).input(dust, Gadolinium, 3).input(dust, Osmiridium, 1)
				.fluidInputs(Materials.Mercury.getFluid(1000))
                .output(dust, Cinobite, 26)
                .duration(1600).EUt(VA[ZPM]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 2).input(dust, Aluminium, 2).input(dust, Niobium, 1).input(dust, Nichrome, 1)
                .output(dust, Inconel792, 6)
                .duration(280).EUt(VA[HV]).buildAndRegister();
		
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Invar, 5).input(dust, Iron, 4).input(dust, Kanthal, 1).input(dust, Sulfur, 1).input(dust, Silicon, 1).input(dust, Carbon, 1)
                .output(dust, EglinSteel, 13)
                .duration(600).EUt(VA[HV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Antimony, 2).input(dust, Platinium, 2).input(dust, Ytterbium).input(dust, Nichrome).input(dust, SiliconCarbide)
				.output(dust, Onionium, 7)
				.duration(400).EUt(VA[IV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
                .input(dust, Inconel792, 8).input(dust, EglinSteel, 5).input(dust, NaquadahEnriched, 4).input(dust, TungstenSteel, 4).input(dust, Cerium, 3).input(dust, Onionium, 7)
                .output(dust, Pikyonium, 29)
                .duration(1900).EUt(VA[ZPM]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 15).input(dust, Molybdenum, 4).input(dust, Yttrium, 2).input(dust, Chrome, 2).input(dust, Titanium, 2)
                .output(dust, HastelloyN, 25)
                .duration(1200).EUt(VA[EV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyN, 8).input(dust, Nickel, 8).input(dust, Aluminum, 6).input(dust, Naquadah, 4).input(dust, Tungsten, 4).input(dust, Samarium, 2).input(dust, Carbon, 2)
				.fluidInputs(Materials.Argon.getFluid(2000))
                .output(dust, Lafium, 36)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

		CENTRIFUGE_RECIPES.recipeBuilder()
				.input(dust, Lafium, 36)
				.output(dust, HastelloyN, 8).output(dust, Nickel, 8).output(dust, Aluminum, 6).output(dust, Naquadah, 4).output(dust, Tungsten, 4).output(dust, Samarium, 2).output(dust, Carbon, 2)
				.fluidOutputs(Materials.Argon.getFluid(2000))
				.duration(600).EUt(VA[UV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
               .input(dust, NaquadahEnriched, 4).input(dust, Rhodium, 2).input(dust, Ruthenium, 2).input(dust, Rubidium, 2).input(dust, Dubnium, 1).input(dust, Einsteinium, 1)
                .output(dust, EnrichedNaquadahAlloy, 12)
                .duration(500).EUt(VA[ZPM]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Silicon, 5).input(dust, Oxygen, 10).input(dust, Iron, 1)
                .output(dust, Prasiolite, 16)
                .duration(600).EUt(VA[HV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Zirconium, 1).input(dust, Oxygen, 2)
                .output(dust, CubicZirconia, 3)
                .duration(113).EUt(VA[HV]).buildAndRegister();
		
		MIXER_RECIPES.recipeBuilder()
                .input(dust, BismuthTellurite, 4).input(dust, Prasiolite, 3).input(dust, CubicZirconia, 1).input(dust, SamariumMagnetic, 1)
                .output(dust, MagnetoResonatic, 9)
                .duration(352).EUt(VA[HV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, TungstenSteel, 12).input(dust, HSSS, 9).input(dust, HSSG, 6).input(dust, Ruridit, 3).input(dust, MagnetoResonatic, 2).input(dust, Plutonium239, 1)
                .output(dust, HighDurabilityCompoundSteel, 33)
                .duration(3100).EUt(VA[UV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 3).input(dust, Cinobite, 1).input(dust, Pikyonium, 1).input(dust, Aluminum, 1)
                .output(dust, MagnetoResonaticCinobitePikyoniumAluminum, 6)
                .duration(2400).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Aluminum).input(dust, Phosphate)
				.output(dust, Luminessence, 2)
				.duration(400).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Luminessence, 2).input(dust, TinAlloy).input(dust, RoseGold).input(dust, Phosphate)
				.output(dust, Lumiium, 5)
				.duration(800).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Lumiium, 3).input(dust, Aluminum, 2).input(dust, FluxedElectrum).input(dust, Phosphate)
				.output(dust, Signalium, 7)
				.duration(1100).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Signalium, 4).input(dust, EnderPearl, 2).input(dust, TastyNeutronium, 2).input(dust, Phosphate)
				.output(dust, EnderiiumBase, 9)
				.duration(1400).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, EnderiiumBase, 4).input(dust, InfusedGold).input(dust, Phosphate)
				.output(dust, Enderiiium, 6)
				.duration(1000).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Iron).input(dust, EnderPearl).input(dust, Uraninite)
				.output(dust, PulsatingIron, 3)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, PulsatingIron, 4).input(dust, Zeolite).input(dust, GarnetSand).input(dust, HSSS)
				.fluidInputs(Mercury.getFluid(1000))
				.output(dust, EnergeticAlloy, 8)
				.duration(800).EUt(VA[LuV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, EnergeticAlloy, 5).input(dust, Zeolite).input(dust, BasalticMineralSand).input(dust, GraniticMineralSand)
				.output(dust, VibrantAlloy, 8)
				.duration(900).EUt(VA[LuV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, VibrantAlloy, 8).input(dust, TastyNeutronium, 2).input(dust, Aluminum, 2).input(dust, AluminiumSulfite)
				.output(dust, StellarAlloy, 13)
				.duration(1600).EUt(VA[ZPM]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, VibrantAlloy, 3).input(dust, Naquadria, 2).input(dust, FluxedElectrum, 2).input(dust, EnderiiumBase, 2)
				.output(dust, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase, 9)
				.duration(1500).EUt(VA[UV]).buildAndRegister();

		IMPLOSION_RECIPES.recipeBuilder()
				.input(gemExquisite, Diamond).input(dust, NetherStar)
				.output(dust, CrystalMatrix)
				.explosivesAmount(4)
				.duration(1).EUt(VA[UHV]).buildAndRegister();

		IMPLOSION_RECIPES.recipeBuilder()
				.input(dust, CrystalMatrix, 8).input(dust, Neutronium, 8)
				.output(dust, InfinityCatalyst)
				.explosivesAmount(4)
				.duration(1).EUt(VA[UHV]).buildAndRegister();

		IMPLOSION_RECIPES.recipeBuilder()
				.input(dust, TinAlloy, 8).input(Blocks.DRAGON_EGG)
				.output(dust, Draconium)
				.explosivesAmount(4)
				.duration(1).EUt(VA[UHV]).buildAndRegister();

		AUTOCLAVE_RECIPES.recipeBuilder()
				.input(dust, Draconium)
				.fluidInputs(Redstone.getFluid(1000))
				.output(dust, ChargedDraconium)
				.duration(180).EUt(VA[UV]).buildAndRegister();

		FORMING_PRESS_RECIPES.recipeBuilder()
				.input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64).input(dust, SiliconDioxide, 64)
				.output(dust, Bedrockium)
				.duration(1050).EUt(VA[UV]).buildAndRegister();

		FORMING_PRESS_RECIPES.recipeBuilder()
				.input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64).input(dust, Stone, 64)
				.output(dust, Jasper)
				.duration(500).EUt(VA[ZPM]).buildAndRegister();

		BLAST_RECIPES.recipeBuilder()
				.input(dust, Silicon).input(dust, Carbon)
				.fluidInputs(Argon.getFluid(200))
				.output(dust, SiliconCarbide, 2)
				.duration(600).EUt(VA[UV]).blastFurnaceTemp(6000).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, StellarAlloy, 15).input(dust, Jasper, 5).input(dust, Gallium, 5).input(dust, Americium, 5).input(dust, Palladium, 5).input(dust, Bismuth, 5).input(dust, Germanium, 5).input(dust, SiliconCarbide, 5)
				.output(dust, Quantum, 50)
				.duration(4000).EUt(VA[UV]).buildAndRegister();

		CHEMICAL_BATH_RECIPES.recipeBuilder()
				.input(QUANTUM_MAINFRAME_ZPM)
				.fluidInputs(Quantum.getFluid(432))
				.output(dust, Quantium)
				.duration(200).EUt(VA[UV]).buildAndRegister();

		CHEMICAL_RECIPES.recipeBuilder()
				.input(dust, Hydrogen, 64).input(dust, Oxygen, 32)
				.fluidInputs(Water.getFluid(64000))
				.output(dust, CallistoIce)
				.duration(3000).EUt(VA[UV]).buildAndRegister();

		CHEMICAL_BATH_RECIPES.recipeBuilder()
				.input(dust, Lead, 16)
				.fluidInputs(Jasper.getFluid(288))
				.output(dust, Ledox)
				.duration(500).EUt(VA[UV]).buildAndRegister();

		CHEMICAL_BATH_RECIPES.recipeBuilder()
				.input(dust, Naquadria, 4)
				.fluidInputs(CoalTar.getFluid(1000))
				.output(dust, NaquadriaticTaranium, 5)
				.duration(500).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Quantum, 5).input(dust, Ledox, 4).input(dust, AwakenedDraconium, 3).input(dust, Enderiiium, 3).input(dust, Infinity, 3).input(dust, NaquadriaticTaranium, 3).input(dust, Amogus, 2)
				.output(dust, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 23)
				.duration(2500).EUt(VA[UV]).buildAndRegister();

		CENTRIFUGE_RECIPES.recipeBuilder()
				.input(dust, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 23)
				.output(dust, Quantum, 5).output(dust, Ledox, 4).output(dust, AwakenedDraconium, 3).output(dust, Enderiiium, 3).output(dust, Infinity, 3).output(dust, NaquadriaticTaranium, 3).output(dust, Amogus, 2)
				.duration(625).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(dust, Infinity, 5).input(dust, Quantium, 3).input(dust, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 2).input(dust, StellarAlloy, 2).input(dust, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 1).input(dust, TastyNeutronium).input(dust, Quantum)
				.output(dust, MultiversalAlloy, 13)
				.duration(4000).EUt(VA[UV]).buildAndRegister();

		CENTRIFUGE_RECIPES.recipeBuilder()
				.input(dust, MultiversalAlloy, 13)
				.output(dust, Infinity, 5).output(dust, Quantium, 3).output(dust, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 2).output(dust, StellarAlloy, 2).output(dust, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 1).output(dust, TastyNeutronium).output(dust, Quantum)
				.duration(1000).EUt(VA[UV]).buildAndRegister();

		MIXER_RECIPES.recipeBuilder()
				.input(STEM_CELLS, 8).input(dust, SolderingAlloy, 4).input(dust, NetherStar, 1)
				.fluidInputs(Iron.getPlasma(144), Nickel.getPlasma(144))
				.output(dust, MutatedLivingSolder, 4)
				.duration(600).EUt(VA[UV]).buildAndRegister();

		CENTRIFUGE_RECIPES.recipeBuilder()
				.input(dust, MutatedLivingSolder, 4)
				.output(STEM_CELLS, 8).output(dust, SolderingAlloy, 4).output(dust, NetherStar, 1)
				.fluidOutputs(Iron.getPlasma(144), Nickel.getPlasma(144))
				.duration(150).EUt(VA[UV]).buildAndRegister();
    }
}