/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.api;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InventorySetup {
    private static final Logger log = LoggerFactory.getLogger(InventorySetup.class);
    private final Map<Predicate<Item>, Integer> setup = new HashMap<Predicate<Item>, Integer>();
    private final Map<Predicate<Item>, String> tags = new HashMap<Predicate<Item>, String>();

    public InventorySetup add(Predicate<Item> item, int quantity) {
        return this.add(item, quantity, "PredicateItem (no tag)");
    }

    public InventorySetup add(Predicate<Item> item, int quantity, String tag) {
        if (quantity > 0) {
            this.setup.put(item, quantity);
            this.tags.put(item, tag);
        }
        return this;
    }

    public InventorySetup add(String item, int quantity) {
        if (quantity > 0 && item != null && !item.isEmpty()) {
            Predicate<Item> itemPredicate = i -> i.getName().equals(item);
            this.setup.put(itemPredicate, quantity);
            this.tags.put(itemPredicate, "NamedItem (name=" + item + ")");
        }
        return this;
    }

    public InventorySetup add(int item, int quantity) {
        if (quantity > 0 && item > 0) {
            Predicate<Item> itemPredicate = i -> i.getId() == item;
            this.setup.put(itemPredicate, quantity);
            this.tags.put(itemPredicate, "IdItem (id=" + item + ")");
        }
        return this;
    }

    public InventorySetup add(int item) {
        return this.add(item, Integer.MAX_VALUE);
    }

    public InventorySetup add(String item) {
        return this.add(item, Integer.MAX_VALUE);
    }

    public InventorySetup add(Predicate<Item> item) {
        return this.add(item, Integer.MAX_VALUE);
    }

    private boolean inventoryHasOtherItems() {
        for (Item item : Inventory.getAll()) {
            boolean match = false;
            for (Predicate<Item> test : this.setup.keySet()) {
                if (!test.test(item)) continue;
                match = true;
            }
            if (match) continue;
            return true;
        }
        return false;
    }

    public boolean withdraw() {
        if (!Bank.isOpen()) {
            return false;
        }
        if (this.inventoryHasOtherItems()) {
            Bank.depositInventory();
        }
        for (Predicate<Item> filter : this.setup.keySet()) {
            int desired = this.setup.get(filter);
            if (desired <= 0) continue;
            if (desired == Integer.MAX_VALUE) {
                if (Inventory.contains(filter)) continue;
                Bank.withdrawAll(filter, Bank.WithdrawMode.DEFAULT);
                continue;
            }
            int left = desired - Inventory.getCount(true, filter);
            if (left < 0) {
                Bank.depositInventory();
                return false;
            }
            if (left == 0) continue;
            if (!Bank.contains(filter)) {
                log.info("Missing: " + this.tags.get(filter));
                continue;
            }
            if (Bank.getCount(true, filter) < left) {
                log.info("Not enough of: " + this.tags.get(filter) + " - We need " + left + " but have " + Bank.getCount(filter));
                continue;
            }
            Bank.withdraw(filter, left, Bank.WithdrawMode.DEFAULT);
        }
        return true;
    }

    public boolean matchesInventory() {
        for (Predicate<Item> filter : this.setup.keySet()) {
            Item first = Inventory.getFirst(filter);
            if (first == null) {
                return false;
            }
            if (this.setup.get(filter) == Integer.MAX_VALUE || Inventory.getCount(true, filter) == this.setup.get(filter)) continue;
            log.info("Count mismatch for: " + this.tags.get(filter));
            return false;
        }
        for (Item item : Inventory.getAll()) {
            boolean passed = false;
            for (Predicate<Item> filter : this.setup.keySet()) {
                if (!filter.test(item)) continue;
                passed = true;
            }
            if (passed) continue;
            return false;
        }
        return true;
    }

    public int amountRequired(Item item) {
        for (Predicate<Item> filter : this.setup.keySet()) {
            if (this.setup.get(filter) <= 0 || !filter.test(item)) continue;
            return this.setup.get(filter);
        }
        return 0;
    }
}
