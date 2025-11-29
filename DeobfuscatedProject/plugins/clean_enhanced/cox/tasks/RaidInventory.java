/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.items.Items
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;

/**
 * RaidInventory - Utility class for inventory operations during Chambers of Xeric raids.
 *
 * This class extends the Items API and provides convenient static methods
 * for checking and manipulating inventory items during raid activities.
 * All methods delegate to the CoxManager's inventory storage.
 */
public class RaidInventory extends Items {

    static {
        RaidInventory.initializeMapper();
    }

    /**
     * Counts items matching the given IDs, optionally including noted items.
     *
     * @param includeNoted whether to include noted versions of items
     * @param itemIds the item IDs to count
     * @return the total count of matching items
     */
    public static int countItems(boolean includeNoted, int... itemIds) {
        return CoxManager.inventory.count(includeNoted, itemIds);
    }

    /**
     * Counts items matching the given names, optionally including noted items.
     *
     * @param includeNoted whether to include noted versions of items
     * @param itemNames the item names to count
     * @return the total count of matching items
     */
    public static int countItems(boolean includeNoted, String... itemNames) {
        return CoxManager.inventory.count(includeNoted, itemNames);
    }

    /**
     * Gets all items matching the given names.
     *
     * @param itemNames the item names to find
     * @return a list of matching items
     */
    public static List<Item> getAllByName(String... itemNames) {
        return CoxManager.inventory.all(Predicates.names(itemNames));
    }

    /**
     * Checks if any of the given item IDs exist in the inventory.
     *
     * @param itemIds the list of item IDs to check
     * @return true if at least one item exists, false otherwise
     */
    public static boolean anyItemExists(List<Integer> itemIds) {
        for (Integer itemId : itemIds) {
            if (CoxManager.inventory.exists(itemId)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Counts items matching the given IDs (excludes noted items).
     *
     * @param itemIds the item IDs to count
     * @return the total count of matching items
     */
    public static int countItems(int... itemIds) {
        return CoxManager.inventory.count(false, itemIds);
    }

    /**
     * Gets all items matching the given IDs.
     *
     * @param itemIds the item IDs to find
     * @return a list of matching items
     */
    public static List<Item> getAllById(int... itemIds) {
        return CoxManager.inventory.all(itemIds);
    }

    /**
     * Gets the first item matching the given predicate.
     *
     * @param predicate the condition to match
     * @return the first matching item, or null if none found
     */
    public static Item getFirst(Predicate<Item> predicate) {
        return CoxManager.inventory.first(predicate);
    }

    /**
     * Counts items matching the given predicate, optionally including noted items.
     *
     * @param includeNoted whether to include noted versions of items
     * @param predicate the condition to match
     * @return the total count of matching items
     */
    public static int countItems(boolean includeNoted, Predicate<Item> predicate) {
        return CoxManager.inventory.count(includeNoted, predicate);
    }

    /**
     * Gets the first item matching any of the given IDs.
     *
     * @param itemIds the item IDs to find
     * @return the first matching item, or null if none found
     */
    public static Item getFirstById(int... itemIds) {
        return CoxManager.inventory.first(itemIds);
    }

    /**
     * Creates a new RaidInventory instance.
     * Sets up the inventory with proper widget ID configuration.
     */
    public RaidInventory() {
        super(InventoryID.INVENTORY, item -> {
            item.setWidgetId(149422082); // Proper widget ID for inventory
            return true;
        });
    }

    /**
     * Gets all items matching the given predicate.
     *
     * @param predicate the condition to match
     * @return a list of matching items
     */
    public static List<Item> getAll(Predicate<Item> predicate) {
        return CoxManager.inventory.all(predicate);
    }

    /**
     * Gets all items in the inventory.
     *
     * @return a list of all items
     */
    public static List<Item> getAllItems() {
        return getAll(item -> true);
    }

    /**
     * Counts items matching the given names (excludes noted items).
     *
     * @param itemNames the item names to count
     * @return the total count of matching items
     */
    public static int countItems(String... itemNames) {
        return CoxManager.inventory.count(false, itemNames);
    }

    /**
     * Checks if all of the given item IDs exist in the inventory.
     *
     * @param itemIds the item IDs to check
     * @return true if all items exist, false otherwise
     */
    public static boolean allItemsExist(int... itemIds) {
        for (int itemId : itemIds) {
            if (!CoxManager.inventory.exists(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Counts items matching the given predicate (excludes noted items).
     *
     * @param predicate the condition to match
     * @return the total count of matching items
     */
    public static int countItems(Predicate<Item> predicate) {
        return CoxManager.inventory.count(false, predicate);
    }

    /**
     * Gets the first item matching any of the given names.
     *
     * @param itemNames the item names to find
     * @return the first matching item, or null if none found
     */
    public static Item getFirstByName(String... itemNames) {
        return CoxManager.inventory.first(itemNames);
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
