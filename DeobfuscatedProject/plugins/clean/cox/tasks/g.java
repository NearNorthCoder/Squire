/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;

public final class g {
    private final  a at;
    
    private final  boolean au;

    public String toString() {
        return "RaidScouted(raid=" + String.valueOf(this.C()) + ", firstScout=" + this.S() + ")";
    }

    private static boolean llIlllIlllIIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIlllIlllIIlI(Object object) {
        return object != null;
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
        g var1;
        int n3;
        int n4 = lIlIlIlIIIll[2];
        int n5 = lIlIlIlIIIll[0];
        int n6 = n5 * lIlIlIlIIIll[2];
        if (g.llIlllIlllIIll(this.S() ? 1 : 0)) {
            n3 = lIlIlIlIIIll[3];

            if (2 == 0) {
                return (0x7D ^ 0x56) & ~(0x30 ^ 0x1B);
            }
        } else {
            n3 = lIlIlIlIIIll[4];
        }
        int var2 = n6 + n3;
        a var3 = var1.C();
        int n7 = var2 * lIlIlIlIIIll[2];
        if (g.llIlllIlllIIIl(var3)) {
            n2 = lIlIlIlIIIll[5];

        } else {
            n2 = var3.hashCode();
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
                a var4;
                a var5;
                block8: {
                    g var6;
                    void var7;
                    if (g.llIlllIllIlllI(object, this)) {
                        return lIlIlIlIIIll[0];
                    }
                    if (g.llIlllIllIllll(var7 instanceof g)) {
                        return lIlIlIlIIIll[1];
                    }
                    g var8 = (g)var7;
                    if (g.llIlllIlllIIII(var6.S() ? 1 : 0, var8.S() ? 1 : 0)) {
                        return lIlIlIlIIIll[1];
                    }
                    var5 = var6.C();
                    var4 = var8.C();
                    if (!g.llIlllIlllIIIl(var5)) break block8;
                    if (!g.llIlllIlllIIlI(var4)) break block9;

                    if ((122 + 0 - 37 + 103 ^ 161 + 80 - 193 + 137) == 0) {
                        return ((0x15 ^ 7 ^ (0xFE ^ 0xC2)) & (9 ^ 0x5D ^ (0xBE ^ 0xC4) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!g.llIlllIllIllll(var5.equals(var4) ? 1 : 0)) break block9;
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

