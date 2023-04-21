package dandustry;

import gregtech.api.event.HighTierEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Dandustry.ID)
public class DandustryEventHandler {
	@SubscribeEvent
	public static void enableHighTierEvent(HighTierEvent event) {
		event.enableHighTier();
	}
}