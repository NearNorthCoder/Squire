/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class AGHelper
extends GameEnum19 {

    static {
        ag.lllIllIIllIIII();
    }

    private static boolean lllIllIIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllIllIIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIllIIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIllIIllIIIl(int n2) {
        return n2 >= 0;
    }

    AGHelper(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ag.lllIllIIllIIIl(n2) && ag.lllIllIIllIIlI(n2, lIlllIllIIII[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0] - n2);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[1]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[3]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[4])) {
            return new an(au.POTATO, n.GROWING, (int)(var1 - lIlllIllIIII[3]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[5]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[6])) {
            return new an(au.POTATO, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[5]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[7]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[8])) {
            return new an(au.ONION, n.GROWING, (int)(var1 - lIlllIllIIII[7]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[9]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[10])) {
            return new an(au.ONION, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[9]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[11]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[12])) {
            return new an(au.CABBAGE, n.GROWING, (int)(var1 - lIlllIllIIII[11]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[13]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[14])) {
            return new an(au.CABBAGE, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[13]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[15]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[16])) {
            return new an(au.TOMATO, n.GROWING, (int)(var1 - lIlllIllIIII[15]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[17]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[18])) {
            return new an(au.TOMATO, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[17]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[19]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[20])) {
            return new an(au.SWEETCORN, n.GROWING, (int)(var1 - lIlllIllIIII[19]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[21]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[22])) {
            return new an(au.SWEETCORN, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[21]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[23]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[24])) {
            return new an(au.STRAWBERRY, n.GROWING, (int)(var1 - lIlllIllIIII[23]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[25]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[26])) {
            return new an(au.STRAWBERRY, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[25]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[27]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[28])) {
            return new an(au.WATERMELON, n.GROWING, (int)(var1 - lIlllIllIIII[27]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[29]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[30])) {
            return new an(au.WATERMELON, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[29]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[31]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[32])) {
            return new an(au.SNAPE_GRASS, n.GROWING, (int)(var1 - lIlllIllIIII[31]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[33]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[34])) {
            return new an(au.POTATO, n.GROWING, (int)(var1 - lIlllIllIIII[33]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[35]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[36])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[37]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[38])) {
            return new an(au.ONION, n.GROWING, (int)(var1 - lIlllIllIIII[37]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[39]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[40])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[41]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[42])) {
            return new an(au.CABBAGE, n.GROWING, (int)(var1 - lIlllIllIIII[41]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[43]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[44])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[45]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[46])) {
            return new an(au.TOMATO, n.GROWING, (int)(var1 - lIlllIllIIII[45]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[47]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[48])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[49]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[50])) {
            return new an(au.SWEETCORN, n.GROWING, (int)(var1 - lIlllIllIIII[49]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[51]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[52])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[53]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[54])) {
            return new an(au.STRAWBERRY, n.GROWING, (int)(var1 - lIlllIllIIII[53]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[55]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[56])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[57]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[58])) {
            return new an(au.WATERMELON, n.GROWING, (int)(var1 - lIlllIllIIII[57]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[59]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[60])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[61]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[62])) {
            return new an(au.SNAPE_GRASS, n.GROWING, (int)(var1 - lIlllIllIIII[61]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[63]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[64])) {
            return new an(au.POTATO, n.DISEASED, (int)(var1 - lIlllIllIIII[62]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[65]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[66])) {
            return new an(au.SNAPE_GRASS, n.HARVESTABLE, (int)(var1 - lIlllIllIIII[65]));
        }
        if (ag.lllIllIIllIlII((int)var1, lIlllIllIIII[67])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[68]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[69])) {
            return new an(au.ONION, n.DISEASED, (int)(var1 - lIlllIllIIII[67]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[70]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[71])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[72]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[73])) {
            return new an(au.CABBAGE, n.DISEASED, (int)(var1 - lIlllIllIIII[71]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[74]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[75])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[76]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[77])) {
            return new an(au.TOMATO, n.DISEASED, (int)(var1 - lIlllIllIIII[75]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[78]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[79])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[80]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[81])) {
            return new an(au.SWEETCORN, n.DISEASED, (int)(var1 - lIlllIllIIII[79]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[82]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[83])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[84]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[85])) {
            return new an(au.STRAWBERRY, n.DISEASED, (int)(var1 - lIlllIllIIII[83]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[86]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[87])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[88]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[89])) {
            return new an(au.WATERMELON, n.DISEASED, (int)(var1 - lIlllIllIIII[87]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[90]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[91])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[92]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[93])) {
            return new an(au.SNAPE_GRASS, n.DEAD, (int)(var1 - lIlllIllIIII[91]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[94]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[95])) {
            return new an(au.SNAPE_GRASS, n.DISEASED, (int)(var1 - lIlllIllIIII[93]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[96]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[97])) {
            return new an(au.POTATO, n.DEAD, (int)(var1 - lIlllIllIIII[95]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[98]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[99])) {
            return new an(au.SNAPE_GRASS, n.DISEASED, lIlllIllIIII[0] + var1 - lIlllIllIIII[97]);
        }
        if (ag.lllIllIIllIlII((int)var1, lIlllIllIIII[100])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[101]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[102])) {
            return new an(au.ONION, n.DEAD, (int)(var1 - lIlllIllIIII[100]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[103]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[104])) {
            return new an(au.SNAPE_GRASS, n.DEAD, lIlllIllIIII[0] + var1 - lIlllIllIIII[102]);
        }
        if (ag.lllIllIIllIlII((int)var1, lIlllIllIIII[105])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[106]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[107])) {
            return new an(au.CABBAGE, n.DEAD, (int)(var1 - lIlllIllIIII[105]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[108]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[109])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[110]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[111])) {
            return new an(au.TOMATO, n.DEAD, (int)(var1 - lIlllIllIIII[109]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[112]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[113])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[114]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[115])) {
            return new an(au.SWEETCORN, n.DEAD, (int)(var1 - lIlllIllIIII[113]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[116]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[117])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[118]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[119])) {
            return new an(au.STRAWBERRY, n.DEAD, (int)(var1 - lIlllIllIIII[117]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[120]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[121])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[122]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[123])) {
            return new an(au.WATERMELON, n.DEAD, (int)(var1 - lIlllIllIIII[121]));
        }
        if (ag.lllIllIIllIIll((int)var1, lIlllIllIIII[124]) && ag.lllIllIIllIIlI((int)var1, lIlllIllIIII[125])) {
            return new an(au.WEEDS, n.GROWING, lIlllIllIIII[0]);
        }
        return null;
    }
}

