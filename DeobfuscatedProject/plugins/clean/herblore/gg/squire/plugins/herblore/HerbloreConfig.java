/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.plugins.herblore;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.b;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.e;

@ConfigGroup(value="squireherblore")
public interface HerbloreConfig
extends Config {
    @ConfigSection(name="Herb cleaning settings", description="Settings for herb cleaning", position=10)
    public static final /* synthetic */ String herbCleaningSection;

    static {
        herbCleaningSection = "Cleaning Herbs";
    }

    @ConfigItem(keyName="potion", name="Potion to make", description="What potion do you want to make", position=3, hidden=true, unhide="method", unhideValue="FINISH_POTS")
    default public e potion() {
        return e.PRAYER_POTION;
    }

    @Range(min=1, max=8)
    @ConfigItem(keyName="perTick", name="Max herbs per tick", description="How many herbs do you want to clean per tick", position=11, section="Cleaning Herbs")
    default public int perTick() {
        return 0xCD ^ 0x82 ^ (0x1F ^ 0x54);
    }

    @ConfigItem(keyName="herb", name="Herb to use", description="What herb do you want to use", position=2, hidden=true, unhide="method", unhideValue="CLEAN_HERBS||MAKE_UNF_POTS||ALL_STAGES")
    default public b herb() {
        return b.GUAM_LEAF;
    }

    @ConfigItem(keyName="method", name="Herblore method", description="The method to use for Herblore", position=1)
    default public c method() {
        return c.CLEAN_HERBS;
    }
}

