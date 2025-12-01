package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to the bank", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/o.class */
public class C0014o extends AbstractC0013n {
    private static /* synthetic */ int[] lIllIllIlIll;

    private static boolean lllIlIIlIllIIl(int i) {
        return i != 0;
    }

    static {
        lllIlIIlIllIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    @Override // k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l.AbstractC0013n
    protected boolean R() {
        if (!lllIlIIlIllIIl(this.w.n() ? 1 : 0) && !lllIlIIlIllIIl(P() ? 1 : 0)) {
            Movement.walkTo(this.ae.bank().H());
            "".length();
            return lIllIllIlIll[1];
        }
        return lIllIllIlIll[0];
    }

    private static void lllIlIIlIllIII() {
        lIllIllIlIll = new int[2];
        lIllIllIlIll[0] = (123 ^ 88) & ((56 ^ 27) ^ (-1));
        lIllIllIlIll[1] = " ".length();
    }
}
