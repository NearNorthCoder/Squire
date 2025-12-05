package gg.squire.leagues.pickupnoter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.common.LeaguesConstants;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Leagues utility plugin for automatically noting items as they're picked up.
 *
 * This plugin tracks items that despawn (are picked up) and automatically uses
 * a Banker's Note on them during the next game tick. This is useful for activities
 * where you're continuously picking up items and want them noted immediately.
 *
 * Usage:
 * 1. Place a Banker's Note in your inventory
 * 2. Enable the plugin
 * 3. Pick up items - they will automatically be noted on the next game tick
 */
@PluginDescriptor(
        name = "[Leagues] Pick Up Noter",
        enabledByDefault = false
)
@SquireUtil
public class PickupNoterPlugin extends SquirePlugin {

    /**
     * List of item IDs that were picked up and need to be noted.
     */
    private final List<Integer> itemsToNote;

    /**
     * Constructs a new PickupNoterPlugin.
     */
    public PickupNoterPlugin() {
        this.itemsToNote = new ArrayList<>();
    }

    /**
     * Called when the plugin is started.
     * No initialization needed for this plugin.
     */
    @Override
    protected void onStart() {
    }

    /**
     * Called when the plugin is stopped.
     * No cleanup needed for this plugin.
     */
    @Override
    protected void onStop() {
    }

    /**
     * Returns the tasks that should be executed by this plugin.
     * This plugin doesn't use the task framework.
     *
     * @return empty array (no tasks)
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[0];
    }

    /**
     * Called when an item despawns (is picked up by the player).
     * Tracks the item ID so it can be noted on the next game tick.
     *
     * @param event the item despawned event
     */
    @Subscribe
    public void onItemDespawned(ItemDespawned event) {
        int itemId = event.getItem().getId();
        this.itemsToNote.add(itemId);
    }

    /**
     * Called on each game tick.
     * Notes all items that were picked up since the last tick.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // If no items to note, skip
        if (this.itemsToNote.isEmpty()) {
            return;
        }

        // Get all inventory items that match the picked-up item IDs
        Iterator<Item> itemIterator = Inventory.getAll(item ->
                this.itemsToNote.contains(item.getId())
        ).iterator();

        // Use each item on the banker's note
        while (itemIterator.hasNext()) {
            Item item = itemIterator.next();
            // Use the item on the banker's note (ID: 30047)
            Inventory.use(item.getId(), LeaguesConstants.BANKERS_NOTE_ID);
        }

        // Clear the list of items to note
        this.itemsToNote.clear();
    }
}
