/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;

public class m
extends l {
    private static /* synthetic */ int[] llIIlIllIIIl;
    private /* synthetic */ int aZ;

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

    private static void lllllIllIlIlIl() {
        llIIlIllIIIl = new int[2];
        m.llIIlIllIIIl[0] = 0xCD ^ 0xA9 ^ (0x72 ^ 6);
        m.llIIlIllIIIl[1] = 1;
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

