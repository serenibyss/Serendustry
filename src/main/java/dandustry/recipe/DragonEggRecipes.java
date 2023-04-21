package dandustry.recipe;

import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

import gregtech.api.GTValues;
import net.minecraft.init.Blocks;

public class DragonEggRecipes {

    public static void init() {
        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Endstone, 64).input(dust, Neutronium, 16)
                .fluidInputs(SterileGrowthMedium.getFluid(2000))
                .output(Blocks.DRAGON_EGG)
                .duration(3000).EUt(GTValues.UHV).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(Blocks.DRAGON_EGG).input(dust, Oganesson)
                .fluidInputs(SterileGrowthMedium.getFluid(1000))
                .output(Blocks.DRAGON_EGG, 2)
                .duration(240).EUt(GTValues.UHV).buildAndRegister();
    }
}

