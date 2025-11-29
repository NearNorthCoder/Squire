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
package gg.squire.bandos;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.bandos.overlay.BandosInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import q.s.r.i.e.s.o.u.a.d.n.-.b.A;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;
import q.s.r.i.e.s.o.u.a.d.n.-.b.k;
import q.s.r.i.e.s.o.u.a.d.n.-.b.l;
import q.s.r.i.e.s.o.u.a.d.n.-.b.m;
import q.s.r.i.e.s.o.u.a.d.n.-.b.n;
import q.s.r.i.e.s.o.u.a.d.n.-.b.o;
import q.s.r.i.e.s.o.u.a.d.n.-.b.p;
import q.s.r.i.e.s.o.u.a.d.n.-.b.q;
import q.s.r.i.e.s.o.u.a.d.n.-.b.r;
import q.s.r.i.e.s.o.u.a.d.n.-.b.s;
import q.s.r.i.e.s.o.u.a.d.n.-.b.t;
import q.s.r.i.e.s.o.u.a.d.n.-.b.u;
import q.s.r.i.e.s.o.u.a.d.n.-.b.v;
import q.s.r.i.e.s.o.u.a.d.n.-.b.w;
import q.s.r.i.e.s.o.u.a.d.n.-.b.x;
import q.s.r.i.e.s.o.u.a.d.n.-.b.y;
import q.s.r.i.e.s.o.u.a.d.n.-.b.z;

@PluginDescriptor(name="Squire Bandos", enabledByDefault=false)
public class SquireBandos
extends SquirePlugin {
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
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
        this.a.remove((Overlay)this.b);
        "".length();
    }

    @Provides
    SquireBandosConfig a(ConfigManager configManager) {
        return (SquireBandosConfig)configManager.getConfig(SquireBandosConfig.class);
    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);
        "".length();
    }

    private static void lIlIllIIIlIlII() {
        llIlllllIlI = new int[17];
        SquireBandos.llIlllllIlI[0] = 0x4F ^ 0x5F;
        SquireBandos.llIlllllIlI[1] = (0xE8 ^ 0x91 ^ (0x13 ^ 0x23)) & (0xEE ^ 0xB1 ^ (0x56 ^ 0x40) ^ -" ".length());
        SquireBandos.llIlllllIlI[2] = " ".length();
        SquireBandos.llIlllllIlI[3] = "  ".length();
        SquireBandos.llIlllllIlI[4] = "   ".length();
        SquireBandos.llIlllllIlI[5] = 86 + 73 - 129 + 118 ^ 23 + 91 - 113 + 143;
        SquireBandos.llIlllllIlI[6] = 0x24 ^ 0x23 ^ "  ".length();
        SquireBandos.llIlllllIlI[7] = 79 + 19 - -49 + 0 ^ 133 + 74 - 130 + 72;
        SquireBandos.llIlllllIlI[8] = 0x79 ^ 0x7E;
        SquireBandos.llIlllllIlI[9] = 34 + 132 - 18 + 14 ^ 165 + 67 - 90 + 28;
        SquireBandos.llIlllllIlI[10] = 0x3E ^ 0x37;
        SquireBandos.llIlllllIlI[11] = 106 + 44 - 91 + 114 ^ 135 + 132 - 156 + 56;
        SquireBandos.llIlllllIlI[12] = 0x7E ^ 0x75;
        SquireBandos.llIlllllIlI[13] = 165 + 0 - 55 + 94 ^ 72 + 144 - 130 + 106;
        SquireBandos.llIlllllIlI[14] = 8 ^ 0x65 ^ (0xF9 ^ 0x99);
        SquireBandos.llIlllllIlI[15] = 0x1D ^ 0x4D ^ (0xE5 ^ 0xBB);
        SquireBandos.llIlllllIlI[16] = 158 + 114 - 184 + 89 ^ 60 + 140 - 53 + 43;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlllllIlI[0]];
        classArray[SquireBandos.llIlllllIlI[1]] = w.class;
        classArray[SquireBandos.llIlllllIlI[2]] = m.class;
        classArray[SquireBandos.llIlllllIlI[3]] = r.class;
        classArray[SquireBandos.llIlllllIlI[4]] = p.class;
        classArray[SquireBandos.llIlllllIlI[5]] = n.class;
        classArray[SquireBandos.llIlllllIlI[6]] = s.class;
        classArray[SquireBandos.llIlllllIlI[7]] = t.class;
        classArray[SquireBandos.llIlllllIlI[8]] = v.class;
        classArray[SquireBandos.llIlllllIlI[9]] = z.class;
        classArray[SquireBandos.llIlllllIlI[10]] = x.class;
        classArray[SquireBandos.llIlllllIlI[11]] = l.class;
        classArray[SquireBandos.llIlllllIlI[12]] = u.class;
        classArray[SquireBandos.llIlllllIlI[13]] = o.class;
        classArray[SquireBandos.llIlllllIlI[14]] = q.class;
        classArray[SquireBandos.llIlllllIlI[15]] = A.class;
        classArray[SquireBandos.llIlllllIlI[16]] = y.class;
        return classArray;
    }

    static {
        SquireBandos.lIlIllIIIlIlII();
    }
}

