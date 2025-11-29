package gg.squire.plugins.herblore;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.b;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.c;
import r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r.e;
@ConfigGroup("squireherblore")
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:gg/squire/plugins/herblore/HerbloreConfig.class */
public interface HerbloreConfig extends Config {
    @ConfigSection(name = "Herb cleaning settings", description = "Settings for herb cleaning", position = 10)
    public static final /* synthetic */ String herbCleaningSection = "Cleaning Herbs";

    @ConfigItem(keyName = "potion", name = "Potion to make", description = "What potion do you want to make", position = 3, hidden = true, unhide = "method", unhideValue = "FINISH_POTS")
    default e potion() {
        return e.PRAYER_POTION;
    }

    @ConfigItem(keyName = "perTick", name = "Max herbs per tick", description = "How many herbs do you want to clean per tick", position = 11, section = "Cleaning Herbs")
    @Range(min = 1, max = 8)
    default int perTick() {
        return (205 ^ 130) ^ (31 ^ 84);
    }

    @ConfigItem(keyName = "herb", name = "Herb to use", description = "What herb do you want to use", position = 2, hidden = true, unhide = "method", unhideValue = "CLEAN_HERBS||MAKE_UNF_POTS||ALL_STAGES")
    default b herb() {
        return b.GUAM_LEAF;
    }

    @ConfigItem(keyName = "method", name = "Herblore method", description = "The method to use for Herblore", position = 1)
    default c method() {
        return c.CLEAN_HERBS;
    }
}
