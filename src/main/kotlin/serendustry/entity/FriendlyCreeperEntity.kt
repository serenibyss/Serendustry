package serendustry.entity

import com.google.common.collect.ImmutableList
import net.minecraft.entity.SharedMonsterAttributes
import net.minecraft.entity.monster.EntityCreeper
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.world.World
import java.util.Random

class FriendlyCreeperEntity(world: World): EntityCreeper(world) {

    init {
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).baseValue = 100.0
    }

    override fun getCreeperState() = -1

    override fun canBeLeashedTo(player: EntityPlayer) = true

    companion object {

        private val NAMES = ImmutableList.builder<String>()
            .add("Amogus")
            .add("John Cena")
            .add("Floppa")
            .add("idk, Goku")
            .add("Gregory Samsa")
            .add("\"your mother\"")
            .add("ceaseless discharge")
            .add("Robert'); DROP TABLE Users;--")
            .add("Gregory Samsa Buck")
            .add("`.add( )`")
            .add("https://www.youtube.com/watch?v=dQw4w9WgXcQ")
            .add("GEI (Greg Enough Items)")
            .add("Serendustry available today!")
            .add("amognla")
            .add("amorb")
            .add("mongu")
            .add("amgogus")
            .add("flopper")
            .add("horizontal....")
            .add("vertical....")
            .add("GregTech New Horizons")
            .add("GregBlock")
            .add("Samsung Galaxy Note 7")
            .add("MinecraftForge")
            .add("Whos steve jobs")
            .build()

        fun getName(random: Random) = NAMES[random.nextInt(NAMES.size)]
    }
}
