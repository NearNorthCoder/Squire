/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;

/**
 * BossRoomMapper - Maps combat/boss room types to array indices.
 *
 * This class provides a mapping from the boss room enum (N / GameEnum8)
 * to integer indices for use in switch statements and array lookups.
 * Handles all possible boss encounters in Chambers of Xeric.
 */
class BossRoomMapper {
    /**
     * Array mapping boss room enum ordinals to room type indices.
     * Used for switch-like behavior in boss encounter logic.
     */
    static final int[] BOSS_ROOM_TO_INDEX;

    static {
        BossRoomMapper.initializeMapper();
        BOSS_ROOM_TO_INDEX = new int[N.values().length];

        // Tekton (anvil boss)
        try {
            BOSS_ROOM_TO_INDEX[N.TEKTON.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Guardians (skeletal mystics)
        try {
            BOSS_ROOM_TO_INDEX[N.GUARDIANS.ordinal()] = 2;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Muttadiles (tree/meat eater boss)
        try {
            BOSS_ROOM_TO_INDEX[N.MUTTADILES.ordinal()] = 3;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Vespula (wasp boss)
        try {
            BOSS_ROOM_TO_INDEX[N.VESPULA.ordinal()] = 4;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Ice Demon
        try {
            BOSS_ROOM_TO_INDEX[N.ICE_DEMON.ordinal()] = 5;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Vasa Nistirio
        try {
            BOSS_ROOM_TO_INDEX[N.VASA.ordinal()] = 6;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Tightrope (agility puzzle)
        try {
            BOSS_ROOM_TO_INDEX[N.TIGHTROPE.ordinal()] = 7;
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
