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
 */
package gg.squire.whisperer.config;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.e;

@ConfigGroup(value="squirewhisperer")
public interface SquireWhispererConfig
extends Config {
    @ConfigSection(name="Banking", description="Settings related to banking", position=0)
    public static final /* synthetic */ String BANKING;
    @ConfigSection(name="Fighting", description="Settings related to fighting", position=0)
    public static final /* synthetic */ String FIGHT;

    @ConfigItem(position=0, name="Pray pot. at", keyName="pray.pot.at", description="What pray points to restore prayer at", section="fight")
    @Range(max=99, min=5)
    default public int drinkPrayerAt() {
        return 0xB9 ^ 0x8B;
    }

    @Range(max=99, min=20)
    @ConfigItem(position=0, name="Eat at", keyName="eat.at", description="What hp to eat at", section="fight")
    default public int eatAt() {
        return 0x30 ^ 2;
    }

    static {
        FIGHT = "fight";
        BANKING = "banking";
    }

    @ConfigItem(position=0, keyName="bank", name="Bank", description="Which bank should we use?", section="banking")
    default public e bank() {
        return e.GRAND_EXCHANGE;
    }

    @ConfigItem(position=0, name="Min. food", keyName="food.min", description="How many foods/brew doses before starting the fight?", section="fight")
    @Range(max=12)
    default public int food() {
        return 3;
    }

    @ConfigItem(position=0, keyName="bankloadout", name="Bank Loadout", description="Loadout to use to for bank + fight", section="banking")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @Range(max=12)
    @ConfigItem(position=0, name="Min. prayer doses", keyName="prayer.dose.min", description="How many prayer doses should we have before starting the fight?", section="fight")
    default public int prayDoses() {
        return 0xA3 ^ 0xAB;
    }
}

