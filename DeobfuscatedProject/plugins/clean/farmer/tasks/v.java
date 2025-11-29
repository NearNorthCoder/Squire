/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.FarmerManager;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import gg.squire.farmer.tasks.FarmerManager;
import net.runelite.api.coords.WorldPoint;

class v
extends q {
    final  r aV;

    static {
        v.lllIlIlllIIlII();
    }

    v(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aV = r2;
        super(string, n2, bl, nArray);
    }

    private static boolean lllIlIlllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIlllIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlllIlIII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        void var1;
        if (v.lllIlIlllIIlIl(worldPoint.getX(), lIlllIIllIII[0]) && v.lllIlIlllIIllI(worldPoint.getY(), lIlllIIllIII[1]) && v.lllIlIlllIIlll(worldPoint.getY(), lIlllIIllIII[2])) {
            return lIlllIIllIII[3];
        }
        if ((!v.lllIlIlllIlIII(var1.getX(), lIlllIIllIII[4]) || !v.lllIlIlllIlIII(var1.getX(), lIlllIIllIII[5]) || !v.lllIlIlllIlIII(var1.getX(), lIlllIIllIII[6]) || v.lllIlIlllIIlIl(var1.getX(), lIlllIIllIII[7])) && v.lllIlIlllIIlll(var1.getY(), lIlllIIllIII[8]) && v.lllIlIlllIIllI(var1.getY(), lIlllIIllIII[9])) {
            return lIlllIIllIII[3];
        }
        if (v.lllIlIlllIlIIl(var1.getPlane())) {
            bl = lIlllIIllIII[10];

            if (2 < 1) {
                return false;
            }
        } else {
            bl = lIlllIIllIII[3];
        }
        return bl;
    }

    private static boolean lllIlIlllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIlllIIlll(int n2, int n3) {
        return n2 <= n3;
    }
}

