/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.Range
 */
package gg.squire.giantsfoundry;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.c;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiregiantsfoundry")
public interface SquireGiantsConfig
extends Config {
    @Range(min=1, max=27)
    @ConfigItem(position=4, keyName="secondBarAmount", name="Secondary bar amount", description="How many secondary bars should we use?")
    default public int secondaryBarAmount() {
        return 0x6F ^ 0x78 ^ (9 ^ 0xE);
    }

    @ConfigItem(position=3, keyName="secondBarType", name="Secondary bar", description="What secondary bar should we use?")
    default public c secondaryBar() {
        return c.ADAMANT_BAR;
    }

    @ConfigItem(position=2, keyName="firstBarAmount", name="Primary bar amount", description="How many primary bars should we use?")
    @Range(min=1, max=27)
    default public int primaryBarAmount() {
        return 0xA ^ 6;
    }

    @ConfigItem(position=1, keyName="firstBarType", name="Primary bar", description="What primary bar should we use?")
    default public c primaryBar() {
        return c.STEEL_BAR;
    }
}

