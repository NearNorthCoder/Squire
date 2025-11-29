/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ak
extends GameEnum10 {

    ak(A a2, String string2, boolean bl) {
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
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= 3) && ((int)var2 <= 4)) {
            return new an(au.APPLE, n.GROWING, (int)(var2 - 3));
        }
        if (((int)var2 >= 5) && ((int)var2 <= 6)) {
            return new an(au.APPLE, n.HARVESTABLE, (int)(var2 - 5));
        }
        if (((int)var2 >= 7) && ((int)var2 <= 8)) {
            return new an(au.APPLE, n.DISEASED, (int)(var2 - 6));
        }
        if (((int)var2 >= 9) && ((int)var2 <= var1[10])) {
            return new an(au.APPLE, n.DEAD, (int)(var2 - 8));
        }
        if (((int)var2 == var1[11])) {
            return new an(au.APPLE, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[13])) {
            return new an(au.APPLE, n.GROWING, au.APPLE.bc() - var1[14]);
        }
        if (((int)var2 >= var1[15]) && ((int)var2 <= var1[16])) {
            return new an(au.BANANA, n.GROWING, (int)(var2 - var1[15]));
        }
        if (((int)var2 >= var1[17]) && ((int)var2 <= var1[18])) {
            return new an(au.BANANA, n.HARVESTABLE, (int)(var2 - var1[17]));
        }
        if (((int)var2 >= var1[19]) && ((int)var2 <= var1[20])) {
            return new an(au.BANANA, n.DISEASED, (int)(var2 - var1[18]));
        }
        if (((int)var2 >= var1[21]) && ((int)var2 <= var1[22])) {
            return new an(au.BANANA, n.DEAD, (int)(var2 - var1[20]));
        }
        if (((int)var2 == var1[23])) {
            return new an(au.BANANA, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[24])) {
            return new an(au.BANANA, n.GROWING, au.BANANA.bc() - var1[14]);
        }
        if (((int)var2 >= var1[25]) && ((int)var2 <= var1[26])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[27]) && ((int)var2 <= var1[28])) {
            return new an(au.ORANGE, n.GROWING, (int)(var2 - var1[27]));
        }
        if (((int)var2 >= var1[29]) && ((int)var2 <= var1[30])) {
            return new an(au.ORANGE, n.HARVESTABLE, (int)(var2 - var1[29]));
        }
        if (((int)var2 >= var1[31]) && ((int)var2 <= var1[32])) {
            return new an(au.ORANGE, n.DISEASED, (int)(var2 - var1[30]));
        }
        if (((int)var2 == var1[33])) {
            return new an(au.ORANGE, n.DISEASED, var1[34]);
        }
        if (((int)var2 >= var1[35]) && ((int)var2 <= var1[36])) {
            return new an(au.ORANGE, n.DEAD, (int)(var2 - var1[33]));
        }
        if (((int)var2 == var1[37])) {
            return new an(au.ORANGE, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[38])) {
            return new an(au.ORANGE, n.GROWING, au.ORANGE.bc() - var1[14]);
        }
        if (((int)var2 >= var1[39]) && ((int)var2 <= var1[40])) {
            return new an(au.CURRY, n.GROWING, (int)(var2 - var1[39]));
        }
        if (((int)var2 >= var1[41]) && ((int)var2 <= var1[42])) {
            return new an(au.CURRY, n.HARVESTABLE, (int)(var2 - var1[41]));
        }
        if (((int)var2 >= var1[43]) && ((int)var2 <= var1[44])) {
            return new an(au.CURRY, n.DISEASED, (int)(var2 - var1[42]));
        }
        if (((int)var2 >= var1[45]) && ((int)var2 <= var1[46])) {
            return new an(au.CURRY, n.DEAD, (int)(var2 - var1[44]));
        }
        if (((int)var2 == var1[47])) {
            return new an(au.CURRY, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[48])) {
            return new an(au.CURRY, n.GROWING, au.CURRY.bc() - var1[14]);
        }
        if (((int)var2 >= var1[49]) && ((int)var2 <= var1[50])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[51]) && ((int)var2 <= var1[52])) {
            return new an(au.PINEAPPLE, n.GROWING, (int)(var2 - var1[51]));
        }
        if (((int)var2 >= var1[53]) && ((int)var2 <= var1[54])) {
            return new an(au.PINEAPPLE, n.HARVESTABLE, (int)(var2 - var1[53]));
        }
        if (((int)var2 >= var1[55]) && ((int)var2 <= var1[56])) {
            return new an(au.PINEAPPLE, n.DISEASED, (int)(var2 - var1[54]));
        }
        if (((int)var2 >= var1[57]) && ((int)var2 <= var1[58])) {
            return new an(au.PINEAPPLE, n.DEAD, (int)(var2 - var1[56]));
        }
        if (((int)var2 == var1[59])) {
            return new an(au.PINEAPPLE, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[60])) {
            return new an(au.PINEAPPLE, n.GROWING, au.PINEAPPLE.bc() - var1[14]);
        }
        if (((int)var2 >= var1[61]) && ((int)var2 <= var1[62])) {
            return new an(au.PAPAYA, n.GROWING, (int)(var2 - var1[61]));
        }
        if (((int)var2 >= var1[63]) && ((int)var2 <= var1[64])) {
            return new an(au.PAPAYA, n.HARVESTABLE, (int)(var2 - var1[63]));
        }
        if (((int)var2 >= var1[65]) && ((int)var2 <= var1[66])) {
            return new an(au.PAPAYA, n.DISEASED, (int)(var2 - var1[64]));
        }
        if (((int)var2 >= var1[67]) && ((int)var2 <= var1[68])) {
            return new an(au.PAPAYA, n.DEAD, (int)(var2 - var1[66]));
        }
        if (((int)var2 == var1[69])) {
            return new an(au.PAPAYA, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[70])) {
            return new an(au.PAPAYA, n.GROWING, au.PAPAYA.bc() - var1[14]);
        }
        if (((int)var2 >= var1[71]) && ((int)var2 <= var1[72])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[73]) && ((int)var2 <= var1[74])) {
            return new an(au.PALM, n.GROWING, (int)(var2 - var1[73]));
        }
        if (((int)var2 >= var1[75]) && ((int)var2 <= var1[76])) {
            return new an(au.PALM, n.HARVESTABLE, (int)(var2 - var1[75]));
        }
        if (((int)var2 >= var1[77]) && ((int)var2 <= var1[78])) {
            return new an(au.PALM, n.DISEASED, (int)(var2 - var1[76]));
        }
        if (((int)var2 >= var1[79]) && ((int)var2 <= var1[80])) {
            return new an(au.PALM, n.DEAD, (int)(var2 - var1[78]));
        }
        if (((int)var2 == var1[81])) {
            return new an(au.PALM, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[82])) {
            return new an(au.PALM, n.GROWING, au.PALM.bc() - var1[14]);
        }
        if (((int)var2 >= var1[83]) && ((int)var2 <= var1[84])) {
            return new an(au.DRAGONFRUIT, n.GROWING, (int)(var2 - var1[83]));
        }
        if (((int)var2 >= var1[85]) && ((int)var2 <= var1[86])) {
            return new an(au.DRAGONFRUIT, n.HARVESTABLE, (int)(var2 - var1[85]));
        }
        if (((int)var2 >= var1[87]) && ((int)var2 <= var1[88])) {
            return new an(au.DRAGONFRUIT, n.DISEASED, (int)(var2 - var1[86]));
        }
        if (((int)var2 >= var1[89]) && ((int)var2 <= var1[90])) {
            return new an(au.DRAGONFRUIT, n.DEAD, (int)(var2 - var1[88]));
        }
        if (((int)var2 == var1[91])) {
            return new an(au.DRAGONFRUIT, n.HARVESTABLE, var1[12]);
        }
        if (((int)var2 == var1[92])) {
            return new an(au.DRAGONFRUIT, n.GROWING, au.DRAGONFRUIT.bc() - var1[14]);
        }
        if (((int)var2 >= var1[93]) && ((int)var2 <= var1[94])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }

    static {
        ak.var3();
    }

}

