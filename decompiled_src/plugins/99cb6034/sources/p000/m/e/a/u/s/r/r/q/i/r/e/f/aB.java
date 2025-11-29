package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameState;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning on run", priority = 100)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aB  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aB.class */
public class aB extends Task {
    private static /* synthetic */ int[] lIlllIIIllII;
    private /* synthetic */ int cc = lIlllIIIllII[0];

    private static boolean lllIlIllIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lllIlIllIIIllI(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (lllIlIllIIIlII(Game.getState(), GameState.LOGGED_IN)) {
            return lIlllIIIllII[1];
        }
        if (lllIlIllIIIlIl(Movement.isRunEnabled() ? 1 : 0) && lllIlIllIIIllI(Movement.getRunEnergy(), this.cc)) {
            Movement.toggleRun();
            this.cc = Rand.nextInt(lIlllIIIllII[2], lIlllIIIllII[3]);
        }
        return lIlllIIIllII[1];
    }

    private static boolean lllIlIllIIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lllIlIllIIIIll();
    }

    private static void lllIlIllIIIIll() {
        lIlllIIIllII = new int[4];
        lIlllIIIllII[0] = 45 ^ 39;
        lIlllIIIllII[1] = ((((90 + 124) - 207) + 146) ^ (((140 + 10) - 108) + 153)) & (((77 ^ 6) ^ (128 ^ 145)) ^ (-" ".length()));
        lIlllIIIllII[2] = (((92 + 39) - 110) + 126) ^ (((63 + 22) - (-14)) + 51);
        lIlllIIIllII[3] = (79 ^ 29) ^ (12 ^ 71);
    }
}
