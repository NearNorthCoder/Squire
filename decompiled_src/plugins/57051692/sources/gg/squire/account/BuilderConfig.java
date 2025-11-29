package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return ((((28 + 109) - 70) + 110) ^ (((57 + 53) - (-52)) + 10)) & (((39 ^ 121) ^ (72 ^ 11)) ^ (-" ".length()));
    }
}
