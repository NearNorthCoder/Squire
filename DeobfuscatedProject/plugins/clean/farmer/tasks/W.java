/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum56;
import gg.squire.farmer.tasks.GameEnum19;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.GameEnum4;
import gg.squire.farmer.tasks.GameEnum13;

final class W
extends GameEnum19 {

    private static boolean lllIlIlllIIIII(int n2) {
        return n2 >= 0;
    }

    private static boolean lllIlIlllIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    W(A a2, String string2, boolean bl) {
    }

    private static boolean lllIlIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public an f(int n2) {
        void var1;
        if (W.lllIlIlllIIIII(n2) && W.lllIlIlllIIIIl(n2, lIlllIIlIllI[0])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0] - n2);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[1]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[2])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[3]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[4])) {
            return new an(au.CACTUS, n.GROWING, (int)(var1 - lIlllIIlIllI[3]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[5]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[6])) {
            return new an(au.CACTUS, n.HARVESTABLE, (int)(var1 - lIlllIIlIllI[5]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[7]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[8])) {
            return new an(au.CACTUS, n.DISEASED, (int)(var1 - lIlllIIlIllI[6]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[9]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[10])) {
            return new an(au.CACTUS, n.DEAD, (int)(var1 - lIlllIIlIllI[8]));
        }
        if (W.lllIlIlllIIIll((int)var1, lIlllIIlIllI[11])) {
            return new an(au.CACTUS, n.GROWING, au.CACTUS.bc() - lIlllIIlIllI[12]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[13]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[14])) {
            return new an(au.POTATO_CACTUS, n.GROWING, (int)(var1 - lIlllIIlIllI[13]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[15]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[16])) {
            return new an(au.POTATO_CACTUS, n.HARVESTABLE, (int)(var1 - lIlllIIlIllI[15]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[17]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[18])) {
            return new an(au.POTATO_CACTUS, n.DISEASED, (int)(var1 - lIlllIIlIllI[16]));
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[19]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[20])) {
            return new an(au.POTATO_CACTUS, n.DEAD, (int)(var1 - lIlllIIlIllI[18]));
        }
        if (W.lllIlIlllIIIll((int)var1, lIlllIIlIllI[21])) {
            return new an(au.POTATO_CACTUS, n.GROWING, au.POTATO_CACTUS.bc() - lIlllIIlIllI[12]);
        }
        if (W.lllIlIlllIIIlI((int)var1, lIlllIIlIllI[22]) && W.lllIlIlllIIIIl((int)var1, lIlllIIlIllI[23])) {
            return new an(au.WEEDS, n.GROWING, lIlllIIlIllI[0]);
        }
        return null;
    }

    private static boolean lllIlIlllIIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        W.lllIlIllIlllll();
    }
}

