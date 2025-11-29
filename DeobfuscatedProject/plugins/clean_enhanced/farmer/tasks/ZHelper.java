/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;

public final class ZHelper {
    
    private final  String bi;
    private final  N bh;

    public N as() {
        return this.bh;
    }

    public ZHelper(N n2, String string) {
        this.bh = n2;
        this.bi = string;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        z var2;
        int n3;
        int n4 = 2;
        int n5 = 0;
        N n6 = this.as();
        int n7 = n5 * 2;
        if n6 == null {
            n3 = 3;
            0;
            if ((0xEA ^ 0xB2 ^ (0x44 ^ 0x18)) < -1) {
                return (0x2C ^ 0x46 ^ (0x17 ^ 0x74)) & (62 + 102 - 119 + 155 ^ 130 + 43 - 65 + 85 ^ -1);
            }
        } else {
            void var3;
            n3 = var3.hashCode();
        }
        int var4 = n7 + n3;
        String var5 = var2.at();
        int n8 = var4 * 2;
        if var5 == null {
            n2 = 3;
            0;
            if ((0x2B ^ 0x2E) <= 0) {
                return (0x25 ^ 0x1A) & ~(0x70 ^ 0x4F);
            }
        } else {
            n2 = var5.hashCode();
        }
        n5 = n8 + n2;
        return n5;
    }

    static {
        z.var6();
    }

    public String at() {
        return this.bi;
    }

    public String toString() {
        return "ProfilePatch(patch=" + String.valueOf(this.as()) + ", rsProfileKey=" + this.at() + ")";
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block16: {
            block17: {
                String var7;
                String var8;
                block15: {
                    z var9;
                    z var10;
                    block13: {
                        block14: {
                            N var11;
                            N var12;
                            block12: {
                                void var13;
                                if (object == this) {
                                    return 0;
                                }
                                if (var13 instanceof z == 0) {
                                    return 1;
                                }
                                var10 = (z)var13;
                                var12 = var9.as();
                                var11 = var10.as();
                                if (!var12 == null) break block12;
                                if (!var11 != null) break block13;
                                0;
                                if null != null {
                                    return ((3 ^ 0x48 ^ (0xDA ^ 0xC1)) & (0x57 ^ 0x6F ^ (0xCB ^ 0xA3) ^ -1)) != 0;
                                }
                                break block14;
                            }
                            if (!(var12.equals(var11 == 0) ? 1 : 0)) break block13;
                        }
                        return 1;
                    }
                    var8 = var9.at();
                    var7 = var10.at();
                    if (!var8 == null) break block15;
                    if (!var7 != null) break block16;
                    0;
                    if ((0x8E ^ 0x8A) == 1) {
                        return ((0x76 ^ 0x2B) & ~(0x3C ^ 0x61)) != 0;
                    }
                    break block17;
                }
                if (!(var8.equals(var7 == 0) ? 1 : 0)) break block16;
            }
            return 1;
        }
        return 0;
    }
}

