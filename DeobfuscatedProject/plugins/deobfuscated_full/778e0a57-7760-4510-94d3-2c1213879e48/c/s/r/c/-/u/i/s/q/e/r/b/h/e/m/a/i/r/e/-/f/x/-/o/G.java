/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.S;
import net.runelite.api.coords.WorldPoint;

public class G {
    private static /* synthetic */ int[] lIlIllIIlIll;
    /* synthetic */ int bZ;
    private /* synthetic */ int cb;
    /* synthetic */ int ca;

    /*
     * WARNING - void declaration
     */
    public WorldPoint c(char c2, WorldPoint worldPoint) {
        int n2 = G.a(c2);
        switch (n2) {
            case 0: {
                G var2;
                void var1;
                return var1.dx(var2.bZ).dy(var2.ca);
            }
            case 1: {
                G var2;
                void var1;
                return var1.dx(var2.cb - var2.ca).dy(var2.bZ);
            }
            case 2: {
                G var2;
                void var1;
                return var1.dx(var2.cb - var2.bZ).dy(var2.cb - var2.ca);
            }
            case 3: {
                G var2;
                void var1;
                return var1.dx(var2.ca).dy(var2.cb - var2.bZ);
            }
        }
        return null;
    }

    private static int a(char c2) {
        int n2 = S.e(c2);
        int n3 = lIlIllIIlIll[1];
        int n4 = (n3 - n2 + lIlIllIIlIll[2]) % lIlIllIIlIll[2];
        return n4;
    }

    public G(int n2, int n3) {
        this.cb = lIlIllIIlIll[0];
        this.bZ = n2;
        this.ca = n3;
    }

    public G v(int n2) {
        return new G(this.bZ, this.ca + n2);
    }

    static {
        G.llIlllllllIIll();
    }

    public G u(int n2) {
        return new G(this.bZ + n2, this.ca);
    }

    private static void llIlllllllIIll() {
        lIlIllIIlIll = new int[3];
        G.lIlIllIIlIll[0] = 0x44 ^ 0x5B;
        G.lIlIllIIlIll[1] = 2;
        G.lIlIllIIlIll[2] = 0x24 ^ 0x20;
    }
}

