package dandustry;

import gregtech.api.recipes.RecipeMaps;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class CommonProxy {
    public void preLoad() {
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
    }
}