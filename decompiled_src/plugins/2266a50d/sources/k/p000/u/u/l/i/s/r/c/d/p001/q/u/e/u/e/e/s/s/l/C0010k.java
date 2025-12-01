package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import javax.inject.Inject;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Toggling run", priority = 2146483647)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/k.class */
public class C0010k extends Task {
    private static /* synthetic */ int[] lIllIIlllIII;
    private final /* synthetic */ SquireDukeSucellus aj;
    private final /* synthetic */ SquireDukeSucellusConfig ak;

    private static boolean lllIIllIIIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (!lllIIllIIIIlII(Movement.isRunEnabled() ? 1 : 0) && !lllIIllIIIIlIl(Movement.getRunEnergy(), lIllIIlllIII[1])) {
            Movement.toggleRun();
            return lIllIIlllIII[2];
        }
        return lIllIIlllIII[0];
    }

    @Inject
    C0010k(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aj = squireDukeSucellus;
        this.ak = squireDukeSucellusConfig;
    }

    private static boolean lllIIllIIIIlII(int i) {
        return i != 0;
    }

    private static void lllIIllIIIIIll() {
        lIllIIlllIII = new int[3];
        lIllIIlllIII[0] = (58 ^ 45) & ((165 ^ 178) ^ (-1));
        lIllIIlllIII[1] = (88 ^ 52) ^ (77 ^ 43);
        lIllIIlllIII[2] = " ".length();
    }

    static {
        lllIIllIIIIIll();
    }
}
