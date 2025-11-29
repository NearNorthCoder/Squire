package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles escaping from water during TOA encounters.
 * This task activates when the player needs to climb out of water, typically
 * during the Crocodile (Crondis) encounter or similar water-based mechanics.
 *
 * The task:
 * - Identifies the safe dry land position at (30, 30)
 * - Finds nearby "Rock steps" that can be climbed
 * - Navigates to the steps if in attack mode
 * - Climbs the steps to escape the water if not attacking
 */
@TaskDesc(name="Escaping water", priority=50, blocking=true)
public class EscapingWaterTask extends AutotoaManager {

    // Position to stand when escaping water (dry land)
    private static final Point DRY_LAND_POSITION = new Point(30, 30);

    // Object name for climbable steps
    private static final String ROCK_STEPS_NAME = "Rock steps";

    // Interaction action
    private static final String CLIMB_UP_ACTION = "Climb-up";

    @Inject
    protected EscapingWaterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    @Override
    public boolean bL() {
        // Get the target NPC (likely the crocodile/crondis boss)
        NPC targetNPC = this.cB();
        if (targetNPC == null) {
            return false;
        }

        // Calculate the safe dry land position
        WorldPoint dryLandWorld = this.a(DRY_LAND_POSITION);

        // Check if the dry land position is accessible
        if (!Reachable.isWalkable(dryLandWorld) || Reachable.isObstacle(dryLandWorld)) {
            return false;
        }

        // Find the nearest rock steps to climb
        TileObject rockSteps = TileObjects.getNearest(ROCK_STEPS_NAME);
        if (rockSteps == null) {
            return false;
        }

        // If we're in attack mode, move to the rock steps location
        if (this.cF() == bY.ATTACK) {
            Movement.setDestination(rockSteps.getWorldLocation());
            return true;
        }

        // Not in attack mode - climb the steps to escape water
        rockSteps.interact(CLIMB_UP_ACTION);
        return true;
    }
}
