package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Enabling run", priority = 10)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.m  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/m.class */
public class m extends Task {
    private static /* synthetic */ int[] lIIlIlIIlIllI;
    private final /* synthetic */ SquireSaraConfig I;
    private final /* synthetic */ C0006g J;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIlIlIllIllllII(Movement.isRunEnabled() ? 1 : 0)) {
            return lIIlIlIIlIllI[0];
        }
        if (lIlIlIllIllllII(this.I.turnOffRun() ? 1 : 0) && lIlIlIllIllllIl(this.J.l() ? 1 : 0) && lIlIlIllIlllllI(this.J.k(), lIIlIlIIlIllI[1])) {
            return lIIlIlIIlIllI[0];
        }
        Movement.toggleRun();
        return lIIlIlIIlIllI[2];
    }

    private static boolean lIlIlIllIllllII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIllIllllIl(int i) {
        return i == 0;
    }

    static {
        lIlIlIllIlllIll();
    }

    private static boolean lIlIlIllIlllllI(int i, int i2) {
        return i > i2;
    }

    private static void lIlIlIllIlllIll() {
        lIIlIlIIlIllI = new int[3];
        lIIlIlIIlIllI[0] = ((251 ^ 160) ^ "   ".length()) & (((((54 + 15) - 33) + 185) ^ (((14 + 84) - 28) + 63)) ^ (-" ".length()));
        lIIlIlIIlIllI[1] = (((71 + 52) - (-19)) + 36) ^ (((35 + 121) - 139) + 167);
        lIIlIlIIlIllI[2] = " ".length();
    }

    @Inject
    public m(SquireSaraConfig squireSaraConfig, C0006g c0006g) {
        this.I = squireSaraConfig;
        this.J = c0006g;
    }
}
