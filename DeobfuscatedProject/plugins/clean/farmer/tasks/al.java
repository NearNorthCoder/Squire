/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class al
extends GameEnum19 {

    private static boolean lllIlllIllIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlllIllIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    al(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (al.lllIlllIllIIIl(n2) && al.lllIlllIllIIlI(n2, lIllllIllIll[0])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0] - n2);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[1]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[2])) {
            return new an(au.HAMMERSTONE, n.GROWING, (int)(var1 - lIllllIllIll[1]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[3]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[4])) {
            return new an(au.HAMMERSTONE, n.HARVESTABLE, (int)(var1 - lIllllIllIll[3]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[5]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[6])) {
            return new an(au.ASGARNIAN, n.GROWING, (int)(var1 - lIllllIllIll[5]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[7]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[8])) {
            return new an(au.ASGARNIAN, n.HARVESTABLE, (int)(var1 - lIllllIllIll[7]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[9]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[10])) {
            return new an(au.YANILLIAN, n.GROWING, (int)(var1 - lIllllIllIll[9]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[11]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[12])) {
            return new an(au.YANILLIAN, n.HARVESTABLE, (int)(var1 - lIllllIllIll[11]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[13]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[14])) {
            return new an(au.KRANDORIAN, n.GROWING, (int)(var1 - lIllllIllIll[13]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[15]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[16])) {
            return new an(au.KRANDORIAN, n.HARVESTABLE, (int)(var1 - lIllllIllIll[15]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[17]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[18])) {
            return new an(au.WILDBLOOD, n.GROWING, (int)(var1 - lIllllIllIll[17]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[19]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[20])) {
            return new an(au.WILDBLOOD, n.HARVESTABLE, (int)(var1 - lIllllIllIll[19]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[21]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[22])) {
            return new an(au.BARLEY, n.GROWING, (int)(var1 - lIllllIllIll[21]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[23]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[24])) {
            return new an(au.BARLEY, n.HARVESTABLE, (int)(var1 - lIllllIllIll[23]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[25]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[26])) {
            return new an(au.JUTE, n.GROWING, (int)(var1 - lIllllIllIll[25]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[27]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[28])) {
            return new an(au.JUTE, n.HARVESTABLE, (int)(var1 - lIllllIllIll[27]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[29]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[30])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[31]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[32])) {
            return new an(au.HAMMERSTONE, n.GROWING, (int)(var1 - lIllllIllIll[31]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[33]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[34])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[35]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[36])) {
            return new an(au.ASGARNIAN, n.GROWING, (int)(var1 - lIllllIllIll[35]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[37]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[38])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[39]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[40])) {
            return new an(au.YANILLIAN, n.GROWING, (int)(var1 - lIllllIllIll[39]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[41]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[42])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[43]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[44])) {
            return new an(au.KRANDORIAN, n.GROWING, (int)(var1 - lIllllIllIll[43]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[45]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[46])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[47]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[48])) {
            return new an(au.WILDBLOOD, n.GROWING, (int)(var1 - lIllllIllIll[47]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[49]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[50])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[51]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[52])) {
            return new an(au.BARLEY, n.GROWING, (int)(var1 - lIllllIllIll[51]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[53]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[54])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[55]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[56])) {
            return new an(au.JUTE, n.GROWING, (int)(var1 - lIllllIllIll[55]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[57]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[58])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[59]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[60])) {
            return new an(au.HAMMERSTONE, n.DISEASED, (int)(var1 - lIllllIllIll[58]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[61]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[62])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[63]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[64])) {
            return new an(au.ASGARNIAN, n.DISEASED, (int)(var1 - lIllllIllIll[62]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[65]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[66])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[67]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[68])) {
            return new an(au.YANILLIAN, n.DISEASED, (int)(var1 - lIllllIllIll[66]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[69]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[70])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[71]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[72])) {
            return new an(au.KRANDORIAN, n.DISEASED, (int)(var1 - lIllllIllIll[70]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[73]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[74])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[75]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[76])) {
            return new an(au.WILDBLOOD, n.DISEASED, (int)(var1 - lIllllIllIll[74]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[77]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[78])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[79]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[80])) {
            return new an(au.BARLEY, n.DISEASED, (int)(var1 - lIllllIllIll[78]));
        }
        if (al.lllIlllIllIlII((int)var1, lIllllIllIll[81])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[82]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[83])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[84]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[85])) {
            return new an(au.JUTE, n.DISEASED, (int)(var1 - lIllllIllIll[83]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[86]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[87])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[88]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[89])) {
            return new an(au.HAMMERSTONE, n.DEAD, (int)(var1 - lIllllIllIll[87]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[90]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[91])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[92]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[93])) {
            return new an(au.ASGARNIAN, n.DEAD, (int)(var1 - lIllllIllIll[91]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[94]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[95])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[96]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[97])) {
            return new an(au.YANILLIAN, n.DEAD, (int)(var1 - lIllllIllIll[95]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[98]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[99])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[100]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[101])) {
            return new an(au.KRANDORIAN, n.DEAD, (int)(var1 - lIllllIllIll[99]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[102]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[103])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[104]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[105])) {
            return new an(au.WILDBLOOD, n.DEAD, (int)(var1 - lIllllIllIll[103]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[106]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[107])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[108]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[109])) {
            return new an(au.BARLEY, n.DEAD, (int)(var1 - lIllllIllIll[107]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[110]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[111])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[112]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[113])) {
            return new an(au.JUTE, n.DEAD, (int)(var1 - lIllllIllIll[111]));
        }
        if (al.lllIlllIllIIll((int)var1, lIllllIllIll[114]) && al.lllIlllIllIIlI((int)var1, lIllllIllIll[115])) {
            return new an(au.WEEDS, n.GROWING, lIllllIllIll[0]);
        }
        return null;
    }

    private static boolean lllIlllIllIIIl(int n2) {
        return n2 >= 0;
    }

    static {
        al.lllIlllIllIIII();
    }
}

