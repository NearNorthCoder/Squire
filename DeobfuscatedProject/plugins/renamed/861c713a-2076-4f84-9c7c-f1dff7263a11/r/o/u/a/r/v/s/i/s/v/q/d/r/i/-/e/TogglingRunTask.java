/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.Movement
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;

/* TASK: Toggling run -> TogglingrunTask */
@TaskDesc(name="Toggling run", priority=0x7FFFFFFF)
public class TogglingRunTask
extends Task {
    private static /* synthetic */ int[] lIlIlIIIIlIll;
    private final /* synthetic */ SquireVardorvis ad;
    private final /* synthetic */ SquireVardorvisConfig ae;

    @Inject
    n(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.ad = squireVardorvis;
        this.ae = squireVardorvisConfig;
    }

    private static boolean lIllllIlIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (n.lIllllIlIIIlllI(Movement.isRunEnabled() ? 1 : 0)) {
            return lIlIlIIIIlIll[0];
        }
        if (n.lIllllIlIIIllll(Movement.getRunEnergy(), lIlIlIIIIlIll[1])) {
            return lIlIlIIIIlIll[0];
        }
        Movement.toggleRun();
        return lIlIlIIIIlIll[2];
    }

    private static void lIllllIlIIIllIl() {
        lIlIlIIIIlIll = new int[3];
        n.lIlIlIIIIlIll[0] = (0x4A ^ 0x18) & ~(0xD3 ^ 0x81);
        n.lIlIlIIIIlIll[1] = 125 + 136 - 131 + 23 ^ 100 + 82 - 139 + 104;
        n.lIlIlIIIIlIll[2] = 1;
    }

    static {
        n.lIllllIlIIIllIl();
    }
}

