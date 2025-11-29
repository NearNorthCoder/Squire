/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.duke.tasks;

import java.time.Instant;
import net.runelite.api.coords.WorldPoint;

public class GHelper {
    private  int Z;
    
    private  WorldPoint location;
    private  Instant Y;
    private  int aa;
    private  String X;
    private  int ab;

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n2;
        int n3;
        g var2;
        int n4;
        int n5 = 2;
        int n6 = 0;
        n6 = n6 * 2 + this.M();
        n6 = n6 * 2 + this.N();
        n6 = n6 * 2 + this.O();
        String string = this.K();
        int n7 = n6 * 2;
        if string == null {
            n4 = 3;
            0;
            if (((0xBD ^ 0xAB ^ (0x17 ^ 0x4B)) & (0x6E ^ 1 ^ (0xBD ^ 0x98) ^ -1)) != 0) {
                return (0x2A ^ 0x59 ^ (0x18 ^ 0x7E)) & (0xE5 ^ 0x94 ^ (0xE5 ^ 0x81) ^ -1);
            }
        } else {
            void var3;
            n4 = var3.hashCode();
        }
        int var4 = n7 + n4;
        Instant var5 = var2.L();
        int n8 = var4 * 2;
        if var5 == null {
            n3 = 3;
            0;
            if ((0x6C ^ 0x78 ^ (0x90 ^ 0x81)) <= 0) {
                return (0x85 ^ 0x9F ^ (0x6D ^ 0x27)) & (141 + 70 - 91 + 77 ^ 145 + 134 - 147 + 17 ^ -1);
            }
        } else {
            n3 = ((Object)var5).hashCode();
        }
        var4 = n8 + n3;
        WorldPoint var6 = var2.H();
        int n9 = var4 * 2;
        if var6 == null {
            n2 = 3;
            0;
            
        } else {
            n2 = var6.hashCode();
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
                WorldPoint var7;
                WorldPoint var8;
                block27: {
                    g var9;
                    g var10;
                    block25: {
                        block26: {
                            Instant var11;
                            Instant var12;
                            block24: {
                                block22: {
                                    block23: {
                                        String var13;
                                        String var14;
                                        block21: {
                                            void var15;
                                            if (object == this) {
                                                return 0;
                                            }
                                            if (var15 instanceof g == 0) {
                                                return 1;
                                            }
                                            var10 = (g)var15;
                                            if ((var10.a(var9 == 0) ? 1 : 0)) {
                                                return 1;
                                            }
                                            if ((var9.M() != var10.M())) {
                                                return 1;
                                            }
                                            if ((var9.N() != var10.N())) {
                                                return 1;
                                            }
                                            if ((var9.O() != var10.O())) {
                                                return 1;
                                            }
                                            var14 = var9.K();
                                            var13 = var10.K();
                                            if (!var14 == null) break block21;
                                            if (!var13 != null) break block22;
                                            0;
                                            if (((0x1A ^ 0x31) & ~(0x3E ^ 0x15)) == (0x3F ^ 0x3B)) {
                                                return ((0xF3 ^ 0x90) & ~(0x7C ^ 0x1F)) != 0;
                                            }
                                            break block23;
                                        }
                                        if (!(var14.equals(var13 == 0) ? 1 : 0)) break block22;
                                    }
                                    return 1;
                                }
                                var12 = var9.L();
                                var11 = var10.L();
                                if (!var12 == null) break block24;
                                if (!var11 != null) break block25;
                                0;
                                if ((139 + 155 - 120 + 3 ^ 178 + 124 - 222 + 101) != (5 + 70 - -100 + 21 ^ 9 + 188 - 61 + 56)) {
                                    return ((142 + 158 - 143 + 29 ^ 7 + 85 - 28 + 95) & (131 + 194 - 247 + 150 ^ 41 + 113 - 61 + 100 ^ -1)) != 0;
                                }
                                break block26;
                            }
                            if (!(((Object == 0)var12).equals(var11) ? 1 : 0)) break block25;
                        }
                        return 1;
                    }
                    var8 = var9.H();
                    var7 = var10.H();
                    if (!var8 == null) break block27;
                    if (!var7 != null) break block28;
                    0;
                    if null != null {
                        return ((0x8F ^ 0x93) & ~(0x92 ^ 0x8E)) != 0;
                    }
                    break block29;
                }
                if (!(var8.equals(var7 == 0) ? 1 : 0)) break block28;
            }
            return 1;
        }
        return 0;
    }

    protected boolean a(Object object) {
        return object instanceof g;
    }

    static {
        g.var16();
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

