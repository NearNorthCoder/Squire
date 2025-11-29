/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class S
extends GameEnum19 {

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

    private static boolean llllIIIIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        S.llllIIIIllIIIl();
    }
}

