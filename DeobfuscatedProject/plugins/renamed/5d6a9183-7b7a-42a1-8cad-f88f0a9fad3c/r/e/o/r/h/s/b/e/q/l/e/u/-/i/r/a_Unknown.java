/*
 * Decompiled with CFR 0.152.
 */
package r.e.o.r.h.s.b.e.q.l.e.u.-.i.r;

import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.HerbType;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.HerbType;
import r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.PotionType;

public final class a_Unknown {
    private static /* synthetic */ int[] lllIlIIIlIlI;
    private final /* synthetic */ b f;
    private final /* synthetic */ e g;
    private final /* synthetic */ c e;

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
        a var6;
        int n3;
        int n4 = lllIlIIIlIlI[2];
        int n5 = lllIlIIIlIlI[0];
        c c2 = this.b();
        int n6 = n5 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)c2)) {
            n3 = lllIlIIIlIlI[3];
            0;
            if (-1 >= 0) {
                return (0x56 ^ 0x72) & ~(0x4E ^ 0x6A);
            }
        } else {
            void var11;
            n3 = var11.hashCode();
        }
        int var1 = n6 + n3;
        b var9 = var6.c();
        int n7 = var1 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)var9)) {
            n2 = lllIlIIIlIlI[3];
            0;
            if (1 >= (0x5F ^ 0x5B)) {
                return (0x33 ^ 0x3F) & ~(0x16 ^ 0x1A);
            }
        } else {
            n2 = ((Object)((Object)var9)).hashCode();
        }
        var1 = n7 + n2;
        e var12 = var6.d();
        int n8 = var1 * lllIlIIIlIlI[2];
        if (a.lIIIlIlllIIlIIl((Object)var12)) {
            n = lllIlIIIlIlI[3];
            0;
            if ((0x5F ^ 0x5B) < 0) {
                return (0x9B ^ 0xB2) & ~(0x78 ^ 0x51);
            }
        } else {
            n = ((Object)((Object)var12)).hashCode();
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
                e var2;
                e var10;
                block23: {
                    a var4;
                    a var5;
                    block21: {
                        block22: {
                            b var13;
                            b var14;
                            block20: {
                                block18: {
                                    block19: {
                                        c var8;
                                        c var3;
                                        block17: {
                                            void var7;
                                            if (a.lIIIlIlllIIIlll(object, this)) {
                                                return lllIlIIIlIlI[0];
                                            }
                                            if (a.lIIIlIlllIIlIII(var7 instanceof a)) {
                                                return lllIlIIIlIlI[1];
                                            }
                                            var5 = (a)var7;
                                            var3 = var4.b();
                                            var8 = var5.b();
                                            if (!a.lIIIlIlllIIlIIl((Object)var3)) break block17;
                                            if (!a.lIIIlIlllIIlIlI((Object)var8)) break block18;
                                            0;
                                            if (-(0x6C ^ 0x69) >= 0) {
                                                return false;
                                            }
                                            break block19;
                                        }
                                        if (!a.lIIIlIlllIIlIII(((Object)((Object)var3)).equals((Object)var8) ? 1 : 0)) break block18;
                                    }
                                    return lllIlIIIlIlI[1];
                                }
                                var14 = var4.c();
                                var13 = var5.c();
                                if (!a.lIIIlIlllIIlIIl((Object)var14)) break block20;
                                if (!a.lIIIlIlllIIlIlI((Object)var13)) break block21;
                                0;
                                if (3 < 0) {
                                    return false;
                                }
                                break block22;
                            }
                            if (!a.lIIIlIlllIIlIII(((Object)((Object)var14)).equals((Object)var13) ? 1 : 0)) break block21;
                        }
                        return lllIlIIIlIlI[1];
                    }
                    var10 = var4.d();
                    var2 = var5.d();
                    if (!a.lIIIlIlllIIlIIl((Object)var10)) break block23;
                    if (!a.lIIIlIlllIIlIlI((Object)var2)) break block24;
                    0;
                    if ((0xC ^ 8) <= 0) {
                        return false;
                    }
                    break block25;
                }
                if (!a.lIIIlIlllIIlIII(((Object)((Object)var10)).equals((Object)var2) ? 1 : 0)) break block24;
            }
            return lllIlIIIlIlI[1];
        }
        return lllIlIIIlIlI[0];
    }

    private static void lIIIlIlllIIIlIl() {
        lllIlIIIlIlI = new int[4];
        a.lllIlIIIlIlI[0] = 1;
        a.lllIlIIIlIlI[1] = (0xB0 ^ 0xBF) & ~(0x7E ^ 0x71);
        a.lllIlIIIlIlI[2] = 0xB9 ^ 0x83 ^ 1;
        a.lllIlIIIlIlI[3] = 0x5F ^ 0x74;
    }

    public a(c c2, b b2, e e2) {
        this.e = c2;
        this.f = b2;
        this.g = e2;
    }

    private static boolean lIIIlIlllIIlIII(int n) {
        return n == 0;
    }
}

