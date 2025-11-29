/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.herblore.tasks;

import gg.squire.herblore.tasks.GameEnum;
import gg.squire.herblore.tasks.GameEnum3;
import gg.squire.herblore.tasks.GameEnum5;

public final class AHelper {
    
    private final  b f;
    private final  e g;
    private final  c e;

    static {
        a.lIIIlIlllIIIlIl();
    }

    private static boolean lIIIlIlllIIIlll(Object object, Object object2) {
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
        a var1;
        int n3;
        int n4 = lllIlIIIlIlI[2];
        int n5 = lllIlIIIlIlI[0];
        c c2 = this.b();
        int n6 = n5 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)c2)) {
            n3 = lllIlIIIlIlI[3];

        } else {
            void var2;
            n3 = var2.hashCode();
        }
        int var3 = n6 + n3;
        b var4 = var1.c();
        int n7 = var3 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)var4)) {
            n2 = lllIlIIIlIlI[3];

            if (1 >= (0x5F ^ 0x5B)) {
                return (0x33 ^ 0x3F) & ~(0x16 ^ 0x1A);
            }
        } else {
            n2 = ((Object)((Object)var4)).hashCode();
        }
        var3 = n7 + n2;
        e var5 = var1.d();
        int n8 = var3 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)var5)) {
            n = lllIlIIIlIlI[3];

            if ((0x5F ^ 0x5B) < 0) {
                return (0x9B ^ 0xB2) & ~(0x78 ^ 0x51);
            }
        } else {
            n = ((Object)((Object)var5)).hashCode();
        }
        n5 = n8 + n;
        return n5;
    }

    public c b() {
        return this.e;
    }

    private static boolean lIIIlIlllIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIlIlllIIlIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block24: {
            block25: {
                e var6;
                e var7;
                block23: {
                    a var8;
                    a var9;
                    block21: {
                        block22: {
                            b var10;
                            b var11;
                            block20: {
                                block18: {
                                    block19: {
                                        c var12;
                                        c var13;
                                        block17: {
                                            void var14;
                                            if (a.lIIIlIlllIIIlll(object, this)) {
                                                return lllIlIIIlIlI[0];
                                            }
                                            if (a.lIIIlIlllIIlIII(var14 instanceof a)) {
                                                return lllIlIIIlIlI[1];
                                            }
                                            var9 = (AHelper) ar14;
                                            var13 = var8.b();
                                            var12 = var9.b();
                                            if (!a.lIIIlIlllIIlIIl((Object)var13)) break block17;
                                            if (!a.lIIIlIlllIIlIlI((Object)var12)) break block18;

                                            if (-(0x6C ^ 0x69) >= 0) {
                                                return false;
                                            }
                                            break block19;
                                        }
                                        if (!a.lIIIlIlllIIlIII(((Object)((Object)var13)).equals((Object)var12) ? 1 : 0)) break block18;
                                    }
                                    return lllIlIIIlIlI[1];
                                }
                                var11 = var8.c();
                                var10 = var9.c();
                                if (!a.lIIIlIlllIIlIIl((Object)var11)) break block20;
                                if (!a.lIIIlIlllIIlIlI((Object)var10)) break block21;

                                if (3 < 0) {
                                    return false;
                                }
                                break block22;
                            }
                            if (!a.lIIIlIlllIIlIII(((Object)((Object)var11)).equals((Object)var10) ? 1 : 0)) break block21;
                        }
                        return lllIlIIIlIlI[1];
                    }
                    var7 = var8.d();
                    var6 = var9.d();
                    if (!a.lIIIlIlllIIlIIl((Object)var7)) break block23;
                    if (!a.lIIIlIlllIIlIlI((Object)var6)) break block24;

                    if ((0xC ^ 8) <= 0) {
                        return false;
                    }
                    break block25;
                }
                if (!a.lIIIlIlllIIlIII(((Object)((Object)var7)).equals((Object)var6) ? 1 : 0)) break block24;
            }
            return lllIlIIIlIlI[1];
        }
        return lllIlIIIlIlI[0];
    }

    public AHelper(c c2, b b2, e e2) {
        this.e = c2;
        this.f = b2;
        this.g = e2;
    }

    private static boolean lIIIlIlllIIlIII(int n) {
        return n == 0;
    }
}

