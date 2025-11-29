/*
 * Deobfuscated TOA Zebak Phase Enum
 * Represents the phases of the Zebak boss fight
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the different phases of the Zebak fight.
 *
 * Zebak is the crocodile boss in the Path of Crondis.
 * The fight involves:
 * - Dodging blood clouds/waves
 * - Managing acid pools
 * - Prayer switching between range/mage
 */
public enum ZebakPhase {
    /** Main attack phase - safe to DPS */
    ATTACK,

    /** Blood wave phase - dodge the wave */
    BLOOD_WAVE,

    /** Acid pool phase - avoid acid */
    ACID_POOL,

    /** Enraged phase at low HP */
    ENRAGED;

    /**
     * Check if this phase is safe for sustained DPS
     */
    public boolean isSafeForDPS() {
        return this == ATTACK;
    }

    /**
     * Check if this phase requires movement
     */
    public boolean requiresMovement() {
        return this == BLOOD_WAVE || this == ACID_POOL;
    }
}
