/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class THelper
extends GameEnum10 {

    static {
        T.var2();
    }

    THelper(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var3;
        if ((n2 >= 0) && (n2 <= 0)) {
            return new an(au.WEEDS, n.GROWING, 0 - n2);
        }
        if (((int)var3 >= 1) && ((int)var3 <= 2)) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= 3) && ((int)var3 <= 4)) {
            return new an(au.REDWOOD, n.GROWING, (int)(var3 - 3));
        }
        if (((int)var3 == 5)) {
            return new an(au.REDWOOD, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= 7) && ((int)var3 <= 8)) {
            return new an(au.REDWOOD, n.DISEASED, (int)(var3 - 5));
        }
        if (((int)var3 >= 9) && ((int)var3 <= var1[10])) {
            return new an(au.REDWOOD, n.DEAD, (int)(var3 - 8));
        }
        if (((int)var3 == var1[11])) {
            return new an(au.REDWOOD, n.GROWING, au.REDWOOD.bc() - var1[12]);
        }
        if (((int)var3 >= var1[13]) && ((int)var3 <= var1[14])) {
            return new an(au.REDWOOD, n.HARVESTABLE, 6);
        }
        return null;
    }

}

