/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class AIHelper
extends GameEnum19 {

    static {
        ai.llllIIllIlIIll();
    }

    AIHelper(A a2, String string2, boolean bl) {
    }

    private static boolean llllIIllIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllIIllIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllIIllIlIlII(int n2) {
        return n2 >= 0;
    }

    private static boolean llllIIllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ai.llllIIllIlIlII(n2) && ai.llllIIllIlIlIl(n2, llIIIIlllIIl[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0] - n2);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[1]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[3]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[4])) {
            return new an(au.MARIGOLD, n.GROWING, (int)(var1 - llIIIIlllIIl[3]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[5])) {
            return new an(au.MARIGOLD, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[7]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[8])) {
            return new an(au.ROSEMARY, n.GROWING, (int)(var1 - llIIIIlllIIl[7]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[9])) {
            return new an(au.ROSEMARY, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[10]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[11])) {
            return new an(au.NASTURTIUM, n.GROWING, (int)(var1 - llIIIIlllIIl[10]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[12])) {
            return new an(au.NASTURTIUM, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[13]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[14])) {
            return new an(au.WOAD, n.GROWING, (int)(var1 - llIIIIlllIIl[13]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[15])) {
            return new an(au.WOAD, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[16]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[17])) {
            return new an(au.LIMPWURT, n.GROWING, (int)(var1 - llIIIIlllIIl[16]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[18])) {
            return new an(au.LIMPWURT, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[19]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[20])) {
            return new an(au.SCARECROW, n.GROWING, llIIIIlllIIl[20] - var1);
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[21])) {
            return new an(au.SCARECROW, n.GROWING, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[22]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[23])) {
            return new an(au.WHITE_LILY, n.GROWING, (int)(var1 - llIIIIlllIIl[22]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[24])) {
            return new an(au.WHITE_LILY, n.HARVESTABLE, llIIIIlllIIl[6]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[25]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[26])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[27]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[28])) {
            return new an(au.MARIGOLD, n.GROWING, (int)(var1 - llIIIIlllIIl[27]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[29])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[30]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[31])) {
            return new an(au.ROSEMARY, n.GROWING, (int)(var1 - llIIIIlllIIl[30]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[32])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[33]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[34])) {
            return new an(au.NASTURTIUM, n.GROWING, (int)(var1 - llIIIIlllIIl[33]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[35])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[36]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[37])) {
            return new an(au.WOAD, n.GROWING, (int)(var1 - llIIIIlllIIl[36]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[38])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[39]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[40])) {
            return new an(au.LIMPWURT, n.GROWING, (int)(var1 - llIIIIlllIIl[39]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[41]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[42])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[43]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[44])) {
            return new an(au.WHITE_LILY, n.GROWING, (int)(var1 - llIIIIlllIIl[43]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[45]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[46])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[47]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[48])) {
            return new an(au.MARIGOLD, n.DISEASED, (int)(var1 - llIIIIlllIIl[46]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[49]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[50])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[51]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[52])) {
            return new an(au.ROSEMARY, n.DISEASED, (int)(var1 - llIIIIlllIIl[50]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[53]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[54])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[55]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[56])) {
            return new an(au.NASTURTIUM, n.DISEASED, (int)(var1 - llIIIIlllIIl[54]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[57]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[58])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[59]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[60])) {
            return new an(au.WOAD, n.DISEASED, (int)(var1 - llIIIIlllIIl[58]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[61]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[62])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[63]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[64])) {
            return new an(au.LIMPWURT, n.DISEASED, (int)(var1 - llIIIIlllIIl[62]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[65]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[66])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[67]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[68])) {
            return new an(au.WHITE_LILY, n.DISEASED, (int)(var1 - llIIIIlllIIl[66]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[69]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[70])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[71]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[72])) {
            return new an(au.MARIGOLD, n.DEAD, (int)(var1 - llIIIIlllIIl[70]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[73])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[74]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[75])) {
            return new an(au.ROSEMARY, n.DEAD, (int)(var1 - llIIIIlllIIl[73]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[76])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[77]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[78])) {
            return new an(au.NASTURTIUM, n.DEAD, (int)(var1 - llIIIIlllIIl[76]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[79])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[80]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[81])) {
            return new an(au.WOAD, n.DEAD, (int)(var1 - llIIIIlllIIl[79]));
        }
        if (ai.llllIIllIlIlll((int)var1, llIIIIlllIIl[82])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[83]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[84])) {
            return new an(au.LIMPWURT, n.DEAD, (int)(var1 - llIIIIlllIIl[82]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[85]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[86])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[87]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[88])) {
            return new an(au.WHITE_LILY, n.DEAD, (int)(var1 - llIIIIlllIIl[86]));
        }
        if (ai.llllIIllIlIllI((int)var1, llIIIIlllIIl[89]) && ai.llllIIllIlIlIl((int)var1, llIIIIlllIIl[90])) {
            return new an(au.WEEDS, n.GROWING, llIIIIlllIIl[0]);
        }
        return null;
    }
}

