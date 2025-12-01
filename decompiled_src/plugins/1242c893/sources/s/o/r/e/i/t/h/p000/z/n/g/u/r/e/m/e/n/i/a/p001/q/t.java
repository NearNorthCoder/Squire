package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Waiting for pin", blocking = true, priority = Integer.MAX_VALUE)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.t  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lIIIlIIlIlIll;

    static {
        lIIlllllIIIIlIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        return lIIlllllIIIIllI(Bank.isPinWindowOpen() ? 1 : 0) ? lIIIlIIlIlIll[0] : lIIIlIIlIlIll[1];
    }

    private static void lIIlllllIIIIlIl() {
        lIIIlIIlIlIll = new int[2];
        lIIIlIIlIlIll[0] = " ".length();
        lIIIlIIlIlIll[1] = (123 ^ 61) & ((45 ^ 107) ^ (-1));
    }

    private static boolean lIIlllllIIIIllI(int i) {
        return i != 0;
    }
}
