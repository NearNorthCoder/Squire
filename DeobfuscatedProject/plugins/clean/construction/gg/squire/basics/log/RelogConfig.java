/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.log;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirerelogger")
public interface RelogConfig
extends Config {
    @ConfigItem(position=9, keyName="logoutMinutes", name="Logout after x minutes?", hidden=true, unhide="logout", description="In minutes, how long do you want to wait before logging out")
    default public int logoutMinutes() {
        return (0x4C ^ 0x19) & ~(4 ^ 0x51);
    }

    @ConfigItem(position=2, hidden=true, unhide="delayBeforeRelog", keyName="relogDelayTime", name="How many minutes?", description="In minutes, how long do you want to delay until relogging?")
    default public int relogDelay() {
        return 0xAB ^ 0xAE;
    }

    @ConfigItem(position=7, keyName="worldsToHopTo", name="", description="", hidden=true, unhide="hopSpecificWorlds")
    default public String worlds() {
        return "301,303";
    }

    @ConfigItem(position=8, keyName="logout", name="Logout instead of hop?", description="If toggled the plugin will log out and not sign you back in.")
    default public boolean logOutPlayer() {
        return ((0x96 ^ 0xA1 ^ (0x63 ^ 0x44)) & (0x8F ^ 0x95 ^ (0x20 ^ 0x2A) ^ -" ".length()) & ((0x75 ^ 0xE ^ (0x2C ^ 0x40)) & (10 + 123 - 118 + 167 ^ 74 + 44 - 51 + 94 ^ -" ".length()) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=4, keyName="notifyPlayer", name="Notify for player?", description="If toggled the plugin will notify when a player comes nearby")
    default public boolean notifyPlayer() {
        return ((51 + 172 - 89 + 94 ^ 79 + 115 - 117 + 84) & (77 + 25 - 72 + 101 ^ 101 + 48 - 1 + 50 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=1, keyName="delayBeforeRelog", name="Delay before relogging?", description="If toggled the relogger will wait before relogging")
    default public boolean delayedRelog() {
        return ((0 ^ 5 ^ (0x8A ^ 0xB1)) & (8 ^ 0x3D ^ (0x91 ^ 0x9A) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=8, keyName="instance", name="Ignore Instances?", description="If toggled the plugin will not hop/relog in instances.")
    default public boolean ignoreInstances() {
        return " ".length() != 0;
    }

    @ConfigItem(position=5, keyName="stayInRegion", name="Stay in region", description="Only hop to worlds in the same region as current")
    default public boolean stayInRegion() {
        return ((0x1D ^ 0x36) & ~(0x5F ^ 0x74)) != 0;
    }

    @ConfigItem(position=3, keyName="worldHopRelog", name="World hop before relogging?", description="If toggled the relogger will hop to a random world before logging back in")
    default public boolean worldHopRelog() {
        return ((100 + 14 - 59 + 78 ^ 37 + 31 - -61 + 59) & (0x98 ^ 0xC0 ^ (0x3D ^ 0x5C) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=6, keyName="hopSpecificWorlds", name="Hop specific worlds", description="If toggled you can specify worlds to hop to")
    default public boolean hopSpecificWorlds() {
        return ((0xF8 ^ 0xB6) & ~(0xC ^ 0x42)) != 0;
    }

    @ConfigItem(position=5, keyName="worldHopMinutes", name="Hop after minutes?", description="In minutes, how long do you want to wait before hopping worlds (0 = disabled)")
    default public int worldHopMinutes() {
        return (0x40 ^ 0xE ^ (0x7F ^ 0x1B)) & (0x3F ^ 0x23 ^ (0x5C ^ 0x6A) ^ -" ".length());
    }

    @ConfigItem(position=4, keyName="worldHopPlayer", name="Hop for player?", description="If toggled the plugin will hop to a random world when other player is in area")
    default public boolean worldHopPlayer() {
        return ((0x90 ^ 0xAC) & ~(0x68 ^ 0x54)) != 0;
    }
}

