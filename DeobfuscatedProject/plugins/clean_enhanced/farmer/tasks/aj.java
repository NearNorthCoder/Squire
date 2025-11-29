/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class aj
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
        if (((int)var2 == 1)) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= 2) && ((int)var2 <= 3)) {
            return new an(au.REDBERRIES, n.GROWING, (int)(var2 - 2));
        }
        if (((int)var2 >= 4) && ((int)var2 <= 5)) {
            return new an(au.REDBERRIES, n.HARVESTABLE, (int)(var2 - 4));
        }
        if (((int)var2 >= 6) && ((int)var2 <= 7)) {
            return new an(au.CADAVABERRIES, n.GROWING, (int)(var2 - 6));
        }
        if (((int)var2 >= 8) && ((int)var2 <= 9)) {
            return new an(au.CADAVABERRIES, n.HARVESTABLE, (int)(var2 - 8));
        }
        if (((int)var2 >= var1[10]) && ((int)var2 <= var1[11])) {
            return new an(au.DWELLBERRIES, n.GROWING, (int)(var2 - var1[10]));
        }
        if (((int)var2 >= var1[12]) && ((int)var2 <= var1[13])) {
            return new an(au.DWELLBERRIES, n.HARVESTABLE, (int)(var2 - var1[12]));
        }
        if (((int)var2 >= var1[14]) && ((int)var2 <= var1[15])) {
            return new an(au.JANGERBERRIES, n.GROWING, (int)(var2 - var1[14]));
        }
        if (((int)var2 >= var1[16]) && ((int)var2 <= var1[17])) {
            return new an(au.JANGERBERRIES, n.HARVESTABLE, (int)(var2 - var1[16]));
        }
        if (((int)var2 >= var1[18]) && ((int)var2 <= var1[19])) {
            return new an(au.WHITEBERRIES, n.GROWING, (int)(var2 - var1[18]));
        }
        if (((int)var2 >= var1[20]) && ((int)var2 <= var1[21])) {
            return new an(au.WHITEBERRIES, n.HARVESTABLE, (int)(var2 - var1[20]));
        }
        if (((int)var2 >= var1[22]) && ((int)var2 <= var1[23])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[24]) && ((int)var2 <= var1[25])) {
            return new an(au.REDBERRIES, n.DISEASED, (int)(var2 - var1[23]));
        }
        if (((int)var2 >= var1[26]) && ((int)var2 <= var1[27])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[28]) && ((int)var2 <= var1[29])) {
            return new an(au.CADAVABERRIES, n.DISEASED, (int)(var2 - var1[27]));
        }
        if (((int)var2 >= var1[30]) && ((int)var2 <= var1[31])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[32]) && ((int)var2 <= var1[33])) {
            return new an(au.DWELLBERRIES, n.DISEASED, (int)(var2 - var1[31]));
        }
        if (((int)var2 >= var1[34]) && ((int)var2 <= var1[35])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[36]) && ((int)var2 <= var1[37])) {
            return new an(au.JANGERBERRIES, n.DISEASED, (int)(var2 - var1[35]));
        }
        if (((int)var2 >= var1[38]) && ((int)var2 <= var1[39])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[40]) && ((int)var2 <= var1[41])) {
            return new an(au.WHITEBERRIES, n.DISEASED, (int)(var2 - var1[39]));
        }
        if (((int)var2 >= var1[42]) && ((int)var2 <= var1[43])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[44]) && ((int)var2 <= var1[45])) {
            return new an(au.REDBERRIES, n.DEAD, (int)(var2 - var1[43]));
        }
        if (((int)var2 >= var1[46]) && ((int)var2 <= var1[47])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[48]) && ((int)var2 <= var1[49])) {
            return new an(au.CADAVABERRIES, n.DEAD, (int)(var2 - var1[47]));
        }
        if (((int)var2 >= var1[50]) && ((int)var2 <= var1[51])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[52]) && ((int)var2 <= var1[53])) {
            return new an(au.DWELLBERRIES, n.DEAD, (int)(var2 - var1[51]));
        }
        if (((int)var2 >= var1[54]) && ((int)var2 <= var1[55])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[56]) && ((int)var2 <= var1[57])) {
            return new an(au.JANGERBERRIES, n.DEAD, (int)(var2 - var1[55]));
        }
        if (((int)var2 >= var1[58]) && ((int)var2 <= var1[59])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[60]) && ((int)var2 <= var1[61])) {
            return new an(au.WHITEBERRIES, n.DEAD, (int)(var2 - var1[59]));
        }
        if (((int)var2 >= var1[62]) && ((int)var2 <= var1[63])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[64]) && ((int)var2 <= var1[65])) {
            return new an(au.POISON_IVY, n.GROWING, (int)(var2 - var1[64]));
        }
        if (((int)var2 >= var1[66]) && ((int)var2 <= var1[67])) {
            return new an(au.POISON_IVY, n.HARVESTABLE, (int)(var2 - var1[66]));
        }
        if (((int)var2 >= var1[68]) && ((int)var2 <= var1[69])) {
            return new an(au.POISON_IVY, n.DISEASED, (int)(var2 - var1[67]));
        }
        if (((int)var2 >= var1[70]) && ((int)var2 <= var1[71])) {
            return new an(au.POISON_IVY, n.DEAD, (int)(var2 - var1[69]));
        }
        if (((int)var2 == var1[72])) {
            return new an(au.POISON_IVY, n.DISEASED, var1[73]);
        }
        if (((int)var2 >= var1[74]) && ((int)var2 <= var1[75])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 == var1[76])) {
            return new an(au.REDBERRIES, n.GROWING, au.REDBERRIES.bc() - var1[77]);
        }
        if (((int)var2 == var1[78])) {
            return new an(au.CADAVABERRIES, n.GROWING, au.CADAVABERRIES.bc() - var1[77]);
        }
        if (((int)var2 == var1[79])) {
            return new an(au.DWELLBERRIES, n.GROWING, au.DWELLBERRIES.bc() - var1[77]);
        }
        if (((int)var2 == var1[80])) {
            return new an(au.JANGERBERRIES, n.GROWING, au.JANGERBERRIES.bc() - var1[77]);
        }
        if (((int)var2 == var1[81])) {
            return new an(au.WHITEBERRIES, n.GROWING, au.WHITEBERRIES.bc() - var1[77]);
        }
        if (((int)var2 == var1[82])) {
            return new an(au.POISON_IVY, n.GROWING, au.POISON_IVY.bc() - var1[77]);
        }
        return null;
    }

    static {
        aj.var3();
    }

    aj(A a2, String string2, boolean bl) {
    }

}

