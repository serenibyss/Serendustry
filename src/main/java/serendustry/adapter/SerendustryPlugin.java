package serendustry.adapter;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("SerendustryLoadingPlugin")
@IFMLLoadingPlugin.MCVersion(ForgeVersion.mcVersion)
@IFMLLoadingPlugin.TransformerExclusions("serendustry.adapter")
class SerendustryPlugin: IFMLLoadingPlugin {

    override fun getASMTransformerClass(): Array<String?> = arrayOfNulls(0)

    override fun getModContainerClass() = null

    override fun getSetupClass() = "serendustry.adapter.SerendustryCallHook"

    override fun injectData(data: MutableMap<String, Any>?) {}

    override fun getAccessTransformerClass() = null
}
