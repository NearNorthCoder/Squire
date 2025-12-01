package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return ((124 ^ 35) ^ (2 ^ 104)) & (((((25 + 143) - 23) + 96) ^ (((45 + 93) - 19) + 77)) ^ (-" ".length()));
    }
}
