package dandustry.machine;

import dandustry.machine.LaboratoryProperty.LaboratoryEntry;
import gregtech.api.GregTechAPI;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.recipeproperties.CleanroomProperty;
import gregtech.api.recipes.recipeproperties.RecipeProperty;
import gregtech.api.recipes.recipeproperties.RecipePropertyStorage;
import gregtech.api.util.EnumValidationResult;
import gregtech.api.util.GTLog;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LaboratoryRecipeBuilder extends RecipeBuilder<LaboratoryRecipeBuilder> {

    public LaboratoryRecipeBuilder() {
    }

    public LaboratoryRecipeBuilder(RecipeBuilder<LaboratoryRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    @Override
    public LaboratoryRecipeBuilder copy() {
        return new LaboratoryRecipeBuilder(this);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, @Nullable Object value) {
        if (key.equals(LaboratoryProperty.KEY)) {
            if (value instanceof MetaTileEntity) {
                this.requireInside((MetaTileEntity) value);
            } else if (value instanceof String) {
                this.requireInside(GregTechAPI.MTE_REGISTRY.getObject(new ResourceLocation((String) value)));
            } else {
                return this.applyProperty(CleanroomProperty.getInstance(), value);
            }
        }
        if (key.equals(CleanroomProperty.KEY)) return false; // this should not be in the cleanroom,
        return super.applyProperty(key, value);
    }

    @Override
    public boolean applyProperty(@Nonnull RecipeProperty<?> property, @Nullable Object value) {
        if (property == LaboratoryProperty.getInstance()) {
            if (value == null) {
                if (this.recipePropertyStorage != null) {
                    return this.recipePropertyStorage.remove(property);
                }
            } else {
                if (this.recipePropertyStorage == null) {
                    this.recipePropertyStorage = new RecipePropertyStorage();
                }
                // dont use the default value here as it will log a warning in some cases
                LaboratoryEntry entry = this.recipePropertyStorage.getRecipePropertyValue(LaboratoryProperty.getInstance(), null);
                if (entry == null) {
                    boolean stored = this.recipePropertyStorage.store(LaboratoryProperty.getInstance(), value);
                    if (!stored) {
                        this.recipePropertyStorageErrored = true;
                    }
                    return stored;
                } else entry.merge((LaboratoryEntry) value);
            }
            return true;
        }
        return super.applyProperty(property, value);
    }

    public LaboratoryRecipeBuilder requireInside(MetaTileEntity machine) {
        if (!LaboratoryProperty.isMachineAllowed(machine)) {
            GTLog.logger.error("Invalid machine attempted to be added to Industrial Laboratory Recipe! Machine: {}", machine.metaTileEntityId, new IllegalArgumentException());
            recipeStatus = EnumValidationResult.INVALID;
        }
        this.applyProperty(LaboratoryProperty.getInstance(), new LaboratoryEntry(machine));
        return this;
    }
}
