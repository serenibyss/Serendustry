package serendustry;

import gregtech.GTInternalTags;
import gregtech.api.GregTechAPI;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import serendustry.entity.FriendlyCreeperEntity;
import serendustry.item.SerendustryMaterials;
import serendustry.item.SerendustryMetaItems;
import serendustry.machine.SerendustryMetaTileEntities;
import serendustry.machine.SerendustryRecipeMaps;
import serendustry.recipe.SerendustryRecipes;

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION, dependencies = GTInternalTags.DEP_VERSION_STRING)
public class Serendustry {

    public static final String MODID = Tags.MODID;

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
        if (event.getSide() == Side.CLIENT) {
            RenderingRegistry.registerEntityRenderingHandler(FriendlyCreeperEntity.class, RenderCreeper::new);
        }
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

    @SubscribeEvent
    public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.create()
                .entity(FriendlyCreeperEntity.class)
                .id(new ResourceLocation(Serendustry.MODID, "friendly_creeper"), 0)
                .name(Serendustry.MODID + "." + "friendly_creeper")
                .tracker(64, 1, true)
                .build());
    }
}
