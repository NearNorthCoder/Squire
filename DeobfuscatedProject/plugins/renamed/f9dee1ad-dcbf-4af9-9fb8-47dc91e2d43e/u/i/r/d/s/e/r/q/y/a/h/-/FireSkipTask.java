/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.e_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.h_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.KEnum;

/* TASK: Fire skip -> FireskipTask */
@TaskDesc(name="Fire skip", priority=5, blocking=true)
public class FireSkipTask
extends Task {
    private final /* synthetic */ a aE;
    private final /* synthetic */ SquireAlchemicalHydraConfig aG;
    private final /* synthetic */ e aF;
    private static /* synthetic */ int[] llllIIllllIl;
    private static final /* synthetic */ Point[] aD;

    private static boolean lIIlIIIIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIIIIlIlIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIIIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIIlIlIII(Object object) {
        return object != null;
    }

    static {
        u.lIIlIIIIIlIIlIl();
        Point[] pointArray = new Point[llllIIllllIl[4]];
        pointArray[u.llllIIllllIl[0]] = new Point(llllIIllllIl[5], llllIIllllIl[6]);
        pointArray[u.llllIIllllIl[2]] = new Point(llllIIllllIl[7], llllIIllllIl[8]);
        pointArray[u.llllIIllllIl[3]] = new Point(llllIIllllIl[9], llllIIllllIl[10]);
        aD = pointArray;
    }

    private static void lIIlIIIIIlIIlIl() {
        llllIIllllIl = new int[11];
        u.llllIIllllIl[0] = (0x33 ^ 0x1E) & ~(0x45 ^ 0x68);
        u.llllIIllllIl[1] = 0xB9 ^ 0xB3;
        u.llllIIllllIl[2] = 1;
        u.llllIIllllIl[3] = 2;
        u.llllIIllllIl[4] = 3;
        u.llllIIllllIl[5] = 0x2E ^ 0x53 ^ (0x64 ^ 0x31);
        u.llllIIllllIl[6] = 49 + 71 - 76 + 91 ^ 49 + 78 - 30 + 84;
        u.llllIIllllIl[7] = 0x4F ^ 0x31 ^ (0xF8 ^ 0xAA);
        u.llllIIllllIl[8] = 0x24 ^ 0x10 ^ (0x90 ^ 0x8B);
        u.llllIIllllIl[9] = 92 + 96 - 102 + 50 ^ 54 + 149 - 150 + 110;
        u.llllIIllllIl[10] = 0xA8 ^ 0x85 ^ 3;
    }

    @Inject
    public u(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aE = a2;
        this.aF = e2;
        this.aG = squireAlchemicalHydraConfig;
    }

    private static boolean lIIlIIIIIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        RegionPoint var2;
        u var3;
        if (!u.lIIlIIIIIlIIllI(this.aE.g() ? 1 : 0) || u.lIIlIIIIIlIIlll(this.aG.attack() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        h var6 = var3.aE.k();
        if (!u.lIIlIIIIIlIlIII(var6) || u.lIIlIIIIIlIlIIl((Object)var6.S(), (Object)k.FLAME)) {
            return llllIIllllIl[0];
        }
        if (u.lIIlIIIIIlIlIlI(Static.getClient().getTickCount() - var6.V(), llllIIllllIl[1])) {
            return llllIIllllIl[0];
        }
        NPC var5 = var6.K();
        if (!u.lIIlIIIIIlIlIII(var5) || u.lIIlIIIIIlIlIII(var5.getInteracting())) {
            return llllIIllllIl[0];
        }
        var6.d(llllIIllllIl[0]);
        Player var4 = Players.getLocal();
        WorldPoint var1 = var4.getWorldLocation();
        if (u.lIIlIIIIIlIIlll(var3.aG.melee() ? 1 : 0)) {
            var2 = new RegionPoint(aD[llllIIllllIl[0]].getX(), aD[llllIIllllIl[0]].getY(), var1.getPlane(), var1.getRegionID());
            WorldPoint var7 = var2.toWorld();
            if (u.lIIlIIIIIlIIllI(var5.isMoving() ? 1 : 0)) {
                if (u.lIIlIIIIIlIIllI(var1.equals((Object)var7) ? 1 : 0)) {
                    return llllIIllllIl[0];
                }
                Movement.walkTo((WorldPoint)var7);
                0;
                return llllIIllllIl[2];
            }
        }
        if (!u.lIIlIIIIIlIIlll(var6.B() ? 1 : 0) || u.lIIlIIIIIlIIllI(var5.isMoving() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        if (u.lIIlIIIIIlIlIlI(var6.C(), llllIIllllIl[3])) {
            var2 = new RegionPoint(aD[llllIIllllIl[2]].getX(), aD[llllIIllllIl[2]].getY(), var1.getPlane(), var1.getRegionID()).toWorld();
            0;
            if ((0x6C ^ 0x68) < ((0xB ^ 4) & ~(0xBF ^ 0xB0))) {
                return false;
            }
        } else {
            var2 = new RegionPoint(aD[llllIIllllIl[3]].getX(), aD[llllIIllllIl[3]].getY(), var1.getPlane(), var1.getRegionID()).toWorld();
        }
        if (u.lIIlIIIIIlIIllI(var1.equals((Object)var2) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        Movement.walkTo((WorldPoint)var5_5);
        0;
        return llllIIllllIl[2];
    }
}

