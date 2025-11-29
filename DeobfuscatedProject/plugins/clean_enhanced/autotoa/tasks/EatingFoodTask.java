package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/**
 * Task for eating food when the player's health is low.
 *
 * This task:
 * - Monitors player health
 * - Consumes food items when health drops below threshold
 * - Only operates inside TOA instance regions
 * - Coordinates with health manager for timing
 */
@TaskDesc(name = "Eating Food", priority = 250)
public class EatingFoodTask extends KephriManager {
    private final HealthManager healthManager;
    private final SquireAutoTOA plugin;

    @Inject
    protected EatingFoodTask(Client client, HealthManager healthManager, SquireAutoTOA plugin) {
        super(client);
        this.healthManager = healthManager;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Don't eat if plugin is not active
        if (!plugin.isActive()) {
            return false;
        }

        // Only eat inside TOA instance
        if (!client.isInInstancedRegion()) {
            return false;
        }

        // Check if we should eat and are ready to eat
        if (!healthManager.shouldEat() || !healthManager.canEat()) {
            return false;
        }

        // Find food item with "Eat" action
        Item food = Inventory.getFirst(item -> item.hasAction("Eat"::equals));

        if (food != null) {
            healthManager.recordEat();
            food.interact("Eat");
            return true;
        }

        return false;
    }
}
