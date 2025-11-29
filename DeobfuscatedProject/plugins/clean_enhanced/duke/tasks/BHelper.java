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

public class BHelper {

    public static WorldPoint e(TileObject tileObject) {
        return b.a(tileObject).dy(5);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(7);
    }

    public static WorldPoint c(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(0).dy(4);
    }

    static {
        b.var2();
    }

    public static WorldArea d(TileObject tileObject) {
        return new WorldArea(b.c(tileObject), 2, 4);
    }

    public static WorldPoint a(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(0).dy(1);
    }

    public static WorldPoint f(TileObject tileObject) {
        return b.a(tileObject);
    }

    public static WorldArea BHelper(TileObject tileObject) {
        return new WorldArea(b.a(tileObject), 2, 3);
    }

    public static WorldPoint j(TileObject tileObject) {
        return tileObject.getWorldLocation().dy(var1[10]);
    }

    public static WorldArea i(TileObject tileObject) {
        return new WorldArea(b.h(tileObject), 8, 9);
    }

    public static WorldPoint g(TileObject tileObject) {
        return b.c(tileObject).dy(6);
    }
}

