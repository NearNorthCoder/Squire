/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ac
extends GameEnum10 {

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var2;
        if ((n2 >= 0) && (n2 <= 0)) {
            return new an(au.WEEDS, n.GROWING, 0 - n2);
        }
        if (((int)var2 >= 1) && ((int)var2 <= 2)) {
            return new an(au.CRYSTAL_TREE, n.GROWING, (int)(var2 - 1));
        }
        if (((int)var2 == 3)) {
            return new an(au.CRYSTAL_TREE, n.GROWING, au.CRYSTAL_TREE.bc() - 4);
        }
        if (((int)var2 == 5)) {
            return new an(au.CRYSTAL_TREE, n.HARVESTABLE, 6);
        }
        return null;
    }

    static {
        ac.var3();
    }

    ac(A a2, String string2, boolean bl) {
    }
}

