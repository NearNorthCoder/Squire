/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.combat.tasks;

import net.runelite.api.coords.WorldPoint;

public class DHelper {
    
    private  WorldPoint location;
    private  int o;

    public void a(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2 = 2;
        int n3 = 0;
        n3 = n3 * 2 + this.r();
        WorldPoint worldPoint = this.o();
        int n4 = n3 * 2;
        if worldPoint == null {
            n = 3;
            0;
            if (-(130 + 158 - 204 + 80 ^ 62 + 132 - 100 + 66) > 0) {
                return (15 + 158 - -32 + 29 ^ 105 + 81 - 156 + 151) & (167 + 133 - 243 + 191 ^ 46 + 122 - 147 + 146 ^ -1);
            }
        } else {
            void var2;
            n = var2.hashCode();
        }
        n3 = n4 + n;
        return n3;
    }

    static {
        d.var3();
    }

    protected boolean a(Object object) {
        return object instanceof d;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                WorldPoint var4;
                WorldPoint var5;
                block9: {
                    d var6;
                    void var7;
                    if (object == this) {
                        return 0;
                    }
                    if (var7 instanceof d == 0) {
                        return 1;
                    }
                    d var8 = (d)var7;
                    if ((var8.a(var6 == 0) ? 1 : 0)) {
                        return 1;
                    }
                    if ((var6.r() != var6.r()2))) {
                        return 1;
                    }
                    var5 = var6.o();
                    var4 = var8.o();
                    if (!var5 == null) break block9;
                    if (!var4 != null) break block10;
                    0;
                    if (-3 >= 0) {
                        return ((177 + 30 - 96 + 131 ^ 154 + 114 - 150 + 81) & (0x69 ^ 0x59 ^ (0x6E ^ 0x6B) ^ -1)) != 0;
                    }
                    break block11;
                }
                if (!(var5.equals(var4 == 0) ? 1 : 0)) break block10;
            }
            return 1;
        }
        return 0;
    }

    public WorldPoint o() {
        return this.location;
    }

    public void f(int n) {
        this.o = n;
    }

    public String toString() {
        return "LootTarget(location=" + String.valueOf(this.o()) + ", id=" + this.r() + ")";
    }

    public int r() {
        return this.o;
    }
}

