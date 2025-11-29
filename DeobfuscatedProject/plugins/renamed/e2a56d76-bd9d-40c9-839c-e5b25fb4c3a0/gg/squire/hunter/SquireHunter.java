/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Skill
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.ExperienceGained
 */
package gg.squire.hunter;

import com.google.inject.Provides;
import e.t.r.i.s.h.q.n.r.u.-.u.e.CheckingSnareTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.ResettingBirdSnareTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.DroppingItemsTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.LootingBirdSnareTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.SetupBirdSnareTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.ResettingBoxTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.SetupBoxTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.HuntingKebbitsTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.CheckingNetTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.LootingItemsFromAFailedTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.SettingUpNetTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.DismantlingPitfallTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.DroppingItemsTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.GettingALogTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.JumpingPitfallTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.SettingPitfallTrapTask;
import e.t.r.i.s.h.q.n.r.u.-.u.e.TeasingAnimalTask;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.hunter.SquireHunterConfig;
import gg.squire.hunter.overlay.HunterInfoBox;
import javax.inject.Inject;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.ExperienceGained;

@PluginDescriptor(name="Squire Hunter", enabledByDefault=false)
public class SquireHunter
extends SquirePlugin {
    @Inject
    private /* synthetic */ a d;
    private final /* synthetic */ Class<?>[] a;
    @Inject
    private /* synthetic */ HunterInfoBox c;
    private /* synthetic */ int f;
    @Inject
    private /* synthetic */ OverlayManager b;
    private static /* synthetic */ int[] lllIlllIlIII;
    @Inject
    private /* synthetic */ EventBus e;

    protected void onStart() {
        this.f = lllIlllIlIII[1];
        this.b.add((Overlay)this.c);
        0;
        this.e.register((Object)this.d);
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
        this.e.unregister((Object)this.d);
    }

    public SquireHunter() {
        Class[] classArray = new Class[lllIlllIlIII[0]];
        classArray[SquireHunter.lllIlllIlIII[1]] = p.class;
        classArray[SquireHunter.lllIlllIlIII[2]] = r.class;
        classArray[SquireHunter.lllIlllIlIII[3]] = q.class;
        classArray[SquireHunter.lllIlllIlIII[4]] = E.class;
        classArray[SquireHunter.lllIlllIlIII[5]] = D.class;
        classArray[SquireHunter.lllIlllIlIII[6]] = B.class;
        classArray[SquireHunter.lllIlllIlIII[7]] = C.class;
        classArray[SquireHunter.lllIlllIlIII[8]] = A.class;
        classArray[SquireHunter.lllIlllIlIII[9]] = n.class;
        classArray[SquireHunter.lllIlllIlIII[10]] = l.class;
        classArray[SquireHunter.lllIlllIlIII[11]] = o.class;
        classArray[SquireHunter.lllIlllIlIII[12]] = v.class;
        classArray[SquireHunter.lllIlllIlIII[13]] = y.class;
        classArray[SquireHunter.lllIlllIlIII[14]] = u.class;
        classArray[SquireHunter.lllIlllIlIII[15]] = z.class;
        classArray[SquireHunter.lllIlllIlIII[16]] = w.class;
        classArray[SquireHunter.lllIlllIlIII[17]] = t.class;
        this.a = classArray;
        this.f = lllIlllIlIII[1];
    }

    @Provides
    SquireHunterConfig a(ConfigManager configManager) {
        return (SquireHunterConfig)configManager.getConfig(SquireHunterConfig.class);
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (SquireHunter.lIIIllIlllIIlII(experienceGained.getSkill(), Skill.HUNTER)) {
            this.f += lllIlllIlIII[2];
        }
    }

    static {
        SquireHunter.lIIIllIlllIIIll();
    }

    private static boolean lIIIllIlllIIlII(Object object, Object object2) {
        return object == object2;
    }

    public int a() {
        return this.f;
    }

    private static void lIIIllIlllIIIll() {
        lllIlllIlIII = new int[18];
        SquireHunter.lllIlllIlIII[0] = 22 + 112 - 51 + 55 ^ 123 + 58 - 55 + 29;
        SquireHunter.lllIlllIlIII[1] = (71 + 216 - 265 + 204 ^ 85 + 78 - 60 + 28) & (0x4D ^ 0x26 ^ (0x9B ^ 0x91) ^ -1);
        SquireHunter.lllIlllIlIII[2] = 1;
        SquireHunter.lllIlllIlIII[3] = 2;
        SquireHunter.lllIlllIlIII[4] = 3;
        SquireHunter.lllIlllIlIII[5] = 0xC0 ^ 0xC4;
        SquireHunter.lllIlllIlIII[6] = 0xBA ^ 0xBF;
        SquireHunter.lllIlllIlIII[7] = 93 + 85 - 60 + 19 ^ 46 + 30 - 12 + 79;
        SquireHunter.lllIlllIlIII[8] = 0x5C ^ 0x5B;
        SquireHunter.lllIlllIlIII[9] = 120 + 88 - 98 + 74 ^ 96 + 149 - 156 + 87;
        SquireHunter.lllIlllIlIII[10] = 26 + 120 - 127 + 108 ^ (0x3B ^ 0x4D);
        SquireHunter.lllIlllIlIII[11] = 0xE ^ 4;
        SquireHunter.lllIlllIlIII[12] = 3 ^ (0x89 ^ 0x81);
        SquireHunter.lllIlllIlIII[13] = 0x5F ^ 0x53;
        SquireHunter.lllIlllIlIII[14] = 84 + 31 - 89 + 120 ^ 46 + 134 - 52 + 31;
        SquireHunter.lllIlllIlIII[15] = 0x5F ^ 0x68 ^ (0x2E ^ 0x17);
        SquireHunter.lllIlllIlIII[16] = 0xB2 ^ 0x8D ^ (0x97 ^ 0xA7);
        SquireHunter.lllIlllIlIII[17] = 43 + 18 - -5 + 85 ^ 119 + 83 - 183 + 116;
    }
}

