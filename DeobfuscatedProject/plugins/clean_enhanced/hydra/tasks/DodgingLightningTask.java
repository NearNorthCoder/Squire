/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.hydra.tasks;

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
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.HydraManager;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum4;

@TaskDesc(name="Dodging lightning", priority=5, blocking=true, register=true)
public class DodgingLightningTask
extends Task {
    private static final  Point aH;
    private final  SquireAlchemicalHydraConfig aK;
    private static final  Point[] aI;
    private final  a aJ;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Inject
    public DodgingLightningTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aJ = a2;
        this.aK = squireAlchemicalHydraConfig;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static void var5() {
        var1 = new int[11];
        v.var1[0] = (0xE1 ^ 0xA6) & ~(0x6A ^ 0x2D);
        v.var1[1] = 1;
        v.var1[2] = 0xA6 ^ 0x80;
        v.var1[3] = 0x37 ^ 1;
        v.var1[4] = 3;
        v.var1[5] = 0xCD ^ 0xB9 ^ (0x1B ^ 0x4A);
        v.var1[6] = 0 + 121 - 41 + 101 ^ 121 + 3 - 113 + 142;
        v.var1[7] = 0x5C ^ 0x73;
        v.var1[8] = 2;
        v.var1[9] = 0x87 ^ 0xAC;
        v.var1[10] = 182 + 133 - 248 + 118 ^ 135 + 106 - 104 + 14;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    static {
        v.var5();
        aH = new Point(var1[2], var1[3]);
        Point[] pointArray = new Point[var1[4]];
        pointArray[v.var1[0]] = new Point(var1[5], var1[3]);
        pointArray[v.var1[1]] = new Point(var1[6], var1[7]);
        pointArray[v.var1[8]] = new Point(var1[9], var1[10]);
        aI = pointArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var1_1;
        v var8;
        if (!v.var2(this.aJ.g() ? 1 : 0) || v.var6(this.aK.attack() ? 1 : 0)) {
            return var1[0];
        }
        h var9 = var8.aJ.k();
        if (!v.var7(var9) || v.var4((Object)var9.S(), (Object)k.LIGHTNING)) {
            return var1[0];
        }
        NPC var10 = var9.K();
        if (v.var3(var10)) {
            return var1[0];
        }
        if (v.var4((Object)var9.R(), (Object)l.MOVING)) {
            return var1[0];
        }
        WorldPoint var11 = Players.getLocal().getWorldLocation();
        RegionPoint var12 = new RegionPoint(aH.getX(), aH.getY(), var11.getPlane(), var11.getRegionID());
        WorldPoint var13 = var12.toWorld();
        if (v.var2(var13.equals((Object)var11) ? 1 : 0)) {
            var9.a(l.DONE);
            return var1[0];
        }
        var1_1.d(var1[0]);
        Movement.setDestination((WorldPoint)var5_5);
        return var1[1];
    }
}

