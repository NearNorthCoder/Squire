package gg.squire.combat.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;

import javax.inject.Inject;

/**
 * Initial task that runs when the plugin starts.
 * Performs validation and sets up the plugin state.
 */
@TaskDesc(name = "Starting")
public class StartingTask extends Task {
    private final SquireBlueDragonKiller plugin;
    private final SquireBlueDragonKillerConfig config;
    private final Client client;

    @Inject
    public StartingTask(SquireBlueDragonKiller plugin, SquireBlueDragonKillerConfig config, Client client) {
        this.plugin = plugin;
        this.config = config;
        this.client = client;
    }

    @Override
    public boolean run() {
        // Check if plugin is enabled
        if (!this.plugin.isPluginEnabled()) {
            return false;
        }

        // Validate bank loadout is configured
        BankLoadout loadout = config.loadout().selected(BankLoadout.class);
        if (loadout == null) {
            Log.error("No bank loadout configured for Blue Dragon Killer!");
            plugin.forceStop();
            return true;
        }

        // If not in dragon area and need to bank, enable banking
        if (!config.dragonLocation().getDragonArea().contains(Players.getLocal()) &&
            loadout.needsToBank()) {
            plugin.setNeedsBanking(true);
        }

        // Mark plugin as started
        plugin.setStarted(false);
        return true;
    }
}
