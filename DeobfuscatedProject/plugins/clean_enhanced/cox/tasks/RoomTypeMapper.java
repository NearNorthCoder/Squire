/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum4;

/**
 * RoomTypeMapper - Maps raid room types to array indices.
 *
 * This class provides a mapping from the room type enum (P / GameEnum4)
 * to integer indices for use in switch statements and array lookups.
 * Handles all possible room types in a Chambers of Xeric raid.
 */
class RoomTypeMapper {
    /**
     * Array mapping room type enum ordinals to room type indices.
     * Used for switch-like behavior in room processing logic.
     */
    static final int[] ROOM_TYPE_TO_INDEX;

    static {
        RoomTypeMapper.initializeMapper();
        ROOM_TYPE_TO_INDEX = new int[P.values().length];

        // Start room (entrance)
        try {
            ROOM_TYPE_TO_INDEX[P.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // End room (Great Olm)
        try {
            ROOM_TYPE_TO_INDEX[P.END.ordinal()] = 2;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Scavenger room
        try {
            ROOM_TYPE_TO_INDEX[P.SCAVENGERS.ordinal()] = 3;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Farming room
        try {
            ROOM_TYPE_TO_INDEX[P.FARMING.ordinal()] = 4;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Combat room (boss encounter)
        try {
            ROOM_TYPE_TO_INDEX[P.COMBAT.ordinal()] = 5;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Puzzle room
        try {
            ROOM_TYPE_TO_INDEX[P.PUZZLE.ordinal()] = 6;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Empty room
        try {
            ROOM_TYPE_TO_INDEX[P.EMPTY.ordinal()] = 7;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
