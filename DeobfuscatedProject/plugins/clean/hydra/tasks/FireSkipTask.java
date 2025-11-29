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
package gg.squire.hydra.tasks;

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
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.EHelper;
import gg.squire.hydra.tasks.HHelper;
import gg.squire.hydra.tasks.GameEnum;

@TaskDesc(name="Fire skip", priority=5, blocking=true)
public class FireSkipTask
extends Task {
    private final  a aE;
    private final  SquireAlchemicalHydraConfig aG;
    private final  e aF;
    
    private static final  Point[] aD;

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

    @Inject
    public FireSkipTask(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
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
        RegionPoint var1;
        u var2;
        if (!u.lIIlIIIIIlIIllI(this.aE.g() ? 1 : 0) || u.lIIlIIIIIlIIlll(this.aG.attack() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        h var3 = var2.aE.k();
        if (!u.lIIlIIIIIlIlIII(var3) || u.lIIlIIIIIlIlIIl((Object)var3.S(), (Object)k.FLAME)) {
            return llllIIllllIl[0];
        }
        if (u.lIIlIIIIIlIlIlI(Static.getClient().getTickCount() - var3.V(), llllIIllllIl[1])) {
            return llllIIllllIl[0];
        }
        NPC var4 = var3.K();
        if (!u.lIIlIIIIIlIlIII(var4) || u.lIIlIIIIIlIlIII(var4.getInteracting())) {
            return llllIIllllIl[0];
        }
        var3.d(llllIIllllIl[0]);
        Player var5 = Players.getLocal();
        WorldPoint var6 = var5.getWorldLocation();
        if (u.lIIlIIIIIlIIlll(var2.aG.melee() ? 1 : 0)) {
            var1 = new RegionPoint(aD[llllIIllllIl[0]].getX(), aD[llllIIllllIl[0]].getY(), var6.getPlane(), var6.getRegionID());
            WorldPoint var7 = var1.toWorld();
            if (u.lIIlIIIIIlIIllI(var4.isMoving() ? 1 : 0)) {
                if (u.lIIlIIIIIlIIllI(var6.equals((Object)var7) ? 1 : 0)) {
                    return llllIIllllIl[0];
                }
                Movement.walkTo((WorldPoint)var7);

                return llllIIllllIl[2];
            }
        }
        if (!u.lIIlIIIIIlIIlll(var3.B() ? 1 : 0) || u.lIIlIIIIIlIIllI(var4.isMoving() ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        if (u.lIIlIIIIIlIlIlI(var3.C(), llllIIllllIl[3])) {
            var1 = new RegionPoint(aD[llllIIllllIl[2]].getX(), aD[llllIIllllIl[2]].getY(), var6.getPlane(), var6.getRegionID()).toWorld();

            if ((0x6C ^ 0x68) < ((0xB ^ 4) & ~(0xBF ^ 0xB0))) {
                return false;
            }
        } else {
            var1 = new RegionPoint(aD[llllIIllllIl[3]].getX(), aD[llllIIllllIl[3]].getY(), var6.getPlane(), var6.getRegionID()).toWorld();
        }
        if (u.lIIlIIIIIlIIllI(var6.equals((Object)var1) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        Movement.walkTo((WorldPoint)var5_5);

        return llllIIllllIl[2];
    }
}

