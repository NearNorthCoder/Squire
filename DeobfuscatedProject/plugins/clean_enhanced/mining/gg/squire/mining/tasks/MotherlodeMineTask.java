package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.mining.*;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;

import javax.inject.Inject;

/**
 * Abstract base class for all Motherlode Mine tasks.
 */
public abstract class MotherlodeMineTask extends Task {
    protected final SquireMinerConfig config;
    protected final SquireMiner plugin;
    protected final MotherlodeMineTracker tracker;

    @Inject
    public MotherlodeMineTask(SquireMinerConfig config, SquireMiner plugin, MotherlodeMineTracker tracker) {
        this.config = config;
        this.plugin = plugin;
        this.tracker = tracker;
    }

    /**
     * Gets the upper hopper object for depositing pay-dirt.
     *
     * @return the upper hopper object
     */
    protected TileObject getUpperHopper() {
        WorldPoint location = new WorldPoint(3758, 5983, 0);
        return TileObjects.getNearest(location, 26674);
    }

    /**
     * Gets the lower hopper object.
     *
     * @return the lower hopper object
     */
    protected TileObject getLowerHopper() {
        WorldPoint location = new WorldPoint(3749, 5675, 0);
        return TileObjects.getNearest(location, 26674);
    }

    /**
     * Gets the appropriate hopper based on config and sack fullness.
     *
     * @return the hopper to use
     */
    protected TileObject getAppropriateTileObject getAppropriatHopper() {
        if (tracker.getSackRemainingSpace() <= 0) {
            return getLowerHopper();
        }
        if (config.depositUpstairs()) {
            return getUpperHopper();
        }
        return getLowerHopper();
    }

    /**
     * Gets the nearest vein in the configured MLM area.
     *
     * @return the nearest vein object
     */
    protected TileObject getNearestVein() {
        return tracker.getNearestVein(config.mlmArea());
    }

    @Override
    public boolean run() {
        // Skip if not in Motherlode Mine activity
        if (config.activity() != MiningActivity.MOTHERLODE_MINE) {
            return false;
        }

        // Skip if not in MLM
        if (!tracker.isInMotherlodeMine()) {
            return false;
        }

        return validate();
    }

    /**
     * Validates whether this task should run.
     *
     * @return true if task should run
     */
    public abstract boolean validate();
}
