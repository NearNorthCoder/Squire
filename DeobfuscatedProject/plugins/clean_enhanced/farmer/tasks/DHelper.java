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
final class DHelper {
    private final  WorldPoint F;
    private final  N G;
    
    private final  Instant E;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block24: {
            block25: {
                N var2;
                N var3;
                block23: {
                    d var4;
                    d var5;
                    block21: {
                        block22: {
                            WorldPoint var6;
                            WorldPoint var7;
                            block20: {
                                block18: {
                                    block19: {
                                        Instant var8;
                                        Instant var9;
                                        block17: {
                                            void var10;
                                            if (object == this) {
                                                return 0;
                                            }
                                            if (var10 instanceof d == 0) {
                                                return 1;
                                            }
                                            var5 = (d)var10;
                                            var9 = var4.f();
                                            var8 = var5.f();
                                            if (!var9 == null) break block17;
                                            if (!var8 != null) break block18;
                                            0;
                                            if null != null {
                                                return ((0xEC ^ 0xC5 ^ (0x11 ^ 0xC)) & (35 + 73 - 82 + 101 ^ (0xEC ^ 0xA7) ^ -1)) != 0;
                                            }
                                            break block19;
                                        }
                                        if (!(((Object == 0)var9).equals(var8) ? 1 : 0)) break block18;
                                    }
                                    return 1;
                                }
                                var7 = var4.g();
                                var6 = var5.g();
                                if (!var7 == null) break block20;
                                if (!var6 != null) break block21;
                                0;
                                if (-3 >= 0) {
                                    return ((0x5A ^ 0x11 ^ (0x7B ^ 5)) & (0x2B ^ 0x5D ^ (0xDE ^ 0x9D) ^ -1)) != 0;
                                }
                                break block22;
                            }
                            if (!(var7.equals(var6 == 0) ? 1 : 0)) break block21;
                        }
                        return 1;
                    }
                    var3 = var4.h();
                    var2 = var5.h();
                    if (!var3 == null) break block23;
                    if (!var2 != null) break block24;
                    0;
                    if (-1 > ((0xA ^ 2) & ~(0xF ^ 7))) {
                        return ((0x81 ^ 0xB9) & ~(0x98 ^ 0xA0)) != 0;
                    }
                    break block25;
                }
                if (!(var3.equals(var2 == 0) ? 1 : 0)) break block24;
            }
            return 1;
        }
        return 0;
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

    public DHelper(Instant instant, WorldPoint worldPoint, N n2) {
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
        d var11;
        int n4;
        int n5 = 2;
        int n6 = 0;
        Instant instant = this.f();
        int n7 = n6 * 2;
        if instant == null {
            n4 = 3;
            0;
            if ((0x8F ^ 0x8B) <= -1) {
                return (0x70 ^ 0x59) & ~(0x34 ^ 0x1D);
            }
        } else {
            void var12;
            n4 = var12.hashCode();
        }
        int var13 = n7 + n4;
        WorldPoint var14 = var11.g();
        int n8 = var13 * 2;
        if var14 == null {
            n3 = 3;
            0;
            if (-1 > 0) {
                return (0xDD ^ 0xB4 ^ (0x51 ^ 0x12)) & (0x8F ^ 0x84 ^ (0xE1 ^ 0xC0) ^ -1);
            }
        } else {
            n3 = var14.hashCode();
        }
        var13 = n8 + n3;
        N var15 = var11.h();
        int n9 = var13 * 2;
        if var15 == null {
            n2 = 3;
            0;
            if null != null {
                return (0xE3 ^ 0xB4) & ~(0x40 ^ 0x17);
            }
        } else {
            n2 = var15.hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    static {
        d.var16();
    }

    public Instant f() {
        return this.E;
    }

}

