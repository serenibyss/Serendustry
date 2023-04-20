package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;

import static gregtech.api.recipes.RecipeMaps.FUSION_REACTOR_RECIPES;

public class LargeAlloySmelterRecipes {

    public static void init() {
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Gold.getFluid(128)).fluidInputs(Materials.Duranium.getFluid(128))
                .fluidOutputs(DDMaterials.InfusedGold.getFluid(48))
                .duration(120).EUt(VA[UV]).EUToStart(400_000_000).buildAndRegister();
				
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Aluminium.getFluid(256)).fluidInputs(Materials.Neutronium.getFluid(256))
                .fluidOutputs(DDMaterials.Aluminum.getFluid(48))
                .duration(280).EUt(VA[UV]).EUToStart(900_000_000).buildAndRegister();
				
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Uranium.getFluid(256)).fluidInputs(Materials.Neutronium.getFluid(256))
                .fluidOutputs(DDMaterials.TastyNeutronium.getFluid(48))
                .duration(320).EUt(VA[UV]).EUToStart(900_000_000).buildAndRegister();
    }
}
