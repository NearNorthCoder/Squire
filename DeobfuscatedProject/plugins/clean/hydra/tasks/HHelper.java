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
import gg.squire.hydra.tasks.GameEnum11;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum18;

@Singleton
public class HHelper
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
        h var1;
        k k2 = this.S();
        if (h.lIIIlllllIIIIlI((Object)k2, (Object)k.ENRAGED)) {
            return null;
        }
        if (h.lIIIlllllIIIlII(var1.Q() ? 1 : 0)) {
            void var2;
            return var2.Z().toWorld();
        }
        if (h.lIIIllllIllllll(var1.ae ? 1 : 0)) {
            k var3 = var1.H();
            if (!h.lIIIlllllIIIlIl((Object)var3) || h.lIIIlllllIIIIlI((Object)var3, (Object)k.ENRAGED)) {
                return null;
            }
            WorldPoint var4 = var3.Z().toWorld();
            WorldPoint var5 = var1.K().getWorldLocation();
            if (h.lIIIlllllIIIllI(var5.distanceTo(var4), llllIIlIIIlI[7])) {
                return var4;
            }
            if (h.lIIIlllllIIIlII(var5.equals((Object)var4) ? 1 : 0)) {
                var1.ae = llllIIlIIIlI[1];
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
        Deque var6 = Static.getClient().getGraphicsObjects();
        if (h.lIIIlllllIIIlll(var6)) {
            return llllIIlIIIlI[2];
        }
        int var7 = llllIIlIIIlI[2];
        Iterator var8 = var6.iterator();
        while (h.lIIIlllllIIIlII(var8.hasNext() ? 1 : 0)) {
            GraphicsObject var9 = (GraphicsObject)var8.next();
            if (h.lIIIlllllIIIIll(var9.getId(), llllIIlIIIlI[9])) {
                ++var7;
            }

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

    public HHelper(NPC nPC) {
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
        h var10;
        if (h.lIIIlllllIIIIll(this.Y, llllIIlIIIlI[1])) {
            return null;
        }
        int var11 = var10.X + llllIIlIIIlI[1];
        if (h.lIIIlllllIIIlII(var11 % llllIIlIIIlI[0])) {
            return var10.L();
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
        h var12;
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

            if ((0xB4 ^ 0x98 ^ (0x84 ^ 0xAD)) == 0) {
                return (0xDC ^ 0xB3 ^ (0x6D ^ 0x31)) & (0xE9 ^ 0xB7 ^ (0x36 ^ 0x5B) ^ -1);
            }
        } else {
            n8 = llllIIlIIIlI[12];
        }
        int var13 = n11 + n8;
        int n12 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(var12.T() ? 1 : 0)) {
            n7 = llllIIlIIIlI[11];

            if (3 <= 1) {
                return (2 ^ (0x21 ^ 0x1C)) & (0x2E ^ 0x40 ^ (0x4F ^ 0x1E) ^ -1);
            }
        } else {
            n7 = llllIIlIIIlI[12];
        }
        var13 = n12 + n7;
        int n13 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlII(var12.U() ? 1 : 0)) {
            n6 = llllIIlIIIlI[11];

            if ((0x30 ^ 0x35) <= 0) {
                return (0xF8 ^ 0xB1) & ~(0x79 ^ 0x30);
            }
        } else {
            n6 = llllIIlIIIlI[12];
        }
        var13 = n13 + n6;
        var13 = var13 * llllIIlIIIlI[10] + var12.V();
        NPC var14 = var12.K();
        int n14 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll(var14)) {
            n5 = llllIIlIIIlI[13];

            if ((0x1B ^ 0x1E) <= 0) {
                return (0x53 ^ 0) & ~(0x30 ^ 0x63);
            }
        } else {
            n5 = var14.hashCode();
        }
        var13 = n14 + n5;
        j var15 = var12.L();
        int n15 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var15)) {
            n4 = llllIIlIIIlI[13];

            if (1 != 1) {
                return (0xD0 ^ 0x8E) & ~(0x1E ^ 0x40);
            }
        } else {
            n4 = ((Object)((Object)var15)).hashCode();
        }
        var13 = n15 + n4;
        l var16 = var12.R();
        int n16 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var16)) {
            n3 = llllIIlIIIlI[13];

            if (2 <= ((0x1F ^ 0x4B) & ~(0xF9 ^ 0xAD))) {
                return (0x8C ^ 0xA6) & ~(0x29 ^ 3);
            }
        } else {
            n3 = ((Object)((Object)var16)).hashCode();
        }
        var13 = n16 + n3;
        k var17 = var12.S();
        int n17 = var13 * llllIIlIIIlI[10];
        if (h.lIIIlllllIIIlll((Object)var17)) {
            n2 = llllIIlIIIlI[13];

            }
        } else {
            n2 = ((Object)((Object)var17)).hashCode();
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
                k var18;
                k var19;
                block41: {
                    h var20;
                    h var21;
                    block39: {
                        block40: {
                            l var22;
                            l var23;
                            block38: {
                                block36: {
                                    block37: {
                                        j var24;
                                        j var25;
                                        block35: {
                                            block33: {
                                                block34: {
                                                    NPC var26;
                                                    NPC var27;
                                                    block32: {
                                                        void var28;
                                                        if (h.lIIIlllllIIIIlI(object, this)) {
                                                            return llllIIlIIIlI[1];
                                                        }
                                                        if (h.lIIIllllIllllll(var28 instanceof h)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        var21 = (HHelper) ar28;
                                                        if (h.lIIIllllIllllll(var21.a(var20) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIllllIllllll(super.equals(var28) ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.M(), var21.M())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.N(), var21.N())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.O(), var21.O())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.P(), var21.P())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.Q() ? 1 : 0, var21.Q() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.T() ? 1 : 0, var21.T() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.U() ? 1 : 0, var21.U() ? 1 : 0)) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        if (h.lIIIlllllIIlIII(var20.V(), var21.V())) {
                                                            return llllIIlIIIlI[2];
                                                        }
                                                        var27 = var20.K();
                                                        var26 = var21.K();
                                                        if (!h.lIIIlllllIIIlll(var27)) break block32;
                                                        if (!h.lIIIlllllIIIlIl(var26)) break block33;

                                                        if (3 >= (11 + 8 - -75 + 36 ^ 55 + 27 - 38 + 90)) {
                                                            return ((0x22 ^ 0x28 ^ (0x62 ^ 0x7A)) & (52 + 70 - -56 + 2 ^ 21 + 60 - -39 + 46 ^ -1)) != 0;
                                                        }
                                                        break block34;
                                                    }
                                                    if (!h.lIIIllllIllllll(var27.equals(var26) ? 1 : 0)) break block33;
                                                }
                                                return llllIIlIIIlI[2];
                                            }
                                            var25 = var20.L();
                                            var24 = var21.L();
                                            if (!h.lIIIlllllIIIlll((Object)var25)) break block35;
                                            if (!h.lIIIlllllIIIlIl((Object)var24)) break block36;

                                            if (2 > 3) {
                                                return false;
                                            }
                                            break block37;
                                        }
                                        if (!h.lIIIllllIllllll(((Object)((Object)var25)).equals((Object)var24) ? 1 : 0)) break block36;
                                    }
                                    return llllIIlIIIlI[2];
                                }
                                var23 = var20.R();
                                var22 = var21.R();
                                if (!h.lIIIlllllIIIlll((Object)var23)) break block38;
                                if (!h.lIIIlllllIIIlIl((Object)var22)) break block39;

                                if (3 == 1) {
                                    return ((54 + 79 - 60 + 88 ^ 137 + 19 - 23 + 10) & (0x55 ^ 0x52 ^ (0x62 ^ 0x4B) ^ -1)) != 0;
                                }
                                break block40;
                            }
                            if (!h.lIIIllllIllllll(((Object)((Object)var23)).equals((Object)var22) ? 1 : 0)) break block39;
                        }
                        return llllIIlIIIlI[2];
                    }
                    var19 = var20.S();
                    var18 = var21.S();
                    if (!h.lIIIlllllIIIlll((Object)var19)) break block41;
                    if (!h.lIIIlllllIIIlIl((Object)var18)) break block42;

                    if (-(0x3A ^ 0x74 ^ (0x7D ^ 0x37)) > 0) {
                        return ((84 + 72 - -11 + 9 ^ 76 + 45 - 79 + 99) & (0xC3 ^ 0xA5 ^ (0x75 ^ 0x2E) ^ -1)) != 0;
                    }
                    break block43;
                }
                if (!h.lIIIllllIllllll(((Object)((Object)var19)).equals((Object)var18) ? 1 : 0)) break block42;
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
        void var29;
        int n2;
        this.ae = llllIIlIIIlI[2];
        this.ac = k2;
        this.Y = llllIIlIIIlI[0];
        this.ad = llllIIlIIIlI[2];
        if (h.lIIIlllllIIIIIl((Object)k2, (Object)k.ENRAGED)) {
            n2 = llllIIlIIIlI[1];

            }
        } else {
            n2 = llllIIlIIIlI[2];
        }
        this.aa = n2;
        var30.af = Static.getClient().getTickCount();
        if (h.lIIIlllllIIIIlI(var29, (Object)k.ENRAGED)) {
            h var30;
            var30.E();
            var30.X = llllIIlIIIlI[2];
        }
    }
}

