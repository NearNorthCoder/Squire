/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class Y
extends GameEnum19 {

    private static boolean llllIlIIIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIlIIIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (Y.llllIlIIIIIIIl(n2) && Y.llllIlIIIIIIlI(n2, llIIIlIIIllI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIIllI[0] - n2);
        }
        if (Y.llllIlIIIIIIll((int)var1, llIIIlIIIllI[1]) && Y.llllIlIIIIIIlI((int)var1, llIIIlIIIllI[2])) {
            return new an(au.CALQUAT, n.GROWING, (int)(var1 - llIIIlIIIllI[1]));
        }
        if (Y.llllIlIIIIIIll((int)var1, llIIIlIIIllI[3]) && Y.llllIlIIIIIIlI((int)var1, llIIIlIIIllI[4])) {
            return new an(au.CALQUAT, n.HARVESTABLE, (int)(var1 - llIIIlIIIllI[3]));
        }
        if (Y.llllIlIIIIIIll((int)var1, llIIIlIIIllI[5]) && Y.llllIlIIIIIIlI((int)var1, llIIIlIIIllI[6])) {
            return new an(au.CALQUAT, n.DISEASED, (int)(var1 - llIIIlIIIllI[4]));
        }
        if (Y.llllIlIIIIIIll((int)var1, llIIIlIIIllI[7]) && Y.llllIlIIIIIIlI((int)var1, llIIIlIIIllI[8])) {
            return new an(au.CALQUAT, n.DEAD, (int)(var1 - llIIIlIIIllI[6]));
        }
        if (Y.llllIlIIIIIlII((int)var1, llIIIlIIIllI[9])) {
            return new an(au.CALQUAT, n.GROWING, au.CALQUAT.bc() - llIIIlIIIllI[10]);
        }
        if (Y.llllIlIIIIIIll((int)var1, llIIIlIIIllI[11]) && Y.llllIlIIIIIIlI((int)var1, llIIIlIIIllI[12])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIIIllI[0]);
        }
        return null;
    }

    static {
        Y.llllIlIIIIIIII();
    }

    private static boolean llllIlIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIlIIIIIIIl(int n2) {
        return n2 >= 0;
    }

    Y(A a2, String string2, boolean bl) {
    }
}

