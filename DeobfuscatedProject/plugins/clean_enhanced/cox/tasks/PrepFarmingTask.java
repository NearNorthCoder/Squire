package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/**
 * Task for planting seeds in farming patches during Chambers of Xeric preparation.
 *
 * In CoX, players must plant seeds (Noxifer, Golpar, or Buchu) in farming patches
 * to grow herbs that can be harvested for potion making. This task handles the
 * planting process using a seed dibber on the farming patches.
 */
@TaskDesc(name="Prep Farming", priority=21002, blocking=true)
public class PrepFarmingTask extends CoxManager {

    // Item IDs
    private static final int SEED_DIBBER = 5343;
    private static final int HAMMER = 2347;
    private static final int[] SEEDS = {20894, 20896, 20892}; // Noxifer, Golpar, Buchu seeds
    private static final int FARMING_PATCH = 29730;

    @Inject
    protected PrepFarmingTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Don't plant if we don't have a seed dibber
        if (!Inventory.contains(SEED_DIBBER)) {
            return false;
        }

        // Check if we have any seeds to plant
        Item seed = Inventory.getFirst(SEEDS);
        if (seed == null) {
            return false;
        }

        // Check if there's a farming patch nearby
        TileObject farmingPatch = TileObjects.getNearest(FARMING_PATCH);
        if (farmingPatch == null) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        // Get the seed dibber
        Item seedDibber = Inventory.getFirst(SEED_DIBBER);
        if (seedDibber == null) {
            return -1;
        }

        // Find a farming patch
        TileObject farmingPatch = TileObjects.getNearest(FARMING_PATCH);
        if (farmingPatch == null) {
            return -1;
        }

        // Use seed dibber on farming patch to plant
        seedDibber.useOn(farmingPatch);
        return 600;
    }
}
