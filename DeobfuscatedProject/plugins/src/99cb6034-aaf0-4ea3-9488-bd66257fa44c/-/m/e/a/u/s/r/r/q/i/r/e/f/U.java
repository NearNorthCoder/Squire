/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class U
extends P {
    private static /* synthetic */ int[] lIlllllllIII;

    private static boolean llllIIIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llllIIIIIllIlI() {
        lIlllllllIII = new int[15];
        U.lIlllllllIII[0] = "   ".length();
        U.lIlllllllIII[1] = 0x8D ^ 0xA6 ^ (0xAA ^ 0x85);
        U.lIlllllllIII[2] = 0x60 ^ 0x67;
        U.lIlllllllIII[3] = 0x63 ^ 0x6B;
        U.lIlllllllIII[4] = 0x6A ^ 0x79;
        U.lIlllllllIII[5] = 0x3A ^ 0x2E;
        U.lIlllllllIII[6] = 0x34 ^ 0x58 ^ (9 ^ 0x69);
        U.lIlllllllIII[7] = 0xB9 ^ 0xAC;
        U.lIlllllllIII[8] = 0x60 ^ 0x32 ^ (0xD1 ^ 0x9C);
        U.lIlllllllIII[9] = 0xF ^ 0x63 ^ (0x35 ^ 0x79);
        U.lIlllllllIII[10] = 0xA9 ^ 0x82;
        U.lIlllllllIII[11] = 0x99 ^ 0xB5;
        U.lIlllllllIII[12] = " ".length();
        U.lIlllllllIII[13] = 122 + 181 - 237 + 170 ^ 154 + 170 - 160 + 29;
        U.lIlllllllIII[14] = 0xA5 ^ 0x9A;
    }

    private static boolean llllIIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void lllllllllllllllIlIlIlllIllIIlIIl;
        if (U.llllIIIIIllIll(n2) && U.llllIIIIIlllII(n2, lIlllllllIII[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0] - n2);
        }
        if (U.llllIIIIIlllIl((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[1]) && U.llllIIIIIlllII((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0]);
        }
        if (U.llllIIIIIlllIl((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[3]) && U.llllIIIIIlllII((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[4])) {
            return new an(au.SPIRIT_TREE, n.GROWING, (int)(lllllllllllllllIlIlIlllIllIIlIIl - lIlllllllIII[3]));
        }
        if (U.llllIIIIIllllI((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[5])) {
            return new an(au.SPIRIT_TREE, n.GROWING, lIlllllllIII[6]);
        }
        if (U.llllIIIIIlllIl((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[7]) && U.llllIIIIIlllII((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[8])) {
            return new an(au.SPIRIT_TREE, n.DISEASED, (int)(lllllllllllllllIlIlIlllIllIIlIIl - lIlllllllIII[5]));
        }
        if (U.llllIIIIIlllIl((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[9]) && U.llllIIIIIlllII((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[10])) {
            return new an(au.SPIRIT_TREE, n.DEAD, (int)(lllllllllllllllIlIlIlllIllIIlIIl - lIlllllllIII[8]));
        }
        if (U.llllIIIIIllllI((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[11])) {
            return new an(au.SPIRIT_TREE, n.GROWING, au.SPIRIT_TREE.bc() - lIlllllllIII[12]);
        }
        if (U.llllIIIIIlllIl((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[13]) && U.llllIIIIIlllII((int)lllllllllllllllIlIlIlllIllIIlIIl, lIlllllllIII[14])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0]);
        }
        return null;
    }

    private static boolean llllIIIIIllIll(int n2) {
        return n2 >= 0;
    }

    static {
        U.llllIIIIIllIlI();
    }

    U(A a2, String string2, boolean bl) {
    }

    private static boolean llllIIIIIlllII(int n2, int n3) {
        return n2 <= n3;
    }
}

