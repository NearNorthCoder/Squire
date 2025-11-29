package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Queue;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Handles solving the memory puzzle in Tombs of Amascut.
 *
 * The memory puzzle requires the player to step on tiles in a specific sequence
 * shown by glowing orbs. This task navigates to each orb location in order.
 */
@TaskDesc(name="Solving memory puzzle", priority=200, blocking=true)
public class SolvingMemoryPuzzleTask extends KephriManager {

    private final MemoryPuzzleSolver puzzleSolver;

    @Inject
    protected SolvingMemoryPuzzleTask(Client client, PuzzleStateManager stateManager, TOAConfig config, MemoryPuzzleSolver solver) {
        super(client, stateManager, config);
        this.puzzleSolver = solver;
    }

    /**
     * Validates if the task should run:
     * - Checks if memory puzzle is active
     * - Verifies puzzle solution queue has data
     * - Confirms next target location exists
     */
    @Override
    public boolean validate() {
        NPC obelisk = this.getObelisk();
        if (obelisk == null) {
            return false;
        }

        Queue<WorldPoint> solutionQueue = this.puzzleSolver.getSolutionQueue();
        if (solutionQueue.isEmpty()) {
            return false;
        }

        WorldPoint nextTarget = solutionQueue.peek().toWorldPoint(this.client);
        if (nextTarget == null) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Check if we're at the target and no orb NPCs are present
        if (nextTarget.distanceTo(playerLocation) <= 1 &&
            NPCs.getAll(npc -> npc.getName() != null &&
                              npc.getName().toLowerCase().contains("orb") &&
                              npc.getWorldLocation().equals(playerLocation)).isEmpty()) {
            return true;
        }

        // Ensure run is disabled for precise movement
        if (!Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        try {
            this.walkToTarget(nextTarget);
            return true;
        } catch (NullPointerException e) {
            Log.info("Encountered NPE walking to quadrant order puzzle solution");
            e.printStackTrace();
            Movement.setDestination(nextTarget);
            return true;
        }
    }

    /**
     * Clears the puzzle solution queue when task is reset.
     */
    @Override
    public void reset() {
        this.puzzleSolver.getSolutionQueue().clear();
    }

    private static boolean isNotNull(Object obj) {
        return obj != null;
    }

    private static boolean isNull(Object obj) {
        return obj == null;
    }

    private static boolean isTrue(int value) {
        return value != 0;
    }

    private static boolean isFalse(int value) {
        return value == 0;
    }

    private static boolean lessThanOrEqual(int a, int b) {
        return a <= b;
    }

    private static boolean lessThan(int a, int b) {
        return a < b;
    }
}
