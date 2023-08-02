package serendustry.recipe

import gregtech.api.GTValues.*
import gregtech.api.recipes.RecipeMaps.*
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.ore.OrePrefix.*
import gregtech.common.items.MetaItems.*
import gregtech.common.metatileentities.MetaTileEntities.HULL
import serendustry.item.QUANTIUM_STAR
import serendustry.item.QUANTUM_ANOMALY
import serendustry.item.material.*
import serendustry.machine.LABORATORY_RECIPES
import serendustry.machine.TRANSCENDENT_PLASMA_MIXER

internal fun miscRecipes() {
    AUTOCLAVE_RECIPES.recipeBuilder()
        .input(dust, AnimalWaste)
        .fluidInputs(DistilledWater.getFluid(50))
        .output(gem, AnimalWaste)
        .duration(600).EUt(24).buildAndRegister()

    AUTOCLAVE_RECIPES.recipeBuilder()
        .input(dust, MagnetoResonatic)
        .fluidInputs(DistilledWater.getFluid(50))
        .output(gem, MagnetoResonatic)
        .duration(600).EUt(24).buildAndRegister()

    LABORATORY_RECIPES.recipeBuilder()
        .input(dust, Polytetrafluoroethylene, 15).input(dust, Polyethylene, 3).input(dust, Carbon)
        .fluidInputs(Sodium.getFluid(1000))
        .fluidOutputs(Teflon.getFluid(2880))
        .requireInside(ALLOY_SMELTER_RECIPES, EV, 1)
        .requireInside(CHEMICAL_RECIPES, EV, 1)
        .duration(600).EUt(VA[IV]).buildAndRegister()

    LASER_ENGRAVER_RECIPES.recipeBuilder()
        .input(dust, Glass, 64)
        .input(QUANTUM_ANOMALY)
        .output(dust, ChromaticGlass)
        .duration(400).EUt(VA[UV]).buildAndRegister()

    LASER_ENGRAVER_RECIPES.recipeBuilder()
        .input(dust, Redstone, 64)
        .input(QUANTUM_ANOMALY)
        .output(dust, OmniversalRedstone)
        .duration(400).EUt(VA[UV]).buildAndRegister()

    BREWING_RECIPES.recipeBuilder()
        .input(dust, OmniversalRedstone)
        .fluidInputs(Xenoxene.getFluid(1000))
        .fluidOutputs(OmniversalLubricant.getFluid(1000))
        .duration(400).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(OmniversalLubricant.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    AUTOCLAVE_RECIPES.recipeBuilder()
        .input(GRAVI_STAR, 8)
        .fluidInputs(Quantium.getFluid(1250))
        .output(QUANTIUM_STAR)
        .duration(1920).EUt(VA[UXV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Infinity.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Infinity.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Periodicium.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Periodicium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Shirabon.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Shirabon.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Flerovium.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Flerovium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Phosphorus.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Phosphorus.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Protactinium.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Protactinium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Redstone.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Redstone.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Glass.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Glass.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Lead.getFluid(100), LiquidHelium.getFluid(100))
        .fluidOutputs(Lead.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

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
        .duration(1600).EUt(VA[OpV]).buildAndRegister()

    ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
        .input(dust, TengamRaw)
        .chancedOutput(dust, IronMagnetic, 2700,540)
        .chancedOutput(dust, SteelMagnetic, 2000,400)
        .chancedOutput(dust, NeodymiumMagnetic, 1600,320)
        .chancedOutput(dust, SamariumMagnetic, 1400,280)
        .chancedOutput(dust, MagnetoResonatic, 1200,240)
        .chancedOutput(dust, TengamPurified, 1100,220)
        .duration(120).EUt(VA[UV]).buildAndRegister()
}
