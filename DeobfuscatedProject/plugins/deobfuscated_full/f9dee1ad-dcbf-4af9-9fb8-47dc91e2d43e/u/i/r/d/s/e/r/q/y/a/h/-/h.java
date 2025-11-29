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
        h var30;
        k k2 = this.S();
        if (h.lIIIlllllIIIIlI((Object)k2, (Object)k.ENRAGED)) {
            return null;
        }
        if (h.lIIIlllllIIIlII(var30.Q() ? 1 : 0)) {
            void var22;
            return var22.Z().toWorld();
        }
        if (h.lIIIllllIllllll(var30.ae ? 1 : 0)) {
            k var17 = var30.H();
            if (!h.lIIIlllllIIIlIl((Object)var17) || h.lIIIlllllIIIIlI((Object)var17, (Object)k.ENRAGED)) {
                return null;
            }
            WorldPoint var4 = var17.Z().toWorld();
            WorldPoint var6 = var30.K().getWorldLocation();
            if (h.lIIIlllllIIIllI(var6.distanceTo(var4), llllIIlIIIlI[7])) {
                return var4;
            }
            if (h.lIIIlllllIIIlII(var6.equals((Object)var4) ? 1 : 0)) {
                var30.ae = llllIIlIIIlI[1];
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
        Deque var16 = Static.getClient().getGraphicsObjects();
        if (h.lIIIlllllIIIlll(var16)) {
            return llllIIlIIIlI[2];
        }
        int var10 = llllIIlIIIlI[2];
        Iterator var20 = var16.iterator();
        while (h.lIIIlllllIIIlII(var20.hasNext() ? 1 : 0)) {
            GraphicsObject var1 = (GraphicsObject)var20.next();
            if (h.lIIIlllllIIIIll(var1.getId(), llllIIlIIIlI[9])) {
                ++var10;
            }
            0;
            if (2 >= ((0x85 ^ 0xA5) & ~(0xA8 ^ 0x88))) continue;
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
            0;
            
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
        h var14;
        if (h.lIIIlllllIIIIll(this.Y, llllIIlIIIlI[1])) {
            return null;
        }
        int var23 = var14.X + llllIIlIIIlI[1];
        if (h.lIIIlllllIIIlII(var23 % llllIIlIIIlI[0])) {
            return var14.L();
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
        h.llllIIlIIIlI[0] = 3;
        h.llllIIlIIIlI[1] = 1;
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
            0;
            if ((6 + 149 - 4 + 26 ^ 113 + 94 - 172 + 146) != (0x3A ^ 0x4A ^ (0xF4 ^ 0x80))) {
                return ((0 ^ 0x13 ^ (0x65 ^ 0x4D)) & (0xB7 ^ 0x9F ^ (0x4C ^ 0x5F) ^ -1)) != 0;
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
        h var28;
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
            0;
            if ((0xB4 ^ 0x98 ^ (0x84 ^ 0xAD)) == 0) {
                return (0xDC ^ 0xB3 ^ (0x6D ^ 0x31)) & (0xE9 ^ 0xB7 ^ (0x36 ^ 0x5B) ^ -1);
            }
        } else {
            n8 = llllIIlIIIlI[12];
        }
        int var13 = n11 + n8;
        int n12 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(var28.T() ? 1 : 0)) {
            n7 = llllIIlIIIlI[11];
            0;
            if (3 <= 1) {
                return (2 ^ (0x21 ^ 0x1C)) & (0x2E ^ 0x40 ^ (0x4F ^ 0x1E) ^ -1);
            }
        } else {
            n7 = llllIIlIIIlI[12];
        }
        var13 = n12 + n7;
        int n13 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(var28.U() ? 1 : 0)) {
            n6 = llllIIlIIIlI[11];
            0;
            if ((0x30 ^ 0x35) <= 0) {
                return (0xF8 ^ 0xB1) & ~(0x79 ^ 0x30);
            }
        } else {
            n6 = llllIIlIIIlI[12];
        }
        var13 = n13 + n6;
        var13 = var13 * llllIIlIIIlI[10] + var28.V();
        NPC var11 = var28.K();
        int n14 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll(var11)) {
            n5 = llllIIlIIIlI[13];
            0;
            if ((0x1B ^ 0x1E) <= 0) {
                return (0x53 ^ 0) & ~(0x30 ^ 0x63);
            }
        } else {
            n5 = var11.hashCode();
        }
        var13 = n14 + n5;
        j var29 = var28.L();
        int n15 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var29)) {
            n4 = llllIIlIIIlI[13];
            0;
            if (1 != 1) {
                return (0xD0 ^ 0x8E) & ~(0x1E ^ 0x40);
            }
        } else {
            n4 = ((Object)((Object)var29)).hashCode();
        }
        var13 = n15 + n4;
        l var7 = var28.R();
        int n16 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var7)) {
            n3 = llllIIlIIIlI[13];
            0;
            if (2 <= ((0x1F ^ 0x4B) & ~(0xF9 ^ 0xAD))) {
                return (0x8C ^ 0xA6) & ~(0x29 ^ 3);
            }
        } else {
            n3 = ((Object)((Object)var7)).hashCode();
        }
        var13 = n16 + n3;
        k var3 = var28.S();
        int n17 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var3)) {
            n2 = llllIIlIIIlI[13];
            0;
            
            }
        } else {
            n2 = ((Object)((Object)var3)).hashCode();
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
                k var19;
                k var18;
                block41: {
                    h var21;
                    h var25;
                    block39: {
                        block40: {
                            l var24;
                            l var5;
                            block38: {
                                block36: {
                                    block37: {
                                        j var27;
                                        j var2;
                                        block35: {
                                            block33: {
                                                block34: {
                                                    NPC var12;
                                                    NPC var8;
                                                    block32: {
                                                        void var15;
                                                        if (h.lIIIlllllIIIIlI(object, this)) {
                                                            return llllIIlIIIlI[1];
                                                        }
                                                        if (h.lIIIllllIllllll(var15 instanceof h)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        var25 = (h)var15;
                                                        if (h.lIIIllllIllllll(var25.a(var21) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIllllIllllll(super.equals(var15) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.M(), var25.M())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.N(), var25.N())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.O(), var25.O())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.P(), var25.P())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.Q() ? 1 : 0, var25.Q() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.T() ? 1 : 0, var25.T() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.U() ? 1 : 0, var25.U() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var21.V(), var25.V())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        var8 = var21.K();
                                                        var12 = var25.K();
                                                        if (!h.lIIIlllllIIIlll(var8)) break block32;
                                                        if (!h.lIIIlllllIIIlIl(var12)) break block33;
                                                        0;
                                                        if (3 >= (11 + 8 - -75 + 36 ^ 55 + 27 - 38 + 90)) {
                                                            return ((0x22 ^ 0x28 ^ (0x62 ^ 0x7A)) & (52 + 70 - -56 + 2 ^ 21 + 60 - -39 + 46 ^ -1)) != 0;
                                                        }
                                                        break block34;
                                                    }
                                                    if (!h.lIIIllllIllllll(var8.equals(var12) ? 1 : 0)) break block33;
                                                }
                                                return llllIIlIIIlI[2];
                                            }
                                            var2 = var21.L();
                                            var27 = var25.L();
                                            if (!h.lIIIlllllIIIlll((Object)var2)) break block35;
                                            if (!h.lIIIlllllIIIlIl((Object)var27)) break block36;
                                            0;
                                            if (2 > 3) {
                                                return false;
                                            }
                                            break block37;
                                        }
                                        if (!h.lIIIllllIllllll(((Object)((Object)var2)).equals((Object)var27) ? 1 : 0)) break block36;
                                    }
                                    return llllIIlIIIlI[2];
                                }
                                var5 = var21.R();
                                var24 = var25.R();
                                if (!h.lIIIlllllIIIlll((Object)var5)) break block38;
                                if (!h.lIIIlllllIIIlIl((Object)var24)) break block39;
                                0;
                                if (3 == 1) {
                                    return ((54 + 79 - 60 + 88 ^ 137 + 19 - 23 + 10) & (0x55 ^ 0x52 ^ (0x62 ^ 0x4B) ^ -1)) != 0;
                                }
                                break block40;
                            }
                            if (!h.lIIIllllIllllll(((Object)((Object)var5)).equals((Object)var24) ? 1 : 0)) break block39;
                        }
                        return llllIIlIIIlI[2];
                    }
                    var18 = var21.S();
                    var19 = var25.S();
                    if (!h.lIIIlllllIIIlll((Object)var18)) break block41;
                    if (!h.lIIIlllllIIIlIl((Object)var19)) break block42;
                    0;
                    if (-(0x3A ^ 0x74 ^ (0x7D ^ 0x37)) > 0) {
                        return ((84 + 72 - -11 + 9 ^ 76 + 45 - 79 + 99) & (0xC3 ^ 0xA5 ^ (0x75 ^ 0x2E) ^ -1)) != 0;
                    }
                    break block43;
                }
                if (!h.lIIIllllIllllll(((Object)((Object)var18)).equals((Object)var19) ? 1 : 0)) break block42;
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
        void var9;
        int n2;
        this.ae = llllIIlIIIlI[2];
        this.ac = k2;
        this.Y = llllIIlIIIlI[0];
        this.ad = llllIIlIIIlI[2];
        if (h.lIIIlllllIIIIIl((Object)k2, (Object)k.ENRAGED)) {
            n2 = llllIIlIIIlI[1];
            0;
            
            }
        } else {
            n2 = llllIIlIIIlI[2];
        }
        this.aa = n2;
        var26.af = Static.getClient().getTickCount();
        if (h.lIIIlllllIIIIlI(var9, (Object)k.ENRAGED)) {
            h var26;
            var26.E();
            var26.X = llllIIlIIIlI[2];
        }
    }
}

