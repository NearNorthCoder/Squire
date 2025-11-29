/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a_Unknown;
import gg.squire.client.plugins.fw.Task;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;

public abstract class j_Unknown
extends Task {
    protected final /* synthetic */ SquireGiantsFoundry U;
    protected final /* synthetic */ SquireGiantsConfig V;
    protected final /* synthetic */ a T;
    private static /* synthetic */ int[] llIlIlIIllIl;
    protected static final /* synthetic */ int S;

    private static boolean lIIIIIlIllllIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    public j(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        this.T = a2;
        this.U = squireGiantsFoundry;
        this.V = squireGiantsConfig;
    }

    private static void lIIIIIlIllllIIl() {
        llIlIlIIllIl = new int[2];
        j.llIlIlIIllIl[0] = (0xB2 ^ 0xBC ^ (0xFE ^ 0xAD)) & (0xC5 ^ 0x90 ^ (0x3C ^ 0x34) ^ -1);
        j.llIlIlIIllIl[1] = 0xFFFFEFFE & 0xBEE9;
    }

    public boolean run() {
        if (j.lIIIIIlIllllIlI(this.T.f() ? 1 : 0)) {
            return llIlIlIIllIl[0];
        }
        if (j.lIIIIIlIllllIlI(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIlIlIIllIl[0];
        }
        return this.M();
    }

    public abstract boolean M();

    static {
        j.lIIIIIlIllllIIl();
        S = llIlIlIIllIl[1];
    }
}

