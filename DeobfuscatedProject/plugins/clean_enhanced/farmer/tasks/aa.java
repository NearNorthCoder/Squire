/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class aa
extends GameEnum10 {

    static {
        aa.var2();
    }

    aa(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var3;
        if ((n2 >= 0) && (n2 <= 0)) {
            return new an(au.WEEDS, n.GROWING, 1);
        }
        if (((int)var3 >= 2) && ((int)var3 <= 3)) {
            return new an(au.GRAPE, n.GROWING, (int)(var3 - 2));
        }
        if (((int)var3 == 4)) {
            return new an(au.GRAPE, n.GROWING, 5);
        }
        if (((int)var3 >= 6) && ((int)var3 <= 7)) {
            return new an(au.GRAPE, n.HARVESTABLE, (int)(var3 - 6));
        }
        return null;
    }

}

