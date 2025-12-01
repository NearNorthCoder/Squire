package gg.squire.autotoa.tasks;

/**
 * Utility class for tracking special attack state during TOA encounters.
 * This class manages the state of whether the special attack should be used
 * based on various game conditions like varbits and puzzle states.
 *
 * <p>Usage:
 * <ul>
 *   <li>{@link #resetSpecialState()} - Resets the special attack state (called when conditions not met)</li>
 *   <li>{@link #setSpecialReady(boolean)} - Sets whether special attack is ready</li>
 *   <li>{@link #isSpecialReady()} - Checks if special attack is ready to use</li>
 * </ul>
 *
 * @author Squire Deobfuscation Team
 */
public final class SpecialAttackTracker {

    /** Whether the special attack is currently ready to use */
    private static boolean specialReady = false;

    /** Private constructor to prevent instantiation */
    private SpecialAttackTracker() {
        // Utility class - no instantiation
    }

    /**
     * Resets the special attack state to not ready.
     * Called when game conditions indicate the special attack should not be used.
     */
    public static void resetSpecialState() {
        specialReady = false;
    }

    /**
     * @deprecated Use {@link #resetSpecialState()} instead
     */
    @Deprecated
    public static void c() {
        resetSpecialState();
    }

    /**
     * Sets whether the special attack is ready to use.
     *
     * @param ready true if special attack should be ready, false otherwise
     */
    public static void setSpecialReady(boolean ready) {
        specialReady = ready;
    }

    /**
     * @deprecated Use {@link #setSpecialReady(boolean)} instead
     */
    @Deprecated
    public static void c(boolean ready) {
        setSpecialReady(ready);
    }

    /**
     * Checks if the special attack is currently ready to use.
     *
     * @return true if special attack is ready
     */
    public static boolean isSpecialReady() {
        return specialReady;
    }
}
