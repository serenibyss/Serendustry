package dandustry.machine;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import dandustry.machine.LaboratoryProperty.LaboratoryEntry;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.TieredMetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.stream.Collectors;

public class LaboratoryProperty extends RecipeProperty<LaboratoryEntry> {

    public static final String KEY = "laboratory_internal";

    // todo remove
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
        LaboratoryEntry entry = castValue(value);
        if (entry.getMachineTable().size() != 0) {
            minecraft.fontRenderer.drawString("Machines Required:", x, y, color);
            int yOffset = y + 10;
            for (Table.Cell<RecipeMap<?>, Integer, Integer> cell : entry.getMachineTable().cellSet()) {
                RecipeMap<?> map = cell.getRowKey();
                Integer tier = cell.getColumnKey();
                Integer count = cell.getValue();
                minecraft.fontRenderer.drawString(count + "x " + GTValues.VN[tier] + " " + map.getLocalizedName(), x, yOffset, color);
                yOffset += 10;
            }
        }
    }

    // todo remove
    public static void registerLaboratoryMachine(MetaTileEntity... machines) {
        ALLOWED_MACHINES.addAll(Arrays.stream(machines).filter(Objects::nonNull).map(mte -> mte.metaTileEntityId).collect(Collectors.toList()));
    }

    public static boolean isMachineAllowed(@Nonnull MetaTileEntity machine) {
        if (machine instanceof MultiblockControllerBase) return false;
        return machine instanceof TieredMetaTileEntity && machine.getRecipeMap() != null;
    }

    public static class LaboratoryEntry {

        private final Table<RecipeMap<?>, Integer, Integer> machines;

        public LaboratoryEntry(ImmutableTable.Builder<RecipeMap<?>, Integer, Integer> tableBuilder) {
            this.machines = tableBuilder.build();
        }

        public Table<RecipeMap<?>, Integer, Integer> getMachineTable() {
            return machines;
        }
    }
}
