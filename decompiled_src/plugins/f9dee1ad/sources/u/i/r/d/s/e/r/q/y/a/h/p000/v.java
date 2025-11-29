package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Dodging lightning", priority = 5, blocking = true, register = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.v  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/v.class */
public class v extends Task {
    private static final /* synthetic */ Point aH;
    private final /* synthetic */ SquireAlchemicalHydraConfig aK;
    private static final /* synthetic */ Point[] aI;
    private final /* synthetic */ C0000a aJ;
    private static /* synthetic */ int[] llllIIIllIII;

    private static boolean lIIIllllIIIllll(int i) {
        return i != 0;
    }

    private static boolean lIIIllllIIlIIll(Object obj) {
        return obj == null;
    }

    @Inject
    public v(C0000a c0000a, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aJ = c0000a;
        this.aK = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIllllIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIIllllIIIllII() {
        llllIIIllIII = new int[11];
        llllIIIllIII[0] = (225 ^ 166) & ((106 ^ 45) ^ (-1));
        llllIIIllIII[1] = " ".length();
        llllIIIllIII[2] = 166 ^ 128;
        llllIIIllIII[3] = 55 ^ 1;
        llllIIIllIII[4] = "   ".length();
        llllIIIllIII[5] = (205 ^ 185) ^ (27 ^ 74);
        llllIIIllIII[6] = (((0 + 121) - 41) + 101) ^ (((121 + 3) - 113) + 142);
        llllIIIllIII[7] = 92 ^ 115;
        llllIIIllIII[8] = "  ".length();
        llllIIIllIII[9] = 135 ^ 172;
        llllIIIllIII[10] = (((182 + 133) - 248) + 118) ^ (((135 + 106) - 104) + 14);
    }

    private static boolean lIIIllllIIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIIllllIIlIIIl(Object obj) {
        return obj != null;
    }

    static {
        lIIIllllIIIllII();
        aH = new Point(llllIIIllIII[2], llllIIIllIII[3]);
        Point[] pointArr = new Point[llllIIIllIII[4]];
        pointArr[llllIIIllIII[0]] = new Point(llllIIIllIII[5], llllIIIllIII[3]);
        pointArr[llllIIIllIII[1]] = new Point(llllIIIllIII[6], llllIIIllIII[7]);
        pointArr[llllIIIllIII[8]] = new Point(llllIIIllIII[9], llllIIIllIII[10]);
        aI = pointArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    public boolean run() {
        if (!lIIIllllIIIllll(this.aJ.g() ? 1 : 0) || lIIIllllIIlIIII(this.aK.attack() ? 1 : 0)) {
            return llllIIIllIII[0];
        }
        h k = this.aJ.k();
        if (!lIIIllllIIlIIIl(k) || lIIIllllIIlIIlI(k.S(), k.LIGHTNING)) {
            return llllIIIllIII[0];
        }
        if (!lIIIllllIIlIIll(k.K()) && !lIIIllllIIlIIlI(k.R(), l.MOVING)) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            WorldPoint world = new RegionPoint(aH.getX(), aH.getY(), worldLocation.getPlane(), worldLocation.getRegionID()).toWorld();
            if (lIIIllllIIIllll(world.equals(worldLocation) ? 1 : 0)) {
                k.a(l.DONE);
                return llllIIIllIII[0];
            }
            k.d(llllIIIllIII[0]);
            Movement.setDestination(world);
            return llllIIIllIII[1];
        }
        return llllIIIllIII[0];
    }
}
