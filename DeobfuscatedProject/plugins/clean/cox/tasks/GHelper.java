/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum19;
import net.runelite.api.coords.WorldPoint;

public class GHelper {
    
     int bZ;
    private  int cb;
     int ca;

    /*
     * WARNING - void declaration
     */
    public WorldPoint c(char c2, WorldPoint worldPoint) {
        int n2 = G.a(c2);
        switch (n2) {
            case 0: {
                G var1;
                void var2;
                return var2.dx(var1.bZ).dy(var1.ca);
            }
            case 1: {
                G var1;
                void var2;
                return var2.dx(var1.cb - var1.ca).dy(var1.bZ);
            }
            case 2: {
                G var1;
                void var2;
                return var2.dx(var1.cb - var1.bZ).dy(var1.cb - var1.ca);
            }
            case 3: {
                G var1;
                void var2;
                return var2.dx(var1.ca).dy(var1.cb - var1.bZ);
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

    public GHelper(int n2, int n3) {
        this.cb = lIlIllIIlIll[0];
        this.bZ = n2;
        this.ca = n3;
    }

    public G v(int n2) {
        return new GHelper(this.bZ, this.ca + n2);
    }

    static {
        G.llIlllllllIIll();
    }

    public G u(int n2) {
        return new GHelper(this.bZ + n2, this.ca);
    }

}

