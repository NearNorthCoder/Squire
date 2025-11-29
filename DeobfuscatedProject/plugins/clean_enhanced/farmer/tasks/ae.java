/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ae
extends GameEnum10 {

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var2;
        if (n2 == 0) {
            return new an(au.EMPTY_GIANT_COMPOST_BIN, n.EMPTY, 0);
        }
        if (((int)var2 >= 1) && ((int)var2 <= 2)) {
            return new an(au.GIANT_COMPOST, n.FILLING, (int)(var2 - 1));
        }
        if (((int)var2 >= 3) && ((int)var2 <= 4)) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, (int)(var2 - 3));
        }
        if (((int)var2 >= 5) && ((int)var2 <= 6)) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, (int)(var2 - 5));
        }
        if (((int)var2 >= 7) && ((int)var2 <= 8)) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, (int)(var2 - 7));
        }
        if (((int)var2 >= 9) && ((int)var2 <= var1[10])) {
            return new an(au.GIANT_COMPOST, n.FILLING, 2 + var2 - 9);
        }
        if (((int)var2 >= var1[11]) && ((int)var2 <= var1[12])) {
            return new an(au.GIANT_COMPOST, n.HARVESTABLE, 2 + var2 - var1[11]);
        }
        if (((int)var2 == var1[13])) {
            return new an(au.GIANT_COMPOST, n.GROWING, au.GIANT_COMPOST.bc() - 1);
        }
        if (((int)var2 >= var1[14]) && ((int)var2 <= var1[15])) {
            return new an(au.GIANT_SUPERCOMPOST, n.GROWING, (int)(var2 - var1[14]));
        }
        if (((int)var2 >= var1[16]) && ((int)var2 <= var1[17])) {
            return new an(au.GIANT_SUPERCOMPOST, n.HARVESTABLE, 2 + var2 - var1[16]);
        }
        if (((int)var2 >= var1[18]) && ((int)var2 <= var1[19])) {
            return new an(au.GIANT_COMPOST, n.GROWING, (int)(var2 - var1[18]));
        }
        if (((int)var2 >= var1[20]) && ((int)var2 <= var1[21])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, (int)(var2 - var1[20]));
        }
        if (((int)var2 >= var1[22]) && ((int)var2 <= var1[23])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, (int)(var2 - var1[22]));
        }
        if (((int)var2 >= var1[24]) && ((int)var2 <= var1[25])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, (int)(var2 - var1[24]));
        }
        if (((int)var2 >= var1[26]) && ((int)var2 <= var1[27])) {
            return new an(au.GIANT_SUPERCOMPOST, n.FILLING, 2 + var2 - var1[26]);
        }
        if (((int)var2 >= var1[28]) && ((int)var2 <= var1[29])) {
            return new an(au.GIANT_ULTRACOMPOST, n.HARVESTABLE, (int)(var2 - var1[28]));
        }
        if (((int)var2 >= var1[30]) && ((int)var2 <= var1[31])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.HARVESTABLE, 2 + var2 - var1[30]);
        }
        if (((int)var2 == var1[32])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.GROWING, au.GIANT_ROTTEN_TOMATO.bc() - 1);
        }
        if (((int)var2 >= var1[33]) && ((int)var2 <= var1[34])) {
            return new an(au.GIANT_ROTTEN_TOMATO, n.FILLING, 2 + var2 - var1[33]);
        }
        return null;
    }

    ae(A a2, String string2, boolean bl) {
    }

    static {
        ae.var3();
    }

}

