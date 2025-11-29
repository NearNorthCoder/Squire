/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import net.runelite.api.coords.WorldPoint;

public class d_Unknown {
    private static /* synthetic */ int[] lIIllllIlIII;
    private /* synthetic */ WorldPoint location;
    private /* synthetic */ int o;

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
            0;
            if (-(130 + 158 - 204 + 80 ^ 62 + 132 - 100 + 66) > 0) {
                return (15 + 158 - -32 + 29 ^ 105 + 81 - 156 + 151) & (167 + 133 - 243 + 191 ^ 46 + 122 - 147 + 146 ^ -1);
            }
        } else {
            void var3;
            n = var3.hashCode();
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
                WorldPoint var6;
                WorldPoint var1;
                block9: {
                    d var4;
                    void var2;
                    if (d.llIlIIIllllIIl(object, this)) {
                        return lIIllllIlIII[0];
                    }
                    if (d.llIlIIIllllIlI(var2 instanceof d)) {
                        return lIIllllIlIII[1];
                    }
                    d var5 = (d)var2;
                    if (d.llIlIIIllllIlI(var5.a(var4) ? 1 : 0)) {
                        return lIIllllIlIII[1];
                    }
                    if (d.llIlIIIllllIll(var4.r(), var5.r())) {
                        return lIIllllIlIII[1];
                    }
                    var1 = var4.o();
                    var6 = var5.o();
                    if (!d.llIlIIIlllllII(var1)) break block9;
                    if (!d.llIlIIIlllllIl(var6)) break block10;
                    0;
                    if (-3 >= 0) {
                        return ((177 + 30 - 96 + 131 ^ 154 + 114 - 150 + 81) & (0x69 ^ 0x59 ^ (0x6E ^ 0x6B) ^ -1)) != 0;
                    }
                    break block11;
                }
                if (!d.llIlIIIllllIlI(var1.equals(var6) ? 1 : 0)) break block10;
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

    private static void llIlIIIllllIII() {
        lIIllllIlIII = new int[4];
        d.lIIllllIlIII[0] = 1;
        d.lIIllllIlIII[1] = (163 + 97 - 222 + 129 ^ 100 + 145 - 67 + 21) & (0x5B ^ 5 ^ (0x28 ^ 0x16) ^ -1);
        d.lIIllllIlIII[2] = 0xF8 ^ 0xC3;
        d.lIIllllIlIII[3] = 170 + 65 - 88 + 34 ^ 51 + 105 - 19 + 21;
    }
}

