package serendustry.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;

public class FriendlyCreeperEntity extends EntityCreeper {

    private static final List<String> names = ImmutableList.<String>builder()
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
            .build();

    public FriendlyCreeperEntity(World worldIn) {
        super(worldIn);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
    }

    @Override
    public int getCreeperState() {
        return -1;
    }

    @Override
    public boolean canBeLeashedTo(@NotNull EntityPlayer player) {
        return true;
    }

    public static String getName(Random random) {
        return names.get(random.nextInt(names.size()));
    }
}
