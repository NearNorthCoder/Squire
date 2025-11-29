package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles moving the player to the optimal attack position during TOA raids.
 * This task finds the best spot to attack from by considering:
 * - NPC melee distance (to avoid being hit)
 * - Walkable tiles
 * - Proximity to the raid path and target location
 * - Avoids dangerous ground markers
 */
@TaskDesc(name="Moving to best spot", priority=20)
public class MovingToBestSpotTask extends KephriManager {

    // Region coordinates for predefined safe spots
    // Region point at coordinates (34, 47, plane 0, region 14164)
    private static final RegionPoint SAFE_SPOT_1 = new RegionPoint(34, 47, 0, 14164);

    // Region point at coordinates (34, 29, plane 0, region 14164)
    private static final RegionPoint SAFE_SPOT_2 = new RegionPoint(34, 29, 0, 14164);

    // Maximum distance to move (2 tiles)
    private static final int MAX_MOVEMENT_DISTANCE = 2;

    // Tile offset for NPC area calculation
    private static final int NPC_AREA_OFFSET = 1;

    @Inject
    protected MovingToBestSpotTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig, bi.ATTACK);
    }

    @Override
    protected boolean bL() {
        Player localPlayer = Players.getLocal();
        NPC targetNPC = this.bO(); // Get the target boss NPC

        // No NPC target found, skip task
        if (targetNPC == null) {
            return false;
        }

        // Only move if we're in attack mode and not already positioned
        if (!this.bR() || this.bV()) {
            return false;
        }

        // Get dangerous ground markers to avoid
        Set<WorldPoint> dangerousGroundMarkers = this.bU();
        if (dangerousGroundMarkers.isEmpty()) {
            return false;
        }

        // Get the raid path points
        List<WorldPoint> raidPath = this.bS();
        WorldPoint targetLocation = this.bT();

        // Find the best position to attack from:
        // 1. Start with tiles adjacent to the NPC (offset by 1)
        // 2. Filter to tiles that don't contain the NPC (to avoid standing under it)
        // 3. Filter to tiles in melee distance of the NPC
        // 4. Filter to walkable tiles
        // 5. Filter to tiles that are not on the raid path
        // 6. Sort by distance to raid path, then by distance to target location
        WorldPoint bestPosition = targetNPC.getWorldArea()
            .offset(NPC_AREA_OFFSET)
            .toWorldPointList()
            .stream()
            .filter(worldPoint -> !targetNPC.getWorldArea().contains(worldPoint)) // Don't stand under NPC
            .filter(worldPoint -> targetNPC.getWorldArea().isInMeleeDistance(worldPoint)) // Stay in melee range
            .filter(Reachable::isWalkable) // Must be walkable
            .filter(worldPoint -> !raidPath.contains(worldPoint)) // Avoid raid path
            .min(Comparator
                .comparingDouble(worldPoint -> worldPoint.distanceToPath(this.cu, targetLocation)) // Closest to path
                .thenComparing(worldPoint -> worldPoint.distanceTo2DHypotenuse(targetLocation))) // Then closest to target
            .orElse(null);

        // No suitable position found or already close enough
        if (bestPosition == null || bestPosition.distanceTo2D(Players.getLocal().getWorldLocation()) <= MAX_MOVEMENT_DISTANCE) {
            return false;
        }

        // Move to the best position
        Movement.setDestination(bestPosition);
        return true;
    }
}
