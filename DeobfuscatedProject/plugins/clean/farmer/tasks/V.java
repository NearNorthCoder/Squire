/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class V
extends GameEnum19 {

    private static boolean llllIIIllIllll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        V.llllIIIllIllIl();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (V.llllIIIllIlllI(n2) && V.llllIIIllIllll(n2, llIIIIIllIlI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0] - n2);
        }
        if (V.llllIIIlllIIII((int)var1, llIIIIIllIlI[1]) && V.llllIIIllIllll((int)var1, llIIIIIllIlI[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0]);
        }
        if (V.llllIIIlllIIII((int)var1, llIIIIIllIlI[3]) && V.llllIIIllIllll((int)var1, llIIIIIllIlI[4])) {
            return new an(au.ATTAS, n.GROWING, (int)(var1 - llIIIIIllIlI[3]));
        }
        if (V.llllIIIlllIIII((int)var1, llIIIIIllIlI[5]) && V.llllIIIllIllll((int)var1, llIIIIIllIlI[6])) {
            return new an(au.IASOR, n.GROWING, (int)(var1 - llIIIIIllIlI[5]));
        }
        if (V.llllIIIlllIIII((int)var1, llIIIIIllIlI[7]) && V.llllIIIllIllll((int)var1, llIIIIIllIlI[8])) {
            return new an(au.KRONOS, n.GROWING, (int)(var1 - llIIIIIllIlI[7]));
        }
        if (V.llllIIIlllIIII((int)var1, llIIIIIllIlI[9]) && V.llllIIIllIllll((int)var1, llIIIIIllIlI[10])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIllIlI[0]);
        }
        return null;
    }

    private static boolean llllIIIllIlllI(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIIlllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    V(A a2, String string2, boolean bl) {
    }
}

