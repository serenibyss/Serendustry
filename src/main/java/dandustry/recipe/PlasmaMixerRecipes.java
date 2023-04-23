package dandustry.recipe;

import static dandustry.item.DandustryMaterials.*;
import static dandustry.machine.DandustryRecipeMaps.PLASMA_MIXER_RECIPES;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;

public class PlasmaMixerRecipes {
    public static void init() {

        // Gates Periodicium, which gates OpV circuits. Also gates Ledox and Callisto Ice, OpV materials
        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(Helium.getPlasma(1000),
                        Nitrogen.getPlasma(1000),
                        Oxygen.getPlasma(1000),
                        Argon.getPlasma(1000),
                        Iron.getPlasma(1000),
                        Nickel.getPlasma(1000),
                        Water.getPlasma(1000))
                .fluidOutputs(TransCataCrude.getFluid(1000), TransResidue.getFluid(100))
                .duration(2400).EUt(VA[UXV]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataCrude.getFluid(100),
                        TransResidue.getFluid(15),
                        Water.getPlasma(1500),
                        Hydrogen.getFluid(10000),
                        Oxygen.getFluid(5000))
                .fluidOutputs(CallistoIce.getFluid(288), Water.getFluid(1000))
                .duration(1500).EUt(VA[UIV]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataCrude.getFluid(100),
                        TransResidue.getFluid(15),
                        Lead.getPlasma(2500),
                        Jasper.getFluid(288))
                .fluidOutputs(Ledox.getFluid(288), Lead.getFluid(1500))
                .duration(1500).EUt(VA[UIV]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataCrude.getFluid(100),
                        TransResidue.getFluid(15),
                        Glass.getPlasma(72000),
                        AtomicResonanceCatalyst.getFluid(576),
                        ExoticMatter.getPlasma(1500),
                        DarkMatter.getPlasma(750),
                        RedMatter.getPlasma(300))
                .fluidOutputs(ChromaticGlass.getFluid(2304), Glass.getFluid(24000))
                .duration(1000).EUt(VA[UIV]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataCrude.getFluid(100),
                        TransResidue.getFluid(15),
                        Redstone.getPlasma(72000),
                        AtomicResonanceCatalyst.getFluid(576),
                        ExoticMatter.getPlasma(1500),
                        DarkMatter.getPlasma(760),
                        RedMatter.getPlasma(300))
                .fluidOutputs(OmniversalRedstone.getFluid(2304), Redstone.getFluid(24000))
                .duration(1000).EUt(VA[UIV]).buildAndRegister();

        // Gates Shirabon, which gates OpV components
        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataCrude.getFluid(1000),
                        Periodicium.getPlasma(144),
                        AssemblyLine.getPlasma(144),
                        DestabilizedMatter.getPlasma(1000),
                        ExoticMatter.getPlasma(1000),
                        DarkMatter.getPlasma(1000),
                        RedMatter.getPlasma(1000))
                .fluidOutputs(TransCataExcited.getFluid(1000), TransResidue.getFluid(500))
                .duration(3200).EUt(VA[OpV]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataExcited.getFluid(500),
                        Infinity.getFluid(144),
                        Quantium.getFluid(144),
                        Ledox.getFluid(144),
                        CallistoIce.getFluid(144))
                .fluidOutputs(Shirabon.getFluid(144), TransResidue.getFluid(250))
                .duration(3600).EUt(VA[OpV]).buildAndRegister();

        // Gates Floppa, which gates MAX components and circuits
        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataExcited.getFluid(1000),
                        Shirabon.getPlasma(144),
                        Infinity.getPlasma(144),
                        Periodicium.getPlasma(144),
                        AssemblyLine.getPlasma(144),
                        Iron.getPlasma(1000),
                        Nickel.getPlasma(1000),
                        Water.getPlasma(1000),
                        RedMatter.getPlasma(1000))
                .fluidOutputs(TransCataResplendent.getFluid(1000), TransResidue.getFluid(1000))
                .duration(3600).EUt(VA[MAX]).buildAndRegister();

        PLASMA_MIXER_RECIPES.recipeBuilder()
                .fluidInputs(TransCataResplendent.getFluid(1000),
                        Flerovium.getPlasma(144),
                        Oxygen.getPlasma(1000),
                        Phosphorus.getPlasma(144),
                        Protactinium.getPlasma(144))
                .fluidOutputs(Floppa.getFluid(144), TransResidue.getFluid(1000))
                .duration(4800).EUt((int) V[MAX]).buildAndRegister();
    }
}
