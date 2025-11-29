package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
