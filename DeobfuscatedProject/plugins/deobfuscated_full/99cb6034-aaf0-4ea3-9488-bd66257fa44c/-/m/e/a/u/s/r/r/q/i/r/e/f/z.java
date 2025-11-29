/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;

public final class z {
    private static /* synthetic */ int[] llIIIIIllIII;
    private final /* synthetic */ String bi;
    private final /* synthetic */ N bh;

    public N as() {
        return this.bh;
    }

    private static void llllIIIllIlIII() {
        llIIIIIllIII = new int[4];
        z.llIIIIIllIII[0] = 1;
        z.llIIIIIllIII[1] = (0x67 ^ 0x2B) & ~(0x28 ^ 0x64);
        z.llIIIIIllIII[2] = 0x79 ^ 0x42;
        z.llIIIIIllIII[3] = 60 + 6 - -31 + 44 ^ 110 + 29 - 37 + 64;
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
        z var10;
        int n3;
        int n4 = llIIIIIllIII[2];
        int n5 = llIIIIIllIII[0];
        N n6 = this.as();
        int n7 = n5 * llIIIIIllIII[2];
        if (z.llllIIIllIlIll(n6)) {
            n3 = llIIIIIllIII[3];
            0;
            if ((0xEA ^ 0xB2 ^ (0x44 ^ 0x18)) < -1) {
                return (0x2C ^ 0x46 ^ (0x17 ^ 0x74)) & (62 + 102 - 119 + 155 ^ 130 + 43 - 65 + 85 ^ -1);
            }
        } else {
            void var7;
            n3 = var7.hashCode();
        }
        int var6 = n7 + n3;
        String var3 = var10.at();
        int n8 = var6 * llIIIIIllIII[2];
        if (z.llllIIIllIlIll(var3)) {
            n2 = llIIIIIllIII[3];
            0;
            if ((0x2B ^ 0x2E) <= 0) {
                return (0x25 ^ 0x1A) & ~(0x70 ^ 0x4F);
            }
        } else {
            n2 = var3.hashCode();
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
                String var11;
                String var8;
                block15: {
                    z var9;
                    z var2;
                    block13: {
                        block14: {
                            N var5;
                            N var1;
                            block12: {
                                void var4;
                                if (z.llllIIIllIlIIl(object, this)) {
                                    return llIIIIIllIII[0];
                                }
                                if (z.llllIIIllIlIlI(var4 instanceof z)) {
                                    return llIIIIIllIII[1];
                                }
                                var2 = (z)var4;
                                var1 = var9.as();
                                var5 = var2.as();
                                if (!z.llllIIIllIlIll(var1)) break block12;
                                if (!z.llllIIIllIllII(var5)) break block13;
                                0;
                                
                                }
                                break block14;
                            }
                            if (!z.llllIIIllIlIlI(var1.equals(var5) ? 1 : 0)) break block13;
                        }
                        return llIIIIIllIII[1];
                    }
                    var8 = var9.at();
                    var11 = var2.at();
                    if (!z.llllIIIllIlIll(var8)) break block15;
                    if (!z.llllIIIllIllII(var11)) break block16;
                    0;
                    if ((0x8E ^ 0x8A) == 1) {
                        return false;
                    }
                    break block17;
                }
                if (!z.llllIIIllIlIlI(var8.equals(var11) ? 1 : 0)) break block16;
            }
            return llIIIIIllIII[1];
        }
        return llIIIIIllIII[0];
    }
}

