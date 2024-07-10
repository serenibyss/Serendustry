package serendustry.item;

import gregtech.api.items.toolitem.*;
import gregtech.common.items.ToolItems;
import gregtech.common.items.tool.BlockRotatingBehavior;
import gregtech.common.items.tool.EntityDamageBehavior;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.init.SoundEvents;
import org.jetbrains.annotations.Nullable;
import serendustry.Serendustry;

public class SerendustryToolItems {
    public static IGTTool SKOOKUM_CHOOCHER;

    public static void init() {
        SKOOKUM_CHOOCHER = ToolItems.register(ItemGTTool.Builder.of(Serendustry.MODID, "skookum_choocher")
            .toolStats(b -> {
                return b.blockBreaking().crafting().sneakBypassUse().damagePerCraftingAction(2)
                    .attackDamage(1.0f).attackSpeed(-2.8f)
                    .behaviors(BlockRotatingBehavior.INSTANCE, new EntityDamageBehavior(2.0f, EntityGolem.class));
            })
            .oreDict(ToolOreDict.toolHammer)
            .secondaryOreDicts("craftingToolHardHammer", "toolWrench", "craftingToolWrench")
            .sound(SoundEvents.BLOCK_ANVIL_LAND)
            .toolClasses(ToolClasses.PICKAXE, ToolClasses.HARD_HAMMER, ToolClasses.WRENCH));
    }
}
