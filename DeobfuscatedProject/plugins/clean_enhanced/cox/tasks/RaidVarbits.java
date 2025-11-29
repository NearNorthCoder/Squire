/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.cox.tasks;

import net.unethicalite.api.game.Vars;

/**
 * RaidVarbits - Utility class for reading Chambers of Xeric raid state variables.
 *
 * This class provides convenient access to the various varbits and varps
 * that track raid state, progress, and other information during CoX raids.
 */
public class RaidVarbits {

    static {
        RaidVarbits.initializeMapper();
    }

    /**
     * Checks if the raid is in a specific state.
     * This checks if varbit 5432 equals 3, which may indicate
     * a particular raid phase or condition.
     *
     * @return true if the raid is in the checked state, false otherwise
     */
    public static boolean isRaidInSpecialState() {
        return Vars.getBit(5432) == 3;
    }

    /**
     * Gets the raid progress varbit (5419).
     * This tracks overall raid progress or a specific counter.
     *
     * @return the raid progress value
     */
    public static int getRaidProgress() {
        return Vars.getBit(5419);
    }

    /**
     * Gets the raid phase varbit (5418).
     * This may track the current phase or stage of the raid.
     *
     * @return the raid phase value
     */
    public static int getRaidPhase() {
        return Vars.getBit(5418);
    }

    /**
     * Gets the raid state varbit (5413).
     * This tracks a fundamental raid state value.
     *
     * @return the raid state value
     */
    public static int getRaidState() {
        return Vars.getBit(5413);
    }

    /**
     * Gets the raid counter varbit (5417).
     * This may track time, encounters, or another counting metric.
     *
     * @return the raid counter value
     */
    public static int getRaidCounter() {
        return Vars.getBit(5417);
    }

    /**
     * Gets the raid varp (1427).
     * This is a player variable related to raid state.
     *
     * @return the raid varp value
     */
    public static int getRaidVarp() {
        return Vars.getVarp(1427);
    }

    /**
     * Gets the raid status varbit (5420).
     * This tracks another aspect of raid status or progress.
     *
     * @return the raid status value
     */
    public static int getRaidStatus() {
        return Vars.getBit(5420);
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
