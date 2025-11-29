package gg.squire.wintertodt;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.wintertodt.overlay.WintertodtInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.e;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.f;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.g;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.h;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.i;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.j;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.k;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.l;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.m;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.n;
import p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.o;
@Singleton
@PluginDescriptor(name = "Squire Wintertodt")
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:gg/squire/wintertodt/SquireWintertodt.class */
public class SquireWintertodt extends SquirePlugin {
    @Inject
    private /* synthetic */ WintertodtInfoBox c;
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ b b;
    private static /* synthetic */ int[] lIlIllllllllI;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int f;
    @Inject
    private /* synthetic */ EventBus e;

    protected void onStop() {
        this.e.unregister(this.b);
        this.d.remove(this.c);
        "".length();
    }

    @Provides
    SquireWintertodtConfig a(ConfigManager configManager) {
        return (SquireWintertodtConfig) configManager.getConfig(SquireWintertodtConfig.class);
    }

    private static void llIIIIlllIIlIll() {
        lIlIllllllllI = new int[12];
        lIlIllllllllI[0] = 67 ^ 72;
        lIlIllllllllI[1] = (17 ^ 55) & ((106 ^ 76) ^ (-1));
        lIlIllllllllI[2] = " ".length();
        lIlIllllllllI[3] = "  ".length();
        lIlIllllllllI[4] = "   ".length();
        lIlIllllllllI[5] = (149 ^ 130) ^ (111 ^ 124);
        lIlIllllllllI[6] = (((5 + 67) - (-37)) + 54) ^ (((71 + 14) - 82) + 163);
        lIlIllllllllI[7] = (((18 + 91) - (-12)) + 6) ^ (100 ^ 29);
        lIlIllllllllI[8] = 186 ^ 189;
        lIlIllllllllI[9] = 95 ^ 87;
        lIlIllllllllI[10] = (17 ^ 3) ^ (16 ^ 11);
        lIlIllllllllI[11] = 112 ^ 122;
    }

    public int a() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIllllllllI[0]];
        clsArr[lIlIllllllllI[1]] = h.class;
        clsArr[lIlIllllllllI[2]] = f.class;
        clsArr[lIlIllllllllI[3]] = g.class;
        clsArr[lIlIllllllllI[4]] = l.class;
        clsArr[lIlIllllllllI[5]] = o.class;
        clsArr[lIlIllllllllI[6]] = n.class;
        clsArr[lIlIllllllllI[7]] = m.class;
        clsArr[lIlIllllllllI[8]] = j.class;
        clsArr[lIlIllllllllI[9]] = k.class;
        clsArr[lIlIllllllllI[10]] = e.class;
        clsArr[lIlIllllllllI[11]] = i.class;
        return clsArr;
    }

    protected void onStart() {
        this.e.register(this.b);
        this.d.add(this.c);
        "".length();
    }

    static {
        llIIIIlllIIlIll();
        a = LoggerFactory.getLogger(SquireWintertodt.class);
    }
}
