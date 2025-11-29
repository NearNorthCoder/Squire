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
package gg.squire.vardorvis;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.FEnum;

@ConfigGroup(value="squirevardorvis")
public interface SquireVardorvisConfig
extends Config {
    @ConfigSection(name="Fighting", description="Settings related to fighting", position=0)
    public static final /* synthetic */ String FIGHT;
    @ConfigSection(name="Special Attack", description="Settings related to special attack", position=0)
    public static final /* synthetic */ String SPECIAL;
    @ConfigSection(name="Banking", description="Settings related to banking", position=0)
    public static final /* synthetic */ String BANKING;

    @ConfigItem(position=1, keyName="bankOnStart", name="Bank on start", description="Bank when starting the plugin", section="banking")
    default public boolean bankOnStart() {
        return ((0x8D ^ 0xA2 ^ (0xBF ^ 0x9E)) & (0xE0 ^ 0xB2 ^ (0xF1 ^ 0xAD) ^ -1)) != 0;
    }

    @Range(max=700, min=20)
    @ConfigItem(position=1, name="Spec under how much health?", keyName="specHp", description="What HP to use special attack at", section="special")
    default public int specHp() {
        return (0x9A ^ 0xA3) + (0x76 ^ 3) - -(0x5F ^ 0x48) + 3;
    }

    @ConfigItem(position=0, name="Eat at", keyName="eat.at", description="What hp to eat at", section="fight")
    @Range(max=99, min=40)
    default public int eatAt() {
        return 0x3A ^ 8;
    }

    @ConfigItem(position=0, keyName="bank", name="Bank", description="Which bank should we use?", section="banking")
    default public f bank() {
        return f.GRAND_EXCHANGE;
    }

    @Range(max=16)
    @ConfigItem(position=0, name="Min. food", keyName="food.min", description="How many foods/brew doses before starting the fight?", section="fight")
    default public int food() {
        return 0x28 ^ 0x2E;
    }

    @ConfigItem(position=0, keyName="specialAttack", name="Special Gear Setup", description="Gear setup for special attack", section="special")
    default public ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=0, name="Pray pot. at", keyName="pray.pot.at", description="What pray points to restore prayer at", section="fight")
    @Range(max=99, min=15)
    default public int drinkPrayerAt() {
        return 0x51 ^ 0x63;
    }

    @Range(max=12)
    @ConfigItem(position=0, name="Min. prayer doses", keyName="prayer.dose.min", description="How many prayer doses should we have before starting the fight?", section="fight")
    default public int prayDoses() {
        return 2;
    }

    @ConfigItem(position=2, keyName="earlyBank", name="Bank early", description="Bank early to prevent deaths on the way to the bank", section="banking")
    default public boolean earlyBank() {
        return ((0x39 ^ 0x40 ^ (0xDA ^ 0xC1)) & (141 + 199 - 239 + 105 ^ 97 + 22 - -8 + 45 ^ -1)) != 0;
    }

    static {
        SPECIAL = "special";
        BANKING = "banking";
        FIGHT = "fight";
    }

    @ConfigItem(position=0, keyName="bankloadout", name="Bank Loadout", description="Loadout to use to for bank + fight", section="banking")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }
}

