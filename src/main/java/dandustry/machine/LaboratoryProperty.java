package dandustry.machine;

import dandustry.machine.LaboratoryProperty.LaboratoryEntry;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.stream.Collectors;

public class LaboratoryProperty extends RecipeProperty<LaboratoryEntry> {

    public static final String KEY = "laboratory_internal";

    private static final Set<ResourceLocation> ALLOWED_MACHINES = new HashSet<>();

    private static LaboratoryProperty INSTANCE;

    protected LaboratoryProperty() {
        super(KEY, LaboratoryEntry.class);
    }

    public static LaboratoryProperty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LaboratoryProperty();
        }
        return INSTANCE;
    }

    // todo display better
    @Override
    public void drawInfo(Minecraft minecraft, int x, int y, int color, Object value) {
        int yOffset = y;
        LaboratoryEntry entry = castValue(value);
        if (entry.getMachines().size() != 0) {
            for (ResourceLocation rl : entry.getMachines()) {
                MetaTileEntity mte = GregTechAPI.MTE_REGISTRY.getObject(rl);
                if (mte != null) {
                    minecraft.fontRenderer.drawString("Machine Required: " + I18n.format(mte.getMetaFullName()), x, yOffset, color);
                    yOffset += 10;
                }
            }
        }
    }

    public static void registerLaboratoryMachine(MetaTileEntity... machines) {
        ALLOWED_MACHINES.addAll(Arrays.stream(machines).filter(Objects::nonNull).map(mte -> mte.metaTileEntityId).collect(Collectors.toList()));
    }

    public static boolean isMachineAllowed(@Nonnull MetaTileEntity machine) {
        return ALLOWED_MACHINES.contains(machine.metaTileEntityId);
    }

    public static class LaboratoryEntry {

        private final Set<ResourceLocation> machines;

        public LaboratoryEntry(MetaTileEntity... machines) {
            this(Arrays.stream(machines).map(mte -> mte.metaTileEntityId).toArray(ResourceLocation[]::new));
        }

        public LaboratoryEntry(ResourceLocation... machines) {
            this.machines = new HashSet<>();
            this.machines.addAll(Arrays.asList(machines));
        }

        public void addMachine(MetaTileEntity machine) {
            machines.add(machine.metaTileEntityId);
        }

        public Set<ResourceLocation> getMachines() {
            return machines;
        }

        public void merge(LaboratoryEntry other) {
            machines.addAll(other.machines);
        }
    }
}
