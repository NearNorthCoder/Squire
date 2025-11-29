/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum17;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum7;

final class ah
extends GameEnum10 {

    ah(A a2, String string2, String string3, boolean bl) {
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
            return new an(au.GUAM, n.GROWING, (int)(var2 - 1));
        }
        if (((int)var2 >= 3) && ((int)var2 <= 4)) {
            return new an(au.GUAM, n.HARVESTABLE, 4 - var2);
        }
        if (((int)var2 >= 5) && ((int)var2 <= 6)) {
            return new an(au.MARRENTILL, n.GROWING, (int)(var2 - 5));
        }
        if (((int)var2 >= 7) && ((int)var2 <= 8)) {
            return new an(au.MARRENTILL, n.HARVESTABLE, 8 - var2);
        }
        if (((int)var2 >= 9) && ((int)var2 <= var1[10])) {
            return new an(au.TARROMIN, n.GROWING, (int)(var2 - 9));
        }
        if (((int)var2 >= var1[11]) && ((int)var2 <= var1[12])) {
            return new an(au.TARROMIN, n.HARVESTABLE, var1[12] - var2);
        }
        if (((int)var2 >= var1[13]) && ((int)var2 <= var1[14])) {
            return new an(au.HARRALANDER, n.GROWING, (int)(var2 - var1[13]));
        }
        if (((int)var2 >= var1[15]) && ((int)var2 <= var1[16])) {
            return new an(au.HARRALANDER, n.HARVESTABLE, var1[16] - var2);
        }
        if (((int)var2 >= var1[17]) && ((int)var2 <= var1[18])) {
            return new an(au.RANARR, n.GROWING, (int)(var2 - var1[17]));
        }
        if (((int)var2 >= var1[19]) && ((int)var2 <= var1[20])) {
            return new an(au.RANARR, n.HARVESTABLE, var1[20] - var2);
        }
        if (((int)var2 >= var1[21]) && ((int)var2 <= var1[22])) {
            return new an(au.TOADFLAX, n.GROWING, (int)(var2 - var1[21]));
        }
        if (((int)var2 >= var1[23]) && ((int)var2 <= var1[24])) {
            return new an(au.TOADFLAX, n.HARVESTABLE, var1[24] - var2);
        }
        if (((int)var2 >= var1[25]) && ((int)var2 <= var1[26])) {
            return new an(au.IRIT, n.GROWING, (int)(var2 - var1[25]));
        }
        if (((int)var2 >= var1[27]) && ((int)var2 <= var1[28])) {
            return new an(au.IRIT, n.HARVESTABLE, var1[28] - var2);
        }
        if (((int)var2 >= var1[29]) && ((int)var2 <= var1[30])) {
            return new an(au.AVANTOE, n.GROWING, (int)(var2 - var1[29]));
        }
        if (((int)var2 >= var1[31]) && ((int)var2 <= var1[32])) {
            return new an(au.AVANTOE, n.HARVESTABLE, var1[32] - var2);
        }
        if (((int)var2 >= var1[33]) && ((int)var2 <= var1[34])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[35]) && ((int)var2 <= var1[36])) {
            return new an(au.KWUARM, n.GROWING, (int)(var2 - var1[35]));
        }
        if (((int)var2 >= var1[37]) && ((int)var2 <= var1[38])) {
            return new an(au.KWUARM, n.HARVESTABLE, var1[38] - var2);
        }
        if (((int)var2 >= var1[39]) && ((int)var2 <= var1[40])) {
            return new an(au.SNAPDRAGON, n.GROWING, (int)(var2 - var1[39]));
        }
        if (((int)var2 >= var1[41]) && ((int)var2 <= var1[42])) {
            return new an(au.SNAPDRAGON, n.HARVESTABLE, var1[42] - var2);
        }
        if (((int)var2 >= var1[43]) && ((int)var2 <= var1[44])) {
            return new an(au.CADANTINE, n.GROWING, (int)(var2 - var1[43]));
        }
        if (((int)var2 >= var1[45]) && ((int)var2 <= var1[46])) {
            return new an(au.CADANTINE, n.HARVESTABLE, var1[46] - var2);
        }
        if (((int)var2 >= var1[47]) && ((int)var2 <= var1[48])) {
            return new an(au.LANTADYME, n.GROWING, (int)(var2 - var1[47]));
        }
        if (((int)var2 >= var1[49]) && ((int)var2 <= var1[50])) {
            return new an(au.LANTADYME, n.HARVESTABLE, var1[50] - var2);
        }
        if (((int)var2 >= var1[51]) && ((int)var2 <= var1[52])) {
            return new an(au.DWARF_WEED, n.GROWING, (int)(var2 - var1[51]));
        }
        if (((int)var2 >= var1[53]) && ((int)var2 <= var1[54])) {
            return new an(au.DWARF_WEED, n.HARVESTABLE, var1[54] - var2);
        }
        if (((int)var2 >= var1[55]) && ((int)var2 <= var1[56])) {
            return new an(au.TORSTOL, n.GROWING, (int)(var2 - var1[55]));
        }
        if (((int)var2 >= var1[57]) && ((int)var2 <= var1[58])) {
            return new an(au.TORSTOL, n.HARVESTABLE, var1[58] - var2);
        }
        if (((int)var2 >= var1[59]) && ((int)var2 <= var1[60])) {
            return new an(au.GUAM, n.DISEASED, (int)(var2 - var1[61]));
        }
        if (((int)var2 >= var1[62]) && ((int)var2 <= var1[63])) {
            return new an(au.MARRENTILL, n.DISEASED, (int)(var2 - var1[60]));
        }
        if (((int)var2 >= var1[64]) && ((int)var2 <= var1[65])) {
            return new an(au.TARROMIN, n.DISEASED, (int)(var2 - var1[63]));
        }
        if (((int)var2 >= var1[66]) && ((int)var2 <= var1[67])) {
            return new an(au.HARRALANDER, n.DISEASED, (int)(var2 - var1[65]));
        }
        if (((int)var2 >= var1[68]) && ((int)var2 <= var1[69])) {
            return new an(au.RANARR, n.DISEASED, (int)(var2 - var1[67]));
        }
        if (((int)var2 >= var1[70]) && ((int)var2 <= var1[71])) {
            return new an(au.TOADFLAX, n.DISEASED, (int)(var2 - var1[69]));
        }
        if (((int)var2 >= var1[72]) && ((int)var2 <= var1[73])) {
            return new an(au.IRIT, n.DISEASED, (int)(var2 - var1[71]));
        }
        if (((int)var2 >= var1[74]) && ((int)var2 <= var1[75])) {
            return new an(au.AVANTOE, n.DISEASED, (int)(var2 - var1[73]));
        }
        if (((int)var2 >= var1[76]) && ((int)var2 <= var1[77])) {
            return new an(au.KWUARM, n.DISEASED, (int)(var2 - var1[75]));
        }
        if (((int)var2 >= var1[78]) && ((int)var2 <= var1[79])) {
            return new an(au.SNAPDRAGON, n.DISEASED, (int)(var2 - var1[77]));
        }
        if (((int)var2 >= var1[80]) && ((int)var2 <= var1[81])) {
            return new an(au.CADANTINE, n.DISEASED, (int)(var2 - var1[79]));
        }
        if (((int)var2 >= var1[82]) && ((int)var2 <= var1[83])) {
            return new an(au.LANTADYME, n.DISEASED, (int)(var2 - var1[81]));
        }
        if (((int)var2 >= var1[84]) && ((int)var2 <= var1[85])) {
            return new an(au.DWARF_WEED, n.DISEASED, (int)(var2 - var1[83]));
        }
        if (((int)var2 >= var1[86]) && ((int)var2 <= var1[87])) {
            return new an(au.TORSTOL, n.DISEASED, (int)(var2 - var1[85]));
        }
        if (((int)var2 >= var1[88]) && ((int)var2 <= var1[89])) {
            return new an(au.ANYHERB, n.DEAD, (int)(var2 - var1[87]));
        }
        if (((int)var2 >= var1[90]) && ((int)var2 <= var1[91])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[92]) && ((int)var2 <= var1[93])) {
            return new an(au.GOUTWEED, n.GROWING, (int)(var2 - var1[92]));
        }
        if (((int)var2 >= var1[94]) && ((int)var2 <= var1[95])) {
            return new an(au.GOUTWEED, n.HARVESTABLE, var1[95] - var2);
        }
        if (((int)var2 >= var1[96]) && ((int)var2 <= var1[97])) {
            return new an(au.GOUTWEED, n.DISEASED, (int)(var2 - var1[95]));
        }
        if (((int)var2 >= var1[98]) && ((int)var2 <= var1[99])) {
            return new an(au.GOUTWEED, n.DEAD, (int)(var2 - var1[97]));
        }
        if (((int)var2 >= var1[100]) && ((int)var2 <= var1[101])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        if (((int)var2 >= var1[102]) && ((int)var2 <= var1[103])) {
            return new an(au.WEEDS, n.GROWING, 0);
        }
        return null;
    }

    static {
        ah.var3();
    }
}

