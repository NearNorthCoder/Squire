package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Pressing Continue", priority = 15, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bq  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bq.class */
public class C0044bq extends Task {
    private static /* synthetic */ int[] lllIIIl;

    private static boolean lllIIIIll(int i2) {
        return i2 == 0;
    }

    static {
        lllIIIIlI();
    }

    private static void lllIIIIlI() {
        lllIIIl = new int[2];
        lllIIIl[0] = (4 ^ 64) & ((238 ^ 170) ^ (-1));
        lllIIIl[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (lllIIIIll(Dialog.canContinue() ? 1 : 0)) {
            return lllIIIl[0];
        }
        Dialog.continueSpace();
        return lllIIIl[1];
    }
}
