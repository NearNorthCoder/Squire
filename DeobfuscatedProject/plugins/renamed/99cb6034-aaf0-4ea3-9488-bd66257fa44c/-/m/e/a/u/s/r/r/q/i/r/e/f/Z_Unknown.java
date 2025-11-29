/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class Z_Unknown
extends HerbType {
    private static /* synthetic */ int[] lIlllIlllIll;

    private static boolean lllIllIlIIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllIllIlIIlIlI() {
        lIlllIlllIll = new int[18];
        Z.lIlllIlllIll[0] = 3;
        Z.lIlllIlllIll[1] = 0x4C ^ 0x48;
        Z.lIlllIlllIll[2] = 0xDA ^ 0x9A ^ (0x32 ^ 0x75);
        Z.lIlllIlllIll[3] = 0x77 ^ 0x7F;
        Z.lIlllIlllIll[4] = 0xDA ^ 0x97 ^ (0xD7 ^ 0x96);
        Z.lIlllIlllIll[5] = 77 + 83 - 154 + 125 ^ 57 + 109 - 39 + 15;
        Z.lIlllIlllIll[6] = 1;
        Z.lIlllIlllIll[7] = 0x81 ^ 0x8F;
        Z.lIlllIlllIll[8] = 0 ^ 4 ^ (0x8A ^ 0x9E);
        Z.lIlllIlllIll[9] = 0x95 ^ 0x84 ^ (0xA5 ^ 0xA9) & ~(0x90 ^ 0x9C);
        Z.lIlllIlllIll[10] = (0x48 ^ 0x30 ^ (5 ^ 0x1D)) & (0x73 ^ 0x65 ^ (0xF4 ^ 0x82) ^ -1);
        Z.lIlllIlllIll[11] = 37 + 152 - 129 + 123 ^ 141 + 40 - 86 + 70;
        Z.lIlllIlllIll[12] = 0x25 ^ 0x17 ^ (0x40 ^ 0x64);
        Z.lIlllIlllIll[13] = 0xFE ^ 0xA1 ^ (0x47 ^ 0xF);
        Z.lIlllIlllIll[14] = 0xAB ^ 0xB0;
        Z.lIlllIlllIll[15] = 0xD5 ^ 0x82 ^ (0x67 ^ 0x2C);
        Z.lIlllIlllIll[16] = 0x50 ^ 0x4D;
        Z.lIlllIlllIll[17] = 56 + 119 - 5 + 4 + (137 + 8 - 25 + 38) - (79 + 58 - 94 + 134) + (0x56 ^ 0x32);
    }

    Z(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (Z.lllIllIlIIlIll(n2) && Z.lllIllIlIIllII(n2, lIlllIlllIll[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlllIll[0] - n2);
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[1]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlllIll[0]);
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[3]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[4])) {
            return new an(au.CELASTRUS, n.GROWING, (int)(var1 - lIlllIlllIll[3]));
        }
        if (Z.lllIllIlIIlllI((int)var1, lIlllIlllIll[5])) {
            return new an(au.CELASTRUS, n.GROWING, au.CELASTRUS.bc() - lIlllIlllIll[6]);
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[7]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[8])) {
            return new an(au.CELASTRUS, n.HARVESTABLE, (int)(var1 - lIlllIlllIll[7]));
        }
        if (Z.lllIllIlIIlllI((int)var1, lIlllIlllIll[9])) {
            return new an(au.CELASTRUS, n.HARVESTABLE, lIlllIlllIll[10]);
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[11]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[12])) {
            return new an(au.CELASTRUS, n.DISEASED, (int)(var1 - lIlllIlllIll[9]));
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[13]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[14])) {
            return new an(au.CELASTRUS, n.DEAD, (int)(var1 - lIlllIlllIll[12]));
        }
        if (Z.lllIllIlIIlllI((int)var1, lIlllIlllIll[15])) {
            return new an(au.CELASTRUS, n.HARVESTABLE, lIlllIlllIll[10]);
        }
        if (Z.lllIllIlIIllIl((int)var1, lIlllIlllIll[16]) && Z.lllIllIlIIllII((int)var1, lIlllIlllIll[17])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlllIll[0]);
        }
        return null;
    }

    private static boolean lllIllIlIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIlIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIllIlIIlIll(int n2) {
        return n2 >= 0;
    }

    static {
        Z.lllIllIlIIlIlI();
    }
}

