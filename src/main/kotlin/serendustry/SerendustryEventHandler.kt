package serendustry

import gregtech.api.GTValues
import gregtech.api.GregTechAPI
import gregtech.api.event.HighTierEvent
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.Materials.Neutronium
import gregtech.api.unification.material.Materials.VanadiumGallium
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.ore.OrePrefix.*
import gregtech.api.unification.stack.UnificationEntry
import gregtech.loaders.recipe.CraftingComponent
import gregtech.loaders.recipe.CraftingComponent.*
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.util.math.BlockPos
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import net.minecraftforge.fml.relauncher.Side
import serendustry.entity.FriendlyCreeperEntity
import serendustry.item.material.*

class SerendustryEventHandler {

    private var serverTickTimer = 0

    @SubscribeEvent
    fun enableHighTier(event: HighTierEvent) = event.enableHighTier()

    @SubscribeEvent
    fun appendCraftingComponent(event: GregTechAPI.RegisterEvent<CraftingComponent>) {
        // Wires / Cables
        appendToComponent(WIRE_ELECTRIC, wireGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_QUAD, wireGtQuadruple, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_OCT, wireGtOctal, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(WIRE_HEX, wireGtHex, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE, cableGtSingle, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_QUAD, cableGtQuadruple, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_OCT, cableGtOctal, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(GTValues.UEV, CABLE_HEX, cableGtHex, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(CABLE_TIER_UP, wireGtSingle, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Pipes
        appendToComponent(PIPE_NORMAL, pipeNormalFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);
        appendToComponent(PIPE_LARGE, pipeLargeFluid, Cinobite, Lafium, StellarAlloy, ChargedDraconium, CallistoIce);

        // Glass
        appendToComponent(GLASS, block, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass, ChromaticGlass);

        // Plates
        appendToComponent(GTValues.UEV, PLATE, plate, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(GTValues.UEV, DOUBLE_PLATE, plateDouble, HastelloyK243, Enderiiium, AwakenedDraconium, Quantum);
        appendToComponent(HULL_PLATE, plate, Teflon, RadoxPolymer, RadoxPolymer, RadoxPolymer, RadoxPolymer);

        // Rotor
        appendToComponent(ROTOR, rotor, EnrichedNaquadahAlloy, TastyNeutronium, EnderiiumBase, InfinityCatalyst, Quantium);

        // Grinder
        // TODO: More Grinding Head tiers?

        // Sawblade
        appendToComponent(SAWBLADE, toolHeadBuzzSaw, Neutronium, HastelloyK243, StellarAlloy, AwakenedDraconium, Quantum);

        // Coils
        appendToComponent(COIL_HEATING, wireGtDouble, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_HEATING_DOUBLE, wireGtQuadruple, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);
        appendToComponent(COIL_ELECTRIC, wireGtOctal, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Sticks
        appendToComponent(STICK_MAGNETIC, stickLong, TengamAttuned, TengamAttuned, TengamAttuned, KerrBlackHole, KerrBlackHole);
        appendToComponent(GTValues.IV, STICK_ELECTROMAGNETIC, stickLong, VanadiumGallium, VanadiumGallium, VanadiumGallium, VanadiumGallium, TengamAttuned, TengamAttuned, TengamAttuned, KerrBlackHole, KerrBlackHole);
        appendToComponent(STICK_DISTILLATION, spring, Pikyonium, Lafium, Signalium, Bedrockium, Quantium);

        // Not used by base CEu
        //appendToComponent(GTValues.UV, STICK_RADIOACTIVE, stickLong, Tritanium, EnrichedNaquadahAlloy, Actinoids, SuperheavyLAlloy, SuperheavyHAlloy, Periodicium);

        // Reactor Pipe
        appendToComponent(GTValues.UHV, PIPE_REACTOR, pipeTinyFluid, RadoxPolymer);
        appendToComponent(GTValues.UEV, PIPE_REACTOR, pipeSmallFluid, RadoxPolymer);
        appendToComponent(GTValues.UIV, PIPE_REACTOR, pipeNormalFluid, RadoxPolymer);
        appendToComponent(GTValues.UXV, PIPE_REACTOR, pipeLargeFluid, RadoxPolymer);
        appendToComponent(GTValues.OpV, PIPE_REACTOR, pipeHugeFluid, RadoxPolymer);

        // Power Component
        // TODO: Add something past UHPIC?

        // Voltage Coil
        // TODO

        // Spring
        appendToComponent(GTValues.UEV, SPRING, spring, Pikyonium, Lafium, Signalium, Bedrockium, Quantium)
    }

    private fun appendToComponent(component: Component, prefix: OrePrefix, vararg materials: Material) =
        appendToComponent(GTValues.UHV, component, prefix, *materials)

    private fun appendToComponent(startTier: Int, component: Component, prefix: OrePrefix, vararg materials: Material) {
        if (startTier !in 0..GTValues.MAX) return
        val map = mutableMapOf<Int, Any>()
        materials.forEachIndexed { index, material ->
            val tier = (index + startTier).takeUnless { it > GTValues.MAX } ?: return@forEachIndexed
            map[tier] = UnificationEntry(prefix, material)
        }
        component.appendIngredients(map)
    }

    @SubscribeEvent
    fun onTick(event: TickEvent.WorldTickEvent) {
        if (event.phase != TickEvent.Phase.END || event.side != Side.SERVER) {
            return
        }
        if (++serverTickTimer % 10000 == 0) {
            for (player in event.world.playerEntities) {
                if (event.world.rand.nextInt(200) == 0) {
                    for (i in 0..5) {
                        val targetX = player.posX.toInt() + event.world.rand.nextInt(4) - event.world.rand.nextInt(4)
                        val targetY = player.posY.toInt() + event.world.rand.nextInt(4) - event.world.rand.nextInt(4)
                        val targetZ = player.posZ.toInt() + event.world.rand.nextInt(4) - event.world.rand.nextInt(4)
                        if (event.world.isAirBlock(BlockPos(targetX, targetY, targetZ)) && event.world.isAirBlock(BlockPos(targetX, targetY + 1, targetZ))) {
                            val creeper = FriendlyCreeperEntity(event.world)
                            try {
                                creeper.customNameTag = FriendlyCreeperEntity.getName(event.world.rand)
                            } catch (ignored: Exception) {}
                            creeper.playLivingSound()
                            creeper.setLocationAndAngles(
                                targetX.toDouble() + event.world.rand.nextDouble(),
                                targetY.toDouble() + event.world.rand.nextDouble(),
                                targetZ.toDouble() + event.world.rand.nextDouble(),
                                event.world.rand.nextFloat(),
                                event.world.rand.nextFloat())
                            event.world.spawnEntity(creeper)
                            break
                        }
                    }
                }
            }
        }
    }
}
