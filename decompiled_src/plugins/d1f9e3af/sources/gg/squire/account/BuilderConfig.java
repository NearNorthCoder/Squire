package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return ((235 ^ 153) ^ (208 ^ 133)) & (((3 ^ 60) ^ (105 ^ 113)) ^ (-" ".length()));
    }
}
