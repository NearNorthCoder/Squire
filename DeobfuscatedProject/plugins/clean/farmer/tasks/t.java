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

class t
extends q {
    
    final  r aT;

    private static boolean lllIllIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        int n2;
        if (!t.lllIllIlIlllll(worldPoint.getX(), lIllllIIIIlI[0]) || !t.lllIllIllIIIII(worldPoint.getY(), lIllllIIIIlI[1]) || t.lllIllIllIIIIl(worldPoint.getPlane(), lIllllIIIIlI[2])) {
            n2 = lIllllIIIIlI[2];

            if ((0xA9 ^ 0xAD) > (0x15 ^ 0x11)) {
                return false;
            }
        } else {
            n2 = lIllllIIIIlI[3];
        }
        return n2 != 0;
    }

    t(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aT = r2;
        super(string, n2, bl, nArray);
    }

    private static boolean lllIllIllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        t.lllIllIlIllllI();
    }

    private static boolean lllIllIlIlllll(int n2, int n3) {
        return n2 < n3;
    }
}

