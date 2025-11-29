/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class aa_Unknown
extends HerbType {
    private static /* synthetic */ int[] lIlllIlIIIlI;

    static {
        aa.lllIllIIIIlIll();
    }

    private static void lllIllIIIIlIll() {
        lIlllIlIIIlI = new int[8];
        aa.lIlllIlIIIlI[0] = 1;
        aa.lIlllIlIIIlI[1] = 3;
        aa.lIlllIlIIIlI[2] = 2;
        aa.lIlllIlIIIlI[3] = 72 + 67 - 77 + 107 ^ 99 + 29 - 25 + 57;
        aa.lIlllIlIIIlI[4] = 0x77 ^ 0x1E ^ (0x38 ^ 0x5B);
        aa.lIlllIlIIIlI[5] = 0x29 ^ 0x3E ^ (0x95 ^ 0x85);
        aa.lIlllIlIIIlI[6] = 0xDE ^ 0x97 ^ (0x3D ^ 0x7F);
        aa.lIlllIlIIIlI[7] = 0x7F ^ 0x70;
    }

    private static boolean lllIllIIIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIIIllII(int n2) {
        return n2 >= 0;
    }

    aa(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (aa.lllIllIIIIllII(n2) && aa.lllIllIIIIllIl(n2, lIlllIlIIIlI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIIIlI[1]);
        }
        if (aa.lllIllIIIIlllI((int)var1, lIlllIlIIIlI[2]) && aa.lllIllIIIIllIl((int)var1, lIlllIlIIIlI[3])) {
            return new an(au.GRAPE, n.GROWING, (int)(var1 - lIlllIlIIIlI[2]));
        }
        if (aa.lllIllIIIIllll((int)var1, lIlllIlIIIlI[4])) {
            return new an(au.GRAPE, n.GROWING, lIlllIlIIIlI[5]);
        }
        if (aa.lllIllIIIIlllI((int)var1, lIlllIlIIIlI[6]) && aa.lllIllIIIIllIl((int)var1, lIlllIlIIIlI[7])) {
            return new an(au.GRAPE, n.HARVESTABLE, (int)(var1 - lIlllIlIIIlI[6]));
        }
        return null;
    }

    private static boolean lllIllIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

