/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.wintertodt;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squirewintertodt")
public interface SquireWintertodtConfig
extends Config {
    @ConfigItem(position=4, keyName="specDaxe", name="Use dragon axe spec", hidden=true, unhide="axe", unhideValue="DRAGON", description="Use the dragon axe special for a woodcutting boost")
    default public boolean spec() {
        return ((0xD0 ^ 0x89) & ~(0x2E ^ 0x77)) != 0;
    }

    @Range(min=1, max=5)
    @ConfigItem(position=7, keyName="foodAmount", name="How many potions", description="How many pots to make when we are out?")
    default public int foodAmount() {
        return 0xBC ^ 0xB8;
    }

    @ConfigItem(position=2, keyName="side", name="Wintertodt Game Side", description="What side to primarily focus on during game")
    default public a side() {
        return a.EAST;
    }

    @ConfigItem(position=4, keyName="fletch", name="Fletch", description="Should we fletch an inventory for the points?")
    default public boolean fletch() {
        return ((0xCE ^ 0xB0 ^ (0x5E ^ 0x6E)) & (0x31 ^ 0x4F ^ (0x6B ^ 0x5B) ^ -" ".length())) != 0;
    }
}

