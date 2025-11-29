/*
 * Deobfuscated TOA Hieroglyph Symbol Enum
 * Used in the Path of Scabaras match puzzle
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the hieroglyph symbols used in TOA's match puzzle.
 *
 * The match puzzle requires players to interact with tiles showing
 * specific symbols in a memory-matching game. Each symbol has:
 * - A unique value identifier
 * - A ground object ID (the tile)
 * - A game object ID (the symbol display)
 */
public enum HieroglyphSymbol {
    LINE(0, 45340, 45348),
    KNIVES(1, 45341, 45349),
    TRIANGLE(2, 45342, 45350),
    DIAMOND(3, 45343, 45351),
    HAND(4, 45344, 45352),
    BIRD(5, 45345, 45353),
    CROOK(6, 45346, 45354),
    WIGGLE(7, 45347, 45355),
    FOOT(8, 45356, 45356);

    /** Unique identifier for this symbol */
    private final int value;

    /** Ground object ID for the tile */
    private final int groundObjectId;

    /** Game object ID for the symbol display */
    private final int gameObjectId;

    HieroglyphSymbol(int value, int groundObjectId, int gameObjectId) {
        this.value = value;
        this.groundObjectId = groundObjectId;
        this.gameObjectId = gameObjectId;
    }

    /**
     * Get the unique value identifier
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Get the ground object ID (tile)
     */
    public int getGroundObjectId() {
        return this.groundObjectId;
    }

    /**
     * Get the game object ID (symbol)
     */
    public int getGameObjectId() {
        return this.gameObjectId;
    }

    /**
     * Find a symbol by its ground object ID
     */
    public static HieroglyphSymbol fromGroundObjectId(int groundObjectId) {
        for (HieroglyphSymbol symbol : values()) {
            if (symbol.groundObjectId == groundObjectId) {
                return symbol;
            }
        }
        return null;
    }

    /**
     * Find a symbol by its game object ID
     */
    public static HieroglyphSymbol fromGameObjectId(int gameObjectId) {
        for (HieroglyphSymbol symbol : values()) {
            if (symbol.gameObjectId == gameObjectId) {
                return symbol;
            }
        }
        return null;
    }
}
