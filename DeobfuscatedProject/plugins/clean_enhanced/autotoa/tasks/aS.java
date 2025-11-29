/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Actor;
import net.runelite.api.Prayer;

final class aS {
    private final  Prayer ep;
    private final  Actor eo;

    public aS(Actor actor, Prayer prayer) {
        this.eo = actor;
        this.ep = prayer;
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    public Prayer bI() {
        return this.ep;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block16: {
            block17: {
                Prayer var4;
                Prayer var5;
                block15: {
                    aS var6;
                    aS var7;
                    block13: {
                        block14: {
                            Actor var8;
                            Actor var9;
                            block12: {
                                void var10;
                                if (aS.var3(object, this)) {
                                    return var1[1];
                                }
                                if (aS.var11(var10 instanceof aS)) {
                                    return var1[3];
                                }
                                var7 = (aS)var10;
                                var9 = var6.bH();
                                var8 = var7.bH();
                                if (!aS.var2(var9)) break block12;
                                if (!aS.var12(var8)) break block13;
                                0;
                                if ((55 + 100 - 10 + 23 ^ 72 + 100 - 72 + 72) <= 0) {
                                    return ((0xBB ^ 0xAF ^ (0xE0 ^ 0xC0)) & (0xC3 ^ 0x97 ^ (0x5B ^ 0x3B) ^ -1)) != 0;
                                }
                                break block14;
                            }
                            if (!aS.var11(var9.equals(var8) ? 1 : 0)) break block13;
                        }
                        return var1[3];
                    }
                    var5 = var6.bI();
                    var4 = var7.bI();
                    if (!aS.var2(var5)) break block15;
                    if (!aS.var12(var4)) break block16;
                    0;
                    if (2 < 0) {
                        return ((0x70 ^ 0x6E) & ~(0x62 ^ 0x7C)) != 0;
                    }
                    break block17;
                }
                if (!aS.var11(var5.equals(var4) ? 1 : 0)) break block16;
            }
            return var1[3];
        }
        return var1[1];
    }

    public String toString() {
        return "BabboonPrayerHandler.BaboonAttack(baboon=" + String.valueOf(this.bH()) + ", style=" + String.valueOf(this.bI()) + ")";
    }

    static {
        aS.var13();
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        aS var14;
        int n3;
        int n4 = var1[0];
        int n5 = var1[1];
        Actor actor = this.bH();
        int n6 = n5 * var1[0];
        if (aS.var2(actor)) {
            n3 = var1[2];
            0;
            if (-(0x2E ^ 0x2B) >= 0) {
                return (0x70 ^ 0x45) & ~(0xB0 ^ 0x85);
            }
        } else {
            void var15;
            n3 = var15.hashCode();
        }
        int var16 = n6 + n3;
        Prayer var17 = var14.bI();
        int n7 = var16 * var1[0];
        if (aS.var2(var17)) {
            n2 = var1[2];
            0;
            if (((1 ^ 0x3B) & ~(0xB6 ^ 0x8C)) > 0) {
                return (0x69 ^ 0x55) & ~(0xA9 ^ 0x95);
            }
        } else {
            n2 = var17.hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    private static boolean var11(int n2) {
        return n2 == 0;
    }

    public Actor bH() {
        return this.eo;
    }

    private static void var13() {
        var1 = new int[4];
        aS.var1[0] = 0x15 ^ 0x47 ^ (0x78 ^ 0x11);
        aS.var1[1] = 1;
        aS.var1[2] = 0x80 ^ 0x96 ^ (0x1E ^ 0x23);
        aS.var1[3] = (0xC3 ^ 0x93) & ~(2 ^ 0x52);
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

