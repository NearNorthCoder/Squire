package u.i.r.d.s.e.r.q.y.a.h.p000;

import java.util.Objects;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.h  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/h.class */
public class h extends f {
    private /* synthetic */ int Z;
    public static final /* synthetic */ int K;
    public static final /* synthetic */ int C;
    public static final /* synthetic */ int M;
    private /* synthetic */ boolean ae;
    private static /* synthetic */ int[] llllIIlIIIlI;
    public static final /* synthetic */ int L;
    private static final /* synthetic */ int O;
    private static final /* synthetic */ int R;
    private /* synthetic */ int af;
    private /* synthetic */ NPC U;
    private static final /* synthetic */ int T;
    public static final /* synthetic */ int D;
    private static final /* synthetic */ int N;
    public static final /* synthetic */ int E;
    private static final /* synthetic */ int S;
    public static final /* synthetic */ int H;
    public static final /* synthetic */ int F;
    public static final /* synthetic */ int I;
    private static final /* synthetic */ int Q;
    public static final /* synthetic */ int J;
    public static final /* synthetic */ int G;
    private static final /* synthetic */ int P;
    private /* synthetic */ j V = j.MAGIC;
    private /* synthetic */ int Y = llllIIlIIIlI[0];
    private /* synthetic */ boolean aa = llllIIlIIIlI[1];
    private /* synthetic */ l ab = l.WAITING;
    private /* synthetic */ int X = llllIIlIIIlI[2];
    private /* synthetic */ int W = llllIIlIIIlI[3];
    private /* synthetic */ k ac = k.POISON;
    private /* synthetic */ boolean ad = llllIIlIIIlI[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public WorldPoint c(boolean z) {
        k S2 = S();
        if (lIIIlllllIIIIlI(S2, k.ENRAGED)) {
            return null;
        }
        if (lIIIlllllIIIlII(Q() ? 1 : 0)) {
            return S2.Z().toWorld();
        }
        if (lIIIllllIllllll(this.ae ? 1 : 0)) {
            k H2 = H();
            if (!lIIIlllllIIIlIl(H2) || lIIIlllllIIIIlI(H2, k.ENRAGED)) {
                return null;
            }
            WorldPoint world = H2.Z().toWorld();
            WorldPoint worldLocation = K().getWorldLocation();
            if (lIIIlllllIIIllI(worldLocation.distanceTo(world), llllIIlIIIlI[7])) {
                return world;
            }
            if (lIIIlllllIIIlII(worldLocation.equals(world) ? 1 : 0)) {
                this.ae = llllIIlIIIlI[1];
                return null;
            }
            return null;
        }
        return null;
    }

    public int w() {
        return lIIIlllllIIIIlI(S(), k.ENRAGED) ? llllIIlIIIlI[7] : llllIIlIIIlI[8];
    }

    @Override // u.i.r.d.s.e.r.q.y.a.h.p000.f
    public Prayer x() {
        if (lIIIllllIllllll(this.Y)) {
            return null;
        }
        return this.V.X();
    }

    public l R() {
        return this.ab;
    }

    public int I() {
        if (lIIIlllllIIIIIl(S(), k.LIGHTNING)) {
            return llllIIlIIIlI[2];
        }
        Deque<GraphicsObject> graphicsObjects = Static.getClient().getGraphicsObjects();
        if (lIIIlllllIIIlll(graphicsObjects)) {
            return llllIIlIIIlI[2];
        }
        int i = llllIIlIIIlI[2];
        for (GraphicsObject graphicsObject : graphicsObjects) {
            if (lIIIlllllIIIIll(graphicsObject.getId(), llllIIlIIIlI[9])) {
                i++;
            }
            "".length();
            if ("  ".length() < ((133 ^ 165) & ((168 ^ 136) ^ (-1)))) {
                return (56 ^ 34) & ((125 ^ 103) ^ (-1));
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public void D() {
        if (lIIIlllllIIIIIl(S(), k.ENRAGED)) {
            E();
        }
        this.X += llllIIlIIIlI[1];
        this.ad = llllIIlIIIlI[1];
    }

    public k S() {
        return this.ac;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public h(NPC npc) {
        this.U = npc;
    }

    public void k(int i) {
        this.Y = i;
    }

    public void j(int i) {
        this.X = i;
    }

    private static boolean lIIIlllllIIIlII(int i) {
        return i != 0;
    }

    private static boolean lIIIlllllIIIlll(Object obj) {
        return obj == null;
    }

    public k H() {
        switch (i.ag[this.ac.ordinal()]) {
            case 1:
                return k.LIGHTNING;
            case 2:
                return k.FLAME;
            case 3:
                return k.ENRAGED;
            default:
                return null;
        }
    }

    public int C() {
        return (Static.getClient().getTickCount() - this.Z) - llllIIlIIIlI[6];
    }

    public j J() {
        if (lIIIlllllIIIIlI(this.V, j.MAGIC)) {
            j jVar = j.RANGED;
            "".length();
            if (0 != 0) {
                return null;
            }
            return jVar;
        }
        return j.MAGIC;
    }

    private static boolean lIIIlllllIIlIII(int i, int i2) {
        return i != i2;
    }

    public void f(boolean z) {
        this.ae = z;
    }

    public void i(int i) {
        this.W = i;
    }

    private j F() {
        if (lIIIlllllIIIIll(this.Y, llllIIlIIIlI[1])) {
            return null;
        }
        return lIIIlllllIIIlII((this.X + llllIIlIIIlI[1]) % llllIIlIIIlI[0]) ? L() : J();
    }

    public boolean U() {
        return this.ae;
    }

    public String toString() {
        return "AlchemicalHydra(actor=" + String.valueOf(K()) + ", attackStyle=" + String.valueOf(L()) + ", health=" + M() + ", attacks=" + N() + ", nextSpecial=" + O() + ", stunTick=" + P() + ", immunity=" + Q() + ", lightningSkipped=" + String.valueOf(R()) + ", phase=" + String.valueOf(S()) + ", attackedSincePhaseChange=" + T() + ", movedToNextTile=" + U() + ", changeTick=" + V() + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public void s() {
        this.X += llllIIlIIIlI[1];
        this.ad = llllIIlIIIlI[1];
        if (lIIIllllIllllll(this.X % this.ac.aa())) {
            E();
        }
    }

    private static void lIIIllllIlllllI() {
        llllIIlIIIlI = new int[25];
        llllIIlIIIlI[0] = "   ".length();
        llllIIlIIIlI[1] = " ".length();
        llllIIlIIIlI[2] = (108 ^ 50) & ((224 ^ 190) ^ (-1));
        llllIIlIIIlI[3] = (-16403) & 17502;
        llllIIlIIIlI[4] = (-((-4757) & 22237)) & (-513) & 26607;
        llllIIlIIIlI[5] = (157 ^ 175) ^ (89 ^ 98);
        llllIIlIIIlI[6] = 89 ^ 94;
        llllIIlIIIlI[7] = 134 ^ 130;
        llllIIlIIIlI[8] = (((44 + 98) - 29) + 49) ^ (((65 + 46) - (-53)) + 0);
        llllIIlIIIlI[9] = (-((-1042) & 32083)) & (-61) & 32767;
        llllIIlIIIlI[10] = (((154 + 97) - 223) + 135) ^ (((80 + 150) - 83) + 5);
        llllIIlIIIlI[11] = 118 ^ 57;
        llllIIlIIIlI[12] = 219 ^ 186;
        llllIIlIIIlI[13] = 30 ^ 53;
        llllIIlIIIlI[14] = (-7809) & 16045;
        llllIIlIIIlI[15] = 49 ^ 27;
        llllIIlIIIlI[16] = (-((-543) & 6687)) & (-1739) & 16127;
        llllIIlIIIlI[17] = (-20424) & 28671;
        llllIIlIIIlI[18] = (-((-3233) & 24545)) & (-1154) & 30717;
        llllIIlIIIlI[19] = (-24502) & 32759;
        llllIIlIIIlI[20] = (-17933) & 26173;
        llllIIlIIIlI[21] = (-21299) & 29555;
        llllIIlIIIlI[22] = (-((-25801) & 28109)) & (-18113) & 28671;
        llllIIlIIIlI[23] = (-6866) & 15103;
        llllIIlIIIlI[24] = (-5257) & 13500;
    }

    public void a(l lVar) {
        this.ab = lVar;
    }

    private static boolean lIIIlllllIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlllllIIIllI(int i, int i2) {
        return i > i2;
    }

    public int O() {
        return this.Y;
    }

    public int V() {
        return this.af;
    }

    private void E() {
        this.V = J();
    }

    public boolean Q() {
        return this.aa;
    }

    public int M() {
        return this.W;
    }

    private static boolean lIIIlllllIIIIII(int i) {
        return i <= 0;
    }

    public int N() {
        return this.X;
    }

    public int P() {
        return this.Z;
    }

    public void b(k kVar) {
        this.ac = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean B() {
        if (lIIIlllllIIIIII(C())) {
            ?? r0 = llllIIlIIIlI[1];
            "".length();
            return ((((6 + 149) - 4) + 26) ^ (((113 + 94) - 172) + 146)) != ((58 ^ 74) ^ (244 ^ 128)) ? ((0 ^ 19) ^ (101 ^ 77)) & (((183 ^ 159) ^ (76 ^ 95)) ^ (-" ".length())) : r0;
        }
        return llllIIlIIIlI[2];
    }

    protected boolean a(Object obj) {
        return obj instanceof h;
    }

    public NPC K() {
        return this.U;
    }

    static {
        lIIIllllIlllllI();
        D = llllIIlIIIlI[14];
        P = llllIIlIIIlI[5];
        S = llllIIlIIIlI[7];
        C = llllIIlIIIlI[15];
        H = llllIIlIIIlI[16];
        I = llllIIlIIIlI[17];
        N = llllIIlIIIlI[3];
        Q = llllIIlIIIlI[6];
        K = llllIIlIIIlI[18];
        M = llllIIlIIIlI[19];
        R = llllIIlIIIlI[8];
        F = llllIIlIIIlI[20];
        L = llllIIlIIIlI[21];
        J = llllIIlIIIlI[22];
        E = llllIIlIIIlI[23];
        T = llllIIlIIIlI[9];
        G = llllIIlIIIlI[24];
        O = llllIIlIIIlI[0];
    }

    public boolean G() {
        return this.ad;
    }

    public void a(j jVar) {
        this.V = jVar;
    }

    public boolean T() {
        return this.ad;
    }

    private static boolean lIIIllllIllllll(int i) {
        return i == 0;
    }

    public void A() {
        this.Y += llllIIlIIIlI[5];
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4 = llllIIlIIIlI[10];
        int hashCode5 = ((((((((super.hashCode() * llllIIlIIIlI[10]) + M()) * llllIIlIIIlI[10]) + N()) * llllIIlIIIlI[10]) + O()) * llllIIlIIIlI[10]) + P()) * llllIIlIIIlI[10];
        if (lIIIlllllIIIlII(Q() ? 1 : 0)) {
            i = llllIIlIIIlI[11];
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return ((220 ^ 179) ^ (109 ^ 49)) & (((233 ^ 183) ^ (54 ^ 91)) ^ (-" ".length()));
            }
        } else {
            i = llllIIlIIIlI[12];
        }
        int i5 = (hashCode5 + i) * llllIIlIIIlI[10];
        if (lIIIlllllIIIlII(T() ? 1 : 0)) {
            i2 = llllIIlIIIlI[11];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ("  ".length() ^ (33 ^ 28)) & (((46 ^ 64) ^ (79 ^ 30)) ^ (-" ".length()));
            }
        } else {
            i2 = llllIIlIIIlI[12];
        }
        int i6 = (i5 + i2) * llllIIlIIIlI[10];
        if (lIIIlllllIIIlII(U() ? 1 : 0)) {
            i3 = llllIIlIIIlI[11];
            "".length();
            if ((48 ^ 53) <= 0) {
                return (248 ^ 177) & ((121 ^ 48) ^ (-1));
            }
        } else {
            i3 = llllIIlIIIlI[12];
        }
        int V = ((i6 + i3) * llllIIlIIIlI[10]) + V();
        NPC K2 = K();
        int i7 = V * llllIIlIIIlI[10];
        if (lIIIlllllIIIlll(K2)) {
            hashCode = llllIIlIIIlI[13];
            "".length();
            if ((27 ^ 30) <= 0) {
                return (83 ^ 0) & ((48 ^ 99) ^ (-1));
            }
        } else {
            hashCode = K2.hashCode();
        }
        int i8 = i7 + hashCode;
        j L2 = L();
        int i9 = i8 * llllIIlIIIlI[10];
        if (lIIIlllllIIIlll(L2)) {
            hashCode2 = llllIIlIIIlI[13];
            "".length();
            if (" ".length() != " ".length()) {
                return (208 ^ 142) & ((30 ^ 64) ^ (-1));
            }
        } else {
            hashCode2 = L2.hashCode();
        }
        int i10 = i9 + hashCode2;
        l R2 = R();
        int i11 = i10 * llllIIlIIIlI[10];
        if (lIIIlllllIIIlll(R2)) {
            hashCode3 = llllIIlIIIlI[13];
            "".length();
            if ("  ".length() <= ((31 ^ 75) & ((249 ^ 173) ^ (-1)))) {
                return (140 ^ 166) & ((41 ^ 3) ^ (-1));
            }
        } else {
            hashCode3 = R2.hashCode();
        }
        int i12 = i11 + hashCode3;
        k S2 = S();
        int i13 = i12 * llllIIlIIIlI[10];
        if (lIIIlllllIIIlll(S2)) {
            hashCode4 = llllIIlIIIlI[13];
            "".length();
            if (0 != 0) {
                return ((220 ^ 140) ^ (137 ^ 134)) & (((181 ^ 137) ^ (210 ^ 177)) ^ (-" ".length()));
            }
        } else {
            hashCode4 = S2.hashCode();
        }
        return i13 + hashCode4;
    }

    public void m(int i) {
        this.af = i;
    }

    private static boolean lIIIlllllIIIlIl(Object obj) {
        return obj != null;
    }

    public j L() {
        return this.V;
    }

    public void a(NPC npc) {
        this.U = npc;
    }

    public void d(boolean z) {
        this.aa = z;
    }

    private static boolean lIIIlllllIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void l(int i) {
        this.Z = i;
    }

    private static boolean lIIIlllllIIIIll(int i, int i2) {
        return i == i2;
    }

    public static boolean a(Actor actor) {
        return Objects.equals(Integer.valueOf(actor.getId()), Integer.valueOf(llllIIlIIIlI[4]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
        if (lIIIllllIllllll(r0.equals(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d5, code lost:
        if (lIIIllllIllllll(r0.equals(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0246, code lost:
        if (lIIIllllIllllll(r0.equals(r0) ? 1 : 0) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02b8, code lost:
        if (lIIIllllIllllll(r0.equals(r0) ? 1 : 0) != false) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v136, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v140, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v154, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllllIIIIlI(obj, this)) {
            return llllIIlIIIlI[1];
        }
        if (lIIIllllIllllll(obj instanceof h ? 1 : 0)) {
            return llllIIlIIIlI[2];
        }
        h hVar = (h) obj;
        if (!lIIIllllIllllll(hVar.a(this) ? 1 : 0) && !lIIIllllIllllll(super.equals(obj) ? 1 : 0) && !lIIIlllllIIlIII(M(), hVar.M()) && !lIIIlllllIIlIII(N(), hVar.N()) && !lIIIlllllIIlIII(O(), hVar.O()) && !lIIIlllllIIlIII(P(), hVar.P())) {
            if (lIIIlllllIIlIII(Q() ? 1 : 0, hVar.Q() ? 1 : 0)) {
                return llllIIlIIIlI[2];
            }
            if (lIIIlllllIIlIII(T() ? 1 : 0, hVar.T() ? 1 : 0)) {
                return llllIIlIIIlI[2];
            }
            if (!lIIIlllllIIlIII(U() ? 1 : 0, hVar.U() ? 1 : 0) && !lIIIlllllIIlIII(V(), hVar.V())) {
                NPC K2 = K();
                NPC K3 = hVar.K();
                if (lIIIlllllIIIlll(K2)) {
                    if (lIIIlllllIIIlIl(K3)) {
                        "".length();
                        if ("   ".length() >= ((((11 + 8) - (-75)) + 36) ^ (((55 + 27) - 38) + 90))) {
                            return ((34 ^ 40) ^ (98 ^ 122)) & (((((52 + 70) - (-56)) + 2) ^ (((21 + 60) - (-39)) + 46)) ^ (-" ".length()));
                        }
                        return llllIIlIIIlI[2];
                    }
                    j L2 = L();
                    j L3 = hVar.L();
                    if (lIIIlllllIIIlll(L2)) {
                        if (lIIIlllllIIIlIl(L3)) {
                            "".length();
                            if ("  ".length() > "   ".length()) {
                                return ((((77 + 135) - 75) + 0) ^ (((2 + 109) - 58) + 87)) & (((((129 + 41) - 96) + 99) ^ (((33 + 25) - 19) + 129)) ^ (-" ".length()));
                            }
                            return llllIIlIIIlI[2];
                        }
                        l R2 = R();
                        l R3 = hVar.R();
                        if (lIIIlllllIIIlll(R2)) {
                            if (lIIIlllllIIIlIl(R3)) {
                                "".length();
                                if ("   ".length() == " ".length()) {
                                    return ((((54 + 79) - 60) + 88) ^ (((137 + 19) - 23) + 10)) & (((85 ^ 82) ^ (98 ^ 75)) ^ (-" ".length()));
                                }
                                return llllIIlIIIlI[2];
                            }
                            k S2 = S();
                            k S3 = hVar.S();
                            if (lIIIlllllIIIlll(S2)) {
                                if (lIIIlllllIIIlIl(S3)) {
                                    "".length();
                                    if ((-((58 ^ 116) ^ (125 ^ 55))) > 0) {
                                        return ((((84 + 72) - (-11)) + 9) ^ (((76 + 45) - 79) + 99)) & (((195 ^ 165) ^ (117 ^ 46)) ^ (-" ".length()));
                                    }
                                    return llllIIlIIIlI[2];
                                }
                                return llllIIlIIIlI[1];
                            }
                        }
                    }
                }
            }
            return llllIIlIIIlI[2];
        }
        return llllIIlIIIlI[2];
    }

    public void e(boolean z) {
        this.ad = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public void a(k kVar) {
        boolean z;
        this.ae = llllIIlIIIlI[2];
        this.ac = kVar;
        this.Y = llllIIlIIIlI[0];
        this.ad = llllIIlIIIlI[2];
        if (lIIIlllllIIIIIl(kVar, k.ENRAGED)) {
            int i = llllIIlIIIlI[1];
            "".length();
            z = i;
            if (0 != 0) {
                return;
            }
        } else {
            z = llllIIlIIIlI[2];
        }
        this.aa = z;
        this.af = Static.getClient().getTickCount();
        if (lIIIlllllIIIIlI(kVar, k.ENRAGED)) {
            E();
            this.X = llllIIlIIIlI[2];
        }
    }
}
