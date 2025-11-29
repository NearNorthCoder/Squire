/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import com.google.common.annotations.VisibleForTesting;
import java.time.Instant;
import net.runelite.api.coords.WorldPoint;

@VisibleForTesting
final class d {
    private final  WorldPoint F;
    private final  N G;
    
    private final  Instant E;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block24: {
            block25: {
                N var1;
                N var2;
                block23: {
                    d var3;
                    d var4;
                    block21: {
                        block22: {
                            WorldPoint var5;
                            WorldPoint var6;
                            block20: {
                                block18: {
                                    block19: {
                                        Instant var7;
                                        Instant var8;
                                        block17: {
                                            void var9;
                                            if (d.llllIIlIIlIIII(object, this)) {
                                                return llIIIIlIIllI[0];
                                            }
                                            if (d.llllIIlIIlIIIl(var9 instanceof d)) {
                                                return llIIIIlIIllI[1];
                                            }
                                            var4 = (d)var9;
                                            var8 = var3.f();
                                            var7 = var4.f();
                                            if (!d.llllIIlIIlIIlI(var8)) break block17;
                                            if (!d.llllIIlIIlIIll(var7)) break block18;

                                            }
                                            break block19;
                                        }
                                        if (!d.llllIIlIIlIIIl(((Object)var8).equals(var7) ? 1 : 0)) break block18;
                                    }
                                    return llIIIIlIIllI[1];
                                }
                                var6 = var3.g();
                                var5 = var4.g();
                                if (!d.llllIIlIIlIIlI(var6)) break block20;
                                if (!d.llllIIlIIlIIll(var5)) break block21;

                                break block22;
                            }
                            if (!d.llllIIlIIlIIIl(var6.equals(var5) ? 1 : 0)) break block21;
                        }
                        return llIIIIlIIllI[1];
                    }
                    var2 = var3.h();
                    var1 = var4.h();
                    if (!d.llllIIlIIlIIlI(var2)) break block23;
                    if (!d.llllIIlIIlIIll(var1)) break block24;

                    if (-1 > ((0xA ^ 2) & ~(0xF ^ 7))) {
                        return false;
                    }
                    break block25;
                }
                if (!d.llllIIlIIlIIIl(var2.equals(var1) ? 1 : 0)) break block24;
            }
            return llIIIIlIIllI[1];
        }
        return llIIIIlIIllI[0];
    }

    public N h() {
        return this.G;
    }

    public String toString() {
        return "CompostTracker.PendingCompost(timeout=" + String.valueOf(this.f()) + ", patchLocation=" + String.valueOf(this.g()) + ", farmingPatch=" + String.valueOf(this.h()) + ")";
    }

    public WorldPoint g() {
        return this.F;
    }

    public d(Instant instant, WorldPoint worldPoint, N n2) {
        this.E = instant;
        this.F = worldPoint;
        this.G = n2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        d var10;
        int n4;
        int n5 = llIIIIlIIllI[2];
        int n6 = llIIIIlIIllI[0];
        Instant instant = this.f();
        int n7 = n6 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(instant)) {
            n4 = llIIIIlIIllI[3];

            if ((0x8F ^ 0x8B) <= -1) {
                return (0x70 ^ 0x59) & ~(0x34 ^ 0x1D);
            }
        } else {
            void var11;
            n4 = var11.hashCode();
        }
        int var12 = n7 + n4;
        WorldPoint var13 = var10.g();
        int n8 = var12 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(var13)) {
            n3 = llIIIIlIIllI[3];

        } else {
            n3 = var13.hashCode();
        }
        var12 = n8 + n3;
        N var14 = var10.h();
        int n9 = var12 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(var14)) {
            n2 = llIIIIlIIllI[3];

            }
        } else {
            n2 = var14.hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    private static boolean llllIIlIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        d.llllIIlIIIllll();
    }

    private static boolean llllIIlIIlIIIl(int n2) {
        return n2 == 0;
    }

    public Instant f() {
        return this.E;
    }

    private static boolean llllIIlIIlIIll(Object object) {
        return object != null;
    }

    private static boolean llllIIlIIlIIlI(Object object) {
        return object == null;
    }
}

