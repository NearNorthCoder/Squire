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
package gg.squire.duke;

import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squiresepulchre")
public interface SquireDukeSucellusConfig
extends Config {
    @ConfigSection(name="Banking", description="Settings related to banking", position=0)
    public static final /* synthetic */ String BANKING;
    @ConfigSection(name="Special Attack", description="Settings related to special attack", position=0)
    public static final /* synthetic */ String SPECIAL;
    @ConfigSection(name="Fighting", description="Settings related to fighting", position=0)
    public static final /* synthetic */ String FIGHT;

    @Range(max=99, min=40)
    @ConfigItem(position=0, name="Eat at", keyName="eat.at", description="What hp to eat at", section="fight")
    default public int eatAt() {
        return 0x75 ^ 0x47;
    }

    @ConfigItem(position=0, keyName="bankloadout", name="Bank Loadout", description="Loadout to use to for bank + fight", section="banking")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=0, keyName="specialAttack", name="Special Gear Setup", description="Gear setup for special attack", section="special")
    default public ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=1, name="Spec when Duke is low HP", keyName="lowSpec", description="Only use special attack when duke is under 110 HP", section="special")
    default public boolean lowHpSpec() {
        return ((0xC9 ^ 0xAF ^ (0x13 ^ 0x7E)) & (164 + 55 - 85 + 53 ^ 121 + 85 - 139 + 109 ^ -" ".length()) & ((220 + 212 - 252 + 56 ^ 168 + 85 - 218 + 155) & (0x1B ^ 0x37 ^ (0xFD ^ 0x83) ^ -" ".length()) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=2, name="Use Lightbearer switch", keyName="gazedodge", description="Equips Lightbearer during prep phase for more spec", section="special")
    default public boolean lightbearer() {
        return ((0xA9 ^ 0xA7 ^ "  ".length()) & (0xD6 ^ 0xB3 ^ (0x77 ^ 0x1E) ^ -" ".length())) != 0;
    }

    static {
        FIGHT = "fight";
        BANKING = "banking";
        SPECIAL = "special";
    }

    @Range(max=99, min=15)
    @ConfigItem(position=0, name="Pray pot. at", keyName="pray.pot.at", description="What pray points to restore prayer at", section="fight")
    default public int drinkPrayerAt() {
        return 0xBD ^ 0x8F;
    }

    @ConfigItem(position=0, name="Min. prayer doses", keyName="prayer.dose.min", description="How many prayer doses should we have before starting the fight?", section="fight")
    @Range(max=12)
    default public int prayDoses() {
        return "  ".length();
    }

    @ConfigItem(position=0, name="Safer Gaze Dodging", keyName="gazedodge", description="Disables tick-dodging the gaze (Use in case of lag)", section="fight")
    default public boolean safeDodge() {
        return ((0x5C ^ 0x56 ^ (0x72 ^ 0x56)) & (0x28 ^ 0x7A ^ (0xC8 ^ 0xB4) ^ -" ".length())) != 0;
    }

    @Range(max=12)
    @ConfigItem(position=0, name="Min. food", keyName="food.min", description="How many foods/brew doses before starting the fight?", section="fight")
    default public int food() {
        return "  ".length() ^ (0xAC ^ 0xAA);
    }

    @ConfigItem(position=0, keyName="bank", name="Bank", description="Which bank should we use?", section="banking")
    default public d bank() {
        return d.GRAND_EXCHANGE;
    }
}

