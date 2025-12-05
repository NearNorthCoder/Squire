package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.*;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;

/**
 * Task to walk to the hopper in Motherlode Mine.
 */
@TaskDesc(name = "Walking to hopper", priority = 10, blocking = true)
public class WalkToHopperTask extends MotherlodeMineTask {

    @Inject
    public WalkToHopperTask(SquireMinerConfig config, SquireMiner plugin, MotherlodeMineTracker tracker) {
        super(config, plugin, tracker);
    }

    @Override
    public boolean validate() {
        // Don't walk if inventory isn't ready
        if (!tracker.shouldGoToHopper()) {
            return false;
        }

        // Don't walk if already at sack
        if (tracker.isInMotherlodeMine()) {
            return false;
        }

        Player player = Players.getLocal();
        if (player == null) {
            return false;
        }

        // Handle dialog
        if (Dialog.isOpen() && Dialog.canContinue()) {
            Dialog.continueSpace();
        }

        TileObject hopper = getAppropriatHopper();
        if (hopper == null) {
            return false;
        }

        // Already close enough
        if (hopper.distanceTo(player.getWorldLocation()) < 3) {
            return false;
        }

        // Walk to hopper
        if (Movement.shouldWalk()) {
            Movement.walkTo(hopper);
        }

        return true;
    }
}
