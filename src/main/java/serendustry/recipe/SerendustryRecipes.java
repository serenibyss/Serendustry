package serendustry.recipe;

public class SerendustryRecipes {

    public static void registerRecipes() {
        //PrefixHandlers.register(); todo
        AlloyRecipes.init();
        DestabilizedMatterChain.init();
        DragonEggRecipes.init();
        HTComponentRecipes.init();
        HTMachineRecipes.init();
        LargeAlloySmelterRecipes.init();
        MagnetoResonaticRecipes.init();
        MiscRecipes.init();
        PeriodiciumChain.init();
        PlasmaFuels.init();
        PlasmaMixerRecipes.init();
        RadoxChain.init();
        SmallFusionReactorRecipes.init();
        WasteFluidRecipes.init();
    }
}
