package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Dropping empty pies")
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.e  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/e.class */
public class e extends Task {
    private static final /* synthetic */ Logger t;
    private static /* synthetic */ int[] lIllIIIllll;

    private static boolean lIIlIlIllIlIlI(int i) {
        return i == 0;
    }

    private static void lIIlIlIllIlIIl() {
        lIllIIIllll = new int[3];
        lIllIIIllll[0] = " ".length();
        lIllIIIllll[1] = ((((0 + 6) - (-10)) + 111) ^ (70 ^ 30)) & (((((140 + 88) - 126) + 44) ^ (((110 + 55) - 58) + 74)) ^ (-" ".length()));
        lIllIIIllll[2] = (-8323) & 10635;
    }

    static {
        lIIlIlIllIlIIl();
        t = LoggerFactory.getLogger(e.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[lIllIIIllll[0]];
        iArr[lIllIIIllll[1]] = lIllIIIllll[2];
        if (lIIlIlIllIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return lIllIIIllll[1];
        }
        int[] iArr2 = new int[lIllIIIllll[0]];
        iArr2[lIllIIIllll[1]] = lIllIIIllll[2];
        Inventory.dropAll(iArr2);
        "".length();
        return lIllIIIllll[0];
    }
}
