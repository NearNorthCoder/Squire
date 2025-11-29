package gg.squire.basics.wilderness.antipking;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squireantipk")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/wilderness/antipking/AntiPkConfig.class */
public interface AntiPkConfig extends Config {
    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "onlyLogout", name = "Log out, no teleport", description = "Logout on player instead of trying teleports", position = 0)
    default boolean alwaysLogout() {
        return ((153 ^ 136) ^ (185 ^ 159)) & (((((54 + 41) - 75) + 147) ^ (((94 + 29) - 96) + 117)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "ignoreGear", name = "Ignore gear", description = "Logout on attackable player without gear checks", position = 1)
    default boolean ignoreGear() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "onlySkulls", name = "Only log out for skulled", description = "Logout only for skulled players", position = 2)
    default boolean onlySkulled() {
        return ((111 ^ 18) ^ (99 ^ 85)) & (((33 ^ 39) ^ (84 ^ 25)) ^ (-" ".length()));
    }
}
