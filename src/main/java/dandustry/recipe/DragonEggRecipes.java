package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;
import net.minecraft.init.Blocks;

import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

public class DragonEggRecipes {

    public static void init() {
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Endstone, 64).input(dust, Neutronium, 16)
                .fluidInputs(SterileGrowthMedium.getFluid(2000))
                .output(Blocks.DRAGON_EGG)
                .requireInside(RecipeMaps.CHEMICAL_RECIPES, GTValues.UV, 1)
                .requireInside(RecipeMaps.CHEMICAL_BATH_RECIPES, GTValues.UV, 1)
                .duration(3000).EUt(GTValues.UHV).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(Blocks.DRAGON_EGG).input(dust, Oganesson)
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .output(Blocks.DRAGON_EGG, 2)
                .requireInside(RecipeMaps.CHEMICAL_RECIPES, GTValues.UV, 1)
                .requireInside(RecipeMaps.CHEMICAL_BATH_RECIPES, GTValues.UV, 1)
                .duration(240).EUt(GTValues.UHV).buildAndRegister();
    }
}

