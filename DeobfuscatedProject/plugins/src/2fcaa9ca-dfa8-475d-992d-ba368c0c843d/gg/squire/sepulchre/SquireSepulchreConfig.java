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
package gg.squire.sepulchre;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.q;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.w;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.x;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.y;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.z;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiresepulchre")
public interface SquireSepulchreConfig
extends Config {
    @ConfigSection(name="Sack Manager", description="Sack manager - currently only supports opening hallowed sacks", position=10, closedByDefault=true)
    public static final /* synthetic */ String SACK_BUYER_OPENER;
    @ConfigSection(name="Looting", description="Settings to looting", position=10)
    public static final /* synthetic */ String LOOTING_SETTINGS;

    @ConfigItem(keyName="lockpick", name="Lockpick", description="What lockpick to use for looting", position=20, section="Looting Settings")
    default public x lockpick() {
        return x.STRANGE_LOCKPICK;
    }

    @ConfigItem(keyName="portal", name="Portal", description="What enchant spell to use to conjure portals", position=20, section="Looting Settings")
    default public z portal() {
        return z.NONE;
    }

    @ConfigItem(position=30, keyName="Sack opener", name="Sack opener", description="Plugin instead opens Hallowed Sacks from the bank", section="Sack Settings")
    default public boolean sackOpener() {
        return ((158 + 50 - 198 + 150 ^ 30 + 90 - 55 + 64) & (94 + 61 - -7 + 2 ^ 6 + 33 - -83 + 11 ^ -" ".length())) != 0;
    }

    @ConfigItem(position=6, keyName="food", name="Food ", description="What food to bring")
    default public q food() {
        return q.SHARK;
    }

    @ConfigItem(keyName="dust", name="Vampyre dust", description="How many vampyre dust to bring", position=20, section="Looting Settings")
    default public int dust() {
        return 0x91 ^ 0x97;
    }

    static {
        LOOTING_SETTINGS = "Looting Settings";
        SACK_BUYER_OPENER = "Sack Settings";
    }

    @ConfigItem(position=7, keyName="Health to eat at", name="Eat at", description="Health to eat at")
    @Range(min=20, max=80)
    default public int hpToEatAt() {
        return 9 ^ 0x1F ^ (0x17 ^ 0x29);
    }

    @ConfigItem(keyName="hammer", name="Hammer", description="What hammer to use for looting", position=20, section="Looting Settings")
    default public w hammer() {
        return w.HAMMER;
    }

    @ConfigItem(keyName="planks", name="Plank and Nails", description="What plank and nails to use for looting", position=20, section="Looting Settings")
    default public y planks() {
        return y.TEAK_ADAMANT;
    }

    @ConfigItem(position=6, keyName="how much food", name="Food amount", description="How much food to withdraw")
    default public int foodAmount() {
        return "   ".length();
    }

    @ConfigItem(position=5, keyName="Stamina", name="Stamina", description="How many stamina potion(4) to withdraw")
    default public int stamina() {
        return " ".length();
    }
}

