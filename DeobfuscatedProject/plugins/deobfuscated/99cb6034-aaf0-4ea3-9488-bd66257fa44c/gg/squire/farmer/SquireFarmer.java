/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.WidgetClosed
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.RuneScapeProfileChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.farmer;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.B;
import -.m.e.a.u.s.r.r.q.i.r.e.f.a;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aA;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aB;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aC;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aD;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aE;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aF;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aH;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aI;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aJ;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aK;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aL;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aM;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aO;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aP;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aQ;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aR;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aT;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aU;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aV;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aW;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aY;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ay;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ba;
import -.m.e.a.u.s.r.r.q.i.r.e.f.bb;
import -.m.e.a.u.s.r.r.q.i.r.e.f.bc;
import -.m.e.a.u.s.r.r.q.i.r.e.f.bd;
import -.m.e.a.u.s.r.r.q.i.r.e.f.be;
import -.m.e.a.u.s.r.r.q.i.r.e.f.bf;
import -.m.e.a.u.s.r.r.q.i.r.e.f.bg;
import -.m.e.a.u.s.r.r.q.i.r.e.f.e;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.j;
import -.m.e.a.u.s.r.r.q.i.r.e.f.o;
import -.m.e.a.u.s.r.r.q.i.r.e.f.p;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.farmer.SquireFarmerConfig;
import gg.squire.farmer.overlay.StateOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.RuneScapeProfileChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Farmer", description="Automatically does farm runs", enabledByDefault=false)
@SquireUtil
public class SquireFarmer
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus a;
    private /* synthetic */ boolean k;
    private /* synthetic */ o o;
    @Inject
    private /* synthetic */ ay e;
    @Inject
    private /* synthetic */ StateOverlayPanel g;
    @Inject
    private /* synthetic */ SquireFarmerConfig h;
    @Inject
    private /* synthetic */ j c;
    private static /* synthetic */ String[] lIlllIIlllll;
    @Inject
    private /* synthetic */ Client j;
    @Inject
    private /* synthetic */ ConfigManager i;
    @Inject
    private /* synthetic */ OverlayManager d;
    @Inject
    private /* synthetic */ e f;
    private static /* synthetic */ int[] lIlllIlIIIII;
    private /* synthetic */ WorldPoint l;
    @Inject
    private /* synthetic */ f b;
    private /* synthetic */ boolean m;
    private /* synthetic */ int n;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlllIlIIIII[2]];
        classArray[SquireFarmer.lIlllIlIIIII[1]] = bb.class;
        classArray[SquireFarmer.lIlllIlIIIII[0]] = be.class;
        classArray[SquireFarmer.lIlllIlIIIII[3]] = bd.class;
        classArray[SquireFarmer.lIlllIlIIIII[4]] = ba.class;
        classArray[SquireFarmer.lIlllIlIIIII[5]] = aU.class;
        classArray[SquireFarmer.lIlllIlIIIII[6]] = aY.class;
        classArray[SquireFarmer.lIlllIlIIIII[7]] = aW.class;
        classArray[SquireFarmer.lIlllIlIIIII[8]] = bc.class;
        classArray[SquireFarmer.lIlllIlIIIII[9]] = aT.class;
        classArray[SquireFarmer.lIlllIlIIIII[10]] = aV.class;
        classArray[SquireFarmer.lIlllIlIIIII[11]] = aO.class;
        classArray[SquireFarmer.lIlllIlIIIII[12]] = aL.class;
        classArray[SquireFarmer.lIlllIlIIIII[13]] = aM.class;
        classArray[SquireFarmer.lIlllIlIIIII[14]] = aP.class;
        classArray[SquireFarmer.lIlllIlIIIII[15]] = aQ.class;
        classArray[SquireFarmer.lIlllIlIIIII[16]] = aR.class;
        classArray[SquireFarmer.lIlllIlIIIII[17]] = bf.class;
        classArray[SquireFarmer.lIlllIlIIIII[18]] = bg.class;
        classArray[SquireFarmer.lIlllIlIIIII[19]] = aD.class;
        classArray[SquireFarmer.lIlllIlIIIII[20]] = aC.class;
        classArray[SquireFarmer.lIlllIlIIIII[21]] = aH.class;
        classArray[SquireFarmer.lIlllIlIIIII[22]] = aJ.class;
        classArray[SquireFarmer.lIlllIlIIIII[23]] = aK.class;
        classArray[SquireFarmer.lIlllIlIIIII[24]] = aI.class;
        classArray[SquireFarmer.lIlllIlIIIII[25]] = aE.class;
        classArray[SquireFarmer.lIlllIlIIIII[26]] = aF.class;
        classArray[SquireFarmer.lIlllIlIIIII[27]] = aA.class;
        classArray[SquireFarmer.lIlllIlIIIII[28]] = aB.class;
        return classArray;
    }

    protected void onStop() {
        this.a.unregister((Object)this.b);
        this.a.unregister((Object)this.e);
        this.a.unregister((Object)this.f);
        this.a.unregister((Object)this.c);
        this.d.remove((Overlay)this.g);
        0;
        this.d.remove((Overlay)this.e);
        0;
        this.l = null;
        this.m = lIlllIlIIIII[1];
        this.b.b(this.a);
    }

    public boolean d() {
        return this.k;
    }

    private static boolean lllIllIIIIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIllIIIIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void lllllllllllllllIlIllIllIIllIlIIl;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int lllllllllllllllIlIllIllIIllIlIII = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(lllllllllllllllIlIllIllIIllIlIII, (int)lllllllllllllllIlIllIllIIllIlIIl)) {
            SquireFarmer lllllllllllllllIlIllIllIIllIlIll;
            void lllllllllllllllIlIllIllIIllIlIlI;
            void lllllllllllllllIlIllIllIIllIIlll = lllllllllllllllIlIllIllIIllIlIlI[lllllllllllllllIlIllIllIIllIlIII];
            if (SquireFarmer.lllIllIIIIIllI(lllllllllllllllIlIllIllIIllIlIll.c((o)lllllllllllllllIlIllIllIIllIIlll) ? 1 : 0)) {
                0;
                if (1 == 0) {
                    return ((0x49 ^ 0xF) & ~(0x45 ^ 3)) != 0;
                }
            } else if (SquireFarmer.lllIllIIIIIllI(lllllllllllllllIlIllIllIIllIlIll.a((o)lllllllllllllllIlIllIllIIllIIlll) ? 1 : 0)) {
                return lIlllIlIIIII[0];
            }
            ++lllllllllllllllIlIllIllIIllIlIII;
            0;
            if ((72 + 147 - 158 + 130 ^ 79 + 134 - 167 + 141) > 1) continue;
            return ((61 + 16 - 53 + 136 ^ 76 + 95 - 82 + 79) & (0x83 ^ 0x98 ^ (0x51 ^ 0x42) ^ -1)) != 0;
        }
        return lIlllIlIIIII[1];
    }

    private static boolean lllIllIIIIIllI(int n2) {
        return n2 != 0;
    }

    public o a() {
        if (SquireFarmer.lllIllIIIIIlII((Object)this.o)) {
            SquireFarmer lllllllllllllllIlIllIllIIllllIll;
            if (SquireFarmer.lllIllIIIIIllI(this.b(this.o) ? 1 : 0)) {
                this.o = null;
            }
            return lllllllllllllllIlIllIllIIllllIll.o;
        }
        this.o = this.b();
        return this.o;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    private boolean c(o o2) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[o2.ordinal()]) {
            case 1: {
                SquireFarmer lllllllllllllllIlIllIllIIlIllIII;
                p[] lllllllllllllllIlIllIllIIlIlIllI = p.values();
                int lllllllllllllllIlIllIllIIlIlIlIl = lllllllllllllllIlIllIllIIlIlIllI.length;
                int lllllllllllllllIlIllIllIIlIlIlII = lIlllIlIIIII[1];
                while (SquireFarmer.lllIllIIIIlIII(lllllllllllllllIlIllIllIIlIlIlII, lllllllllllllllIlIllIllIIlIlIlIl)) {
                    p lllllllllllllllIlIllIllIIlIlIIll = lllllllllllllllIlIllIllIIlIlIllI[lllllllllllllllIlIllIllIIlIlIlII];
                    if (SquireFarmer.lllIllIIIIIllI(((Boolean)lllllllllllllllIlIllIllIIlIllIII.i.getConfiguration(lIlllIIlllll[lIlllIlIIIII[4]], lllllllllllllllIlIllIllIIlIlIIll.name().toLowerCase() + ".enabled", Boolean.TYPE)).booleanValue() ? 1 : 0)) {
                        return lIlllIlIIIII[1];
                    }
                    ++lllllllllllllllIlIllIllIIlIlIlII;
                    0;
                    if (-1 <= 0) continue;
                    return ((0x34 ^ 9) & ~(0x15 ^ 0x28)) != 0;
                }
                0;
                if ((3 & (3 ^ -1)) >= 0) break;
                return ((0x20 ^ 0x32 ^ (0xCD ^ 0x93)) & (0x72 ^ 0x5E ^ (0x23 ^ 0x43) ^ -1)) != 0;
            }
            case 2: {
                boolean bl;
                SquireFarmer lllllllllllllllIlIllIllIIlIllIII;
                if (SquireFarmer.lllIllIIIIIlIl(lllllllllllllllIlIllIllIIlIllIII.h.birdhouses_enabled() ? 1 : 0)) {
                    bl = lIlllIlIIIII[0];
                    0;
                    if (null != null) {
                        return ((0xBF ^ 0x83 ^ (0x59 ^ 0x61)) & (0x5F ^ 8 ^ (0x52 ^ 1) ^ -1)) != 0;
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
        }
        return lIlllIlIIIII[0];
    }

    private static String lllIlIllllllll(String lllllllllllllllIlIllIllIIlIIIlIl, String lllllllllllllllIlIllIllIIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIllIllIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIlllIlIIIII[9]), "DES");
            Cipher lllllllllllllllIlIllIllIIlIIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllIIlIIlIIl.init(lIlllIlIIIII[3], lllllllllllllllIlIllIllIIlIIlIlI);
            return new String(lllllllllllllllIlIllIllIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIllIllIIlIIlIII) {
            lllllllllllllllIlIllIllIIlIIlIII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(WidgetClosed widgetClosed) {
        if (SquireFarmer.lllIllIIIIIlll(widgetClosed.getModalMode(), lIlllIlIIIII[0])) {
            this.n = this.j.getTickCount();
        }
    }

    private static void lllIllIIIIIIIl() {
        lIlllIIlllll = new String[lIlllIlIIIII[5]];
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]] = SquireFarmer."Bird nest";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]] = SquireFarmer."Hammer";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]] = SquireFarmer."Chisel";
        SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[4]] = SquireFarmer."squirefarmer";
    }

    private static boolean lllIllIIIIIIll(Object object, Object object2) {
        return object != object2;
    }

    static {
        SquireFarmer.lllIllIIIIIIlI();
        SquireFarmer.lllIllIIIIIIIl();
    }

    /*
     * WARNING - void declaration
     */
    private o b() {
        void lllllllllllllllIlIllIllIIlllIIll;
        o[] oArray = -.m.e.a.u.s.r.r.q.i.r.e.f.o.values();
        int n2 = oArray.length;
        int lllllllllllllllIlIllIllIIlllIIlI = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(lllllllllllllllIlIllIllIIlllIIlI, (int)lllllllllllllllIlIllIllIIlllIIll)) {
            SquireFarmer lllllllllllllllIlIllIllIIlllIlIl;
            void lllllllllllllllIlIllIllIIlllIlII;
            void lllllllllllllllIlIllIllIIlllIIIl = lllllllllllllllIlIllIllIIlllIlII[lllllllllllllllIlIllIllIIlllIIlI];
            if (SquireFarmer.lllIllIIIIIlIl(lllllllllllllllIlIllIllIIlllIlIl.b((o)lllllllllllllllIlIllIllIIlllIIIl) ? 1 : 0)) {
                if (SquireFarmer.lllIllIIIIIllI(lllllllllllllllIlIllIllIIlllIlIl.c((o)lllllllllllllllIlIllIllIIlllIIIl) ? 1 : 0)) {
                    0;
                    if (null != null) {
                        return null;
                    }
                } else {
                    return lllllllllllllllIlIllIllIIlllIIIl;
                }
            }
            ++lllllllllllllllIlIllIllIIlllIIlI;
            0;
            if (3 > ((9 ^ 0x23) & ~(0x58 ^ 0x72))) continue;
            return null;
        }
        this.a(lIlllIlIIIII[0]);
        return null;
    }

    private static String lllIllIIIIIIII(String lllllllllllllllIlIllIllIIIllIIlI, String lllllllllllllllIlIllIllIIIllIllI) {
        lllllllllllllllIlIllIllIIIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIllIIIllIlIl = new StringBuilder();
        char[] lllllllllllllllIlIllIllIIIllIlII = lllllllllllllllIlIllIllIIIllIllI.toCharArray();
        int lllllllllllllllIlIllIllIIIllIIll = lIlllIlIIIII[1];
        char[] lllllllllllllllIlIllIllIIIlIllIl = lllllllllllllllIlIllIllIIIllIIlI.toCharArray();
        int lllllllllllllllIlIllIllIIIlIllII = lllllllllllllllIlIllIllIIIlIllIl.length;
        int lllllllllllllllIlIllIllIIIlIlIll = lIlllIlIIIII[1];
        while (SquireFarmer.lllIllIIIIlIII(lllllllllllllllIlIllIllIIIlIlIll, lllllllllllllllIlIllIllIIIlIllII)) {
            char lllllllllllllllIlIllIllIIIlllIII = lllllllllllllllIlIllIllIIIlIllIl[lllllllllllllllIlIllIllIIIlIlIll];
            lllllllllllllllIlIllIllIIIllIlIl.append((char)(lllllllllllllllIlIllIllIIIlllIII ^ lllllllllllllllIlIllIllIIIllIlII[lllllllllllllllIlIllIllIIIllIIll % lllllllllllllllIlIllIllIIIllIlII.length]));
            0;
            ++lllllllllllllllIlIllIllIIIllIIll;
            ++lllllllllllllllIlIllIllIIIlIlIll;
            0;
            if (3 != -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIllIIIllIlIl);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(o o2) {
        void lllllllllllllllIlIllIllIIllIIIll;
        if (SquireFarmer.lllIllIIIIlIIl((Object)o2)) {
            return lIlllIlIIIII[1];
        }
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[lllllllllllllllIlIllIllIIllIIIll.ordinal()]) {
            case 1: {
                boolean bl;
                SquireFarmer lllllllllllllllIlIllIllIIllIIlII;
                if (SquireFarmer.lllIllIIIIlIlI((Object)lllllllllllllllIlIllIllIIllIIlII.b.a(A.HERB), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];
                    0;
                    if (((0x45 ^ 0x10) & ~(0xC1 ^ 0x94)) > 0) {
                        return ((0xAA ^ 0xBD) & ~(0x57 ^ 0x40)) != 0;
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
            case 2: {
                boolean bl;
                SquireFarmer lllllllllllllllIlIllIllIIllIIlII;
                lllllllllllllllIlIllIllIIllIIlII.c.P();
                0;
                if (SquireFarmer.lllIllIIIIlIlI((Object)lllllllllllllllIlIllIllIIllIIlII.c.p(), (Object)B.COMPLETED)) {
                    bl = lIlllIlIIIII[0];
                    0;
                    if (((0xB9 ^ 0xAF) & ~(0x3D ^ 0x2B)) >= (0x63 ^ 0x67)) {
                        return ((0x83 ^ 0x99) & ~(0xAF ^ 0xB5)) != 0;
                    }
                } else {
                    bl = lIlllIlIIIII[1];
                }
                return bl;
            }
        }
        return lIlllIlIIIII[1];
    }

    private static boolean lllIllIIIIlIIl(Object object) {
        return object == null;
    }

    /*
     * Unable to fully structure code
     */
    private boolean b(o var1_1) {
        switch (-.m.e.a.u.s.r.r.q.i.r.e.f.a.p[var1_1.ordinal()]) {
            case 1: {
                if (SquireFarmer.lllIllIIIIlIIl(lllllllllllllllIlIllIllIIllIIIII.b.x())) {
                    v0 = SquireFarmer.lIlllIlIIIII[0];
                    0;
                    if (((178 ^ 130) & ~(125 ^ 77)) != 0) {
                        return (boolean)((46 ^ 112) & ~(63 ^ 97));
                    }
                } else {
                    v0 = SquireFarmer.lIlllIlIIIII[1];
                }
                return v0;
            }
            case 2: {
                if (!SquireFarmer.lllIllIIIIlIIl((Object)lllllllllllllllIlIllIllIIllIIIII.c.O())) ** GOTO lbl-1000
                if (!SquireFarmer.lllIllIIIIIIll(Game.getState(), GameState.LOGIN_SCREEN)) ** GOTO lbl-1000
                v1 = new String[SquireFarmer.lIlllIlIIIII[4]];
                v1[SquireFarmer.lIlllIlIIIII[1]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[1]];
                v1[SquireFarmer.lIlllIlIIIII[0]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[0]];
                v1[SquireFarmer.lIlllIlIIIII[3]] = SquireFarmer.lIlllIIlllll[SquireFarmer.lIlllIlIIIII[3]];
                if (SquireFarmer.lllIllIIIIIlIl((int)Inventory.contains((String[])v1))) lbl-1000:
                // 2 sources

                {
                    v2 = SquireFarmer.lIlllIlIIIII[0];
                    0;
                    if (-3 >= 0) {
                        return (boolean)((102 ^ 116 ^ 3) & (132 ^ 174 ^ (5 ^ 62) ^ -1));
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v2 = SquireFarmer.lIlllIlIIIII[1];
                }
                return (boolean)v2;
            }
        }
        return SquireFarmer.lIlllIlIIIII[0];
    }

    public SquireFarmer() {
        this.k = lIlllIlIIIII[0];
    }

    private static void lllIllIIIIIIlI() {
        lIlllIlIIIII = new int[29];
        SquireFarmer.lIlllIlIIIII[0] = 1;
        SquireFarmer.lIlllIlIIIII[1] = (0xF6 ^ 0xA1) & ~(0xE1 ^ 0xB6);
        SquireFarmer.lIlllIlIIIII[2] = 0x99 ^ 0xB9 ^ (0x94 ^ 0xA8);
        SquireFarmer.lIlllIlIIIII[3] = 2;
        SquireFarmer.lIlllIlIIIII[4] = 3;
        SquireFarmer.lIlllIlIIIII[5] = 0x5C ^ 0x58;
        SquireFarmer.lIlllIlIIIII[6] = 0xA7 ^ 0xC6 ^ (0xC2 ^ 0xA6);
        SquireFarmer.lIlllIlIIIII[7] = 113 + 144 - 141 + 47 ^ 48 + 10 - 11 + 118;
        SquireFarmer.lIlllIlIIIII[8] = 0x91 ^ 0x96;
        SquireFarmer.lIlllIlIIIII[9] = 97 + 115 - 139 + 93 ^ 27 + 57 - -82 + 8;
        SquireFarmer.lIlllIlIIIII[10] = 0xC9 ^ 0xC0;
        SquireFarmer.lIlllIlIIIII[11] = 0xB0 ^ 0x8F ^ (0x58 ^ 0x6D);
        SquireFarmer.lIlllIlIIIII[12] = 43 + 50 - 12 + 57 ^ 103 + 1 - 45 + 70;
        SquireFarmer.lIlllIlIIIII[13] = 10 + 117 - -23 + 26 ^ 157 + 109 - 264 + 186;
        SquireFarmer.lIlllIlIIIII[14] = 0x81 ^ 0x8C;
        SquireFarmer.lIlllIlIIIII[15] = 0x1C ^ 0x12;
        SquireFarmer.lIlllIlIIIII[16] = 0xA6 ^ 0xA9;
        SquireFarmer.lIlllIlIIIII[17] = 0x1F ^ 0xF;
        SquireFarmer.lIlllIlIIIII[18] = 0x4B ^ 0x1C ^ (0x24 ^ 0x62);
        SquireFarmer.lIlllIlIIIII[19] = 0x86 ^ 0x94;
        SquireFarmer.lIlllIlIIIII[20] = 0xB5 ^ 0xA6;
        SquireFarmer.lIlllIlIIIII[21] = 0xBF ^ 0xAB;
        SquireFarmer.lIlllIlIIIII[22] = 118 + 66 - 114 + 86 ^ 3 + 81 - -6 + 47;
        SquireFarmer.lIlllIlIIIII[23] = 2 + 171 - 32 + 34 ^ 36 + 128 - 118 + 139;
        SquireFarmer.lIlllIlIIIII[24] = 105 + 12 - -23 + 2 ^ 66 + 20 - 38 + 105;
        SquireFarmer.lIlllIlIIIII[25] = 0xB1 ^ 0xA9;
        SquireFarmer.lIlllIlIIIII[26] = 0x3C ^ 0x25;
        SquireFarmer.lIlllIlIIIII[27] = 0x13 ^ 9;
        SquireFarmer.lIlllIlIIIII[28] = 0x5D ^ 0x46;
    }

    private static boolean lllIllIIIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIllIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquireFarmer lllllllllllllllIlIllIllIlIIIIIlI;
        if (SquireFarmer.lllIllIIIIIIll(this.j.getGameState(), GameState.LOGGED_IN)) {
            this.l = null;
            return;
        }
        Widget lllllllllllllllIlIllIllIlIIIIIIl = lllllllllllllllIlIllIllIlIIIIIlI.j.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN_MESSAGE_OF_THE_DAY);
        if (SquireFarmer.lllIllIIIIIlII(lllllllllllllllIlIllIllIlIIIIIIl) && SquireFarmer.lllIllIIIIIlIl(lllllllllllllllIlIllIllIlIIIIIIl.isHidden() ? 1 : 0)) {
            lllllllllllllllIlIllIllIlIIIIIlI.m = lIlllIlIIIII[0];
            return;
        }
        if (SquireFarmer.lllIllIIIIIllI(lllllllllllllllIlIllIllIlIIIIIlI.m ? 1 : 0)) {
            lllllllllllllllIlIllIllIlIIIIIlI.m = lIlllIlIIIII[1];
            return;
        }
        WorldPoint lllllllllllllllIlIllIllIlIIIIIII = lllllllllllllllIlIllIllIlIIIIIlI.l;
        lllllllllllllllIlIllIllIlIIIIIlI.l = lllllllllllllllIlIllIllIlIIIIIlI.j.getLocalPlayer().getWorldLocation();
        if (!SquireFarmer.lllIllIIIIIlII(lllllllllllllllIlIllIllIlIIIIIII) || SquireFarmer.lllIllIIIIIlll(lllllllllllllllIlIllIllIlIIIIIII.getRegionID(), lllllllllllllllIlIllIllIlIIIIIlI.l.getRegionID())) {
            return;
        }
        int n2 = lllllllllllllllIlIllIllIlIIIIIlI.c.a(lllllllllllllllIlIllIllIlIIIIIII);
        int n3 = lllllllllllllllIlIllIllIlIIIIIlI.b.a(lllllllllllllllIlIllIllIlIIIIIII, lllllllllllllllIlIllIllIlIIIIIlI.j.getTickCount() - lllllllllllllllIlIllIllIlIIIIIlI.n);
        int n4 = lllllllllllllllIlIllIllIlIIIIIlI.f.a(lllllllllllllllIlIllIllIlIIIIIII);
        if (!SquireFarmer.lllIllIIIIIlIl(n2) || !SquireFarmer.lllIllIIIIIlIl(n3) || SquireFarmer.lllIllIIIIIllI(n4)) {
            // empty if block
        }
    }

    private static boolean lllIllIIIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    protected void onStart() {
        this.c.M();
        this.a.register((Object)this.b);
        this.a.register((Object)this.e);
        this.a.register((Object)this.c);
        this.b.a(this.a);
        this.d.add((Overlay)this.e);
        0;
        this.d.add((Overlay)this.g);
        0;
        this.b.D();
        this.k = lIlllIlIIIII[0];
    }

    @Subscribe
    public void a(RuneScapeProfileChanged runeScapeProfileChanged) {
        this.b.D();
        this.c.M();
        this.f.l();
    }

    @Provides
    SquireFarmerConfig a(ConfigManager configManager) {
        return (SquireFarmerConfig)configManager.getConfig(SquireFarmerConfig.class);
    }
}

