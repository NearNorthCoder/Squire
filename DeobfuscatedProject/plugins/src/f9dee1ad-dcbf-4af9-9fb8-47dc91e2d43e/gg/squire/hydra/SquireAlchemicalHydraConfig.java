/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.hydra;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;
import u.i.r.d.s.e.r.q.y.a.h.-.g;

@ConfigGroup(value="squirealchemicalhydra")
public interface SquireAlchemicalHydraConfig
extends Config {
    @ConfigItem(keyName="offensivePrayer", name="Offensive Prayer", description="What offensive prayer should be used when fighting the alchemical hydra?", position=1)
    default public g getOffensivePrayer() {
        return g.RIGOUR;
    }

    @ConfigItem(keyName="blowpipeSpec", name="Blowpipe spec", description="If this is enabled, plugin will swap to blowpipe for spec", position=5)
    default public boolean blowpipeSpec() {
        return " ".length() != 0;
    }

    @ConfigItem(keyName="bury", name="Bury bones", description="If this is enabled, bones will be buried", position=4)
    default public boolean bury() {
        return ((31 + 117 - 139 + 118 ^ (0xED ^ 0x9C)) & (0x41 ^ 0x21 ^ (0x40 ^ 0x2E) ^ -" ".length())) != 0;
    }

    @ConfigItem(keyName="attack", name="Attack Hydra", description="If this is disabled, only prayers will be dealt with", position=3)
    default public boolean attack() {
        return " ".length() != 0;
    }

    @Range(min=1, max=80)
    @ConfigItem(keyName="eatAt", name="Eat at", description="What HP to eat at", position=6)
    default public int eatAt() {
        return 0x1D ^ 0x2F;
    }

    @ConfigItem(keyName="melee", name="Melee Hydra", description="Enable if you are using melee versus hydra (with a lance)", hidden=true, position=2)
    default public boolean melee() {
        return ((7 ^ 0x17) & ~(4 ^ 0x14)) != 0;
    }

    @Range(min=1, max=80)
    @ConfigItem(keyName="drinkPrayAt", name="Prayer restore at", description="What prayer points to drink pots/restores at", position=7)
    default public int restorePrayAt() {
        return 0x3A ^ 0x79 ^ (0x7E ^ 0xF);
    }

    @ConfigItem(keyName="makeDivines", name="Make divines", description="If this is enabled, range pots will be turned into divine ranging potions with crystal dust", position=4)
    default public boolean makeDivines() {
        return ((0x2B ^ 0x38) & ~(0x5E ^ 0x4D)) != 0;
    }
}

