/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.mta;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.mta.MagicArenaConfig;
import gg.squire.mta.overlay.InfoBox;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import m.u.a.-.e.s.q.t.i.r.a;
import m.u.a.-.e.s.q.t.i.r.b;
import m.u.a.-.e.s.q.t.i.r.c;
import m.u.a.-.e.s.q.t.i.r.e;
import m.u.a.-.e.s.q.t.i.r.j;
import m.u.a.-.e.s.q.t.i.r.l;
import m.u.a.-.e.s.q.t.i.r.n;
import m.u.a.-.e.s.q.t.i.r.p;
import m.u.a.-.e.s.q.t.i.r.q;
import m.u.a.-.e.s.q.t.i.r.r;
import m.u.a.-.e.s.q.t.i.r.s;
import m.u.a.-.e.s.q.t.i.r.t;
import m.u.a.-.e.s.q.t.i.r.u;
import m.u.a.-.e.s.q.t.i.r.v;
import m.u.a.-.e.s.q.t.i.r.x;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@Singleton
@PluginDescriptor(name="Squire Mage Training Arena", description="Automatically completes MTA for nice rewards!", tags={"mta", "magic", "minigame", "overlay"}, enabledByDefault=false)
public class SquireMTA
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ InfoBox e;
    @Inject
    private /* synthetic */ q k;
    @Inject
    private /* synthetic */ l g;
    private /* synthetic */ b[] m;
    @Inject
    private /* synthetic */ OverlayManager c;
    private final /* synthetic */ Map<c, Boolean> b;
    @Inject
    private /* synthetic */ MagicArenaConfig j;
    @Inject
    private /* synthetic */ e f;
    private static /* synthetic */ int[] lllIllIIlIll;
    @Inject
    private /* synthetic */ n h;
    @Inject
    private /* synthetic */ p l;
    @Inject
    private /* synthetic */ j i;
    private final /* synthetic */ Map<c, Integer> a;

    public SquireMTA() {
        this.a = new EnumMap<c, Integer>(c.class);
        this.b = new HashMap<c, Boolean>();
    }

    private static boolean lIIIllIIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    public int c(c c2) {
        return this.a.getOrDefault((Object)c2, lllIllIIlIll[7]);
    }

    public Map<c, Integer> a() {
        return this.a;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStop() {
        void lllllllllllllllIIllIlIIIIlIlIlll;
        this.c.remove((Overlay)this.k);
        "".length();
        this.c.remove((Overlay)this.l);
        "".length();
        this.c.remove((Overlay)this.e);
        "".length();
        b[] bArray = this.m;
        int n2 = bArray.length;
        int lllllllllllllllIIllIlIIIIlIlIllI = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(lllllllllllllllIIllIlIIIIlIlIllI, (int)lllllllllllllllIIllIlIIIIlIlIlll)) {
            SquireMTA lllllllllllllllIIllIlIIIIlIllIIl;
            void lllllllllllllllIIllIlIIIIlIllIII;
            void lllllllllllllllIIllIlIIIIlIlIlIl = lllllllllllllllIIllIlIIIIlIllIII[lllllllllllllllIIllIlIIIIlIlIllI];
            lllllllllllllllIIllIlIIIIlIllIIl.d.unregister((Object)lllllllllllllllIIllIlIIIIlIlIlIl);
            ++lllllllllllllllIIllIlIIIIlIlIllI;
            "".length();
            if ("   ".length() > 0) continue;
            return;
        }
        this.h.F();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIllIIlIll[0]];
        classArray[SquireMTA.lllIllIIlIll[1]] = u.class;
        classArray[SquireMTA.lllIllIIlIll[2]] = x.class;
        classArray[SquireMTA.lllIllIIlIll[3]] = r.class;
        classArray[SquireMTA.lllIllIIlIll[4]] = v.class;
        classArray[SquireMTA.lllIllIIlIll[5]] = t.class;
        classArray[SquireMTA.lllIllIIlIll[6]] = s.class;
        return classArray;
    }

    static {
        SquireMTA.lIIIllIIllllIIl();
    }

    public void a(c c2, int n2) {
        System.out.println("Setting points for " + c2 + " to " + n2);
        this.a.put(c2, n2);
        "".length();
    }

    @Provides
    public MagicArenaConfig a(ConfigManager configManager) {
        return (MagicArenaConfig)configManager.getConfig(MagicArenaConfig.class);
    }

    public int d(c c2) {
        switch (m.u.a.-.e.s.q.t.i.r.a.n[c2.ordinal()]) {
            case 1: {
                SquireMTA lllllllllllllllIIllIlIIIIlIlIIlI;
                return lllllllllllllllIIllIlIIIIlIlIIlI.j.alchemyPoints();
            }
            case 2: {
                SquireMTA lllllllllllllllIIllIlIIIIlIlIIlI;
                return lllllllllllllllIIllIlIIIIlIlIIlI.j.graveyardPoints();
            }
            case 3: {
                SquireMTA lllllllllllllllIIllIlIIIIlIlIIlI;
                return lllllllllllllllIIllIlIIIIlIlIIlI.j.telekineticPoints();
            }
            case 4: {
                SquireMTA lllllllllllllllIIllIlIIIIlIlIIlI;
                return lllllllllllllllIIllIlIIIIlIlIIlI.j.enchantmentPoints();
            }
        }
        return lllIllIIlIll[7];
    }

    public b[] b() {
        return this.m;
    }

    private static void lIIIllIIllllIIl() {
        lllIllIIlIll = new int[8];
        SquireMTA.lllIllIIlIll[0] = 0x9F ^ 0x99;
        SquireMTA.lllIllIIlIll[1] = (0x13 ^ 0x3F ^ (0xB1 ^ 0x94)) & (0x80 ^ 0xBD ^ (0x80 ^ 0xB4) ^ -" ".length());
        SquireMTA.lllIllIIlIll[2] = " ".length();
        SquireMTA.lllIllIIlIll[3] = "  ".length();
        SquireMTA.lllIllIIlIll[4] = "   ".length();
        SquireMTA.lllIllIIlIll[5] = 0x74 ^ 0x70;
        SquireMTA.lllIllIIlIll[6] = 0xFD ^ 0xA0 ^ (0x30 ^ 0x68);
        SquireMTA.lllIllIIlIll[7] = -" ".length();
    }

    public void a(c c2) {
        this.b.put(c2, lllIllIIlIll[2]);
        "".length();
    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void lllllllllllllllIIllIlIIIIllIIIIl;
        this.c.add((Overlay)this.k);
        "".length();
        this.c.add((Overlay)this.l);
        "".length();
        this.c.add((Overlay)this.e);
        "".length();
        b[] bArray = new b[lllIllIIlIll[5]];
        bArray[SquireMTA.lllIllIIlIll[1]] = this.f;
        bArray[SquireMTA.lllIllIIlIll[2]] = this.g;
        bArray[SquireMTA.lllIllIIlIll[3]] = this.h;
        bArray[SquireMTA.lllIllIIlIll[4]] = this.i;
        b[] bArray2 = this.m = bArray;
        int n2 = bArray2.length;
        int lllllllllllllllIIllIlIIIIllIIIII = lllIllIIlIll[1];
        while (SquireMTA.lIIIllIIllllIlI(lllllllllllllllIIllIlIIIIllIIIII, (int)lllllllllllllllIIllIlIIIIllIIIIl)) {
            SquireMTA lllllllllllllllIIllIlIIIIllIIIll;
            void lllllllllllllllIIllIlIIIIllIIIlI;
            void lllllllllllllllIIllIlIIIIlIlllll = lllllllllllllllIIllIlIIIIllIIIlI[lllllllllllllllIIllIlIIIIllIIIII];
            lllllllllllllllIIllIlIIIIllIIIll.d.register((Object)lllllllllllllllIIllIlIIIIlIlllll);
            ++lllllllllllllllIIllIlIIIIllIIIII;
            "".length();
            if (null == null) continue;
            return;
        }
    }

    public boolean b(c c2) {
        return this.b.getOrDefault((Object)c2, lllIllIIlIll[1]);
    }
}

