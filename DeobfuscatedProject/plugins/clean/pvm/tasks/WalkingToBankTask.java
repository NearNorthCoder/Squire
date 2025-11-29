/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.pvm.tasks;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.pvm.tasks.CHelper;

@TaskDesc(name="Walking to bank", priority=10, blocking=true)
public class WalkingToBankTask
extends Task {
    public static final  WorldPoint aL;
    
    private final  c aM;
    private final  SquireShamanConfig aN;
    public static final  WorldPoint aK;

    private static boolean lIlIllIllIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean G() {
        Player player = Players.getLocal();
        WorldPoint worldPoint = player.getWorldLocation();
        int n2 = worldPoint.getRegionID();
        if (!A.lIlIllIllIIllII(n2, lIIlIlllIIIlI[4]) || A.lIlIllIllIIllIl(n2, lIIlIlllIIIlI[5])) {
            Movement.walkTo((WorldPoint)aL);

        } else {
            Movement.walkTo((WorldPoint)aK);

        }
        return lIIlIlllIIIlI[0];
    }

    private static boolean lIlIllIllIIlIIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIllIIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIllIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIllIIllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        A.lIlIllIllIIIlll();
        aK = new WorldPoint(lIIlIlllIIIlI[6], lIIlIlllIIIlI[7], lIIlIlllIIIlI[0]);
        aL = new WorldPoint(lIIlIlllIIIlI[8], lIIlIlllIIIlI[9], lIIlIlllIIIlI[0]);
    }

    private static boolean lIlIllIllIIlIll(int n2) {
        return n2 == 0;
    }

    @Inject
    public WalkingToBankTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.aM = c2;
        this.aN = squireShamanConfig;
    }

    public boolean run() {
        A var1;
        if (A.lIlIllIllIIlIII(this.aM.s() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        InventorySetup var2 = var1.aM.r();
        if (A.lIlIllIllIIlIII(var2.matchesInventory() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        int[] nArray = new int[lIIlIlllIIIlI[1]];
        nArray[A.lIIlIlllIIIlI[0]] = lIIlIlllIIIlI[2];
        TileObject var3 = TileObjects.getNearest((int[])nArray);
        if (A.lIlIllIllIIlIIl(var3) && A.lIlIllIllIIlIlI(var3.distanceTo((Locatable)Players.getLocal()), lIIlIlllIIIlI[3])) {
            return lIIlIlllIIIlI[0];
        }
        if (A.lIlIllIllIIlIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIlllIIIlI[0];
        }
        return Movement.walkTo((WorldPoint)aK);
    }
}

