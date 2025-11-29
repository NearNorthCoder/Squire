/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 */
package gg.squire.minigames;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squirefightcaves")
public interface SquireFightCavesConfig
extends Config {
    @ConfigSection(name="General", description="General settings", position=0, keyName="generalSection")
    public static final  String GENERAL;
    public static final  String CONFIG_GROUP;

    @ConfigItem(position=1, keyName="stopAfterCape", name="Stop after 1 cape", description="Stops after getting a firecape", section="General")
    default public boolean stopAfterCape() {
        return ((0x29 ^ 0x6F ^ (0xB ^ 0x41)) & (31 + 125 - 47 + 26 ^ 33 + 99 - 9 + 16 ^ -1)) != 0;
    }

    @ConfigItem(position=2, keyName="showExtraInfo", name="Show Extra Debug", description="show extra debug", section="General")
    default public boolean showExtraInfoOnUI() {
        return ((0x2D ^ 0x68 ^ (0x6C ^ 0x1C)) & (1 ^ (0x18 ^ 0x2C) ^ -1)) != 0;
    }

    static {
        CONFIG_GROUP = "squirefightcaves";
        GENERAL = "General";
    }

    @ConfigItem(position=0, keyName="useLongRange", name="Avoid Defence XP", description="Turn on to not use long range on healers, will increase death chance", section="General")
    default public boolean avoidDefXp() {
        return ((0x2B ^ 0x3A ^ (0x6F ^ 0x47)) & (0x4C ^ 0x58 ^ (0xAC ^ 0x81) ^ -1)) != 0;
    }

    @ConfigItem(position=3, keyName="bankloadout", name="Bank Loadout", description="Loadout to use to for bank + fight", section="General")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }
}

