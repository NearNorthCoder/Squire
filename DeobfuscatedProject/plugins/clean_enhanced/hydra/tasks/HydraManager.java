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
package gg.squire.hydra.tasks;

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
import gg.squire.hydra.tasks.HydraTaskBase;
import gg.squire.hydra.tasks.IHelper;
import gg.squire.hydra.tasks.GameEnum3;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum4;

@Singleton
public class HydraManager
extends HydraTaskBase {
    private  boolean aa;
    private  j V;
    private  int Z;
    public static final  int K;
    public static final  int C;
    public static final  int M;
    private  boolean ae;
    
    private  int X;
    public static final  int L;
    private static final  int O;
    private static final  int R;
    private  int af;
    private  NPC U;
    private static final  int T;
    public static final  int D;
    private static final  int N;
    public static final  int E;
    private static final  int S;
    public static final  int H;
    public static final  int F;
    public static final  int I;
    private  k ac;
    private static final  int Q;
    public static final  int J;
    private  l ab;
    private  boolean ad;
    private  int W;
    private  int Y;
    public static final  int G;
    private static final  int P;

    /*
     * WARNING - void declaration
     */
    public WorldPoint c(boolean bl) {
        h var2;
        k k2 = this.S();
        if (h.var3((Object)k2, (Object)k.ENRAGED)) {
            return null;
        }
        if (h.var4(var2.Q() ? 1 : 0)) {
            void var5;
            return var5.Z().toWorld();
        }
        if (h.var6(var2.ae)) {
            k var7 = var2.H();
            if (!h.var8((Object)var7) || h.var3((Object)var7, (Object)k.ENRAGED)) {
                return null;
            }
            WorldPoint var9 = var7.Z().toWorld();
            WorldPoint var10 = var2.K().getWorldLocation();
            if (h.var11(var10.distanceTo(var9), var1[7])) {
                return var9;
            }
            if (h.var4(var10.equals((Object)var9) ? 1 : 0)) {
                var2.ae = var1[1];
            }
        }
        return null;
    }

    public int w() {
        if (h.var3((Object)this.S(), (Object)k.ENRAGED)) {
            return var1[7];
        }
        return var1[8];
    }

    @Override
    public Prayer x() {
        if (h.var6(this.Y)) {
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
        if (h.var12((Object)this.S(), (Object)k.LIGHTNING)) {
            return var1[2];
        }
        Deque var13 = Static.getClient().getGraphicsObjects();
        if (h.var14(var13)) {
            return var1[2];
        }
        int var15 = var1[2];
        Iterator var16 = var13.iterator();
        while (h.var4(var16.hasNext() ? 1 : 0)) {
            GraphicsObject var17 = (GraphicsObject)var16.next();
            if (h.var18(var17.getId(), var1[9])) {
                ++var15;
            }
            0;
            if (2 >= ((0x85 ^ 0xA5) & ~(0xA8 ^ 0x88))) continue;
            return (0x38 ^ 0x22) & ~(0x7D ^ 0x67);
        }
        return (int)var2_2;
    }

    public void D() {
        if (h.var12((Object)this.S(), (Object)k.ENRAGED)) {
            this.E();
        }
        this.X += var1[1];
        this.ad = var1[1];
    }

    public k S() {
        return this.ac;
    }

    public HydraManager(NPC nPC) {
        this.V = j.MAGIC;
        this.Y = var1[0];
        this.aa = var1[1];
        this.ab = l.WAITING;
        this.U = nPC;
        this.X = var1[2];
        this.W = var1[3];
        this.ac = k.POISON;
        this.ad = var1[2];
    }

    public void k(int n2) {
        this.Y = n2;
    }

    public void j(int n2) {
        this.X = n2;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var14(Object object) {
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
        return Static.getClient().getTickCount() - this.Z - var1[6];
    }

    public j J() {
        j j2;
        if (h.var3((Object)this.V, (Object)j.MAGIC)) {
            j2 = j.RANGED;
            0;
            if null != null {
                return null;
            }
        } else {
            j2 = j.MAGIC;
        }
        return j2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 != n3;
    }

    public void f(boolean bl) {
        this.ae = bl;
    }

    public void i(int n2) {
        this.W = n2;
    }

    private j F() {
        h var20;
        if (h.var18(this.Y, var1[1])) {
            return null;
        }
        int var21 = var20.X + var1[1];
        if (h.var4(var21 % var1[0])) {
            return var20.L();
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
        this.X += var1[1];
        this.ad = var1[1];
        if (h.var6(this.X % this.ac.aa())) {
            this.E();
        }
    }

    private static void var22() {
        var1 = new int[25];
        h.var1[0] = 3;
        h.var1[1] = 1;
        h.var1[2] = (0x6C ^ 0x32) & ~(0xE0 ^ 0xBE);
        h.var1[3] = 0xFFFFBFED & 0x445E;
        h.var1[4] = -(0xFFFFED6B & 0x56DD) & (0xFFFFFDFF & 0x67EF);
        h.var1[5] = 0x9D ^ 0xAF ^ (0x59 ^ 0x62);
        h.var1[6] = 0x59 ^ 0x5E;
        h.var1[7] = 0x86 ^ 0x82;
        h.var1[8] = 44 + 98 - 29 + 49 ^ 65 + 46 - -53 + 0;
        h.var1[9] = -(0xFFFFFBEE & 0x7D53) & (0xFFFFFFC3 & Short.MAX_VALUE);
        h.var1[10] = 154 + 97 - 223 + 135 ^ 80 + 150 - 83 + 5;
        h.var1[11] = 0x76 ^ 0x39;
        h.var1[12] = 0xDB ^ 0xBA;
        h.var1[13] = 0x1E ^ 0x35;
        h.var1[14] = 0xFFFFE17F & 0x3EAD;
        h.var1[15] = 0x31 ^ 0x1B;
        h.var1[16] = -(0xFFFFFDE1 & 0x1A1F) & (0xFFFFF935 & 0x3EFF);
        h.var1[17] = 0xFFFFB038 & 0x6FFF;
        h.var1[18] = -(0xFFFFF35F & 0x5FE1) & (0xFFFFFB7E & 0x77FD);
        h.var1[19] = 0xFFFFA04A & 0x7FF7;
        h.var1[20] = 0xFFFFB9F3 & 0x663D;
        h.var1[21] = 0xFFFFACCD & 0x7373;
        h.var1[22] = -(0xFFFF9B37 & 0x6DCD) & (0xFFFFB93F & 0x6FFF);
        h.var1[23] = 0xFFFFE52E & 0x3AFF;
        h.var1[24] = 0xFFFFEB77 & 0x34BC;
    }

    public void a(l l2) {
        this.ab = l2;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var11(int n2, int n3) {
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

    private static boolean var23(int n2) {
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
        if (h.var23(this.C())) {
            bl = var1[1];
            0;
            if ((6 + 149 - 4 + 26 ^ 113 + 94 - 172 + 146) != (0x3A ^ 0x4A ^ (0xF4 ^ 0x80))) {
                return ((0 ^ 0x13 ^ (0x65 ^ 0x4D)) & (0xB7 ^ 0x9F ^ (0x4C ^ 0x5F) ^ -1)) != 0;
            }
        } else {
            bl = var1[2];
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
        h.var22();
        D = var1[14];
        P = var1[5];
        S = var1[7];
        C = var1[15];
        H = var1[16];
        I = var1[17];
        N = var1[3];
        Q = var1[6];
        K = var1[18];
        M = var1[19];
        R = var1[8];
        F = var1[20];
        L = var1[21];
        J = var1[22];
        E = var1[23];
        T = var1[9];
        G = var1[24];
        O = var1[0];
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

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    public void A() {
        this.Y += var1[5];
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        h var24;
        int n8;
        int n9 = var1[10];
        int n10 = super.hashCode();
        n10 = n10 * var1[10] + this.M();
        n10 = n10 * var1[10] + this.N();
        n10 = n10 * var1[10] + this.O();
        n10 = n10 * var1[10] + this.P();
        int n11 = n10 * var1[10];
        if (h.var4(this.Q() ? 1 : 0)) {
            n8 = var1[11];
            0;
            if ((0xB4 ^ 0x98 ^ (0x84 ^ 0xAD)) == 0) {
                return (0xDC ^ 0xB3 ^ (0x6D ^ 0x31)) & (0xE9 ^ 0xB7 ^ (0x36 ^ 0x5B) ^ -1);
            }
        } else {
            n8 = var1[12];
        }
        int var25 = n11 + n8;
        int n12 = var25 * var1[10];
        if (h.var4(var24.T() ? 1 : 0)) {
            n7 = var1[11];
            0;
            if (3 <= 1) {
                return (2 ^ (0x21 ^ 0x1C)) & (0x2E ^ 0x40 ^ (0x4F ^ 0x1E) ^ -1);
            }
        } else {
            n7 = var1[12];
        }
        var25 = n12 + n7;
        int n13 = var25 * var1[10];
        if (h.var4(var24.U() ? 1 : 0)) {
            n6 = var1[11];
            0;
            if ((0x30 ^ 0x35) <= 0) {
                return (0xF8 ^ 0xB1) & ~(0x79 ^ 0x30);
            }
        } else {
            n6 = var1[12];
        }
        var25 = n13 + n6;
        var25 = var25 * var1[10] + var24.V();
        NPC var26 = var24.K();
        int n14 = var25 * var1[10];
        if (h.var14(var26)) {
            n5 = var1[13];
            0;
            if ((0x1B ^ 0x1E) <= 0) {
                return (0x53 ^ 0) & ~(0x30 ^ 0x63);
            }
        } else {
            n5 = var26.hashCode();
        }
        var25 = n14 + n5;
        j var27 = var24.L();
        int n15 = var25 * var1[10];
        if (h.var14((Object)var27)) {
            n4 = var1[13];
            0;
            if (1 != 1) {
                return (0xD0 ^ 0x8E) & ~(0x1E ^ 0x40);
            }
        } else {
            n4 = ((Object)((Object)var27)).hashCode();
        }
        var25 = n15 + n4;
        l var28 = var24.R();
        int n16 = var25 * var1[10];
        if (h.var14((Object)var28)) {
            n3 = var1[13];
            0;
            if (2 <= ((0x1F ^ 0x4B) & ~(0xF9 ^ 0xAD))) {
                return (0x8C ^ 0xA6) & ~(0x29 ^ 3);
            }
        } else {
            n3 = ((Object)((Object)var28)).hashCode();
        }
        var25 = n16 + n3;
        k var29 = var24.S();
        int n17 = var25 * var1[10];
        if (h.var14((Object)var29)) {
            n2 = var1[13];
            0;
            if null != null {
                return (0xDC ^ 0x8C ^ (0x89 ^ 0x86)) & (0xB5 ^ 0x89 ^ (0xD2 ^ 0xB1) ^ -1);
            }
        } else {
            n2 = ((Object)((Object)var29)).hashCode();
        }
        n10 = n17 + n2;
        return n10;
    }

    public void m(int n2) {
        this.af = n2;
    }

    private static boolean var8(Object object) {
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

    private static boolean var12(Object object, Object object2) {
        return object != object2;
    }

    public void l(int n2) {
        this.Z = n2;
    }

    private static boolean var18(int n2, int n3) {
        return n2 == n3;
    }

    public static boolean a(Actor actor) {
        return Objects.equals(actor.getId(), var1[4]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block42: {
            block43: {
                k var30;
                k var31;
                block41: {
                    h var32;
                    h var33;
                    block39: {
                        block40: {
                            l var34;
                            l var35;
                            block38: {
                                block36: {
                                    block37: {
                                        j var36;
                                        j var37;
                                        block35: {
                                            block33: {
                                                block34: {
                                                    NPC var38;
                                                    NPC var39;
                                                    block32: {
                                                        void var40;
                                                        if (h.var3(object, this)) {
                                                            return var1[1];
                                                        }
                                                        if (h.var6(var40 instanceof h)) {
                                                            return var1[2];
                                                        }
                                                        var33 = (h)var40;
                                                        if (h.var6(var33.a(var32) ? 1 : 0)) {
                                                            return var1[2];
                                                        }
                                                        if (h.var6(super.equals(var40) ? 1 : 0)) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.M(), var33.M())) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.N(), var33.N())) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.O(), var33.O())) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.P(), var33.P())) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.Q() ? 1 : 0, var33.Q() ? 1 : 0)) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.T() ? 1 : 0, var33.T() ? 1 : 0)) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.U() ? 1 : 0, var33.U() ? 1 : 0)) {
                                                            return var1[2];
                                                        }
                                                        if (h.var19(var32.V(), var33.V())) {
                                                            return var1[2];
                                                        }
                                                        var39 = var32.K();
                                                        var38 = var33.K();
                                                        if (!h.var14(var39)) break block32;
                                                        if (!h.var8(var38)) break block33;
                                                        0;
                                                        if (3 >= (11 + 8 - -75 + 36 ^ 55 + 27 - 38 + 90)) {
                                                            return ((0x22 ^ 0x28 ^ (0x62 ^ 0x7A)) & (52 + 70 - -56 + 2 ^ 21 + 60 - -39 + 46 ^ -1)) != 0;
                                                        }
                                                        break block34;
                                                    }
                                                    if (!h.var6(var39.equals(var38) ? 1 : 0)) break block33;
                                                }
                                                return var1[2];
                                            }
                                            var37 = var32.L();
                                            var36 = var33.L();
                                            if (!h.var14((Object)var37)) break block35;
                                            if (!h.var8((Object)var36)) break block36;
                                            0;
                                            if (2 > 3) {
                                                return ((77 + 135 - 75 + 0 ^ 2 + 109 - 58 + 87) & (129 + 41 - 96 + 99 ^ 33 + 25 - 19 + 129 ^ -1)) != 0;
                                            }
                                            break block37;
                                        }
                                        if (!h.var6(((Object)((Object)var37)).equals((Object)var36) ? 1 : 0)) break block36;
                                    }
                                    return var1[2];
                                }
                                var35 = var32.R();
                                var34 = var33.R();
                                if (!h.var14((Object)var35)) break block38;
                                if (!h.var8((Object)var34)) break block39;
                                0;
                                if (3 == 1) {
                                    return ((54 + 79 - 60 + 88 ^ 137 + 19 - 23 + 10) & (0x55 ^ 0x52 ^ (0x62 ^ 0x4B) ^ -1)) != 0;
                                }
                                break block40;
                            }
                            if (!h.var6(((Object)((Object)var35)).equals((Object)var34) ? 1 : 0)) break block39;
                        }
                        return var1[2];
                    }
                    var31 = var32.S();
                    var30 = var33.S();
                    if (!h.var14((Object)var31)) break block41;
                    if (!h.var8((Object)var30)) break block42;
                    0;
                    if (-(0x3A ^ 0x74 ^ (0x7D ^ 0x37)) > 0) {
                        return ((84 + 72 - -11 + 9 ^ 76 + 45 - 79 + 99) & (0xC3 ^ 0xA5 ^ (0x75 ^ 0x2E) ^ -1)) != 0;
                    }
                    break block43;
                }
                if (!h.var6(((Object)((Object)var31)).equals((Object)var30) ? 1 : 0)) break block42;
            }
            return var1[2];
        }
        return var1[1];
    }

    public void e(boolean bl) {
        this.ad = bl;
    }

    /*
     * WARNING - void declaration
     */
    public void a(k k2) {
        void var41;
        int n2;
        this.ae = var1[2];
        this.ac = k2;
        this.Y = var1[0];
        this.ad = var1[2];
        if (h.var12((Object)k2, (Object)k.ENRAGED)) {
            n2 = var1[1];
            0;
            if null != null {
                return;
            }
        } else {
            n2 = var1[2];
        }
        this.aa = n2;
        var42.af = Static.getClient().getTickCount();
        if (h.var3(var41, (Object)k.ENRAGED)) {
            h var42;
            var42.E();
            var42.X = var1[2];
        }
    }
}

