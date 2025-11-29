/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;

public final class GHelper {
    private final  a at;
    
    private final  boolean au;

    public String toString() {
        return "RaidScouted(raid=" + String.valueOf(this.C()) + ", firstScout=" + this.S() + ")";
    }

    public a C() {
        return this.at;
    }

    public boolean S() {
        return this.au;
    }

    public int hashCode() {
        int n2;
        g var2;
        int n3;
        int n4 = 2;
        int n5 = 0;
        int n6 = n5 * 2;
        if ((this.S( != 0) ? 1 : 0)) {
            n3 = 3;
            0;
            
        } else {
            n3 = 4;
        }
        int var3 = n6 + n3;
        a var4 = var2.C();
        int n7 = var3 * 2;
        if var4 == null {
            n2 = 5;
            0;
            if (-3 >= 0) {
                return (0x80 ^ 0xAE) & ~(0x17 ^ 0x39);
            }
        } else {
            n2 = var4.hashCode();
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
                a var5;
                a var6;
                block8: {
                    g var7;
                    void var8;
                    if (object == this) {
                        return 0;
                    }
                    if (var8 instanceof g == 0) {
                        return 1;
                    }
                    g var9 = (g)var8;
                    if ((var7.S() ? 1 : 0 != var9.S() ? 1 : 0)) {
                        return 1;
                    }
                    var6 = var7.C();
                    var5 = var9.C();
                    if (!var6 == null) break block8;
                    if (!var5 != null) break block9;
                    0;
                    if ((122 + 0 - 37 + 103 ^ 161 + 80 - 193 + 137) == 0) {
                        return ((0x15 ^ 7 ^ (0xFE ^ 0xC2)) & (9 ^ 0x5D ^ (0xBE ^ 0xC4) ^ -1)) != 0;
                    }
                    break block10;
                }
                if (!(var6.equals(var5 == 0) ? 1 : 0)) break block9;
            }
            return 1;
        }
        return 0;
    }

    static {
        g.var10();
    }

    public GHelper(a a2, boolean bl2) {
        this.at = a2;
        this.au = bl2;
    }

}

