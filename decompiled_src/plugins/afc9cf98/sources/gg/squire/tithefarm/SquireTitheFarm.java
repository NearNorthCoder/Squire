package gg.squire.tithefarm;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.tithefarm.overlay.TitheInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.i;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.j;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.k;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.l;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.m;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.n;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.o;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.p;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.q;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.s;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.t;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.u;
import r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001.v;
@PluginDescriptor(name = "Squire Tithe Farm", description = "Automatically harvests and collects from Tithe Farm", enabledByDefault = false)
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:gg/squire/tithefarm/SquireTitheFarm.class */
public class SquireTitheFarm extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus e;
    private /* synthetic */ int g = lIIllllllIllI[0];
    public /* synthetic */ int a;
    @Inject
    private /* synthetic */ i d;
    @Inject
    private /* synthetic */ j f;
    private static /* synthetic */ int[] lIIllllllIllI;
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ TitheInfoBox c;

    protected void onStart() {
        this.e.register(this.d);
        this.e.register(this.f);
        this.b.add(this.c);
        "".length();
        this.b.add(this.f);
        "".length();
        this.a = lIIllllllIllI[2];
        this.g = lIIllllllIllI[0];
        this.d.s();
    }

    public int a() {
        return this.a;
    }

    private static void lIllIllIIIlIIll() {
        lIIllllllIllI = new int[16];
        lIIllllllIllI[0] = (-((-1367) & 19799)) & (-12307) & 31738;
        lIIllllllIllI[1] = (208 ^ 186) ^ (106 ^ 11);
        lIIllllllIllI[2] = ((131 ^ 153) ^ (142 ^ 170)) & (((((130 + 18) - 92) + 80) ^ (((118 + 24) - 124) + 164)) ^ (-" ".length()));
        lIIllllllIllI[3] = " ".length();
        lIIllllllIllI[4] = "  ".length();
        lIIllllllIllI[5] = "   ".length();
        lIIllllllIllI[6] = (((42 + 29) - (-30)) + 29) ^ (((16 + 51) - 44) + 111);
        lIIllllllIllI[7] = (61 ^ 20) ^ (126 ^ 82);
        lIIllllllIllI[8] = (((86 + 13) - 80) + 133) ^ (((96 + 92) - 107) + 77);
        lIIllllllIllI[9] = 182 ^ 177;
        lIIllllllIllI[10] = 37 ^ 45;
        lIIllllllIllI[11] = 11 ^ 2;
        lIIllllllIllI[12] = 103 ^ 109;
        lIIllllllIllI[13] = (-16394) & 29819;
        lIIllllllIllI[14] = (-18445) & 31871;
        lIIllllllIllI[15] = (-((-14005) & 32446)) & (-897) & 32765;
    }

    static {
        lIllIllIIIlIIll();
    }

    protected void onStop() {
        this.e.unregister(this.d);
        this.e.unregister(this.f);
        this.b.remove(this.c);
        "".length();
        this.b.remove(this.f);
        "".length();
    }

    private static boolean lIllIllIIIlIlII(int i, int i2) {
        return i != i2;
    }

    public int b() {
        return this.g;
    }

    @Provides
    SquireTitheConfig a(ConfigManager configManager) {
        return (SquireTitheConfig) configManager.getConfig(SquireTitheConfig.class);
    }

    private static boolean lIllIllIIIlIlIl(int i, int i2) {
        return i == i2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllllllIllI[1]];
        clsArr[lIIllllllIllI[2]] = s.class;
        clsArr[lIIllllllIllI[3]] = v.class;
        clsArr[lIIllllllIllI[4]] = p.class;
        clsArr[lIIllllllIllI[5]] = u.class;
        clsArr[lIIllllllIllI[6]] = t.class;
        clsArr[lIIllllllIllI[7]] = m.class;
        clsArr[lIIllllllIllI[8]] = o.class;
        clsArr[lIIllllllIllI[9]] = n.class;
        clsArr[lIIllllllIllI[10]] = l.class;
        clsArr[lIIllllllIllI[11]] = k.class;
        clsArr[lIIllllllIllI[12]] = q.class;
        return clsArr;
    }

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.g = i;
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIllIllIIIlIlII(inventoryChanged.getItemId(), lIIllllllIllI[13]) && lIllIllIIIlIlII(inventoryChanged.getItemId(), lIIllllllIllI[14]) && !lIllIllIIIlIlIl(inventoryChanged.getItemId(), lIIllllllIllI[15])) {
            return;
        }
        this.a += lIIllllllIllI[3];
    }
}
