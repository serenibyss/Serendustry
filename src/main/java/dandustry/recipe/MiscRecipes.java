package dandustry.recipe;

import gregtech.api.GTValues;

import static dandustry.item.DandustryMaterials.*;
import static dandustry.item.DandustryMetaItems.QUANTIUM_STAR;
import static dandustry.item.DandustryMetaItems.QUANTUM_ANOMALY;
import static dandustry.machine.DandustryMetaTileEntities.TRANSCENDENT_PLASMA_MIXER;
import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;
import static gregtech.common.metatileentities.MetaTileEntities.HULL;

public class MiscRecipes {

    public static void init() {

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, animalWaste)
                .fluidInputs(DistilledWater.getFluid(50))
                .output(gem, animalWaste)
                .duration(600).EUt(24).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(dust, MagnetoResonatic)
                .fluidInputs(DistilledWater.getFluid(50))
                .output(gem, MagnetoResonatic)
                .duration(600).EUt(24).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, Polytetrafluoroethylene, 15).input(dust, Polyethylene, 3).input(dust, Carbon)
                .fluidInputs(Sodium.getFluid(1000))
                .fluidOutputs(Teflon.getFluid(2880))
                .requireInside(ALLOY_SMELTER_RECIPES, GTValues.EV, 1)
                .requireInside(CHEMICAL_RECIPES, GTValues.EV, 1)
                .duration(600).EUt(VA[IV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Glass, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, ChromaticGlass)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .input(dust, Redstone, 64)
                .input(QUANTUM_ANOMALY)
                .output(dust, OmniversalRedstone)
                .duration(400).EUt(VA[UV]).buildAndRegister();

        BREWING_RECIPES.recipeBuilder()
                .input(dust, OmniversalRedstone)
                .fluidInputs(Xenoxene.getFluid(1000))
                .fluidOutputs(OmniversalLubricant.getFluid(1000))
                .duration(400).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(OmniversalLubricant.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        AUTOCLAVE_RECIPES.recipeBuilder()
                .input(GRAVI_STAR, 8)
                .fluidInputs(Quantium.getFluid(1250))
                .output(QUANTIUM_STAR)
                .duration(1920).EUt(VA[UXV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Infinity.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Infinity.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Periodicium.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Periodicium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Shirabon.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Shirabon.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Flerovium.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Flerovium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Phosphorus.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Phosphorus.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Protactinium.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Protactinium.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Redstone.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Redstone.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Glass.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Glass.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(Lead.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(Lead.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(100).EUt(VA[UHV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(HULL[UXV])
                .input(FIELD_GENERATOR_UXV)
                .input(ROBOT_ARM_UXV, 2)
                .input(ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT, 64)
                .input(plateDense, AwakenedDraconium, 2)
                .input(plateDouble, CrystalMatrix, 8)
                .input(wireGtQuadruple, Bedrockium, 8)
                .fluidInputs(MutatedLivingSolder.getFluid(4608))
                .fluidInputs(OmniversalLubricant.getPlasma(16000))
                .fluidInputs(RadoxPolymer.getFluid(4608))
                .output(TRANSCENDENT_PLASMA_MIXER)
                .duration(1600).EUt(VA[OpV]).buildAndRegister();
    }
}
