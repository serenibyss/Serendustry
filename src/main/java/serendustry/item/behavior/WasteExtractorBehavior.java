package serendustry.item.behavior;

import gregtech.api.items.metaitem.stats.IItemBehaviour;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import serendustry.item.SerendustryMetaItems;

public class WasteExtractorBehavior implements IItemBehaviour {

    @Override
    public boolean onLeftClickEntity(ItemStack itemStack, EntityPlayer player, Entity entity) {
        if (entity instanceof EntityCow) { // todo just a test?
            player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, SerendustryMetaItems.wasteFluidExtractorFilled.getStackForm());
        }
        // false because this will still apply the "hit"
        return false;
    }
}
