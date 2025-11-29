/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;

public abstract class s
extends Task {
    public final /* synthetic */ SquireThieving ad;
    public final /* synthetic */ SquireThievingConfig ae;
    private static /* synthetic */ int[] lIIlllIIllIII;

    public boolean run() {
        if (s.lIllIIllIIIllIl(this.ae.method().equals((Object)b.CHESTS) ? 1 : 0)) {
            return this.l();
        }
        return lIIlllIIllIII[0];
    }

    @Inject
    public s(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.ad = squireThieving;
        this.ae = squireThievingConfig;
    }

    private static boolean lIllIIllIIIllIl(int n2) {
        return n2 != 0;
    }

    static {
        s.lIllIIllIIIllII();
    }

    private static void lIllIIllIIIllII() {
        lIIlllIIllIII = new int[1];
        s.lIIlllIIllIII[0] = 3 & (3 ^ -1);
    }

    public abstract boolean l();
}

