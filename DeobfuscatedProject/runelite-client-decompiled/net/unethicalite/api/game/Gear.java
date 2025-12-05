/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 */
package net.unethicalite.api.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public class Gear {
    public static boolean swapTo(ConfigStorageBox<EquipmentSetup> setup) {
        return Gear.swapTo(Gear.matching(setup));
    }

    public static boolean swapTo(EquipmentSetup equipmentSetup) {
        return Gear.swapTo(equipmentSetup.getIds());
    }

    public static boolean isEquipped(int[] gear) {
        for (int gearItem : gear) {
            int mapped;
            if (gearItem <= 0 || Equipment.contains(arg_0 -> Gear.lambda$isEquipped$0(gearItem, mapped = ItemVariationMapping.map(gearItem), arg_0))) continue;
            return false;
        }
        return true;
    }

    public static boolean swapTo(int[] gear) {
        ArrayList<Item> items = new ArrayList<Item>();
        HashSet<Integer> allPossibleVariations = new HashSet<Integer>();
        for (int gearItem : gear) {
            if (gearItem <= 0) continue;
            int mapped = ItemVariationMapping.map(gearItem);
            Collection<Integer> variations = ItemVariationMapping.getVariations(mapped);
            allPossibleVariations.addAll(variations);
            items.addAll(Inventory.getAll(i -> variations.contains(i.getId())));
        }
        if (items.isEmpty()) {
            if (Inventory.isFull()) {
                return false;
            }
            List<Item> takeOffs = Equipment.getAll(i -> !allPossibleVariations.contains(i.getId()) && i.getSlot() != EquipmentInventorySlot.RING.getSlotIdx() && i.getSlot() != EquipmentInventorySlot.AMULET.getSlotIdx());
            if (takeOffs.isEmpty()) {
                return false;
            }
            takeOffs.forEach(i -> i.interact("Remove"));
            return true;
        }
        for (int i2 = 0; i2 < Math.min(items.size(), 7); ++i2) {
            Item item = (Item)items.get(i2);
            if (Gear.isEquipped(new int[]{item.getId()})) continue;
            item.interact(a -> a != null && (a.equals("Wield") || a.equals("Wear") || a.equals("Equip")));
        }
        return true;
    }

    public static int[] matching(ConfigStorageBox<EquipmentSetup> setup) {
        EquipmentSetup selected = setup.selected(EquipmentSetup.class);
        return selected != null ? selected.getIds() : new int[]{};
    }

    private static /* synthetic */ boolean lambda$isEquipped$0(int gearItem, int mapped, Item item) {
        return item.getId() == gearItem || ItemVariationMapping.getVariations(mapped).contains(item.getId());
    }
}

