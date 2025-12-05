package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.*;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/**
 * Task to mine ore veins in Motherlode Mine.
 */
@TaskDesc(name = "Mining ore", priority = 5, blocking = true)
public class MineOreTask extends MotherlodeMineTask {

    @Inject
    public class MineOreTask extends MotherlodeMineTask {

    @Inject
    public MineOreTask(SquireMinerConfig config, SquireMiner plugin, MotherlodeMineTracker tracker) {
        super(config, plugin, tracker);
    }

    @Override
    public boolean validate() {
        if (tracker.shouldGoToHopper() || tracker.shouldMine()) {
            return false;
        }

        Player player = Players.getLocal();
        if (player == null || player.isAnimating()) {
            return false;
        }

        // Find a vein to mine
        TileObject vein = TileObjects.getNearest(obj ->
            config.mlmArea().getWaypointList().contains(obj.getWorldLocation()) &&
            obj.getName().equals("Ore vein")
        );

        if (vein == null) {
            return false;
        }

        // Already mining this vein
        if (player.getInteracting() == vein) {
            return false;
        }

        // Enable run if needed
        if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 30) {
            Movement.toggleRun();
        }

        vein.interact("Mine");
        return true;
    }
}
