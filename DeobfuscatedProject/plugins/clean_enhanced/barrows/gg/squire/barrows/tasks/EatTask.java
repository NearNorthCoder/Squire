/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that eats food when health is low.
 * Monitors current health and eats at the configured threshold.
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/**
 * Eats food when the player's health drops below the configured threshold.
 * Drops barrows chest items and prioritizes food consumption.
 */
@TaskDesc(name = "Eating food", priority = 133337)
public class EatTask extends Task {
    // Barrows chest item ID (dropped when eating)
    private static final int BARROWS_CHEST_ITEM_ID = 4535;

    private final SquireBarrows plugin;
    private final SquireBarrowsConfig config;

    @Inject
    public EatTask(SquireBarrows plugin, SquireBarrowsConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Don't eat outside of Barrows
        if (!this.plugin.isInHouse()) {
            return false;
        }

        // Drop barrows chest items if we have any
        if (Inventory.contains(BARROWS_CHEST_ITEM_ID)) {
            Inventory.dropAll(BARROWS_CHEST_ITEM_ID);
        }

        // Check if we need to eat
        int currentHealth = Combat.getCurrentHealth();
        if (currentHealth > this.config.eatAtHp()) {
            return false;
        }

        // Find food in inventory
        Item food = Inventory.getFirst(item -> item.hasAction("Eat"));
        if (food == null) {
            return false;
        }

        // Eat the food
        food.interact("Consume");
        return true;
    }
}
