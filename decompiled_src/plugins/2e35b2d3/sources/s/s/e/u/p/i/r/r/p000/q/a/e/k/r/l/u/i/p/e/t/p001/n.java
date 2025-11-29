package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Traversing to Turael", blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.n  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/n.class */
public class n extends Task {
    private final /* synthetic */ SquireSkipperPlugin K;
    private static /* synthetic */ int[] lIlIIlIlIlIII;
    private final /* synthetic */ SquireSkipperConfig L;

    static {
        lIlllIllIIIlIlI();
    }

    @Inject
    public n(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.K = squireSkipperPlugin;
        this.L = squireSkipperConfig;
    }

    private static boolean lIlllIllIIIllII(int i) {
        return i == 0;
    }

    private static void lIlllIllIIIlIlI() {
        lIlIIlIlIlIII = new int[5];
        lIlIIlIlIlIII[0] = (9 ^ 57) & ((91 ^ 107) ^ (-1));
        lIlIIlIlIlIII[1] = " ".length();
        lIlIIlIlIlIII[2] = (-((-3121) & 20023)) & (-129) & 30463;
        lIlIIlIlIlIII[3] = (-8329) & 11258;
        lIlIIlIlIlIII[4] = (-2) & 3537;
    }

    private static boolean lIlllIllIIIlIll(int i) {
        return i != 0;
    }

    private static boolean lIlllIllIIIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean run() {
        if (!lIlllIllIIIlIll(this.K.h() ? 1 : 0) && !lIlllIllIIIllII(Movement.shouldWalk() ? 1 : 0)) {
            if (lIlllIllIIIllIl(this.K.b())) {
                int[] iArr = new int[lIlIIlIlIlIII[1]];
                iArr[lIlIIlIlIlIII[0]] = lIlIIlIlIlIII[2];
                if (lIlllIllIIIllIl(NPCs.getNearest(iArr))) {
                    Movement.walkTo(new WorldPoint(lIlIIlIlIlIII[3], lIlIIlIlIlIII[4], lIlIIlIlIlIII[0]));
                    "".length();
                    return lIlIIlIlIlIII[1];
                }
            }
            return lIlIIlIlIlIII[0];
        }
        return lIlIIlIlIlIII[0];
    }
}
