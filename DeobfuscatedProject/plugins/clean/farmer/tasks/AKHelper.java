/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class AKHelper
extends GameEnum19 {

    AKHelper(A a2, String string2, boolean bl) {
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ak.llllIIIlIlllII(n2) && ak.llllIIIlIlllIl(n2, llIIIIIlIIlI[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0] - n2);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[1]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[3]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[4])) {
            return new an(au.APPLE, n.GROWING, (int)(var1 - llIIIIIlIIlI[3]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[5]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[6])) {
            return new an(au.APPLE, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[5]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[7]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[8])) {
            return new an(au.APPLE, n.DISEASED, (int)(var1 - llIIIIIlIIlI[6]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[9]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[10])) {
            return new an(au.APPLE, n.DEAD, (int)(var1 - llIIIIIlIIlI[8]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[11])) {
            return new an(au.APPLE, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[13])) {
            return new an(au.APPLE, n.GROWING, au.APPLE.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[15]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[16])) {
            return new an(au.BANANA, n.GROWING, (int)(var1 - llIIIIIlIIlI[15]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[17]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[18])) {
            return new an(au.BANANA, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[17]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[19]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[20])) {
            return new an(au.BANANA, n.DISEASED, (int)(var1 - llIIIIIlIIlI[18]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[21]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[22])) {
            return new an(au.BANANA, n.DEAD, (int)(var1 - llIIIIIlIIlI[20]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[23])) {
            return new an(au.BANANA, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[24])) {
            return new an(au.BANANA, n.GROWING, au.BANANA.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[25]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[26])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[27]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[28])) {
            return new an(au.ORANGE, n.GROWING, (int)(var1 - llIIIIIlIIlI[27]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[29]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[30])) {
            return new an(au.ORANGE, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[29]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[31]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[32])) {
            return new an(au.ORANGE, n.DISEASED, (int)(var1 - llIIIIIlIIlI[30]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[33])) {
            return new an(au.ORANGE, n.DISEASED, llIIIIIlIIlI[34]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[35]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[36])) {
            return new an(au.ORANGE, n.DEAD, (int)(var1 - llIIIIIlIIlI[33]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[37])) {
            return new an(au.ORANGE, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[38])) {
            return new an(au.ORANGE, n.GROWING, au.ORANGE.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[39]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[40])) {
            return new an(au.CURRY, n.GROWING, (int)(var1 - llIIIIIlIIlI[39]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[41]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[42])) {
            return new an(au.CURRY, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[41]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[43]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[44])) {
            return new an(au.CURRY, n.DISEASED, (int)(var1 - llIIIIIlIIlI[42]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[45]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[46])) {
            return new an(au.CURRY, n.DEAD, (int)(var1 - llIIIIIlIIlI[44]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[47])) {
            return new an(au.CURRY, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[48])) {
            return new an(au.CURRY, n.GROWING, au.CURRY.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[49]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[50])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[51]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[52])) {
            return new an(au.PINEAPPLE, n.GROWING, (int)(var1 - llIIIIIlIIlI[51]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[53]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[54])) {
            return new an(au.PINEAPPLE, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[53]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[55]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[56])) {
            return new an(au.PINEAPPLE, n.DISEASED, (int)(var1 - llIIIIIlIIlI[54]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[57]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[58])) {
            return new an(au.PINEAPPLE, n.DEAD, (int)(var1 - llIIIIIlIIlI[56]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[59])) {
            return new an(au.PINEAPPLE, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[60])) {
            return new an(au.PINEAPPLE, n.GROWING, au.PINEAPPLE.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[61]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[62])) {
            return new an(au.PAPAYA, n.GROWING, (int)(var1 - llIIIIIlIIlI[61]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[63]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[64])) {
            return new an(au.PAPAYA, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[63]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[65]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[66])) {
            return new an(au.PAPAYA, n.DISEASED, (int)(var1 - llIIIIIlIIlI[64]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[67]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[68])) {
            return new an(au.PAPAYA, n.DEAD, (int)(var1 - llIIIIIlIIlI[66]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[69])) {
            return new an(au.PAPAYA, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[70])) {
            return new an(au.PAPAYA, n.GROWING, au.PAPAYA.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[71]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[72])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[73]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[74])) {
            return new an(au.PALM, n.GROWING, (int)(var1 - llIIIIIlIIlI[73]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[75]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[76])) {
            return new an(au.PALM, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[75]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[77]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[78])) {
            return new an(au.PALM, n.DISEASED, (int)(var1 - llIIIIIlIIlI[76]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[79]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[80])) {
            return new an(au.PALM, n.DEAD, (int)(var1 - llIIIIIlIIlI[78]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[81])) {
            return new an(au.PALM, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[82])) {
            return new an(au.PALM, n.GROWING, au.PALM.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[83]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[84])) {
            return new an(au.DRAGONFRUIT, n.GROWING, (int)(var1 - llIIIIIlIIlI[83]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[85]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[86])) {
            return new an(au.DRAGONFRUIT, n.HARVESTABLE, (int)(var1 - llIIIIIlIIlI[85]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[87]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[88])) {
            return new an(au.DRAGONFRUIT, n.DISEASED, (int)(var1 - llIIIIIlIIlI[86]));
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[89]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[90])) {
            return new an(au.DRAGONFRUIT, n.DEAD, (int)(var1 - llIIIIIlIIlI[88]));
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[91])) {
            return new an(au.DRAGONFRUIT, n.HARVESTABLE, llIIIIIlIIlI[12]);
        }
        if (ak.llllIIIlIlllll((int)var1, llIIIIIlIIlI[92])) {
            return new an(au.DRAGONFRUIT, n.GROWING, au.DRAGONFRUIT.bc() - llIIIIIlIIlI[14]);
        }
        if (ak.llllIIIlIllllI((int)var1, llIIIIIlIIlI[93]) && ak.llllIIIlIlllIl((int)var1, llIIIIIlIIlI[94])) {
            return new an(au.WEEDS, n.GROWING, llIIIIIlIIlI[0]);
        }
        return null;
    }

    static {
        ak.llllIIIlIllIll();
    }

    private static boolean llllIIIlIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIIIlIlllII(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllIIIlIllllI(int n2, int n3) {
        return n2 >= n3;
    }
}

