/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum2;

/**
 * TemplateDirectionMapper - Maps raid template directions to array indices.
 *
 * This class provides a mapping from the template direction enum (S / GameEnum2)
 * to integer indices for use in switch statements and array lookups.
 * The decompiler generated this as a switch statement replacement.
 */
class TemplateDirectionMapper {
    /**
     * Array mapping template direction enum ordinals to indices.
     * Used for switch-like behavior in raid layout generation.
     */
    static final int[] DIRECTION_TO_INDEX;

    static {
        TemplateDirectionMapper.initializeMapper();
        DIRECTION_TO_INDEX = new int[S.values().length];

        // Map TEMPLATE_EAST direction to index 1
        try {
            DIRECTION_TO_INDEX[S.TEMPLATE_EAST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Map TEMPLATE_NORTH direction to index 2
        try {
            DIRECTION_TO_INDEX[S.TEMPLATE_NORTH.ordinal()] = 2;
        } catch (NoSuchFieldError e) {
            // Ignore if enum value not found
        }

        // Map TEMPLATE_WEST direction to index 3
        try {
            DIRECTION_TO_INDEX[S.TEMPLATE_WEST.ordinal()] = 3;
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
