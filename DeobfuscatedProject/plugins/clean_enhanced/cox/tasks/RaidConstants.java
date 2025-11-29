/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

/**
 * RaidConstants - Constant values used throughout the Chambers of Xeric plugin.
 *
 * This class defines various integer constants used for raid logic,
 * including state identifiers, thresholds, and configuration values.
 */
public class RaidConstants {

    static {
        RaidConstants.initializeMapper();
    }

    /**
     * State constant: INITIAL (0)
     * Represents an initial or default state.
     */
    public static final int STATE_INITIAL = 0;

    /**
     * State constant: ACTIVE (1)
     * Represents an active or primary state.
     */
    public static final int STATE_ACTIVE = 1;

    /**
     * State constant: SECONDARY (2)
     * Represents a secondary state or phase.
     */
    public static final int STATE_SECONDARY = 2;

    /**
     * Counter initial value (0)
     * Default starting value for counters.
     */
    public static final int COUNTER_START = 0;

    /**
     * Reference value (0)
     * A reference or baseline value.
     */
    public static final int REFERENCE_VALUE = 0;

    /**
     * Phase constant: PHASE_THREE (3)
     * Represents the third phase of an encounter.
     */
    public static final int PHASE_THREE = 3;

    /**
     * Phase constant: PHASE_FOUR (4)
     * Represents the fourth phase of an encounter.
     */
    public static final int PHASE_FOUR = 4;

    /**
     * Index constant: INDEX_ONE (1)
     * A commonly used index value.
     */
    public static final int INDEX_ONE = 1;

    /**
     * Index constant: INDEX_THREE (3)
     * Another commonly used index value.
     */
    public static final int INDEX_THREE = 3;

    /**
     * Level constant: LEVEL_FIVE (5)
     * Represents a level or tier value of 5.
     */
    public static final int LEVEL_FIVE = 5;

    /**
     * Level constant: LEVEL_SIX (6)
     * Represents a level or tier value of 6.
     */
    public static final int LEVEL_SIX = 6;

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
