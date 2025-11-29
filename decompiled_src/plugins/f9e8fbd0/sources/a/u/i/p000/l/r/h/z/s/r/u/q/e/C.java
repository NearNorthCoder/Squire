package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning on run")
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.C  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/C.class */
public class C extends Task {
    private static /* synthetic */ int[] lIllIlIlIlIIl;

    private static boolean llIIlIIIIIIIlll(int i, int i2) {
        return i >= i2;
    }

    static {
        llIIlIIIIIIIllI();
    }

    private static boolean llIIlIIIIIIlIII(int i) {
        return i == 0;
    }

    private static void llIIlIIIIIIIllI() {
        lIllIlIlIlIIl = new int[3];
        lIllIlIlIlIIl[0] = (34 ^ 30) ^ (182 ^ 143);
        lIllIlIlIlIIl[1] = " ".length();
        lIllIlIlIlIIl[2] = (117 ^ 83) & ((39 ^ 1) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (llIIlIIIIIIIlll(Movement.getRunEnergy(), lIllIlIlIlIIl[0]) && llIIlIIIIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIllIlIlIlIIl[1];
        }
        return lIllIlIlIlIIl[2];
    }
}
