/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ag
extends GameEnum10 {

    static {
        ag.var2();
    }

    ag(A a2, String string2, boolean bl) {
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
            return new an(au.POTATO, n.GROWING, (int)(var3 - 3));
        }
        if (((int)var3 >= 5) && ((int)var3 <= 6)) {
            return new an(au.POTATO, n.HARVESTABLE, (int)(var3 - 5));
        }
        if (((int)var3 >= 7) && ((int)var3 <= 8)) {
            return new an(au.ONION, n.GROWING, (int)(var3 - 7));
        }
        if (((int)var3 >= 9) && ((int)var3 <= var1[10])) {
            return new an(au.ONION, n.HARVESTABLE, (int)(var3 - 9));
        }
        if (((int)var3 >= var1[11]) && ((int)var3 <= var1[12])) {
            return new an(au.CABBAGE, n.GROWING, (int)(var3 - var1[11]));
        }
        if (((int)var3 >= var1[13]) && ((int)var3 <= var1[14])) {
            return new an(au.CABBAGE, n.HARVESTABLE, (int)(var3 - var1[13]));
        }
        if (((int)var3 >= var1[15]) && ((int)var3 <= var1[16])) {
            return new an(au.TOMATO, n.GROWING, (int)(var3 - var1[15]));
        }
        if (((int)var3 >= var1[17]) && ((int)var3 <= var1[18])) {
            return new an(au.TOMATO, n.HARVESTABLE, (int)(var3 - var1[17]));
        }
        if (((int)var3 >= var1[19]) && ((int)var3 <= var1[20])) {
            return new an(au.SWEETCORN, n.GROWING, (int)(var3 - var1[19]));
        }
        if (((int)var3 >= var1[21]) && ((int)var3 <= var1[22])) {
            return new an(au.SWEETCORN, n.HARVESTABLE, (int)(var3 - var1[21]));
        }
        if (((int)var3 >= var1[23]) && ((int)var3 <= var1[24])) {
            return new an(au.STRAWBERRY, n.GROWING, (int)(var3 - var1[23]));
        }
        if (((int)var3 >= var1[25]) && ((int)var3 <= var1[26])) {
            return new an(au.STRAWBERRY, n.HARVESTABLE, (int)(var3 - var1[25]));
        }
        if (((int)var3 >= var1[27]) && ((int)var3 <= var1[28])) {
            return new an(au.WATERMELON, n.GROWING, (int)(var3 - var1[27]));
        }
        if (((int)var3 >= var1[29]) && ((int)var3 <= var1[30])) {
            return new an(au.WATERMELON, n.HARVESTABLE, (int)(var3 - var1[29]));
        }
        if (((int)var3 >= var1[31]) && ((int)var3 <= var1[32])) {
            return new an(au.SNAPE_GRASS, n.GROWING, (int)(var3 - var1[31]));
        }
        if (((int)var3 >= var1[33]) && ((int)var3 <= var1[34])) {
            return new an(au.POTATO, n.GROWING, (int)(var3 - var1[33]));
        }
        if (((int)var3 >= var1[35]) && ((int)var3 <= var1[36])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[37]) && ((int)var3 <= var1[38])) {
            return new an(au.ONION, n.GROWING, (int)(var3 - var1[37]));
        }
        if (((int)var3 >= var1[39]) && ((int)var3 <= var1[40])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[41]) && ((int)var3 <= var1[42])) {
            return new an(au.CABBAGE, n.GROWING, (int)(var3 - var1[41]));
        }
        if (((int)var3 >= var1[43]) && ((int)var3 <= var1[44])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[45]) && ((int)var3 <= var1[46])) {
            return new an(au.TOMATO, n.GROWING, (int)(var3 - var1[45]));
        }
        if (((int)var3 >= var1[47]) && ((int)var3 <= var1[48])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[49]) && ((int)var3 <= var1[50])) {
            return new an(au.SWEETCORN, n.GROWING, (int)(var3 - var1[49]));
        }
        if (((int)var3 >= var1[51]) && ((int)var3 <= var1[52])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[53]) && ((int)var3 <= var1[54])) {
            return new an(au.STRAWBERRY, n.GROWING, (int)(var3 - var1[53]));
        }
        if (((int)var3 >= var1[55]) && ((int)var3 <= var1[56])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[57]) && ((int)var3 <= var1[58])) {
            return new an(au.WATERMELON, n.GROWING, (int)(var3 - var1[57]));
        }
        if (((int)var3 >= var1[59]) && ((int)var3 <= var1[60])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[61]) && ((int)var3 <= var1[62])) {
            return new an(au.SNAPE_GRASS, n.GROWING, (int)(var3 - var1[61]));
        }
        if (((int)var3 >= var1[63]) && ((int)var3 <= var1[64])) {
            return new an(au.POTATO, n.DISEASED, (int)(var3 - var1[62]));
        }
        if (((int)var3 >= var1[65]) && ((int)var3 <= var1[66])) {
            return new an(au.SNAPE_GRASS, n.HARVESTABLE, (int)(var3 - var1[65]));
        }
        if (((int)var3 == var1[67])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[68]) && ((int)var3 <= var1[69])) {
            return new an(au.ONION, n.DISEASED, (int)(var3 - var1[67]));
        }
        if (((int)var3 >= var1[70]) && ((int)var3 <= var1[71])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[72]) && ((int)var3 <= var1[73])) {
            return new an(au.CABBAGE, n.DISEASED, (int)(var3 - var1[71]));
        }
        if (((int)var3 >= var1[74]) && ((int)var3 <= var1[75])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[76]) && ((int)var3 <= var1[77])) {
            return new an(au.TOMATO, n.DISEASED, (int)(var3 - var1[75]));
        }
        if (((int)var3 >= var1[78]) && ((int)var3 <= var1[79])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[80]) && ((int)var3 <= var1[81])) {
            return new an(au.SWEETCORN, n.DISEASED, (int)(var3 - var1[79]));
        }
        if (((int)var3 >= var1[82]) && ((int)var3 <= var1[83])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[84]) && ((int)var3 <= var1[85])) {
            return new an(au.STRAWBERRY, n.DISEASED, (int)(var3 - var1[83]));
        }
        if (((int)var3 >= var1[86]) && ((int)var3 <= var1[87])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[88]) && ((int)var3 <= var1[89])) {
            return new an(au.WATERMELON, n.DISEASED, (int)(var3 - var1[87]));
        }
        if (((int)var3 >= var1[90]) && ((int)var3 <= var1[91])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[92]) && ((int)var3 <= var1[93])) {
            return new an(au.SNAPE_GRASS, n.DEAD, (int)(var3 - var1[91]));
        }
        if (((int)var3 >= var1[94]) && ((int)var3 <= var1[95])) {
            return new an(au.SNAPE_GRASS, n.DISEASED, (int)(var3 - var1[93]));
        }
        if (((int)var3 >= var1[96]) && ((int)var3 <= var1[97])) {
            return new an(au.POTATO, n.DEAD, (int)(var3 - var1[95]));
        }
        if (((int)var3 >= var1[98]) && ((int)var3 <= var1[99])) {
            return new an(au.SNAPE_GRASS, n.DISEASED, 0 + var3 - var1[97]);
        }
        if (((int)var3 == var1[100])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[101]) && ((int)var3 <= var1[102])) {
            return new an(au.ONION, n.DEAD, (int)(var3 - var1[100]));
        }
        if (((int)var3 >= var1[103]) && ((int)var3 <= var1[104])) {
            return new an(au.SNAPE_GRASS, n.DEAD, 0 + var3 - var1[102]);
        }
        if (((int)var3 == var1[105])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[106]) && ((int)var3 <= var1[107])) {
            return new an(au.CABBAGE, n.DEAD, (int)(var3 - var1[105]));
        }
        if (((int)var3 >= var1[108]) && ((int)var3 <= var1[109])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[110]) && ((int)var3 <= var1[111])) {
            return new an(au.TOMATO, n.DEAD, (int)(var3 - var1[109]));
        }
        if (((int)var3 >= var1[112]) && ((int)var3 <= var1[113])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[114]) && ((int)var3 <= var1[115])) {
            return new an(au.SWEETCORN, n.DEAD, (int)(var3 - var1[113]));
        }
        if (((int)var3 >= var1[116]) && ((int)var3 <= var1[117])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[118]) && ((int)var3 <= var1[119])) {
            return new an(au.STRAWBERRY, n.DEAD, (int)(var3 - var1[117]));
        }
        if (((int)var3 >= var1[120]) && ((int)var3 <= var1[121])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var3 >= var1[122]) && ((int)var3 <= var1[123])) {
            return new an(au.WATERMELON, n.DEAD, (int)(var3 - var1[121]));
        }
        if (((int)var3 >= var1[124]) && ((int)var3 <= var1[125])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }
}

