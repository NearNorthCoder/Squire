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

    private static boolean llIlIIIlllllIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIIllllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIllllIll(int n, int n2) {
        return n != n2;
    }

    public void a(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        int n;
        int n2 = lIIllllIlIII[2];
        int n3 = lIIllllIlIII[0];
        n3 = n3 * lIIllllIlIII[2] + this.r();
        WorldPoint worldPoint = this.o();
        int n4 = n3 * lIIllllIlIII[2];
        if (d.llIlIIIlllllII(worldPoint)) {
            n = lIIllllIlIII[3];

            if (-(130 + 158 - 204 + 80 ^ 62 + 132 - 100 + 66) > 0) {
                return (15 + 158 - -32 + 29 ^ 105 + 81 - 156 + 151) & (167 + 133 - 243 + 191 ^ 46 + 122 - 147 + 146 ^ -1);
            }
        } else {
            void var1;
            n = var1.hashCode();
        }
        n3 = n4 + n;
        return n3;
    }

    static {
        d.llIlIIIllllIII();
    }

    protected boolean a(Object object) {
        return object instanceof d;
    }

    private static boolean llIlIIIllllIlI(int n) {
        return n == 0;
    }

    private static boolean llIlIIIlllllII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block10: {
            block11: {
                WorldPoint var2;
                WorldPoint var3;
                block9: {
                    d var4;
                    void var5;
                    if (d.llIlIIIllllIIl(object, this)) {
                        return lIIllllIlIII[0];
                    }
                    if (d.llIlIIIllllIlI(var5 instanceof d)) {
                        return lIIllllIlIII[1];
                    }
                    d var6 = (DHelper) ar5;
                    if (d.llIlIIIllllIlI(var6.a(var4) ? 1 : 0)) {
                        return lIIllllIlIII[1];
                    }
                    if (d.llIlIIIllllIll(var4.r(), var6.r())) {
                        return lIIllllIlIII[1];
                    }
                    var3 = var4.o();
                    var2 = var6.o();
                    if (!d.llIlIIIlllllII(var3)) break block9;
                    if (!d.llIlIIIlllllIl(var2)) break block10;

                    break block11;
                }
                if (!d.llIlIIIllllIlI(var3.equals(var2) ? 1 : 0)) break block10;
            }
            return lIIllllIlIII[1];
        }
        return lIIllllIlIII[0];
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

