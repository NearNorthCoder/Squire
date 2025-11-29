package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to bank", priority = 10, blocking = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.A  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/A.class */
public class A extends Task {
    public static final /* synthetic */ WorldPoint aL;
    private static /* synthetic */ int[] lIIlIlllIIIlI;
    private final /* synthetic */ c aM;
    private final /* synthetic */ SquireShamanConfig aN;
    public static final /* synthetic */ WorldPoint aK;

    private static boolean lIlIllIllIIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    private boolean G() {
        int regionID = Players.getLocal().getWorldLocation().getRegionID();
        if (!lIlIllIllIIllII(regionID, lIIlIlllIIIlI[4]) || lIlIllIllIIllIl(regionID, lIIlIlllIIIlI[5])) {
            Movement.walkTo(aL);
            "".length();
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((48 ^ 43) ^ (15 ^ 47)) & (((10 ^ 65) ^ (32 ^ 80)) ^ (-" ".length()));
            }
        } else {
            Movement.walkTo(aK);
            "".length();
        }
        return lIIlIlllIIIlI[0];
    }

    private static boolean lIlIllIllIIlIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIllIllIIlIII(int i) {
        return i != 0;
    }

    private static boolean lIlIllIllIIllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIllIIllII(int i, int i2) {
        return i != i2;
    }

    private static void lIlIllIllIIIlll() {
        lIIlIlllIIIlI = new int[10];
        lIIlIlllIIIlI[0] = ((((136 + 180) - 240) + 115) ^ (((129 + 148) - 156) + 32)) & (((((55 + 92) - 122) + 147) ^ (((23 + 120) - 109) + 104)) ^ (-" ".length()));
        lIIlIlllIIIlI[1] = " ".length();
        lIIlIlllIIIlI[2] = (-((-16577) & 20937)) & (-673) & 31743;
        lIIlIlllIIIlI[3] = (22 ^ 16) ^ (139 ^ 135);
        lIIlIlllIIIlI[4] = (-((-14419) & 30807)) & (-5257) & 31934;
        lIIlIlllIIIlI[5] = (-16901) & 27446;
        lIIlIlllIIIlI[6] = (-((-1065) & 10025)) & (-18465) & 28671;
        lIIlIlllIIIlI[7] = (-((-4763) & 13243)) & (-20545) & 32763;
        lIIlIlllIIIlI[8] = (-17122) & 18423;
        lIIlIlllIIIlI[9] = (-12546) & 16307;
    }

    static {
        lIlIllIllIIIlll();
        aK = new WorldPoint(lIIlIlllIIIlI[6], lIIlIlllIIIlI[7], lIIlIlllIIIlI[0]);
        aL = new WorldPoint(lIIlIlllIIIlI[8], lIIlIlllIIIlI[9], lIIlIlllIIIlI[0]);
    }

    private static boolean lIlIllIllIIlIll(int i) {
        return i == 0;
    }

    @Inject
    public A(c cVar, SquireShamanConfig squireShamanConfig) {
        this.aM = cVar;
        this.aN = squireShamanConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (!lIlIllIllIIlIII(this.aM.s() ? 1 : 0) && !lIlIllIllIIlIII(this.aM.r().matchesInventory() ? 1 : 0)) {
            int[] iArr = new int[lIIlIlllIIIlI[1]];
            iArr[lIIlIlllIIIlI[0]] = lIIlIlllIIIlI[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if ((!lIlIllIllIIlIIl(nearest) || !lIlIllIllIIlIlI(nearest.distanceTo(Players.getLocal()), lIIlIlllIIIlI[3])) && !lIlIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
                return Movement.walkTo(aK);
            }
            return lIIlIlllIIIlI[0];
        }
        return lIIlIlllIIIlI[0];
    }
}
