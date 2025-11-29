package gg.squire.toa;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.toa.overlay.debug.DebugOverlay;
import java.util.Set;
import java.util.function.Predicate;
import net.runelite.api.NPC;
import net.runelite.api.events.SoundEffectPlayed;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.client.managers.interaction.InteractionManager;
import p000.r.u.q.e.s.o.t.a.i.B;
import p000.r.u.q.e.s.o.t.a.i.C;
import p000.r.u.q.e.s.o.t.a.i.C0004e;
import p000.r.u.q.e.s.o.t.a.i.C0005f;
import p000.r.u.q.e.s.o.t.a.i.C0007h;
import p000.r.u.q.e.s.o.t.a.i.C0009j;
import p000.r.u.q.e.s.o.t.a.i.C0016q;
import p000.r.u.q.e.s.o.t.a.i.C0017r;
import p000.r.u.q.e.s.o.t.a.i.D;
import p000.r.u.q.e.s.o.t.a.i.E;
import p000.r.u.q.e.s.o.t.a.i.F;
import p000.r.u.q.e.s.o.t.a.i.G;
import p000.r.u.q.e.s.o.t.a.i.H;
import p000.r.u.q.e.s.o.t.a.i.I;
import p000.r.u.q.e.s.o.t.a.i.J;
import p000.r.u.q.e.s.o.t.a.i.K;
import p000.r.u.q.e.s.o.t.a.i.L;
import p000.r.u.q.e.s.o.t.a.i.M;
import p000.r.u.q.e.s.o.t.a.i.N;
import p000.r.u.q.e.s.o.t.a.i.O;
import p000.r.u.q.e.s.o.t.a.i.P;
import p000.r.u.q.e.s.o.t.a.i.Q;
import p000.r.u.q.e.s.o.t.a.i.R;
import p000.r.u.q.e.s.o.t.a.i.s;
import p000.r.u.q.e.s.o.t.a.i.t;
import p000.r.u.q.e.s.o.t.a.i.u;
import p000.r.u.q.e.s.o.t.a.i.v;
@SquireUtil
@PluginDescriptor(name = "Squire TOA", description = "Different helpers/automation for TOA", enabledByDefault = false)
/* loaded from: squire-toa-1.0.1.jar:gg/squire/toa/SquireTOA.class */
public class SquireTOA extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ u j;
    @Inject
    private /* synthetic */ C0005f f;
    private static /* synthetic */ int[] lIIllllllllII;
    @Inject
    private /* synthetic */ OverlayManager i;
    @Inject
    private /* synthetic */ ConfigManager b;
    @Inject
    private /* synthetic */ C0016q k;
    @Inject
    private /* synthetic */ C0017r n;
    @Inject
    private /* synthetic */ C0007h d;
    @Inject
    private /* synthetic */ C0004e g;
    @Inject
    private /* synthetic */ s o;
    @Inject
    private /* synthetic */ t m;
    @Inject
    private /* synthetic */ C0009j e;
    @Inject
    private /* synthetic */ TOAConfig c;
    @Inject
    private /* synthetic */ DebugOverlay p;
    private static final /* synthetic */ Set<Integer> a;
    @Inject
    private /* synthetic */ v l;

    @Provides
    TOAConfig a(ConfigManager configManager) {
        return (TOAConfig) configManager.getConfig(TOAConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean a(Predicate<NPC> predicate) {
        NPC b = b();
        if (lIllIlIllIIIllI(b) && lIllIlIllIIIlIl(predicate.and(npc -> {
            if (lIllIlIllIIlIIl(npc.isDead() ? 1 : 0)) {
                ?? r0 = lIIllllllllII[2];
                "".length();
                return (101 ^ 97) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIllllllllII[1];
        }).test(b) ? 1 : 0)) {
            ?? r0 = lIIllllllllII[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllllllllII[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    protected void onStart() {
        try {
            this.d.c();
            this.g.c();
            this.e.c();
            this.h.register(this.d);
            this.h.register(this.e);
            this.h.register(this.f);
            this.h.register(this.g);
            this.i.add(this.j);
            "".length();
            this.i.add(this.k);
            "".length();
            this.i.add(this.l);
            "".length();
            this.i.add(this.m);
            "".length();
            this.i.add(this.n);
            "".length();
            this.i.add(this.o);
            "".length();
            this.i.add(this.p);
            "".length();
            InteractionManager.setHelper((boolean) lIIllllllllII[2]);
            "".length();
            if ((-"  ".length()) >= 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        lIllIlIllIIIlII();
        Integer valueOf = Integer.valueOf(lIIllllllllII[19]);
        Integer valueOf2 = Integer.valueOf(lIIllllllllII[20]);
        Integer valueOf3 = Integer.valueOf(lIIllllllllII[21]);
        Integer valueOf4 = Integer.valueOf(lIIllllllllII[22]);
        Integer valueOf5 = Integer.valueOf(lIIllllllllII[23]);
        Integer valueOf6 = Integer.valueOf(lIIllllllllII[24]);
        Integer[] numArr = new Integer[lIIllllllllII[25]];
        numArr[lIIllllllllII[1]] = Integer.valueOf(lIIllllllllII[26]);
        numArr[lIIllllllllII[2]] = Integer.valueOf(lIIllllllllII[27]);
        numArr[lIIllllllllII[3]] = Integer.valueOf(lIIllllllllII[28]);
        numArr[lIIllllllllII[4]] = Integer.valueOf(lIIllllllllII[29]);
        numArr[lIIllllllllII[5]] = Integer.valueOf(lIIllllllllII[30]);
        numArr[lIIllllllllII[6]] = Integer.valueOf(lIIllllllllII[31]);
        numArr[lIIllllllllII[7]] = Integer.valueOf(lIIllllllllII[32]);
        numArr[lIIllllllllII[8]] = Integer.valueOf(lIIllllllllII[33]);
        numArr[lIIllllllllII[9]] = Integer.valueOf(lIIllllllllII[34]);
        numArr[lIIllllllllII[10]] = Integer.valueOf(lIIllllllllII[35]);
        numArr[lIIllllllllII[11]] = Integer.valueOf(lIIllllllllII[36]);
        numArr[lIIllllllllII[12]] = Integer.valueOf(lIIllllllllII[37]);
        numArr[lIIllllllllII[13]] = Integer.valueOf(lIIllllllllII[38]);
        numArr[lIIllllllllII[14]] = Integer.valueOf(lIIllllllllII[39]);
        numArr[lIIllllllllII[15]] = Integer.valueOf(lIIllllllllII[40]);
        numArr[lIIllllllllII[16]] = Integer.valueOf(lIIllllllllII[41]);
        numArr[lIIllllllllII[17]] = Integer.valueOf(lIIllllllllII[42]);
        numArr[lIIllllllllII[0]] = Integer.valueOf(lIIllllllllII[43]);
        numArr[lIIllllllllII[44]] = Integer.valueOf(lIIllllllllII[45]);
        numArr[lIIllllllllII[46]] = Integer.valueOf(lIIllllllllII[47]);
        numArr[lIIllllllllII[48]] = Integer.valueOf(lIIllllllllII[49]);
        a = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
    }

    public boolean a(int... iArr) {
        return a(npc -> {
            int length = iArr.length;
            int i = lIIllllllllII[1];
            while (lIllIlIllIIIlll(i, length)) {
                if (lIllIlIllIIlIII(iArr[i], npc.getId())) {
                    return lIIllllllllII[2];
                }
                i++;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIIllllllllII[1];
        });
    }

    public int a() {
        return Vars.getVarp(lIIllllllllII[18]);
    }

    @Subscribe
    public void a(SoundEffectPlayed soundEffectPlayed) {
        if (lIllIlIllIIIlIl(a.contains(Integer.valueOf(soundEffectPlayed.getSoundId())) ? 1 : 0)) {
            soundEffectPlayed.consume();
        }
    }

    private static boolean lIllIlIllIIlIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    protected void onStop() {
        this.h.unregister(this.d);
        this.h.unregister(this.e);
        this.h.unregister(this.f);
        this.h.unregister(this.g);
        this.i.remove(this.j);
        "".length();
        this.i.remove(this.k);
        "".length();
        this.i.remove(this.l);
        "".length();
        this.i.remove(this.m);
        "".length();
        this.i.remove(this.n);
        "".length();
        this.i.remove(this.o);
        "".length();
        this.i.remove(this.p);
        "".length();
        InteractionManager.setHelper((boolean) lIIllllllllII[1]);
    }

    private static boolean lIllIlIllIIIlIl(int i) {
        return i != 0;
    }

    public NPC b() {
        int[] iArr = new int[lIIllllllllII[2]];
        iArr[lIIllllllllII[1]] = a();
        return NPCs.getNearest(iArr);
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllllllllII[0]];
        clsArr[lIIllllllllII[1]] = R.class;
        clsArr[lIIllllllllII[2]] = Q.class;
        clsArr[lIIllllllllII[3]] = M.class;
        clsArr[lIIllllllllII[4]] = N.class;
        clsArr[lIIllllllllII[5]] = C.class;
        clsArr[lIIllllllllII[6]] = D.class;
        clsArr[lIIllllllllII[7]] = P.class;
        clsArr[lIIllllllllII[8]] = O.class;
        clsArr[lIIllllllllII[9]] = L.class;
        clsArr[lIIllllllllII[10]] = K.class;
        clsArr[lIIllllllllII[11]] = F.class;
        clsArr[lIIllllllllII[12]] = E.class;
        clsArr[lIIllllllllII[13]] = G.class;
        clsArr[lIIllllllllII[14]] = H.class;
        clsArr[lIIllllllllII[15]] = I.class;
        clsArr[lIIllllllllII[16]] = J.class;
        clsArr[lIIllllllllII[17]] = B.class;
        return clsArr;
    }

    private static boolean lIllIlIllIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIllIIIllI(Object obj) {
        return obj != null;
    }

    private static void lIllIlIllIIIlII() {
        lIIllllllllII = new int[50];
        lIIllllllllII[0] = 26 ^ 11;
        lIIllllllllII[1] = (72 ^ 28) & ((7 ^ 83) ^ (-1));
        lIIllllllllII[2] = " ".length();
        lIIllllllllII[3] = "  ".length();
        lIIllllllllII[4] = "   ".length();
        lIIllllllllII[5] = 8 ^ 12;
        lIIllllllllII[6] = (((17 + 74) - 84) + 144) ^ (((116 + 96) - 109) + 43);
        lIIllllllllII[7] = 72 ^ 78;
        lIIllllllllII[8] = (238 ^ 158) ^ (99 ^ 20);
        lIIllllllllII[9] = (211 ^ 152) ^ (200 ^ 139);
        lIIllllllllII[10] = (13 ^ 47) ^ (151 ^ 188);
        lIIllllllllII[11] = (((45 + 55) - 10) + 65) ^ (((130 + 90) - 137) + 62);
        lIIllllllllII[12] = (((72 + 86) - 72) + 47) ^ (((136 + 78) - 139) + 67);
        lIIllllllllII[13] = (151 ^ 157) ^ (67 ^ 69);
        lIIllllllllII[14] = 106 ^ 103;
        lIIllllllllII[15] = 65 ^ 79;
        lIIllllllllII[16] = 41 ^ 38;
        lIIllllllllII[17] = (122 ^ 11) ^ (224 ^ 129);
        lIIllllllllII[18] = (-((-5275) & 23739)) & (-4097) & 24243;
        lIIllllllllII[19] = (-1354) & 4043;
        lIIllllllllII[20] = (-13439) & 16126;
        lIIllllllllII[21] = (-8194) & 10857;
        lIIllllllllII[22] = (-131) & 2815;
        lIIllllllllII[23] = (-((-2569) & 24473)) & (-8193) & 32766;
        lIIllllllllII[24] = (-258) & 2941;
        lIIllllllllII[25] = (76 ^ 5) ^ (72 ^ 20);
        lIIllllllllII[26] = (-((-11723) & 15867)) & (-25931) & 32763;
        lIIllllllllII[27] = (-16794) & 19455;
        lIIllllllllII[28] = (-16393) & 19071;
        lIIllllllllII[29] = (-((-1618) & 26587)) & (-1025) & 28671;
        lIIllllllllII[30] = (-" ".length()) & (-20482) & 22463;
        lIIllllllllII[31] = (-((-14893) & 32557)) & (-12289) & 32618;
        lIIllllllllII[32] = (-13314) & 15981;
        lIIllllllllII[33] = (-16385) & 19071;
        lIIllllllllII[34] = (-((-643) & 30715)) & (-5) & 32767;
        lIIllllllllII[35] = (-((-6211) & 32211)) & (-5) & 28671;
        lIIllllllllII[36] = (-((-33) & 30125)) & (-1) & 32767;
        lIIllllllllII[37] = (-13315) & 15991;
        lIIllllllllII[38] = (-((-12341) & 30134)) & (-12289) & 32757;
        lIIllllllllII[39] = (-((-3649) & 24263)) & (-9217) & 32495;
        lIIllllllllII[40] = (-((-10337) & 26867)) & (-4097) & 23295;
        lIIllllllllII[41] = (-20870) & 23551;
        lIIllllllllII[42] = (-((-10753) & 32263)) & (-8193) & 32382;
        lIIllllllllII[43] = (-21505) & 24190;
        lIIllllllllII[44] = (((150 + 149) - 256) + 135) ^ (((142 + 72) - 180) + 126);
        lIIllllllllII[45] = (-((-17499) & 29791)) & (-265) & 16382;
        lIIllllllllII[46] = 56 ^ 43;
        lIIllllllllII[47] = (-28685) & 32509;
        lIIllllllllII[48] = 65 ^ 85;
        lIIllllllllII[49] = (-((-2115) & 32195)) & (-9) & 32751;
    }

    private static boolean lIllIlIllIIlIIl(int i) {
        return i == 0;
    }
}
