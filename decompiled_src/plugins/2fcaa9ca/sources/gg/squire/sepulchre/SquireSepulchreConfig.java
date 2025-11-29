package gg.squire.sepulchre;

import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0016q;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.w;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.x;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.y;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.z;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiresepulchre")
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:gg/squire/sepulchre/SquireSepulchreConfig.class */
public interface SquireSepulchreConfig extends Config {
    @ConfigSection(name = "Looting", description = "Settings to looting", position = 10)
    public static final /* synthetic */ String LOOTING_SETTINGS = "Looting Settings";
    @ConfigSection(name = "Sack Manager", description = "Sack manager - currently only supports opening hallowed sacks", position = 10, closedByDefault = true)
    public static final /* synthetic */ String SACK_BUYER_OPENER = "Sack Settings";

    @ConfigItem(keyName = "lockpick", name = "Lockpick", description = "What lockpick to use for looting", position = 20, section = "Looting Settings")
    default x lockpick() {
        return x.STRANGE_LOCKPICK;
    }

    @ConfigItem(keyName = "portal", name = "Portal", description = "What enchant spell to use to conjure portals", position = 20, section = "Looting Settings")
    default z portal() {
        return z.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 30, keyName = "Sack opener", name = "Sack opener", description = "Plugin instead opens Hallowed Sacks from the bank", section = "Sack Settings")
    default boolean sackOpener() {
        return ((((158 + 50) - 198) + 150) ^ (((30 + 90) - 55) + 64)) & (((((94 + 61) - (-7)) + 2) ^ (((6 + 33) - (-83)) + 11)) ^ (-" ".length()));
    }

    @ConfigItem(position = 6, keyName = "food", name = "Food ", description = "What food to bring")
    default EnumC0016q food() {
        return EnumC0016q.SHARK;
    }

    @ConfigItem(keyName = "dust", name = "Vampyre dust", description = "How many vampyre dust to bring", position = 20, section = "Looting Settings")
    default int dust() {
        return 145 ^ 151;
    }

    @ConfigItem(position = 7, keyName = "Health to eat at", name = "Eat at", description = "Health to eat at")
    @Range(min = 20, max = 80)
    default int hpToEatAt() {
        return (9 ^ 31) ^ (23 ^ 41);
    }

    @ConfigItem(keyName = "hammer", name = "Hammer", description = "What hammer to use for looting", position = 20, section = "Looting Settings")
    default w hammer() {
        return w.HAMMER;
    }

    @ConfigItem(keyName = "planks", name = "Plank and Nails", description = "What plank and nails to use for looting", position = 20, section = "Looting Settings")
    default y planks() {
        return y.TEAK_ADAMANT;
    }

    @ConfigItem(position = 6, keyName = "how much food", name = "Food amount", description = "How much food to withdraw")
    default int foodAmount() {
        return "   ".length();
    }

    @ConfigItem(position = 5, keyName = "Stamina", name = "Stamina", description = "How many stamina potion(4) to withdraw")
    default int stamina() {
        return " ".length();
    }
}
