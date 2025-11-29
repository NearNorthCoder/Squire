/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 */
package gg.squire.quest.tasks;

import java.util.Random;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;

public class ZHelper
implements o {
    private final  WorldPoint ar;

    @Override
    public boolean D() {
        if (z.var2(Movement.shouldWalk() ? 1 : 0)) {
            return var1[0];
        }
        this.b(this.ar);
        return var1[1];
    }

    private static void var3() {
        var1 = new int[4];
        z.var1[0] = (0xD ^ 0x42) & ~(0xCD ^ 0x82);
        z.var1[1] = 1;
        z.var1[2] = 0xC5 ^ 0xC2;
        z.var1[3] = 3;
    }

    static {
        z.var3();
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    public ZHelper(WorldPoint worldPoint) {
        this.ar = worldPoint;
    }

    public void b(WorldPoint worldPoint) {
        Random random = new Random();
        int n2 = random.nextInt(var1[2]) - var1[3];
        int n3 = random.nextInt(var1[2]) - var1[3];
        if (z.var2(n2) && z.var2(n3)) {
            n2 = var1[1];
        }
        WorldPoint worldPoint2 = new WorldPoint(worldPoint.getX() + n2, worldPoint.getY() + n3, worldPoint.getPlane());
        Walker.walkTo((WorldPoint)worldPoint2);
        0;
    }
}

