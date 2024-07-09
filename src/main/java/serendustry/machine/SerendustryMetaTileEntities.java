package serendustry.machine;

import gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import serendustry.Serendustry;

lateinit var INDUSTRIAL_LABORATORY: MetaTileEntityIndustrialLaboratory;
lateinit var TRANSCENDENT_PLASMA_MIXER: MetaTileEntityTranscendentPlasmaMixer;
lateinit var SPACE_ELEVATOR: MetaTileEntitySpaceElevator;

//lateinit var DISSOLUTION_TANK: MetaTileEntityDissolutionTank
//lateinit var INDUSTRIAL_DECANTER: MetaTileEntityIndustrialDecanter
//lateinit var INDUSTRIAL_OXYLATOR: MetaTileEntityIndustrialOxylator
//lateinit var ROTARY_FILTER: MetaTileEntityRotaryFilter
//lateinit var DIGESTER: MetaTileEntityDigester

class SerendustryMetaTileEntities {
    companion object {
        fun preInit() {
            // todo claim an id range
            INDUSTRIAL_LABORATORY = registerMetaTileEntity(4000, MetaTileEntityIndustrialLaboratory(Serendustry.ID("industrial_laboratory")))
            TRANSCENDENT_PLASMA_MIXER = registerMetaTileEntity(4001, MetaTileEntityTranscendentPlasmaMixer(Serendustry.ID("transcendent_plasma_mixer")))
            SPACE_ELEVATOR = registerMetaTileEntity(4002, MetaTileEntitySpaceElevator(Serendustry.ID("space_elevator")))
        }
    }
}
