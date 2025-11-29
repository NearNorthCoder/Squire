package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/**
 * Task for grabbing the pickaxe in Zebak's room (fishing encounter).
 *
 * This task:
 * - Checks if pickaxe is needed (via varbit)
 * - Makes inventory space by dropping food/potions
 * - Grabs pickaxe from pedestal
 * - Manages inventory efficiently
 */
@TaskDesc(name = "Grabbing Pickaxe", priority = 100, blocking = true)
public class GrabbingPickaxeTask extends AutotoaManager {
    private static final int PICKAXE_VARBIT = 14383; // Varbit tracking if pickaxe is grabbed
    private static final int PICKAXE_PEDESTAL_ID = 45732; // Object ID for pickaxe pedestal
    private static final int MAX_ITEMS_TO_DROP = 3; // Maximum items to drop at once

    @Inject
    protected GrabbingPickaxeTask(Client client, RaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    public boolean shouldExecute() {
        // Check if pickaxe already grabbed
        int pickaxeState = Vars.getBit(PICKAXE_VARBIT);
        if (pickaxeState == 0) {
            return false;
        }

        // Find pickaxe pedestal
        TileObject pickaxePedestal = TileObjects.getNearest(tileObject -> {
            return tileObject.getId() == PICKAXE_PEDESTAL_ID &&
                   Reachable.isInteractable(tileObject);
        });

        if (pickaxePedestal == null) {
            return false;
        }

        // Make inventory space if needed
        if (Inventory.isFull()) {
            boolean droppedItem = false;

            // First priority: Drop food items
            List<Item> foodItems = Inventory.getAll(item -> {
                return item.hasAction("Eat"::equals) &&
                       item.hasAction("Drop"::equals);
            });

            if (!foodItems.isEmpty()) {
                for (int i = 0; i < Math.min(MAX_ITEMS_TO_DROP, foodItems.size() - 1); i++) {
                    foodItems.get(i).interact("Drop");
                    droppedItem = true;
                    Log.info("Dropped food {}", foodItems.get(i).getName());
                }
            }

            if (droppedItem) {
                return true;
            }

            // Second priority: Drop empty vials/potions
            List<Item> vials = Inventory.getAll(item -> {
                return item.hasAction("Empty"::equals) &&
                       item.hasAction("Drop"::equals);
            });

            if (!vials.isEmpty()) {
                for (int i = 0; i < Math.min(MAX_ITEMS_TO_DROP, vials.size() - 1); i++) {
                    vials.get(i).interact("Drop");
                }
                return true;
            }
        }

        // Grab the pickaxe
        pickaxePedestal.interact("Take-pickaxe");
        return true;
    }
}
