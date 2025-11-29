/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.movement.Movement
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.unethicalite.api.movement.Movement;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g_Unknown;

/* TASK: Enabling run -> EnableRunTask */
@TaskDesc(name="Enabling run", priority=10)
public class EnablingRunTask
extends Task {
    private static /* synthetic */ int[] lIIlIlIIlIllI;
    private final /* synthetic */ SquireSaraConfig I;
    private final /* synthetic */ g J;

    public boolean run() {
        m var1;
        if (m.lIlIlIllIllllII(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIlIlIIlIllI[0];
        }
        if (m.lIlIlIllIllllII(var1.I.turnOffRun() ? 1 : 0) && m.lIlIlIllIllllIl(var1.J.l() ? 1 : 0) && m.lIlIlIllIlllllI(var1.J.k(), lIIlIlIIlIllI[1])) {
            return lIIlIlIIlIllI[0];
        }
        Movement.toggleRun();
        return lIIlIlIIlIllI[2];
    }

    private static boolean lIlIlIllIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIllllIl(int n2) {
        return n2 == 0;
    }

    static {
        m.lIlIlIllIlllIll();
    }

    private static boolean lIlIlIllIlllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIlIlIllIlllIll() {
        lIIlIlIIlIllI = new int[3];
        m.lIIlIlIIlIllI[0] = (0xFB ^ 0xA0 ^ 3) & (54 + 15 - 33 + 185 ^ 14 + 84 - 28 + 63 ^ -1);
        m.lIIlIlIIlIllI[1] = 71 + 52 - -19 + 36 ^ 35 + 121 - 139 + 167;
        m.lIIlIlIIlIllI[2] = 1;
    }

    @Inject
    public m(SquireSaraConfig squireSaraConfig, g g2) {
        this.I = squireSaraConfig;
        this.J = g2;
    }
}

