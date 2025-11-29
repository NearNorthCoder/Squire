package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Dropping Empty Vial (you should crush likeachamp)", priority = Integer.MAX_VALUE, blocking = false)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ac  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ac.class */
public class C0003ac extends Task {
    private static final /* synthetic */ Logger dH;
    private final /* synthetic */ C0011h dJ;
    private static /* synthetic */ int[] lllIllIlIlII;
    private final /* synthetic */ SquireNightmareConfig dI;

    private static boolean lIIIllIlIIlllIl(int i) {
        return i != 0;
    }

    private static void lIIIllIlIIllIlI() {
        lllIllIlIlII = new int[3];
        lllIllIlIlII[0] = (200 ^ 142) & ((27 ^ 93) ^ (-1));
        lllIllIlIlII[1] = " ".length();
        lllIllIlIlII[2] = (((11 ^ 67) + (162 ^ 194)) - (6 ^ 69)) + ((123 + 53) - 106) + 58;
    }

    private static boolean lIIIllIlIIlllII(Object obj) {
        return obj == null;
    }

    static {
        lIIIllIlIIllIlI();
        dH = LoggerFactory.getLogger(C0003ac.class);
    }

    private static boolean lIIIllIlIIllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (!lIIIllIlIIllIll(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIIllIlIIlllII(SquireNightmarePlugin.d())) {
            int[] iArr = new int[lllIllIlIlII[1]];
            iArr[lllIllIlIlII[0]] = lllIllIlIlII[2];
            List all = Inventory.getAll(iArr);
            if (lIIIllIlIIlllIl(all.isEmpty() ? 1 : 0)) {
                return lllIllIlIlII[0];
            }
            ((Item) all.get(lllIllIlIlII[0])).drop();
            return lllIllIlIlII[1];
        }
        return lllIllIlIlII[0];
    }

    @Inject
    public C0003ac(SquireNightmareConfig squireNightmareConfig, C0011h c0011h) {
        this.dI = squireNightmareConfig;
        this.dJ = c0011h;
    }
}
