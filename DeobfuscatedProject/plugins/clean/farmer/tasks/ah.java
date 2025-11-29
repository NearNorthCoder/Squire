/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class ah
extends GameEnum19 {

    private static boolean llllIIIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    ah(A a2, String string2, String string3, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ah.llllIIIIllllIl(n2) && ah.llllIIIIlllllI(n2, llIIIIIIlIII[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIlIII[0] - n2);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[1]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[2])) {
            return new an(au.GUAM, n.GROWING, (int)(var1 - llIIIIIIlIII[1]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[3]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[4])) {
            return new an(au.GUAM, n.HARVESTABLE, llIIIIIIlIII[4] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[5]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[6])) {
            return new an(au.MARRENTILL, n.GROWING, (int)(var1 - llIIIIIIlIII[5]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[7]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[8])) {
            return new an(au.MARRENTILL, n.HARVESTABLE, llIIIIIIlIII[8] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[9]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[10])) {
            return new an(au.TARROMIN, n.GROWING, (int)(var1 - llIIIIIIlIII[9]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[11]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[12])) {
            return new an(au.TARROMIN, n.HARVESTABLE, llIIIIIIlIII[12] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[13]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[14])) {
            return new an(au.HARRALANDER, n.GROWING, (int)(var1 - llIIIIIIlIII[13]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[15]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[16])) {
            return new an(au.HARRALANDER, n.HARVESTABLE, llIIIIIIlIII[16] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[17]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[18])) {
            return new an(au.RANARR, n.GROWING, (int)(var1 - llIIIIIIlIII[17]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[19]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[20])) {
            return new an(au.RANARR, n.HARVESTABLE, llIIIIIIlIII[20] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[21]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[22])) {
            return new an(au.TOADFLAX, n.GROWING, (int)(var1 - llIIIIIIlIII[21]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[23]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[24])) {
            return new an(au.TOADFLAX, n.HARVESTABLE, llIIIIIIlIII[24] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[25]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[26])) {
            return new an(au.IRIT, n.GROWING, (int)(var1 - llIIIIIIlIII[25]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[27]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[28])) {
            return new an(au.IRIT, n.HARVESTABLE, llIIIIIIlIII[28] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[29]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[30])) {
            return new an(au.AVANTOE, n.GROWING, (int)(var1 - llIIIIIIlIII[29]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[31]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[32])) {
            return new an(au.AVANTOE, n.HARVESTABLE, llIIIIIIlIII[32] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[33]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[34])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIlIII[0]);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[35]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[36])) {
            return new an(au.KWUARM, n.GROWING, (int)(var1 - llIIIIIIlIII[35]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[37]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[38])) {
            return new an(au.KWUARM, n.HARVESTABLE, llIIIIIIlIII[38] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[39]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[40])) {
            return new an(au.SNAPDRAGON, n.GROWING, (int)(var1 - llIIIIIIlIII[39]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[41]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[42])) {
            return new an(au.SNAPDRAGON, n.HARVESTABLE, llIIIIIIlIII[42] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[43]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[44])) {
            return new an(au.CADANTINE, n.GROWING, (int)(var1 - llIIIIIIlIII[43]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[45]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[46])) {
            return new an(au.CADANTINE, n.HARVESTABLE, llIIIIIIlIII[46] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[47]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[48])) {
            return new an(au.LANTADYME, n.GROWING, (int)(var1 - llIIIIIIlIII[47]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[49]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[50])) {
            return new an(au.LANTADYME, n.HARVESTABLE, llIIIIIIlIII[50] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[51]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[52])) {
            return new an(au.DWARF_WEED, n.GROWING, (int)(var1 - llIIIIIIlIII[51]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[53]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[54])) {
            return new an(au.DWARF_WEED, n.HARVESTABLE, llIIIIIIlIII[54] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[55]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[56])) {
            return new an(au.TORSTOL, n.GROWING, (int)(var1 - llIIIIIIlIII[55]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[57]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[58])) {
            return new an(au.TORSTOL, n.HARVESTABLE, llIIIIIIlIII[58] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[59]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[60])) {
            return new an(au.GUAM, n.DISEASED, (int)(var1 - llIIIIIIlIII[61]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[62]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[63])) {
            return new an(au.MARRENTILL, n.DISEASED, (int)(var1 - llIIIIIIlIII[60]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[64]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[65])) {
            return new an(au.TARROMIN, n.DISEASED, (int)(var1 - llIIIIIIlIII[63]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[66]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[67])) {
            return new an(au.HARRALANDER, n.DISEASED, (int)(var1 - llIIIIIIlIII[65]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[68]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[69])) {
            return new an(au.RANARR, n.DISEASED, (int)(var1 - llIIIIIIlIII[67]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[70]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[71])) {
            return new an(au.TOADFLAX, n.DISEASED, (int)(var1 - llIIIIIIlIII[69]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[72]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[73])) {
            return new an(au.IRIT, n.DISEASED, (int)(var1 - llIIIIIIlIII[71]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[74]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[75])) {
            return new an(au.AVANTOE, n.DISEASED, (int)(var1 - llIIIIIIlIII[73]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[76]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[77])) {
            return new an(au.KWUARM, n.DISEASED, (int)(var1 - llIIIIIIlIII[75]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[78]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[79])) {
            return new an(au.SNAPDRAGON, n.DISEASED, (int)(var1 - llIIIIIIlIII[77]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[80]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[81])) {
            return new an(au.CADANTINE, n.DISEASED, (int)(var1 - llIIIIIIlIII[79]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[82]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[83])) {
            return new an(au.LANTADYME, n.DISEASED, (int)(var1 - llIIIIIIlIII[81]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[84]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[85])) {
            return new an(au.DWARF_WEED, n.DISEASED, (int)(var1 - llIIIIIIlIII[83]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[86]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[87])) {
            return new an(au.TORSTOL, n.DISEASED, (int)(var1 - llIIIIIIlIII[85]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[88]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[89])) {
            return new an(au.ANYHERB, n.DEAD, (int)(var1 - llIIIIIIlIII[87]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[90]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[91])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIlIII[0]);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[92]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[93])) {
            return new an(au.GOUTWEED, n.GROWING, (int)(var1 - llIIIIIIlIII[92]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[94]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[95])) {
            return new an(au.GOUTWEED, n.HARVESTABLE, llIIIIIIlIII[95] - var1);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[96]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[97])) {
            return new an(au.GOUTWEED, n.DISEASED, (int)(var1 - llIIIIIIlIII[95]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[98]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[99])) {
            return new an(au.GOUTWEED, n.DEAD, (int)(var1 - llIIIIIIlIII[97]));
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[100]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[101])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIlIII[0]);
        }
        if (ah.llllIIIIllllll((int)var1, llIIIIIIlIII[102]) && ah.llllIIIIlllllI((int)var1, llIIIIIIlIII[103])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIIlIII[0]);
        }
        return null;
    }

    private static boolean llllIIIIllllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIIIllllIl(int n2) {
        return n2 >= 0;
    }

    static {
        ah.llllIIIIllllII();
    }
}

