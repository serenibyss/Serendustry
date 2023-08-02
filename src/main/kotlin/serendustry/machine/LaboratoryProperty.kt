package serendustry.machine

import com.google.common.collect.ImmutableTable
import com.google.common.collect.Table
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.TieredMetaTileEntity
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.recipeproperties.RecipeProperty
import gregtech.client.renderer.handler.TerminalARRenderer
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.Gui
import net.minecraft.client.renderer.GlStateManager
import net.minecraft.client.renderer.RenderHelper
import net.minecraft.client.resources.I18n
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.client.config.GuiUtils
import serendustry.getMachineStack
import serendustry.machine.LaboratoryProperty.LaboratoryEntry
import java.util.*
import java.util.stream.Collectors
import javax.annotation.Nonnull


class LaboratoryProperty private constructor(): RecipeProperty<LaboratoryEntry>(KEY, LaboratoryEntry::class.java) {
    companion object {

        const val KEY = "laboratory_internal"

        private val ALLOWED_MACHINES = HashSet<ResourceLocation>()

        private var instance: LaboratoryProperty? = null

        fun getInstance() = instance ?: LaboratoryProperty().also { instance = it }

        // todo remove
        fun registerLaboratoryMachine(vararg machines: MetaTileEntity) =
            ALLOWED_MACHINES.addAll(Arrays.stream(machines).filter(Objects::nonNull).map { mte -> mte.metaTileEntityId }
                .collect(Collectors.toList()))

        fun isMachineAllowed(@Nonnull machine: MetaTileEntity) =
            if (machine is MultiblockControllerBase) false else machine is TieredMetaTileEntity && machine.getRecipeMap() != null
    }


    override fun drawInfo(minecraft: Minecraft, x: Int, y: Int, color: Int, value: Any, mouseX: Int, mouseY: Int) {
        val entry = castValue(value)
        if (entry.getMachineTable().size() != 0) {
            minecraft.fontRenderer.drawString(
                I18n.format("serendustry.machine.industrial_laboratory.jei_header"),
                TerminalARRenderer.x,
                TerminalARRenderer.y,
                color
            )
            TerminalARRenderer.y += 10
            var xOffset = TerminalARRenderer.x
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
                    itemRender.renderItemAndEffectIntoGUI(renderStack, xOffset, TerminalARRenderer.y)
                    itemRender.renderItemOverlayIntoGUI(
                        minecraft.fontRenderer,
                        renderStack,
                        xOffset,
                        TerminalARRenderer.y,
                        null
                    )
                    GlStateManager.enableAlpha()
                    GlStateManager.popMatrix()
                    RenderHelper.disableStandardItemLighting()
                    if (mouseX >= TerminalARRenderer.x + xOffset && mouseY >= TerminalARRenderer.y && TerminalARRenderer.x + 16 > mouseX && TerminalARRenderer.y + 16 > mouseY) {
                        GlStateManager.disableDepth()
                        GlStateManager.colorMask(true, true, true, false)
                        Gui.drawRect(
                            TerminalARRenderer.x + xOffset,
                            TerminalARRenderer.y,
                            TerminalARRenderer.x + xOffset + 16,
                            TerminalARRenderer.y + 16,
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

    override fun drawInfo(p0: Minecraft?, p1: Int, p2: Int, p3: Int, p4: Any?) {}

    class LaboratoryEntry(tableBuilder: ImmutableTable.Builder<RecipeMap<*>, Int, Int>) {

        private var machines: Table<RecipeMap<*>, Int, Int>

        init {
            machines = tableBuilder.build()
        }

        fun getMachineTable() = machines
    }
}
