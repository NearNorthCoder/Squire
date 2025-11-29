package gg.squire.mixology;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.a;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.b;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.c;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.e;
import o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s.f;
@ConfigGroup("squiremixology")
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:gg/squire/mixology/SquireMixologyConfig.class */
public interface SquireMixologyConfig extends Config {
    @ConfigSection(name = "General Settings", description = "Settings related to your gear", position = 0)
    public static final /* synthetic */ String GENERAL_SETTINGS = "General Settings";

    @ConfigItem(position = 4, keyName = "agaHerb", name = "Aga Herb", description = "Pick herb to paste during minigame", section = "General Settings")
    default a agaHerb() {
        return a.CADANTINE;
    }

    @ConfigItem(position = 5, keyName = "lyeHerb", name = "Lye Herb", description = "Pick herb to paste during minigame", section = "General Settings")
    default c lyeHerb() {
        return c.AVANTOE;
    }

    @ConfigItem(position = 1, keyName = "pluginMode", name = "Mode", description = "Pick potion strategy", section = "General Settings")
    default d pluginMode() {
        return d.MINIGAME;
    }

    @ConfigItem(position = 8, keyName = "stopAt3000", name = "Stop at paste amount", description = "Stop at 3k paste made during minigame mode", section = "General Settings")
    @Range(min = 1, max = 25000)
    default int stopAt3000() {
        return (-9288) & 14287;
    }

    @ConfigItem(position = 2, keyName = "potionStrategy", name = "Strategy", description = "Pick potion strategy", section = "General Settings")
    default f potionStrategy() {
        return f.SINGLE_ORDER;
    }

    @ConfigItem(position = 6, keyName = "moxHerb", name = "Mox Herb", description = "Pick herb to paste during minigame", section = "General Settings")
    default e moxHerb() {
        return e.GUAM_LEAF;
    }

    @ConfigItem(position = 5, keyName = "pause", name = "Pause", description = "Pause execution")
    default Button pause() {
        return new Button();
    }

    @ConfigItem(position = 3, keyName = "herbPaste", name = "Herb Pasting", description = "Pick herb to paste", section = "General Settings")
    default b herbPaste() {
        return b.GUAM_LEAF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 7, keyName = "useStamina", name = "Use Staminas", description = "Use staminas?", section = "General Settings")
    default boolean useStamina() {
        return ((((178 + 237) - 260) + 95) ^ (((124 + 16) - (-6)) + 47)) & (((211 ^ 153) ^ (192 ^ 177)) ^ (-" ".length()));
    }
}
