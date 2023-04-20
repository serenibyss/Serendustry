package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.BlockWarningSign;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.UnificationEntry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.init.Items;

import java.util.Map;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

import static gregtech.api.recipes.RecipeMaps.FUSION_REACTOR_RECIPES;

public class LargeAlloySmelterRecipes {

    public static void init() {
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Gold.getFluid(128)).fluidInputs(Materials.Duranium.getFluid(128))
                .fluidOutputs(DDMaterials.InfusedGold.getFluid(48))
                .duration(120).EUt(VA[UV]).EUToStart(400_000_000).buildAndRegister();
				
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Aluminium.getFluid(256)).fluidInputs(Materials.Neutronium.getFluid(256))
                .fluidOutputs(DDMaterials.Aluminum.getFluid(48))
                .duration(280).EUt(VA[UV]).EUToStart(900_000_000).buildAndRegister();
				
		FUSION_REACTOR_RECIPES.recipeBuilder()
				.fluidInputs(Materials.Uranium.getFluid(256)).fluidInputs(Materials.Neutronium.getFluid(256))
                .fluidOutputs(DDMaterials.TastyNeutronium.getFluid(48))
                .duration(320).EUt(VA[UV]).EUToStart(900_000_000).buildAndRegister();
    }
}
