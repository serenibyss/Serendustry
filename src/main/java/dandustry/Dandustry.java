package dandustry;

import dandustry.item.DandustryMaterials;
import dandustry.item.DandustryMetaItems;
import dandustry.machine.DandustryMetaTileEntities;
import dandustry.machine.DandustryRecipeMaps;
import dandustry.recipe.DandustryRecipes;
import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
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

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(ID, path);
    }

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        DandustryRecipeMaps.preInit();
        DandustryMetaItems.preInit();
        DandustryMetaTileEntities.preInit();
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        DandustryMetaItems.registerItems();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        DandustryRecipes.registerRecipes();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        DandustryMaterials.registerMaterials();
    }
}
