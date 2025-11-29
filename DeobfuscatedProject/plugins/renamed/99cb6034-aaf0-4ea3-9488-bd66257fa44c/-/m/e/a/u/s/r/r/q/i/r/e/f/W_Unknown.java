/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class W_Unknown
extends HerbType {
    private static /* synthetic */ int[] lIlllIIlIllI;

    private static boolean lllIlIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lllIlIlllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    W(A a2, String string2, boolean bl) {
    }

    private static boolean lllIlIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (W.lllIlIlllIIIII(n2) && W.lllIlIlllIIIIl(n2, lIlllIIlIllI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0] - n2);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[1]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[3]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[4])) {
            return new an(au.CACTUS, n.GROWING, (int)(var1 - lIlllIIlIllI[3]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[5]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[6])) {
            return new an(au.CACTUS, n.HARVESTABLE, (int)(var1 - lIlllIIlIllI[5]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[7]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[8])) {
            return new an(au.CACTUS, n.DISEASED, (int)(var1 - lIlllIIlIllI[6]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[9]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[10])) {
            return new an(au.CACTUS, n.DEAD, (int)(var1 - lIlllIIlIllI[8]));
        }
        if (W.lllIlIlllIIIll((int)var1, lIlllIIlIllI[11])) {
            return new an(au.CACTUS, n.GROWING, au.CACTUS.bc() - lIlllIIlIllI[12]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[13]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[14])) {
            return new an(au.POTATO_CACTUS, n.GROWING, (int)(var1 - lIlllIIlIllI[13]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[15]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[16])) {
            return new an(au.POTATO_CACTUS, n.HARVESTABLE, (int)(var1 - lIlllIIlIllI[15]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[17]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[18])) {
            return new an(au.POTATO_CACTUS, n.DISEASED, (int)(var1 - lIlllIIlIllI[16]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[19]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[20])) {
            return new an(au.POTATO_CACTUS, n.DEAD, (int)(var1 - lIlllIIlIllI[18]));
        }
        if (W.lllIlIlllIIIll((int)var1, lIlllIIlIllI[21])) {
            return new an(au.POTATO_CACTUS, n.GROWING, au.POTATO_CACTUS.bc() - lIlllIIlIllI[12]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[22]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[23])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0]);
        }
        return null;
    }

    private static boolean lllIlIlllIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIlIllIlllll() {
        lIlllIIlIllI = new int[24];
        W.lIlllIIlIllI[0] = 3;
        W.lIlllIIlIllI[1] = 0x67 ^ 0x63;
        W.lIlllIIlIllI[2] = 46 + 95 - 50 + 47 ^ 61 + 107 - 138 + 111;
        W.lIlllIIlIllI[3] = 0x7E ^ 0x76;
        W.lIlllIIlIllI[4] = 0x63 ^ 0x6D;
        W.lIlllIIlIllI[5] = 0x25 ^ 0x7E ^ (0x68 ^ 0x3C);
        W.lIlllIIlIllI[6] = 0x36 ^ 0x5F ^ (0x48 ^ 0x33);
        W.lIlllIIlIllI[7] = 0xB3 ^ 0xA0;
        W.lIlllIIlIllI[8] = 43 + 110 - 144 + 150 ^ 132 + 130 - 174 + 47;
        W.lIlllIIlIllI[9] = 0xB6 ^ 0xAD ^ 2;
        W.lIlllIIlIllI[10] = 0xB ^ 0x15;
        W.lIlllIIlIllI[11] = 0x26 ^ 0x39;
        W.lIlllIIlIllI[12] = 1;
        W.lIlllIIlIllI[13] = 0x26 ^ 6;
        W.lIlllIIlIllI[14] = 0x57 ^ 0x71;
        W.lIlllIIlIllI[15] = 0x5D ^ 0x7A;
        W.lIlllIIlIllI[16] = 0xA0 ^ 0x8D;
        W.lIlllIIlIllI[17] = 0x63 ^ 0x4D;
        W.lIlllIIlIllI[18] = 127 + 28 - 81 + 94 ^ 64 + 6 - 21 + 106;
        W.lIlllIIlIllI[19] = 0x29 ^ 0x1D;
        W.lIlllIIlIllI[20] = 1 ^ (0xA1 ^ 0x99);
        W.lIlllIIlIllI[21] = 1 ^ 0x3B;
        W.lIlllIIlIllI[22] = 0xB8 ^ 0x83;
        W.lIlllIIlIllI[23] = 184 + 101 - 162 + 68 + (0x9C ^ 0x9A) - (0x76 ^ 0xF) + (54 + 88 - 46 + 83);
    }

    static {
        W.lllIlIllIlllll();
    }
}

