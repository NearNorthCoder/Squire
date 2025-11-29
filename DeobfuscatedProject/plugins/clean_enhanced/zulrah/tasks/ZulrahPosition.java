/*
 * Deobfuscated Zulrah Position Enum
 * Represents where Zulrah spawns in the arena
 */
package gg.squire.zulrah.tasks;

/**
 * Zulrah's spawn positions around the arena.
 * Zulrah moves between these positions during the fight.
 */
public enum ZulrahPosition {
    CENTER(0, 7),
    EAST(6, 7),
    WEST(-5, 7),
    SOUTH(0, 0);

    private final int xOffset;
    private final int yOffset;

    ZulrahPosition(int xOffset, int yOffset) {
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
