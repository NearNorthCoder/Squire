package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

/**
 * Handles progression through agility obstacles in TOA puzzle rooms.
 *
 * This task navigates through various agility obstacles like barriers, platforms,
 * and passages to progress through the puzzle room. It detects the player's
 * position relative to obstacles and determines the correct action.
 */
@TaskDesc(name="Progress Puzzle")
public class ProgressPuzzleTask extends KephriManager {

    @Inject
    protected ProgressPuzzleTask(Client client, PuzzleStateManager stateManager, TOAConfig config, PuzzlePathfinder pathfinder) {
        super(client, stateManager, config, pathfinder);
    }

    /**
     * Executes the agility progression logic.
     *
     * The task:
     * 1. Checks if a barrier needs to be crawled through
     * 2. Determines if the player is on the correct side of the barrier
     * 3. Navigates to and interacts with platforms or passages as needed
     */
    @Override
    public boolean execute() {
        TileObject barrier = TileObjects.getNearest("Barrier");
        if (barrier == null) {
            return false;
        }

        int playerX = this.client.getLocalPlayer().getWorldX();
        int targetX = this.pathfinder.getTargetX();

        // If barrier is at the target X position
        if (barrier.getWorldX() < playerX) {
            // We're on the wrong side - need to traverse back
            if (Players.getLocal().isMoving()) {
                return false;
            }

            // Check if we've passed the target
            if (playerX >= targetX) {
                return false;
            }

            // Look for passage to go through
            TileObject passage = TileObjects.getNearest(tile -> tile.getName().equals("Passage"));
            if (passage != null && Math.abs(passage.getWorldX() - targetX) <= 2) {
                passage.interact("Quick-pass");
                return true;
            }

            // Look for platform to jump to
            TileObject platform = TileObjects.getNearest("Platform");
            if (platform != null &&
                platform.getWorldX() < targetX &&
                Math.abs(platform.getWorldX() - targetX) <= 4) {
                platform.interact("Jump-to");
                return true;
            }

            return false;
        }

        // We're on the correct side of the barrier
        barrier.interact("Crawl-through");
        return true;
    }

    /**
     * Returns the target X coordinate for pathfinding.
     */
    @Override
    public int getTargetX() {
        return this.pathfinder.getTargetX() + 1;
    }
}
