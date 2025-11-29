/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class U
extends GameEnum19 {

    private static boolean llllIIIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIIIIllllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (U.llllIIIIIllIll(n2) && U.llllIIIIIlllII(n2, lIlllllllIII[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0] - n2);
        }
        if (U.llllIIIIIlllIl((int)var1, lIlllllllIII[1]) && U.llllIIIIIlllII((int)var1, lIlllllllIII[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0]);
        }
        if (U.llllIIIIIlllIl((int)var1, lIlllllllIII[3]) && U.llllIIIIIlllII((int)var1, lIlllllllIII[4])) {
            return new an(au.SPIRIT_TREE, n.GROWING, (int)(var1 - lIlllllllIII[3]));
        }
        if (U.llllIIIIIllllI((int)var1, lIlllllllIII[5])) {
            return new an(au.SPIRIT_TREE, n.GROWING, lIlllllllIII[6]);
        }
        if (U.llllIIIIIlllIl((int)var1, lIlllllllIII[7]) && U.llllIIIIIlllII((int)var1, lIlllllllIII[8])) {
            return new an(au.SPIRIT_TREE, n.DISEASED, (int)(var1 - lIlllllllIII[5]));
        }
        if (U.llllIIIIIlllIl((int)var1, lIlllllllIII[9]) && U.llllIIIIIlllII((int)var1, lIlllllllIII[10])) {
            return new an(au.SPIRIT_TREE, n.DEAD, (int)(var1 - lIlllllllIII[8]));
        }
        if (U.llllIIIIIllllI((int)var1, lIlllllllIII[11])) {
            return new an(au.SPIRIT_TREE, n.GROWING, au.SPIRIT_TREE.bc() - lIlllllllIII[12]);
        }
        if (U.llllIIIIIlllIl((int)var1, lIlllllllIII[13]) && U.llllIIIIIlllII((int)var1, lIlllllllIII[14])) {
            return new an(au.WEEDS, n.GROWING, lIlllllllIII[0]);
        }
        return null;
    }

    private static boolean llllIIIIIllIll(int n2) {
        return n2 >= 0;
    }

    static {
        U.llllIIIIIllIlI();
    }

    U(A a2, String string2, boolean bl) {
    }

    private static boolean llllIIIIIlllII(int n2, int n3) {
        return n2 <= n3;
    }
}

