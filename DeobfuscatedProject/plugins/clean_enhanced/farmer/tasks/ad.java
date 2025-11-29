/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ad
extends GameEnum10 {

    static {
        ad.var2();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var3;
        if (n2 == 0) {
            return new an(au.EMPTY_COMPOST_BIN, n.EMPTY, 0);
        }
        if (((int)var3 >= 1) && ((int)var3 <= 2)) {
            return new an(au.COMPOST, n.FILLING, (int)(var3 - 1));
        }
        if (((int)var3 >= 3) && ((int)var3 <= 4)) {
            return new an(au.COMPOST, n.HARVESTABLE, (int)(var3 - 3));
        }
        if (!((int)var3 != 5) || ((int)var3 == 6)) {
            return new an(au.COMPOST, n.GROWING, (int)(var3 - 5));
        }
        if (((int)var3 >= 7) && ((int)var3 <= 8)) {
            return new an(au.SUPERCOMPOST, n.FILLING, (int)(var3 - 7));
        }
        if (((int)var3 >= 9) && ((int)var3 <= var1[10])) {
            return new an(au.SUPERCOMPOST, n.HARVESTABLE, (int)(var3 - 9));
        }
        if (((int)var3 == var1[11])) {
            return new an(au.COMPOST, n.GROWING, au.COMPOST.bc() - 1);
        }
        if (!((int)var3 != var1[12]) || ((int)var3 == var1[13])) {
            return new an(au.SUPERCOMPOST, n.GROWING, (int)(var3 - var1[12]));
        }
        if (((int)var3 == var1[14])) {
            return new an(au.SUPERCOMPOST, n.GROWING, au.SUPERCOMPOST.bc() - 1);
        }
        if (((int)var3 >= var1[15]) && ((int)var3 <= var1[16])) {
            return new an(au.ROTTEN_TOMATO, n.FILLING, (int)(var3 - var1[15]));
        }
        if (((int)var3 >= var1[17]) && ((int)var3 <= var1[18])) {
            return new an(au.ROTTEN_TOMATO, n.HARVESTABLE, (int)(var3 - var1[17]));
        }
        if (((int)var3 >= var1[19]) && ((int)var3 <= var1[20])) {
            return new an(au.ROTTEN_TOMATO, n.GROWING, (int)(var3 - var1[19]));
        }
        if (((int)var3 >= var1[21]) && ((int)var3 <= var1[22])) {
            return new an(au.ULTRACOMPOST, n.HARVESTABLE, (int)(var3 - var1[21]));
        }
        return null;
    }

    ad(A a2, String string2, boolean bl) {
    }
}

