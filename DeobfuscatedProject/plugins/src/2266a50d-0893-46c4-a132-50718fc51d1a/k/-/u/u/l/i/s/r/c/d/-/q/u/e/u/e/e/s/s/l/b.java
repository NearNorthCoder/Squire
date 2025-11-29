/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class b {
    private static /* synthetic */ int[] lIllIIllllII;

    public static WorldPoint e(TileObject tileObject) {
        return b.a(tileObject).dy(lIllIIllllII[5]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[7]);
    }

    private static void lllIIllIIlIIIl() {
        lIllIIllllII = new int[11];
        b.lIllIIllllII[0] = -(0xFE ^ 0xAB ^ (0x33 ^ 0x6F));
        b.lIllIIllllII[1] = 0xBC ^ 0xAE;
        b.lIllIIllllII[2] = "   ".length();
        b.lIllIIllllII[3] = "  ".length();
        b.lIllIIllllII[4] = 0xB2 ^ 0xBB;
        b.lIllIIllllII[5] = " ".length();
        b.lIllIIllllII[6] = -" ".length();
        b.lIllIIllllII[7] = -(0x7D ^ 0x7B);
        b.lIllIIllllII[8] = 161 + 27 - 26 + 4 ^ 22 + 105 - 123 + 167;
        b.lIllIIllllII[9] = 0x25 ^ 0x51 ^ (0x7A ^ 6);
        b.lIllIIllllII[10] = 9 + 67 - 65 + 126 ^ 130 + 17 - 29 + 23;
    }

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[0]).dy(lIllIIllllII[4]);
    }

    static {
        b.lllIIllIIlIIIl();
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(b.c(tileObject), lIllIIllllII[2], lIllIIllllII[4]);
    }

    public static WorldPoint a(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[0]).dy(lIllIIllllII[1]);
    }

    public static WorldPoint f(TileObject tileObject) {
        return b.a(tileObject);
    }

    public static WorldArea b(TileObject tileObject) {
        return new WorldArea(b.a(tileObject), lIllIIllllII[2], lIllIIllllII[3]);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(lIllIIllllII[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(b.h(tileObject), lIllIIllllII[8], lIllIIllllII[9]);
    }

    public static WorldPoint g(TileObject tileObject) {
        return b.c(tileObject).dy(lIllIIllllII[6]);
    }
}

