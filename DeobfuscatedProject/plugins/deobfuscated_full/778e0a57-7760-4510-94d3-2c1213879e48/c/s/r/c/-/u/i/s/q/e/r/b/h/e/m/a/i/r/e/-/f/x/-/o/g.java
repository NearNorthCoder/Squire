/*
 * Decompiled with CFR 0.152.
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;

public final class g {
    private final /* synthetic */ a at;
    private static /* synthetic */ int[] lIlIlIlIIIll;
    private final /* synthetic */ boolean au;

    public String toString() {
        return "RaidScouted(raid=" + String.valueOf(this.C()) + ", firstScout=" + this.S() + ")";
    }

    private static boolean llIlllIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlllIlllIIlI(Object object) {
        return object != null;
    }

    private static void llIlllIllIllIl() {
        lIlIlIlIIIll = new int[6];
        g.lIlIlIlIIIll[0] = 1;
        g.lIlIlIlIIIll[1] = (0xB ^ 0xD) & ~(0x68 ^ 0x6E);
        g.lIlIlIlIIIll[2] = 0x3D ^ 6;
        g.lIlIlIlIIIll[3] = 0xE1 ^ 0x85 ^ (0x27 ^ 0xC);
        g.lIlIlIlIIIll[4] = 0x92 ^ 0xAC ^ (0xC3 ^ 0x9C);
        g.lIlIlIlIIIll[5] = 86 + 118 - 127 + 94 ^ 73 + 32 - 2 + 25;
    }

    public a C() {
        return this.at;
    }

    private static boolean llIlllIllIllll(int n2) {
        return n2 == 0;
    }

    public boolean S() {
        return this.au;
    }

    private static boolean llIlllIlllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIllIlllI(Object object, Object object2) {
        return object == object2;
    }

    public int hashCode() {
        int n2;
        g var3;
        int n3;
        int n4 = lIlIlIlIIIll[2];
        int n5 = lIlIlIlIIIll[0];
        int n6 = n5 * lIlIlIlIIIll[2];
        if (g.llIlllIlllIIll(this.S() ? 1 : 0)) {
            n3 = lIlIlIlIIIll[3];
            0;
            if (2 == 0) {
                return (0x7D ^ 0x56) & ~(0x30 ^ 0x1B);
            }
        } else {
            n3 = lIlIlIlIIIll[4];
        }
        int var2 = n6 + n3;
        a var5 = var3.C();
        int n7 = var2 * lIlIlIlIIIll[2];
        if (g.llIlllIlllIIIl(var5)) {
            n2 = lIlIlIlIIIll[5];
            0;
            if (-3 >= 0) {
                return (0x80 ^ 0xAE) & ~(0x17 ^ 0x39);
            }
        } else {
            n2 = var5.hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block9: {
            block10: {
                a var6;
                a var8;
                block8: {
                    g var1;
                    void var4;
                    if (g.llIlllIllIlllI(object, this)) {
                        return lIlIlIlIIIll[0];
                    }
                    if (g.llIlllIllIllll(var4 instanceof g)) {
                        return lIlIlIlIIIll[1];
                    }
                    g var7 = (g)var4;
                    if (g.llIlllIlllIIII(var1.S() ? 1 : 0, var7.S() ? 1 : 0)) {
                        return lIlIlIlIIIll[1];
                    }
                    var8 = var1.C();
                    var6 = var7.C();
                    if (!g.llIlllIlllIIIl(var8)) break block8;
                    if (!g.llIlllIlllIIlI(var6)) break block9;
                    0;
                    if ((122 + 0 - 37 + 103 ^ 161 + 80 - 193 + 137) == 0) {
                        return ((0x15 ^ 7 ^ (0xFE ^ 0xC2)) & (9 ^ 0x5D ^ (0xBE ^ 0xC4) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!g.llIlllIllIllll(var8.equals(var6) ? 1 : 0)) break block9;
            }
            return lIlIlIlIIIll[1];
        }
        return lIlIlIlIIIll[0];
    }

    static {
        g.llIlllIllIllIl();
    }

    public g(a a2, boolean bl2) {
        this.at = a2;
        this.au = bl2;
    }

    private static boolean llIlllIlllIIIl(Object object) {
        return object == null;
    }
}

