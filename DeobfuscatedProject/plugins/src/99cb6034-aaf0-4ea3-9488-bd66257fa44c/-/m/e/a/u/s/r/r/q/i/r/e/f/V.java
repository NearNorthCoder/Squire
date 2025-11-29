/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class V
extends P {
    private static /* synthetic */ int[] llIIIIIllIlI;

    private static boolean llllIIIllIllll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        V.llllIIIllIllIl();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void lllllllllllllllIlIlIllIlIIlIIIIl;
        if (V.llllIIIllIlllI(n2) && V.llllIIIllIllll(n2, llIIIIIllIlI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0] - n2);
        }
        if (V.llllIIIlllIIII((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[1]) && V.llllIIIllIllll((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0]);
        }
        if (V.llllIIIlllIIII((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[3]) && V.llllIIIllIllll((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[4])) {
            return new an(au.ATTAS, n.GROWING, (int)(lllllllllllllllIlIlIllIlIIlIIIIl - llIIIIIllIlI[3]));
        }
        if (V.llllIIIlllIIII((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[5]) && V.llllIIIllIllll((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[6])) {
            return new an(au.IASOR, n.GROWING, (int)(lllllllllllllllIlIlIllIlIIlIIIIl - llIIIIIllIlI[5]));
        }
        if (V.llllIIIlllIIII((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[7]) && V.llllIIIllIllll((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[8])) {
            return new an(au.KRONOS, n.GROWING, (int)(lllllllllllllllIlIlIllIlIIlIIIIl - llIIIIIllIlI[7]));
        }
        if (V.llllIIIlllIIII((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[9]) && V.llllIIIllIllll((int)lllllllllllllllIlIlIllIlIIlIIIIl, llIIIIIllIlI[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0]);
        }
        return null;
    }

    private static void llllIIIllIllIl() {
        llIIIIIllIlI = new int[11];
        V.llIIIIIllIlI[0] = "   ".length();
        V.llIIIIIllIlI[1] = 0x4A ^ 0x4E;
        V.llIIIIIllIlI[2] = 0xA2 ^ 0xC5 ^ (0x74 ^ 0x14);
        V.llIIIIIllIlI[3] = 0xD5 ^ 0xB4 ^ (0x2A ^ 0x43);
        V.llIIIIIllIlI[4] = 75 + 31 - 66 + 130 ^ 94 + 141 - 132 + 83;
        V.llIIIIIllIlI[5] = 0x3D ^ 0x2C;
        V.llIIIIIllIlI[6] = 0x8A ^ 0x9B ^ (0xBD ^ 0xB5);
        V.llIIIIIllIlI[7] = 0x13 ^ 9;
        V.llIIIIIllIlI[8] = 129 + 50 - 46 + 14 ^ 18 + 113 - 51 + 97;
        V.llIIIIIllIlI[9] = 0x3E ^ 0x18 ^ (0x4C ^ 0x49);
        V.llIIIIIllIlI[10] = 53 + 6 - -136 + 60;
    }

    private static boolean llllIIIllIlllI(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    V(A a2, String string2, boolean bl) {
    }
}

