/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.duke.tasks;

import java.time.Instant;
import net.runelite.api.coords.WorldPoint;

public class g {
    private  int Z;
    
    private  WorldPoint location;
    private  Instant Y;
    private  int aa;
    private  String X;
    private  int ab;

    private static boolean lllIIllIllIIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        g var1;
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

            if (((0xBD ^ 0xAB ^ (0x17 ^ 0x4B)) & (0x6E ^ 1 ^ (0xBD ^ 0x98) ^ -1)) != 0) {
                return (0x2A ^ 0x59 ^ (0x18 ^ 0x7E)) & (0xE5 ^ 0x94 ^ (0xE5 ^ 0x81) ^ -1);
            }
        } else {
            void var2;
            n4 = var2.hashCode();
        }
        int var3 = n7 + n4;
        Instant var4 = var1.L();
        int n8 = var3 * lIllIlIIIlII[2];
        if (g.lllIIllIllIlII(var4)) {
            n3 = lIllIlIIIlII[3];

            if ((0x6C ^ 0x78 ^ (0x90 ^ 0x81)) <= 0) {
                return (0x85 ^ 0x9F ^ (0x6D ^ 0x27)) & (141 + 70 - 91 + 77 ^ 145 + 134 - 147 + 17 ^ -1);
            }
        } else {
            n3 = ((Object)var4).hashCode();
        }
        var3 = n8 + n3;
        WorldPoint var5 = var1.H();
        int n9 = var3 * lIllIlIIIlII[2];
        if (g.lllIIllIllIlII(var5)) {
            n2 = lIllIlIIIlII[3];

            if (3 == 0) {
                return (0x8D ^ 0x98) & ~(0x80 ^ 0x95);
            }
        } else {
            n2 = var5.hashCode();
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
                WorldPoint var6;
                WorldPoint var7;
                block27: {
                    g var8;
                    g var9;
                    block25: {
                        block26: {
                            Instant var10;
                            Instant var11;
                            block24: {
                                block22: {
                                    block23: {
                                        String var12;
                                        String var13;
                                        block21: {
                                            void var14;
                                            if (g.lllIIllIllIIIl(object, this)) {
                                                return lIllIlIIIlII[0];
                                            }
                                            if (g.lllIIllIllIIlI(var14 instanceof g)) {
                                                return lIllIlIIIlII[1];
                                            }
                                            var9 = (g)var14;
                                            if (g.lllIIllIllIIlI(var9.a(var8) ? 1 : 0)) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var8.M(), var9.M())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var8.N(), var9.N())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            if (g.lllIIllIllIIll(var8.O(), var9.O())) {
                                                return lIllIlIIIlII[1];
                                            }
                                            var13 = var8.K();
                                            var12 = var9.K();
                                            if (!g.lllIIllIllIlII(var13)) break block21;
                                            if (!g.lllIIllIllIlIl(var12)) break block22;

                                            if (((0x1A ^ 0x31) & ~(0x3E ^ 0x15)) == (0x3F ^ 0x3B)) {
                                                return false;
                                            }
                                            break block23;
                                        }
                                        if (!g.lllIIllIllIIlI(var13.equals(var12) ? 1 : 0)) break block22;
                                    }
                                    return lIllIlIIIlII[1];
                                }
                                var11 = var8.L();
                                var10 = var9.L();
                                if (!g.lllIIllIllIlII(var11)) break block24;
                                if (!g.lllIIllIllIlIl(var10)) break block25;

                                if ((139 + 155 - 120 + 3 ^ 178 + 124 - 222 + 101) != (5 + 70 - -100 + 21 ^ 9 + 188 - 61 + 56)) {
                                    return false;
                                }
                                break block26;
                            }
                            if (!g.lllIIllIllIIlI(((Object)var11).equals(var10) ? 1 : 0)) break block25;
                        }
                        return lIllIlIIIlII[1];
                    }
                    var7 = var8.H();
                    var6 = var9.H();
                    if (!g.lllIIllIllIlII(var7)) break block27;
                    if (!g.lllIIllIllIlIl(var6)) break block28;

                    }
                    break block29;
                }
                if (!g.lllIIllIllIIlI(var7.equals(var6) ? 1 : 0)) break block28;
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

