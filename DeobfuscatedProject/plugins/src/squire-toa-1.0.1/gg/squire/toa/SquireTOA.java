/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.NPC
 *  net.runelite.api.events.SoundEffectPlayed
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.toa;

import -.r.u.q.e.s.o.t.a.i.B;
import -.r.u.q.e.s.o.t.a.i.C;
import -.r.u.q.e.s.o.t.a.i.D;
import -.r.u.q.e.s.o.t.a.i.E;
import -.r.u.q.e.s.o.t.a.i.F;
import -.r.u.q.e.s.o.t.a.i.G;
import -.r.u.q.e.s.o.t.a.i.H;
import -.r.u.q.e.s.o.t.a.i.I;
import -.r.u.q.e.s.o.t.a.i.J;
import -.r.u.q.e.s.o.t.a.i.K;
import -.r.u.q.e.s.o.t.a.i.L;
import -.r.u.q.e.s.o.t.a.i.M;
import -.r.u.q.e.s.o.t.a.i.N;
import -.r.u.q.e.s.o.t.a.i.O;
import -.r.u.q.e.s.o.t.a.i.P;
import -.r.u.q.e.s.o.t.a.i.Q;
import -.r.u.q.e.s.o.t.a.i.R;
import -.r.u.q.e.s.o.t.a.i.e;
import -.r.u.q.e.s.o.t.a.i.f;
import -.r.u.q.e.s.o.t.a.i.h;
import -.r.u.q.e.s.o.t.a.i.j;
import -.r.u.q.e.s.o.t.a.i.q;
import -.r.u.q.e.s.o.t.a.i.r;
import -.r.u.q.e.s.o.t.a.i.s;
import -.r.u.q.e.s.o.t.a.i.t;
import -.r.u.q.e.s.o.t.a.i.u;
import -.r.u.q.e.s.o.t.a.i.v;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.toa.TOAConfig;
import gg.squire.toa.overlay.debug.DebugOverlay;
import java.util.Set;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire TOA", description="Different helpers/automation for TOA", enabledByDefault=false)
public class SquireTOA
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ u j;
    @Inject
    private /* synthetic */ f f;
    private static /* synthetic */ int[] lIIllllllllII;
    @Inject
    private /* synthetic */ OverlayManager i;
    @Inject
    private /* synthetic */ ConfigManager b;
    @Inject
    private /* synthetic */ q k;
    @Inject
    private /* synthetic */ r n;
    @Inject
    private /* synthetic */ h d;
    @Inject
    private /* synthetic */ e g;
    @Inject
    private /* synthetic */ s o;
    @Inject
    private /* synthetic */ t m;
    @Inject
    private /* synthetic */ j e;
    @Inject
    private /* synthetic */ TOAConfig c;
    @Inject
    private /* synthetic */ DebugOverlay p;
    private static final /* synthetic */ Set<Integer> a;
    @Inject
    private /* synthetic */ v l;

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig)configManager.getConfig(TOAConfig.class);
    }

    public boolean a(Predicate<NPC> predicate) {
        int n2;
        NPC nPC2 = this.b();
        if (SquireTOA.lIllIlIllIIIllI(nPC2) && SquireTOA.lIllIlIllIIIlIl(predicate.and(nPC -> {
            boolean bl;
            if (SquireTOA.lIllIlIllIIlIIl(nPC.isDead() ? 1 : 0)) {
                bl = lIIllllllllII[2];
                "".length();
                if ((0x65 ^ 0x61) <= "  ".length()) {
                    return ((0x58 ^ 0x6E) & ~(0x33 ^ 5)) != 0;
                }
            } else {
                bl = lIIllllllllII[1];
            }
            return bl;
        }).test(nPC2) ? 1 : 0)) {
            n2 = lIIllllllllII[2];
            "".length();
            if (((0xB ^ 0x2A) & ~(0x8D ^ 0xAC)) != 0) {
                return ((0xE4 ^ 0xB0) & ~(0x61 ^ 0x35)) != 0;
            }
        } else {
            n2 = lIIllllllllII[1];
        }
        return n2 != 0;
    }

    protected void onStart() {
        try {
            SquireTOA llllllllllllllIlllIIlllIlIllIlIl;
            llllllllllllllIlllIIlllIlIllIlIl.d.c();
            llllllllllllllIlllIIlllIlIllIlIl.g.c();
            llllllllllllllIlllIIlllIlIllIlIl.e.c();
            llllllllllllllIlllIIlllIlIllIlIl.h.register((Object)llllllllllllllIlllIIlllIlIllIlIl.d);
            llllllllllllllIlllIIlllIlIllIlIl.h.register((Object)llllllllllllllIlllIIlllIlIllIlIl.e);
            llllllllllllllIlllIIlllIlIllIlIl.h.register((Object)llllllllllllllIlllIIlllIlIllIlIl.f);
            llllllllllllllIlllIIlllIlIllIlIl.h.register((Object)llllllllllllllIlllIIlllIlIllIlIl.g);
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.j);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.k);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.l);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.m);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.n);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.o);
            "".length();
            llllllllllllllIlllIIlllIlIllIlIl.i.add((Overlay)llllllllllllllIlllIIlllIlIllIlIl.p);
            "".length();
            InteractionManager.setHelper((boolean)lIIllllllllII[2]);
            "".length();
        }
        catch (Exception llllllllllllllIlllIIlllIlIllIlII) {
            llllllllllllllIlllIIlllIlIllIlII.printStackTrace();
        }
        if (-"  ".length() >= 0) {
            return;
        }
    }

    static {
        SquireTOA.lIllIlIllIIIlII();
        Object[] objectArray = new Integer[lIIllllllllII[25]];
        objectArray[SquireTOA.lIIllllllllII[1]] = lIIllllllllII[26];
        objectArray[SquireTOA.lIIllllllllII[2]] = lIIllllllllII[27];
        objectArray[SquireTOA.lIIllllllllII[3]] = lIIllllllllII[28];
        objectArray[SquireTOA.lIIllllllllII[4]] = lIIllllllllII[29];
        objectArray[SquireTOA.lIIllllllllII[5]] = lIIllllllllII[30];
        objectArray[SquireTOA.lIIllllllllII[6]] = lIIllllllllII[31];
        objectArray[SquireTOA.lIIllllllllII[7]] = lIIllllllllII[32];
        objectArray[SquireTOA.lIIllllllllII[8]] = lIIllllllllII[33];
        objectArray[SquireTOA.lIIllllllllII[9]] = lIIllllllllII[34];
        objectArray[SquireTOA.lIIllllllllII[10]] = lIIllllllllII[35];
        objectArray[SquireTOA.lIIllllllllII[11]] = lIIllllllllII[36];
        objectArray[SquireTOA.lIIllllllllII[12]] = lIIllllllllII[37];
        objectArray[SquireTOA.lIIllllllllII[13]] = lIIllllllllII[38];
        objectArray[SquireTOA.lIIllllllllII[14]] = lIIllllllllII[39];
        objectArray[SquireTOA.lIIllllllllII[15]] = lIIllllllllII[40];
        objectArray[SquireTOA.lIIllllllllII[16]] = lIIllllllllII[41];
        objectArray[SquireTOA.lIIllllllllII[17]] = lIIllllllllII[42];
        objectArray[SquireTOA.lIIllllllllII[0]] = lIIllllllllII[43];
        objectArray[SquireTOA.lIIllllllllII[44]] = lIIllllllllII[45];
        objectArray[SquireTOA.lIIllllllllII[46]] = lIIllllllllII[47];
        objectArray[SquireTOA.lIIllllllllII[48]] = lIIllllllllII[49];
        a = ImmutableSet.of((Object)lIIllllllllII[19], (Object)lIIllllllllII[20], (Object)lIIllllllllII[21], (Object)lIIllllllllII[22], (Object)lIIllllllllII[23], (Object)lIIllllllllII[24], (Object[])objectArray);
    }

    public boolean a(int ... nArray) {
        return this.a((NPC nPC) -> {
            void llllllllllllllIlllIIlllIlIlIIIlI;
            int[] nArray2 = nArray;
            int n2 = nArray2.length;
            int llllllllllllllIlllIIlllIlIlIIIIl = lIIllllllllII[1];
            while (SquireTOA.lIllIlIllIIIlll(llllllllllllllIlllIIlllIlIlIIIIl, (int)llllllllllllllIlllIIlllIlIlIIIlI)) {
                void llllllllllllllIlllIIlllIlIlIIlII;
                void llllllllllllllIlllIIlllIlIlIIIll;
                void llllllllllllllIlllIIlllIlIlIIIII = llllllllllllllIlllIIlllIlIlIIIll[llllllllllllllIlllIIlllIlIlIIIIl];
                if (SquireTOA.lIllIlIllIIlIII((int)llllllllllllllIlllIIlllIlIlIIIII, llllllllllllllIlllIIlllIlIlIIlII.getId())) {
                    return lIIllllllllII[2];
                }
                ++llllllllllllllIlllIIlllIlIlIIIIl;
                "".length();
                if ("  ".length() == "  ".length()) continue;
                return ((0x2F ^ 0x7E) & ~(0x76 ^ 0x27)) != 0;
            }
            return lIIllllllllII[1];
        });
    }

    public int a() {
        return Vars.getVarp((int)lIIllllllllII[18]);
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (SquireTOA.lIllIlIllIIIlIl(a.contains(soundEffectPlayed.getSoundId()) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    private static boolean lIllIlIllIIlIII(int n2, int n3) {
        return n2 == n3;
    }

    protected void onStop() {
        this.h.unregister((Object)this.d);
        this.h.unregister((Object)this.e);
        this.h.unregister((Object)this.f);
        this.h.unregister((Object)this.g);
        this.i.remove((Overlay)this.j);
        "".length();
        this.i.remove((Overlay)this.k);
        "".length();
        this.i.remove((Overlay)this.l);
        "".length();
        this.i.remove((Overlay)this.m);
        "".length();
        this.i.remove((Overlay)this.n);
        "".length();
        this.i.remove((Overlay)this.o);
        "".length();
        this.i.remove((Overlay)this.p);
        "".length();
        InteractionManager.setHelper((boolean)lIIllllllllII[1]);
    }

    private static boolean lIllIlIllIIIlIl(int n2) {
        return n2 != 0;
    }

    public NPC b() {
        int[] nArray = new int[lIIllllllllII[2]];
        nArray[SquireTOA.lIIllllllllII[1]] = this.a();
        return NPCs.getNearest((int[])nArray);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllllllllII[0]];
        classArray[SquireTOA.lIIllllllllII[1]] = R.class;
        classArray[SquireTOA.lIIllllllllII[2]] = Q.class;
        classArray[SquireTOA.lIIllllllllII[3]] = M.class;
        classArray[SquireTOA.lIIllllllllII[4]] = N.class;
        classArray[SquireTOA.lIIllllllllII[5]] = C.class;
        classArray[SquireTOA.lIIllllllllII[6]] = D.class;
        classArray[SquireTOA.lIIllllllllII[7]] = P.class;
        classArray[SquireTOA.lIIllllllllII[8]] = O.class;
        classArray[SquireTOA.lIIllllllllII[9]] = L.class;
        classArray[SquireTOA.lIIllllllllII[10]] = K.class;
        classArray[SquireTOA.lIIllllllllII[11]] = F.class;
        classArray[SquireTOA.lIIllllllllII[12]] = E.class;
        classArray[SquireTOA.lIIllllllllII[13]] = G.class;
        classArray[SquireTOA.lIIllllllllII[14]] = H.class;
        classArray[SquireTOA.lIIllllllllII[15]] = I.class;
        classArray[SquireTOA.lIIllllllllII[16]] = J.class;
        classArray[SquireTOA.lIIllllllllII[17]] = B.class;
        return classArray;
    }

    private static boolean lIllIlIllIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllIIIllI(Object object) {
        return object != null;
    }

    private static void lIllIlIllIIIlII() {
        lIIllllllllII = new int[50];
        SquireTOA.lIIllllllllII[0] = 0x1A ^ 0xB;
        SquireTOA.lIIllllllllII[1] = (0x48 ^ 0x1C) & ~(7 ^ 0x53);
        SquireTOA.lIIllllllllII[2] = " ".length();
        SquireTOA.lIIllllllllII[3] = "  ".length();
        SquireTOA.lIIllllllllII[4] = "   ".length();
        SquireTOA.lIIllllllllII[5] = 8 ^ 0xC;
        SquireTOA.lIIllllllllII[6] = 17 + 74 - 84 + 144 ^ 116 + 96 - 109 + 43;
        SquireTOA.lIIllllllllII[7] = 0x48 ^ 0x4E;
        SquireTOA.lIIllllllllII[8] = 0xEE ^ 0x9E ^ (0x63 ^ 0x14);
        SquireTOA.lIIllllllllII[9] = 0xD3 ^ 0x98 ^ (0xC8 ^ 0x8B);
        SquireTOA.lIIllllllllII[10] = 0xD ^ 0x2F ^ (0x97 ^ 0xBC);
        SquireTOA.lIIllllllllII[11] = 45 + 55 - 10 + 65 ^ 130 + 90 - 137 + 62;
        SquireTOA.lIIllllllllII[12] = 72 + 86 - 72 + 47 ^ 136 + 78 - 139 + 67;
        SquireTOA.lIIllllllllII[13] = 0x97 ^ 0x9D ^ (0x43 ^ 0x45);
        SquireTOA.lIIllllllllII[14] = 0x6A ^ 0x67;
        SquireTOA.lIIllllllllII[15] = 0x41 ^ 0x4F;
        SquireTOA.lIIllllllllII[16] = 0x29 ^ 0x26;
        SquireTOA.lIIllllllllII[17] = 0x7A ^ 0xB ^ (0xE0 ^ 0x81);
        SquireTOA.lIIllllllllII[18] = -(0xFFFFEB65 & 0x5CBB) & (0xFFFFEFFF & 0x5EB3);
        SquireTOA.lIIllllllllII[19] = 0xFFFFFAB6 & 0xFCB;
        SquireTOA.lIIllllllllII[20] = 0xFFFFCB81 & 0x3EFE;
        SquireTOA.lIIllllllllII[21] = 0xFFFFDFFE & 0x2A69;
        SquireTOA.lIIllllllllII[22] = 0xFFFFFF7D & 0xAFF;
        SquireTOA.lIIllllllllII[23] = -(0xFFFFF5F7 & 0x5F99) & (0xFFFFDFFF & 0x7FFE);
        SquireTOA.lIIllllllllII[24] = 0xFFFFFEFE & 0xB7D;
        SquireTOA.lIIllllllllII[25] = 0x4C ^ 5 ^ (0x48 ^ 0x14);
        SquireTOA.lIIllllllllII[26] = -(0xFFFFD235 & 0x3DFB) & (0xFFFF9AB5 & 0x7FFB);
        SquireTOA.lIIllllllllII[27] = 0xFFFFBE66 & 0x4BFF;
        SquireTOA.lIIllllllllII[28] = 0xFFFFBFF7 & 0x4A7F;
        SquireTOA.lIIllllllllII[29] = -(0xFFFFF9AE & 0x67DB) & (0xFFFFFBFF & 0x6FFF);
        SquireTOA.lIIllllllllII[30] = -" ".length() & (0xFFFFAFFE & 0x57BF);
        SquireTOA.lIIllllllllII[31] = -(0xFFFFC5D3 & 0x7F2D) & (0xFFFFCFFF & 0x7F6A);
        SquireTOA.lIIllllllllII[32] = 0xFFFFCBFE & 0x3E6D;
        SquireTOA.lIIllllllllII[33] = 0xFFFFBFFF & 0x4A7F;
        SquireTOA.lIIllllllllII[34] = -(0xFFFFFD7D & 0x77FB) & (0xFFFFFFFB & Short.MAX_VALUE);
        SquireTOA.lIIllllllllII[35] = -(0xFFFFE7BD & 0x7DD3) & (0xFFFFFFFB & 0x6FFF);
        SquireTOA.lIIllllllllII[36] = -(0xFFFFFFDF & 0x75AD) & (0xFFFFFFFF & Short.MAX_VALUE);
        SquireTOA.lIIllllllllII[37] = 0xFFFFCBFD & 0x3E77;
        SquireTOA.lIIllllllllII[38] = -(0xFFFFCFCB & 0x75B6) & (0xFFFFCFFF & 0x7FF5);
        SquireTOA.lIIllllllllII[39] = -(0xFFFFF1BF & 0x5EC7) & (0xFFFFDBFF & 0x7EEF);
        SquireTOA.lIIllllllllII[40] = -(0xFFFFD79F & 0x68F3) & (0xFFFFEFFF & 0x5AFF);
        SquireTOA.lIIllllllllII[41] = 0xFFFFAE7A & 0x5BFF;
        SquireTOA.lIIllllllllII[42] = -(0xFFFFD5FF & 0x7E07) & (0xFFFFDFFF & 0x7E7E);
        SquireTOA.lIIllllllllII[43] = 0xFFFFABFF & 0x5E7E;
        SquireTOA.lIIllllllllII[44] = 150 + 149 - 256 + 135 ^ 142 + 72 - 180 + 126;
        SquireTOA.lIIllllllllII[45] = -(0xFFFFBBA5 & 0x745F) & (0xFFFFFEF7 & 0x3FFE);
        SquireTOA.lIIllllllllII[46] = 0x38 ^ 0x2B;
        SquireTOA.lIIllllllllII[47] = 0xFFFF8FF3 & 0x7EFD;
        SquireTOA.lIIllllllllII[48] = 0x41 ^ 0x55;
        SquireTOA.lIIllllllllII[49] = -(0xFFFFF7BD & 0x7DC3) & (0xFFFFFFF7 & 0x7FEF);
    }

    private static boolean lIllIlIllIIlIIl(int n2) {
        return n2 == 0;
    }
}

