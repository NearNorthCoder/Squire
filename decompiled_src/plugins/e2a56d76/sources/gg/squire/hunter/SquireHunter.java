package gg.squire.hunter;

import com.google.inject.Provides;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.A;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.B;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.C;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.C0000a;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.D;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.E;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.l;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.n;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.o;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.p;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.q;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.r;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.t;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.u;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.v;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.w;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.y;
import e.t.r.i.s.h.q.n.r.u.p000.u.e.z;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.hunter.overlay.HunterInfoBox;
import javax.inject.Inject;
import net.runelite.api.Skill;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.ExperienceGained;
@PluginDescriptor(name = "Squire Hunter", enabledByDefault = false)
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:gg/squire/hunter/SquireHunter.class */
public class SquireHunter extends SquirePlugin {
    @Inject
    private /* synthetic */ C0000a d;
    private final /* synthetic */ Class<?>[] a;
    @Inject
    private /* synthetic */ HunterInfoBox c;
    private /* synthetic */ int f;
    @Inject
    private /* synthetic */ OverlayManager b;
    private static /* synthetic */ int[] lllIlllIlIII;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ EventBus f0e;

    protected void onStart() {
        this.f = lllIlllIlIII[1];
        this.b.add(this.c);
        "".length();
        this.f0e.register(this.d);
    }

    protected Class<?>[] tasks() {
        return this.a;
    }

    protected void onStop() {
        this.b.remove(this.c);
        "".length();
        this.f0e.unregister(this.d);
    }

    public SquireHunter() {
        Class<?>[] clsArr = new Class[lllIlllIlIII[0]];
        clsArr[lllIlllIlIII[1]] = p.class;
        clsArr[lllIlllIlIII[2]] = r.class;
        clsArr[lllIlllIlIII[3]] = q.class;
        clsArr[lllIlllIlIII[4]] = E.class;
        clsArr[lllIlllIlIII[5]] = D.class;
        clsArr[lllIlllIlIII[6]] = B.class;
        clsArr[lllIlllIlIII[7]] = C.class;
        clsArr[lllIlllIlIII[8]] = A.class;
        clsArr[lllIlllIlIII[9]] = n.class;
        clsArr[lllIlllIlIII[10]] = l.class;
        clsArr[lllIlllIlIII[11]] = o.class;
        clsArr[lllIlllIlIII[12]] = v.class;
        clsArr[lllIlllIlIII[13]] = y.class;
        clsArr[lllIlllIlIII[14]] = u.class;
        clsArr[lllIlllIlIII[15]] = z.class;
        clsArr[lllIlllIlIII[16]] = w.class;
        clsArr[lllIlllIlIII[17]] = t.class;
        this.a = clsArr;
        this.f = lllIlllIlIII[1];
    }

    @Provides
    SquireHunterConfig a(ConfigManager configManager) {
        return (SquireHunterConfig) configManager.getConfig(SquireHunterConfig.class);
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (lIIIllIlllIIlII(experienceGained.getSkill(), Skill.HUNTER)) {
            this.f += lllIlllIlIII[2];
        }
    }

    static {
        lIIIllIlllIIIll();
    }

    private static boolean lIIIllIlllIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int a() {
        return this.f;
    }

    private static void lIIIllIlllIIIll() {
        lllIlllIlIII = new int[18];
        lllIlllIlIII[0] = (((22 + 112) - 51) + 55) ^ (((123 + 58) - 55) + 29);
        lllIlllIlIII[1] = ((((71 + 216) - 265) + 204) ^ (((85 + 78) - 60) + 28)) & (((77 ^ 38) ^ (155 ^ 145)) ^ (-" ".length()));
        lllIlllIlIII[2] = " ".length();
        lllIlllIlIII[3] = "  ".length();
        lllIlllIlIII[4] = "   ".length();
        lllIlllIlIII[5] = 192 ^ 196;
        lllIlllIlIII[6] = 186 ^ 191;
        lllIlllIlIII[7] = (((93 + 85) - 60) + 19) ^ (((46 + 30) - 12) + 79);
        lllIlllIlIII[8] = 92 ^ 91;
        lllIlllIlIII[9] = (((120 + 88) - 98) + 74) ^ (((96 + 149) - 156) + 87);
        lllIlllIlIII[10] = (((26 + 120) - 127) + 108) ^ (59 ^ 77);
        lllIlllIlIII[11] = 14 ^ 4;
        lllIlllIlIII[12] = "   ".length() ^ (137 ^ 129);
        lllIlllIlIII[13] = 95 ^ 83;
        lllIlllIlIII[14] = (((84 + 31) - 89) + 120) ^ (((46 + 134) - 52) + 31);
        lllIlllIlIII[15] = (95 ^ 104) ^ (46 ^ 23);
        lllIlllIlIII[16] = (178 ^ 141) ^ (151 ^ 167);
        lllIlllIlIII[17] = (((43 + 18) - (-5)) + 85) ^ (((119 + 83) - 183) + 116);
    }
}
