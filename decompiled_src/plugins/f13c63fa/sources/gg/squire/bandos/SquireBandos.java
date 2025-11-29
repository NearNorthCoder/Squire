package gg.squire.bandos;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.bandos.overlay.BandosInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.A;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.e;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.k;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.l;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.m;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.n;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.o;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.p;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.q;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.r;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.s;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.t;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.u;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.v;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.w;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.x;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.y;
import q.s.r.i.e.s.o.u.a.d.n.p000.b.z;
@PluginDescriptor(name = "Squire Bandos", enabledByDefault = false)
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:gg/squire/bandos/SquireBandos.class */
public class SquireBandos extends SquirePlugin {
    @Inject
    private /* synthetic */ k e;
    private static /* synthetic */ int[] llIlllllIlI;
    @Inject
    private /* synthetic */ EventBus c;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ BandosInfoBox b;
    @Inject
    private /* synthetic */ e d;

    protected void onStop() {
        this.c.unregister(this.d);
        this.c.unregister(this.e);
        this.a.remove(this.b);
        "".length();
    }

    @Provides
    SquireBandosConfig a(ConfigManager configManager) {
        return (SquireBandosConfig) configManager.getConfig(SquireBandosConfig.class);
    }

    protected void onStart() {
        this.c.register(this.d);
        this.c.register(this.e);
        this.a.add(this.b);
        "".length();
    }

    private static void lIlIllIIIlIlII() {
        llIlllllIlI = new int[17];
        llIlllllIlI[0] = 79 ^ 95;
        llIlllllIlI[1] = ((232 ^ 145) ^ (19 ^ 35)) & (((238 ^ 177) ^ (86 ^ 64)) ^ (-" ".length()));
        llIlllllIlI[2] = " ".length();
        llIlllllIlI[3] = "  ".length();
        llIlllllIlI[4] = "   ".length();
        llIlllllIlI[5] = (((86 + 73) - 129) + 118) ^ (((23 + 91) - 113) + 143);
        llIlllllIlI[6] = (36 ^ 35) ^ "  ".length();
        llIlllllIlI[7] = (((79 + 19) - (-49)) + 0) ^ (((133 + 74) - 130) + 72);
        llIlllllIlI[8] = 121 ^ 126;
        llIlllllIlI[9] = (((34 + 132) - 18) + 14) ^ (((165 + 67) - 90) + 28);
        llIlllllIlI[10] = 62 ^ 55;
        llIlllllIlI[11] = (((106 + 44) - 91) + 114) ^ (((135 + 132) - 156) + 56);
        llIlllllIlI[12] = 126 ^ 117;
        llIlllllIlI[13] = (((165 + 0) - 55) + 94) ^ (((72 + 144) - 130) + 106);
        llIlllllIlI[14] = (8 ^ 101) ^ (249 ^ 153);
        llIlllllIlI[15] = (29 ^ 77) ^ (229 ^ 187);
        llIlllllIlI[16] = (((158 + 114) - 184) + 89) ^ (((60 + 140) - 53) + 43);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIlllllIlI[0]];
        clsArr[llIlllllIlI[1]] = w.class;
        clsArr[llIlllllIlI[2]] = m.class;
        clsArr[llIlllllIlI[3]] = r.class;
        clsArr[llIlllllIlI[4]] = p.class;
        clsArr[llIlllllIlI[5]] = n.class;
        clsArr[llIlllllIlI[6]] = s.class;
        clsArr[llIlllllIlI[7]] = t.class;
        clsArr[llIlllllIlI[8]] = v.class;
        clsArr[llIlllllIlI[9]] = z.class;
        clsArr[llIlllllIlI[10]] = x.class;
        clsArr[llIlllllIlI[11]] = l.class;
        clsArr[llIlllllIlI[12]] = u.class;
        clsArr[llIlllllIlI[13]] = o.class;
        clsArr[llIlllllIlI[14]] = q.class;
        clsArr[llIlllllIlI[15]] = A.class;
        clsArr[llIlllllIlI[16]] = y.class;
        return clsArr;
    }

    static {
        lIlIllIIIlIlII();
    }
}
