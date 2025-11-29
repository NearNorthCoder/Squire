package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

import java.util.List;

/**
 * Configures and starts a Chambers of Xeric raid.
 * Sets up equipment loadouts, room order, and party configuration before entry.
 * Confirms raid start dialog and initializes raid state tracking.
 */
@TaskDesc(name="Setting up raid", priority=20000, blocking=true)
public class SettingUpRaidTask extends CoxManager {

    @Inject
    protected SettingUpRaidTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public List<Prayer> getPrayersToActivate() {
        return null;
    }

    @Override
    public boolean validate() {
        return plugin.isReadyToStart();
    }

    @Override
    public boolean execute() {
        if (plugin.isInRaid()) {
            return false;
        }

        if (plugin.getRoomLayout().isConfigured()) {
            return false;
        }

        // Handle start raid dialog
        if (Dialog.isViewingOptions() && Dialog.hasOption("Start")) {
            Dialog.chooseOption("Start");
            System.out.println("[StartRaid] Starting raid, layout: " + plugin.getRoomLayout());
            return true;
        }

        // Configure raid interface
        Widget raidWidget = Widgets.get(271, 103);
        if (raidWidget == null) {
            System.out.println("Raid setup interface not found");
            return false;
        }

        // Set up equipment configurations
        plugin.getRoomLayout().setStartRoom(config.getStartRoom());
        plugin.getRoomLayout().setMeleeSetup(config.getMeleeSetup());
        plugin.getRoomLayout().setRangedSetup(config.getRangedSetup());
        plugin.getRoomLayout().setMageSetup(config.getMageSetup());

        // Interact with start button
        raidWidget.interact("Start");
        sleep(config.actionDelay() + 1);

        return true;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }
}
