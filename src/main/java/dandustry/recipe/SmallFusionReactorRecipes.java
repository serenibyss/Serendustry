package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

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
				.input(ingot, Yttrium, 3).input(ingot, Neodymium, 1)
                .output(ingot, Einsteinium, 4)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Samarium, 3).input(ingot, Strontium, 1)
                .output(ingot, Fermium, 4)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Tungsten, 3).input(ingot, Cobalt, 1)
                .output(ingot, Mendelevium, 4)
                .duration(300).EUt(VA[ZPM] + 1).buildAndRegister();
		
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Yttrium, 3).input(ingot, Dysprosium, 1)
                .output(ingot, Dubnium, 4)
                .duration(400).EUt(VA[ZPM] + 2).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Promethium, 3).input(ingot, Technetium22, 1)
                .output(ingot, Rutherfordium, 4)
                .duration(500).EUt(VA[ZPM] + 2).buildAndRegister();
				
        ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Osmium, 3).input(ingot, Molybdenum, 1)
                .output(ingot, Oganesson, 4)
                .duration(600).EUt(VA[ZPM] + 3).buildAndRegister();
				
		ALLOY_SMELTER_RECIPES.recipeBuilder()
				.input(ingot, Bismuth, 3).input(ingot, Tellurium, 1)
                .output(dust, BismuthTellurite, 4)
                .duration(200).EUt(VA[HV]).buildAndRegister();
    }
}
