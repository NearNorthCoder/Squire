/*
 * Deobfuscated TOA Kephri Phase Enum
 * Tracks the current phase of the Kephri boss fight
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the different phases of the Kephri boss fight in TOA.
 *
 * Kephri cycles through phases where different mechanics are active:
 * - ATTACK: Main attacking phase against Kephri
 * - SWARM: Phase where swarms spawn and must be dealt with
 * - MAGE: Phase involving mage scarabs
 */
public enum KephriPhase {
    /** Main attack phase - focus damage on Kephri */
    ATTACK,

    /** Swarm phase - deal with spawning swarms */
    SWARM,

    /** Mage scarab phase */
    MAGE;

    /**
     * Check if this is the main attack phase
     */
    public boolean isAttackPhase() {
        return this == ATTACK;
    }

    /**
     * Check if this is a phase requiring add management
     */
    public boolean requiresAddManagement() {
        return this == SWARM || this == MAGE;
    }
}
