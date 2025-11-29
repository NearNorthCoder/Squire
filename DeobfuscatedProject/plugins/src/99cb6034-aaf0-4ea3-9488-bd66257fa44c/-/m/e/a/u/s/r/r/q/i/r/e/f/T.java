/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class T
extends P {
    private static /* synthetic */ int[] lIlllIlIlllI;

    static {
        T.lllIllIIlIlIll();
    }

    private static void lllIllIIlIlIll() {
        lIlllIlIlllI = new int[15];
        T.lIlllIlIlllI[0] = "   ".length();
        T.lIlllIlIlllI[1] = 128 + 112 - 212 + 157 ^ 139 + 158 - 134 + 26;
        T.lIlllIlIlllI[2] = 21 + 77 - 65 + 164 ^ 105 + 5 - -79 + 5;
        T.lIlllIlIlllI[3] = 0x4C ^ 0x44;
        T.lIlllIlIlllI[4] = 0x55 ^ 0x1A ^ (0x3F ^ 0x61);
        T.lIlllIlIlllI[5] = 0x30 ^ 0x22;
        T.lIlllIlIlllI[6] = (0xF9 ^ 0x99) & ~(0xCE ^ 0xAE);
        T.lIlllIlIlllI[7] = 0xB4 ^ 0xA7;
        T.lIlllIlIlllI[8] = "  ".length() ^ (0x53 ^ 0x4A);
        T.lIlllIlIlllI[9] = 7 ^ 0x76 ^ (0x17 ^ 0x7A);
        T.lIlllIlIlllI[10] = 0x9A ^ 0xBE;
        T.lIlllIlIlllI[11] = 0x40 ^ 0x65;
        T.lIlllIlIlllI[12] = " ".length();
        T.lIlllIlIlllI[13] = 0xB ^ 0x22;
        T.lIlllIlIlllI[14] = 0x4F ^ 0x78;
    }

    private static boolean lllIllIIlIllII(int n2) {
        return n2 >= 0;
    }

    T(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void lllllllllllllllIlIllIlIlIlIlIIlI;
        if (T.lllIllIIlIllII(n2) && T.lllIllIIlIllIl(n2, lIlllIlIlllI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIlllI[0] - n2);
        }
        if (T.lllIllIIlIlllI((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[1]) && T.lllIllIIlIllIl((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIlllI[0]);
        }
        if (T.lllIllIIlIlllI((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[3]) && T.lllIllIIlIllIl((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[4])) {
            return new an(au.REDWOOD, n.GROWING, (int)(lllllllllllllllIlIllIlIlIlIlIIlI - lIlllIlIlllI[3]));
        }
        if (T.lllIllIIlIllll((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[5])) {
            return new an(au.REDWOOD, n.HARVESTABLE, lIlllIlIlllI[6]);
        }
        if (T.lllIllIIlIlllI((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[7]) && T.lllIllIIlIllIl((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[8])) {
            return new an(au.REDWOOD, n.DISEASED, (int)(lllllllllllllllIlIllIlIlIlIlIIlI - lIlllIlIlllI[5]));
        }
        if (T.lllIllIIlIlllI((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[9]) && T.lllIllIIlIllIl((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[10])) {
            return new an(au.REDWOOD, n.DEAD, (int)(lllllllllllllllIlIllIlIlIlIlIIlI - lIlllIlIlllI[8]));
        }
        if (T.lllIllIIlIllll((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[11])) {
            return new an(au.REDWOOD, n.GROWING, au.REDWOOD.bc() - lIlllIlIlllI[12]);
        }
        if (T.lllIllIIlIlllI((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[13]) && T.lllIllIIlIllIl((int)lllllllllllllllIlIllIlIlIlIlIIlI, lIlllIlIlllI[14])) {
            return new an(au.REDWOOD, n.HARVESTABLE, lIlllIlIlllI[6]);
        }
        return null;
    }

    private static boolean lllIllIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

