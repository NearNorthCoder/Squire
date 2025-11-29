/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class R
extends GameEnum19 {

    private static boolean llllIlIlIllIll(int n2, int n3) {
        return n2 == n3;
    }

    R(A a2, String string2, boolean bl) {
    }

    private static boolean llllIlIlIllIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        R.llllIlIlIlIlll();
    }

    private static boolean llllIlIlIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (R.llllIlIlIllIII(n2) && R.llllIlIlIllIIl(n2, llIIIlIllIll[0])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0] - n2);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[1]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[2])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[3]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[4])) {
            return new an(au.OAK, n.GROWING, (int)(var1 - llIIIlIllIll[3]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[5])) {
            return new an(au.OAK, n.GROWING, au.OAK.bc() - llIIIlIllIll[6]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[7])) {
            return new an(au.OAK, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[9])) {
            return new an(au.OAK, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[10]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[11])) {
            return new an(au.WILLOW, n.GROWING, (int)(var1 - llIIIlIllIll[10]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[12])) {
            return new an(au.WILLOW, n.GROWING, au.WILLOW.bc() - llIIIlIllIll[6]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[13])) {
            return new an(au.WILLOW, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[14])) {
            return new an(au.WILLOW, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[15]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[16])) {
            return new an(au.MAPLE, n.GROWING, (int)(var1 - llIIIlIllIll[15]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[17])) {
            return new an(au.MAPLE, n.GROWING, au.MAPLE.bc() - llIIIlIllIll[6]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[18])) {
            return new an(au.MAPLE, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[19])) {
            return new an(au.MAPLE, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[20]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[21])) {
            return new an(au.YEW, n.GROWING, (int)(var1 - llIIIlIllIll[20]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[22])) {
            return new an(au.YEW, n.GROWING, au.YEW.bc() - llIIIlIllIll[6]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[23])) {
            return new an(au.YEW, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[24])) {
            return new an(au.YEW, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[25]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[26])) {
            return new an(au.MAGIC, n.GROWING, (int)(var1 - llIIIlIllIll[25]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[27])) {
            return new an(au.MAGIC, n.GROWING, au.MAGIC.bc() - llIIIlIllIll[6]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[28])) {
            return new an(au.MAGIC, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[29])) {
            return new an(au.MAGIC, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[30]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[31])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[32]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[33])) {
            return new an(au.OAK, n.DISEASED, (int)(var1 - llIIIlIllIll[31]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[34])) {
            return new an(au.OAK, n.DISEASED, llIIIlIllIll[1]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[35]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[36])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[37]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[38])) {
            return new an(au.WILLOW, n.DISEASED, (int)(var1 - llIIIlIllIll[36]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[39])) {
            return new an(au.WILLOW, n.DISEASED, llIIIlIllIll[40]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[41]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[42])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[43]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[44])) {
            return new an(au.MAPLE, n.DISEASED, (int)(var1 - llIIIlIllIll[42]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[45])) {
            return new an(au.MAPLE, n.DISEASED, llIIIlIllIll[3]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[46]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[47])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[48]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[49])) {
            return new an(au.YEW, n.DISEASED, (int)(var1 - llIIIlIllIll[47]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[50])) {
            return new an(au.YEW, n.DISEASED, llIIIlIllIll[51]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[52]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[53])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[54]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[55])) {
            return new an(au.MAGIC, n.DISEASED, (int)(var1 - llIIIlIllIll[53]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[56])) {
            return new an(au.MAGIC, n.DISEASED, llIIIlIllIll[5]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[57]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[58])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[59]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[60])) {
            return new an(au.OAK, n.DEAD, (int)(var1 - llIIIlIllIll[58]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[61])) {
            return new an(au.OAK, n.DEAD, llIIIlIllIll[1]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[62]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[63])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[64]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[65])) {
            return new an(au.WILLOW, n.DEAD, (int)(var1 - llIIIlIllIll[63]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[66])) {
            return new an(au.WILLOW, n.DEAD, llIIIlIllIll[40]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[67]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[68])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[69]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[70])) {
            return new an(au.MAPLE, n.DEAD, (int)(var1 - llIIIlIllIll[68]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[71])) {
            return new an(au.MAPLE, n.DEAD, llIIIlIllIll[3]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[72]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[73])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[74]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[75])) {
            return new an(au.YEW, n.DEAD, (int)(var1 - llIIIlIllIll[73]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[76])) {
            return new an(au.YEW, n.DEAD, llIIIlIllIll[51]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[77]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[78])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[79]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[80])) {
            return new an(au.MAGIC, n.DEAD, (int)(var1 - llIIIlIllIll[78]));
        }
        if (R.llllIlIlIllIll((int)var1, llIIIlIllIll[81])) {
            return new an(au.MAGIC, n.DEAD, llIIIlIllIll[5]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[82]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[83])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[84]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[85])) {
            return new an(au.WILLOW, n.HARVESTABLE, llIIIlIllIll[8]);
        }
        if (R.llllIlIlIllIlI((int)var1, llIIIlIllIll[86]) && R.llllIlIlIllIIl((int)var1, llIIIlIllIll[87])) {
            return new an(au.WEEDS, n.GROWING, llIIIlIllIll[0]);
        }
        return null;
    }

    private static boolean llllIlIlIllIII(int n2) {
        return n2 >= 0;
    }
}

