/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.scurrius;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.c;

@ConfigGroup(value="squirescurrius")
public interface SquireScurriusConfig
extends Config {
    @ConfigSection(name="Looting", description="Settings related to looting", position=0)
    public static final /* synthetic */ String LOOT;
    @ConfigSection(name="Fighting", description="Settings related to fighting", position=0)
    public static final /* synthetic */ String FIGHT;
    @ConfigSection(name="Special Attack", description="Settings related to special attack", position=0)
    public static final /* synthetic */ String SPECIAL;
    @ConfigSection(name="Banking", description="Settings related to banking", position=0)
    public static final /* synthetic */ String BANKING;

    @Range(max=99, min=22)
    @ConfigItem(position=0, name="Eat at", keyName="eat.at", description="What hp to eat at", section="fight")
    default public int eatAt() {
        return 0x3F ^ 0x21;
    }

    @ConfigItem(position=0, name="Min. food", keyName="food.min", description="How many foods/brew doses before starting the fight?", section="fight")
    @Range(max=10)
    default public int food() {
        return 3;
    }

    static {
        LOOT = "loot";
        FIGHT = "fight";
        BANKING = "banking";
        SPECIAL = "special";
    }

    @ConfigItem(position=1, name="Bank when starting the plugin", keyName="bankOnStart", description="Should the plugin bank on start", section="banking")
    default public boolean bankOnStart() {
        return false;
    }

    @Range(max=99, min=5)
    @ConfigItem(position=0, name="Pray pot. at", keyName="pray.pot.at", description="What pray points to restore prayer at", section="fight")
    default public int drinkPrayerAt() {
        return 0x2B ^ 0x4C ^ (0x7D ^ 0xE);
    }

    @Range(max=12)
    @ConfigItem(position=0, name="Min. prayer doses", keyName="prayer.dose.min", description="How many prayer doses should we have before starting the fight?", section="fight")
    default public int prayDoses() {
        return 2;
    }

    @ConfigItem(position=1, name="Loot boosting potions", keyName="lootBoosting", description="Loot super str/ranging pots", section="loot")
    default public boolean lootBoosting() {
        return false;
    }

    @ConfigItem(position=0, name="High alch loot", keyName="highAlch", description="High alch Rat kings rune/addy drops", section="loot")
    default public boolean highAlch() {
        return ((0x1D ^ 0x2D ^ (0xEC ^ 0x9E)) & (38 + 177 - 29 + 19 ^ 18 + 100 - 15 + 40 ^ -1)) != 0;
    }

    @ConfigItem(position=2, name="Loot and bury big bones", keyName="buryBones", description="Pick up big bones and bury them for prayer xp", section="loot")
    default public boolean lootBigBones() {
        return ((0x70 ^ 0x64 ^ (0xDC ^ 0x90)) & (184 + 109 - 259 + 207 ^ 56 + 165 - 172 + 120 ^ -1)) != 0;
    }

    @ConfigItem(position=2, name="Ardy cloak prayer restore", keyName="ardyCloak", description="Use ardy cloak to restore prayer at Ardougne Monastery when banking", section="banking")
    default public boolean ardyCloak() {
        return false;
    }

    @ConfigItem(position=0, keyName="bankloadout", name="Bank Loadout", description="Loadout to use to for bank + fight", section="banking")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=-1, name="Focus Giant rats", keyName="focusrats", description="Enabling this increases xp/h at low levels", section="fight")
    default public boolean focusRats() {
        return 1 != 0;
    }

    @ConfigItem(position=0, keyName="specialAttack", name="Special Gear Setup", description="Gear setup for special attack", section="special")
    default public ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=0, keyName="bank", name="Bank", description="Which bank should we use?", section="banking")
    default public c bank() {
        return c.VARROCK_EAST;
    }
}

