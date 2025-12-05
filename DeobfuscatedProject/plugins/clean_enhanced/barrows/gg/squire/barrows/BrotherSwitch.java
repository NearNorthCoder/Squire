/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Helper class for switch statements with Brother enum.
 * Contains a mapping array for Brother ordinal values.
 */
package gg.squire.barrows;

/**
 * Helper class containing switch mapping for Brother enum values.
 * Used by GearManager to determine which gear to use for each brother.
 */
class BrotherSwitch {
    static final int[] BROTHER_ORDINAL_MAP;

    static {
        BROTHER_ORDINAL_MAP = new int[Brother.values().length];
        try {
            BROTHER_ORDINAL_MAP[Brother.AHRIM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            // Ignore - field may not exist
        }
        try {
            BROTHER_ORDINAL_MAP[Brother.KARIL.ordinal()] = 2;
        } catch (NoSuchFieldError e) {
            // Ignore - field may not exist
        }
    }
}
