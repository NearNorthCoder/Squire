/*
 * Decompiled with CFR 0.152.
 *
 * Dropping Unnecessary Supplies Task
 *
 * This task handles dropping unnecessary items during TOA raids to free up inventory space.
 * It drops items when:
 * - In special weapon mode and has health remaining
 * - Inventory has <= 2 free slots
 * - Items are no longer needed (antidotes, excess potions, used consumables)
 *
 * Priority order for dropping:
 * 1. Antidote potions (when not poisoned)
 * 2. Excess combat potions
 * 3. Tears of Elidinis (drink if prayer low, drop otherwise)
 * 4. Nectar (drink if health low, drop otherwise)
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Dropping unnecessary supplies", priority=10)
public class DroppingUnnecessarySuppliesTask extends KephriManager {

    // Constants
    private static final int MIN_FREE_SLOTS = 2;
    private static final int SLEEP_DELAY = 4;

    private final ConsumableManager consumableManager;

    @Inject
    protected DroppingUnnecessarySuppliesTask(Client client, ConsumableManager consumableManager) {
        super(client);
        this.consumableManager = consumableManager;
    }

    @Override
    public boolean run() {
        // Only drop if in special weapon mode and has health
        if (!aq() || getRemainingHealth() <= 0) {
            return false;
        }

        // Only drop if inventory is getting full
        if (Inventory.getFreeSlots() > MIN_FREE_SLOTS) {
            return false;
        }

        // Drop antidote potions if present
        if (Inventory.contains(item -> item.getName().toLowerCase().contains("anti"))) {
            Item antidote = Inventory.getFirst(item ->
                item.getName().toLowerCase().contains("anti")
            );
            antidote.interact("Drop");
            return true;
        }

        // Drop excess combat potions
        for (CombatPotion potion : CombatPotion.values()) {
            Item potionItem = Inventory.getFirst(item ->
                item.getName().toLowerCase().contains(potion.getName().toLowerCase())
            );

            if (potionItem != null) {
                potionItem.interact("Drop");
                return true;
            }
        }

        // Handle Tears of Elidinis
        Item tears = Inventory.getFirst(item ->
            TOAItemType.TEARS_OF_ELIDINIS.hasItemId(item.getId())
        );

        if (tears != null) {
            // Check if we have ambrosia available and should use tears
            int ambrosiaCount = this.consumableManager.getSupplyQuantity()
                .getOrDefault(TOAItemType.AMBROSIA, 0);

            if (ambrosiaCount > 0 && be() && !Inventory.contains(item ->
                TOAItemType.AMBROSIA.hasItemId(item.getId()))) {

                // Drink tears if prayer is low, otherwise drop
                String action;
                if (Prayers.getPoints() < Skills.getLevel(Skill.PRAYER)) {
                    action = "Drink";
                } else {
                    action = "Drop";
                }

                tears.interact(action);
                sleep(SLEEP_DELAY);
                return true;
            }
        }

        // Handle Nectar (brew)
        Item nectar = Inventory.getFirst(item ->
            TOAItemType.NECTAR.hasItemId(item.getId())
        );

        if (nectar != null) {
            // Check if we have ambrosia available and should use nectar
            int ambrosiaCount = this.consumableManager.getSupplyQuantity()
                .getOrDefault(TOAItemType.AMBROSIA, 0);

            if (ambrosiaCount > 0 && be() && !Inventory.contains(item ->
                TOAItemType.AMBROSIA.hasItemId(item.getId()))) {

                // Drink nectar if health is low, otherwise drop
                String action;
                if (Combat.getMissingHealth() > 0) {
                    action = "Drink";
                } else {
                    action = "Drop";
                }

                nectar.interact(action);
                sleep(SLEEP_DELAY);
                return true;
            }
        }

        return false;
    }
}
