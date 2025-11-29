/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class RHelper
extends GameEnum10 {

    RHelper(A a2, String string2, boolean bl) {
    }

    static {
        R.var2();
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
            return new an(au.OAK, n.GROWING, (int)(var3 - 3));
        }
        if (((int)var3 == 5)) {
            return new an(au.OAK, n.GROWING, au.OAK.bc() - 6);
        }
        if (((int)var3 == 7)) {
            return new an(au.OAK, n.HARVESTABLE, 8);
        }
        if (((int)var3 == 9)) {
            return new an(au.OAK, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[10]) && ((int)var3 <= var1[11])) {
            return new an(au.WILLOW, n.GROWING, (int)(var3 - var1[10]));
        }
        if (((int)var3 == var1[12])) {
            return new an(au.WILLOW, n.GROWING, au.WILLOW.bc() - 6);
        }
        if (((int)var3 == var1[13])) {
            return new an(au.WILLOW, n.HARVESTABLE, 8);
        }
        if (((int)var3 == var1[14])) {
            return new an(au.WILLOW, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[15]) && ((int)var3 <= var1[16])) {
            return new an(au.MAPLE, n.GROWING, (int)(var3 - var1[15]));
        }
        if (((int)var3 == var1[17])) {
            return new an(au.MAPLE, n.GROWING, au.MAPLE.bc() - 6);
        }
        if (((int)var3 == var1[18])) {
            return new an(au.MAPLE, n.HARVESTABLE, 8);
        }
        if (((int)var3 == var1[19])) {
            return new an(au.MAPLE, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[20]) && ((int)var3 <= var1[21])) {
            return new an(au.YEW, n.GROWING, (int)(var3 - var1[20]));
        }
        if (((int)var3 == var1[22])) {
            return new an(au.YEW, n.GROWING, au.YEW.bc() - 6);
        }
        if (((int)var3 == var1[23])) {
            return new an(au.YEW, n.HARVESTABLE, 8);
        }
        if (((int)var3 == var1[24])) {
            return new an(au.YEW, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[25]) && ((int)var3 <= var1[26])) {
            return new an(au.MAGIC, n.GROWING, (int)(var3 - var1[25]));
        }
        if (((int)var3 == var1[27])) {
            return new an(au.MAGIC, n.GROWING, au.MAGIC.bc() - 6);
        }
        if (((int)var3 == var1[28])) {
            return new an(au.MAGIC, n.HARVESTABLE, 8);
        }
        if (((int)var3 == var1[29])) {
            return new an(au.MAGIC, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[30]) && ((int)var3 <= var1[31])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[32]) && ((int)var3 <= var1[33])) {
            return new an(au.OAK, n.DISEASED, (int)(var3 - var1[31]));
        }
        if (((int)var3 == var1[34])) {
            return new an(au.OAK, n.DISEASED, 1);
        }
        if (((int)var3 >= var1[35]) && ((int)var3 <= var1[36])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[37]) && ((int)var3 <= var1[38])) {
            return new an(au.WILLOW, n.DISEASED, (int)(var3 - var1[36]));
        }
        if (((int)var3 == var1[39])) {
            return new an(au.WILLOW, n.DISEASED, var1[40]);
        }
        if (((int)var3 >= var1[41]) && ((int)var3 <= var1[42])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[43]) && ((int)var3 <= var1[44])) {
            return new an(au.MAPLE, n.DISEASED, (int)(var3 - var1[42]));
        }
        if (((int)var3 == var1[45])) {
            return new an(au.MAPLE, n.DISEASED, 3);
        }
        if (((int)var3 >= var1[46]) && ((int)var3 <= var1[47])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[48]) && ((int)var3 <= var1[49])) {
            return new an(au.YEW, n.DISEASED, (int)(var3 - var1[47]));
        }
        if (((int)var3 == var1[50])) {
            return new an(au.YEW, n.DISEASED, var1[51]);
        }
        if (((int)var3 >= var1[52]) && ((int)var3 <= var1[53])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[54]) && ((int)var3 <= var1[55])) {
            return new an(au.MAGIC, n.DISEASED, (int)(var3 - var1[53]));
        }
        if (((int)var3 == var1[56])) {
            return new an(au.MAGIC, n.DISEASED, 5);
        }
        if (((int)var3 >= var1[57]) && ((int)var3 <= var1[58])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[59]) && ((int)var3 <= var1[60])) {
            return new an(au.OAK, n.DEAD, (int)(var3 - var1[58]));
        }
        if (((int)var3 == var1[61])) {
            return new an(au.OAK, n.DEAD, 1);
        }
        if (((int)var3 >= var1[62]) && ((int)var3 <= var1[63])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[64]) && ((int)var3 <= var1[65])) {
            return new an(au.WILLOW, n.DEAD, (int)(var3 - var1[63]));
        }
        if (((int)var3 == var1[66])) {
            return new an(au.WILLOW, n.DEAD, var1[40]);
        }
        if (((int)var3 >= var1[67]) && ((int)var3 <= var1[68])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[69]) && ((int)var3 <= var1[70])) {
            return new an(au.MAPLE, n.DEAD, (int)(var3 - var1[68]));
        }
        if (((int)var3 == var1[71])) {
            return new an(au.MAPLE, n.DEAD, 3);
        }
        if (((int)var3 >= var1[72]) && ((int)var3 <= var1[73])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[74]) && ((int)var3 <= var1[75])) {
            return new an(au.YEW, n.DEAD, (int)(var3 - var1[73]));
        }
        if (((int)var3 == var1[76])) {
            return new an(au.YEW, n.DEAD, var1[51]);
        }
        if (((int)var3 >= var1[77]) && ((int)var3 <= var1[78])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[79]) && ((int)var3 <= var1[80])) {
            return new an(au.MAGIC, n.DEAD, (int)(var3 - var1[78]));
        }
        if (((int)var3 == var1[81])) {
            return new an(au.MAGIC, n.DEAD, 5);
        }
        if (((int)var3 >= var1[82]) && ((int)var3 <= var1[83])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[84]) && ((int)var3 <= var1[85])) {
            return new an(au.WILLOW, n.HARVESTABLE, 8);
        }
        if (((int)var3 >= var1[86]) && ((int)var3 <= var1[87])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }

}

