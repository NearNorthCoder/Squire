package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
