package gg.squire.basics.log;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("squirerelogger")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/log/RelogConfig.class */
public interface RelogConfig extends Config {
    @ConfigItem(position = 9, keyName = "logoutMinutes", name = "Logout after x minutes?", hidden = true, unhide = "logout", description = "In minutes, how long do you want to wait before logging out")
    default int logoutMinutes() {
        return (76 ^ 25) & ((4 ^ 81) ^ (-1));
    }

    @ConfigItem(position = 2, hidden = true, unhide = "delayBeforeRelog", keyName = "relogDelayTime", name = "How many minutes?", description = "In minutes, how long do you want to delay until relogging?")
    default int relogDelay() {
        return 171 ^ 174;
    }

    @ConfigItem(position = 7, keyName = "worldsToHopTo", name = "", description = "", hidden = true, unhide = "hopSpecificWorlds")
    default String worlds() {
        return "301,303";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 8, keyName = "logout", name = "Logout instead of hop?", description = "If toggled the plugin will log out and not sign you back in.")
    default boolean logOutPlayer() {
        return ((150 ^ 161) ^ (99 ^ 68)) & (((143 ^ 149) ^ (32 ^ 42)) ^ (-" ".length())) & ((((117 ^ 14) ^ (44 ^ 64)) & (((((10 + 123) - 118) + 167) ^ (((74 + 44) - 51) + 94)) ^ (-" ".length()))) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 4, keyName = "notifyPlayer", name = "Notify for player?", description = "If toggled the plugin will notify when a player comes nearby")
    default boolean notifyPlayer() {
        return ((((51 + 172) - 89) + 94) ^ (((79 + 115) - 117) + 84)) & (((((77 + 25) - 72) + 101) ^ (((101 + 48) - 1) + 50)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 1, keyName = "delayBeforeRelog", name = "Delay before relogging?", description = "If toggled the relogger will wait before relogging")
    default boolean delayedRelog() {
        return ((0 ^ 5) ^ (138 ^ 177)) & (((8 ^ 61) ^ (145 ^ 154)) ^ (-" ".length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 8, keyName = "instance", name = "Ignore Instances?", description = "If toggled the plugin will not hop/relog in instances.")
    default boolean ignoreInstances() {
        return " ".length();
    }

    @ConfigItem(position = 5, keyName = "stayInRegion", name = "Stay in region", description = "Only hop to worlds in the same region as current")
    default boolean stayInRegion() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 3, keyName = "worldHopRelog", name = "World hop before relogging?", description = "If toggled the relogger will hop to a random world before logging back in")
    default boolean worldHopRelog() {
        return ((((100 + 14) - 59) + 78) ^ (((37 + 31) - (-61)) + 59)) & (((152 ^ 192) ^ (61 ^ 92)) ^ (-" ".length()));
    }

    @ConfigItem(position = 6, keyName = "hopSpecificWorlds", name = "Hop specific worlds", description = "If toggled you can specify worlds to hop to")
    default boolean hopSpecificWorlds() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(position = 5, keyName = "worldHopMinutes", name = "Hop after minutes?", description = "In minutes, how long do you want to wait before hopping worlds (0 = disabled)")
    default int worldHopMinutes() {
        return ((64 ^ 14) ^ (127 ^ 27)) & (((63 ^ 35) ^ (92 ^ 106)) ^ (-" ".length()));
    }

    @ConfigItem(position = 4, keyName = "worldHopPlayer", name = "Hop for player?", description = "If toggled the plugin will hop to a random world when other player is in area")
    default boolean worldHopPlayer() {
        return (true ^ true) & ((true ^ true) ^ true);
    }
}
