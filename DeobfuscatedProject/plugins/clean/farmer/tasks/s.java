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

class s
extends q {
    final  r aS;

    s(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aS = r2;
        super(string, n2, bl, nArray);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        if (s.llllIlIIlIIlIl(worldPoint.getX(), llIIIlIlIIlI[0]) && s.llllIlIIlIIllI(worldPoint.getY(), llIIIlIlIIlI[1])) {
            int n2;
            if (s.llllIlIIlIIllI(worldPoint.getX(), llIIIlIlIIlI[2]) && s.llllIlIIlIIlIl(worldPoint.getY(), llIIIlIlIIlI[3]) && s.llllIlIIlIIlll(worldPoint.getPlane())) {
                n2 = llIIIlIlIIlI[4];

                if (2 == 1) {
                    return false;
                }
            } else {
                n2 = llIIIlIlIIlI[5];
            }
            return n2 != 0;
        }
        return llIIIlIlIIlI[4];
    }

    private static boolean llllIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    static {
        s.llllIlIIlIIlII();
    }

    private static boolean llllIlIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIIlIIlIl(int n2, int n3) {
        return n2 >= n3;
    }
}

