/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package net.unethicalite.plugins.logout;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="hootautologin")
public interface ClueConfig
extends Config {
    @Range(max=10000)
    @ConfigItem(keyName="foodID", name="Food ID", description="Eat food id", position=8)
    default public int foodID() {
        return -(0xFFFFB895 & 0x5FEF) & (0xFFFFFDFF & 0x1BFF);
    }

    @ConfigItem(keyName="openClues", name="Open clues?", description="Automatically open clues", position=6)
    default public boolean openCaskets() {
        return ((91 + 101 - 120 + 55 ^ (0x7A ^ 0x10)) & (153 + 180 - 269 + 144 ^ 14 + 87 - -74 + 22 ^ -" ".length())) != 0;
    }

    @ConfigItem(keyName="useStamina", name="Use Staminas?", description="Use staminas", position=7)
    default public boolean useStamina() {
        return ((0x52 ^ 8) & ~(0xFF ^ 0xA5)) != 0;
    }

    @ConfigItem(keyName="ironmanMode", name="Ironman?", description="Enable ironman mode", position=7)
    default public boolean isIronman() {
        return ((0xC6 ^ 0xC1 ^ (0x44 ^ 0x78)) & (141 + 77 - 165 + 89 ^ 70 + 26 - 24 + 109 ^ -" ".length())) != 0;
    }
}

