/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class XHelper
extends GameEnum19 {

    XHelper(A a2, String string2, boolean bl) {
    }

    private static boolean llllIlIlIlllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIlIlIllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIlIlIlllIl(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (X.llllIlIlIlllIl(n2) && X.llllIlIlIllllI(n2, llIIIlIlllIl[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIlllIl[0] - n2);
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[1]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[2])) {
            return new an(au.SEAWEED, n.GROWING, (int)(var1 - llIIIlIlllIl[1]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[3]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[4])) {
            return new an(au.SEAWEED, n.HARVESTABLE, (int)(var1 - llIIIlIlllIl[3]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[5]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[6])) {
            return new an(au.SEAWEED, n.DISEASED, (int)(var1 - llIIIlIlllIl[4]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[7]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[8])) {
            return new an(au.SEAWEED, n.DEAD, (int)(var1 - llIIIlIlllIl[6]));
        }
        if (X.llllIlIlIlllll((int)var1, llIIIlIlllIl[9]) && X.llllIlIlIllllI((int)var1, llIIIlIlllIl[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIlllIl[0]);
        }
        return null;
    }

    static {
        X.llllIlIlIlllII();
    }
}

