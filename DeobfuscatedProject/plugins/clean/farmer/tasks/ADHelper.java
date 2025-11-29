/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class ADHelper
extends GameEnum19 {

    private static boolean lllIlIllllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIlllllIII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        ad.lllIlIllllIIll();
    }

    private static boolean lllIlIllllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIlIllllIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIllllIllI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (ad.lllIlIllllIlII(n2)) {
            return new an(au.EMPTY_COMPOST_BIN, n.EMPTY, lIlllIIllIll[0]);
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[1]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[2])) {
            return new an(au.COMPOST, n.FILLING, (int)(var1 - lIlllIIllIll[1]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[3]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[4])) {
            return new an(au.COMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[3]));
        }
        if (!ad.lllIlIllllIlll((int)var1, lIlllIIllIll[5]) || ad.lllIlIlllllIII((int)var1, lIlllIIllIll[6])) {
            return new an(au.COMPOST, n.GROWING, (int)(var1 - lIlllIIllIll[5]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[7]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[8])) {
            return new an(au.SUPERCOMPOST, n.FILLING, (int)(var1 - lIlllIIllIll[7]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[9]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[10])) {
            return new an(au.SUPERCOMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[9]));
        }
        if (ad.lllIlIlllllIII((int)var1, lIlllIIllIll[11])) {
            return new an(au.COMPOST, n.GROWING, au.COMPOST.bc() - lIlllIIllIll[1]);
        }
        if (!ad.lllIlIllllIlll((int)var1, lIlllIIllIll[12]) || ad.lllIlIlllllIII((int)var1, lIlllIIllIll[13])) {
            return new an(au.SUPERCOMPOST, n.GROWING, (int)(var1 - lIlllIIllIll[12]));
        }
        if (ad.lllIlIlllllIII((int)var1, lIlllIIllIll[14])) {
            return new an(au.SUPERCOMPOST, n.GROWING, au.SUPERCOMPOST.bc() - lIlllIIllIll[1]);
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[15]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[16])) {
            return new an(au.ROTTEN_TOMATO, n.FILLING, (int)(var1 - lIlllIIllIll[15]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[17]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[18])) {
            return new an(au.ROTTEN_TOMATO, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[17]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[19]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[20])) {
            return new an(au.ROTTEN_TOMATO, n.GROWING, (int)(var1 - lIlllIIllIll[19]));
        }
        if (ad.lllIlIllllIlIl((int)var1, lIlllIIllIll[21]) && ad.lllIlIllllIllI((int)var1, lIlllIIllIll[22])) {
            return new an(au.ULTRACOMPOST, n.HARVESTABLE, (int)(var1 - lIlllIIllIll[21]));
        }
        return null;
    }

    ADHelper(A a2, String string2, boolean bl) {
    }
}

