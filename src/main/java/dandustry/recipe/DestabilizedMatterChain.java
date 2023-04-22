package dandustry.recipe;

import gregtech.api.GTValues;
import gregtech.common.metatileentities.MetaTileEntities;

import static dandustry.item.DDMaterials.*;
import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class DestabilizedMatterChain { // Not named "KerrBlackHoleChain" because I intend(ed?) to do other things with these materials
    public static void init() {

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .input(dust, Thaumium)
                .fluidInputs(Magic2.getFluid(1000))
                .fluidOutputs(DestabilizedMatter.getFluid(500))
                .duration(400).EUt(VA[UEV]).buildAndRegister();

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(MagnetoResonatic.getFluid(128)).fluidInputs(Xenoxene.getFluid(32))
                .fluidOutputs(AtomicResonanceCatalyst.getFluid(96))
                .duration(50).EUt(VA[UV]).EUToStart(640_000_000).buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(DestabilizedMatter.getFluid(100), LiquidHelium.getFluid(100))
                .fluidOutputs(DestabilizedMatter.getPlasma(100), Helium.getPlasma(100))
                .blastFurnaceTemp(10800)
                .duration(250).EUt(VA[UEV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, AtomicResonanceCatalyst)
                .fluidInputs(DestabilizedMatter.getPlasma(1000))
                .fluidOutputs(ExoticMatter.getPlasma(500), DarkMatter.getPlasma(250), RedMatter.getPlasma(100))
                .requireInside(MetaTileEntities.CHEMICAL_REACTOR[GTValues.UEV]).requireInside(MetaTileEntities.ELECTROLYZER[GTValues.UEV])
                .duration(1200).EUt(VA[UEV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(ExoticMatter.getPlasma(100))
                .fluidOutputs(ExoticMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(DarkMatter.getPlasma(100))
                .fluidOutputs(DarkMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .notConsumable(dust, AtomicResonanceCatalyst)
                .fluidInputs(RedMatter.getPlasma(100))
                .fluidOutputs(RedMatter.getFluid(100))
                .duration(50).EUt(VA[UV]).buildAndRegister();

        LABORATORY_RECIPES.recipeBuilder()
                .input(dust, RadoxPolymer)
                .fluidInputs(AtomicResonanceCatalyst.getFluid(144), ExoticMatter.getFluid(1000), DarkMatter.getFluid(500), RedMatter.getFluid(200))
                .output(stickLong, KerrBlackHole)
                .fluidOutputs(ExoticMatter.getPlasma(500), DarkMatter.getPlasma(250), RedMatter.getPlasma(100))
                .requireInside(MetaTileEntities.FLUID_SOLIDIFIER[GTValues.UEV])
                .duration(1200).EUt(VA[UIV]).buildAndRegister();
    }
}