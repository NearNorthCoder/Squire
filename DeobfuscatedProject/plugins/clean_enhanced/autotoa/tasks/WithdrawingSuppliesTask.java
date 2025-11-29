/*
 * Decompiled with CFR 0.152.
 *
 * Withdrawing Supplies Task
 *
 * This task handles withdrawing TOA supplies from the Supplies container during raids.
 *
 * Functionality:
 * - Opens the Supplies container if it's closed
 * - Withdraws specific TOA consumables in order:
 *   1. Smelling salts (combat boost)
 *   2. Liquid adrenaline (special attack restore)
 *   3. Ambrosia (stat restore)
 *   4. Nectar (health restore)
 *   5. Silk dressing (healing over time)
 *   6. Tears of elidinis (prayer restore)
 * - Manages inventory space by dropping prayer potions (except sanfew serum)
 * - Withdraws all prayer restores when there's space and prayers are active
 *
 * Supply Item IDs:
 * - Tears of Elidinis: 27327, 27329, 27331, 27333
 * - Nectar: 27315, 27317, 27319, 27321
 * - Smelling Salts: 27343, 27345
 * - Liquid Adrenaline: 27339, 27341
 * - Ambrosia: 27347, 27349
 * - Blessed Crystal Scarab: 27335, 27337
 * - Silk Dressing: 27323, 27325
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Withdrawing supplies", priority=5000, blocking=true)
public class WithdrawingSuppliesTask extends AutotoaManager {

    // String constants
    private static final String SUPPLIES_CONTAINER_NAME = "Supplies";
    private static final String ACTION_OPEN = "Open";
    private static final String ACTION_WITHDRAW_ALL = "Withdraw All";
    private static final String POTION_NAME_RESTORE = "restore";
    private static final String POTION_NAME_PRAYER = "prayer";
    private static final String POTION_NAME_SANFEW = "sanfew";

    // Manager instance
    private final TOAConsumableManager consumableManager;

    @Inject
    protected WithdrawingSuppliesTask(Client client, TOAConsumableManager consumableManager) {
        super(client);
        this.consumableManager = consumableManager;
    }

    /**
     * Attempts to withdraw a specific supply type from the supplies container.
     *
     * @param supplyType The type of supply to withdraw (from TOASupplyType enum)
     * @return true if withdrawal was attempted, false if supply is not needed or already in inventory
     */
    private boolean withdrawSupply(TOASupplyType supplyType) {
        // Check if we have the supplies container
        Item suppliesContainer = Inventory.getFirst(SUPPLIES_CONTAINER_NAME);
        if (suppliesContainer == null) {
            return false;
        }

        // Check if we have enough of this supply type already
        if (this.consumableManager.getSupplyQuantity().getOrDefault(supplyType, 0) <= 0) {
            return false;
        }

        // Check if we already have this supply in inventory
        Item existingSupply = Inventory.getFirst(item -> supplyType.hasItemId(item.getId()));
        if (existingSupply != null) {
            return false;
        }

        // Check if inventory is full
        if (Inventory.isFull()) {
            return false;
        }

        // Check if we're in delay
        if (getTickDelay() > 0) {
            return false;
        }

        // If supplies container is open, withdraw the supply
        if (this.consumableManager.isSuppliesContainerOpen()) {
            this.consumableManager.withdrawSupply(supplyType);
            return true;
        }

        // Otherwise, open the supplies container
        suppliesContainer.interact(ACTION_OPEN);
        return true;
    }

    /**
     * Drops prayer potions from inventory to make space.
     * Only drops potions containing "restore" or "prayer" but NOT "sanfew" (sanfew serum).
     *
     * @param itemToDrop The item to check and potentially drop
     * @return true if the item should be dropped, false otherwise
     */
    private boolean shouldDropPrayerPotion(Item itemToDrop) {
        String itemName = itemToDrop.getName().toLowerCase();

        // Don't drop sanfew serum (it cures poison/venom AND restores prayer)
        if (itemName.contains(POTION_NAME_SANFEW)) {
            return false;
        }

        // Drop if it's a prayer restore or regular restore potion
        return itemName.contains(POTION_NAME_RESTORE) || itemName.contains(POTION_NAME_PRAYER);
    }

    @Override
    public boolean run() {
        // Check if we have the supplies container
        Item suppliesContainer = Inventory.getFirst(SUPPLIES_CONTAINER_NAME);
        if (suppliesContainer == null) {
            return false;
        }

        // If the container is empty, open it to reveal contents
        if (this.consumableManager.getSupplyQuantity().isEmpty()) {
            suppliesContainer.interact(ACTION_OPEN);
            return true;
        }

        // Priority 1: Withdraw smelling salts (combat boost)
        if (withdrawSupply(TOASupplyType.SMELLING_SALTS)) {
            return true;
        }

        // Check if we can continue withdrawing (not in special weapon mode)
        if (!isInSpecialWeaponMode()) {
            return false;
        }

        // If inventory is full and we don't have liquid adrenaline, drop prayer potions
        if (Inventory.isFull() && !Inventory.contains(item -> TOASupplyType.LIQUID_ADRENALINE.hasItemId(item.getId()))) {
            dropItems(this::shouldDropPrayerPotion);
        }

        // If we have space and prayers are active, withdraw all prayer restores
        if (isInSpecialWeaponMode() && Inventory.getFreeSlots() > 1 && Prayers.anyActive()) {
            suppliesContainer.interact(ACTION_WITHDRAW_ALL);
        }

        // Priority 2: Withdraw liquid adrenaline (special attack restore)
        if (withdrawSupply(TOASupplyType.LIQUID_ADRENALINE)) {
            return true;
        }

        // Priority 3: Withdraw ambrosia (stat restore)
        if (withdrawSupply(TOASupplyType.AMBROSIA)) {
            return true;
        }

        // Priority 4: Withdraw nectar (health restore)
        if (withdrawSupply(TOASupplyType.NECTAR)) {
            return true;
        }

        // Priority 5: Withdraw silk dressing (healing over time)
        if (withdrawSupply(TOASupplyType.SILK_DRESSING)) {
            return true;
        }

        // Priority 6: Withdraw tears of elidinis (prayer restore)
        if (withdrawSupply(TOASupplyType.TEARS_OF_ELIDINIS)) {
            return true;
        }

        return false;
    }
}
