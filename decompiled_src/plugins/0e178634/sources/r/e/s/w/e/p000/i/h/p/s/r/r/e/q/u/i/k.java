package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to the bank")
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.k  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/k.class */
public class k extends i {
    private static /* synthetic */ int[] lIlIlllIlIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.i
    protected boolean p() {
        if (llIIIIlIIllIIII(n() ? 1 : 0)) {
            return lIlIlllIlIIll[0];
        }
        Movement.walkTo(this.i.bank().m());
        "".length();
        return lIlIlllIlIIll[1];
    }

    private static boolean llIIIIlIIllIIII(int i) {
        return i != 0;
    }

    private static void llIIIIlIIlIllll() {
        lIlIlllIlIIll = new int[2];
        lIlIlllIlIIll[0] = ((((39 + 163) - 66) + 44) ^ (((107 + 23) - 59) + 71)) & (((76 ^ 92) ^ (182 ^ 156)) ^ (-" ".length()));
        lIlIlllIlIIll[1] = " ".length();
    }

    static {
        llIIIIlIIlIllll();
    }
}
