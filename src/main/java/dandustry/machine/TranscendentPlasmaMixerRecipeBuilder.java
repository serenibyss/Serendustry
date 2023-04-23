package dandustry.machine;

import gregtech.api.recipes.RecipeBuilder;

public class TranscendentPlasmaMixerRecipeBuilder extends RecipeBuilder<TranscendentPlasmaMixerRecipeBuilder> {

    public TranscendentPlasmaMixerRecipeBuilder() {
    }

    public TranscendentPlasmaMixerRecipeBuilder(RecipeBuilder<TranscendentPlasmaMixerRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    @Override
    public TranscendentPlasmaMixerRecipeBuilder copy() {
        return new TranscendentPlasmaMixerRecipeBuilder(this);
    }

    @Override
    public void buildAndRegister() {
        super.buildAndRegister();
    }
}
