package serendustry.machine;

import serendustry.Serendustry;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

public class SerendustryMetaTileEntities {

    public static MetaTileEntityIndustrialLaboratory INDUSTRIAL_LABORATORY;
    public static MetaTileEntityTranscendentPlasmaMixer TRANSCENDENT_PLASMA_MIXER;

    //public static MetaTileEntityDissolutionTank DISSOLUTION_TANK;
    //public static MetaTileEntityIndustrialDecanter INDUSTRIAL_DECANTER;
    //public static MetaTileEntityIndustrialOxylator INDUSTRIAL_OXYLATOR;
    //public static MetaTileEntityRotaryFilter ROTARY_FILTER;
    //public static MetaTileEntityDigester DIGESTER;

    public static void preInit() {
        // todo claim an id range
        INDUSTRIAL_LABORATORY = registerMetaTileEntity(4000, new MetaTileEntityIndustrialLaboratory(
                Serendustry.ID("industrial_laboratory")));
        TRANSCENDENT_PLASMA_MIXER = registerMetaTileEntity(4001, new MetaTileEntityTranscendentPlasmaMixer(
                Serendustry.ID("transcendent_plasma_mixer")));
    }
}
