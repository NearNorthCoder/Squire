/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;

public abstract class V
extends Task {
    private final /* synthetic */ SquireSepulchre aC;
    private static /* synthetic */ int[] lllIIlIIIlII;
    private final /* synthetic */ SquireSepulchreConfig aD;

    public abstract boolean J();

    private static boolean lIIIlIIllllIIII(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIIlllIllll() {
        lllIIlIIIlII = new int[1];
        V.lllIIlIIIlII[0] = (117 + 9 - 5 + 28 ^ 99 + 29 - 47 + 101) & (0x45 ^ 0x13 ^ (0xB6 ^ 0xC3) ^ -" ".length());
    }

    protected V(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aC = squireSepulchre;
        this.aD = squireSepulchreConfig;
    }

    static {
        V.lIIIlIIlllIllll();
    }

    public boolean run() {
        if (V.lIIIlIIllllIIII(this.aD.sackOpener() ? 1 : 0)) {
            return lllIIlIIIlII[0];
        }
        return this.J();
    }
}

