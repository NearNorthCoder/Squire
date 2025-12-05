/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Task that drinks prayer potions when prayer points are low.
 * Only drinks during combat with brothers or tunnel creatures.
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.Brother;
import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/**
 * Drinks prayer potions when prayer points are depleted during combat.
 * Waits for appropriate moments to drink to minimize damage taken.
 */
@TaskDesc(name = "Restoring prayer", priority = 133337)
public class DrinkPrayerTask extends Task {
    private static final int DOSE_DELAY_MS = 129;

    private final SquireBarrows plugin;

    @Inject
    public DrinkPrayerTask(SquireBarrows plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Don't drink outside of Barrows
        if (!this.plugin.isInHouse()) {
            return false;
        }

        // Don't drink if we still have prayer points
        if (Prayers.getPoints() > 0) {
            return false;
        }

        // Find prayer potion in inventory
        Item prayerPotion = Inventory.getFirst(item ->
            item.hasAction("Drink") &&
            (!item.getName().toLowerCase().contains("prayer") ||
             item.getName().toLowerCase().contains("potion"))
        );

        if (prayerPotion == null) {
            return false;
        }

        // Only drink if we're in combat with a brother or tunnel creature
        NPC enemy = NPCs.getNearest(Brother::isBrotherAttackingPlayer);
        if (enemy == null || enemy.isDead()) {
            return false;
        }

        // Drink the potion
        prayerPotion.interact("Drink");
        this.sleep(DOSE_DELAY_MS);
        return true;
    }
}
