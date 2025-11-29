/*
 * Deobfuscated TOA Prayer Mode Enum
 * Defines how prayer should be managed during combat
 */
package gg.squire.autotoa.tasks;

/**
 * Represents different prayer management modes.
 *
 * Used by prayer handling tasks to determine how to
 * activate and maintain protection/offensive prayers.
 */
public enum PrayerMode {
    /** Keep prayers on constantly */
    ALWAYS_ON,

    /** Flick prayers on/off each tick for prayer point conservation */
    FLICK,

    /** Only activate prayer when attack is detected */
    REACTIVE,

    /** Prayer handled manually by user */
    MANUAL;

    /**
     * Check if this mode requires tick-perfect timing
     */
    public boolean requiresTickPerfect() {
        return this == FLICK || this == REACTIVE;
    }

    /**
     * Check if prayers should stay active between attacks
     */
    public boolean maintainPrayer() {
        return this == ALWAYS_ON;
    }
}
