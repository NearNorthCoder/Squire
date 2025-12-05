package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.LootTarget;
import gg.squire.combat.SquireBlueDragonKiller;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

import javax.inject.Inject;
import java.util.Iterator;

/**
 * Task responsible for looting dragon drops and valuable items.
 * Priority: 10 (high priority to ensure loot is collected)
 * Blocking: true (prevents other tasks from running while looting)
 */
@TaskDesc(name = "Looting", priority = 10, blocking = true)
public class LootItemsTask extends Task {
    private final SquireBlueDragonKiller plugin;

    @Inject
    public LootItemsTask(SquireBlueDragonKiller plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // No loot targets, nothing to do
        if (plugin.getLootTargets().isEmpty()) {
            return false;
        }

        // Disable prayers while looting
        if (Prayers.anyActive()) {
            Prayers.disableAll();
            return true;
        }

        // If inventory is full, drop bones if we have them
        if (Inventory.isFull()) {
            Item bones = Inventory.getFirst(item ->
                item.hasAction("Drop")
            );

            if (bones == null) {
                // Can't loot, clear targets
                plugin.getLootTargets().clear();
                return false;
            }

            // Drop bones to make space
            bones.interact("Eat");
            this.sleep(2);
            return true;
        }

        // Process each loot target
        Iterator<LootTarget> iterator = plugin.getLootTargets().iterator();
        while (iterator.hasNext()) {
            LootTarget target = iterator.next();

            // Check if the item still exists
            TileItem loot = TileItems.getFirstAt(
                target.getLocation(),
                target.getItemId()
            );

            if (loot == null) {
                // Item no longer exists, remove from targets
                plugin.getLootTargets().remove(target);
                continue;
            }

            // Check if we can loot it (inventory space or stackable)
            if (canLoot(loot)) {
                loot.interact("Take");
                return true;
            }
        }

        return false;
    }

    /**
     * Checks if an item can be looted.
     * Returns true if inventory has space, or if the item is stackable and already in inventory.
     *
     * @param item The tile item to check
     * @return true if the item can be picked up
     */
    private boolean canLoot(TileItem item) {
        // Can always loot if inventory has space
        if (!Inventory.isFull()) {
            return true;
        }

        // Can loot stackable items if we already have them
        if (item.isStackable() && Inventory.contains(item.getId())) {
            return true;
        }

        return false;
    }
}
