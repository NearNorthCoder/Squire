/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.commons.Predicates
 */
package net.unethicalite.api.items;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;
import net.unethicalite.api.packets.ItemPackets;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.managers.InventoryManager;

public class Inventory
extends Items {
    private static final Inventory INVENTORY = new Inventory();

    private Inventory() {
        super(InventoryID.INVENTORY, (Item item) -> {
            item.setSlot(item.getSlot());
            item.setWidgetId(WidgetInfo.INVENTORY.getPackedId());
            return true;
        });
    }

    public static Items fromInventory(int inventoryId, Function<Item, Boolean> applyItemProperties) {
        return new Items(inventoryId, (Function)applyItemProperties){};
    }

    public static Items fromInventory(int inventoryId, int widgetId) {
        return new Items(inventoryId, item -> {
            item.setSlot(item.getSlot());
            item.setWidgetId(widgetId);
            return true;
        }){};
    }

    public static ItemQuery query() {
        return Inventory.query(Inventory::getAll);
    }

    public static ItemQuery query(Supplier<List<Item>> supplier) {
        return new ItemQuery(supplier);
    }

    public static List<Item> getAll(Predicate<Item> filter) {
        return INVENTORY.all(filter);
    }

    public static List<Item> getAll() {
        return Inventory.getAll((Item x) -> true);
    }

    public static List<Item> getAll(int ... ids) {
        return INVENTORY.all(ids);
    }

    public static List<Item> getAll(String ... names) {
        return INVENTORY.all(names);
    }

    public static Item getFirst(Predicate<Item> filter) {
        return INVENTORY.first(filter);
    }

    public static Item getFirst(int ... ids) {
        return INVENTORY.first(ids);
    }

    public static Item getFirst(String ... names) {
        return INVENTORY.first(names);
    }

    public static Item getItem(int slot) {
        Item[] container = InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId());
        if (container == null) {
            return null;
        }
        if (container.length <= slot) {
            return null;
        }
        Item item = container[slot];
        if (item == null || item.getId() == -1 || item.getName() == null || item.getName().equals("null")) {
            return null;
        }
        item.setWidgetId(WidgetInfo.INVENTORY.getPackedId());
        return item;
    }

    public static boolean swap(int first, int second) {
        Widget inventory = Widgets.get(WidgetInfo.INVENTORY);
        if (inventory == null) {
            return false;
        }
        Item firstInventoryItem = Inventory.getItem(first);
        Item secondInventoryItem = Inventory.getItem(second);
        if (firstInventoryItem == null || secondInventoryItem == null) {
            return false;
        }
        ItemPackets.queueSwapItems(firstInventoryItem, secondInventoryItem);
        return true;
    }

    public static boolean contains(Predicate<Item> filter) {
        return INVENTORY.exists(filter);
    }

    public static boolean contains(int ... id) {
        return INVENTORY.exists(id);
    }

    public static boolean containsAllOf(int ... ids) {
        for (int id : ids) {
            if (INVENTORY.exists(id)) continue;
            return false;
        }
        return true;
    }

    public static boolean containsAllOf(List<Integer> itemIdList) {
        for (int id : itemIdList) {
            if (INVENTORY.exists(id)) continue;
            return false;
        }
        return true;
    }

    public static boolean allMatches(Map<Integer, Integer> idCountMap) {
        for (Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
            if (INVENTORY.count(true, entry.getKey()) == entry.getValue().intValue()) continue;
            return false;
        }
        return true;
    }

    public static boolean contains(String ... name) {
        return INVENTORY.exists(name);
    }

    public static int getCount(boolean stacks, Predicate<Item> filter) {
        return INVENTORY.count(stacks, filter);
    }

    public static int getCount(boolean stacks, int ... ids) {
        return INVENTORY.count(stacks, ids);
    }

    public static int getCount(boolean stacks, String ... names) {
        return INVENTORY.count(stacks, names);
    }

    public static int getCount(Predicate<Item> filter) {
        return INVENTORY.count(false, filter);
    }

    public static int getCount(int ... ids) {
        return INVENTORY.count(false, ids);
    }

    public static int getCount(String ... names) {
        return INVENTORY.count(false, names);
    }

    public static boolean isFull() {
        return Inventory.getFreeSlots() == 0;
    }

    public static boolean isEmpty() {
        return Inventory.getFreeSlots() == 28;
    }

    public static int getFreeSlots() {
        return 28 - Inventory.getAll().size();
    }

    public static boolean dropAll(Predicate<Item> filter) {
        int max = 6;
        for (Item item : Inventory.getAll(filter)) {
            item.interact("Drop");
            if (--max > 0) continue;
            return true;
        }
        return max < 6;
    }

    public static void doActions(Predicate<Item> filter, String ... actions) {
        int max = 6;
        for (Item item : Inventory.getAll(filter)) {
            item.interact(actions);
            if (--max > 0) continue;
            return;
        }
    }

    public static boolean dropAll(int ... ids) {
        return Inventory.dropAll(Predicates.ids((int[])ids));
    }

    public static boolean dropAll(String ... names) {
        return Inventory.dropAll(Predicates.names((String[])names));
    }

    public static boolean use(int first, int second) {
        return Inventory.use((Predicate<Item>)Predicates.ids((int[])new int[]{first}), Predicates.ids((int[])new int[]{second}));
    }

    public static boolean use(String first, int ... second) {
        return Inventory.use((Predicate<Item>)Predicates.nameContains((String)first), Predicates.ids((int[])second));
    }

    public static boolean use(int first, String ... second) {
        return Inventory.use((Predicate<Item>)Predicates.ids((int[])new int[]{first}), Predicates.nameContainsAnyOf((boolean)false, (String[])second));
    }

    public static boolean use(String first, String ... second) {
        return Inventory.use((Predicate<Item>)Predicates.nameContains((String)first), Predicates.nameContainsAnyOf((boolean)false, (String[])second));
    }

    public static boolean use(String first, String second) {
        return Inventory.use((Predicate<Item>)Predicates.nameContains((String)first), Predicates.nameContains((String)second));
    }

    public static boolean use(Predicate<Item> first, Predicate<Item> second) {
        return Inventory.use(first, (Interactable)Inventory.getFirst(second));
    }

    public static boolean use(Predicate<Item> first, Interactable second) {
        Item firstItem = Inventory.getFirst(first);
        if (firstItem == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        firstItem.useOn(second);
        return true;
    }

    public static boolean interact(String action, int ... items) {
        return Inventory.interact((Predicate<Item>)Predicates.ids((int[])items), action::equalsIgnoreCase);
    }

    public static boolean interact(String action, String ... items) {
        return Inventory.interact((Predicate<Item>)Predicates.nameContainsAnyOf((boolean)false, (String[])items), action::equalsIgnoreCase);
    }

    public static boolean interact(Predicate<Item> filter, String action) {
        return Inventory.interact(filter, action::equalsIgnoreCase);
    }

    public static boolean interact(Predicate<Item> filter, Predicate<String> action) {
        Item item = Inventory.getFirst(filter);
        if (item == null) {
            return false;
        }
        if (!item.hasAction(action)) {
            return false;
        }
        item.interact(action);
        return true;
    }
}

