/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api.movement.pathfinder;

import net.runelite.api.coords.WorldPoint;

public interface CollisionMap {
    /**
     * Check if movement is allowed to the NORTH from the given tile.
     * @param x World X coordinate
     * @param y World Y coordinate
     * @param z Plane/level (0-3)
     * @return true if walkable north
     */
    public boolean n(int x, int y, int z);

    /**
     * Check if movement is allowed to the EAST from the given tile.
     * @param x World X coordinate
     * @param y World Y coordinate
     * @param z Plane/level (0-3)
     * @return true if walkable east
     */
    public boolean e(int x, int y, int z);

    /** Check if movement is allowed to the SOUTH from the given tile. */
    default public boolean s(int x, int y, int z) {
        return this.n(x, y - 1, z);
    }

    /** Check if movement is allowed to the WEST from the given tile. */
    default public boolean w(int x, int y, int z) {
        return this.e(x - 1, y, z);
    }

    /** Check if diagonal movement NORTHEAST is allowed from the given tile. */
    default public boolean ne(int x, int y, int z) {
        return this.n(x, y, z) && this.e(x, y + 1, z) && this.e(x, y, z) && this.n(x + 1, y, z);
    }

    /** Check if diagonal movement NORTHWEST is allowed from the given tile. */
    default public boolean nw(int x, int y, int z) {
        return this.n(x, y, z) && this.w(x, y + 1, z) && this.w(x, y, z) && this.n(x - 1, y, z);
    }

    /** Check if diagonal movement SOUTHEAST is allowed from the given tile. */
    default public boolean se(int x, int y, int z) {
        return this.s(x, y, z) && this.e(x, y - 1, z) && this.e(x, y, z) && this.s(x + 1, y, z);
    }

    /** Check if diagonal movement SOUTHWEST is allowed from the given tile. */
    default public boolean sw(int x, int y, int z) {
        return this.s(x, y, z) && this.w(x, y - 1, z) && this.w(x, y, z) && this.s(x - 1, y, z);
    }

    /** Check if the tile is completely blocked (no movement in any direction). */
    default public boolean fullBlock(int x, int y, int z) {
        return !this.n(x, y, z) && !this.s(x, y, z) && !this.w(x, y, z) && !this.e(x, y, z);
    }

    default public boolean n(WorldPoint worldPoint) {
        return this.n(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean s(WorldPoint worldPoint) {
        return this.s(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean w(WorldPoint worldPoint) {
        return this.w(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean e(WorldPoint worldPoint) {
        return this.e(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean ne(WorldPoint worldPoint) {
        return this.ne(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean nw(WorldPoint worldPoint) {
        return this.nw(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean se(WorldPoint worldPoint) {
        return this.se(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean sw(WorldPoint worldPoint) {
        return this.sw(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default public boolean fullBlock(WorldPoint worldPoint) {
        return !this.n(worldPoint) && !this.s(worldPoint) && !this.w(worldPoint) && !this.e(worldPoint);
    }
}

