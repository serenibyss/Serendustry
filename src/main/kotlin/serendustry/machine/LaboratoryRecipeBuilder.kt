package serendustry.machine

import com.google.common.collect.ImmutableTable
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.recipeproperties.CleanroomProperty
import gregtech.api.recipes.recipeproperties.RecipeProperty
import serendustry.machine.LaboratoryProperty.LaboratoryEntry


class LaboratoryRecipeBuilder : RecipeBuilder<LaboratoryRecipeBuilder> {

    private val internalBuilder: ImmutableTable.Builder<RecipeMap<*>, Int, Int> = ImmutableTable.builder()

    constructor(): super()

    constructor(builder: LaboratoryRecipeBuilder) : super(builder)

    override fun copy() = LaboratoryRecipeBuilder(this)

    override fun applyProperty(key: String, value: Any?): Boolean {
        if (key == LaboratoryProperty.KEY) {
            if (value is LaboratoryEntry) {
                return applyProperty(LaboratoryProperty.instance, value)
            }
            if (value is String) { // from GrS or CT
                val stringPair = value.split(",")
                return if (stringPair.size == 2 || stringPair.size == 3) {
                    val map: RecipeMap<*> = RecipeMap.getByName(stringPair[0].trim()) ?: return false
                    val tier: Int = try {
                        stringPair[1].trim().toInt()
                    } catch (e: NumberFormatException) {
                        return false
                    }
                    var amount = 1
                    if (stringPair.size == 3) {
                        try {
                            amount = stringPair[2].trim().toInt()
                        } catch (ignored: NumberFormatException) {}
                    }
                    this.requireInside(map, tier, amount)
                    true
                } else false
            }
        }
        return if (key == CleanroomProperty.KEY) false else super.applyProperty(key, value) // this should not be in the cleanroom,
    }

    override fun applyProperty(property: RecipeProperty<*>, value: Any?): Boolean {
        if (property == CleanroomProperty.getInstance()) return false // this should not be in the cleanroom,
        return super.applyProperty(property, value)
    }

    override fun buildAndRegister() {
        super.applyProperty(LaboratoryProperty.instance, LaboratoryEntry(internalBuilder))
        super.buildAndRegister()
    }

    fun requireInside(map: RecipeMap<*>, tier: Int, amount: Int): LaboratoryRecipeBuilder {
        internalBuilder.put(map, tier, amount)
        return this
    }

    fun requireInside(map: RecipeMap<*>, tier: Int) = requireInside(map, tier, 1)
}
