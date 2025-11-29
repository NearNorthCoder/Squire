/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.plugins.agility;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

@ConfigGroup(value="squireagility")
public interface AgilityConfig
extends Config {
    @ConfigItem(position=12, keyName="stopAtHp", name="Stop at HP%", description="Will stop the plugin if we go below this HP percentage")
    default public int stopAtHp() {
        return 0xB9 ^ 0xA7 ^ (0x60 ^ 0x71) & ~(0x72 ^ 0x63);
    }

    @ConfigItem(position=10, keyName="progressive", name="Progressive", description="If the plugin should progressively switch courses")
    default public boolean progressive() {
        return ((64 + 119 - 170 + 179 ^ 52 + 113 - 79 + 55) & (0x20 ^ 0x3A ^ (0xFA ^ 0xAD) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=11, keyName="course", name="Agility Course", description="The desired course", hide="progressive")
    default public b course() {
        return b.ARDOUGNE;
    }

    @ConfigItem(position=20, keyName="imbue", name="Magic Imbue", description="Whether or not to cast magic imbue", hide="alch")
    default public boolean imbue() {
        return ((0xC9 ^ 0x9C) & ~(0x71 ^ 0x24)) != 0;
    }

    @ConfigItem(position=31, keyName="markLootAmount", name="Loot marks at", description="Amount of marks to loot at")
    default public int markLootAmount() {
        return 119 + 72 - 174 + 113 ^ 122 + 50 - 166 + 130;
    }

    @ConfigItem(position=21, keyName="alchemy", name="Alchemy", description="Will alch any noted item in your inventory, unless you specify ids below", hide="imbue")
    default public boolean alch() {
        return ((0x81 ^ 0xA3) & ~(0x42 ^ 0x60)) != 0;
    }

    @ConfigItem(position=22, keyName="alchemyIds", name="Alching items", description="A list of items to alch (ids), separated by comma, leave empty to take any noted item", hide="imbue")
    default public String alchIds() {
        return "";
    }

    @ConfigItem(position=15, keyName="seersTeleport", name="Seers Teleport", description="Make use of seers village teleport spell?", hidden=true, unhide="course", unhideValue="SEERS_VILLAGE")
    @Range(min=10, max=90)
    default public boolean seersTeleport() {
        return " ".length() != 0;
    }
}

