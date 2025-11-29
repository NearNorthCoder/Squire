/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;

public final class z {
    
    private final  String bi;
    private final  N bh;

    public N as() {
        return this.bh;
    }

    public z(N n2, String string) {
        this.bh = n2;
        this.bi = string;
    }

    private static boolean llllIIIllIllII(Object object) {
        return object != null;
    }

    private static boolean llllIIIllIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llllIIIllIlIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        z var1;
        int n3;
        int n4 = llIIIIIllIII[2];
        int n5 = llIIIIIllIII[0];
        N n6 = this.as();
        int n7 = n5 * llIIIIIllIII[2];
        if (z.llllIIIllIlIll(n6)) {
            n3 = llIIIIIllIII[3];

            if ((0xEA ^ 0xB2 ^ (0x44 ^ 0x18)) < -1) {
                return (0x2C ^ 0x46 ^ (0x17 ^ 0x74)) & (62 + 102 - 119 + 155 ^ 130 + 43 - 65 + 85 ^ -1);
            }
        } else {
            void var2;
            n3 = var2.hashCode();
        }
        int var3 = n7 + n3;
        String var4 = var1.at();
        int n8 = var3 * llIIIIIllIII[2];
        if (z.llllIIIllIlIll(var4)) {
            n2 = llIIIIIllIII[3];

            if ((0x2B ^ 0x2E) <= 0) {
                return (0x25 ^ 0x1A) & ~(0x70 ^ 0x4F);
            }
        } else {
            n2 = var4.hashCode();
        }
        n5 = n8 + n2;
        return n5;
    }

    private static boolean llllIIIllIlIll(Object object) {
        return object == null;
    }

    static {
        z.llllIIIllIlIII();
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
                String var5;
                String var6;
                block15: {
                    z var7;
                    z var8;
                    block13: {
                        block14: {
                            N var9;
                            N var10;
                            block12: {
                                void var11;
                                if (z.llllIIIllIlIIl(object, this)) {
                                    return llIIIIIllIII[0];
                                }
                                if (z.llllIIIllIlIlI(var11 instanceof z)) {
                                    return llIIIIIllIII[1];
                                }
                                var8 = (z)var11;
                                var10 = var7.as();
                                var9 = var8.as();
                                if (!z.llllIIIllIlIll(var10)) break block12;
                                if (!z.llllIIIllIllII(var9)) break block13;

                                }
                                break block14;
                            }
                            if (!z.llllIIIllIlIlI(var10.equals(var9) ? 1 : 0)) break block13;
                        }
                        return llIIIIIllIII[1];
                    }
                    var6 = var7.at();
                    var5 = var8.at();
                    if (!z.llllIIIllIlIll(var6)) break block15;
                    if (!z.llllIIIllIllII(var5)) break block16;

                    if ((0x8E ^ 0x8A) == 1) {
                        return false;
                    }
                    break block17;
                }
                if (!z.llllIIIllIlIlI(var6.equals(var5) ? 1 : 0)) break block16;
            }
            return llIIIIIllIII[1];
        }
        return llIIIIIllIII[0];
    }
}

