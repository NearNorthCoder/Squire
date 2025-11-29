/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import gg.squire.client.plugins.fw.Task;
import gg.squire.hunter.SquireHunterConfig;

public abstract class j
extends Task {
    private final /* synthetic */ a u;
    private /* synthetic */ e w;
    private final /* synthetic */ SquireHunterConfig v;
    private static /* synthetic */ int[] lllIlllIIlII;

    public boolean run() {
        if (j.lIIIllIllIllIII((Object)this.v.method(), (Object)this.w)) {
            return lllIlllIIlII[0];
        }
        return this.x();
    }

    protected abstract boolean x();

    private static void lIIIllIllIlIlll() {
        lllIlllIIlII = new int[1];
        j.lllIlllIIlII[0] = (0x50 ^ 0x71 ^ (0x39 ^ 0x16)) & (10 + 99 - -6 + 24 ^ 75 + 105 - 82 + 35 ^ -1);
    }

    public SquireHunterConfig z() {
        return this.v;
    }

    static {
        j.lIIIllIllIlIlll();
    }

    public a y() {
        return this.u;
    }

    public j(a a2, SquireHunterConfig squireHunterConfig, e e2) {
        this.u = a2;
        this.v = squireHunterConfig;
        this.w = e2;
    }

    private static boolean lIIIllIllIllIII(Object object, Object object2) {
        return object != object2;
    }
}

