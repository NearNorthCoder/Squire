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

class s
extends q {
    final /* synthetic */ r aS;
    private static /* synthetic */ int[] llIIIlIlIIlI;

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
                "".length();
                if ("  ".length() == " ".length()) {
                    return ((0x18 ^ 0xE) & ~(0x94 ^ 0x82)) != 0;
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

    private static void llllIlIIlIIlII() {
        llIIIlIlIIlI = new int[6];
        s.llIIIlIlIIlI[0] = 0xFFFFAB06 & 0x5FF9;
        s.llIIIlIlIIlI[1] = 0xFFFFBDAC & 0x4FD3;
        s.llIIIlIlIIlI[2] = 0xFFFFBFDC & 0x4B3B;
        s.llIIIlIlIIlI[3] = 0xFFFF9D75 & 0x6FFA;
        s.llIIIlIlIIlI[4] = " ".length();
        s.llIIIlIlIIlI[5] = (0xE8 ^ 0xAA ^ (0 ^ 0x6C)) & (0x2E ^ 0x27 ^ (0x22 ^ 5) ^ -" ".length());
    }

    private static boolean llllIlIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllIlIIlIIlIl(int n2, int n3) {
        return n2 >= n3;
    }
}

