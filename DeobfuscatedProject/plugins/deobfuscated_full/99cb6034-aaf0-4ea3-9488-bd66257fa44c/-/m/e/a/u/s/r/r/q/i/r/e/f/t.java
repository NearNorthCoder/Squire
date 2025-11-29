/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import net.runelite.api.coords.WorldPoint;

class t
extends q {
    private static /* synthetic */ int[] lIllllIIIIlI;
    final /* synthetic */ r aT;

    private static boolean lllIllIllIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIllIlIllllI() {
        lIllllIIIIlI = new int[4];
        t.lIllllIIIIlI[0] = -(0xFFFFD1FF & 0x6EE8) & (0xFFFFFBFF & 0x4FFF);
        t.lIllllIIIIlI[1] = -(0xFFFFD6FF & 0x3988) & (0xFFFF9DF7 & Short.MAX_VALUE);
        t.lIllllIIIIlI[2] = 1;
        t.lIllllIIIIlI[3] = (0x4E ^ 0x1A) & ~(0xC ^ 0x58);
    }

    @Override
    public boolean c(WorldPoint worldPoint) {
        int n2;
        if (!t.lllIllIlIlllll(worldPoint.getX(), lIllllIIIIlI[0]) || !t.lllIllIllIIIII(worldPoint.getY(), lIllllIIIIlI[1]) || t.lllIllIllIIIIl(worldPoint.getPlane(), lIllllIIIIlI[2])) {
            n2 = lIllllIIIIlI[2];
            0;
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

