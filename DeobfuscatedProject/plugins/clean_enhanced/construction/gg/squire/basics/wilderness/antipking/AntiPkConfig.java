/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.wilderness.antipking;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squireantipk")
public interface AntiPkConfig
extends Config {
    @ConfigItem(keyName="onlyLogout", name="Log out, no teleport", description="Logout on player instead of trying teleports", position=0)
    default public boolean alwaysLogout() {
        return ((0x99 ^ 0x88 ^ (0xB9 ^ 0x9F)) & (54 + 41 - 75 + 147 ^ 94 + 29 - 96 + 117 ^ -1)) != 0;
    }

    @ConfigItem(keyName="ignoreGear", name="Ignore gear", description="Logout on attackable player without gear checks", position=1)
    default public boolean ignoreGear() {
        return ((5 ^ 0x15) & ~(0xB2 ^ 0xA2)) != 0;
    }

    @ConfigItem(keyName="onlySkulls", name="Only log out for skulled", description="Logout only for skulled players", position=2)
    default public boolean onlySkulled() {
        return ((0x6F ^ 0x12 ^ (0x63 ^ 0x55)) & (0x21 ^ 0x27 ^ (0x54 ^ 0x19) ^ -1)) != 0;
    }
}

