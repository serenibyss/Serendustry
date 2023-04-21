package dandustry.machine;

import gregtech.api.recipes.RecipeMap;

public class DandustryRecipeMaps {

    public static final RecipeMap<LaboratoryRecipeBuilder> LABORATORY_RECIPES = new RecipeMap<>("industrial_laboratory", 4, 4, 4, 4, new LaboratoryRecipeBuilder(), false);
    // todo overlays, progress bar, sound, finalize slot counts, etc
}
