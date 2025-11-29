package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

import java.util.List;

/**
 * Handles scouting raid layouts in Chambers of Xeric.
 * Scouts check which rooms are in the raid before committing to entry.
 * This allows players to find favorable layouts (e.g., avoiding Vanguards, seeking Muttadiles).
 */
@TaskDesc(name="Scouting for a raid", priority=20000, blocking=true)
public class ScoutingForARaidTask extends CoxManager {

    private int cooldownTicks;

    @Inject
    protected ScoutingForARaidTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.cooldownTicks = 0;
    }

    @Override
    public List<Prayer> getPrayersToActivate() {
        return null;
    }

    @Override
    public boolean execute() {
        if (cooldownTicks > 0) {
            cooldownTicks--;
            return true;
        }

        if (plugin.isInRaid()) {
            return false;
        }

        // Handle dialog option to scout
        if (Dialog.isViewingOptions() && Dialog.hasOption("Scout")) {
            Dialog.chooseOption("Scout");
            cooldownTicks = 2;
            return true;
        }

        // Find and interact with recruitment board
        TileObject board = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Chambers of Xeric") &&
            obj.hasAction("Scout")
        );

        if (board == null) {
            return false;
        }

        board.interact("Scout");
        cooldownTicks = 3;
        return true;
    }

    @Override
    public EquipmentSetup getEquipmentSetup() {
        return null;
    }

    @Override
    public boolean validate() {
        return plugin.isReadyToScout();
    }
}
