/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class ae
extends P {
    private static /* synthetic */ int[] lIlllllIIIll;

    private static boolean lllIllllIIllIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ae.lllIllllIIllIl(n2)) {
            return new an(au.EMPTY_GIANT_COMPOST_BIN, n.EMPTY, lIlllllIIIll[0]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[1]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[2])) {
            return new an(au.GIANT_COMPOST, n.FILLING, (int)(var1 - lIlllllIIIll[1]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[3]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[4])) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[3]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[5]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[6])) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, (int)(var1 - lIlllllIIIll[5]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[7]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[8])) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[7]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[9]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[10])) {
            return new an(au.GIANT_COMPOST, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[9]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[11]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[12])) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[11]);
        }
        if (ae.lllIllllIlIIII((int)var1, lIlllllIIIll[13])) {
            return new an(au.GIANT_COMPOST, n.GROWING, au.GIANT_COMPOST.bc() - lIlllllIIIll[1]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[14]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[15])) {
            return new an(au.GIANT_SUPERCOMPOST, n.GROWING, (int)(var1 - lIlllllIIIll[14]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[16]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[17])) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[16]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[18]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[19])) {
            return new an(au.GIANT_COMPOST, n.GROWING, (int)(var1 - lIlllllIIIll[18]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[20]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[21])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, (int)(var1 - lIlllllIIIll[20]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[22]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[23])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[22]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[24]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[25])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, (int)(var1 - lIlllllIIIll[24]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[26]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[27])) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[26]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[28]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[29])) {
            return new an(au.GIANT_ULTRACOMPOST, n.HARVESTABLE, (int)(var1 - lIlllllIIIll[28]));
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[30]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[31])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, lIlllllIIIll[2] + var1 - lIlllllIIIll[30]);
        }
        if (ae.lllIllllIlIIII((int)var1, lIlllllIIIll[32])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, au.GIANT_ROTTEN_TOMATO.bc() - lIlllllIIIll[1]);
        }
        if (ae.lllIllllIIlllI((int)var1, lIlllllIIIll[33]) && ae.lllIllllIIllll((int)var1, lIlllllIIIll[34])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, lIlllllIIIll[2] + var1 - lIlllllIIIll[33]);
        }
        return null;
    }

    private static boolean lllIllllIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    ae(A a2, String string2, boolean bl) {
    }

    private static boolean lllIllllIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lllIllllIIllII() {
        lIlllllIIIll = new int[35];
        ae.lIlllllIIIll[0] = (0xD3 ^ 0x96) & ~(0x12 ^ 0x57);
        ae.lIlllllIIIll[1] = 1;
        ae.lIlllllIIIll[2] = 0x1B ^ 0x53 ^ (6 ^ 0x41);
        ae.lIlllllIIIll[3] = 0x2E ^ 0x3E;
        ae.lIlllllIIIll[4] = 143 + 8 - -3 + 65 ^ 17 + 47 - -69 + 64;
        ae.lIlllllIIIll[5] = 74 + 101 - 137 + 118 ^ 49 + 43 - 80 + 177;
        ae.lIlllllIIIll[6] = 3 ^ 0x2C;
        ae.lIlllllIIIll[7] = 0x41 ^ 0x71;
        ae.lIlllllIIIll[8] = 0x9F ^ 0xAD ^ (0x35 ^ 0x39);
        ae.lIlllllIIIll[9] = 0x97 ^ 0xA8;
        ae.lIlllllIIIll[10] = 0x6E ^ 0x23;
        ae.lIlllllIIIll[11] = 0xFE ^ 0x87 ^ (0x7E ^ 0x49);
        ae.lIlllllIIIll[12] = 200 + 21 - 186 + 179 ^ 78 + 97 - 89 + 52;
        ae.lIlllllIIIll[13] = 0x58 ^ 0x60 ^ (0x37 ^ 0x52);
        ae.lIlllllIIIll[14] = 0xEC ^ 0x8D;
        ae.lIlllllIIIll[15] = 0x46 ^ 0x6E ^ (0xC8 ^ 0x83);
        ae.lIlllllIIIll[16] = 0x29 ^ 0x4D;
        ae.lIlllllIIIll[17] = 149 + 96 - 172 + 103 ^ 159 + 123 - 186 + 98;
        ae.lIlllllIIIll[18] = 102 + 50 - 59 + 34;
        ae.lIlllllIIIll[19] = (0x23 ^ 0x41) + (0x4A ^ 0x21) - (0x76 ^ 8) + (0xB0 ^ 0x81);
        ae.lIlllllIIIll[20] = (0x9B ^ 0x82) + (0x5B ^ 0x17) - (0x9D ^ 0x80) + (0xBA ^ 0x83);
        ae.lIlllllIIIll[21] = (0x66 ^ 0x37) + 2 - -(0x33 ^ 0x22) + (7 ^ 0x2C);
        ae.lIlllllIIIll[22] = 23 + 114 - 106 + 113;
        ae.lIlllllIIIll[23] = (0xC3 ^ 0x86) + (0xB4 ^ 0x9D) - (0x14 ^ 0x7E) + (24 + 22 - 40 + 148);
        ae.lIlllllIIIll[24] = 70 + 7 - -42 + 11 + (0xA4 ^ 0x8F) - (0xEF ^ 0x81) + (0xDA ^ 0xBA);
        ae.lIlllllIIIll[25] = (0x9D ^ 0xB2) + (0xEC ^ 0xC5) - (0x9A ^ 0xB0) + (0x2D ^ 0x5F);
        ae.lIlllllIIIll[26] = (0xF5 ^ 0xBF) + (114 + 7 - 10 + 39) - (0x59 ^ 8) + (0x71 ^ 0x63);
        ae.lIlllllIIIll[27] = 80 + 161 - 162 + 96;
        ae.lIlllllIIIll[28] = 32 + 20 - -32 + 92;
        ae.lIlllllIIIll[29] = (0x95 ^ 0x91) + (0xBE ^ 0xC2) - (0x8E ^ 0xC5) + (61 + 7 - 36 + 120);
        ae.lIlllllIIIll[30] = (0x21 ^ 0x5D) + (0x21 ^ 0x4A) - (185 + 185 - 189 + 48) + (114 + 63 - 77 + 105);
        ae.lIlllllIIIll[31] = 83 + 204 - 218 + 152;
        ae.lIlllllIIIll[32] = 205 + 76 - 219 + 160;
        ae.lIlllllIIIll[33] = 192 + 19 - 160 + 172;
        ae.lIlllllIIIll[34] = (0x2E ^ 0x6F) + (53 + 116 - 145 + 138) - (0x52 ^ 0x6D) + (0x37 ^ 0x7E);
    }

    static {
        ae.lllIllllIIllII();
    }

    private static boolean lllIllllIlIIII(int n2, int n3) {
        return n2 == n3;
    }
}

