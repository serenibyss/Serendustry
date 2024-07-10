package serendustry.recipe;

import static gregtech.api.GTValues.*;
import gregtech.api.recipes.RecipeMaps;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;
import net.minecraft.init.Blocks;
import static serendustry.machine.SerendustryRecipeMaps.LABORATORY_RECIPES;

public class DragonEggRecipes {
    public static void init() {
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Endstone, 64).input(dust, Neutronium, 16)
                .fluidInputs(SterileGrowthMedium.getFluid(2000))
                .output(Blocks.DRAGON_EGG)
                .requireInside(RecipeMaps.CHEMICAL_RECIPES, UV, 1)
                .requireInside(RecipeMaps.CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(3000).EUt(VA[UHV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(Blocks.DRAGON_EGG).input(dust, Oganesson)
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .output(Blocks.DRAGON_EGG, 2)
                .requireInside(RecipeMaps.CHEMICAL_RECIPES, UV, 1)
                .requireInside(RecipeMaps.CHEMICAL_BATH_RECIPES, UV, 1)
                .duration(240).EUt(VA[UHV]).buildAndRegister();

    }
}
