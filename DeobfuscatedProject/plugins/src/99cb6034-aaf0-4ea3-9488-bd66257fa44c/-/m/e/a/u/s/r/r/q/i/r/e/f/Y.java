/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class Y
extends P {
    private static /* synthetic */ int[] llIIIlIIIllI;

    private static void llllIlIIIIIIII() {
        llIIIlIIIllI = new int[13];
        Y.llIIIlIIIllI[0] = "   ".length();
        Y.llIIIlIIIllI[1] = 0xBD ^ 0xB9;
        Y.llIIIlIIIllI[2] = 0x54 ^ 0x5F;
        Y.llIIIlIIIllI[3] = 0x63 ^ 0xB ^ (0xDD ^ 0xB9);
        Y.llIIIlIIIllI[4] = 0x7C ^ 0x6B ^ (0x58 ^ 0x5D);
        Y.llIIIlIIIllI[5] = 89 + 102 - 156 + 123 ^ 62 + 47 - 89 + 121;
        Y.llIIIlIIIllI[6] = 0x1D ^ 0x70 ^ (5 ^ 0x71);
        Y.llIIIlIIIllI[7] = 0x34 ^ 0x5C ^ (0xE6 ^ 0x94);
        Y.llIIIlIIIllI[8] = 0x74 ^ 0x55;
        Y.llIIIlIIIllI[9] = 0x53 ^ 0x71;
        Y.llIIIlIIIllI[10] = " ".length();
        Y.llIIIlIIIllI[11] = 0x29 ^ 0x6C ^ (0x6B ^ 0xD);
        Y.llIIIlIIIllI[12] = 64 + 54 - 84 + 211 + (0x6C ^ 0x2A) - (58 + 157 - 64 + 11) + (0x40 ^ 0x26);
    }

    private static boolean llllIlIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIlIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void lllllllllllllllIlIlIlIIIllIlIIll;
        if (Y.llllIlIIIIIIIl(n2) && Y.llllIlIIIIIIlI(n2, llIIIlIIIllI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIIllI[0] - n2);
        }
        if (Y.llllIlIIIIIIll((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[1]) && Y.llllIlIIIIIIlI((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[2])) {
            return new an(au.CALQUAT, n.GROWING, (int)(lllllllllllllllIlIlIlIIIllIlIIll - llIIIlIIIllI[1]));
        }
        if (Y.llllIlIIIIIIll((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[3]) && Y.llllIlIIIIIIlI((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[4])) {
            return new an(au.CALQUAT, n.HARVESTABLE, (int)(lllllllllllllllIlIlIlIIIllIlIIll - llIIIlIIIllI[3]));
        }
        if (Y.llllIlIIIIIIll((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[5]) && Y.llllIlIIIIIIlI((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[6])) {
            return new an(au.CALQUAT, n.DISEASED, (int)(lllllllllllllllIlIlIlIIIllIlIIll - llIIIlIIIllI[4]));
        }
        if (Y.llllIlIIIIIIll((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[7]) && Y.llllIlIIIIIIlI((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[8])) {
            return new an(au.CALQUAT, n.DEAD, (int)(lllllllllllllllIlIlIlIIIllIlIIll - llIIIlIIIllI[6]));
        }
        if (Y.llllIlIIIIIlII((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[9])) {
            return new an(au.CALQUAT, n.GROWING, au.CALQUAT.bc() - llIIIlIIIllI[10]);
        }
        if (Y.llllIlIIIIIIll((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[11]) && Y.llllIlIIIIIIlI((int)lllllllllllllllIlIlIlIIIllIlIIll, llIIIlIIIllI[12])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIIllI[0]);
        }
        return null;
    }

    static {
        Y.llllIlIIIIIIII();
    }

    private static boolean llllIlIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIIIIIIl(int n2) {
        return n2 >= 0;
    }

    Y(A a2, String string2, boolean bl) {
    }
}

