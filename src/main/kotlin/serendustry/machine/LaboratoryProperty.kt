package serendustry.machine

import com.google.common.collect.HashBasedTable
import com.google.common.collect.ImmutableTable
import com.google.common.collect.Table
import gregtech.api.GTValues
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.TieredMetaTileEntity
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.recipeproperties.RecipeProperty
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.Gui
import net.minecraft.client.renderer.GlStateManager
import net.minecraft.client.renderer.RenderHelper
import net.minecraft.client.resources.I18n
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.client.config.GuiUtils
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import org.jetbrains.annotations.NotNull
import serendustry.machine.LaboratoryProperty.LaboratoryEntry

class LaboratoryProperty private constructor(): RecipeProperty<LaboratoryEntry>(KEY, LaboratoryEntry::class.java) {
    companion object {

        const val KEY = "laboratory_internal"

        val instance: LaboratoryProperty by lazy { LaboratoryProperty() }

        fun isMachineAllowed(@NotNull machine: MetaTileEntity) =
            if (machine is MultiblockControllerBase) false else machine is TieredMetaTileEntity && machine.getRecipeMap() != null

        private val mapTierToMachineStack: Table<RecipeMap<*>, Int, ItemStack> = HashBasedTable.create()

        fun getMachineStack(map: RecipeMap<*>, tier: Int?, count: Int?): ItemStack? {
            if (tier !in 0..GTValues.MAX) return ItemStack.EMPTY
            val stack = mapTierToMachineStack.get(map, tier)?.copy() ?: return ItemStack.EMPTY
            return stack.also { it.count = count ?: 1 }
        }
    }

    @SideOnly(Side.CLIENT)
    override fun drawInfo(minecraft: Minecraft, x: Int, y: Int, color: Int, value: Any, mouseX: Int, mouseY: Int) {
        val entry = castValue(value)
        if (entry.getMachineTable().size() != 0) {
            minecraft.fontRenderer.drawString(
                I18n.format("serendustry.machine.industrial_laboratory.jei_header"),
                x,
                y,
                color
            )
            val y = y + 10
            var xOffset = x
            for (cell in entry.getMachineTable().cellSet()) {
                val map = cell.rowKey ?: continue
                val tier = cell.columnKey
                val count = cell.value
                val renderStack: ItemStack = getMachineStack(map, tier, count) ?: ItemStack.EMPTY
                if (!renderStack.isEmpty) {
                    GlStateManager.enableBlend()
                    GlStateManager.enableDepth()
                    GlStateManager.disableRescaleNormal()
                    GlStateManager.disableLighting()
                    RenderHelper.disableStandardItemLighting()
                    RenderHelper.enableStandardItemLighting()
                    RenderHelper.enableGUIStandardItemLighting()
                    GlStateManager.pushMatrix()
                    val itemRender = minecraft.renderItem
                    itemRender.renderItemAndEffectIntoGUI(renderStack, xOffset, y)
                    itemRender.renderItemOverlayIntoGUI(
                        minecraft.fontRenderer,
                        renderStack,
                        xOffset,
                        y,
                        null
                    )
                    GlStateManager.enableAlpha()
                    GlStateManager.popMatrix()
                    RenderHelper.disableStandardItemLighting()
                    if (mouseX >= x + xOffset && mouseY >= y && x + 16 > mouseX && y + 16 > mouseY) {
                        GlStateManager.disableDepth()
                        GlStateManager.colorMask(true, true, true, false)
                        Gui.drawRect(
                            x + xOffset,
                            y,
                            x + xOffset + 16,
                            y + 16,
                            -2130706433
                        )
                        GlStateManager.color(1f, 1f, 1f, 1f)
                        GlStateManager.enableBlend()
                        GlStateManager.colorMask(true, true, true, true)
                        GlStateManager.enableDepth()
                        val tooltip = renderStack.getTooltip(minecraft.player, ITooltipFlag.TooltipFlags.NORMAL)
                        if (tooltip.isNotEmpty() && minecraft.currentScreen != null) {
                            GuiUtils.drawHoveringText(
                                renderStack,
                                tooltip,
                                mouseX,
                                mouseY,
                                minecraft.currentScreen!!.width,
                                minecraft.currentScreen!!.height,
                                -1,
                                minecraft.fontRenderer
                            )
                            GlStateManager.disableLighting()
                        }
                    }
                    xOffset += 18
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    override fun drawInfo(p0: Minecraft?, p1: Int, p2: Int, p3: Int, p4: Any?) {}

    data class LaboratoryEntry(private val tableBuilder: ImmutableTable.Builder<RecipeMap<*>, Int, Int>) {

        private var machines: Table<RecipeMap<*>, Int, Int> = tableBuilder.build()

        fun getMachineTable() = machines
    }
}
