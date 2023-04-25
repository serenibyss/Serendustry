package dandustry.machine;

import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;

public class DandustryRecipeMaps {

    public static final RecipeMap<LaboratoryRecipeBuilder> LABORATORY_RECIPES = new RecipeMapIndustrialLaboratory("industrial_laboratory", 4, 4, 4, 4, false);
    public static final RecipeMap<TranscendentPlasmaMixerRecipeBuilder> PLASMA_MIXER_RECIPES = new RecipeMapTranscendentPlasmaMixer("transcendent_plasma_mixer", 0, 0, 9, 2, false);

    // todo overlays, progress bar, sound, finalize slot counts, etc

    public static void preInit() {
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.ELECTROMAGNETIC_SEPARATOR_RECIPES.setMaxOutputs(6);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxInputs(4);
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9);
        RecipeMaps.MIXER_RECIPES.setMaxFluidInputs(3);
    }
}
