package cn.aixcyi.plugin.templugin

import org.jetbrains.annotations.PropertyKey
import java.util.*

@Suppress("unused")
object Zoo {
    /**
     * 插件配置的全局存储位置。
     */
    const val PLUGIN_STORAGE = "HooTool.xml"

    /**
     * 配置所对应的 XML 的组件名。
     *
     * `<component name="NAME"></component>`
     */
    object XmlComponent

    /** 文本资源包。 */
    private val BUNDLE = ResourceBundle.getBundle("messages.PluginTemplate")

    /**
     * 获取本地化翻译。
     *
     * Retrieve translated text via keys on "properties" file.
     *
     * @param key properties 文件中的键。
     * @return properties 文件中键对应的值。
     */
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = "messages.PluginTemplate") key: String): String {
        return BUNDLE.getString(key)
            .replace("\\r\\n", "\n")  // "\r\n" -> LF
            .replace("\\n", "\n")  // "\n" -> LF
    }
}