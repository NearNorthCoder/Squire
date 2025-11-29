/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.client.Static
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import java.util.Iterator;
import java.util.Objects;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;
import u.i.r.d.s.e.r.q.y.a.h.-.f;
import u.i.r.d.s.e.r.q.y.a.h.-.i;
import u.i.r.d.s.e.r.q.y.a.h.-.j;
import u.i.r.d.s.e.r.q.y.a.h.-.k;
import u.i.r.d.s.e.r.q.y.a.h.-.l;

@Singleton
public class h
extends f {
    private /* synthetic */ boolean aa;
    private /* synthetic */ j V;
    private /* synthetic */ int Z;
    public static final /* synthetic */ int K;
    public static final /* synthetic */ int C;
    public static final /* synthetic */ int M;
    private /* synthetic */ boolean ae;
    private static /* synthetic */ int[] llllIIlIIIlI;
    private /* synthetic */ int X;
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
    private /* synthetic */ k ac;
    private static final /* synthetic */ int Q;
    public static final /* synthetic */ int J;
    private /* synthetic */ l ab;
    private /* synthetic */ boolean ad;
    private /* synthetic */ int W;
    private /* synthetic */ int Y;
    public static final /* synthetic */ int G;
    private static final /* synthetic */ int P;

    /*
     * WARNING - void declaration
     */
    public WorldPoint c(boolean bl) {
        h lllllllllllllllIIlIlIllIllIlIIIl;
        k k2 = this.S();
        if (h.lIIIlllllIIIIlI((Object)k2, (Object)k.ENRAGED)) {
            return null;
        }
        if (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIllIlIIIl.Q() ? 1 : 0)) {
            void lllllllllllllllIIlIlIllIllIlIIII;
            return lllllllllllllllIIlIlIllIllIlIIII.Z().toWorld();
        }
        if (h.lIIIllllIllllll(lllllllllllllllIIlIlIllIllIlIIIl.ae ? 1 : 0)) {
            k lllllllllllllllIIlIlIllIllIIllll = lllllllllllllllIIlIlIllIllIlIIIl.H();
            if (!h.lIIIlllllIIIlIl((Object)lllllllllllllllIIlIlIllIllIIllll) || h.lIIIlllllIIIIlI((Object)lllllllllllllllIIlIlIllIllIIllll, (Object)k.ENRAGED)) {
                return null;
            }
            WorldPoint lllllllllllllllIIlIlIllIllIIlllI = lllllllllllllllIIlIlIllIllIIllll.Z().toWorld();
            WorldPoint lllllllllllllllIIlIlIllIllIIllIl = lllllllllllllllIIlIlIllIllIlIIIl.K().getWorldLocation();
            if (h.lIIIlllllIIIllI(lllllllllllllllIIlIlIllIllIIllIl.distanceTo(lllllllllllllllIIlIlIllIllIIlllI), llllIIlIIIlI[7])) {
                return lllllllllllllllIIlIlIllIllIIlllI;
            }
            if (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIllIIllIl.equals((Object)lllllllllllllllIIlIlIllIllIIlllI) ? 1 : 0)) {
                lllllllllllllllIIlIlIllIllIlIIIl.ae = llllIIlIIIlI[1];
            }
        }
        return null;
    }

    public int w() {
        if (h.lIIIlllllIIIIlI((Object)this.S(), (Object)k.ENRAGED)) {
            return llllIIlIIIlI[7];
        }
        return llllIIlIIIlI[8];
    }

    @Override
    public Prayer x() {
        if (h.lIIIllllIllllll(this.Y)) {
            return null;
        }
        return this.V.X();
    }

    public l R() {
        return this.ab;
    }

    /*
     * WARNING - void declaration
     */
    public int I() {
        void var2_2;
        if (h.lIIIlllllIIIIIl((Object)this.S(), (Object)k.LIGHTNING)) {
            return llllIIlIIIlI[2];
        }
        Deque lllllllllllllllIIlIlIllIllIIIlII = Static.getClient().getGraphicsObjects();
        if (h.lIIIlllllIIIlll(lllllllllllllllIIlIlIllIllIIIlII)) {
            return llllIIlIIIlI[2];
        }
        int lllllllllllllllIIlIlIllIllIIIIll = llllIIlIIIlI[2];
        Iterator lllllllllllllllIIlIlIllIllIIIIlI = lllllllllllllllIIlIlIllIllIIIlII.iterator();
        while (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIllIIIIlI.hasNext() ? 1 : 0)) {
            GraphicsObject lllllllllllllllIIlIlIllIllIIIIIl = (GraphicsObject)lllllllllllllllIIlIlIllIllIIIIlI.next();
            if (h.lIIIlllllIIIIll(lllllllllllllllIIlIlIllIllIIIIIl.getId(), llllIIlIIIlI[9])) {
                ++lllllllllllllllIIlIlIllIllIIIIll;
            }
            "".length();
            if ("  ".length() >= ((0x85 ^ 0xA5) & ~(0xA8 ^ 0x88))) continue;
            return (0x38 ^ 0x22) & ~(0x7D ^ 0x67);
        }
        return (int)var2_2;
    }

    public void D() {
        if (h.lIIIlllllIIIIIl((Object)this.S(), (Object)k.ENRAGED)) {
            this.E();
        }
        this.X += llllIIlIIIlI[1];
        this.ad = llllIIlIIIlI[1];
    }

    public k S() {
        return this.ac;
    }

    public h(NPC nPC) {
        this.V = j.MAGIC;
        this.Y = llllIIlIIIlI[0];
        this.aa = llllIIlIIIlI[1];
        this.ab = l.WAITING;
        this.U = nPC;
        this.X = llllIIlIIIlI[2];
        this.W = llllIIlIIIlI[3];
        this.ac = k.POISON;
        this.ad = llllIIlIIIlI[2];
    }

    public void k(int n2) {
        this.Y = n2;
    }

    public void j(int n2) {
        this.X = n2;
    }

    private static boolean lIIIlllllIIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllllIIIlll(Object object) {
        return object == null;
    }

    public k H() {
        switch (i.ag[this.ac.ordinal()]) {
            case 1: {
                return k.LIGHTNING;
            }
            case 2: {
                return k.FLAME;
            }
            case 3: {
                return k.ENRAGED;
            }
        }
        return null;
    }

    public int C() {
        return Static.getClient().getTickCount() - this.Z - llllIIlIIIlI[6];
    }

    public j J() {
        j j2;
        if (h.lIIIlllllIIIIlI((Object)this.V, (Object)j.MAGIC)) {
            j2 = j.RANGED;
            "".length();
            if (null != null) {
                return null;
            }
        } else {
            j2 = j.MAGIC;
        }
        return j2;
    }

    private static boolean lIIIlllllIIlIII(int n2, int n3) {
        return n2 != n3;
    }

    public void f(boolean bl) {
        this.ae = bl;
    }

    public void i(int n2) {
        this.W = n2;
    }

    private j F() {
        h lllllllllllllllIIlIlIllIllIlllII;
        if (h.lIIIlllllIIIIll(this.Y, llllIIlIIIlI[1])) {
            return null;
        }
        int lllllllllllllllIIlIlIllIllIllIll = lllllllllllllllIIlIlIllIllIlllII.X + llllIIlIIIlI[1];
        if (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIllIllIll % llllIIlIIIlI[0])) {
            return lllllllllllllllIIlIlIllIllIlllII.L();
        }
        return this.J();
    }

    public boolean U() {
        return this.ae;
    }

    public String toString() {
        return "AlchemicalHydra(actor=" + String.valueOf(this.K()) + ", attackStyle=" + String.valueOf((Object)this.L()) + ", health=" + this.M() + ", attacks=" + this.N() + ", nextSpecial=" + this.O() + ", stunTick=" + this.P() + ", immunity=" + this.Q() + ", lightningSkipped=" + String.valueOf((Object)this.R()) + ", phase=" + String.valueOf((Object)this.S()) + ", attackedSincePhaseChange=" + this.T() + ", movedToNextTile=" + this.U() + ", changeTick=" + this.V() + ")";
    }

    public void s() {
        this.X += llllIIlIIIlI[1];
        this.ad = llllIIlIIIlI[1];
        if (h.lIIIllllIllllll(this.X % this.ac.aa())) {
            this.E();
        }
    }

    private static void lIIIllllIlllllI() {
        llllIIlIIIlI = new int[25];
        h.llllIIlIIIlI[0] = "   ".length();
        h.llllIIlIIIlI[1] = " ".length();
        h.llllIIlIIIlI[2] = (0x6C ^ 0x32) & ~(0xE0 ^ 0xBE);
        h.llllIIlIIIlI[3] = 0xFFFFBFED & 0x445E;
        h.llllIIlIIIlI[4] = -(0xFFFFED6B & 0x56DD) & (0xFFFFFDFF & 0x67EF);
        h.llllIIlIIIlI[5] = 0x9D ^ 0xAF ^ (0x59 ^ 0x62);
        h.llllIIlIIIlI[6] = 0x59 ^ 0x5E;
        h.llllIIlIIIlI[7] = 0x86 ^ 0x82;
        h.llllIIlIIIlI[8] = 44 + 98 - 29 + 49 ^ 65 + 46 - -53 + 0;
        h.llllIIlIIIlI[9] = -(0xFFFFFBEE & 0x7D53) & (0xFFFFFFC3 & Short.MAX_VALUE);
        h.llllIIlIIIlI[10] = 154 + 97 - 223 + 135 ^ 80 + 150 - 83 + 5;
        h.llllIIlIIIlI[11] = 0x76 ^ 0x39;
        h.llllIIlIIIlI[12] = 0xDB ^ 0xBA;
        h.llllIIlIIIlI[13] = 0x1E ^ 0x35;
        h.llllIIlIIIlI[14] = 0xFFFFE17F & 0x3EAD;
        h.llllIIlIIIlI[15] = 0x31 ^ 0x1B;
        h.llllIIlIIIlI[16] = -(0xFFFFFDE1 & 0x1A1F) & (0xFFFFF935 & 0x3EFF);
        h.llllIIlIIIlI[17] = 0xFFFFB038 & 0x6FFF;
        h.llllIIlIIIlI[18] = -(0xFFFFF35F & 0x5FE1) & (0xFFFFFB7E & 0x77FD);
        h.llllIIlIIIlI[19] = 0xFFFFA04A & 0x7FF7;
        h.llllIIlIIIlI[20] = 0xFFFFB9F3 & 0x663D;
        h.llllIIlIIIlI[21] = 0xFFFFACCD & 0x7373;
        h.llllIIlIIIlI[22] = -(0xFFFF9B37 & 0x6DCD) & (0xFFFFB93F & 0x6FFF);
        h.llllIIlIIIlI[23] = 0xFFFFE52E & 0x3AFF;
        h.llllIIlIIIlI[24] = 0xFFFFEB77 & 0x34BC;
    }

    public void a(l l2) {
        this.ab = l2;
    }

    private static boolean lIIIlllllIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlllllIIIllI(int n2, int n3) {
        return n2 > n3;
    }

    public int O() {
        return this.Y;
    }

    public int V() {
        return this.af;
    }

    private void E() {
        this.V = this.J();
    }

    public boolean Q() {
        return this.aa;
    }

    public int M() {
        return this.W;
    }

    private static boolean lIIIlllllIIIIII(int n2) {
        return n2 <= 0;
    }

    public int N() {
        return this.X;
    }

    public int P() {
        return this.Z;
    }

    public void b(k k2) {
        this.ac = k2;
    }

    public boolean B() {
        boolean bl;
        if (h.lIIIlllllIIIIII(this.C())) {
            bl = llllIIlIIIlI[1];
            "".length();
            if ((6 + 149 - 4 + 26 ^ 113 + 94 - 172 + 146) != (0x3A ^ 0x4A ^ (0xF4 ^ 0x80))) {
                return ((0 ^ 0x13 ^ (0x65 ^ 0x4D)) & (0xB7 ^ 0x9F ^ (0x4C ^ 0x5F) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIIlIIIlI[2];
        }
        return bl;
    }

    protected boolean a(Object object) {
        return object instanceof h;
    }

    public NPC K() {
        return this.U;
    }

    static {
        h.lIIIllllIlllllI();
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

    public void a(j j2) {
        this.V = j2;
    }

    public boolean T() {
        return this.ad;
    }

    private static boolean lIIIllllIllllll(int n2) {
        return n2 == 0;
    }

    public void A() {
        this.Y += llllIIlIIIlI[5];
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        h lllllllllllllllIIlIlIllIlIlIIIIl;
        int n8;
        int n9 = llllIIlIIIlI[10];
        int n10 = super.hashCode();
        n10 = n10 * llllIIlIIIlI[10] + this.M();
        n10 = n10 * llllIIlIIIlI[10] + this.N();
        n10 = n10 * llllIIlIIIlI[10] + this.O();
        n10 = n10 * llllIIlIIIlI[10] + this.P();
        int n11 = n10 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(this.Q() ? 1 : 0)) {
            n8 = llllIIlIIIlI[11];
            "".length();
            if ((0xB4 ^ 0x98 ^ (0x84 ^ 0xAD)) == 0) {
                return (0xDC ^ 0xB3 ^ (0x6D ^ 0x31)) & (0xE9 ^ 0xB7 ^ (0x36 ^ 0x5B) ^ -" ".length());
            }
        } else {
            n8 = llllIIlIIIlI[12];
        }
        int lllllllllllllllIIlIlIllIlIIlllll = n11 + n8;
        int n12 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIlIlIIIIl.T() ? 1 : 0)) {
            n7 = llllIIlIIIlI[11];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ("  ".length() ^ (0x21 ^ 0x1C)) & (0x2E ^ 0x40 ^ (0x4F ^ 0x1E) ^ -" ".length());
            }
        } else {
            n7 = llllIIlIIIlI[12];
        }
        lllllllllllllllIIlIlIllIlIIlllll = n12 + n7;
        int n13 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(lllllllllllllllIIlIlIllIlIlIIIIl.U() ? 1 : 0)) {
            n6 = llllIIlIIIlI[11];
            "".length();
            if ((0x30 ^ 0x35) <= 0) {
                return (0xF8 ^ 0xB1) & ~(0x79 ^ 0x30);
            }
        } else {
            n6 = llllIIlIIIlI[12];
        }
        lllllllllllllllIIlIlIllIlIIlllll = n13 + n6;
        lllllllllllllllIIlIlIllIlIIlllll = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10] + lllllllllllllllIIlIlIllIlIlIIIIl.V();
        NPC lllllllllllllllIIlIlIllIlIIllllI = lllllllllllllllIIlIlIllIlIlIIIIl.K();
        int n14 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll(lllllllllllllllIIlIlIllIlIIllllI)) {
            n5 = llllIIlIIIlI[13];
            "".length();
            if ((0x1B ^ 0x1E) <= 0) {
                return (0x53 ^ 0) & ~(0x30 ^ 0x63);
            }
        } else {
            n5 = lllllllllllllllIIlIlIllIlIIllllI.hashCode();
        }
        lllllllllllllllIIlIlIllIlIIlllll = n14 + n5;
        j lllllllllllllllIIlIlIllIlIIlllIl = lllllllllllllllIIlIlIllIlIlIIIIl.L();
        int n15 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIIlllIl)) {
            n4 = llllIIlIIIlI[13];
            "".length();
            if (" ".length() != " ".length()) {
                return (0xD0 ^ 0x8E) & ~(0x1E ^ 0x40);
            }
        } else {
            n4 = ((Object)((Object)lllllllllllllllIIlIlIllIlIIlllIl)).hashCode();
        }
        lllllllllllllllIIlIlIllIlIIlllll = n15 + n4;
        l lllllllllllllllIIlIlIllIlIIlllII = lllllllllllllllIIlIlIllIlIlIIIIl.R();
        int n16 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIIlllII)) {
            n3 = llllIIlIIIlI[13];
            "".length();
            if ("  ".length() <= ((0x1F ^ 0x4B) & ~(0xF9 ^ 0xAD))) {
                return (0x8C ^ 0xA6) & ~(0x29 ^ 3);
            }
        } else {
            n3 = ((Object)((Object)lllllllllllllllIIlIlIllIlIIlllII)).hashCode();
        }
        lllllllllllllllIIlIlIllIlIIlllll = n16 + n3;
        k lllllllllllllllIIlIlIllIlIIllIll = lllllllllllllllIIlIlIllIlIlIIIIl.S();
        int n17 = lllllllllllllllIIlIlIllIlIIlllll * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIIllIll)) {
            n2 = llllIIlIIIlI[13];
            "".length();
            if (null != null) {
                return (0xDC ^ 0x8C ^ (0x89 ^ 0x86)) & (0xB5 ^ 0x89 ^ (0xD2 ^ 0xB1) ^ -" ".length());
            }
        } else {
            n2 = ((Object)((Object)lllllllllllllllIIlIlIllIlIIllIll)).hashCode();
        }
        n10 = n17 + n2;
        return n10;
    }

    public void m(int n2) {
        this.af = n2;
    }

    private static boolean lIIIlllllIIIlIl(Object object) {
        return object != null;
    }

    public j L() {
        return this.V;
    }

    public void a(NPC nPC) {
        this.U = nPC;
    }

    public void d(boolean bl) {
        this.aa = bl;
    }

    private static boolean lIIIlllllIIIIIl(Object object, Object object2) {
        return object != object2;
    }

    public void l(int n2) {
        this.Z = n2;
    }

    private static boolean lIIIlllllIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    public static boolean a(Actor actor) {
        return Objects.equals(actor.getId(), llllIIlIIIlI[4]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block42: {
            block43: {
                k lllllllllllllllIIlIlIllIlIlIlIIl;
                k lllllllllllllllIIlIlIllIlIlIlIlI;
                block41: {
                    h lllllllllllllllIIlIlIllIlIllIIll;
                    h lllllllllllllllIIlIlIllIlIllIIIl;
                    block39: {
                        block40: {
                            l lllllllllllllllIIlIlIllIlIlIlIll;
                            l lllllllllllllllIIlIlIllIlIlIllII;
                            block38: {
                                block36: {
                                    block37: {
                                        j lllllllllllllllIIlIlIllIlIlIllIl;
                                        j lllllllllllllllIIlIlIllIlIlIlllI;
                                        block35: {
                                            block33: {
                                                block34: {
                                                    NPC lllllllllllllllIIlIlIllIlIlIllll;
                                                    NPC lllllllllllllllIIlIlIllIlIllIIII;
                                                    block32: {
                                                        void lllllllllllllllIIlIlIllIlIllIIlI;
                                                        if (h.lIIIlllllIIIIlI(object, this)) {
                                                            return llllIIlIIIlI[1];
                                                        }
                                                        if (h.lIIIllllIllllll(lllllllllllllllIIlIlIllIlIllIIlI instanceof h)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        lllllllllllllllIIlIlIllIlIllIIIl = (h)lllllllllllllllIIlIlIllIlIllIIlI;
                                                        if (h.lIIIllllIllllll(lllllllllllllllIIlIlIllIlIllIIIl.a(lllllllllllllllIIlIlIllIlIllIIll) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIllllIllllll(super.equals(lllllllllllllllIIlIlIllIlIllIIlI) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.M(), lllllllllllllllIIlIlIllIlIllIIIl.M())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.N(), lllllllllllllllIIlIlIllIlIllIIIl.N())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.O(), lllllllllllllllIIlIlIllIlIllIIIl.O())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.P(), lllllllllllllllIIlIlIllIlIllIIIl.P())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.Q() ? 1 : 0, lllllllllllllllIIlIlIllIlIllIIIl.Q() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.T() ? 1 : 0, lllllllllllllllIIlIlIllIlIllIIIl.T() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.U() ? 1 : 0, lllllllllllllllIIlIlIllIlIllIIIl.U() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(lllllllllllllllIIlIlIllIlIllIIll.V(), lllllllllllllllIIlIlIllIlIllIIIl.V())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        lllllllllllllllIIlIlIllIlIllIIII = lllllllllllllllIIlIlIllIlIllIIll.K();
                                                        lllllllllllllllIIlIlIllIlIlIllll = lllllllllllllllIIlIlIllIlIllIIIl.K();
                                                        if (!h.lIIIlllllIIIlll(lllllllllllllllIIlIlIllIlIllIIII)) break block32;
                                                        if (!h.lIIIlllllIIIlIl(lllllllllllllllIIlIlIllIlIlIllll)) break block33;
                                                        "".length();
                                                        if ("   ".length() >= (11 + 8 - -75 + 36 ^ 55 + 27 - 38 + 90)) {
                                                            return ((0x22 ^ 0x28 ^ (0x62 ^ 0x7A)) & (52 + 70 - -56 + 2 ^ 21 + 60 - -39 + 46 ^ -" ".length())) != 0;
                                                        }
                                                        break block34;
                                                    }
                                                    if (!h.lIIIllllIllllll(lllllllllllllllIIlIlIllIlIllIIII.equals(lllllllllllllllIIlIlIllIlIlIllll) ? 1 : 0)) break block33;
                                                }
                                                return llllIIlIIIlI[2];
                                            }
                                            lllllllllllllllIIlIlIllIlIlIlllI = lllllllllllllllIIlIlIllIlIllIIll.L();
                                            lllllllllllllllIIlIlIllIlIlIllIl = lllllllllllllllIIlIlIllIlIllIIIl.L();
                                            if (!h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIlIlllI)) break block35;
                                            if (!h.lIIIlllllIIIlIl((Object)lllllllllllllllIIlIlIllIlIlIllIl)) break block36;
                                            "".length();
                                            if ("  ".length() > "   ".length()) {
                                                return ((77 + 135 - 75 + 0 ^ 2 + 109 - 58 + 87) & (129 + 41 - 96 + 99 ^ 33 + 25 - 19 + 129 ^ -" ".length())) != 0;
                                            }
                                            break block37;
                                        }
                                        if (!h.lIIIllllIllllll(((Object)((Object)lllllllllllllllIIlIlIllIlIlIlllI)).equals((Object)lllllllllllllllIIlIlIllIlIlIllIl) ? 1 : 0)) break block36;
                                    }
                                    return llllIIlIIIlI[2];
                                }
                                lllllllllllllllIIlIlIllIlIlIllII = lllllllllllllllIIlIlIllIlIllIIll.R();
                                lllllllllllllllIIlIlIllIlIlIlIll = lllllllllllllllIIlIlIllIlIllIIIl.R();
                                if (!h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIlIllII)) break block38;
                                if (!h.lIIIlllllIIIlIl((Object)lllllllllllllllIIlIlIllIlIlIlIll)) break block39;
                                "".length();
                                if ("   ".length() == " ".length()) {
                                    return ((54 + 79 - 60 + 88 ^ 137 + 19 - 23 + 10) & (0x55 ^ 0x52 ^ (0x62 ^ 0x4B) ^ -" ".length())) != 0;
                                }
                                break block40;
                            }
                            if (!h.lIIIllllIllllll(((Object)((Object)lllllllllllllllIIlIlIllIlIlIllII)).equals((Object)lllllllllllllllIIlIlIllIlIlIlIll) ? 1 : 0)) break block39;
                        }
                        return llllIIlIIIlI[2];
                    }
                    lllllllllllllllIIlIlIllIlIlIlIlI = lllllllllllllllIIlIlIllIlIllIIll.S();
                    lllllllllllllllIIlIlIllIlIlIlIIl = lllllllllllllllIIlIlIllIlIllIIIl.S();
                    if (!h.lIIIlllllIIIlll((Object)lllllllllllllllIIlIlIllIlIlIlIlI)) break block41;
                    if (!h.lIIIlllllIIIlIl((Object)lllllllllllllllIIlIlIllIlIlIlIIl)) break block42;
                    "".length();
                    if (-(0x3A ^ 0x74 ^ (0x7D ^ 0x37)) > 0) {
                        return ((84 + 72 - -11 + 9 ^ 76 + 45 - 79 + 99) & (0xC3 ^ 0xA5 ^ (0x75 ^ 0x2E) ^ -" ".length())) != 0;
                    }
                    break block43;
                }
                if (!h.lIIIllllIllllll(((Object)((Object)lllllllllllllllIIlIlIllIlIlIlIlI)).equals((Object)lllllllllllllllIIlIlIllIlIlIlIIl) ? 1 : 0)) break block42;
            }
            return llllIIlIIIlI[2];
        }
        return llllIIlIIIlI[1];
    }

    public void e(boolean bl) {
        this.ad = bl;
    }

    /*
     * WARNING - void declaration
     */
    public void a(k k2) {
        void lllllllllllllllIIlIlIllIlllIIIIl;
        int n2;
        this.ae = llllIIlIIIlI[2];
        this.ac = k2;
        this.Y = llllIIlIIIlI[0];
        this.ad = llllIIlIIIlI[2];
        if (h.lIIIlllllIIIIIl((Object)k2, (Object)k.ENRAGED)) {
            n2 = llllIIlIIIlI[1];
            "".length();
            if (null != null) {
                return;
            }
        } else {
            n2 = llllIIlIIIlI[2];
        }
        this.aa = n2;
        lllllllllllllllIIlIlIllIlllIIIlI.af = Static.getClient().getTickCount();
        if (h.lIIIlllllIIIIlI(lllllllllllllllIIlIlIllIlllIIIIl, (Object)k.ENRAGED)) {
            h lllllllllllllllIIlIlIllIlllIIIlI;
            lllllllllllllllIIlIlIllIlllIIIlI.E();
            lllllllllllllllIIlIlIllIlllIIIlI.X = llllIIlIIIlI[2];
        }
    }
}

