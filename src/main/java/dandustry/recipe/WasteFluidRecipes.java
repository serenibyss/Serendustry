package dandustry.recipe;

import dandustry.Dandustry;
import dandustry.item.DDMaterials;
import gregtech.api.GTValues;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.blocks.BlockWarningSign;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;

import static dandustry.machine.DandustryRecipeMaps.LABORATORY_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.recipes.RecipeMaps.EXTRACTOR_RECIPES;

public class WasteFluidRecipes {

    public static void init() {

        EXTRACTOR_RECIPES.recipeBuilder()
                .input(Dandustry.wasteFluidExtractorFilled)
                .output(Dandustry.wasteFluidExtractor)
                .fluidOutputs(DDMaterials.animalWaste.getFluid(1000))
                .duration(400).EUt(30).buildAndRegister();

        //ASSEMBLY_LINE_RECIPES.recipeBuilder()
        //        .input(MetaItems.BATTERY_ULV_TANTALUM).input(OrePrefix.pipeNonupleFluid, Materials.Lead).inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.SMALL_YELLOW_STRIPES)).input(MetaItems.BATTERY_ULV_TANTALUM)

        //        .input(OrePrefix.pipeTinyFluid, Materials.Lead).inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.YELLOW_STRIPES)).input(OrePrefix.toolHeadScrewdriver, Materials.VanadiumSteel).input(OrePrefix.toolHeadScrewdriver, Materials.Titanium)

        //        .inputs(MetaBlocks.WARNING_SIGN.getItemVariant(BlockWarningSign.SignType.SMALL_YELLOW_STRIPES)).input(OrePrefix.toolHeadScrewdriver, Materials.DamascusSteel).input(OrePrefix.toolHeadScrewdriver, Materials.Steel).input(OrePrefix.pipeHugeFluid, Materials.Lead)

        //        .input(MetaItems.BATTERY_ULV_TANTALUM).input(OrePrefix.toolHeadScrewdriver, Materials.Bronze).input(OrePrefix.pipeQuadrupleFluid, Materials.Lead).input(MetaItems.BATTERY_ULV_TANTALUM)

        //        .fluidInputs(DDMaterials.animalWaste.getFluid(144000))
        //        .fluidInputs(Materials.Naquadria.getFluid(288000))
        //        .fluidInputs(Materials.Neutronium.getFluid(576000))
        //        .fluidInputs(Materials.BioDiesel.getFluid(100000))
        //        .output(Dandustry.errorIngot)
        //        .EUt(GTValues.VA[GTValues.UEV]).duration(20000).buildAndRegister();

        // todo test laboratory recipe
        LABORATORY_RECIPES.recipeBuilder()
                .input(OrePrefix.ingot, Materials.Iron)
                .output(OrePrefix.dust, Materials.Gold)
                .requireInside(MetaTileEntities.CHEMICAL_REACTOR[GTValues.HV])
                .duration(50).EUt(480).buildAndRegister();
    }
}
