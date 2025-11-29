/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import java.time.Instant;
import net.runelite.api.coords.WorldPoint;

public class g {
    private /* synthetic */ int Z;
    private static /* synthetic */ int[] lIllIlIIIlII;
    private /* synthetic */ WorldPoint location;
    private /* synthetic */ Instant Y;
    private /* synthetic */ int aa;
    private /* synthetic */ String X;
    private /* synthetic */ int ab;

    private static boolean lllIIllIllIIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        g var12;
        int n4;
        int n5 = lIllIlIIIlII[2];
        int n6 = lIllIlIIIlII[0];
        n6 = n6 * lIllIlIIIlII[2] + this.M();
        n6 = n6 * lIllIlIIIlII[2] + this.N();
        n6 = n6 * lIllIlIIIlII[2] + this.O();
        String string = this.K();
        int n7 = n6 * lIllIlIIIlII[2];
        if (g.lllIIllIllIlII(string)) {
            n4 = lIllIlIIIlII[3];
            0;
            if (((0xBD ^ 0xAB ^ (0x17 ^ 0x4B)) & (0x6E ^ 1 ^ (0xBD ^ 0x98) ^ -1)) != 0) {
                return (0x2A ^ 0x59 ^ (0x18 ^ 0x7E)) & (0xE5 ^ 0x94 ^ (0xE5 ^ 0x81) ^ -1);
            }
        } else {
            void var4;
            n4 = var4.hashCode();
        }
        int var3 = n7 + n4;
        Instant var7 = var12.L();
        int n8 = var3 * lIllIlIIIlII[2];
        if (g.lllIIllIllIlII(var7)) {
            n3 = lIllIlIIIlII[3];
            0;
            if ((0x6C ^ 0x78 ^ (0x90 ^ 0x81)) <= 0) {
                return (0x85 ^ 0x9F ^ (0x6D ^ 0x27)) & (141 + 70 - 91 + 77 ^ 145 + 134 - 147 + 17 ^ -1);
            }
        } else {
            n3 = ((Object)var7).hashCode();
        }
        var3 = n8 + n3;
        WorldPoint var8 = var12.H();
        int n9 = var3 * lIllIlIIIlII[2];
        if (g.lllIIllIllIlII(var8)) {
            n2 = lIllIlIIIlII[3];
            0;
            if (3 == 0) {
                return (0x8D ^ 0x98) & ~(0x80 ^ 0x95);
            }
        } else {
            n2 = var8.hashCode();
        }
        n6 = n9 + n2;
        return n6;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block28: {
            block29: {
                WorldPoint var2;
                WorldPoint var14;
                block27: {
                    g var1;
                    g var5;
                    block25: {
                        block26: {
                            Instant var6;
                            Instant var9;
                            block24: {
                                block22: {
                                    block23: {
                                        String var11;
                                        String var10;
                                        block21: {
                                            void var13;
                                            if (g.lllIIllIllIIIl(object, this)) {
                                                return lIllIlIIIlII[0];
                                            }
                                            if (g.lllIIllIllIIlI(var13 instanceof g)) {
                                                return lIllIlIIIlII[1];
                                            }
                                            var5 = (g)var13;
                                            if (g.lllIIllIllIIlI(var5.a(var1) ? 1 : 0)) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var1.M(), var5.M())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var1.N(), var5.N())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var1.O(), var5.O())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            var10 = var1.K();
                                            var11 = var5.K();
                                            if (!g.lllIIllIllIlII(var10)) break block21;
                                            if (!g.lllIIllIllIlIl(var11)) break block22;
                                            0;
                                            if (((0x1A ^ 0x31) & ~(0x3E ^ 0x15)) == (0x3F ^ 0x3B)) {
                                                return false;
                                            }
                                            break block23;
                                        }
                                        if (!g.lllIIllIllIIlI(var10.equals(var11) ? 1 : 0)) break block22;
                                    }
                                    return lIllIlIIIlII[1];
                                }
                                var9 = var1.L();
                                var6 = var5.L();
                                if (!g.lllIIllIllIlII(var9)) break block24;
                                if (!g.lllIIllIllIlIl(var6)) break block25;
                                0;
                                if ((139 + 155 - 120 + 3 ^ 178 + 124 - 222 + 101) != (5 + 70 - -100 + 21 ^ 9 + 188 - 61 + 56)) {
                                    return false;
                                }
                                break block26;
                            }
                            if (!g.lllIIllIllIIlI(((Object)var9).equals(var6) ? 1 : 0)) break block25;
                        }
                        return lIllIlIIIlII[1];
                    }
                    var14 = var1.H();
                    var2 = var5.H();
                    if (!g.lllIIllIllIlII(var14)) break block27;
                    if (!g.lllIIllIllIlIl(var2)) break block28;
                    0;
                    
                    }
                    break block29;
                }
                if (!g.lllIIllIllIIlI(var14.equals(var2) ? 1 : 0)) break block28;
            }
            return lIllIlIIIlII[1];
        }
        return lIllIlIIIlII[0];
    }

    private static boolean lllIIllIllIlIl(Object object) {
        return object != null;
    }

    private static boolean lllIIllIllIIlI(int n2) {
        return n2 == 0;
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    private static void lllIIllIllIIII() {
        lIllIlIIIlII = new int[4];
        g.lIllIlIIIlII[0] = 1;
        g.lIllIlIIIlII[1] = (0x31 ^ 0x35 ^ (0x56 ^ 0xB)) & (0xE0 ^ 0xC5 ^ (0xCD ^ 0xB1) ^ -1);
        g.lIllIlIIIlII[2] = 0x78 ^ 0x43;
        g.lIllIlIIIlII[3] = 0x5A ^ 0x71;
    }

    private static boolean lllIIllIllIIll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        g.lllIIllIllIIII();
    }

    public void b(int n2) {
        this.Z = n2;
    }

    public Instant L() {
        return this.Y;
    }

    public int N() {
        return this.aa;
    }

    public void c(int n2) {
        this.aa = n2;
    }

    public void a(Instant instant) {
        this.Y = instant;
    }

    private static boolean lllIIllIllIlII(Object object) {
        return object == null;
    }

    public WorldPoint H() {
        return this.location;
    }

    public String K() {
        return this.X;
    }

    public void d(int n2) {
        this.ab = n2;
    }

    public void e(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public int O() {
        return this.ab;
    }

    public void a(String string) {
        this.X = string;
    }

    public int M() {
        return this.Z;
    }

    public String toString() {
        return "LootTarget(itemName=" + this.K() + ", dropTime=" + String.valueOf(this.L()) + ", id=" + this.M() + ", location=" + String.valueOf(this.H()) + ", itemValue=" + this.N() + ", alchValue=" + this.O() + ")";
    }
}

