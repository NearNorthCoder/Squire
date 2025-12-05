package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.DragonCombatManager;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Task responsible for walking to the dragon location.
 */
@TaskDesc(name = "Walking To Blue Dragons")
public class WalkToDragonsTask extends Task {
    private final SquireBlueDragonKillerConfig config;
    private final DragonCombatManager combatManager;
    private final SquireBlueDragonKiller plugin;

    @Inject
    public WalkToDragonsTask(SquireBlueDragonKillerConfig config, DragonCombatManager combatManager,
                            SquireBlueDragonKiller plugin) {
        this.config = config;
        this.combatManager = combatManager;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Only walk to dragons if not at bank and ready
        if (!shouldWalkToDragons()) {
            return false;
        }

        walkToDragons();
        return true;
    }

    /**
     * Checks if player is at the bank location.
     *
     * @return true if at bank
     */
    private boolean isAtBank() {
        return config.bankLocation().getArea().contains(Players.getLocal());
    }

    /**
     * Checks if player is in the dragon area.
     *
     * @return true if in dragon area
     */
    private boolean isInDragonArea() {
        return combatManager.isInDragonArea();
    }

    /**
     * Checks if inventory is full with no food.
     *
     * @return true if inventory full and no food available
     */
    private boolean isInventoryFullNoFood() {
        return Inventory.isFull() &&
               !Inventory.contains(item -> item.hasAction("Eat"));
    }

    /**
     * Determines if we should walk to dragons.
     *
     * @return true if should walk to dragons
     */
    private boolean shouldWalkToDragons() {
        // Don't walk if:
        // - Currently needs banking and not at bank
        // - Not in dragon area
        // - Inventory full with no food
        // - Has drinkable potions available
        if (!plugin.needsBanking() ||
            isAtBank() ||
            !isInDragonArea() ||
            !isInventoryFullNoFood() ||
            Inventory.contains(item -> item.hasAction("Drink"))) {
            return true;
        }

        return false;
    }

    /**
     * Walks to the dragon location.
     */
    private void walkToDragons() {
        if (Movement.shouldWalk()) {
            return;
        }

        Movement.walkTo(config.dragonLocation().getLocation());
    }
}
