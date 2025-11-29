/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import com.google.common.annotations.VisibleForTesting;
import java.time.Instant;
import net.runelite.api.coords.WorldPoint;

@VisibleForTesting
final class d_Unknown {
    private final /* synthetic */ WorldPoint F;
    private final /* synthetic */ N G;
    private static /* synthetic */ int[] llIIIIlIIllI;
    private final /* synthetic */ Instant E;

    private static void llllIIlIIIllll() {
        llIIIIlIIllI = new int[4];
        d.llIIIIlIIllI[0] = 1;
        d.llIIIIlIIllI[1] = (11 + 160 - 82 + 107 ^ 112 + 59 - 158 + 144) & (0x58 ^ 0x56 ^ (0xF9 ^ 0xAE) ^ -1);
        d.llIIIIlIIllI[2] = 0x12 ^ 0x29;
        d.llIIIIlIIllI[3] = 0xE ^ 0x25;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block24: {
            block25: {
                N var2;
                N var13;
                block23: {
                    d var4;
                    d var1;
                    block21: {
                        block22: {
                            WorldPoint var8;
                            WorldPoint var5;
                            block20: {
                                block18: {
                                    block19: {
                                        Instant var12;
                                        Instant var6;
                                        block17: {
                                            void var10;
                                            if (d.llllIIlIIlIIII(object, this)) {
                                                return llIIIIlIIllI[0];
                                            }
                                            if (d.llllIIlIIlIIIl(var10 instanceof d)) {
                                                return llIIIIlIIllI[1];
                                            }
                                            var1 = (d)var10;
                                            var6 = var4.f();
                                            var12 = var1.f();
                                            if (!d.llllIIlIIlIIlI(var6)) break block17;
                                            if (!d.llllIIlIIlIIll(var12)) break block18;
                                            0;
                                            
                                            }
                                            break block19;
                                        }
                                        if (!d.llllIIlIIlIIIl(((Object)var6).equals(var12) ? 1 : 0)) break block18;
                                    }
                                    return llIIIIlIIllI[1];
                                }
                                var5 = var4.g();
                                var8 = var1.g();
                                if (!d.llllIIlIIlIIlI(var5)) break block20;
                                if (!d.llllIIlIIlIIll(var8)) break block21;
                                0;
                                if (-3 >= 0) {
                                    return ((0x5A ^ 0x11 ^ (0x7B ^ 5)) & (0x2B ^ 0x5D ^ (0xDE ^ 0x9D) ^ -1)) != 0;
                                }
                                break block22;
                            }
                            if (!d.llllIIlIIlIIIl(var5.equals(var8) ? 1 : 0)) break block21;
                        }
                        return llIIIIlIIllI[1];
                    }
                    var13 = var4.h();
                    var2 = var1.h();
                    if (!d.llllIIlIIlIIlI(var13)) break block23;
                    if (!d.llllIIlIIlIIll(var2)) break block24;
                    0;
                    if (-1 > ((0xA ^ 2) & ~(0xF ^ 7))) {
                        return false;
                    }
                    break block25;
                }
                if (!d.llllIIlIIlIIIl(var13.equals(var2) ? 1 : 0)) break block24;
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
        d var14;
        int n4;
        int n5 = llIIIIlIIllI[2];
        int n6 = llIIIIlIIllI[0];
        Instant instant = this.f();
        int n7 = n6 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(instant)) {
            n4 = llIIIIlIIllI[3];
            0;
            if ((0x8F ^ 0x8B) <= -1) {
                return (0x70 ^ 0x59) & ~(0x34 ^ 0x1D);
            }
        } else {
            void var9;
            n4 = var9.hashCode();
        }
        int var7 = n7 + n4;
        WorldPoint var3 = var14.g();
        int n8 = var7 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(var3)) {
            n3 = llIIIIlIIllI[3];
            0;
            if (-1 > 0) {
                return (0xDD ^ 0xB4 ^ (0x51 ^ 0x12)) & (0x8F ^ 0x84 ^ (0xE1 ^ 0xC0) ^ -1);
            }
        } else {
            n3 = var3.hashCode();
        }
        var7 = n8 + n3;
        N var11 = var14.h();
        int n9 = var7 * llIIIIlIIllI[2];
        if (d.llllIIlIIlIIlI(var11)) {
            n2 = llIIIIlIIllI[3];
            0;
            
            }
        } else {
            n2 = var11.hashCode();
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

