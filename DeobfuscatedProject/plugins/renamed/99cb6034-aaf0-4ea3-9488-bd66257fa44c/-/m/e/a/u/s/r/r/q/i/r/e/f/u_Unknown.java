/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r_Unknown;
import net.runelite.api.coords.WorldPoint;

class u_Unknown
extends q_Unknown {
    final /* synthetic */ r aU;
    private static /* synthetic */ int[] llIIIIIIlllI;

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
            0;
            if (-1 >= 2) {
                return ((116 + 30 - 67 + 76 ^ 85 + 24 - 39 + 121) & (0x25 ^ 0x23 ^ (0xA0 ^ 0x82) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIIIlllI[2];
        }
        return bl;
    }

    private static void llllIIIlIIllll() {
        llIIIIIIlllI = new int[3];
        u.llIIIIIIlllI[0] = 0xFFFFAEFF & 0x5DC8;
        u.llIIIIIIlllI[1] = 1;
        u.llIIIIIIlllI[2] = (0xC4 ^ 0x9C) & ~(0x3F ^ 0x67);
    }

    u(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aU = r2;
        super(string, n2, bl, nArray);
    }
}

