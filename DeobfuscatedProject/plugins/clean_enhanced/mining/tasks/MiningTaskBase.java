/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.enums.MiningActivity;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

/**
 * Base class for desert mining tasks (granite and sandstone).
 * Handles waterskin management and desert location checks.
 */
public abstract class MiningTaskBase extends Task {

    // Waterskin item IDs (different fill levels)
    private static final int WATERSKIN_4 = 16442;
    private static final int WATERSKIN_3 = 16440;
    private static final int WATERSKIN_2 = 16438;
    private static final int WATERSKIN_1 = 16436;

    // Desert jewelry item ID (allows desert teleports, bypasses waterskin requirement)
    private static final int DESERT_AMULET_4 = 28110;

    // Desert boundary coordinates
    private static final int DESERT_MAX_X = 3455;
    private static final int DESERT_MAX_Y = 2943;

    // Class 4 in OSRS task system
    protected static final int TASK_CLASS = 4;

    // Shantay Pass area coordinates
    protected static final int SHANTAY_AREA_Y = 2943;
    protected static final int SHANTAY_AREA_X = 3455;

    protected final SquireMinerConfig config;

    protected MiningTaskBase(SquireMinerConfig config) {
        this.config = config;
    }

    /**
     * Gets the count of waterskins in inventory.
     * Counts all fill levels of waterskins.
     *
     * @return Total number of waterskins
     */
    protected int y() {
        return Inventory.getCount(
            WATERSKIN_4,
            WATERSKIN_3,
            WATERSKIN_2,
            WATERSKIN_1
        );
    }

    /**
     * Checks if the player is currently in the desert.
     * Desert is defined as areas west of x=3455 or north of y=2943.
     *
     * @return true if player is in desert
     */
    protected boolean z() {
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Check if player is beyond desert boundaries
        if (playerLocation.getX() <= DESERT_MAX_X || playerLocation.getY() > DESERT_MAX_Y) {
            return true;
        }

        return false;
    }

    @Override
    public boolean run() {
        // Only run for desert activities (sandstone and granite)
        if (config.activity() != MiningActivity.SANDSTONE &&
            config.activity() != MiningActivity.GRANITE) {
            return false;
        }

        // Skip if waterskins disabled in config
        if (!config.waterskins()) {
            return false;
        }

        // Skip if wearing desert amulet (provides desert heat protection)
        if (Equipment.contains(DESERT_AMULET_4)) {
            return false;
        }

        // Skip if we have waterskins and are in desert
        if (y() > 0 && z()) {
            return false;
        }

        return t();
    }

    /**
     * Abstract method to be implemented by subclasses.
     * Contains the specific task logic.
     *
     * @return true if task executed successfully
     */
    public abstract boolean t();
}
