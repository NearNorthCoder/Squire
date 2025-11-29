package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Enabling run")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.b  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/b.class */
public class b extends Task {
    private static /* synthetic */ int[] lIllIIIIllIl;

    static {
        lllIIIllllIIlI();
    }

    private static void lllIIIllllIIlI() {
        lIllIIIIllIl = new int[3];
        lIllIIIIllIl[0] = 91 ^ 81;
        lIllIIIIllIl[1] = (" ".length() ^ (234 ^ 191)) & (((77 ^ 92) ^ (70 ^ 3)) ^ (-" ".length()));
        lIllIIIIllIl[2] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (!lllIIIllllIIll(Movement.isRunEnabled() ? 1 : 0) || lllIIIllllIlII(Movement.getRunEnergy(), lIllIIIIllIl[0])) {
            return lIllIIIIllIl[1];
        }
        Movement.toggleRun();
        return lIllIIIIllIl[2];
    }

    private static boolean lllIIIllllIIll(int i) {
        return i == 0;
    }

    private static boolean lllIIIllllIlII(int i, int i2) {
        return i < i2;
    }
}
