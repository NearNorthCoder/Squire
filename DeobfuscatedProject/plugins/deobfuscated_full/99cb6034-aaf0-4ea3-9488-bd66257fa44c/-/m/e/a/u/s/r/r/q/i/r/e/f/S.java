/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class S
extends P {
    private static /* synthetic */ int[] llIIIIIIIIll;

    private static boolean llllIIIIllIIlI(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (S.llllIIIIllIIlI(n2) && S.llllIIIIllIIll(n2, llIIIIIIIIll[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIIIll[0] - n2);
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[1]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIIIll[0]);
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[3]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[4])) {
            return new an(au.TEAK, n.GROWING, (int)(var1 - llIIIIIIIIll[3]));
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[5])) {
            return new an(au.TEAK, n.GROWING, au.TEAK.bc() - llIIIIIIIIll[6]);
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[7])) {
            return new an(au.TEAK, n.HARVESTABLE, llIIIIIIIIll[8]);
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[9])) {
            return new an(au.TEAK, n.HARVESTABLE, llIIIIIIIIll[8]);
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[10]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[11])) {
            return new an(au.TEAK, n.DISEASED, (int)(var1 - llIIIIIIIIll[9]));
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[12]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[13])) {
            return new an(au.TEAK, n.DEAD, (int)(var1 - llIIIIIIIIll[11]));
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[14]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[15])) {
            return new an(au.MAHOGANY, n.GROWING, (int)(var1 - llIIIIIIIIll[14]));
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[16])) {
            return new an(au.MAHOGANY, n.GROWING, au.MAHOGANY.bc() - llIIIIIIIIll[6]);
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[17])) {
            return new an(au.MAHOGANY, n.HARVESTABLE, llIIIIIIIIll[8]);
        }
        if (S.llllIIIIllIlIl((int)var1, llIIIIIIIIll[18])) {
            return new an(au.MAHOGANY, n.HARVESTABLE, llIIIIIIIIll[8]);
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[19]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[20])) {
            return new an(au.MAHOGANY, n.DISEASED, (int)(var1 - llIIIIIIIIll[18]));
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[21]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[22])) {
            return new an(au.MAHOGANY, n.DEAD, (int)(var1 - llIIIIIIIIll[20]));
        }
        if (S.llllIIIIllIlII((int)var1, llIIIIIIIIll[23]) && S.llllIIIIllIIll((int)var1, llIIIIIIIIll[24])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIIIll[0]);
        }
        return null;
    }

    S(A a2, String string2, boolean bl) {
    }

    private static boolean llllIIIIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIIIIllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void llllIIIIllIIIl() {
        llIIIIIIIIll = new int[25];
        S.llIIIIIIIIll[0] = 3;
        S.llIIIIIIIIll[1] = 7 ^ 0x6F ^ (0x35 ^ 0x59);
        S.llIIIIIIIIll[2] = 6 ^ 1;
        S.llIIIIIIIIll[3] = 0xA5 ^ 0xC5 ^ (0x7B ^ 0x13);
        S.llIIIIIIIIll[4] = 176 + 132 - 256 + 132 ^ 161 + 87 - 145 + 79;
        S.llIIIIIIIIll[5] = 0xB9 ^ 0xB6;
        S.llIIIIIIIIll[6] = 1;
        S.llIIIIIIIIll[7] = 0x8E ^ 0x9E;
        S.llIIIIIIIIll[8] = (0x2C ^ 0x67) & ~(0x5E ^ 0x15);
        S.llIIIIIIIIll[9] = 0x3E ^ 0x65 ^ (0xDC ^ 0x96);
        S.llIIIIIIIIll[10] = 0x54 ^ 0x3F ^ (0x35 ^ 0x4C);
        S.llIIIIIIIIll[11] = 0x19 ^ 0x7F ^ (0x6D ^ 0x1C);
        S.llIIIIIIIIll[12] = 0x41 ^ 0x59;
        S.llIIIIIIIIll[13] = 0x46 ^ 0x60 ^ (0xBB ^ 0x80);
        S.llIIIIIIIIll[14] = 10 + 166 - -5 + 0 ^ 14 + 25 - -27 + 105;
        S.llIIIIIIIIll[15] = 0x2D ^ 8;
        S.llIIIIIIIIll[16] = 0x2F ^ 0x18 ^ (0xB3 ^ 0xA2);
        S.llIIIIIIIIll[17] = 0xF0 ^ 0x87 ^ (0 ^ 0x50);
        S.llIIIIIIIIll[18] = 0xF9 ^ 0xBC ^ (0x4A ^ 0x27);
        S.llIIIIIIIIll[19] = 0x29 ^ 0;
        S.llIIIIIIIIll[20] = 4 ^ 0x2B;
        S.llIIIIIIIIll[21] = 0x20 ^ 0x76 ^ (0x33 ^ 0x55);
        S.llIIIIIIIIll[22] = 0xC6 ^ 0xC2 ^ (0x3F ^ 0xD);
        S.llIIIIIIIIll[23] = 15 + 181 - 109 + 153 ^ 28 + 157 - 130 + 144;
        S.llIIIIIIIIll[24] = (0x78 ^ 9) + (0xD8 ^ 0x8B) - -(0x1E ^ 0x17) + (0x2C ^ 0x1E);
    }

    private static boolean llllIIIIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        S.llllIIIIllIIIl();
    }
}

