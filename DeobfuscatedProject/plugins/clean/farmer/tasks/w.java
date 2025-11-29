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

class w
extends q {
    final  r aW;

    w(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aW = r2;
        super(string, n2, bl, nArray);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        if (w.llllIIlIIlIlIl(worldPoint.getY(), llIIIIlIlIII[0])) {
            bl = llIIIIlIlIII[1];

            }
        } else {
            bl = llIIIIlIlIII[2];
        }
        return bl;
    }

    static {
        w.llllIIlIIlIlII();
    }

    private static boolean llllIIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }
}

