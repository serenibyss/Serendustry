package serendustry.recipe

import gregtech.api.GTValues.*
import gregtech.api.fluids.store.FluidStorageKeys
import gregtech.api.recipes.ModHandler
import gregtech.api.recipes.RecipeMaps.*
import gregtech.api.recipes.chance.output.ChancedOutputLogic
import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.material.MarkerMaterials
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.ore.OrePrefix.*
import gregtech.api.unification.stack.UnificationEntry
import gregtech.common.items.MetaItems.*
import gregtech.common.metatileentities.MetaTileEntities.HULL
import net.minecraft.init.Blocks
import serendustry.item.HOT_WOOD_INGOT
import serendustry.item.QUANTIUM_STAR
import serendustry.item.QUANTUM_ANOMALY
import serendustry.item.material.*
import serendustry.machine.INDUSTRIAL_LABORATORY
import serendustry.machine.LABORATORY_RECIPES
import serendustry.machine.TRANSCENDENT_PLASMA_MIXER

internal fun miscRecipes() {

    AUTOCLAVE_RECIPES.recipeBuilder()
        .input(dust, MagnetoResonatic)
        .fluidInputs(DistilledWater.getFluid(50))
        .output(gem, MagnetoResonatic)
        .duration(600).EUt(24).buildAndRegister()

    ASSEMBLER_RECIPES.recipeBuilder()
        .input(HULL[EV])
        .input(circuit, MarkerMaterials.Tier.EV, 4)
        .input(circuit, MarkerMaterials.Tier.HV, 8)
        .input(gear, Titanium, 4)
        .input(stickLong, Rhopalthenit, 12)
        .input(foil, Polytetrafluoroethylene, 32)
        .input(wireFine, Niobium, 32)
        .fluidInputs(SolderingAlloy.getFluid(2592))
        .output(INDUSTRIAL_LABORATORY)
        .duration(2400).EUt(VA[EV]).buildAndRegister()

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
        .fluidInputs(OmniversalLubricant.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(OmniversalLubricant.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    AUTOCLAVE_RECIPES.recipeBuilder()
        .input(GRAVI_STAR, 8)
        .fluidInputs(Quantium.getFluid(1250))
        .output(QUANTIUM_STAR)
        .duration(1920).EUt(VA[UXV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Infinity.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Infinity.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Periodicium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Periodicium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Shirabon.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Shirabon.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Flerovium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Flerovium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Phosphorus.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Phosphorus.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Protactinium.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Protactinium.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Redstone.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Redstone.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Glass.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Glass.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    BLAST_RECIPES.recipeBuilder()
        .fluidInputs(Lead.getFluid(100), Helium.getFluid(FluidStorageKeys.LIQUID, 100))
        .fluidOutputs(Lead.getPlasma(100), Helium.getPlasma(100))
        .blastFurnaceTemp(10800)
        .duration(100).EUt(VA[UHV]).buildAndRegister()

    ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
        .input(dust, TengamRaw)
        .chancedOutput(dust, IronMagnetic, 2700,0)
        .chancedOutput(dust, SteelMagnetic, 2000,0)
        .chancedOutput(dust, NeodymiumMagnetic, 1600,0)
        .chancedOutput(dust, SamariumMagnetic, 1400,0)
        .chancedOutput(dust, MagnetoResonatic, 1200,0)
        .chancedOutput(dust, TengamPurified, 1100,0)
        .chancedOutputLogic(ChancedOutputLogic.XOR)
        .duration(120).EUt(VA[UV]).buildAndRegister()

    ModHandler.addSmeltingRecipe(OreDictUnifier.get(nugget, Neutronium), OreDictUnifier.get(nugget, WroughtNeutronium))

    // todo: hot wood ingot
    /*VACUUM_RECIPES.recipeBuilder()
        .input(HOT_WOOD_INGOT)
        .duration(65535).EUt(MAX).buildAndRegister()*/
}
