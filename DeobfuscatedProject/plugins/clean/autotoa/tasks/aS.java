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

    private static boolean lIlIIlIlIlIIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIlIlIIll(Object object, Object object2) {
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
                Prayer var1;
                Prayer var2;
                block15: {
                    aS var3;
                    aS var4;
                    block13: {
                        block14: {
                            Actor var5;
                            Actor var6;
                            block12: {
                                void var7;
                                if (aS.lIlIIlIlIlIIll(object, this)) {
                                    return llIlIIlIIlI[1];
                                }
                                if (aS.lIlIIlIlIlIlII(var7 instanceof aS)) {
                                    return llIlIIlIIlI[3];
                                }
                                var4 = (aS)var7;
                                var6 = var3.bH();
                                var5 = var4.bH();
                                if (!aS.lIlIIlIlIlIIlI(var6)) break block12;
                                if (!aS.lIlIIlIlIlIlIl(var5)) break block13;

                                if ((55 + 100 - 10 + 23 ^ 72 + 100 - 72 + 72) <= 0) {
                                    return ((0xBB ^ 0xAF ^ (0xE0 ^ 0xC0)) & (0xC3 ^ 0x97 ^ (0x5B ^ 0x3B) ^ -1)) != 0;
                                }
                                break block14;
                            }
                            if (!aS.lIlIIlIlIlIlII(var6.equals(var5) ? 1 : 0)) break block13;
                        }
                        return llIlIIlIIlI[3];
                    }
                    var2 = var3.bI();
                    var1 = var4.bI();
                    if (!aS.lIlIIlIlIlIIlI(var2)) break block15;
                    if (!aS.lIlIIlIlIlIlIl(var1)) break block16;

                    if (2 < 0) {
                        return false;
                    }
                    break block17;
                }
                if (!aS.lIlIIlIlIlIlII(var2.equals(var1) ? 1 : 0)) break block16;
            }
            return llIlIIlIIlI[3];
        }
        return llIlIIlIIlI[1];
    }

    public String toString() {
        return "BabboonPrayerHandler.BaboonAttack(baboon=" + String.valueOf(this.bH()) + ", style=" + String.valueOf(this.bI()) + ")";
    }

    static {
        aS.lIlIIlIlIlIIIl();
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        aS var8;
        int n3;
        int n4 = llIlIIlIIlI[0];
        int n5 = llIlIIlIIlI[1];
        Actor actor = this.bH();
        int n6 = n5 * llIlIIlIIlI[0];
        if (aS.lIlIIlIlIlIIlI(actor)) {
            n3 = llIlIIlIIlI[2];

            if (-(0x2E ^ 0x2B) >= 0) {
                return (0x70 ^ 0x45) & ~(0xB0 ^ 0x85);
            }
        } else {
            void var9;
            n3 = var9.hashCode();
        }
        int var10 = n6 + n3;
        Prayer var11 = var8.bI();
        int n7 = var10 * llIlIIlIIlI[0];
        if (aS.lIlIIlIlIlIIlI(var11)) {
            n2 = llIlIIlIIlI[2];

            if (((1 ^ 0x3B) & ~(0xB6 ^ 0x8C)) > 0) {
                return (0x69 ^ 0x55) & ~(0xA9 ^ 0x95);
            }
        } else {
            n2 = var11.hashCode();
        }
        n5 = n7 + n2;
        return n5;
    }

    private static boolean lIlIIlIlIlIlII(int n2) {
        return n2 == 0;
    }

    public Actor bH() {
        return this.eo;
    }

    private static boolean lIlIIlIlIlIlIl(Object object) {
        return object != null;
    }
}

