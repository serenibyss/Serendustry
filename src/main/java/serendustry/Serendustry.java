package serendustry;

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
import serendustry.item.SerendustryMaterials;
import serendustry.item.SerendustryMetaItems;
import serendustry.machine.SerendustryMetaTileEntities;
import serendustry.machine.SerendustryRecipeMaps;
import serendustry.recipe.SerendustryRecipes;

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION, dependencies = GTValues.MOD_VERSION_DEP)
public class Serendustry {

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(Tags.MODID, path);
    }

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        SerendustryRecipeMaps.preInit();
        SerendustryMetaItems.preInit();
        SerendustryMetaTileEntities.preInit();
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        SerendustryMetaItems.registerItems();
    }

    @SubscribeEvent
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        SerendustryRecipes.registerRecipes();
    }

    @SubscribeEvent
    public void registerMaterials(GregTechAPI.MaterialEvent event) {
        SerendustryMaterials.registerMaterials();
    }
}
