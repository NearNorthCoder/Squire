/*
 * Decompiled with CFR 0.152.
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.NEnum;

final class ac_Unknown
extends HerbType {
    private static /* synthetic */ int[] llIIIIlllIll;

    private static boolean llllIIllIllIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIllIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ac.llllIIllIllIIl(n2) && ac.llllIIllIllIlI(n2, llIIIIlllIll[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIll[0] - n2);
        }
        if (ac.llllIIllIllIll((int)var1, llIIIIlllIll[1]) && ac.llllIIllIllIlI((int)var1, llIIIIlllIll[2])) {
            return new an(au.CRYSTAL_TREE, n.GROWING, (int)(var1 - llIIIIlllIll[1]));
        }
        if (ac.llllIIllIlllII((int)var1, llIIIIlllIll[3])) {
            return new an(au.CRYSTAL_TREE, n.GROWING, au.CRYSTAL_TREE.bc() - llIIIIlllIll[4]);
        }
        if (ac.llllIIllIlllII((int)var1, llIIIIlllIll[5])) {
            return new an(au.CRYSTAL_TREE, n.HARVESTABLE, llIIIIlllIll[6]);
        }
        return null;
    }

    static {
        ac.llllIIllIllIII();
    }

    private static boolean llllIIllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIllIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    ac(A a2, String string2, boolean bl) {
    }

    private static void llllIIllIllIII() {
        llIIIIlllIll = new int[7];
        ac.llIIIIlllIll[0] = 3;
        ac.llIIIIlllIll[1] = 0x4C ^ 0x44;
        ac.llIIIIlllIll[2] = 0x6D ^ 0x60;
        ac.llIIIIlllIll[3] = 0x6A ^ 0x64;
        ac.llIIIIlllIll[4] = 1;
        ac.llIIIIlllIll[5] = 0x1F ^ 0x10 ^ (0x9C ^ 0xAF) & ~(0x2F ^ 0x1C);
        ac.llIIIIlllIll[6] = (4 ^ 0x1F) & ~(0xB6 ^ 0xAD);
    }
}

