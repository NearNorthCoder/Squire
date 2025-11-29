package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/h.class */
public class C0007h {
    private static /* synthetic */ int[] lIllIllllIlI;

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[0]).dy(lIllIllllIlI[4]);
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(c(tileObject), lIllIllllIlI[2], lIllIllllIlI[4]);
    }

    static {
        lllIlIlIIIIlIl();
    }

    public static WorldPoint f(TileObject tileObject) {
        return s(tileObject).dx(lIllIllllIlI[3]);
    }

    private static void lllIlIlIIIIlIl() {
        lIllIllllIlI = new int[11];
        lIllIllllIlI[0] = 99 ^ 100;
        lIllIllllIlI[1] = 110 ^ 124;
        lIllIllllIlI[2] = "   ".length();
        lIllIllllIlI[3] = "  ".length();
        lIllIllllIlI[4] = (35 ^ 94) ^ (227 ^ 151);
        lIllIllllIlI[5] = " ".length();
        lIllIllllIlI[6] = -" ".length();
        lIllIllllIlI[7] = -((229 ^ 167) ^ (21 ^ 81));
        lIllIllllIlI[8] = 116 ^ 121;
        lIllIllllIlI[9] = 85 ^ 93;
        lIllIllllIlI[10] = 32 ^ 36;
    }

    public static WorldArea t(TileObject tileObject) {
        return new WorldArea(s(tileObject), lIllIllllIlI[2], lIllIllllIlI[3]);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(lIllIllllIlI[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(h(tileObject), lIllIllllIlI[8], lIllIllllIlI[9]);
    }

    public static WorldPoint s(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[0]).dy(lIllIllllIlI[1]);
    }

    public static WorldPoint e(TileObject tileObject) {
        return s(tileObject).dx(lIllIllllIlI[3]).dy(lIllIllllIlI[5]);
    }

    public static WorldPoint g(TileObject tileObject) {
        return c(tileObject).dx(lIllIllllIlI[3]).dy(lIllIllllIlI[6]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[7]);
    }
}
