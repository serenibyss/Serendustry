package serendustry;

import gregtech.GTInternalTags;
import gregtech.api.GregTechAPI;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;
import static gregtech.common.items.SerendustryToolItems;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.Entity;
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
import org.apache.logging.log4j.Logger;
import static serendustry.entity.FriendlyCreeperEntity;
import static serendustry.item.SerendustryMetaItems;
import serendustry.item.material.SerendustryMaterials;
import static serendustry.machine.SerendustryMetaTileEntities;
import static serendustry.machine.SerendustryRecipeMaps;
import serendustry.recipe.SerendustryRecipes;

const val MODID = Tags.MODID;
lateinit var logger: Logger

@Mod(modid = Tags.MODID, name = Tags.MODNAME, version = Tags.VERSION,
    dependencies = GTInternalTags.DEP_VERSION_STRING,
    modLanguageAdapter = "serendustry.adapter.KotlinAdapter");
class Serendustry {

    companion object {
        fun ID(path: String) = ResourceLocation(MODID, path);
    }

    @EventHandler
    fun onConstruction(event: FMLConstructionEvent) {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(SerendustryEventHandler());
    }

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog;
        logger.info("Serendustry PreInitialization");
        SerendustryRecipeMaps.preInit();
        SerendustryMetaItems.preInit();
        SerendustryMetaTileEntities.preInit();
        SerendustryToolItems.init();
        if (event.side == Side.CLIENT) {
            RenderingRegistry.registerEntityRenderingHandler(FriendlyCreeperEntity::class.java, ::RenderCreeper);
        }
    }

    @SubscribeEvent
    fun registerItems(event: RegistryEvent.Register<Item>) = SerendustryMetaItems.registerItems()

    @SubscribeEvent
    fun registerRecipes(event: RegistryEvent.Register<IRecipe>) = SerendustryRecipes.registerRecipes()

    @SubscribeEvent
    fun registerMaterialRegistry(event: MaterialRegistryEvent) = GregTechAPI.materialManager.createRegistry(MODID)

    @SubscribeEvent
    fun registerMaterials(event: MaterialEvent) = SerendustryMaterials.registerMaterials()

    @SubscribeEvent
    fun registerEntities(event: RegistryEvent.Register<EntityEntry>) =
        event.registry.register(EntityEntryBuilder.create<Entity>()
            .entity(FriendlyCreeperEntity::class.java)
            .id(ResourceLocation(MODID, "friendly_creeper"), 0)
            .name("$MODID.friendly_creeper")
            .tracker(64, 1, true)
            .build());
}
