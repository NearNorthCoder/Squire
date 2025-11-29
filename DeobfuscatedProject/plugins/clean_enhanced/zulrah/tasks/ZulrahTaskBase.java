/*
 * Deobfuscated Zulrah Task Base Class
 * Abstract base class for all Zulrah-related tasks
 */
package gg.squire.zulrah.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

/**
 * Base class for all Zulrah fight tasks.
 *
 * Provides common functionality:
 * - Access to state manager for fight tracking
 * - Access to client and config
 * - Instance region validation
 * - Safe spot calculation
 */
public abstract class ZulrahTaskBase extends Task {

    /** Zulrah instance region ID */
    protected static final int ZULRAH_REGION = 9007;

    /** Reference to the state manager */
    protected final ZulrahStateManager stateManager;

    /** RuneLite client reference */
    protected final Client client;

    /** Plugin configuration */
    protected final SquireZulrahConfig config;

    /** Main plugin reference */
    @Inject
    protected SquireZulrah plugin;

    /**
     * Constructor for Zulrah tasks
     */
    protected ZulrahTaskBase(ZulrahStateManager stateManager, Client client, SquireZulrahConfig config) {
        this.stateManager = stateManager;
        this.client = client;
        this.config = config;
    }

    /**
     * Main task entry point - validates we're in the fight before executing
     *
     * @return true if task took action, false otherwise
     */
    @Override
    public boolean run() {
        // Only run if we're in the Zulrah instance
        if (!client.isInInstancedRegion()) {
            return false;
        }

        // Only run if we have a valid rotation tracked
        if (stateManager.getCurrentRotation() == null) {
            return false;
        }

        // Execute the specific task logic
        return execute();
    }

    /**
     * Check if we're in the Zulrah instance region
     */
    protected boolean isInZulrahRegion() {
        int[] regions = client.getMapRegions();
        for (int region : regions) {
            if (region == ZULRAH_REGION) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get the current phase of the fight
     */
    protected ZulrahPhase getCurrentPhase() {
        return stateManager.getCurrentRotation().getCurrentPhase();
    }

    /**
     * Calculate the safe spot location for the current phase
     */
    protected WorldPoint getSafeSpotLocation() {
        return getCurrentPhase().getSafeSpotLocation(stateManager.getInstanceBase());
    }

    /**
     * Abstract method to be implemented by each specific task
     *
     * @return true if action was taken, false otherwise
     */
    public abstract boolean execute();
}
