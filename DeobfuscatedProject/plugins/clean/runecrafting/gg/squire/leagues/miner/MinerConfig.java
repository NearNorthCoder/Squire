/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.leagues.miner;

import i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.d;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="leaguesminer")
public interface MinerConfig
extends Config {
    @ConfigItem(keyName="rocks", name="Choose rocks", description="Rocks to mine, must be in Fossil island or elf mine, standing near rocks", position=5)
    default public d getRockType() {
        return d.RUNE;
    }

    @ConfigItem(keyName="note", name="Note items banker note", description="Must have banker note in inventory", position=6)
    default public boolean getuseBankerNote() {
        return ((0x14 ^ 0x73 ^ (0x52 ^ 0x6F)) & (0x71 ^ 0x47 ^ (0 ^ 0x6C) ^ -" ".length())) != 0;
    }

    @ConfigItem(keyName="note", name=" or the Priff underground mine", description="Must have banker note in inventory", position=1)
    default public boolean text2() {
        return ((0x9B ^ 0xA5) & ~(0x82 ^ 0xBC)) != 0;
    }

    @ConfigItem(keyName="note", name="Only works at fossil island mine", description="Must have banker note in inventory", position=0)
    default public boolean text() {
        return ((0x27 ^ 0x66) & ~(0x36 ^ 0x77)) != 0;
    }
}

