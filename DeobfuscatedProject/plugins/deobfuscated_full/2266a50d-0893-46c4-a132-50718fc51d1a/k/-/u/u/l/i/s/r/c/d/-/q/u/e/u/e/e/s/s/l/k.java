/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;

/* TASK: Toggling run -> TogglingrunTask */
@TaskDesc(name="Toggling run", priority=2146483647)
public class k
extends Task {
    private static /* synthetic */ int[] lIllIIlllIII;
    private final /* synthetic */ SquireDukeSucellus aj;
    private final /* synthetic */ SquireDukeSucellusConfig ak;

    private static boolean lllIIllIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (k.lllIIllIIIIlII(Movement.isRunEnabled() ? 1 : 0)) {
            return lIllIIlllIII[0];
        }
        if (k.lllIIllIIIIlIl(Movement.getRunEnergy(), lIllIIlllIII[1])) {
            return lIllIIlllIII[0];
        }
        Movement.toggleRun();
        return lIllIIlllIII[2];
    }

    @Inject
    k(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aj = squireDukeSucellus;
        this.ak = squireDukeSucellusConfig;
    }

    private static boolean lllIIllIIIIlII(int n2) {
        return n2 != 0;
    }

    private static void lllIIllIIIIIll() {
        lIllIIlllIII = new int[3];
        k.lIllIIlllIII[0] = (0x3A ^ 0x2D) & ~(0xA5 ^ 0xB2);
        k.lIllIIlllIII[1] = 0x58 ^ 0x34 ^ (0x4D ^ 0x2B);
        k.lIllIIlllIII[2] = 1;
    }

    static {
        k.lllIIllIIIIIll();
    }
}

