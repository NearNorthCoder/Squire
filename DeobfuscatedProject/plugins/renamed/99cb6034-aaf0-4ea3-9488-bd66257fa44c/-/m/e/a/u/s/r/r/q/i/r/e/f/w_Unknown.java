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

class w_Unknown
extends q_Unknown {
    final /* synthetic */ r aW;
    private static /* synthetic */ int[] llIIIIlIlIII;

    private static void llllIIlIIlIlII() {
        llIIIIlIlIII = new int[3];
        w.llIIIIlIlIII[0] = 0xFFFF8FEB & 0x7CDC;
        w.llIIIIlIlIII[1] = 1;
        w.llIIIIlIlIII[2] = (0xE5 ^ 0xB7 ^ (0x9A ^ 0xC6)) & (116 + 156 - 203 + 99 ^ 129 + 86 - 199 + 150 ^ -1);
    }

    w(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aW = r2;
        super(string, n2, bl, nArray);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        if (w.llllIIlIIlIlIl(worldPoint.getY(), llIIIIlIlIII[0])) {
            bl = llIIIIlIlIII[1];
            0;
            
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

