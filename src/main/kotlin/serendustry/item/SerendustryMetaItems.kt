package serendustry.item

import gregtech.api.items.metaitem.MetaItem
import gregtech.api.items.metaitem.StandardMetaItem
import gregtech.api.unification.material.MarkerMaterials
import gregtech.api.unification.ore.OrePrefix
import net.minecraft.item.Item
import serendustry.item.behavior.WasteExtractorBehavior

private lateinit var ITEMS: MetaItem<*>

lateinit var WASTE_FLUID_EXTRACTOR: MetaItem<*>.MetaValueItem
lateinit var WASTE_FLUID_EXTRACTOR_FILLED: MetaItem<*>.MetaValueItem
lateinit var ERROR_INGOT: MetaItem<*>.MetaValueItem

lateinit var MAGNETO_RESONATIC_ULV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_LV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_MV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_HV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_EV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_IV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_LuV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_ZPM: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_UV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_UHV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_UEV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_UIV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_UXV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_OpV: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_MAX: MetaItem<*>.MetaValueItem

lateinit var MAGNETO_RESONATIC_BOULE: MetaItem<*>.MetaValueItem
lateinit var MAGNETO_RESONATIC_WAFER: MetaItem<*>.MetaValueItem
lateinit var RESONANCE_WAFER: MetaItem<*>.MetaValueItem
lateinit var RESONANCE_CHIP: MetaItem<*>.MetaValueItem
lateinit var COSMIC_CIRCUIT_BOARD: MetaItem<*>.MetaValueItem
lateinit var SUPREME_SMD_RESISTOR: MetaItem<*>.MetaValueItem
lateinit var SUPREME_SMD_TRANSISTOR: MetaItem<*>.MetaValueItem
lateinit var SUPREME_SMD_CAPACITOR: MetaItem<*>.MetaValueItem
lateinit var SUPREME_SMD_DIODE: MetaItem<*>.MetaValueItem
lateinit var SUPREME_SMD_INDUCTOR: MetaItem<*>.MetaValueItem
lateinit var QUANTUM_ANOMALY: MetaItem<*>.MetaValueItem
lateinit var QUANTIUM_STAR: MetaItem<*>.MetaValueItem
lateinit var ELECTRIC_MOTOR_MAX: MetaItem<*>.MetaValueItem
lateinit var CONVEYOR_MODULE_MAX: MetaItem<*>.MetaValueItem
lateinit var ELECTRIC_PUMP_MAX: MetaItem<*>.MetaValueItem
lateinit var ELECTRIC_PISTON_MAX: MetaItem<*>.MetaValueItem
lateinit var ROBOT_ARM_MAX: MetaItem<*>.MetaValueItem
lateinit var FIELD_GENERATOR_MAX: MetaItem<*>.MetaValueItem
lateinit var SENSOR_MAX: MetaItem<*>.MetaValueItem
lateinit var EMITTER_MAX: MetaItem<*>.MetaValueItem

class SerendustryMetaItems {

    companion object {

        fun preInit() {
            ITEMS = StandardMetaItem()
            // todo ???
            (ITEMS as? Item)?.setRegistryName("serendustry_item")
        }

        fun registerItems() {
            WASTE_FLUID_EXTRACTOR = ITEMS.addItem(0, "waste_fluid_extractor").addComponents(WasteExtractorBehavior()).setMaxStackSize(1)
            WASTE_FLUID_EXTRACTOR_FILLED = ITEMS.addItem(1, "waste_fluid_extractor_filled").setMaxStackSize(1)
            ERROR_INGOT = ITEMS.addItem(2, "error_ingot")
            MAGNETO_RESONATIC_ULV = ITEMS.addItem(3, "magneto_resonatic_ulv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV)
            MAGNETO_RESONATIC_LV = ITEMS.addItem(4, "magneto_resonatic_lv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LV)
            MAGNETO_RESONATIC_MV = ITEMS.addItem(5, "magneto_resonatic_mv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MV)
            MAGNETO_RESONATIC_HV = ITEMS.addItem(6, "magneto_resonatic_hv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.HV)
            MAGNETO_RESONATIC_EV = ITEMS.addItem(7, "magneto_resonatic_ev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.EV)
            MAGNETO_RESONATIC_IV = ITEMS.addItem(8, "magneto_resonatic_iv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.IV)
            MAGNETO_RESONATIC_LuV = ITEMS.addItem(9, "magneto_resonatic_luv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LuV)
            MAGNETO_RESONATIC_ZPM = ITEMS.addItem(10, "magneto_resonatic_zpm").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM)
            MAGNETO_RESONATIC_UV = ITEMS.addItem(11, "magneto_resonatic_uv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV)
            MAGNETO_RESONATIC_UHV = ITEMS.addItem(12, "magneto_resonatic_uhv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV)
            MAGNETO_RESONATIC_UEV = ITEMS.addItem(13, "magneto_resonatic_uev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV)
            MAGNETO_RESONATIC_UIV = ITEMS.addItem(14, "magneto_resonatic_uiv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV)
            MAGNETO_RESONATIC_UXV = ITEMS.addItem(15, "magneto_resonatic_uxv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV)
            MAGNETO_RESONATIC_OpV = ITEMS.addItem(16, "magneto_resonatic_opv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV)
            MAGNETO_RESONATIC_MAX = ITEMS.addItem(17, "magneto_resonatic_max").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX)
            MAGNETO_RESONATIC_BOULE = ITEMS.addItem(18, "magneto_resonatic_boule")
            MAGNETO_RESONATIC_WAFER = ITEMS.addItem(19, "magneto_resonatic_wafer")
            RESONANCE_WAFER = ITEMS.addItem(20, "resonance_wafer")
            RESONANCE_CHIP = ITEMS.addItem(21, "resonance_chip")
            COSMIC_CIRCUIT_BOARD = ITEMS.addItem(22, "cosmic_circuit_board")
            SUPREME_SMD_RESISTOR = ITEMS.addItem(23, "supreme_smd_resistor")
            SUPREME_SMD_TRANSISTOR = ITEMS.addItem(24, "supreme_smd_transistor")
            SUPREME_SMD_CAPACITOR = ITEMS.addItem(25, "supreme_smd_capacitor")
            SUPREME_SMD_DIODE = ITEMS.addItem(26, "supreme_smd_diode")
            SUPREME_SMD_INDUCTOR = ITEMS.addItem(27, "supreme_smd_inductor")
            QUANTUM_ANOMALY = ITEMS.addItem(28, "quantum_anomaly")
            QUANTIUM_STAR = ITEMS.addItem(29, "quantium_star")
            ELECTRIC_MOTOR_MAX = ITEMS.addItem(30, "electric_motor_max")
            CONVEYOR_MODULE_MAX = ITEMS.addItem(31, "conveyor_module_max")
            ELECTRIC_PUMP_MAX = ITEMS.addItem(32, "electric_pump_max")
            ELECTRIC_PISTON_MAX = ITEMS.addItem(33, "electric_piston_max")
            ROBOT_ARM_MAX = ITEMS.addItem(34, "robot_arm_max")
            FIELD_GENERATOR_MAX = ITEMS.addItem(35, "field_generator_max")
            SENSOR_MAX = ITEMS.addItem(36, "sensor_max")
            EMITTER_MAX = ITEMS.addItem(37, "emitter_max")
        }
    }
}
