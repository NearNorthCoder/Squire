/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.duke.tasks;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class h {

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

