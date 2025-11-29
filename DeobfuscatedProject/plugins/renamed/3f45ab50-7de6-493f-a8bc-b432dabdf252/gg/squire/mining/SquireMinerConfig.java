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
package gg.squire.mining;

import m.e.i.q.u.r.-.n.s.e.r.i.AEnum;
import m.e.i.q.u.r.-.n.s.e.r.i.BEnum;
import m.e.i.q.u.r.-.n.s.e.r.i.DEnum;
import m.e.i.q.u.r.-.n.s.e.r.i.EEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

@ConfigGroup(value="squiremlm")
public interface SquireMinerConfig
extends Config {
    @ConfigSection(name="Mining Settings", description="Settings", position=0)
    public static final /* synthetic */ String MINING_SETTINGS;

    @ConfigItem(position=4, keyName="sandstoneArea", name="Quarry Area", description="Where to mine in the quarry", hidden=true, unhide="activity", unhideValue="SANDSTONE")
    default public e area() {
        return e.WEST_FOUR;
    }

    @ConfigItem(keyName="motherlodeDepositUpstairs", name="Deposit upstairs", description="Deposit upstairs?", position=3, section="Mining Settings", hidden=true, unhide="motherlodeMineArea", unhideValue="UPPER_FLOOR")
    default public boolean depositUpstairs() {
        return false;
    }

    @ConfigItem(position=11, keyName="humidify", name="Humidify", description="Use Humidify to refill waterskins", hidden=true, unhide="activity", unhideValue="GRANITE||SANDSTONE")
    default public boolean humidify() {
        return 1 != 0;
    }

    @ConfigItem(position=14, keyName="deposit", name="Deposit Sandstone", description="Deposits the sandstone when your inventory is full", hidden=true, unhide="activity", unhideValue="SANDSTONE")
    default public boolean deposit() {
        return 1 != 0;
    }

    @ConfigItem(keyName="activity", name="Mining Activity", description="What do you want to mine?", position=1, section="Mining Settings")
    default public a activity() {
        return a.MOTHERLODE_MINE;
    }

    @ConfigItem(keyName="bankLoadout", name="Bank Loadout", description="What do you want to bank?", position=4, section="Mining Settings", hidden=true, unhide="activity", unhideValue="SUPERHEAT_MINE")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=13, keyName="amount of waterskins", name="Amount Of Waterskins", description="Amount Of Waterskins", hidden=true, unhide="activity", unhideValue="SANDSTONE||GRANITE")
    default public int waterskins() {
        return 0x26 ^ 0x2C;
    }

    @ConfigItem(position=1, keyName="chisel", name="Craft amethyst item", hidden=true, unhide="activity", unhideValue="AMETHYST", description="Do you want to craft them into amethyst items?")
    default public b craft() {
        return b.DISABLE;
    }

    @ConfigItem(keyName="motherlodeMineArea", name="Area to mine", description="What area do you want to mine?", position=2, section="Mining Settings", hidden=true, unhide="activity", unhideValue="MOTHERLODE_MINE")
    default public d mlmArea() {
        return d.UPPER_FLOOR;
    }

    static {
        MINING_SETTINGS = "Mining Settings";
    }

    @ConfigItem(keyName="motherlodeHop", name="Hop Worlds", description="Hop worlds every 250 ore veins mined to prevent reports?", position=3, section="Mining Settings", hidden=true, unhide="activity", unhideValue="MOTHERLODE_MINE")
    default public boolean hop() {
        return 1 != 0;
    }
}

