/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class aa
extends GameEnum19 {

    static {
        aa.lllIllIIIIlIll();
    }

    private static boolean lllIllIIIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIIIllII(int n2) {
        return n2 >= 0;
    }

    aa(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (aa.lllIllIIIIllII(n2) && aa.lllIllIIIIllIl(n2, lIlllIlIIIlI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIlIIIlI[1]);
        }
        if (aa.lllIllIIIIlllI((int)var1, lIlllIlIIIlI[2]) && aa.lllIllIIIIllIl((int)var1, lIlllIlIIIlI[3])) {
            return new an(au.GRAPE, n.GROWING, (int)(var1 - lIlllIlIIIlI[2]));
        }
        if (aa.lllIllIIIIllll((int)var1, lIlllIlIIIlI[4])) {
            return new an(au.GRAPE, n.GROWING, lIlllIlIIIlI[5]);
        }
        if (aa.lllIllIIIIlllI((int)var1, lIlllIlIIIlI[6]) && aa.lllIllIIIIllIl((int)var1, lIlllIlIIIlI[7])) {
            return new an(au.GRAPE, n.HARVESTABLE, (int)(var1 - lIlllIlIIIlI[6]));
        }
        return null;
    }

    private static boolean lllIllIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }
}

