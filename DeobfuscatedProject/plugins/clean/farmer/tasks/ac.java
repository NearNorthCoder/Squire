/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class ac
extends GameEnum19 {

    private static boolean llllIIllIllIIl(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIllIllIll(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ac.llllIIllIllIIl(n2) && ac.llllIIllIllIlI(n2, llIIIIlllIll[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIll[0] - n2);
        }
        if (ac.llllIIllIllIll((int)var1, llIIIIlllIll[1]) && ac.llllIIllIllIlI((int)var1, llIIIIlllIll[2])) {
            return new an(au.CRYSTAL_TREE, n.GROWING, (int)(var1 - llIIIIlllIll[1]));
        }
        if (ac.llllIIllIlllII((int)var1, llIIIIlllIll[3])) {
            return new an(au.CRYSTAL_TREE, n.GROWING, au.CRYSTAL_TREE.bc() - llIIIIlllIll[4]);
        }
        if (ac.llllIIllIlllII((int)var1, llIIIIlllIll[5])) {
            return new an(au.CRYSTAL_TREE, n.HARVESTABLE, llIIIIlllIll[6]);
        }
        return null;
    }

    static {
        ac.llllIIllIllIII();
    }

    private static boolean llllIIllIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIllIllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    ac(A a2, String string2, boolean bl) {
    }

}

