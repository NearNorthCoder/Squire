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

public class b {

    public static WorldPoint e(TileObject tileObject) {
        return b.a(tileObject).dy(lIllIIllllII[5]);
    }

    public static WorldPoint h(TileObject tileObject) {
        return tileObject.getWorldLocation().dx(lIllIIllllII[7]);
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

