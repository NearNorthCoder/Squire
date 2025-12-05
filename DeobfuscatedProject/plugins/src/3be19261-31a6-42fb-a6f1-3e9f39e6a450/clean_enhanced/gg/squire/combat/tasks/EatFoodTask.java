package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

import javax.inject.Inject;

/**
 * Task responsible for eating food when health is low.
 * Priority: 130 (very high priority to ensure survival)
 */
@TaskDesc(name = "Eating", priority = 130)
public class EatFoodTask extends Task {
    private final SquireBlueDragonKillerConfig config;

    @Inject
    public EatFoodTask(SquireBlueDragonKillerConfig config) {
        this.config = config;
    }

    @Override
    public boolean run() {
        // Only eat if health is below configured threshold
        if (Combat.getHealthPercent() > config.eatAt()) {
            return false;
        }

        // Find food in inventory
        Item food = Inventory.getFirst(item ->
            item.hasAction("Eat")
        );

        if (food == null) {
            return false;
        }

        // Eat the food
        food.interact("Eat");
        this.sleep(2);
        return true;
    }
}
