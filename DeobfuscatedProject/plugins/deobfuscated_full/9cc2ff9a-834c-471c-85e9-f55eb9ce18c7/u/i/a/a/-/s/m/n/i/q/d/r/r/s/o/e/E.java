/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

/* TASK: Restoring Prayer at Altar -> RestoringprayerataltarTask */
@TaskDesc(name="Restoring Prayer at Altar", priority=30)
public class E
extends Task {
    private final /* synthetic */ g aJ;
    private static /* synthetic */ int[] lIIlIIlllIIlI;
    private final /* synthetic */ SquireSaraConfig aI;

    public boolean run() {
        return lIIlIIlllIIlI[0];
    }

    static {
        E.lIlIlIlIlIIIllI();
    }

    @Inject
    public E(SquireSaraConfig squireSaraConfig, g g2) {
        this.aI = squireSaraConfig;
        this.aJ = g2;
    }

    private static void lIlIlIlIlIIIllI() {
        lIIlIIlllIIlI = new int[1];
        E.lIIlIIlllIIlI[0] = (106 + 96 - 103 + 40 ^ 61 + 60 - -12 + 32) & (8 ^ 0x66 ^ (8 ^ 0x48) ^ -1);
    }
}

