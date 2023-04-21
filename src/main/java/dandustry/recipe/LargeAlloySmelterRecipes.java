package dandustry.recipe;

import static dandustry.item.DDMaterials.*;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;

import static gregtech.api.recipes.RecipeMaps.FUSION_RECIPES;

public class LargeAlloySmelterRecipes {

    public static void init() {
		FUSION_RECIPES.recipeBuilder()
				.fluidInputs(Gold.getFluid(128)).fluidInputs(Duranium.getFluid(128))
                .fluidOutputs(InfusedGold.getFluid(64))
                .duration(50).EUt(VA[LuV]).EUToStart(150_000_000).buildAndRegister();
				
		FUSION_RECIPES.recipeBuilder()
				.fluidInputs(Aluminium.getFluid(128)).fluidInputs(Neutronium.getFluid(128))
                .fluidOutputs(Aluminum.getFluid(64))
                .duration(200).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();
				
		FUSION_RECIPES.recipeBuilder()
				.fluidInputs(Uranium238.getFluid(128)).fluidInputs(Neutronium.getFluid(128))
                .fluidOutputs(TastyNeutronium.getFluid(32))
                .duration(320).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

		FUSION_RECIPES.recipeBuilder()
				.fluidInputs(ChargedDraconium.getFluid(128)).fluidInputs(TastyNeutronium.getFluid(128))
				.fluidOutputs(AwakenedDraconium.getFluid(64))
				.duration(360).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

		FUSION_RECIPES.recipeBuilder()
				.fluidInputs(InfinityCatalyst.getFluid(128)).fluidInputs(TastyNeutronium.getFluid(128))
				.fluidOutputs(Infinity.getFluid(32))
				.duration(3600).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();
    }
}
