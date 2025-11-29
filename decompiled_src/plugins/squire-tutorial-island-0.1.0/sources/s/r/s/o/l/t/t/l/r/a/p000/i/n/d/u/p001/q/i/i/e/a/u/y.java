package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.y  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/y.class */
public class y implements o {
    private static /* synthetic */ int[] lIlIIlIIIlIII;
    private final /* synthetic */ String aq;
    private final /* synthetic */ WorldPoint ap;
    private static /* synthetic */ int ah;

    private static boolean lIlllIIIllllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIIIllllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllIIIllllIll(int i, int i2) {
        return i != i2;
    }

    static {
        lIlllIIIllllIII();
    }

    public y(WorldPoint worldPoint, String str) {
        this.ap = worldPoint;
        this.aq = str;
    }

    private static void lIlllIIIllllIII() {
        lIlIIlIIIlIII = new int[4];
        lIlIIlIIIlIII[0] = (49 ^ 37) & ((188 ^ 168) ^ (-1));
        lIlIIlIIIlIII[1] = " ".length();
        lIlIIlIIIlIII[2] = -" ".length();
        lIlIIlIIIlIII[3] = (81 ^ 107) ^ (142 ^ 176);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIIllllIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIIlIII[0];
        }
        if (lIlllIIIllllIlI(ah, lIlIIlIIIlIII[1])) {
            ah -= lIlIIlIIIlIII[1];
            return lIlIIlIIIlIII[0];
        } else if (lIlllIIIllllIll(Players.getLocal().getAnimation(), lIlIIlIIIlIII[2])) {
            return lIlIIlIIIlIII[0];
        } else {
            WorldPoint worldPoint = this.ap;
            String[] strArr = new String[lIlIIlIIIlIII[1]];
            strArr[lIlIIlIIIlIII[0]] = this.aq;
            ((TileObject) TileObjects.getAt(worldPoint, strArr).get(lIlIIlIIIlIII[0])).interact(lIlIIlIIIlIII[0]);
            ah = M.a(lIlIIlIIIlIII[1], lIlIIlIIIlIII[3]);
            return lIlIIlIIIlIII[1];
        }
    }
}
