package serendustry

import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import gregtech.api.GTValues
import gregtech.api.recipes.RecipeMap
import net.minecraft.item.ItemStack

private val mapTierToMachineStack: Table<RecipeMap<*>, Int, ItemStack> = HashBasedTable.create()

fun getMachineStack(map: RecipeMap<*>, tier: Int?, count: Int?): ItemStack? {
    if (tier !in 0..GTValues.MAX) return ItemStack.EMPTY
    val stack = mapTierToMachineStack.get(map, tier)?.copy() ?: return ItemStack.EMPTY
    return stack.also { it.count = count ?: 1 }
}
