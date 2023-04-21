package dandustry.recipe;

import static dandustry.item.DDMaterials.*;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

import static gregtech.api.recipes.RecipeMaps.ALLOY_SMELTER_RECIPES;

public class SmallFusionReactorRecipes {

    public static void init() {
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Platinum, 3).input(ingot, Aluminium, 1)
                .output(ingot, Platinium, 4)
                .duration(500).EUt(VA[EV]).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Technetium, 22)
                .output(ingot, Technetium22, 1)
                .duration(1100).EUt(VA[IV] + 100).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Vanadium, 1).input(ingot, Tellurium, 1)
				.output(ingot, Rhenium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Zirconium, 1).input(ingot, Chrome, 1)
				.output(ingot, Gadolinium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Titanium, 1).input(ingot, Germanium, 1)
				.output(ingot, Polonium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Vanadium, 1).input(dust, Phosphorus, 1)
				.output(ingot, Strontium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Niobium, 1).input(dust, Calcium, 1)
				.output(ingot, Promethium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Zinc, 1).input(ingot, Aluminium, 1)
				.output(ingot, Technetium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Cobalt, 1).input(ingot, Technetium, 1)
				.output(ingot, Ytterbium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Magnesium, 1).input(ingot, Manganese, 1)
				.output(ingot, Rubidium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Magnesium, 1).input(ingot, Zirconium, 1)
				.output(ingot, Tellurium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Iron, 1).input(ingot, Silicon, 1)
				.output(ingot, Zirconium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Scandium, 1).input(dust, Sodium, 1)
				.output(ingot, Germanium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Boron, 1).input(ingot, Sulfur, 1)
				.output(ingot, Scandium, 1)
				.duration(200).EUt(VA[EV]).buildAndRegister();

		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Yttrium, 1).input(ingot, Neodymium, 1)
                .output(ingot, Einsteinium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Samarium, 1).input(ingot, Strontium, 1)
                .output(ingot, Fermium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Tungsten, 1).input(ingot, Cobalt, 1)
                .output(ingot, Mendelevium, 1)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
		
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Yttrium, 1).input(ingot, Dysprosium, 1)
                .output(ingot, Dubnium, 1)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Promethium, 1).input(ingot, Technetium22, 1)
                .output(ingot, Rutherfordium, 1)
                .duration(500).EUt(VA[ZPM] + 2).buildAndRegister();
				
        ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Osmium, 1).input(ingot, Molybdenum, 1)
                .output(ingot, Oganesson, 1)
                .duration(600).EUt(VA[ZPM] + 3).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Bismuth, 2).input(ingot, Tellurium, 3)
                .output(dust, BismuthTellurite, 5)
                .duration(200).EUt(VA[HV]).buildAndRegister();
    }
}
