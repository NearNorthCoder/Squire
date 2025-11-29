/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.A;
import -.m.e.a.u.s.r.r.q.i.r.e.f.P;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import -.m.e.a.u.s.r.r.q.i.r.e.f.au;
import -.m.e.a.u.s.r.r.q.i.r.e.f.n;

final class ab
extends P {
    private static /* synthetic */ int[] llIIIllIIllI;

    private static boolean llllIlIllllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llllIlIllllIII() {
        llIIIllIIllI = new int[11];
        ab.llIIIllIIllI[0] = 3;
        ab.llIIIllIIllI[1] = 132 + 141 - 210 + 88 ^ 83 + 111 - 168 + 121;
        ab.llIIIllIIllI[2] = 8 ^ 0x3D ^ (0xB5 ^ 0x89);
        ab.llIIIllIIllI[3] = 0x2D ^ 0x15 ^ (0x87 ^ 0xB5);
        ab.llIIIllIIllI[4] = 0x5A ^ 0x30 ^ (0xFB ^ 0x9E);
        ab.llIIIllIIllI[5] = 0x2B ^ 0x74 ^ (0xD4 ^ 0x9B);
        ab.llIIIllIIllI[6] = 1 ^ (0x85 ^ 0x90);
        ab.llIIIllIIllI[7] = 0xE7 ^ 0x9F ^ (0x65 ^ 8);
        ab.llIIIllIIllI[8] = 178 + 159 - 120 + 0 ^ 163 + 55 - 208 + 182;
        ab.llIIIllIIllI[9] = 0x10 ^ 0xA;
        ab.llIIIllIIllI[10] = 37 + 71 - -47 + 2 + (0x51 ^ 0x2D) - (128 + 137 - 126 + 3) + (0x26 ^ 0x52);
    }

    private static boolean llllIlIllllIIl(int n2) {
        return n2 >= 0;
    }

    ab(A a2, String string2, boolean bl) {
    }

    private static boolean llllIlIllllIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ab.llllIlIllllIIl(n2) && ab.llllIlIllllIlI(n2, llIIIllIIllI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIllIIllI[0] - n2);
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[1]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[2])) {
            return new an(au.MUSHROOM, n.GROWING, (int)(var1 - llIIIllIIllI[1]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[3]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[4])) {
            return new an(au.MUSHROOM, n.HARVESTABLE, (int)(var1 - llIIIllIIllI[3]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[5]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[6])) {
            return new an(au.MUSHROOM, n.DISEASED, (int)(var1 - llIIIllIIllI[4]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[7]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[8])) {
            return new an(au.MUSHROOM, n.DEAD, (int)(var1 - llIIIllIIllI[6]));
        }
        if (ab.llllIlIllllIll((int)var1, llIIIllIIllI[9]) && ab.llllIlIllllIlI((int)var1, llIIIllIIllI[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIllIIllI[0]);
        }
        return null;
    }

    static {
        ab.llllIlIllllIII();
    }
}

