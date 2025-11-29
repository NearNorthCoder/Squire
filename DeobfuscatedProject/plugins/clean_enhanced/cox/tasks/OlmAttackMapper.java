/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum5;

/**
 * OlmAttackMapper - Maps Great Olm attack types to array indices.
 *
 * This class provides a mapping from the Olm attack enum (z / GameEnum5)
 * to integer indices for use in switch statements and array lookups.
 * Handles both head and hand attack types, including special phases.
 */
class OlmAttackMapper {
    /**
     * Array mapping Olm attack enum ordinals to attack type indices.
     * Used for switch-like behavior in Olm combat logic.
     */
    static final int[] ATTACK_TO_INDEX;

    static {
        OlmAttackMapper.initializeMapper();
        ATTACK_TO_INDEX = new int[z.values().length];

        // Left hand crystal attack (phase 1)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_CRYSTALS1.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand crystal attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_CRYSTALS2.ordinal()] = 2;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand lightning attack (phase 1)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_LIGHTNING1.ordinal()] = 3;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand lightning attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_LIGHTNING2.ordinal()] = 4;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand portal attack (phase 1)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_PORTALS1.ordinal()] = 5;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand portal attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_PORTALS2.ordinal()] = 6;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand heal attack (phase 1)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_HEAL1.ordinal()] = 7;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand heal attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_HEAL2.ordinal()] = 8;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head rising attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.HEAD_RISING_2.ordinal()] = 9;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head enraged rising attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.HEAD_ENRAGED_RISING_2.ordinal()] = 10;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head enraged attack (left side)
        try {
            ATTACK_TO_INDEX[z.HEAD_ENRAGED_LEFT.ordinal()] = 11;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head enraged attack (middle)
        try {
            ATTACK_TO_INDEX[z.HEAD_ENRAGED_MIDDLE.ordinal()] = 12;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head enraged attack (right side)
        try {
            ATTACK_TO_INDEX[z.HEAD_ENRAGED_RIGHT.ordinal()] = 13;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head auto attack (left side)
        try {
            ATTACK_TO_INDEX[z.HEAD_AUTO_LEFT.ordinal()] = 14;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head auto attack (right side)
        try {
            ATTACK_TO_INDEX[z.HEAD_AUTO_RIGHT.ordinal()] = 15;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Head auto attack (middle)
        try {
            ATTACK_TO_INDEX[z.HEAD_AUTO_MIDDLE.ordinal()] = 16;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand crippling attack
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_CRIPPLING.ordinal()] = 17;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand uncrippling attack (phase 1)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_UNCRIPPLING1.ordinal()] = 18;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Left hand uncrippling attack (phase 2)
        try {
            ATTACK_TO_INDEX[z.LEFT_HAND_UNCRIPPLING2.ordinal()] = 19;
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
