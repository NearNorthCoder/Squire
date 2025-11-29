/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.saradomin;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.overlay.SaraInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.A;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.B;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.C;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.D;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.F;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.G;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.H;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.I;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.f;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.m;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.n;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.p;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.q;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.r;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.s;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.t;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.u;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.v;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.w;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.x;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.y;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.z;

@PluginDescriptor(name="Squire Saradomin", enabledByDefault=false)
public class SquireSaradomin
extends SquirePlugin {
    @Inject
    private /* synthetic */ f e;
    @Inject
    private /* synthetic */ g a;
    private /* synthetic */ boolean f;
    @Inject
    private /* synthetic */ SaraInfoBox d;
    private static /* synthetic */ int[] lIIlIlIIlIlII;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ OverlayManager c;

    static {
        SquireSaradomin.lIlIlIllIlllIlI();
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    @Provides
    SquireSaraConfig a(ConfigManager configManager) {
        return (SquireSaraConfig)configManager.getConfig(SquireSaraConfig.class);
    }

    protected void onStart() {
        this.c.add((Overlay)this.d);
        "".length();
        this.b.register((Object)this.a);
        this.b.register((Object)this.e);
        this.f = lIIlIlIIlIlII[2];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlIlIIlIlII[1]];
        classArray[SquireSaradomin.lIIlIlIIlIlII[2]] = G.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[0]] = m.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[3]] = I.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[4]] = H.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[5]] = w.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[6]] = t.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[7]] = u.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[8]] = F.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[9]] = s.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[10]] = r.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[11]] = y.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[12]] = z.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[13]] = A.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[14]] = B.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[15]] = C.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[16]] = D.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[17]] = n.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[18]] = v.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[19]] = q.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[20]] = p.class;
        classArray[SquireSaradomin.lIIlIlIIlIlII[21]] = x.class;
        return classArray;
    }

    public SquireSaradomin() {
        this.f = lIIlIlIIlIlII[0];
    }

    public boolean a() {
        return this.f;
    }

    private static void lIlIlIllIlllIlI() {
        lIIlIlIIlIlII = new int[22];
        SquireSaradomin.lIIlIlIIlIlII[0] = " ".length();
        SquireSaradomin.lIIlIlIIlIlII[1] = 0xA8 ^ 0xBD;
        SquireSaradomin.lIIlIlIIlIlII[2] = (0x89 ^ 0x80) & ~(0xB1 ^ 0xB8);
        SquireSaradomin.lIIlIlIIlIlII[3] = "  ".length();
        SquireSaradomin.lIIlIlIIlIlII[4] = "   ".length();
        SquireSaradomin.lIIlIlIIlIlII[5] = 123 + 130 - 93 + 0 ^ 140 + 145 - 269 + 148;
        SquireSaradomin.lIIlIlIIlIlII[6] = 9 ^ 0xC;
        SquireSaradomin.lIIlIlIIlIlII[7] = 0x30 ^ 0x36;
        SquireSaradomin.lIIlIlIIlIlII[8] = 0x9B ^ 0x9C;
        SquireSaradomin.lIIlIlIIlIlII[9] = 41 + 197 - 235 + 203 ^ 181 + 0 - 38 + 55;
        SquireSaradomin.lIIlIlIIlIlII[10] = 0x1C ^ 0x15;
        SquireSaradomin.lIIlIlIIlIlII[11] = 0x79 ^ 0x5D ^ (0x8A ^ 0xA4);
        SquireSaradomin.lIIlIlIIlIlII[12] = 0x50 ^ 0x5B;
        SquireSaradomin.lIIlIlIIlIlII[13] = 0x50 ^ 0x5C;
        SquireSaradomin.lIIlIlIIlIlII[14] = 5 ^ 0x70 ^ (0x4D ^ 0x35);
        SquireSaradomin.lIIlIlIIlIlII[15] = 0x56 ^ 0x58;
        SquireSaradomin.lIIlIlIIlIlII[16] = 0xB0 ^ 0x83 ^ (0x56 ^ 0x6A);
        SquireSaradomin.lIIlIlIIlIlII[17] = 0x9F ^ 0x8F;
        SquireSaradomin.lIIlIlIIlIlII[18] = 0xBD ^ 0xAC;
        SquireSaradomin.lIIlIlIIlIlII[19] = 141 + 85 - 205 + 124 ^ 98 + 19 - 65 + 79;
        SquireSaradomin.lIIlIlIIlIlII[20] = 131 + 22 - 66 + 56 ^ 64 + 150 - 176 + 118;
        SquireSaradomin.lIIlIlIIlIlII[21] = 95 + 180 - 93 + 33 ^ 131 + 6 - -57 + 1;
    }

    protected void onStop() {
        this.c.remove((Overlay)this.d);
        "".length();
        this.b.unregister((Object)this.a);
        this.b.unregister((Object)this.c);
    }
}

