package dandustry.item;

import dandustry.item.behavior.WasteExtractorBehavior;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;

public class DandustryMetaItems {

    private static MetaItem<?> items;

    public static MetaItem<?>.MetaValueItem wasteFluidExtractor;
    public static MetaItem<?>.MetaValueItem wasteFluidExtractorFilled;
    public static MetaItem<?>.MetaValueItem errorIngot;

    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_ULV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_LV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_MV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_HV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_EV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_IV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_LuV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_ZPM;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UHV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UEV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UIV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_UXV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_OpV;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_MAX;

    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_BOULE;
    public static MetaItem<?>.MetaValueItem MAGNETO_RESONATIC_WAFER;
    public static MetaItem<?>.MetaValueItem RESONANCE_WAFER;
    public static MetaItem<?>.MetaValueItem RESONANCE_CHIP;
    public static MetaItem<?>.MetaValueItem COSMIC_CIRCUIT_BOARD;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_RESISTOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_DIODE;
    public static MetaItem<?>.MetaValueItem SUPREME_SMD_INDUCTOR;
    public static MetaItem<?>.MetaValueItem QUANTUM_ANOMALY;
    public static MetaItem<?>.MetaValueItem QUANTIUM_STAR;
    public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_MAX;
    public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_MAX;
    public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_MAX;
    public static MetaItem<?>.MetaValueItem ROBOT_ARM_MAX;
    public static MetaItem<?>.MetaValueItem FIELD_GENERATOR_MAX;
    public static MetaItem<?>.MetaValueItem SENSOR_MAX;
    public static MetaItem<?>.MetaValueItem EMITTER_MAX;

    public static void preInit() {
        items = new StandardMetaItem();
        items.setRegistryName("dandustry_item");
    }

    public static void registerItems() {
        wasteFluidExtractor = items.addItem(0, "waste_fluid_extractor").addComponents(new WasteExtractorBehavior()).setMaxStackSize(1);
        wasteFluidExtractorFilled = items.addItem(1, "waste_fluid_extractor_filled").setMaxStackSize(1);
        errorIngot = items.addItem(2, "error_ingot");
        MAGNETO_RESONATIC_ULV = items.addItem(3, "magneto_resonatic_ulv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ULV);
        MAGNETO_RESONATIC_LV = items.addItem(4, "magneto_resonatic_lv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LV);
        MAGNETO_RESONATIC_MV = items.addItem(5, "magneto_resonatic_mv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MV);
        MAGNETO_RESONATIC_HV = items.addItem(6, "magneto_resonatic_hv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.HV);
        MAGNETO_RESONATIC_EV = items.addItem(7, "magneto_resonatic_ev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.EV);
        MAGNETO_RESONATIC_IV = items.addItem(8, "magneto_resonatic_iv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.IV);
        MAGNETO_RESONATIC_LuV = items.addItem(9, "magneto_resonatic_luv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.LuV);
        MAGNETO_RESONATIC_ZPM = items.addItem(10, "magneto_resonatic_zpm").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        MAGNETO_RESONATIC_UV = items.addItem(11, "magneto_resonatic_uv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        MAGNETO_RESONATIC_UHV = items.addItem(12, "magneto_resonatic_uhv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        MAGNETO_RESONATIC_UEV = items.addItem(13, "magneto_resonatic_uev").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        MAGNETO_RESONATIC_UIV = items.addItem(14, "magneto_resonatic_uiv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        MAGNETO_RESONATIC_UXV = items.addItem(15, "magneto_resonatic_uxv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        MAGNETO_RESONATIC_OpV = items.addItem(16, "magneto_resonatic_opv").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        MAGNETO_RESONATIC_MAX = items.addItem(17, "magneto_resonatic_max").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);
        MAGNETO_RESONATIC_BOULE = items.addItem(18, "magneto_resonatic_boule");
        MAGNETO_RESONATIC_WAFER = items.addItem(19, "magneto_resonatic_wafer");
        RESONANCE_WAFER = items.addItem(20, "resonance_wafer");
        RESONANCE_CHIP = items.addItem(21, "resonance_chip");
        COSMIC_CIRCUIT_BOARD = items.addItem(22, "cosmic_circuit_board");
        SUPREME_SMD_RESISTOR = items.addItem(23, "supreme_smd_resistor");
        SUPREME_SMD_TRANSISTOR = items.addItem(24, "supreme_smd_transistor");
        SUPREME_SMD_CAPACITOR = items.addItem(25, "supreme_smd_capacitor");
        SUPREME_SMD_DIODE = items.addItem(26, "supreme_smd_diode");
        SUPREME_SMD_INDUCTOR = items.addItem(27, "supreme_smd_inductor");
        QUANTUM_ANOMALY = items.addItem(28, "quantum_anomaly");
        QUANTIUM_STAR = items.addItem(29, "quantium_star");
        ELECTRIC_MOTOR_MAX = items.addItem(30, "electric_motor_max");
        CONVEYOR_MODULE_MAX = items.addItem(31, "conveyor_module_max");
        ELECTRIC_PUMP_MAX = items.addItem(32, "electric_pump_max");
        ELECTRIC_PISTON_MAX = items.addItem(33, "electric_piston_max");
        ROBOT_ARM_MAX = items.addItem(34, "robot_arm_max");
        FIELD_GENERATOR_MAX = items.addItem(35, "field_generator_max");
        SENSOR_MAX = items.addItem(36, "sensor_max");
        EMITTER_MAX = items.addItem(37, "emitter_max");
    }
}
