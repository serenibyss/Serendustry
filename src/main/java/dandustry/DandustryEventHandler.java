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
import gregtech.api.event.HighTierEvent;

@Mod.EventBusSubscriber(modid = Dandustry.ID)

public class DandustryEventHandler {
	@SubscribeEvent
	public static void enableHighTierEvent(HighTierEvent event) {
		event.enableHighTier();
	}
}