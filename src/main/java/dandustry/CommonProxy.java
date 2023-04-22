package dandustry;

import gregtech.api.recipes.RecipeMaps;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class CommonProxy {
    public void preLoad() {
        // TODO: I was told that a CommonProxy was needed to do this, but apparently this is false. Remove this file and put this stuff elsewhere
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9);
        RecipeMaps.CENTRIFUGE_RECIPES.setMaxOutputs(9);
        RecipeMaps.BLAST_RECIPES.setMaxFluidInputs(2);
        RecipeMaps.BLAST_RECIPES.setMaxFluidOutputs(2);
        RecipeMaps.LASER_ENGRAVER_RECIPES.setMaxInputs(4);
    }
}