/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class AFHelper
extends GameEnum19 {

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (af.lllIlllIlIlIII(n2) && af.lllIlllIlIlIIl(n2, lIllllIlIlll[0])) {
            return new an(au.WEEDS, n.GROWING, lIllllIlIlll[0] - n2);
        }
        if (af.lllIlllIlIlIlI((int)var1, lIllllIlIlll[1]) && af.lllIlllIlIlIIl((int)var1, lIllllIlIlll[2])) {
            return new an(au.HESPORI, n.GROWING, (int)(var1 - lIllllIlIlll[1]));
        }
        if (af.lllIlllIlIlIlI((int)var1, lIllllIlIlll[3]) && af.lllIlllIlIlIIl((int)var1, lIllllIlIlll[4])) {
            return new an(au.HESPORI, n.HARVESTABLE, (int)(var1 - lIllllIlIlll[3]));
        }
        if (af.lllIlllIlIlIll((int)var1, lIllllIlIlll[5])) {
            return new an(au.WEEDS, n.GROWING, lIllllIlIlll[0]);
        }
        return null;
    }

    private static boolean lllIlllIlIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIlllIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    AFHelper(A a2, String string2, boolean bl) {
    }

    static {
        af.lllIlllIlIIlll();
    }

    private static boolean lllIlllIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlllIlIlIII(int n2) {
        return n2 >= 0;
    }
}

