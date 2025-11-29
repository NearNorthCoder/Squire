package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Task for collecting farming tools during Chambers of Xeric preparation.
 *
 * This task retrieves the necessary farming tools from the tool storage:
 * - Seed dibber: For planting seeds in farming patches
 * - Spade: For digging and preparing soil
 * - Secateurs: For pruning and harvesting herbs efficiently
 *
 * These tools are essential for the farming preparation phase.
 */
@TaskDesc(name="Prep Getting Tools", priority=21003, blocking=true)
public class PrepGettingToolsTask extends CoxManager {

    // Item IDs
    private static final int SEED_DIBBER = 5343;
    private static final int SPADE = 952;
    private static final int SECATEURS = 5329;
    private static final int TOOL_STORAGE = 29776;

    @Inject
    protected PrepGettingToolsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Check if we already have all tools
        if (getRestorePotionCount() >= this.config.restorePotionCount()) {
            return false;
        }

        // We need at least one tool
        if (Inventory.contains(SEED_DIBBER) && Inventory.contains(SPADE)) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        TileObject toolStorage = TileObjects.getNearest(TOOL_STORAGE);

        if (toolStorage == null) {
            System.out.println("Can't find tool storage");
            Movement.setDestination(this.currentRoom.location.dx(7).dy(7));
            return -1;
        }

        // Take seed dibber if we don't have it
        if (!Inventory.contains(SEED_DIBBER)) {
            System.out.println("Taking seed dibber");
            toolStorage.interact("Take-seed-dibber");
            return -1;
        }

        // Take spade if we don't have it
        if (!Inventory.contains(SPADE)) {
            System.out.println("Taking spade");
            toolStorage.interact("Take-spade");
            return -1;
        }

        // Take secateurs if we don't have them
        System.out.println("Taking secateurs");
        toolStorage.interact("Take-secateurs");
        return -1;
    }
}
