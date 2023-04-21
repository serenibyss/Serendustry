package dandustry.recipe;

import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.IMPLOSION_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

import gregtech.api.GTValues;
import net.minecraft.init.Blocks;

public class DragonEggRecipes {

    public static void init() {
        IMPLOSION_RECIPES.recipeBuilder()
                .input(dust, Endstone, 64).input(dust, Neutronium, 16)
                .output(Blocks.DRAGON_EGG)
                .explosivesAmount(32)
                .duration(1).EUt(GTValues.UHV).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(Blocks.DRAGON_EGG).input(dust, Oganesson)
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .output(Blocks.DRAGON_EGG, 2)
                .duration(1).EUt(GTValues.UHV).buildAndRegister();
    }
}

