package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Fire skip", priority = 5, blocking = true)
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.u  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/u.class */
public class u extends Task {
    private final /* synthetic */ C0000a aE;
    private final /* synthetic */ SquireAlchemicalHydraConfig aG;
    private final /* synthetic */ e aF;
    private static /* synthetic */ int[] llllIIllllIl;
    private static final /* synthetic */ Point[] aD;

    private static boolean lIIlIIIIIlIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlIIIIIlIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIIIIlIIlll(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIIlIlIII(Object obj) {
        return obj != null;
    }

    static {
        lIIlIIIIIlIIlIl();
        Point[] pointArr = new Point[llllIIllllIl[4]];
        pointArr[llllIIllllIl[0]] = new Point(llllIIllllIl[5], llllIIllllIl[6]);
        pointArr[llllIIllllIl[2]] = new Point(llllIIllllIl[7], llllIIllllIl[8]);
        pointArr[llllIIllllIl[3]] = new Point(llllIIllllIl[9], llllIIllllIl[10]);
        aD = pointArr;
    }

    private static void lIIlIIIIIlIIlIl() {
        llllIIllllIl = new int[11];
        llllIIllllIl[0] = (51 ^ 30) & ((69 ^ 104) ^ (-1));
        llllIIllllIl[1] = 185 ^ 179;
        llllIIllllIl[2] = " ".length();
        llllIIllllIl[3] = "  ".length();
        llllIIllllIl[4] = "   ".length();
        llllIIllllIl[5] = (46 ^ 83) ^ (100 ^ 49);
        llllIIllllIl[6] = (((49 + 71) - 76) + 91) ^ (((49 + 78) - 30) + 84);
        llllIIllllIl[7] = (79 ^ 49) ^ (248 ^ 170);
        llllIIllllIl[8] = (36 ^ 16) ^ (144 ^ 139);
        llllIIllllIl[9] = (((92 + 96) - 102) + 50) ^ (((54 + 149) - 150) + 110);
        llllIIllllIl[10] = (168 ^ 133) ^ "   ".length();
    }

    @Inject
    public u(C0000a c0000a, e eVar, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aE = c0000a;
        this.aF = eVar;
        this.aG = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public boolean run() {
        WorldPoint world;
        if (!lIIlIIIIIlIIllI(this.aE.g() ? 1 : 0) || lIIlIIIIIlIIlll(this.aG.attack() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        h k = this.aE.k();
        if (!lIIlIIIIIlIlIII(k) || lIIlIIIIIlIlIIl(k.S(), k.FLAME)) {
            return llllIIllllIl[0];
        }
        if (lIIlIIIIIlIlIlI(Static.getClient().getTickCount() - k.V(), llllIIllllIl[1])) {
            return llllIIllllIl[0];
        }
        NPC K = k.K();
        if (!lIIlIIIIIlIlIII(K) || lIIlIIIIIlIlIII(K.getInteracting())) {
            return llllIIllllIl[0];
        }
        k.d(llllIIllllIl[0]);
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIlIIIIIlIIlll(this.aG.melee() ? 1 : 0)) {
            WorldPoint world2 = new RegionPoint(aD[llllIIllllIl[0]].getX(), aD[llllIIllllIl[0]].getY(), worldLocation.getPlane(), worldLocation.getRegionID()).toWorld();
            if (lIIlIIIIIlIIllI(K.isMoving() ? 1 : 0)) {
                if (lIIlIIIIIlIIllI(worldLocation.equals(world2) ? 1 : 0)) {
                    return llllIIllllIl[0];
                }
                Movement.walkTo(world2);
                "".length();
                return llllIIllllIl[2];
            }
        }
        if (!lIIlIIIIIlIIlll(k.B() ? 1 : 0) || lIIlIIIIIlIIllI(K.isMoving() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        if (lIIlIIIIIlIlIlI(k.C(), llllIIllllIl[3])) {
            world = new RegionPoint(aD[llllIIllllIl[2]].getX(), aD[llllIIllllIl[2]].getY(), worldLocation.getPlane(), worldLocation.getRegionID()).toWorld();
            "".length();
            if ((108 ^ 104) < ((11 ^ 4) & ((191 ^ 176) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            world = new RegionPoint(aD[llllIIllllIl[3]].getX(), aD[llllIIllllIl[3]].getY(), worldLocation.getPlane(), worldLocation.getRegionID()).toWorld();
        }
        if (lIIlIIIIIlIIllI(worldLocation.equals(world) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        Movement.walkTo(world);
        "".length();
        return llllIIllllIl[2];
    }
}
