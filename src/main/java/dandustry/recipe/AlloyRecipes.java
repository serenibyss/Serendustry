package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.BlockWarningSign;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.UnificationEntry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.init.Items;

import java.util.Map;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

import static gregtech.api.recipes.RecipeMaps.MIXER_RECIPES;

public class AlloyRecipes {

    public static void init() {
        MIXER_RECIPES.recipeBuilder()
                .input(dust, RoseGold, 1).input(dust, SterlingSilver, 1).input(dust, Electrum, 2).input(dust, InfusedGold, 2).input(dust, Naquadria, 4)
				.fluidInputs(Materials.SolderingAlloy.getFluid(1443))
                .output(dust, FluxedElectrum, 4)
                .duration(1200).EUt(VA[ZPM] + 14).buildAndRegister();

		 MIXER_RECIPES.recipeBuilder()
                .input(dust, Americium, 1).input(dust, Oganesson, 1).input(dust, Uranium, 1).input(dust, Sulfur, 1)
                .output(dust, Amogus, 4)
                .duration(800).EUt(VA[ZPM] + 10).buildAndRegister();
				
		 MIXER_RECIPES.recipeBuilder()
                .input(dust, Niobium, 1)
				.fluidInputs(Materials.Nitrogen.getFluid(1003))
                .output(dust, NiobiumNitride, 2)
                .duration(40).EUt(VA[MV] + 2).buildAndRegister();
		
		 MIXER_RECIPES.recipeBuilder()
                .input(dust, NaquadahAlloy, 10).input(dust, Rhenium, 5).input(dust, Naquadria, 4).input(dust, Gadolinium, 3).input(dust, Polonium, 3).input(dust, Strontium, 2).input(dust, Rutherfordium, 2).input(dust, Fermium, 1)
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
                .input(dust, Zeron100, 8).input(dust, Titanium, 6).input(dust, Naquadria, 4).input(dust, Gadolinium, 3).input(dust, Aluminium, 2).input(dust, Tin, 1).input(dust, Osmiridium, 1)
				.fluidInputs(Materials.Mercury.getFluid(1001))
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
                .input(dust, Inconel792, 8).input(dust, EglinSteel, 5).input(dust, EnrichedNaquadah, 4).input(dust, TungstenSteel, 4).input(dust, Cerium, 3).input(dust, Antimony, 2).input(dust, Platinium, 2).input(dust, Ytterbium, 1)
                .output(dust, Pikyonium, 29)
                .duration(1900).EUt(VA[ZPM]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Nickel, 15).input(dust, Molybdenum, 4).input(dust, Yttrium, 2).input(dust, Chrome, 2).input(dust, Titanium, 2)
                .output(dust, HastelloyN, 25)
                .duration(1200).EUt(VA[EV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, HastelloyN, 8).input(dust, Nickel, 8).input(dust, Aluminum, 6).input(dust, Naquadah, 4).input(dust, Tungsten, 4).input(dust, Samarium, 2).input(dust, Carbon, 2)
				.fluidInputs(Materials.Argon.getFluid(2047))
                .output(dust, Lafium, 36)
                .duration(2400).EUt(VA[UV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
               .input(dust, EnrichedNaquadah, 4).input(dust, Rhodium, 2).input(dust, Ruthenium, 2).input(dust, Rubidium, 2).input(dust, Dubnium, 1).input(dust, Einsteinium, 1)
                .output(dust, EnrichedNaquadahAlloy, 12)
                .duration(500).EUt(VA[ZPM]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Silicon, 5).input(dust, Iron, 1)
				.fluidInputs(Materials.Oxygen.getFluid(10013))
                .output(dust, Prasiolite, 16)
                .duration(600).EUt(VA[HV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, Zirconium, 1)
				.fluidInputs(Materials.Oxygen.getFluid(2005))
                .output(dust, CubicZirconia, 3)
                .duration(113).EUt(VA[HV]).buildAndRegister();
		
		MIXER_RECIPES.recipeBuilder()
                .input(dust, BismuthTellurite, 4).input(dust, Prasiolite, 3).input(dust, CubicZirconia, 1).input(dust, SamariumMagnetic, 1)
                .output(dust, MagnetoResonatic, 9)
                .duration(352).EUt(VA[HV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, TungstenSteel, 12).input(dust, HSSS, 9).input(dust, HSSG, 6).input(dust, Ruridit, 3).input(dust, MagnetoResonatic, 2).input(dust, Plutonium, 1)
                .output(dust, HighDurabilityCompoundSteel, 33)
                .duration(3100).EUt(VA[UV]).buildAndRegister();
				
		MIXER_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic, 3).input(dust, Cinobite, 1).input(dust, Pikyonium, 1).input(dust, Aluminum, 1)
                .output(dust, MagnetoResonaticCinobitePikyoniumAluminum, 6)
                .duration(2400).EUt(VA[UV]).buildAndRegister();
    }
}