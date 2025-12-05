package gg.squire.leagues.cooking;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.common.LeaguesConstants;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

import java.util.List;

/**
 * Leagues utility plugin for 1-tick cooking with automatic food noting.
 *
 * This plugin enables extremely fast cooking during Leagues by:
 * - Using noted food with a Banker's Note to instantly unnote one item
 * - Cooking the food on a range/fire
 * - Automatically noting burnt food
 * - Noting large quantities of cooked food (15+) to prevent inventory filling
 *
 * This technique allows for 1-tick cooking, which is much faster than normal cooking.
 *
 * Setup Instructions:
 * 1. Put a Banker's Note in your inventory
 * 2. Put noted food in the FIRST inventory slot (slot 0)
 * 3. Stand next to a cooking range or fire
 * 4. Enable the plugin
 *
 * The plugin will:
 * - Unnote food and cook it
 * - Automatically note burnt food
 * - Note food with 'Eat' action when you have 15+ in inventory
 *
 * Usage:
 * Works with any cookable food item. The plugin detects food by checking for the "Cook" action.
 */
@PluginDescriptor(
        name = "[Leagues] 1t cooker",
        enabledByDefault = false
)
@SquireUtil
public class TickCookerPlugin extends SquirePlugin {

    // Decrypted string constants
    private static final String ACTION_COOK = "Cook";
    private static final String ACTION_COOK_ALT = "Cook";
    private static final String ACTION_EAT = "Eat";
    private static final String ACTION_USE = "Use";
    private static final String ITEM_FILTER_BURNT = "Burnt";

    /** Minimum number of cooked food items before noting them */
    private static final int MIN_FOOD_TO_NOTE = 7;

    /** Minimum number of food with 'Eat' action before noting */
    private static final int MIN_EATABLE_TO_NOTE = 10;

    /**
     * Provides the configuration for this plugin.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    TickCookerConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(TickCookerConfig.class);
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
     * Called on each game tick.
     * Handles the 1-tick cooking logic.
     *
     * @param gameTick the game tick event
     */
    public void onGameTick(GameTick gameTick) {
        // Get the item in the first inventory slot (should be noted food)
        Item notedFood = Inventory.getItem(0);

        // Verify the item exists and is noted
        if (notedFood == null || !notedFood.isNoted()) {
            return;
        }

        // Check if we have burnt food to note
        Item burntFood = Inventory.getFirst(item ->
                item.getName().contains(ITEM_FILTER_BURNT) && !item.isNoted()
        );

        if (burntFood != null) {
            // Note the burnt food using the banker's note
            Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
            if (bankersNote != null) {
                burntFood.useOn(bankersNote);
                return;
            }
        }

        // Check if we have raw/uncooked food items with "Cook" action (7+)
        List<Item> cookableFood = Inventory.getAll(item ->
                item.hasAction(ACTION_USE) && !item.isNoted()
        );

        if (!cookableFood.isEmpty() && cookableFood.size() >= MIN_FOOD_TO_NOTE) {
            // Note the cookable food
            Item firstCookable = cookableFood.get(0);
            Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
            if (bankersNote != null) {
                firstCookable.useOn(bankersNote);
                return;
            }
        }

        // Check if we have any food item matching the noted food's name (unnoted version)
        Item unnotedFood = Inventory.getFirst(item ->
                !item.isNoted() && item.getName().equals(notedFood.getName())
        );

        if (unnotedFood == null) {
            // No unnoted food, so use noted food on banker's note to unnote one
            Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
            if (bankersNote != null) {
                Inventory.use(unnotedFood, bankersNote);
            }
        }

        // Check if we have lots of eatable food (15+) to note
        List<Item> eatableFood = Inventory.getAll(item ->
                !item.isNoted() && item.hasAction(ACTION_EAT)
        );

        if (!eatableFood.isEmpty() && eatableFood.size() >= MIN_EATABLE_TO_NOTE) {
            // Note the eatable food
            Item firstEatable = eatableFood.get(0);
            Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
            if (bankersNote != null) {
                firstEatable.useOn(bankersNote);
                return;
            }
        }

        // Find a cooking range or fire to cook on
        GameObject cookingObject = (GameObject) TileObjects.getNearest(tileObject ->
                tileObject.hasAction(ACTION_COOK_ALT)
        );

        if (cookingObject != null) {
            // Cook the food
            cookingObject.interact(ACTION_COOK);
        }
    }
}
