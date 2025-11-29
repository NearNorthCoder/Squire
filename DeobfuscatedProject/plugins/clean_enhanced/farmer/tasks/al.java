/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class al
extends GameEnum10 {

    al(A a2, String string2, boolean bl) {
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
            return new an(au.HAMMERSTONE, n.GROWING, (int)(var2 - 1));
        }
        if (((int)var2 >= 3) && ((int)var2 <= 4)) {
            return new an(au.HAMMERSTONE, n.HARVESTABLE, (int)(var2 - 3));
        }
        if (((int)var2 >= 5) && ((int)var2 <= 6)) {
            return new an(au.ASGARNIAN, n.GROWING, (int)(var2 - 5));
        }
        if (((int)var2 >= 7) && ((int)var2 <= 8)) {
            return new an(au.ASGARNIAN, n.HARVESTABLE, (int)(var2 - 7));
        }
        if (((int)var2 >= 9) && ((int)var2 <= var1[10])) {
            return new an(au.YANILLIAN, n.GROWING, (int)(var2 - 9));
        }
        if (((int)var2 >= var1[11]) && ((int)var2 <= var1[12])) {
            return new an(au.YANILLIAN, n.HARVESTABLE, (int)(var2 - var1[11]));
        }
        if (((int)var2 >= var1[13]) && ((int)var2 <= var1[14])) {
            return new an(au.KRANDORIAN, n.GROWING, (int)(var2 - var1[13]));
        }
        if (((int)var2 >= var1[15]) && ((int)var2 <= var1[16])) {
            return new an(au.KRANDORIAN, n.HARVESTABLE, (int)(var2 - var1[15]));
        }
        if (((int)var2 >= var1[17]) && ((int)var2 <= var1[18])) {
            return new an(au.WILDBLOOD, n.GROWING, (int)(var2 - var1[17]));
        }
        if (((int)var2 >= var1[19]) && ((int)var2 <= var1[20])) {
            return new an(au.WILDBLOOD, n.HARVESTABLE, (int)(var2 - var1[19]));
        }
        if (((int)var2 >= var1[21]) && ((int)var2 <= var1[22])) {
            return new an(au.BARLEY, n.GROWING, (int)(var2 - var1[21]));
        }
        if (((int)var2 >= var1[23]) && ((int)var2 <= var1[24])) {
            return new an(au.BARLEY, n.HARVESTABLE, (int)(var2 - var1[23]));
        }
        if (((int)var2 >= var1[25]) && ((int)var2 <= var1[26])) {
            return new an(au.JUTE, n.GROWING, (int)(var2 - var1[25]));
        }
        if (((int)var2 >= var1[27]) && ((int)var2 <= var1[28])) {
            return new an(au.JUTE, n.HARVESTABLE, (int)(var2 - var1[27]));
        }
        if (((int)var2 >= var1[29]) && ((int)var2 <= var1[30])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[31]) && ((int)var2 <= var1[32])) {
            return new an(au.HAMMERSTONE, n.GROWING, (int)(var2 - var1[31]));
        }
        if (((int)var2 >= var1[33]) && ((int)var2 <= var1[34])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[35]) && ((int)var2 <= var1[36])) {
            return new an(au.ASGARNIAN, n.GROWING, (int)(var2 - var1[35]));
        }
        if (((int)var2 >= var1[37]) && ((int)var2 <= var1[38])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[39]) && ((int)var2 <= var1[40])) {
            return new an(au.YANILLIAN, n.GROWING, (int)(var2 - var1[39]));
        }
        if (((int)var2 >= var1[41]) && ((int)var2 <= var1[42])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[43]) && ((int)var2 <= var1[44])) {
            return new an(au.KRANDORIAN, n.GROWING, (int)(var2 - var1[43]));
        }
        if (((int)var2 >= var1[45]) && ((int)var2 <= var1[46])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[47]) && ((int)var2 <= var1[48])) {
            return new an(au.WILDBLOOD, n.GROWING, (int)(var2 - var1[47]));
        }
        if (((int)var2 >= var1[49]) && ((int)var2 <= var1[50])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[51]) && ((int)var2 <= var1[52])) {
            return new an(au.BARLEY, n.GROWING, (int)(var2 - var1[51]));
        }
        if (((int)var2 >= var1[53]) && ((int)var2 <= var1[54])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[55]) && ((int)var2 <= var1[56])) {
            return new an(au.JUTE, n.GROWING, (int)(var2 - var1[55]));
        }
        if (((int)var2 >= var1[57]) && ((int)var2 <= var1[58])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[59]) && ((int)var2 <= var1[60])) {
            return new an(au.HAMMERSTONE, n.DISEASED, (int)(var2 - var1[58]));
        }
        if (((int)var2 >= var1[61]) && ((int)var2 <= var1[62])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[63]) && ((int)var2 <= var1[64])) {
            return new an(au.ASGARNIAN, n.DISEASED, (int)(var2 - var1[62]));
        }
        if (((int)var2 >= var1[65]) && ((int)var2 <= var1[66])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[67]) && ((int)var2 <= var1[68])) {
            return new an(au.YANILLIAN, n.DISEASED, (int)(var2 - var1[66]));
        }
        if (((int)var2 >= var1[69]) && ((int)var2 <= var1[70])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[71]) && ((int)var2 <= var1[72])) {
            return new an(au.KRANDORIAN, n.DISEASED, (int)(var2 - var1[70]));
        }
        if (((int)var2 >= var1[73]) && ((int)var2 <= var1[74])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[75]) && ((int)var2 <= var1[76])) {
            return new an(au.WILDBLOOD, n.DISEASED, (int)(var2 - var1[74]));
        }
        if (((int)var2 >= var1[77]) && ((int)var2 <= var1[78])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[79]) && ((int)var2 <= var1[80])) {
            return new an(au.BARLEY, n.DISEASED, (int)(var2 - var1[78]));
        }
        if (((int)var2 == var1[81])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[82]) && ((int)var2 <= var1[83])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[84]) && ((int)var2 <= var1[85])) {
            return new an(au.JUTE, n.DISEASED, (int)(var2 - var1[83]));
        }
        if (((int)var2 >= var1[86]) && ((int)var2 <= var1[87])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[88]) && ((int)var2 <= var1[89])) {
            return new an(au.HAMMERSTONE, n.DEAD, (int)(var2 - var1[87]));
        }
        if (((int)var2 >= var1[90]) && ((int)var2 <= var1[91])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[92]) && ((int)var2 <= var1[93])) {
            return new an(au.ASGARNIAN, n.DEAD, (int)(var2 - var1[91]));
        }
        if (((int)var2 >= var1[94]) && ((int)var2 <= var1[95])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[96]) && ((int)var2 <= var1[97])) {
            return new an(au.YANILLIAN, n.DEAD, (int)(var2 - var1[95]));
        }
        if (((int)var2 >= var1[98]) && ((int)var2 <= var1[99])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[100]) && ((int)var2 <= var1[101])) {
            return new an(au.KRANDORIAN, n.DEAD, (int)(var2 - var1[99]));
        }
        if (((int)var2 >= var1[102]) && ((int)var2 <= var1[103])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[104]) && ((int)var2 <= var1[105])) {
            return new an(au.WILDBLOOD, n.DEAD, (int)(var2 - var1[103]));
        }
        if (((int)var2 >= var1[106]) && ((int)var2 <= var1[107])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[108]) && ((int)var2 <= var1[109])) {
            return new an(au.BARLEY, n.DEAD, (int)(var2 - var1[107]));
        }
        if (((int)var2 >= var1[110]) && ((int)var2 <= var1[111])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[112]) && ((int)var2 <= var1[113])) {
            return new an(au.JUTE, n.DEAD, (int)(var2 - var1[111]));
        }
        if (((int)var2 >= var1[114]) && ((int)var2 <= var1[115])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }

    static {
        al.var3();
    }
}

