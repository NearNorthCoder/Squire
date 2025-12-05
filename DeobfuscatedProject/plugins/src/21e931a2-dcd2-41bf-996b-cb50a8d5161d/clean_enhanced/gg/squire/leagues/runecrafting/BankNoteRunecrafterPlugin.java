package gg.squire.leagues.runecrafting;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.common.LeaguesConstants;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/**
 * Leagues utility plugin for automated runecrafting with automatic rune noting.
 *
 * This plugin helps with runecrafting activities during Leagues by:
 * - Automatically noting runes when inventory is full using a Banker's Note
 * - Clicking on runecrafting altars when ready
 *
 * The plugin looks for "Essence" in item names to note runes (not the essence itself).
 * It searches for altars with the "Craft-rune" action.
 *
 * Usage:
 * 1. Place a Banker's Note in your inventory
 * 2. Have pure/daeyalt essence in your inventory
 * 3. Stand near a runecrafting altar
 * 4. Enable the plugin
 * 5. The plugin will craft runes and automatically note them when inventory is full
 */
@PluginDescriptor(
        name = "[Leagues] Runecrafter",
        enabledByDefault = false
)
@SquireUtil
public class BankNoteRunecrafterPlugin extends SquirePlugin {

    // Decrypted string constants
    private static final String ACTION_CRAFT_RUNE = "Craft-rune";
    private static final String ALTAR_NAME = "Altar";
    private static final String ITEM_FILTER_RUNE = "rune";
    private static final String ITEM_FILTER_ESSENCE = "Essence";

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
     * Called on each game tick.
     * Handles the runecrafting and rune noting logic.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Check if player has essence (required to craft runes)
        boolean hasEssence = Inventory.contains(item ->
                item.getName().contains(ITEM_FILTER_ESSENCE)
        );

        if (!hasEssence) {
            return;
        }

        // If inventory is full, note the runes
        if (!Inventory.isFull()) {
            // Find runes that need to be noted (contain "rune" in name but not noted)
            Item runeToNote = Inventory.getFirst(item ->
                    item.getName().contains(ITEM_FILTER_RUNE) &&
                    item.isNoted()
            );

            if (runeToNote != null) {
                Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
                if (bankersNote != null) {
                    // Use the rune on the banker's note to note it
                    Inventory.use(runeToNote, bankersNote);
                }
            }
        }

        // Find and click the runecrafting altar
        TileObject altar = TileObjects.getNearest(tileObject ->
                tileObject.hasAction(ACTION_CRAFT_RUNE)
        );

        if (altar != null) {
            // Interact with the altar using the "Craft-rune" action
            altar.interact(ACTION_CRAFT_RUNE);
        }
    }
}
