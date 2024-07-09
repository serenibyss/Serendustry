package serendustry.adapter;

import net.minecraftforge.fml.relauncher.IFMLCallHook;

class SerendustryCallHook: IFMLCallHook {

    override fun injectData(data: Map<String?, Any?>?) {
        val loader = data?.get("classLoader") as ClassLoader?
        try {
            loader?.loadClass("serendustry.adapter.KotlinAdapter")
        } catch (e: ClassNotFoundException) {
            throw RuntimeException("Couldn't find Serendustry language adapter!")
        }
    }

    override fun call() = null
}
