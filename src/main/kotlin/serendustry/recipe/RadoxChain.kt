package serendustry.recipe

import gregtech.api.GTValues.*
import gregtech.api.recipes.RecipeMaps.*
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.ore.OrePrefix.dust
import serendustry.item.material.*
import serendustry.machine.LABORATORY_RECIPES

internal fun radoxChain() {

    CHEMICAL_RECIPES.recipeBuilder()
        .input(dust, Iridium, 16)
        .input(dust, Osmium, 16)
        .fluidInputs(Oil.getFluid(1000))
        .fluidOutputs(Xenoxene.getFluid(250))
        .duration(80).EUt(VA[UV]).buildAndRegister()

    DISTILLERY_RECIPES.recipeBuilder()
        .input(dust, Naquadria, 4)
        .fluidInputs(Xenoxene.getFluid(1000))
        .fluidOutputs(RawRadox.getFluid(1000))
        .duration(320).EUt(VA[UV]).buildAndRegister()

    DISTILLATION_RECIPES.recipeBuilder()
        .fluidInputs(RawRadox.getFluid(5000))
        .output(dust, NetherStar)
        .fluidOutputs(Xenoxene.getFluid(100),
            LightRadox.getFluid(1000),
            HeavyRadox.getFluid(500),
            FermentedBiomass.getFluid(200),
            Biomass.getFluid(200),
            OilLight.getFluid(400),
            OilHeavy.getFluid(200),
            DistilledWater.getFluid(500),
            Water.getPlasma(50))
        .duration(1600).EUt(VA[UV]).buildAndRegister()

    CRACKING_RECIPES.recipeBuilder()
        .fluidInputs(LightRadox.getFluid(100), Iron.getPlasma(25))
        .fluidOutputs(CrackedLightRadox.getFluid(100))
        .duration(160).EUt(VA[UV]).buildAndRegister()

    CRACKING_RECIPES.recipeBuilder()
        .fluidInputs(HeavyRadox.getFluid(100), Nickel.getPlasma(25))
        .fluidOutputs(CrackedHeavyRadox.getFluid(100))
        .duration(320).EUt(VA[UV]).buildAndRegister()

    DISTILLATION_RECIPES.recipeBuilder()
        .fluidInputs(CrackedLightRadox.getFluid(1000))
        .output(dust, TinAlloy)
        .fluidOutputs(PurifiedRadox.getFluid(100), RawRadox.getFluid(900))
        .duration(1600).EUt(VA[UV]).buildAndRegister()

    DISTILLATION_RECIPES.recipeBuilder()
        .fluidInputs(CrackedHeavyRadox.getFluid(1000))
        .output(dust, RealCupronickel)
        .fluidOutputs(PurifiedRadox.getFluid(250), RawRadox.getFluid(750))
        .duration(3200).EUt(VA[UV]).buildAndRegister()

    LABORATORY_RECIPES.recipeBuilder()
        .input(dust, Amogus, 4).input(dust, TinAlloy, 4)
        .fluidInputs(PurifiedRadox.getFluid(144), Argon.getPlasma(500))
        .fluidOutputs(RadoxPolymer.getFluid(144))
        .requireInside(CHEMICAL_RECIPES, UV, 1)
        .requireInside(CHEMICAL_BATH_RECIPES, UV, 1)
        .duration(1600).EUt(VA[UV]).buildAndRegister()
}
