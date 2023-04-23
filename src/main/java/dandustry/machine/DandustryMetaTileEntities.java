package dandustry.machine;

import dandustry.Dandustry;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class DandustryMetaTileEntities {

    public static MetaTileEntityIndustrialLaboratory INDUSTRIAL_LABORATORY;
    public static MetaTileEntityTranscendentPlasmaMixer TRANSCENDENT_PLASMA_MIXER;

    public static void preInit() {
        // todo claim an id range
        INDUSTRIAL_LABORATORY = registerMetaTileEntity(4000, new MetaTileEntityIndustrialLaboratory(Dandustry.ID("industrial_laboratory")));
        TRANSCENDENT_PLASMA_MIXER = registerMetaTileEntity(4001, new MetaTileEntityTranscendentPlasmaMixer(Dandustry.ID("transcendent_plasma_mixer")));
    }
}
