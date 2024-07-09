package gregtech.common.items

import gregtech.api.items.toolitem.*
import gregtech.common.items.tool.BlockRotatingBehavior
import gregtech.common.items.tool.EntityDamageBehavior
import net.minecraft.entity.monster.EntityGolem
import net.minecraft.init.SoundEvents
import serendustry.MODID

object SerendustryToolItems {
    var SKOOKUM_CHOOCHER: IGTTool? = null

    fun init() {
        SKOOKUM_CHOOCHER = ToolItems.register(ItemGTTool.Builder.of(MODID, "skookum_choocher")
            .toolStats { b ->
                b.blockBreaking().crafting().sneakBypassUse().damagePerCraftingAction(2)
                    .attackDamage(1.0f).attackSpeed(-2.8f)
                    .behaviors(BlockRotatingBehavior.INSTANCE, EntityDamageBehavior(2.0f, EntityGolem::class.java))
            }
            .oreDict(ToolOreDict.toolHammer)
            .secondaryOreDicts("craftingToolHardHammer", "toolWrench", "craftingToolWrench")
            .sound(SoundEvents.BLOCK_ANVIL_LAND)
            .toolClasses(ToolClasses.PICKAXE, ToolClasses.HARD_HAMMER, ToolClasses.WRENCH))
    }
}
