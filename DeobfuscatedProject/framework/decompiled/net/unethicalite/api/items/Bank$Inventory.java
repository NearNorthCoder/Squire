/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Predicates
 */
package net.unethicalite.api.items;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.items.Items;
import net.unethicalite.api.query.items.ItemQuery;

public static class Bank.Inventory
extends Items {
    public Bank.Inventory() {
        super(InventoryID.INVENTORY, (Item item) -> {
            item.setWidgetId(WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER.getPackedId());
            return true;
        });
    }

    public static ItemQuery query() {
        return new ItemQuery(Bank.Inventory::getAll);
    }

    public static List<Item> getAll() {
        return Bank.Inventory.getAll((Item x) -> true);
    }

    public static List<Item> getAll(Predicate<Item> filter) {
        return BANK_INVENTORY.all(filter);
    }

    public static List<Item> getAll(int ... ids) {
        return BANK_INVENTORY.all(ids);
    }

    public static List<Item> getAll(String ... names) {
        return BANK_INVENTORY.all(Predicates.names((String[])names));
    }

    public static Item getFirst(Predicate<Item> filter) {
        return BANK_INVENTORY.first(filter);
    }

    public static Item getFirst(int ... ids) {
        return BANK_INVENTORY.first(ids);
    }

    public static Item getFirst(String ... names) {
        return BANK_INVENTORY.first(names);
    }

    public static int getCount(boolean stacks, Predicate<Item> filter) {
        return BANK_INVENTORY.count(stacks, filter);
    }

    public static int getCount(boolean stacks, int ... ids) {
        return BANK_INVENTORY.count(stacks, ids);
    }

    public static int getCount(boolean stacks, String ... names) {
        return BANK_INVENTORY.count(stacks, names);
    }

    public static int getCount(Predicate<Item> filter) {
        return BANK_INVENTORY.count(false, filter);
    }

    public static int getCount(int ... ids) {
        return BANK_INVENTORY.count(false, ids);
    }

    public static int getCount(String ... names) {
        return BANK_INVENTORY.count(false, names);
    }

    public static boolean containsAllOf(int ... ids) {
        for (int id : ids) {
            if (BANK_INVENTORY.exists(id)) continue;
            return false;
        }
        return true;
    }

    public static boolean containsAllOf(List<Integer> itemIdList) {
        for (int id : itemIdList) {
            if (BANK_INVENTORY.exists(id)) continue;
            return false;
        }
        return true;
    }

    public static boolean allMatches(Map<Integer, Integer> idCountMap) {
        for (Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
            if (BANK_INVENTORY.count(true, entry.getKey()) == entry.getValue().intValue()) continue;
            return false;
        }
        return true;
    }

    public static boolean allMatches(Map<Integer, Integer> idCountMap, Function<Integer, Predicate<Item>> remapping) {
        for (Map.Entry<Integer, Integer> entry : idCountMap.entrySet()) {
            int count = Math.max(BANK_INVENTORY.count(true, entry.getKey()), BANK_INVENTORY.count(true, remapping.apply(entry.getKey())));
            if (count == entry.getValue()) continue;
            return false;
        }
        return true;
    }
}
