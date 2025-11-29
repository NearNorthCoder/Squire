/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ai
extends GameEnum10 {

    static {
        ai.var2();
    }

    ai(A a2, String string2, boolean bl) {
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
            return new an(au.MARIGOLD, n.GROWING, (int)(var3 - 3));
        }
        if (((int)var3 == 5)) {
            return new an(au.MARIGOLD, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= 7) && ((int)var3 <= 8)) {
            return new an(au.ROSEMARY, n.GROWING, (int)(var3 - 7));
        }
        if (((int)var3 == 9)) {
            return new an(au.ROSEMARY, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= var1[10]) && ((int)var3 <= var1[11])) {
            return new an(au.NASTURTIUM, n.GROWING, (int)(var3 - var1[10]));
        }
        if (((int)var3 == var1[12])) {
            return new an(au.NASTURTIUM, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= var1[13]) && ((int)var3 <= var1[14])) {
            return new an(au.WOAD, n.GROWING, (int)(var3 - var1[13]));
        }
        if (((int)var3 == var1[15])) {
            return new an(au.WOAD, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= var1[16]) && ((int)var3 <= var1[17])) {
            return new an(au.LIMPWURT, n.GROWING, (int)(var3 - var1[16]));
        }
        if (((int)var3 == var1[18])) {
            return new an(au.LIMPWURT, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= var1[19]) && ((int)var3 <= var1[20])) {
            return new an(au.SCARECROW, n.GROWING, var1[20] - var3);
        }
        if (((int)var3 == var1[21])) {
            return new an(au.SCARECROW, n.GROWING, 6);
        }
        if (((int)var3 >= var1[22]) && ((int)var3 <= var1[23])) {
            return new an(au.WHITE_LILY, n.GROWING, (int)(var3 - var1[22]));
        }
        if (((int)var3 == var1[24])) {
            return new an(au.WHITE_LILY, n.HARVESTABLE, 6);
        }
        if (((int)var3 >= var1[25]) && ((int)var3 <= var1[26])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[27]) && ((int)var3 <= var1[28])) {
            return new an(au.MARIGOLD, n.GROWING, (int)(var3 - var1[27]));
        }
        if (((int)var3 == var1[29])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[30]) && ((int)var3 <= var1[31])) {
            return new an(au.ROSEMARY, n.GROWING, (int)(var3 - var1[30]));
        }
        if (((int)var3 == var1[32])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[33]) && ((int)var3 <= var1[34])) {
            return new an(au.NASTURTIUM, n.GROWING, (int)(var3 - var1[33]));
        }
        if (((int)var3 == var1[35])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[36]) && ((int)var3 <= var1[37])) {
            return new an(au.WOAD, n.GROWING, (int)(var3 - var1[36]));
        }
        if (((int)var3 == var1[38])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[39]) && ((int)var3 <= var1[40])) {
            return new an(au.LIMPWURT, n.GROWING, (int)(var3 - var1[39]));
        }
        if (((int)var3 >= var1[41]) && ((int)var3 <= var1[42])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[43]) && ((int)var3 <= var1[44])) {
            return new an(au.WHITE_LILY, n.GROWING, (int)(var3 - var1[43]));
        }
        if (((int)var3 >= var1[45]) && ((int)var3 <= var1[46])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[47]) && ((int)var3 <= var1[48])) {
            return new an(au.MARIGOLD, n.DISEASED, (int)(var3 - var1[46]));
        }
        if (((int)var3 >= var1[49]) && ((int)var3 <= var1[50])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[51]) && ((int)var3 <= var1[52])) {
            return new an(au.ROSEMARY, n.DISEASED, (int)(var3 - var1[50]));
        }
        if (((int)var3 >= var1[53]) && ((int)var3 <= var1[54])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[55]) && ((int)var3 <= var1[56])) {
            return new an(au.NASTURTIUM, n.DISEASED, (int)(var3 - var1[54]));
        }
        if (((int)var3 >= var1[57]) && ((int)var3 <= var1[58])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[59]) && ((int)var3 <= var1[60])) {
            return new an(au.WOAD, n.DISEASED, (int)(var3 - var1[58]));
        }
        if (((int)var3 >= var1[61]) && ((int)var3 <= var1[62])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[63]) && ((int)var3 <= var1[64])) {
            return new an(au.LIMPWURT, n.DISEASED, (int)(var3 - var1[62]));
        }
        if (((int)var3 >= var1[65]) && ((int)var3 <= var1[66])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[67]) && ((int)var3 <= var1[68])) {
            return new an(au.WHITE_LILY, n.DISEASED, (int)(var3 - var1[66]));
        }
        if (((int)var3 >= var1[69]) && ((int)var3 <= var1[70])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[71]) && ((int)var3 <= var1[72])) {
            return new an(au.MARIGOLD, n.DEAD, (int)(var3 - var1[70]));
        }
        if (((int)var3 == var1[73])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[74]) && ((int)var3 <= var1[75])) {
            return new an(au.ROSEMARY, n.DEAD, (int)(var3 - var1[73]));
        }
        if (((int)var3 == var1[76])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[77]) && ((int)var3 <= var1[78])) {
            return new an(au.NASTURTIUM, n.DEAD, (int)(var3 - var1[76]));
        }
        if (((int)var3 == var1[79])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[80]) && ((int)var3 <= var1[81])) {
            return new an(au.WOAD, n.DEAD, (int)(var3 - var1[79]));
        }
        if (((int)var3 == var1[82])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[83]) && ((int)var3 <= var1[84])) {
            return new an(au.LIMPWURT, n.DEAD, (int)(var3 - var1[82]));
        }
        if (((int)var3 >= var1[85]) && ((int)var3 <= var1[86])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[87]) && ((int)var3 <= var1[88])) {
            return new an(au.WHITE_LILY, n.DEAD, (int)(var3 - var1[86]));
        }
        if (((int)var3 >= var1[89]) && ((int)var3 <= var1[90])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }
}

