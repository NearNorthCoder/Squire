/*
 * Deobfuscated from SquireEcto
 * Package: gg.squire.basics.ectofuntus
 *
 * Ectofuntus prayer training plugin.
 * Automates the ectofuntus worship process for prayer XP.
 *
 * Process cycle:
 * 1. Grind bones into bonemeal
 * 2. Collect slime from pool
 * 3. Worship at ectofuntus with bonemeal and slime
 * 4. Bank and repeat
 *
 * Item IDs:
 * - 4255: Bonemeal
 * - 4257: Bucket of slime
 */
package gg.squire.basics.ectofuntus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.ectofuntus.overlay.EctoOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

// Task imports
import i.i.b.s.c.q.r.s.s.-.u.a.e.ap;  // Task 2
import i.i.b.s.c.q.r.s.s.-.u.a.e.aq;  // Task 1
import i.i.b.s.c.q.r.s.s.-.u.a.e.ar;  // Task 5
import i.i.b.s.c.q.r.s.s.-.u.a.e.at;  // Task 3
import i.i.b.s.c.q.r.s.s.-.u.a.e.au;  // Task 4

/**
 * Squire Ectofuntus plugin for automated prayer training.
 * Handles all phases of the ectofuntus worship cycle.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Ectofuntus",
    description="Gets you those HCIM prayer levels",
    enabledByDefault=false
)
public class SquireEcto extends SquirePlugin {

    /** Item ID: Bonemeal */
    private static final int ITEM_BONEMEAL = 4255;

    /** Item ID: Bucket of slime */
    private static final int ITEM_BUCKET_SLIME = 4257;

    /** Item action: "Worship" */
    private static final String ACTION_WORSHIP = "Worship";

    /** Item action: "Use" */
    private static final String ACTION_USE = "Use";

    /** Log message: Starting ectofuntus plugin */
    private static final String LOG_STARTING = "Starting";

    /** Log message: Missing required items */
    private static final String LOG_MISSING_ITEMS =
        "Unable to worship, we are missing bonemeal or slime.";

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private EctoOverlay overlay;

    /** Paint disabled flag */
    private boolean paintDisabled;

    /** Count of bones ground */
    private int bonesGround;

    /** Count of slime buckets collected */
    private int slimeCollected;

    /** Count of offerings made */
    private int offeringsMade;

    /**
     * Constructor initializes counters.
     */
    public SquireEcto() {
        this.paintDisabled = false;
        this.bonesGround = 0;
        this.slimeCollected = 0;
        this.offeringsMade = 0;
    }

    @Override
    protected void onStart() {
        Log.info(LOG_STARTING);
        overlayManager.add(overlay);
    }

    @Override
    protected void onStop() {
        overlayManager.remove(overlay);
    }

    /**
     * Provides configuration for dependency injection.
     */
    @Provides
    SquireEctoConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireEctoConfig.class);
    }

    /**
     * Attempts to worship at the ectofuntus.
     * Requires both bonemeal and bucket of slime in inventory.
     *
     * @return true if worship was initiated, false otherwise
     */
    public boolean attemptWorship() {
        // Check for required items
        int[] requiredItems = {ITEM_BONEMEAL, ITEM_BUCKET_SLIME};
        Item worshipItem = Inventory.getFirst(requiredItems);

        if (worshipItem == null) {
            Log.info(LOG_MISSING_ITEMS);
            return false;
        }

        // Check if item has worship action
        if (worshipItem.hasAction(ACTION_WORSHIP)) {
            worshipItem.interact(ACTION_USE);
            return true;
        }

        return false;
    }

    /**
     * Returns the ordered array of task classes for execution.
     * Tasks handle ectofuntus cycle phases.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            aq.class,  // Task 1 - likely initialization/banking
            ap.class,  // Task 2 - likely grinding bones
            at.class,  // Task 3 - likely collecting slime
            au.class,  // Task 4 - likely worshiping
            ar.class   // Task 5 - likely cleanup/banking
        };
    }

    // Getters and setters

    public boolean isPaintDisabled() {
        return this.paintDisabled;
    }

    public void setPaintDisabled(boolean paintDisabled) {
        this.paintDisabled = paintDisabled;
    }

    public int getBonesGround() {
        return this.bonesGround;
    }

    public void setBonesGround(int bonesGround) {
        this.bonesGround = bonesGround;
    }

    public int getSlimeCollected() {
        return this.slimeCollected;
    }

    public void setSlimeCollected(int slimeCollected) {
        this.slimeCollected = slimeCollected;
    }

    public int getOfferingsMade() {
        return this.offeringsMade;
    }

    public void setOfferingsMade(int offeringsMade) {
        this.offeringsMade = offeringsMade;
    }
}
