/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class QHelper
extends GameEnum19 {

    private static boolean llllIlIIIIIllI(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIlIIIIIlll(int n2, int n3) {
        return n2 <= n3;
    }

    QHelper(A a2, String string2, boolean bl) {
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

