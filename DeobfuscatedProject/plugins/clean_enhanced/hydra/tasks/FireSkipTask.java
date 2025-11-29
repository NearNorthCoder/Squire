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
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.GameEnum;

@TaskDesc(name="Fire skip", priority=5, blocking=true)
public class FireSkipTask
extends Task {
    private final  a aE;
    private final  SquireAlchemicalHydraConfig aG;
    private final  e aF;
    
    private static final  Point[] aD;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

    static {
        u.var6();
        Point[] pointArray = new Point[var1[4]];
        pointArray[u.var1[0]] = new Point(var1[5], var1[6]);
        pointArray[u.var1[2]] = new Point(var1[7], var1[8]);
        pointArray[u.var1[3]] = new Point(var1[9], var1[10]);
        aD = pointArray;
    }

    private static void var6() {
        var1 = new int[11];
        u.var1[0] = (0x33 ^ 0x1E) & ~(0x45 ^ 0x68);
        u.var1[1] = 0xB9 ^ 0xB3;
        u.var1[2] = 1;
        u.var1[3] = 2;
        u.var1[4] = 3;
        u.var1[5] = 0x2E ^ 0x53 ^ (0x64 ^ 0x31);
        u.var1[6] = 49 + 71 - 76 + 91 ^ 49 + 78 - 30 + 84;
        u.var1[7] = 0x4F ^ 0x31 ^ (0xF8 ^ 0xAA);
        u.var1[8] = 0x24 ^ 0x10 ^ (0x90 ^ 0x8B);
        u.var1[9] = 92 + 96 - 102 + 50 ^ 54 + 149 - 150 + 110;
        u.var1[10] = 0xA8 ^ 0x85 ^ 3;
    }

    @Inject
    public FireSkipTask(a a2, e e2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aE = a2;
        this.aF = e2;
        this.aG = squireAlchemicalHydraConfig;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        RegionPoint var8;
        u var9;
        if (!u.var2(this.aE.g() ? 1 : 0) || u.var4(this.aG.attack() ? 1 : 0)) {
            return var1[0];
        }
        h var10 = var9.aE.k();
        if (!u.var5(var10) || u.var3((Object)var10.S(), (Object)k.FLAME)) {
            return var1[0];
        }
        if (u.var7(Static.getClient().getTickCount() - var10.V(), var1[1])) {
            return var1[0];
        }
        NPC var11 = var10.K();
        if (!u.var5(var11) || u.var5(var11.getInteracting())) {
            return var1[0];
        }
        var10.d(var1[0]);
        Player var12 = Players.getLocal();
        WorldPoint var13 = var12.getWorldLocation();
        if (u.var4(var9.aG.melee() ? 1 : 0)) {
            var8 = new RegionPoint(aD[var1[0]].getX(), aD[var1[0]].getY(), var13.getPlane(), var13.getRegionID());
            WorldPoint var14 = var8.toWorld();
            if (u.var2(var11.isMoving() ? 1 : 0)) {
                if (u.var2(var13.equals((Object)var14) ? 1 : 0)) {
                    return var1[0];
                }
                Movement.walkTo((WorldPoint)var14);
                0;
                return var1[2];
            }
        }
        if (!u.var4(var10.B() ? 1 : 0) || u.var2(var11.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        if (u.var7(var10.C(), var1[3])) {
            var8 = new RegionPoint(aD[var1[2]].getX(), aD[var1[2]].getY(), var13.getPlane(), var13.getRegionID()).toWorld();
            0;
            if ((0x6C ^ 0x68) < ((0xB ^ 4) & ~(0xBF ^ 0xB0))) {
                return ((0xB2 ^ 0xBA) & ~(0x71 ^ 0x79)) != 0;
            }
        } else {
            var8 = new RegionPoint(aD[var1[3]].getX(), aD[var1[3]].getY(), var13.getPlane(), var13.getRegionID()).toWorld();
        }
        if (u.var2(var13.equals((Object)var8) ? 1 : 0)) {
            return var1[0];
        }
        Movement.walkTo((WorldPoint)var5_5);
        0;
        return var1[2];
    }
}

