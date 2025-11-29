/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Actor
 *  net.runelite.api.Prayer
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import net.runelite.api.Actor;
import net.runelite.api.Prayer;

final class aS {
    private final /* synthetic */ Prayer ep;
    private final /* synthetic */ Actor eo;
    private static /* synthetic */ int[] llIlIIlIIlI;

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
                Prayer var6;
                Prayer var7;
                block15: {
                    aS var3;
                    aS var1;
                    block13: {
                        block14: {
                            Actor var11;
                            Actor var9;
                            block12: {
                                void var5;
                                if (aS.lIlIIlIlIlIIll(object, this)) {
                                    return llIlIIlIIlI[1];
                                }
                                if (aS.lIlIIlIlIlIlII(var5 instanceof aS)) {
                                    return llIlIIlIIlI[3];
                                }
                                var1 = (aS)var5;
                                var9 = var3.bH();
                                var11 = var1.bH();
                                if (!aS.lIlIIlIlIlIIlI(var9)) break block12;
                                if (!aS.lIlIIlIlIlIlIl(var11)) break block13;
                                0;
                                if ((55 + 100 - 10 + 23 ^ 72 + 100 - 72 + 72) <= 0) {
                                    return ((0xBB ^ 0xAF ^ (0xE0 ^ 0xC0)) & (0xC3 ^ 0x97 ^ (0x5B ^ 0x3B) ^ -1)) != 0;
                                }
                                break block14;
                            }
                            if (!aS.lIlIIlIlIlIlII(var9.equals(var11) ? 1 : 0)) break block13;
                        }
                        return llIlIIlIIlI[3];
                    }
                    var7 = var3.bI();
                    var6 = var1.bI();
                    if (!aS.lIlIIlIlIlIIlI(var7)) break block15;
                    if (!aS.lIlIIlIlIlIlIl(var6)) break block16;
                    0;
                    if (2 < 0) {
                        return false;
                    }
                    break block17;
                }
                if (!aS.lIlIIlIlIlIlII(var7.equals(var6) ? 1 : 0)) break block16;
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
        aS var2;
        int n3;
        int n4 = llIlIIlIIlI[0];
        int n5 = llIlIIlIIlI[1];
        Actor actor = this.bH();
        int n6 = n5 * llIlIIlIIlI[0];
        if (aS.lIlIIlIlIlIIlI(actor)) {
            n3 = llIlIIlIIlI[2];
            0;
            if (-(0x2E ^ 0x2B) >= 0) {
                return (0x70 ^ 0x45) & ~(0xB0 ^ 0x85);
            }
        } else {
            void var8;
            n3 = var8.hashCode();
        }
        int var10 = n6 + n3;
        Prayer var4 = var2.bI();
        int n7 = var10 * llIlIIlIIlI[0];
        if (aS.lIlIIlIlIlIIlI(var4)) {
            n2 = llIlIIlIIlI[2];
            0;
            if (((1 ^ 0x3B) & ~(0xB6 ^ 0x8C)) > 0) {
                return (0x69 ^ 0x55) & ~(0xA9 ^ 0x95);
            }
        } else {
            n2 = var4.hashCode();
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

    private static void lIlIIlIlIlIIIl() {
        llIlIIlIIlI = new int[4];
        aS.llIlIIlIIlI[0] = 0x15 ^ 0x47 ^ (0x78 ^ 0x11);
        aS.llIlIIlIIlI[1] = 1;
        aS.llIlIIlIIlI[2] = 0x80 ^ 0x96 ^ (0x1E ^ 0x23);
        aS.llIlIIlIIlI[3] = (0xC3 ^ 0x93) & ~(2 ^ 0x52);
    }

    private static boolean lIlIIlIlIlIlIl(Object object) {
        return object != null;
    }
}

