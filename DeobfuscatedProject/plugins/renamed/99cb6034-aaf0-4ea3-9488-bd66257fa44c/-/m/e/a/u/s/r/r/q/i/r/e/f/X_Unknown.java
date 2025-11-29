/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class X_Unknown
extends HerbType {
    private static /* synthetic */ int[] llIIIlIlllIl;

    X(A a2, String string2, boolean bl) {
    }

    private static boolean llllIlIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlIlIlllIl(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (X.llllIlIlIlllIl(n2) && X.llllIlIlIllllI(n2, llIIIlIlllIl[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIlllIl[0] - n2);
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[1]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[2])) {
            return new an(au.SEAWEED, n.GROWING, (int)(var1 - llIIIlIlllIl[1]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[3]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[4])) {
            return new an(au.SEAWEED, n.HARVESTABLE, (int)(var1 - llIIIlIlllIl[3]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[5]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[6])) {
            return new an(au.SEAWEED, n.DISEASED, (int)(var1 - llIIIlIlllIl[4]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[7]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[8])) {
            return new an(au.SEAWEED, n.DEAD, (int)(var1 - llIIIlIlllIl[6]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[9]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIlllIl[0]);
        }
        return null;
    }

    private static void llllIlIlIlllII() {
        llIIIlIlllIl = new int[11];
        X.llIIIlIlllIl[0] = 3;
        X.llIIIlIlllIl[1] = 3 ^ 7;
        X.llIIIlIlllIl[2] = 182 + 188 - 259 + 82 ^ 2 + 70 - 24 + 150;
        X.llIIIlIlllIl[3] = 0x10 ^ 0x2C ^ (0x40 ^ 0x74);
        X.llIIIlIlllIl[4] = 0x6E ^ 0x64;
        X.llIIIlIlllIl[5] = 0xA2 ^ 0xA9;
        X.llIIIlIlllIl[6] = 0x72 ^ 0x7F;
        X.llIIIlIlllIl[7] = 9 ^ 7;
        X.llIIIlIlllIl[8] = 0xBD ^ 0xAD;
        X.llIIIlIlllIl[9] = 0xEC ^ 0x86 ^ (0x20 ^ 0x5B);
        X.llIIIlIlllIl[10] = 14 + 35 - -28 + 178;
    }

    static {
        X.llllIlIlIlllII();
    }
}

