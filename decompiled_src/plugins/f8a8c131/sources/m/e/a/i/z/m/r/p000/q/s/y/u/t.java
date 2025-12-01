package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Recovering from getting stuck on a tile")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.t  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/t.class */
public class t extends Task {
    private final /* synthetic */ l af;
    private static /* synthetic */ int[] lIllIIIlIllIl;
    private final /* synthetic */ C0002c ag;

    private static boolean llIIIlIlIIIIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public t(l lVar, C0002c c0002c) {
        this.af = lVar;
        this.ag = c0002c;
    }

    private static void llIIIlIlIIIIIlI() {
        lIllIIIlIllIl = new int[2];
        lIllIIIlIllIl[0] = (122 ^ 125) & ((14 ^ 9) ^ (-1));
        lIllIIIlIllIl[1] = " ".length();
    }

    private static boolean llIIIlIlIIIIlIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIIIIIll(this.af.B() ? 1 : 0) && !llIIIlIlIIIIIll(this.af.G() ? 1 : 0) && !llIIIlIlIIIIIll(this.af.A() ? 1 : 0)) {
            if (!llIIIlIlIIIIlII(this.ag.e()) || llIIIlIlIIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                return lIllIIIlIllIl[0];
            }
            WorldPoint g = this.ag.g();
            if (llIIIlIlIIIIlII(g)) {
                return lIllIIIlIllIl[0];
            }
            Movement.walkTo(g);
            "".length();
            return lIllIIIlIllIl[1];
        }
        return lIllIIIlIllIl[0];
    }

    private static boolean llIIIlIlIIIIIll(int i) {
        return i == 0;
    }

    static {
        llIIIlIlIIIIIlI();
    }
}
