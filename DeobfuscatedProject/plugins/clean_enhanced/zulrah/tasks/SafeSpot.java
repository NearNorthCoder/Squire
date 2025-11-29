/*
 * Deobfuscated SafeSpot Enum
 * Represents player safe spot positions in the Zulrah arena
 */
package gg.squire.zulrah.tasks;

/**
 * Safe spot positions around the Zulrah arena.
 * Coordinates are offsets from the instance base point.
 */
public enum SafeSpot {
    NORTH_EAST(6, 11),
    NORTH_WEST(-5, 11),
    EAST(6, 7),
    WEST(-5, 7),
    CENTER_EAST(3, 7),
    CENTER_WEST(-2, 7),
    CENTER(0, 7),
    SOUTH_EAST(6, 0),
    SOUTH_WEST(-5, 0);

    private final int xOffset;
    private final int yOffset;

    SafeSpot(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    public int getXOffset() {
        return xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }
}
