/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.gauntlet.tasks;

import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public class m
extends l {
    
    private  int aZ;

    public static m b(WorldPoint worldPoint, Point point) {
        WorldPoint worldPoint2 = worldPoint.dx(-worldPoint.getX() % llIIlIllIIIl[0]).dy(-worldPoint.getY() % llIIlIllIIIl[0]);
        return new m(worldPoint2, point);
    }

    public void l(int n2) {
        this.aZ = n2;
    }

    public m(WorldPoint worldPoint, Point point) {
        super(worldPoint, point);
    }

    public int bb() {
        return this.aZ;
    }

    public void k(int n2) {
        this.aZ += n2;
    }

    public void ba() {
        this.aZ -= llIIlIllIIIl[1];
    }

    static {
        m.lllllIllIlIlIl();
    }
}

