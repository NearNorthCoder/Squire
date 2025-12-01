package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Enabling run", priority = 100)
/* renamed from: m.u.a.-.e.s.q.t.i.r.t  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lllIlIllIllI;
    private /* synthetic */ int ax = lllIlIllIllI[0];

    static {
        lIIIllIIIlllIIl();
    }

    private static void lIIIllIIIlllIIl() {
        lllIlIllIllI = new int[5];
        lllIlIllIllI[0] = 15 ^ 27;
        lllIlIllIllI[1] = ((2 ^ 105) ^ (76 ^ 121)) & (((((60 + 141) - 15) + 17) ^ (((58 + 59) - 57) + 89)) ^ (-" ".length()));
        lllIlIllIllI[2] = (((129 + 68) - 86) + 44) ^ (((55 + 56) - 28) + 75);
        lllIlIllIllI[3] = (239 ^ 147) ^ (247 ^ 146);
        lllIlIllIllI[4] = " ".length();
    }

    private static boolean lIIIllIIIlllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (!lIIIllIIIlllIlI(Movement.getRunEnergy(), this.ax) || lIIIllIIIlllIll(Movement.isRunEnabled() ? 1 : 0)) {
            return lllIlIllIllI[1];
        }
        Movement.toggleRun();
        this.ax = Rand.nextInt(lllIlIllIllI[2], lllIlIllIllI[3]);
        return lllIlIllIllI[4];
    }

    private static boolean lIIIllIIIlllIlI(int i, int i2) {
        return i >= i2;
    }
}
