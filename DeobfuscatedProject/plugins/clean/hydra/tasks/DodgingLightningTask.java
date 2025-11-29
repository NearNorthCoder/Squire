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
import gg.squire.hydra.tasks.AHelper;
import gg.squire.hydra.tasks.HHelper;
import gg.squire.hydra.tasks.GameEnum;
import gg.squire.hydra.tasks.GameEnum18;

@TaskDesc(name="Dodging lightning", priority=5, blocking=true, register=true)
public class DodgingLightningTask
extends Task {
    private static final  Point aH;
    private final  SquireAlchemicalHydraConfig aK;
    private static final  Point[] aI;
    private final  a aJ;

    private static boolean lIIIllllIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIllllIIlIIll(Object object) {
        return object == null;
    }

    @Inject
    public DodgingLightningTask(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.aJ = a2;
        this.aK = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIllllIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIIllllIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllIIlIIIl(Object object) {
        return object != null;
    }

    static {
        v.lIIIllllIIIllII();
        aH = new Point(llllIIIllIII[2], llllIIIllIII[3]);
        Point[] pointArray = new Point[llllIIIllIII[4]];
        pointArray[v.llllIIIllIII[0]] = new Point(llllIIIllIII[5], llllIIIllIII[3]);
        pointArray[v.llllIIIllIII[1]] = new Point(llllIIIllIII[6], llllIIIllIII[7]);
        pointArray[v.llllIIIllIII[8]] = new Point(llllIIIllIII[9], llllIIIllIII[10]);
        aI = pointArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var1_1;
        v var1;
        if (!v.lIIIllllIIIllll(this.aJ.g() ? 1 : 0) || v.lIIIllllIIlIIII(this.aK.attack() ? 1 : 0)) {
            return llllIIIllIII[0];
        }
        h var2 = var1.aJ.k();
        if (!v.lIIIllllIIlIIIl(var2) || v.lIIIllllIIlIIlI((Object)var2.S(), (Object)k.LIGHTNING)) {
            return llllIIIllIII[0];
        }
        NPC var3 = var2.K();
        if (v.lIIIllllIIlIIll(var3)) {
            return llllIIIllIII[0];
        }
        if (v.lIIIllllIIlIIlI((Object)var2.R(), (Object)l.MOVING)) {
            return llllIIIllIII[0];
        }
        WorldPoint var4 = Players.getLocal().getWorldLocation();
        RegionPoint var5 = new RegionPoint(aH.getX(), aH.getY(), var4.getPlane(), var4.getRegionID());
        WorldPoint var6 = var5.toWorld();
        if (v.lIIIllllIIIllll(var6.equals((Object)var4) ? 1 : 0)) {
            var2.a(l.DONE);
            return llllIIIllIII[0];
        }
        var1_1.d(llllIIIllIII[0]);
        Movement.setDestination((WorldPoint)var5_5);
        return llllIIIllIII[1];
    }
}

