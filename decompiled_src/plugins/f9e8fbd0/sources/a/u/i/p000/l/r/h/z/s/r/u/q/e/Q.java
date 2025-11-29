package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import net.runelite.api.Client;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Detecting death", priority = Integer.MAX_VALUE)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.Q  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/Q.class */
public class Q extends Task {
    private final /* synthetic */ Client ao;
    private final /* synthetic */ SquireZulrah an;
    private static /* synthetic */ int[] lIllIlIIIlIlI;

    static {
        llIIIlllIlllIIl();
    }

    @Inject
    public Q(SquireZulrah squireZulrah, Client client) {
        this.an = squireZulrah;
        this.ao = client;
    }

    private static boolean llIIIlllIlllIlI(int i) {
        return i != 0;
    }

    private static void llIIIlllIlllIIl() {
        lIllIlIIIlIlI = new int[1];
        lIllIlIIIlIlI[0] = (98 ^ 65) & ((184 ^ 155) ^ (-1));
    }

    private static boolean llIIIlllIlllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (!llIIIlllIlllIlI(this.ao.isInInstancedRegion() ? 1 : 0) && !llIIIlllIlllIlI(Bank.isOpen() ? 1 : 0) && llIIIlllIlllIll(this.an.a(), EnumC0002c.DONE)) {
            return lIllIlIIIlIlI[0];
        }
        return lIllIlIIIlIlI[0];
    }
}
