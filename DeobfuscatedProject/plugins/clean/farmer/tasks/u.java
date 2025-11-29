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

class u
extends q {
    final  r aU;

    static {
        u.llllIIIlIIllll();
    }

    private static boolean llllIIIlIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        if (u.llllIIIlIlIIII(worldPoint.getY(), llIIIIIIlllI[0])) {
            bl = llIIIIIIlllI[1];

            if (-1 >= 2) {
                return ((116 + 30 - 67 + 76 ^ 85 + 24 - 39 + 121) & (0x25 ^ 0x23 ^ (0xA0 ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIIIlllI[2];
        }
        return bl;
    }

    u(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aU = r2;
        super(string, n2, bl, nArray);
    }
}

