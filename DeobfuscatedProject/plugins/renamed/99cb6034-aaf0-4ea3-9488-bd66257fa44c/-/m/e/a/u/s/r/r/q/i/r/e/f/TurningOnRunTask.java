/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.movement.Movement
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;

/* TASK: Turning on run -> EnableRunTask */
@TaskDesc(name="Turning on run", priority=100)
public class TurningOnRunTask
extends Task {
    private static /* synthetic */ int[] lIlllIIIllII;
    private /* synthetic */ int cc;

    private static boolean lllIlIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIllIIIllI(int n2, int n3) {
        return n2 > n3;
    }

    public boolean run() {
        aB var1;
        if (aB.lllIlIllIIIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lIlllIIIllII[1];
        }
        if (aB.lllIlIllIIIlIl(Movement.isRunEnabled() ? 1 : 0) && aB.lllIlIllIIIllI(Movement.getRunEnergy(), var1.cc)) {
            Movement.toggleRun();
            var1.cc = Rand.nextInt((int)lIlllIIIllII[2], (int)lIlllIIIllII[3]);
        }
        return lIlllIIIllII[1];
    }

    private static boolean lllIlIllIIIlII(Object object, Object object2) {
        return object != object2;
    }

    static {
        aB.lllIlIllIIIIll();
    }

    private static void lllIlIllIIIIll() {
        lIlllIIIllII = new int[4];
        aB.lIlllIIIllII[0] = 0x2D ^ 0x27;
        aB.lIlllIIIllII[1] = (90 + 124 - 207 + 146 ^ 140 + 10 - 108 + 153) & (0x4D ^ 6 ^ (0x80 ^ 0x91) ^ -1);
        aB.lIlllIIIllII[2] = 92 + 39 - 110 + 126 ^ 63 + 22 - -14 + 51;
        aB.lIlllIIIllII[3] = 0x4F ^ 0x1D ^ (0xC ^ 0x47);
    }

    public aB() {
        this.cc = lIlllIIIllII[0];
    }
}

