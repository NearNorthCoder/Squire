/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the symbols used in the Path of Apmeken matching puzzle.
 * Each symbol appears on ground tiles and can be matched with corresponding objects.
 */
public enum PuzzleSymbol {
    LINE(0, 45568, 45517),
    KNIVES(1, 45569, 45544),
    TRIANGLE(2, 45567, 45534),
    DIAMOND(3, 45585, 45530),
    HAND(4, 45621, 45539),
    BIRD(5, 45622, 45542),
    CROOK(6, 45551, 45519),
    WIGGLE(7, 45576, 45531),
    FOOT(8, 64507, 48599);

    private final int value;
    private final int groundObjectId;
    private final int gameObjectId;

    PuzzleSymbol(int value, int groundObjectId, int gameObjectId) {
        this.value = value;
        this.groundObjectId = groundObjectId;
        this.gameObjectId = gameObjectId;
    }

    /**
     * Gets the ordinal value of this symbol.
     * @return the symbol's index value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Gets the ground object ID for this symbol.
     * @return the ID of the ground marker object
     */
    public int getGroundObjectId() {
        return this.groundObjectId;
    }

    /**
     * Gets the game object ID for this symbol.
     * @return the ID of the matching game object
     */
    public int getGameObjectId() {
        return this.gameObjectId;
    }
}
