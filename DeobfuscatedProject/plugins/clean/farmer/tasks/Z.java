/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class Z
extends GameEnum19 {

    private static boolean lllIllIlIIlllI(int n2, int n3) {
        return n2 == n3;
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

