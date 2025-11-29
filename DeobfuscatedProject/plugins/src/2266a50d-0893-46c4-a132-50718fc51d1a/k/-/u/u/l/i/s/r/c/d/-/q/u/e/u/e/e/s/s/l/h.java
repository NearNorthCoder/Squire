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

public class h {
    private static /* synthetic */ int[] lIllIllllIlI;

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[0]).dy(lIllIllllIlI[4]);
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(h.c(tileObject), lIllIllllIlI[2], lIllIllllIlI[4]);
    }

    static {
        h.lllIlIlIIIIlIl();
    }

    public static WorldPoint f(TileObject tileObject) {
        return h.s(tileObject).dx(lIllIllllIlI[3]);
    }

    private static void lllIlIlIIIIlIl() {
        lIllIllllIlI = new int[11];
        h.lIllIllllIlI[0] = 0x63 ^ 0x64;
        h.lIllIllllIlI[1] = 0x6E ^ 0x7C;
        h.lIllIllllIlI[2] = "   ".length();
        h.lIllIllllIlI[3] = "  ".length();
        h.lIllIllllIlI[4] = 0x23 ^ 0x5E ^ (0xE3 ^ 0x97);
        h.lIllIllllIlI[5] = " ".length();
        h.lIllIllllIlI[6] = -" ".length();
        h.lIllIllllIlI[7] = -(0xE5 ^ 0xA7 ^ (0x15 ^ 0x51));
        h.lIllIllllIlI[8] = 0x74 ^ 0x79;
        h.lIllIllllIlI[9] = 0x55 ^ 0x5D;
        h.lIllIllllIlI[10] = 0x20 ^ 0x24;
    }

    public static WorldArea t(TileObject tileObject) {
        return new WorldArea(h.s(tileObject), lIllIllllIlI[2], lIllIllllIlI[3]);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(lIllIllllIlI[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(h.h(tileObject), lIllIllllIlI[8], lIllIllllIlI[9]);
    }

    public static WorldPoint s(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[0]).dy(lIllIllllIlI[1]);
    }

    public static WorldPoint e(TileObject tileObject) {
        return h.s(tileObject).dx(lIllIllllIlI[3]).dy(lIllIllllIlI[5]);
    }

    public static WorldPoint g(TileObject tileObject) {
        return h.c(tileObject).dx(lIllIllllIlI[3]).dy(lIllIllllIlI[6]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIllllIlI[7]);
    }
}

