package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning on run", priority = 1000)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.i  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/i.class */
public class i extends Task {
    private static /* synthetic */ int[] llIIlIlllIII;

    private static boolean lllllIlllIIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIlllIIIlI(int i) {
        return i == 0;
    }

    static {
        lllllIlllIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (!lllllIlllIIIlI(Movement.isRunEnabled() ? 1 : 0) || lllllIlllIIIll(Movement.getRunEnergy(), llIIlIlllIII[0])) {
            return llIIlIlllIII[1];
        }
        Movement.toggleRun();
        return llIIlIlllIII[2];
    }

    private static void lllllIlllIIIIl() {
        llIIlIlllIII = new int[3];
        llIIlIlllIII[0] = (((85 + 112) - 92) + 81) ^ (((3 + 149) - 12) + 36);
        llIIlIlllIII[1] = (147 ^ 172) & ((184 ^ 135) ^ (-1));
        llIIlIlllIII[2] = " ".length();
    }
}
