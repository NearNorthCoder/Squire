package gg.squire.account;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("hootfighter")
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:gg/squire/account/BuilderConfig.class */
public interface BuilderConfig extends Config {
    @ConfigSection(name = "General", description = "General settings", position = 991, closedByDefault = true)
    public static final /* synthetic */ String general = "General";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "enabled", name = "Enable/disable plugin", description = "Enable or disable the plugin")
    default boolean turnScriptOnOff() {
        return ((((37 + 73) - 80) + 127) ^ (((165 + 30) - 126) + 101)) & (((15 ^ 95) ^ (193 ^ 166)) ^ (-" ".length()));
    }
}
