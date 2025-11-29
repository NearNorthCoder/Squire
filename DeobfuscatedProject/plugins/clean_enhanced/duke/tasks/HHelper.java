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

public class HHelper {

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(0).dy(4);
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(h.c(tileObject), 2, 4);
    }

    static {
        h.var2();
    }

    public static WorldPoint f(TileObject tileObject) {
        return h.s(tileObject).dx(3);
    }

    public static WorldArea t(TileObject tileObject) {
        return new WorldArea(h.s(tileObject), 2, 3);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(var1[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(h.HHelper(tileObject), 8, 9);
    }

    public static WorldPoint s(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(0).dy(1);
    }

    public static WorldPoint e(TileObject tileObject) {
        return h.s(tileObject).dx(3).dy(5);
    }

    public static WorldPoint g(TileObject tileObject) {
        return h.c(tileObject).dx(3).dy(6);
    }

    public static WorldPoint HHelper(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(7);
    }
}

