package gg.squire.saradomin;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.saradomin.overlay.SaraInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.A;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.B;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.C;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.C0005f;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.C0006g;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.D;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.F;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.G;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.H;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.I;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.m;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.n;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.p;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.q;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.r;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.s;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.t;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.u;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.v;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.w;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.x;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.y;
import u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e.z;
@PluginDescriptor(name = "Squire Saradomin", enabledByDefault = false)
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:gg/squire/saradomin/SquireSaradomin.class */
public class SquireSaradomin extends SquirePlugin {
    @Inject
    private /* synthetic */ C0005f e;
    @Inject
    private /* synthetic */ C0006g a;
    private /* synthetic */ boolean f = lIIlIlIIlIlII[0];
    @Inject
    private /* synthetic */ SaraInfoBox d;
    private static /* synthetic */ int[] lIIlIlIIlIlII;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ OverlayManager c;

    static {
        lIlIlIllIlllIlI();
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Provides
    SquireSaraConfig a(ConfigManager configManager) {
        return (SquireSaraConfig) configManager.getConfig(SquireSaraConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    protected void onStart() {
        this.c.add(this.d);
        "".length();
        this.b.register(this.a);
        this.b.register(this.e);
        this.f = lIIlIlIIlIlII[2];
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIlIlIIlIlII[1]];
        clsArr[lIIlIlIIlIlII[2]] = G.class;
        clsArr[lIIlIlIIlIlII[0]] = m.class;
        clsArr[lIIlIlIIlIlII[3]] = I.class;
        clsArr[lIIlIlIIlIlII[4]] = H.class;
        clsArr[lIIlIlIIlIlII[5]] = w.class;
        clsArr[lIIlIlIIlIlII[6]] = t.class;
        clsArr[lIIlIlIIlIlII[7]] = u.class;
        clsArr[lIIlIlIIlIlII[8]] = F.class;
        clsArr[lIIlIlIIlIlII[9]] = s.class;
        clsArr[lIIlIlIIlIlII[10]] = r.class;
        clsArr[lIIlIlIIlIlII[11]] = y.class;
        clsArr[lIIlIlIIlIlII[12]] = z.class;
        clsArr[lIIlIlIIlIlII[13]] = A.class;
        clsArr[lIIlIlIIlIlII[14]] = B.class;
        clsArr[lIIlIlIIlIlII[15]] = C.class;
        clsArr[lIIlIlIIlIlII[16]] = D.class;
        clsArr[lIIlIlIIlIlII[17]] = n.class;
        clsArr[lIIlIlIIlIlII[18]] = v.class;
        clsArr[lIIlIlIIlIlII[19]] = q.class;
        clsArr[lIIlIlIIlIlII[20]] = p.class;
        clsArr[lIIlIlIIlIlII[21]] = x.class;
        return clsArr;
    }

    public boolean a() {
        return this.f;
    }

    private static void lIlIlIllIlllIlI() {
        lIIlIlIIlIlII = new int[22];
        lIIlIlIIlIlII[0] = " ".length();
        lIIlIlIIlIlII[1] = 168 ^ 189;
        lIIlIlIIlIlII[2] = (137 ^ 128) & ((177 ^ 184) ^ (-1));
        lIIlIlIIlIlII[3] = "  ".length();
        lIIlIlIIlIlII[4] = "   ".length();
        lIIlIlIIlIlII[5] = (((123 + 130) - 93) + 0) ^ (((140 + 145) - 269) + 148);
        lIIlIlIIlIlII[6] = 9 ^ 12;
        lIIlIlIIlIlII[7] = 48 ^ 54;
        lIIlIlIIlIlII[8] = 155 ^ 156;
        lIIlIlIIlIlII[9] = (((41 + 197) - 235) + 203) ^ (((181 + 0) - 38) + 55);
        lIIlIlIIlIlII[10] = 28 ^ 21;
        lIIlIlIIlIlII[11] = (121 ^ 93) ^ (138 ^ 164);
        lIIlIlIIlIlII[12] = 80 ^ 91;
        lIIlIlIIlIlII[13] = 80 ^ 92;
        lIIlIlIIlIlII[14] = (5 ^ 112) ^ (77 ^ 53);
        lIIlIlIIlIlII[15] = 86 ^ 88;
        lIIlIlIIlIlII[16] = (176 ^ 131) ^ (86 ^ 106);
        lIIlIlIIlIlII[17] = 159 ^ 143;
        lIIlIlIIlIlII[18] = 189 ^ 172;
        lIIlIlIIlIlII[19] = (((141 + 85) - 205) + 124) ^ (((98 + 19) - 65) + 79);
        lIIlIlIIlIlII[20] = (((131 + 22) - 66) + 56) ^ (((64 + 150) - 176) + 118);
        lIIlIlIIlIlII[21] = (((95 + 180) - 93) + 33) ^ (((131 + 6) - (-57)) + 1);
    }

    protected void onStop() {
        this.c.remove(this.d);
        "".length();
        this.b.unregister(this.a);
        this.b.unregister(this.c);
    }
}
