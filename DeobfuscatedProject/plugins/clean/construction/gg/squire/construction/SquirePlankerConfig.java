/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.construction;

import k.p.n.s.r.a.-.q.e.l.r.e.i.u.a;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squireplanker")
public interface SquirePlankerConfig
extends Config {
    @ConfigItem(position=11, keyName="slowmode", name="Slow mode", description="Runs slower but more stable")
    default public boolean slowmode() {
        return ((84 + 6 - 2 + 79 ^ 10 + 122 - 50 + 57) & (0x2D ^ 0x6A ^ (0x29 ^ 0x42) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=10, keyName="spell", name="Use spell", description="Uses the plank make spell instead of cammy method")
    default public boolean spell() {
        return ((0x31 ^ 0x3B ^ (0xC2 ^ 0x97)) & (0x31 ^ 0x71 ^ (0x7F ^ 0x60) ^ -" ".length())) != 0;
    }

    @ConfigItem(position=13, keyName="ironmode", hideValue="spell", name="Use portals instead of teleport", description="Would you rather use your built home portals?")
    default public boolean ironMode() {
        return ((0x60 ^ 0x6A ^ (0x20 ^ 0x39)) & (93 + 79 - 47 + 22 ^ 103 + 52 - 113 + 86 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=12, keyName="plank", name="Plank to make", description="Plank to make")
    default public a plank() {
        return a.MAHOGANY;
    }
}

