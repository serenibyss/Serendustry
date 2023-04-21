package dandustry;

import dandustry.item.DDMaterials;
import dandustry.item.behavior.WasteExtractorBehavior;

import dandustry.machine.DandustryMetaTileEntities;
import dandustry.recipe.*;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.ore.OrePrefix;

import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Dandustry.ID,
        name = "Dandustry",
        version = Dandustry.VERSION,
        dependencies = GTValues.MOD_VERSION_DEP)
public class Dandustry {

    public static final String ID = "dandustry";
    public static final String VERSION = "0.0.1";

    public static MetaItem<?> items;

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

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(ID, path);
    }

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SidedProxy(modId = Dandustry.ID, clientSide = "dandustry.CommonProxy", serverSide = "dandustry.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preLoad();

        items = new StandardMetaItem();
        items.setRegistryName("dandustry_item");

        DandustryMetaTileEntities.init();
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        wasteFluidExtractor = items.addItem(0, "waste_fluid_extractor").addComponents(new WasteExtractorBehavior()).setMaxStackSize(1);
        wasteFluidExtractorFilled = items.addItem(1, "waste_fluid_extractor_filled").setMaxStackSize(1);
        errorIngot = items.addItem(2, "error_ingot");
        MAGNETO_RESONATIC_ULV = items.addItem(3, "magneto_resonatic_ulv").setUnificationData(OrePrefix.circuit, Tier.ULV);
        MAGNETO_RESONATIC_LV = items.addItem(4, "magneto_resonatic_lv").setUnificationData(OrePrefix.circuit, Tier.LV);
        MAGNETO_RESONATIC_MV = items.addItem(5, "magneto_resonatic_mv").setUnificationData(OrePrefix.circuit, Tier.MV);
        MAGNETO_RESONATIC_HV = items.addItem(6, "magneto_resonatic_hv").setUnificationData(OrePrefix.circuit, Tier.HV);
        MAGNETO_RESONATIC_EV = items.addItem(7, "magneto_resonatic_ev").setUnificationData(OrePrefix.circuit, Tier.EV);
        MAGNETO_RESONATIC_IV = items.addItem(8, "magneto_resonatic_iv").setUnificationData(OrePrefix.circuit, Tier.IV);
        MAGNETO_RESONATIC_LuV = items.addItem(9, "magneto_resonatic_luv").setUnificationData(OrePrefix.circuit, Tier.LuV);
        MAGNETO_RESONATIC_ZPM = items.addItem(10, "magneto_resonatic_zpm").setUnificationData(OrePrefix.circuit, Tier.ZPM);
        MAGNETO_RESONATIC_UV = items.addItem(11, "magneto_resonatic_uv").setUnificationData(OrePrefix.circuit, Tier.UV);
        MAGNETO_RESONATIC_UHV = items.addItem(12, "magneto_resonatic_uhv").setUnificationData(OrePrefix.circuit, Tier.UHV);
        MAGNETO_RESONATIC_UEV = items.addItem(13, "magneto_resonatic_uev").setUnificationData(OrePrefix.circuit, Tier.UEV);
        MAGNETO_RESONATIC_UIV = items.addItem(14, "magneto_resonatic_uiv").setUnificationData(OrePrefix.circuit, Tier.UIV);
        MAGNETO_RESONATIC_UXV = items.addItem(15, "magneto_resonatic_uxv").setUnificationData(OrePrefix.circuit, Tier.UXV);
		MAGNETO_RESONATIC_OpV = items.addItem(16, "magneto_resonatic_opv").setUnificationData(OrePrefix.circuit, Tier.OpV);
        MAGNETO_RESONATIC_MAX = items.addItem(17, "magneto_resonatic_max").setUnificationData(OrePrefix.circuit, Tier.MAX);
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
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		AlloyRecipes.init();
        DragonEggRecipes.init();
		HTComponentRecipes.init();
        HTMachineRecipes.init();
		LargeAlloySmelterRecipes.init();
        MagnetoResonaticRecipes.init();
        PlasmaFuels.init();
		SmallFusionReactorRecipes.init();
        WasteFluidRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        DDMaterials.init();
    }
}
