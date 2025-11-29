package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "agility", name = "Get 70 agility", description = "enable to get 70 agility or disable to not get 70 agility")
    default boolean get70Agility() {
        return ((((13 + 29) - (-13)) + 73) ^ (((113 + 123) - 210) + 124)) & (((4 ^ 58) ^ (137 ^ 161)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return ((0 ^ 85) ^ (119 ^ 7)) & (((26 ^ 11) ^ (7 ^ 51)) ^ (-" ".length()));
    }
}
