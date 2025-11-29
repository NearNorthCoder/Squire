package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to the bank", priority = 2147483547, blocking = true)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.j  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/j.class */
public class j extends i {
    private static /* synthetic */ int[] lIIlIlIlIllII;

    static {
        lIlIllIIIIlIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.i
    protected boolean a() {
        if (lIlIllIIIIlIlII(s() ? 1 : 0)) {
            return lIIlIlIlIllII[0];
        }
        Movement.walkTo(this.b.bank().r());
        "".length();
        return lIIlIlIlIllII[1];
    }

    private static void lIlIllIIIIlIIll() {
        lIIlIlIlIllII = new int[2];
        lIIlIlIlIllII[0] = "  ".length() & ("  ".length() ^ (-" ".length()));
        lIIlIlIlIllII[1] = " ".length();
    }

    private static boolean lIlIllIIIIlIlII(int i) {
        return i != 0;
    }
}
