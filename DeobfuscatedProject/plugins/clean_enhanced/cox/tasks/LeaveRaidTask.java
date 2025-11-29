package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

/**
 * Handles leaving the raid after completion or when requested.
 * Interacts with the exit ladder and confirms dialog options.
 */
@TaskDesc(name="Leave Raid", priority=Integer.MAX_VALUE - 100, blocking=true)
public class LeaveRaidTask extends CoxTaskBase {

    private final SquireChambersPlugin plugin;
    private final SquireChambersConfig config;

    @Inject
    public LeaveRaidTask(SquireChambersPlugin plugin, SquireChambersConfig config) {
        super(plugin, config);
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        if (plugin.getRaidState() != RaidState.LEAVING) {
            return false;
        }

        return execute();
    }

    @Override
    public boolean execute() {
        if (!plugin.shouldLeaveRaid()) {
            return false;
        }

        // Handle exit dialog
        if (Dialog.isViewingOptions() && Dialog.hasOption("Yes")) {
            Dialog.chooseOption("Yes");
            return true;
        }

        // Find and interact with exit ladder
        TileObject ladder = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Ladder") &&
            obj.hasAction("Climb-down")
        );

        if (ladder == null) {
            System.out.println("Exit ladder not found");
            return false;
        }

        ladder.interact("Climb-down");
        return true;
    }
}
