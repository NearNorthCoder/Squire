/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class ad_Unknown
extends HerbType {
    private static /* synthetic */ int[] lIlllIIllIll;

    private static boolean lllIlIllllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ad.lllIlIllllIIll();
    }

    private static void lllIlIllllIIll() {
        lIlllIIllIll = new int[23];
        ad.lIlllIIllIll[0] = (147 + 170 - 227 + 143 ^ 103 + 101 - 55 + 33) & (0xED ^ 0xBE ^ (0x9B ^ 0x97) ^ -1);
        ad.lIlllIIllIll[1] = 1;
        ad.lIlllIIllIll[2] = 0xBE ^ 0xB1;
        ad.lIlllIIllIll[3] = 152 + 77 - 143 + 97 ^ 46 + 140 - 122 + 103;
        ad.lIlllIIllIll[4] = 0x20 ^ 0x3E;
        ad.lIlllIIllIll[5] = 0xA6 ^ 0xB9;
        ad.lIlllIIllIll[6] = 1 ^ (0x85 ^ 0xA4);
        ad.lIlllIIllIll[7] = 0x4F ^ 0x6E;
        ad.lIlllIIllIll[8] = 57 + 119 - 4 + 12 ^ 41 + 41 - 30 + 99;
        ad.lIlllIIllIll[9] = 0x5E ^ 0x39 ^ (0xFB ^ 0xAC);
        ad.lIlllIIllIll[10] = 0x85 ^ 0xBB;
        ad.lIlllIIllIll[11] = 0xD ^ 0x53;
        ad.lIlllIIllIll[12] = 0xB4 ^ 0xAD ^ (0xD4 ^ 0x92);
        ad.lIlllIIllIll[13] = 0xD7 ^ 0xBB ^ (0x4A ^ 0x46);
        ad.lIlllIIllIll[14] = 9 ^ 0x77;
        ad.lIlllIIllIll[15] = (0x33 ^ 0x49) + (0xCF ^ 0xA4) - (0x25 ^ 0x5C) + (0x11 ^ 4);
        ad.lIlllIIllIll[16] = 128 + 41 - 148 + 122;
        ad.lIlllIIllIll[17] = (0x20 ^ 0x13) + (61 + 41 - 35 + 61) - (0x24 ^ 0x44) + (7 ^ 0x3A);
        ad.lIlllIIllIll[18] = (0x9B ^ 0xB7) + (0xAB ^ 0xC0) - (0xEC ^ 0xB8) + (8 ^ 0x53);
        ad.lIlllIIllIll[19] = 52 + 0 - -107 + 0;
        ad.lIlllIIllIll[20] = 127 + 132 - 108 + 9;
        ad.lIlllIIllIll[21] = 31 + 133 - 121 + 133;
        ad.lIlllIIllIll[22] = 50 + 91 - 40 + 89;
    }

    private static boolean lllIlIllllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlIllllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIllllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ad.lllIlIllllIlII(n2)) {
            return new an(au.EMPTY_COMPOST_BIN, n.EMPTY, lIlllIIllIll[0]);
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[1]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[2])) {
            return new an(au.COMPOST, n.FILLING, (int)(var1 - lIlllIIllIll[1]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[3]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[4])) {
            return new an(au.COMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[3]));
        }
        if (!ad.lllIlIllllIlll((int)var1, lIlllIIllIll[5]) || ad.lllIlIlllllIII((int)var1, lIlllIIllIll[6])) {
            return new an(au.COMPOST, n.GROWING, (int)(var1 - lIlllIIllIll[5]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[7]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[8])) {
            return new an(au.SUPERCOMPOST, n.FILLING, (int)(var1 - lIlllIIllIll[7]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[9]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[10])) {
            return new an(au.SUPERCOMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[9]));
        }
        if (ad.lllIlIlllllIII((int)var1, lIlllIIllIll[11])) {
            return new an(au.COMPOST, n.GROWING, au.COMPOST.bc() - lIlllIIllIll[1]);
        }
        if (!ad.lllIlIllllIlll((int)var1, lIlllIIllIll[12]) || ad.lllIlIlllllIII((int)var1, lIlllIIllIll[13])) {
            return new an(au.SUPERCOMPOST, n.GROWING, (int)(var1 - lIlllIIllIll[12]));
        }
        if (ad.lllIlIlllllIII((int)var1, lIlllIIllIll[14])) {
            return new an(au.SUPERCOMPOST, n.GROWING, au.SUPERCOMPOST.bc() - lIlllIIllIll[1]);
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[15]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[16])) {
            return new an(au.ROTTEN_TOMATO, n.FILLING, (int)(var1 - lIlllIIllIll[15]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[17]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[18])) {
            return new an(au.ROTTEN_TOMATO, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[17]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[19]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[20])) {
            return new an(au.ROTTEN_TOMATO, n.GROWING, (int)(var1 - lIlllIIllIll[19]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[21]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[22])) {
            return new an(au.ULTRACOMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[21]));
        }
        return null;
    }

    ad(A a2, String string2, boolean bl) {
    }
}

