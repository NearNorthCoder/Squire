/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.basics.kitten;

import i.i.b.s.c.q.r.s.s.-.u.a.e.aA;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirekitten")
public interface SquireKittenConfig
extends Config {
    @ConfigItem(keyName="spiceType", name="Pickup Spice", description="Spice type to pick up", position=2)
    default public aA spiceType() {
        return aA.YELLOW;
    }

    @ConfigItem(keyName="huntCat", name="Hunt Spice", description="Enable to start hunting for spice", position=1)
    default public boolean huntSpice() {
        return false;
    }
}

