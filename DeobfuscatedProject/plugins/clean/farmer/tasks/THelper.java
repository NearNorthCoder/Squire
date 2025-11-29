/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class THelper
extends GameEnum19 {

    static {
        T.lllIllIIlIlIll();
    }

    private static boolean lllIllIIlIllII(int n2) {
        return n2 >= 0;
    }

    THelper(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (T.lllIllIIlIllII(n2) && T.lllIllIIlIllIl(n2, lIlllIlIlllI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIlllI[0] - n2);
        }
        if (T.lllIllIIlIlllI((int)var1, lIlllIlIlllI[1]) && T.lllIllIIlIllIl((int)var1, lIlllIlIlllI[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIlllI[0]);
        }
        if (T.lllIllIIlIlllI((int)var1, lIlllIlIlllI[3]) && T.lllIllIIlIllIl((int)var1, lIlllIlIlllI[4])) {
            return new an(au.REDWOOD, n.GROWING, (int)(var1 - lIlllIlIlllI[3]));
        }
        if (T.lllIllIIlIllll((int)var1, lIlllIlIlllI[5])) {
            return new an(au.REDWOOD, n.HARVESTABLE, lIlllIlIlllI[6]);
        }
        if (T.lllIllIIlIlllI((int)var1, lIlllIlIlllI[7]) && T.lllIllIIlIllIl((int)var1, lIlllIlIlllI[8])) {
            return new an(au.REDWOOD, n.DISEASED, (int)(var1 - lIlllIlIlllI[5]));
        }
        if (T.lllIllIIlIlllI((int)var1, lIlllIlIlllI[9]) && T.lllIllIIlIllIl((int)var1, lIlllIlIlllI[10])) {
            return new an(au.REDWOOD, n.DEAD, (int)(var1 - lIlllIlIlllI[8]));
        }
        if (T.lllIllIIlIllll((int)var1, lIlllIlIlllI[11])) {
            return new an(au.REDWOOD, n.GROWING, au.REDWOOD.bc() - lIlllIlIlllI[12]);
        }
        if (T.lllIllIIlIlllI((int)var1, lIlllIlIlllI[13]) && T.lllIllIIlIllIl((int)var1, lIlllIlIlllI[14])) {
            return new an(au.REDWOOD, n.HARVESTABLE, lIlllIlIlllI[6]);
        }
        return null;
    }

    private static boolean lllIllIIlIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllIIlIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

