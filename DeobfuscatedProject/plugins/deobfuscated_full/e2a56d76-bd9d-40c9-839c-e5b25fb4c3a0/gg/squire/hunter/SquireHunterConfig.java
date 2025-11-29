/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 */
package gg.squire.hunter;

import e.t.r.i.s.h.q.n.r.u.-.u.e.c;
import e.t.r.i.s.h.q.n.r.u.-.u.e.d;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.i;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(value="squirehunter")
public interface SquireHunterConfig
extends Config {
    @ConfigItem(position=4, keyName="pitfallAnimal", name="Animal", hidden=true, unhide="hunterMethod", unhideValue="PITFALL", description="What animal do you want to trap in pitfalls?")
    default public i pitfallAnimal() {
        return i.SUNLIGHT_ANTELOPE;
    }

    @ConfigItem(position=2, keyName="chinLocation", name="Location", hidden=true, unhide="hunterMethod", unhideValue="CHINS", description="What location do you want to hunt chinchompas at?")
    default public d chinLocation() {
        return d.FELDIP_HILLS_SOUTH;
    }

    @ConfigItem(position=1, keyName="hunterMethod", name="Hunter method", description="Specify the method to use for hunter")
    default public e method() {
        return e.SALLIES;
    }

    @ConfigItem(position=4, keyName="birdLocation", name="Location", hidden=true, unhide="hunterMethod", unhideValue="BIRDS", description="What location do you want to hunt birds at?")
    default public c birdLocation() {
        return c.FELDIP_HILLS_SOUTH;
    }

    @ConfigItem(position=3, keyName="tickManipulation", name="Tick Manipulation", description="Do you want to use tick manipulation methods?", hidden=true, unhide="hunterMethod", unhideValue="CHINS")
    default public boolean tickManipulation() {
        return false;
    }

    @ConfigItem(position=5, keyName="buryBones", name="Bury Bones", hidden=true, unhide="hunterMethod", unhideValue="BIRDS||FALCONRY||PITFALL", description="Bury Bones?")
    default public boolean buryBones() {
        return 1 != 0;
    }
}

