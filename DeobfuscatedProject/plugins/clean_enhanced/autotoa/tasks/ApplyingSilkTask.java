/*
 * Decompiled with CFR 0.152.
 *
 * Silk Dressing Application Task
 *
 * This task handles applying silk dressing during TOA raids.
 * Silk dressing provides healing over time.
 * It applies silk dressing when:
 * - Not paused
 * - In special weapon mode (aq())
 * - Missing health is >= threshold (30)
 * - Consumable manager allows silk usage
 * - Tick cooldown has elapsed (6 ticks)
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Applying Silk", priority=100)
public class ApplyingSilkTask extends KephriManager {

    // Constants
    private static final int MISSING_HEALTH_THRESHOLD = 30;
    private static final int TICK_COOLDOWN = 6;

    private int lastUseTick;
    private final ConsumableManager consumableManager;
    private final SquireAutoTOA plugin;

    @Inject
    protected ApplyingSilkTask(Client client, ConsumableManager consumableManager, SquireAutoTOA plugin) {
        super(client);
        this.consumableManager = consumableManager;
        this.plugin = plugin;
        this.lastUseTick = 0;
    }

    @Override
    public boolean run() {
        // Don't apply if plugin is paused
        if (this.plugin.isPaused()) {
            return false;
        }

        // Don't apply if not in special weapon mode
        if (!isInSpecialWeaponMode()) {
            return false;
        }

        // Check if we need healing and consumable manager allows it
        if (Combat.getMissingHealth() < MISSING_HEALTH_THRESHOLD ||
            !this.consumableManager.canUseItem()) {
            return false;
        }

        // Check tick cooldown to prevent spamming
        int currentTick = this.client.getTickCount();
        if (currentTick - this.lastUseTick < TICK_COOLDOWN) {
            return false;
        }

        // Find silk dressing in inventory
        Item silkDressing = Inventory.getFirst(item ->
            item.getName().startsWith("Silk dressing")
        );

        // Apply silk dressing if found
        if (silkDressing != null) {
            silkDressing.interact("Apply");
            this.lastUseTick = currentTick;
            this.consumableManager.recordItemUse();
            return true;
        }

        return false;
    }
}
