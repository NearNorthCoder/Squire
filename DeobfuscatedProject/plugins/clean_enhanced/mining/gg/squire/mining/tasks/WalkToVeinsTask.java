package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.*;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Task to walk to mining veins in Motherlode Mine.
 */
@TaskDesc(name = "Walking to veins", priority = 10, blocking = true)
public class WalkToVeinsTask extends MotherlodeMineTask {
    private static final RectangularArea UPPER_LADDER_AREA = new RectangularArea(3757, 5979, 3759, 5981);

    @Inject
    public WalkToVeinsTask(SquireMinerConfig config, SquireMiner plugin, MotherlodeMineTracker tracker) {
        super(config, plugin, tracker);
    }

    @Override
    public boolean validate() {
        Player player = Players.getLocal();
        if (player == null || player.isAnimating() || tracker.shouldGoToHopper()) {
            return false;
        }

        if (tracker.isSackFull() || tracker.shouldMine()) {
            return false;
        }

        TileObject nearestVein = getNearestVein();
        if (nearestVein != null &&
            nearestVein.getWorldLocation().distanceTo(player.getWorldLocation()) <= 50 &&
            Reachable.isInteractable(nearestVein)) {
            return false;
        }

        if (Movement.shouldWalk()) {
            return false;
        }

        if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 30) {
            Movement.toggleRun();
        }

        // Handle upper floor ladder if needed
        if (config.mlmArea() == MotherlodeMineArea.UPPER_FLOOR &&
            (!UPPER_LADDER_AREA.contains(player) || Vars.getBit(5558) == 0)) {
            TileObject ladder = TileObjects.getNearest(19044);
            if (ladder != null) {
                ladder.interact("Climb");
                sleep(4);
                return true;
            }
        }

        Movement.walkTo(config.mlmArea().getWaypoints()[0]);
        sleep(2);
        return true;
    }
}
