package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;

/**
 * Task responsible for banking items when inventory is full.
 * Withdraws gear and supplies according to the configured bank loadout.
 */
@TaskDesc(name = "Banking for items")
public class BankItemsTask extends Task {
    private final SquireBlueDragonKillerConfig config;
    private final SquireBlueDragonKiller plugin;
    private Player player;

    @Inject
    public BankItemsTask(SquireBlueDragonKillerConfig config, SquireBlueDragonKiller plugin) {
        this.config = config;
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        // Check if banking is needed
        if (!plugin.needsBanking()) {
            return false;
        }

        player = Players.getLocal();
        if (player == null) {
            return false;
        }

        // Must be at the bank location
        if (!config.bankLocation().getArea().contains(player)) {
            return false;
        }

        // Open bank if not already open
        if (!Bank.isOpen()) {
            Bank.open();
            return true;
        }

        // Check if we still need to bank
        BankLoadout loadout = config.loadout().selected(BankLoadout.class);
        if (!loadout.needsToBank()) {
            plugin.setNeedsBanking(false);
            return false;
        }

        // Withdraw items from bank according to loadout
        BankLoadouts.withdrawWithRetries(loadout, 5);
        return true;
    }
}
