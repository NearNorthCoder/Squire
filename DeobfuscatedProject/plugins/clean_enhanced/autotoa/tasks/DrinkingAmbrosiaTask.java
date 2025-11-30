/*
 * Decompiled with CFR 0.152.
 *
 * Ambrosia Drinking Task
 *
 * This task handles drinking ambrosia potions during TOA raids.
 * Ambrosia provides healing without stat penalties (unlike brews).
 * It drinks ambrosia when:
 * - Not paused
 * - In special weapon mode (aq())
 * - Consumable manager allows usage
 * - No nectar (brew) available OR health is critically low
 * - Current health is below threshold
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Drinking Ambrosia", priority=105)
public class DrinkingAmbrosiaTask extends KephriManager {

    // Constants
    private static final int HP_THRESHOLD_DEFAULT = 37;
    private static final int HP_THRESHOLD_BOSS_FIGHT = 54;

    private final ConsumableManager consumableManager;
    private final SquireAutoTOA plugin;

    @Inject
    protected DrinkingAmbrosiaTask(Client client, ConsumableManager consumableManager, SquireAutoTOA plugin) {
        super(client);
        this.consumableManager = consumableManager;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Don't drink if plugin is paused
        if (this.plugin.e()) {
            return false;
        }

        // Don't drink if not in special weapon mode
        if (!aq()) {
            return false;
        }

        // Don't drink if consumable manager doesn't allow it
        if (!this.consumableManager.canConsumeItem()) {
            return false;
        }

        // Determine health threshold based on whether nectar is available
        int healthThreshold = HP_THRESHOLD_DEFAULT;

        // If nectar (brew) is available in inventory, use lower threshold
        if (Inventory.contains(item -> GameEnum12.NECTAR.d(item.getId()))) {
            healthThreshold = HP_THRESHOLD_DEFAULT;
        }

        // If in boss fight phase, use higher threshold
        if (bf()) {
            healthThreshold = HP_THRESHOLD_BOSS_FIGHT;
        }

        // Don't drink if health is above threshold
        if (Combat.getCurrentHealth() > healthThreshold) {
            return false;
        }

        // Find ambrosia potion in inventory
        Item ambrosia = Inventory.getFirst(item ->
            GameEnum12.AMBROSIA.d(item.getId())
        );

        // No ambrosia found
        if (ambrosia == null) {
            return false;
        }

        // Drink the ambrosia
        ambrosia.interact("Drink");
        this.consumableManager.recordConsumption();
        return true;
    }
}
