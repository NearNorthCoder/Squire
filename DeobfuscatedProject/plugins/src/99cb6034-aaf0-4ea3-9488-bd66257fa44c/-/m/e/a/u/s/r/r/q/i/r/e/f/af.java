/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class af
extends P {
    private static /* synthetic */ int[] lIllllIlIlll;

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void lllllllllllllllIlIllIIlIIIIlIlIl;
        if (af.lllIlllIlIlIII(n2) && af.lllIlllIlIlIIl(n2, lIllllIlIlll[0])) {
            return new an(au.WEEDS, n.GROWING, lIllllIlIlll[0] - n2);
        }
        if (af.lllIlllIlIlIlI((int)lllllllllllllllIlIllIIlIIIIlIlIl, lIllllIlIlll[1]) && af.lllIlllIlIlIIl((int)lllllllllllllllIlIllIIlIIIIlIlIl, lIllllIlIlll[2])) {
            return new an(au.HESPORI, n.GROWING, (int)(lllllllllllllllIlIllIIlIIIIlIlIl - lIllllIlIlll[1]));
        }
        if (af.lllIlllIlIlIlI((int)lllllllllllllllIlIllIIlIIIIlIlIl, lIllllIlIlll[3]) && af.lllIlllIlIlIIl((int)lllllllllllllllIlIllIIlIIIIlIlIl, lIllllIlIlll[4])) {
            return new an(au.HESPORI, n.HARVESTABLE, (int)(lllllllllllllllIlIllIIlIIIIlIlIl - lIllllIlIlll[3]));
        }
        if (af.lllIlllIlIlIll((int)lllllllllllllllIlIllIIlIIIIlIlIl, lIllllIlIlll[5])) {
            return new an(au.WEEDS, n.GROWING, lIllllIlIlll[0]);
        }
        return null;
    }

    private static boolean lllIlllIlIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIlllIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    af(A a2, String string2, boolean bl) {
    }

    private static void lllIlllIlIIlll() {
        lIllllIlIlll = new int[6];
        af.lIllllIlIlll[0] = "   ".length();
        af.lIllllIlIlll[1] = 0x5A ^ 0x78 ^ (0x6F ^ 0x49);
        af.lIllllIlIlll[2] = 0x50 ^ 0x56;
        af.lIllllIlIlll[3] = 0x84 ^ 0x83;
        af.lIllllIlIlll[4] = 0x73 ^ 0x7B;
        af.lIllllIlIlll[5] = 149 + 3 - 30 + 39 ^ 135 + 160 - 253 + 126;
    }

    static {
        af.lllIlllIlIIlll();
    }

    private static boolean lllIlllIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlllIlIlIII(int n2) {
        return n2 >= 0;
    }
}

