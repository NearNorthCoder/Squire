/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class XHelper
extends GameEnum10 {

    XHelper(A a2, String string2, boolean bl) {
    }

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
            return new an(au.SEAWEED, n.GROWING, (int)(var2 - 1));
        }
        if (((int)var2 >= 3) && ((int)var2 <= 4)) {
            return new an(au.SEAWEED, n.HARVESTABLE, (int)(var2 - 3));
        }
        if (((int)var2 >= 5) && ((int)var2 <= 6)) {
            return new an(au.SEAWEED, n.DISEASED, (int)(var2 - 4));
        }
        if (((int)var2 >= 7) && ((int)var2 <= 8)) {
            return new an(au.SEAWEED, n.DEAD, (int)(var2 - 6));
        }
        if (((int)var2 >= 9) && ((int)var2 <= var1[10])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }

    static {
        X.var3();
    }
}

