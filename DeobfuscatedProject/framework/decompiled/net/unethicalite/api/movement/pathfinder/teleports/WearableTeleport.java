/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api.movement.pathfinder.teleports;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public enum WearableTeleport {

    private final WorldPoint destination;
    private final String itemName;
    private final String action;
    private final int dialogue;
    private final EquipmentInventorySlot slot;
    private final int[] itemIds;
    private final Set<Integer> itemIdSet = new HashSet<Integer>();

    private WearableTeleport(WorldPoint destination, String itemName, String action, int dialogue, EquipmentInventorySlot slot, Integer ... itemIds) {
        this.destination = destination;
        this.itemName = itemName;
        this.dialogue = dialogue;
        this.slot = slot;
        this.itemIds = new int[itemIds.length];
        for (int i = 0; i < itemIds.length; ++i) {
            this.itemIds[i] = itemIds[i];
        }
        this.itemIdSet.addAll(Arrays.asList(itemIds));
        this.action = action;
    }

    public boolean hasItem() {
        Item fromSlot = Equipment.fromSlot(this.slot);
        if (fromSlot != null && this.itemIdSet.contains(fromSlot.getId())) {
            return true;
        }
        return Inventory.contains(this.itemIds);
    }

    public WorldPoint getDestination() {
        return this.destination;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getAction() {
        return this.action;
    }

    public int getDialogue() {
        return this.dialogue;
    }

    public EquipmentInventorySlot getSlot() {
        return this.slot;
    }

    public int[] getItemIds() {
        return this.itemIds;
    }

    public Set<Integer> getItemIdSet() {
        return this.itemIdSet;
    }
}
