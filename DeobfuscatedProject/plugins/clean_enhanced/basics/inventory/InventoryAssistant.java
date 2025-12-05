/*
 * Deobfuscated from InventoryAssistant
 * Package: gg.squire.basics.inventory
 *
 * Inventory management assistant plugin.
 * Automatically drops configured items when inventory reaches threshold.
 *
 * Dropping behavior:
 * - Drops up to 8 items per game tick
 * - Only drops when inventory is full
 * - Only drops when configured item count threshold is met
 * - Tracks dropped items to avoid re-dropping same items
 */
package gg.squire.basics.inventory;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.managers.interaction.InteractionManager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Inventory Assistant plugin for automated item dropping.
 * Helps manage inventory space by dropping configured items.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Inventory Assistant",
    description="Assist with inventory",
    enabledByDefault=false
)
public class InventoryAssistant extends SquirePlugin {

    /** Maximum items to drop per tick */
    private static final int MAX_DROPS_PER_TICK = 8;

    /** Item action: Drop */
    private static final String ACTION_DROP = "Drop";

    /** Item ID list separator */
    private static final String SEPARATOR = ",";

    @Inject
    InventoryAsisstantConfig config;

    /** Dropping active flag */
    boolean droppingActive;

    /** Set of items already dropped this cycle */
    private final Set<Item> droppedItems;

    /**
     * Constructor initializes dropped items tracking.
     */
    public InventoryAssistant() {
        this.droppedItems = new HashSet<>();
    }

    @Override
    protected void onStart() {
        InteractionManager.setHelper(true);
        droppingActive = false;
    }

    @Override
    protected void onStop() {
        InteractionManager.setHelper(false);
    }

    /**
     * Provides configuration for dependency injection.
     */
    @Provides
    InventoryAsisstantConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(InventoryAsisstantConfig.class);
    }

    /**
     * Parses configured item IDs from comma-separated string.
     *
     * @return array of item IDs to drop
     */
    public int[] getItemsToDrop() {
        String[] itemIdStrings = config.itemsToDrop().split(SEPARATOR);
        int[] itemIds = new int[itemIdStrings.length];

        for (int i = 0; i < itemIdStrings.length; i++) {
            itemIds[i] = Integer.parseInt(itemIdStrings[i].trim());
        }

        return itemIds;
    }

    /**
     * Main game tick handler.
     * Manages item dropping logic based on inventory state and configuration.
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int[] itemsToDrop = getItemsToDrop();
        int itemCount = Inventory.getCount(itemsToDrop);

        // Check if we should start dropping
        boolean shouldStartDropping = Inventory.isFull() &&
                                    itemCount >= config.amountToDrop();

        // Reset dropped items set when dropping completes
        if (droppingActive && !shouldStartDropping) {
            droppedItems.clear();
            droppingActive = false;
            return;
        }

        // Activate dropping when conditions met
        if (!droppingActive && !Inventory.contains(itemsToDrop)) {
            droppingActive = true;
        }

        // Exit if not actively dropping
        if (!droppingActive) {
            return;
        }

        // Drop up to MAX_DROPS_PER_TICK items per tick
        int dropsThisTick = MAX_DROPS_PER_TICK;
        Iterator<Item> itemIterator = Inventory.getAll(itemsToDrop).iterator();

        while (itemIterator.hasNext()) {
            Item item = itemIterator.next();

            // Skip if already dropped
            if (droppedItems.contains(item)) {
                continue;
            }

            // Drop the item
            item.interact(ACTION_DROP);
            droppedItems.add(item);

            // Check drop limit
            if (--dropsThisTick == 0) {
                break;
            }
        }
    }

    /**
     * No tasks defined - uses event-based logic instead.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }

    // Getters and setters

    public boolean isDropping() {
        return this.droppingActive;
    }

    public void setDropping(boolean dropping) {
        this.droppingActive = dropping;
    }
}
