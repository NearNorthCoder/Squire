/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class Q
extends P {
    private static /* synthetic */ int[] llIIIlIIlIII;

    private static boolean llllIlIIIIIllI(int n2) {
        return n2 >= 0;
    }

    private static void llllIlIIIIIlIl() {
        llIIIlIIlIII = new int[11];
        Q.llIIIlIIlIII[0] = 3;
        Q.llIIIlIIlIII[1] = 41 + 30 - 55 + 128 ^ 2 + 114 - 42 + 74;
        Q.llIIIlIIlIII[2] = 0x46 ^ 0x41;
        Q.llIIIlIIlIII[3] = 65 + 7 - 12 + 86 ^ 24 + 91 - 33 + 72;
        Q.llIIIlIIlIII[4] = (0xE4 ^ 0x86) & ~(0x77 ^ 0x15);
        Q.llIIIlIIlIII[5] = 0x1F ^ 0x16;
        Q.llIIIlIIlIII[6] = 93 + 85 - 77 + 31 ^ 6 + 13 - -119 + 5;
        Q.llIIIlIIlIII[7] = 27 + 45 - -58 + 52 ^ 175 + 149 - 321 + 183;
        Q.llIIIlIIlIII[8] = 0x9B ^ 0x95;
        Q.llIIIlIIlIII[9] = 0x6C ^ 0x33 ^ (0x79 ^ 0x29);
        Q.llIIIlIIlIII[10] = 173 + 116 - 61 + 27;
    }

    private static boolean llllIlIIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    Q(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (Q.llllIlIIIIIllI(n2) && Q.llllIlIIIIIlll(n2, llIIIlIIlIII[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIlIII[0] - n2);
        }
        if (Q.llllIlIIIIlIII((int)var1, llIIIlIIlIII[1]) && Q.llllIlIIIIIlll((int)var1, llIIIlIIlIII[2])) {
            return new an(au.BELLADONNA, n.GROWING, (int)(var1 - llIIIlIIlIII[1]));
        }
        if (Q.llllIlIIIIlIIl((int)var1, llIIIlIIlIII[3])) {
            return new an(au.BELLADONNA, n.HARVESTABLE, llIIIlIIlIII[4]);
        }
        if (Q.llllIlIIIIlIII((int)var1, llIIIlIIlIII[5]) && Q.llllIlIIIIIlll((int)var1, llIIIlIIlIII[6])) {
            return new an(au.BELLADONNA, n.DISEASED, (int)(var1 - llIIIlIIlIII[3]));
        }
        if (Q.llllIlIIIIlIII((int)var1, llIIIlIIlIII[7]) && Q.llllIlIIIIIlll((int)var1, llIIIlIIlIII[8])) {
            return new an(au.BELLADONNA, n.DEAD, (int)(var1 - llIIIlIIlIII[6]));
        }
        if (Q.llllIlIIIIlIII((int)var1, llIIIlIIlIII[9]) && Q.llllIlIIIIIlll((int)var1, llIIIlIIlIII[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIlIII[0]);
        }
        return null;
    }

    static {
        Q.llllIlIIIIIlIl();
    }

    private static boolean llllIlIIIIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }
}

