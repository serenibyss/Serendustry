package dandustry;

import dandustry.item.DDMaterials;
import dandustry.item.behavior.WasteExtractorBehavior;
import dandustry.recipe.WasteFluidRecipes;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
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

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        items = new StandardMetaItem();
        items.setRegistryName("dandustry_item");
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        wasteFluidExtractor = items.addItem(0, "waste_fluid_extractor").addComponents(new WasteExtractorBehavior()).setMaxStackSize(1);
        wasteFluidExtractorFilled = items.addItem(1, "waste_fluid_extractor_filled").setMaxStackSize(1);
        errorIngot = items.addItem(2, "error_ingot");
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        WasteFluidRecipes.init();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        DDMaterials.init();
    }
}
