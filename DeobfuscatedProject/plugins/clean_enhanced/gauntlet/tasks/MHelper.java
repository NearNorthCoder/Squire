/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.gauntlet.tasks;

import gg.squire.gauntlet.tasks.LHelper;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public class MHelper
extends LHelper {
    
    private  int aZ;

    public static m b(WorldPoint worldPoint, Point point) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % 0).dy(-worldPoint.getY() % 0);
        return new MHelper(worldPoint2, point);
    }

    public void l(int n2) {
        this.aZ = n2;
    }

    public MHelper(WorldPoint worldPoint, Point point) {
        super(worldPoint, point);
    }

    public int bb() {
        return this.aZ;
    }

    public void k(int n2) {
        this.aZ += n2;
    }

    public void ba() {
        this.aZ -= 1;
    }

    static {
        m.var2();
    }
}

