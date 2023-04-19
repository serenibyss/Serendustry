package dandustry.item;

import gregtech.api.unification.material.Material;

public class DDMaterials {

    public static Material animalWaste;

    public static void init() {
        animalWaste = new Material.Builder(19000, "animal_waste")
                .fluid().color(0x7B5C00)
                .build();
    }
}
