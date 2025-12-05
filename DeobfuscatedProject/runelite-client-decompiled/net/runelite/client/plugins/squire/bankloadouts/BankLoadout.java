/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 */
package net.runelite.client.plugins.squire.bankloadouts;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.runelite.api.Item;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.runelite.client.plugins.squire.runepouch.RunePouchSetup;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankLoadout {
    private static final Logger log = LoggerFactory.getLogger(BankLoadout.class);
    private final InventorySetup inventorySetup;
    private final EquipmentSetup equipmentSetup;
    private final RunePouchSetup runePouchSetup;
    private String name;
    private boolean enabled;

    public BankLoadout(String name, InventorySetup inventorySetup, EquipmentSetup equipmentSetup, RunePouchSetup runePouchSetup) {
        this.name = name;
        this.inventorySetup = inventorySetup;
        this.equipmentSetup = equipmentSetup;
        this.runePouchSetup = runePouchSetup;
    }

    public static BankLoadout get() {
        EquipmentSetup equipment = EquipmentSetup.get();
        InventorySetup inventory = InventorySetup.get();
        RunePouchSetup runePouch = RunePouchSetup.get();
        return new BankLoadout("", inventory, equipment, runePouch);
    }

    public static BankLoadout empty() {
        return new BankLoadout("", InventorySetup.empty(), EquipmentSetup.empty(), RunePouchSetup.get());
    }

    public boolean needsToGetFood() {
        int setup = this.inventorySetup.getCount(i -> List.of(i.getInventoryActions()).contains("Eat"));
        return setup > 0 && Inventory.getCount(i -> i.hasAction(new String[]{"Eat"})) == 0;
    }

    public boolean needsToGetPrayer() {
        Predicate<String> predicate = i -> Stream.of("super restore", "prayer", "sanfew").anyMatch(str -> i != null && i.toLowerCase().contains((CharSequence)str));
        int setup = this.inventorySetup.getCount(i -> predicate.test(i.getName()));
        return setup > 0 && Inventory.getCount(i -> predicate.test(i.getName())) == 0;
    }

    public boolean needsToBank() {
        InventorySetup setup = this.getInventorySetup();
        HashMap<Integer, Integer> itemCountMap = new HashMap<Integer, Integer>();
        for (int item : setup.getIds()) {
            int current = itemCountMap.getOrDefault(item, 0);
            itemCountMap.put(item, current + 1);
        }
        Object object = itemCountMap.keySet().iterator();
        while (object.hasNext()) {
            int item = (Integer)object.next();
            if (item <= 0) continue;
            int count = (Integer)itemCountMap.get(item);
            int mapped = ItemVariationMapping.map(item);
            int unstackedCount = Inventory.getCount(false, i -> ItemVariationMapping.getVariations(mapped).contains(i.getId()));
            if (unstackedCount == count) continue;
            Item firstEncounted = Inventory.getFirst(i -> ItemVariationMapping.getVariations(mapped).contains(i.getId()));
            if (firstEncounted != null && !firstEncounted.isStackable()) {
                return true;
            }
            int stackedCount = Inventory.getCount(true, i -> ItemVariationMapping.getVariations(mapped).contains(i.getId()));
            if (stackedCount >= count) continue;
            return true;
        }
        return !this.equipmentSetup.isFullyEquipped();
    }

    public InventorySetup getInventorySetup() {
        return this.inventorySetup;
    }

    public EquipmentSetup getEquipmentSetup() {
        return this.equipmentSetup;
    }

    public RunePouchSetup getRunePouchSetup() {
        return this.runePouchSetup;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BankLoadout)) {
            return false;
        }
        BankLoadout other = (BankLoadout)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isEnabled() != other.isEnabled()) {
            return false;
        }
        InventorySetup this$inventorySetup = this.getInventorySetup();
        InventorySetup other$inventorySetup = other.getInventorySetup();
        if (this$inventorySetup == null ? other$inventorySetup != null : !((Object)this$inventorySetup).equals(other$inventorySetup)) {
            return false;
        }
        EquipmentSetup this$equipmentSetup = this.getEquipmentSetup();
        EquipmentSetup other$equipmentSetup = other.getEquipmentSetup();
        if (this$equipmentSetup == null ? other$equipmentSetup != null : !((Object)this$equipmentSetup).equals(other$equipmentSetup)) {
            return false;
        }
        RunePouchSetup this$runePouchSetup = this.getRunePouchSetup();
        RunePouchSetup other$runePouchSetup = other.getRunePouchSetup();
        if (this$runePouchSetup == null ? other$runePouchSetup != null : !((Object)this$runePouchSetup).equals(other$runePouchSetup)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BankLoadout;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isEnabled() ? 79 : 97);
        InventorySetup $inventorySetup = this.getInventorySetup();
        result = result * 59 + ($inventorySetup == null ? 43 : ((Object)$inventorySetup).hashCode());
        EquipmentSetup $equipmentSetup = this.getEquipmentSetup();
        result = result * 59 + ($equipmentSetup == null ? 43 : ((Object)$equipmentSetup).hashCode());
        RunePouchSetup $runePouchSetup = this.getRunePouchSetup();
        result = result * 59 + ($runePouchSetup == null ? 43 : ((Object)$runePouchSetup).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "BankLoadout(inventorySetup=" + String.valueOf(this.getInventorySetup()) + ", equipmentSetup=" + String.valueOf(this.getEquipmentSetup()) + ", runePouchSetup=" + String.valueOf(this.getRunePouchSetup()) + ", name=" + this.getName() + ", enabled=" + this.isEnabled() + ")";
    }
}

