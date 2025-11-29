package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import java.util.Random;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.w  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/w.class */
public class w implements InterfaceC0011l {
    private final /* synthetic */ String an;
    private final /* synthetic */ String ao;
    private static /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIlIIlIIII;

    private static boolean lIlllIIlIIlIIlI(int i, int i2) {
        return i != i2;
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0011l
    public String z() {
        return this.ao;
    }

    private static boolean lIlllIIlIIlIIII(Object obj) {
        return obj == null;
    }

    public w(String str, String str2) {
        this.an = str;
        this.ao = str2;
    }

    static {
        lIlllIIlIIIllll();
    }

    private static boolean lIlllIIlIIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIlllIIlIIlIIIl(int i, int i2) {
        return i >= i2;
    }

    public void a(NPC npc) {
        if (lIlllIIlIIlIIII(npc)) {
            return;
        }
        WorldPoint worldLocation = npc.getWorldLocation();
        Random random = new Random();
        int nextInt = random.nextInt(lIlIIlIIlIIII[5]) - lIlIIlIIlIIII[3];
        int nextInt2 = random.nextInt(lIlIIlIIlIIII[5]) - lIlIIlIIlIIII[3];
        if (lIlllIIlIIlIIll(nextInt) && lIlllIIlIIlIIll(nextInt2)) {
            nextInt = lIlIIlIIlIIII[0];
        }
        Walker.walkTo(new WorldPoint(worldLocation.getX() + nextInt, worldLocation.getY() + nextInt2, worldLocation.getPlane()));
        "".length();
        ah = M.a(lIlIIlIIlIIII[0], lIlIIlIIlIIII[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        String[] strArr = new String[lIlIIlIIlIIII[0]];
        strArr[lIlIIlIIlIIII[1]] = this.an;
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlllIIlIIlIIII(nearest)) {
            return lIlIIlIIlIIII[1];
        }
        if (lIlllIIlIIlIIIl(ah, lIlIIlIIlIIII[0])) {
            ah -= lIlIIlIIlIIII[0];
            return lIlIIlIIlIIII[1];
        }
        if (!lIlllIIlIIlIIlI(Players.getLocal().getAnimation(), lIlIIlIIlIIII[2]) && !lIlllIIlIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
            if (lIlllIIlIIlIIll(Reachable.isInteractable(nearest) ? 1 : 0)) {
                a(nearest);
                return lIlIIlIIlIIII[0];
            } else if (lIlllIIlIIlIIIl(nearest.getWorldLocation().distanceTo(Players.getLocal()), lIlIIlIIlIIII[3])) {
                a(nearest);
                return lIlIIlIIlIIII[0];
            } else {
                nearest.interact(this.ao);
                ah = M.a(lIlIIlIIlIIII[0], lIlIIlIIlIIII[4]);
                return lIlIIlIIlIIII[0];
            }
        }
        return lIlIIlIIlIIII[1];
    }

    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.InterfaceC0011l
    public String y() {
        return this.an;
    }

    private static void lIlllIIlIIIllll() {
        lIlIIlIIlIIII = new int[6];
        lIlIIlIIlIIII[0] = " ".length();
        lIlIIlIIlIIII[1] = (84 ^ 113) & ((110 ^ 75) ^ (-1));
        lIlIIlIIlIIII[2] = -" ".length();
        lIlIIlIIlIIII[3] = "   ".length();
        lIlIIlIIlIIII[4] = 127 ^ 123;
        lIlIIlIIlIIII[5] = (115 ^ 43) ^ (45 ^ 114);
    }
}
