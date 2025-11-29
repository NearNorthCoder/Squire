/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

import java.time.Instant;

public class HHelper {
    private static  int[] lIlIllll;
    private  int ag;
    private  String ac;
    private  Instant ad;
    private  int af;
    private  int ae;

    public void a(Instant instant) {
        this.ad = instant;
    }

    private static boolean var1(int n2, int n3) {
        return n2 != n3;
    }

    public String N() {
        return this.ac;
    }

    static {
        h.var2();
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    public int Q() {
        return this.af;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        h var5;
        int n3;
        int n4 = lIlIllll[2];
        int n5 = lIlIllll[0];
        n5 = n5 * lIlIllll[2] + this.P();
        n5 = n5 * lIlIllll[2] + this.Q();
        n5 = n5 * lIlIllll[2] + this.R();
        String string = this.N();
        int n6 = n5 * lIlIllll[2];
        if (h.var6(string)) {
            n3 = lIlIllll[3];
            0;
            if (1 >= (8 + 82 - -16 + 35 ^ 41 + 84 - 75 + 87)) {
                return (0x87 ^ 0xAC ^ (0x37 ^ 0x7D)) & (0x52 ^ 0x47 ^ (0x71 ^ 5) ^ -1);
            }
        } else {
            void var7;
            n3 = var7.hashCode();
        }
        int var8 = n6 + n3;
        Instant var9 = var5.O();
        int n7 = var8 * lIlIllll[2];
        if (h.var6(var9)) {
            n2 = lIlIllll[3];
            0;
            if (-1 > 0) {
                return (0x58 ^ 0x64) & ~(0x53 ^ 0x6F);
            }
        } else {
            n2 = ((Object)var9).hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    public void f(int n2) {
        this.ae = n2;
    }

    private static boolean var10(Object object, Object object2) {
        return object == object2;
    }

    protected boolean a(Object object) {
        return object instanceof h;
    }

    public Instant O() {
        return this.ad;
    }

    public int R() {
        return this.ag;
    }

    public String toString() {
        return "LootTarget(itemName=" + this.N() + ", dropTime=" + this.O() + ", id=" + this.P() + ", itemValue=" + this.Q() + ", alchValue=" + this.R() + ")";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block20: {
            block21: {
                Instant var11;
                Instant var12;
                block19: {
                    h var13;
                    h var14;
                    block17: {
                        block18: {
                            String var15;
                            String var16;
                            block16: {
                                void var17;
                                if (h.var10(object, this)) {
                                    return lIlIllll[0];
                                }
                                if (h.var4(var17 instanceof h)) {
                                    return lIlIllll[1];
                                }
                                var14 = (h)var17;
                                if (h.var4(var14.a(var13) ? 1 : 0)) {
                                    return lIlIllll[1];
                                }
                                if (h.var1(var13.P(), var14.P())) {
                                    return lIlIllll[1];
                                }
                                if (h.var1(var13.Q(), var14.Q())) {
                                    return lIlIllll[1];
                                }
                                if (h.var1(var13.R(), var14.R())) {
                                    return lIlIllll[1];
                                }
                                var16 = var13.N();
                                var15 = var14.N();
                                if (!h.var6(var16)) break block16;
                                if (!h.var3(var15)) break block17;
                                0;
                                if (-1 > 3) {
                                    return ((109 + 4 - -41 + 91 ^ 168 + 62 - 173 + 125) & (0xAB ^ 0x8B ^ (0xF9 ^ 0x9A) ^ -1)) != 0;
                                }
                                break block18;
                            }
                            if (!h.var4(var16.equals(var15) ? 1 : 0)) break block17;
                        }
                        return lIlIllll[1];
                    }
                    var12 = var13.O();
                    var11 = var14.O();
                    if (!h.var6(var12)) break block19;
                    if (!h.var3(var11)) break block20;
                    0;
                    if ((0xBB ^ 0xBF) < -1) {
                        return ((0x9F ^ 0xC7) & ~(6 ^ 0x5E)) != 0;
                    }
                    break block21;
                }
                if (!h.var4(((Object)var12).equals(var11) ? 1 : 0)) break block20;
            }
            return lIlIllll[1];
        }
        return lIlIllll[0];
    }

    public void a(String string) {
        this.ac = string;
    }

    public void g(int n2) {
        this.af = n2;
    }

    public int P() {
        return this.ae;
    }

    public void HHelper(int n2) {
        this.ag = n2;
    }

    private static void var2() {
        lIlIllll = new int[4];
        h.lIlIllll[0] = 1;
        h.lIlIllll[1] = (0x6C ^ 0x1A ^ (0x31 ^ 0x7A)) & (0xD6 ^ 0x85 ^ (0xDC ^ 0xB2) ^ -1);
        h.lIlIllll[2] = 0xE0 ^ 0xA0 ^ (0xDB ^ 0xA0);
        h.lIlIllll[3] = 0xFF ^ 0xC2 ^ (0x4C ^ 0x5A);
    }
}

