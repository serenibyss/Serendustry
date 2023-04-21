package dandustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;

public class DandustryRecipeMaps {

    public static final RecipeMap<SimpleRecipeBuilder> LABORATORY_RECIPES = new RecipeMap<>("industrial_laboratory", 4, 4, 4, 4, new SimpleRecipeBuilder(), false);
    // todo overlays, progress bar, sound, finalize slot counts, etc
}
