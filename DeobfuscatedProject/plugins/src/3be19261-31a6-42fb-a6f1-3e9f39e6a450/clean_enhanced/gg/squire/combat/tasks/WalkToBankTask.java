package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/**
 * Task responsible for walking to the bank.
 * Uses teleport tabs if available, otherwise walks.
 */
@TaskDesc(name = "Walking To Bank")
public class WalkToBankTask extends Task {
    private final SquireBlueDragonKiller plugin;
    private final SquireBlueDragonKillerConfig config;

    @Inject
    public WalkToBankTask(SquireBlueDragonKiller plugin, SquireBlueDragonKillerConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        // Only walk to bank if banking is needed
        if (!plugin.needsBanking()) {
            return false;
        }

        // Already at bank
        if (isAtBank()) {
            return false;
        }

        // Walk to bank (with teleport if available)
        walkToBank();
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
     * Walks to the bank, using teleport tab if available.
     */
    private void walkToBank() {
        // Don't walk if already walking
        if (Movement.shouldWalk()) {
            return;
        }

        // Try to use teleport tab if available
        if (Inventory.contains(item -> item.getName().contains("teleport"))) {
            Inventory.getFirst(item -> item.getName().contains("tab"))
                    .interact("Break");
            return;
        }

        // Walk to bank
        Movement.walkTo(config.bankLocation().getArea());
    }
}
