package serendustry.item.behavior

import gregtech.api.items.metaitem.stats.IItemBehaviour
import net.minecraft.entity.Entity
import net.minecraft.entity.passive.EntityCow
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.inventory.EntityEquipmentSlot
import net.minecraft.item.ItemStack
import serendustry.item.WASTE_FLUID_EXTRACTOR_FILLED

class WasteExtractorBehavior: IItemBehaviour {

    override fun onLeftClickEntity(itemStack: ItemStack?, player: EntityPlayer?, entity: Entity?): Boolean {
        if (entity is EntityCow) { // todo just a test?
            player?.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, WASTE_FLUID_EXTRACTOR_FILLED.getStackForm())
        }
        // false because this will still apply the "hit"
        return false
    }
}
