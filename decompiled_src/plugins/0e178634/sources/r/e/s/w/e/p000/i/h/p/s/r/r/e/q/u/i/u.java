package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/u.class */
public abstract class u extends f {
    @Inject
    protected /* synthetic */ C0003d W;
    private static /* synthetic */ int[] lIlIlllIIIlIl;
    protected static final /* synthetic */ int ad;
    protected static final /* synthetic */ int ac;

    public void e() {
    }

    private static boolean llIIIIlIIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIIIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        if (!llIIIIlIIIIIIll(this.j.isInInstancedRegion() ? 1 : 0) || llIIIIlIIIIIIll(House.isInside() ? 1 : 0)) {
            e();
            return lIlIlllIIIlIl[0];
        } else if (llIIIIlIIIIIlII(this.W.j())) {
            e();
            return lIlIlllIIIlIl[0];
        } else {
            if (llIIIIlIIIIIlIl(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
            return p();
        }
    }

    private static void llIIIIlIIIIIIlI() {
        lIlIlllIIIlIl = new int[3];
        lIlIlllIIIlIl[0] = ((128 ^ 155) ^ (114 ^ 60)) & (((((182 + 64) - 90) + 70) ^ (((15 + 16) - (-17)) + 135)) ^ (-" ".length()));
        lIlIlllIIIlIl[1] = (-(24 ^ 90)) & (-4107) & 16383;
        lIlIlllIIIlIl[2] = (-20499) & 32703;
    }

    static {
        llIIIIlIIIIIIlI();
        ad = lIlIlllIIIlIl[1];
        ac = lIlIlllIIIlIl[2];
    }

    private static boolean llIIIIlIIIIIlII(Object obj) {
        return obj == null;
    }

    public abstract boolean p();
}
