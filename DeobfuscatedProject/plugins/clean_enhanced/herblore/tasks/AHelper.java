/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import gg.squire.herblore.tasks.GameEnum;
import gg.squire.herblore.tasks.GameEnum2;
import gg.squire.herblore.tasks.GameEnum3;

public final class AHelper {
    
    private final  b f;
    private final  e g;
    private final  c e;

    static {
        a.var2();
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    public e d() {
        return this.g;
    }

    public b c() {
        return this.f;
    }

    public String toString() {
        return "HerbloreTaskProgressEvent(method=" + String.valueOf((Object)this.b()) + ", herb=" + String.valueOf((Object)this.c()) + ", potion=" + String.valueOf((Object)this.d()) + ")";
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2;
        a var4;
        int n3;
        int n4 = var1[2];
        int n5 = var1[0];
        c c2 = this.b();
        int n6 = n5 * var1[2];
        if (a.var5((Object)c2)) {
            n3 = var1[3];
            0;
            if (-1 >= 0) {
                return (0x56 ^ 0x72) & ~(0x4E ^ 0x6A);
            }
        } else {
            void var6;
            n3 = var6.hashCode();
        }
        int var7 = n6 + n3;
        b var8 = var4.c();
        int n7 = var7 * var1[2];
        if (a.var5((Object)var8)) {
            n2 = var1[3];
            0;
            if (1 >= (0x5F ^ 0x5B)) {
                return (0x33 ^ 0x3F) & ~(0x16 ^ 0x1A);
            }
        } else {
            n2 = ((Object)((Object)var8)).hashCode();
        }
        var7 = n7 + n2;
        e var9 = var4.d();
        int n8 = var7 * var1[2];
        if (a.var5((Object)var9)) {
            n = var1[3];
            0;
            if ((0x5F ^ 0x5B) < 0) {
                return (0x9B ^ 0xB2) & ~(0x78 ^ 0x51);
            }
        } else {
            n = ((Object)((Object)var9)).hashCode();
        }
        n5 = n8 + n;
        return n5;
    }

    public c b() {
        return this.e;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block24: {
            block25: {
                e var11;
                e var12;
                block23: {
                    a var13;
                    a var14;
                    block21: {
                        block22: {
                            b var15;
                            b var16;
                            block20: {
                                block18: {
                                    block19: {
                                        c var17;
                                        c var18;
                                        block17: {
                                            void var19;
                                            if (a.var3(object, this)) {
                                                return var1[0];
                                            }
                                            if (a.var20(var19 instanceof a)) {
                                                return var1[1];
                                            }
                                            var14 = (a)var19;
                                            var18 = var13.b();
                                            var17 = var14.b();
                                            if (!a.var5((Object)var18)) break block17;
                                            if (!a.var10((Object)var17)) break block18;
                                            0;
                                            if (-(0x6C ^ 0x69) >= 0) {
                                                return ((0xC9 ^ 0xC4) & ~(0x79 ^ 0x74)) != 0;
                                            }
                                            break block19;
                                        }
                                        if (!a.var20(((Object)((Object)var18)).equals((Object)var17) ? 1 : 0)) break block18;
                                    }
                                    return var1[1];
                                }
                                var16 = var13.c();
                                var15 = var14.c();
                                if (!a.var5((Object)var16)) break block20;
                                if (!a.var10((Object)var15)) break block21;
                                0;
                                if (3 < 0) {
                                    return ((0x51 ^ 0x67) & ~(0x35 ^ 3)) != 0;
                                }
                                break block22;
                            }
                            if (!a.var20(((Object)((Object)var16)).equals((Object)var15) ? 1 : 0)) break block21;
                        }
                        return var1[1];
                    }
                    var12 = var13.d();
                    var11 = var14.d();
                    if (!a.var5((Object)var12)) break block23;
                    if (!a.var10((Object)var11)) break block24;
                    0;
                    if ((0xC ^ 8) <= 0) {
                        return ((0xC0 ^ 0x9D) & ~(0x43 ^ 0x1E)) != 0;
                    }
                    break block25;
                }
                if (!a.var20(((Object)((Object)var12)).equals((Object)var11) ? 1 : 0)) break block24;
            }
            return var1[1];
        }
        return var1[0];
    }

    private static void var2() {
        var1 = new int[4];
        a.var1[0] = 1;
        a.var1[1] = (0xB0 ^ 0xBF) & ~(0x7E ^ 0x71);
        a.var1[2] = 0xB9 ^ 0x83 ^ 1;
        a.var1[3] = 0x5F ^ 0x74;
    }

    public AHelper(c c2, b b2, e e2) {
        this.e = c2;
        this.f = b2;
        this.g = e2;
    }

    private static boolean var20(int n) {
        return n == 0;
    }
}

