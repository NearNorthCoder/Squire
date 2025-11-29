package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to starting tile")
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.D  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/D.class */
public class D extends Task {
    private final /* synthetic */ l aG;
    private final /* synthetic */ C0002c aH;
    private static /* synthetic */ int[] lIllIIIlIlIIl;

    @Inject
    public D(l lVar, C0002c c0002c) {
        this.aG = lVar;
        this.aH = c0002c;
    }

    private static boolean llIIIlIIlllIlIl(int i) {
        return i != 0;
    }

    private static boolean llIIIlIIlllIIll(int i) {
        return i == 0;
    }

    private static boolean llIIIlIIlllIllI(int i, int i2) {
        return i > i2;
    }

    static {
        llIIIlIIlllIIlI();
    }

    private static boolean llIIIlIIlllIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (llIIIlIIlllIIll(this.aG.B() ? 1 : 0)) {
            return lIllIIIlIlIIl[0];
        }
        C0003d I = this.aG.I();
        if ((!llIIIlIIlllIlII(I) || !llIIIlIIlllIlIl(I.l() ? 1 : 0)) && !llIIIlIIlllIlIl(this.aG.A() ? 1 : 0)) {
            if (llIIIlIIlllIlIl(this.aG.D() ? 1 : 0) && llIIIlIIlllIllI(this.aG.z(), lIllIIIlIlIIl[1])) {
                return lIllIIIlIlIIl[0];
            }
            Player local = Players.getLocal();
            if (llIIIlIIlllIlIl(local.isMoving() ? 1 : 0)) {
                return lIllIIIlIlIIl[0];
            }
            WorldPoint i = this.aH.i();
            if (llIIIlIIlllIlIl(local.getWorldLocation().equals(i) ? 1 : 0)) {
                return lIllIIIlIlIIl[0];
            }
            Movement.walkTo(i);
            "".length();
            return lIllIIIlIlIIl[2];
        }
        return lIllIIIlIlIIl[0];
    }

    private static void llIIIlIIlllIIlI() {
        lIllIIIlIlIIl = new int[3];
        lIllIIIlIlIIl[0] = ((197 ^ 160) ^ (33 ^ 64)) & (((((104 + 112) - 157) + 104) ^ (((43 + 153) - 160) + 131)) ^ (-" ".length()));
        lIllIIIlIlIIl[1] = 19 ^ 25;
        lIllIIIlIlIIl[2] = " ".length();
    }
}
