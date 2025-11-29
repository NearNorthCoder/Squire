package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/b.class */
public class C0001b {
    private static /* synthetic */ int[] lIllIIllllII;

    public static WorldPoint e(TileObject tileObject) {
        return a(tileObject).dy(lIllIIllllII[5]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[7]);
    }

    private static void lllIIllIIlIIIl() {
        lIllIIllllII = new int[11];
        lIllIIllllII[0] = -((254 ^ 171) ^ (51 ^ 111));
        lIllIIllllII[1] = 188 ^ 174;
        lIllIIllllII[2] = "   ".length();
        lIllIIllllII[3] = "  ".length();
        lIllIIllllII[4] = 178 ^ 187;
        lIllIIllllII[5] = " ".length();
        lIllIIllllII[6] = -" ".length();
        lIllIIllllII[7] = -(125 ^ 123);
        lIllIIllllII[8] = (((161 + 27) - 26) + 4) ^ (((22 + 105) - 123) + 167);
        lIllIIllllII[9] = (37 ^ 81) ^ (122 ^ 6);
        lIllIIllllII[10] = (((9 + 67) - 65) + 126) ^ (((130 + 17) - 29) + 23);
    }

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[0]).dy(lIllIIllllII[4]);
    }

    static {
        lllIIllIIlIIIl();
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(c(tileObject), lIllIIllllII[2], lIllIIllllII[4]);
    }

    public static WorldPoint a(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[0]).dy(lIllIIllllII[1]);
    }

    public static WorldPoint f(TileObject tileObject) {
        return a(tileObject);
    }

    public static WorldArea b(TileObject tileObject) {
        return new WorldArea(a(tileObject), lIllIIllllII[2], lIllIIllllII[3]);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(lIllIIllllII[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(h(tileObject), lIllIIllllII[8], lIllIIllllII[9]);
    }

    public static WorldPoint g(TileObject tileObject) {
        return c(tileObject).dy(lIllIIllllII[6]);
    }
}
