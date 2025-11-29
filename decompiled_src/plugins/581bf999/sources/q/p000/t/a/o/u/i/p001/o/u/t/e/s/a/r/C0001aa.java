package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning on run", priority = Integer.MAX_VALUE)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aa  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aa.class */
public class C0001aa extends Task {
    private static /* synthetic */ int[] llIIlIllIIl;
    protected final /* synthetic */ SquireAutoTOA cx;

    private static boolean lIlIIIIlIllIll(int i) {
        return i != 0;
    }

    static {
        lIlIIIIlIllIlI();
    }

    @Inject
    public C0001aa(SquireAutoTOA squireAutoTOA) {
        this.cx = squireAutoTOA;
    }

    private static void lIlIIIIlIllIlI() {
        llIIlIllIIl = new int[3];
        llIIlIllIIl[0] = ((231 ^ 133) ^ (5 ^ 87)) & (((86 ^ 48) ^ (3 ^ 85)) ^ (-" ".length()));
        llIIlIllIIl[1] = (158 ^ 128) ^ (136 ^ 156);
        llIIlIllIIl[2] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIlIIIIlIllIll(this.cx.d() ? 1 : 0)) {
            return llIIlIllIIl[0];
        }
        if (lIlIIIIlIlllII(Movement.getRunEnergy(), llIIlIllIIl[1]) && lIlIIIIlIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return llIIlIllIIl[2];
        }
        return llIIlIllIIl[0];
    }

    private static boolean lIlIIIIlIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIlIIIIlIlllII(int i, int i2) {
        return i > i2;
    }
}
