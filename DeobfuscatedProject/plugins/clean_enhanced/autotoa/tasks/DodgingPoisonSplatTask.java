/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Poison Splat Task - Handles dodging poison splat attacks in TOA
 * This task detects poison splats on the ground and moves the player to a safe location
 * Poison splats commonly appear in Ba-Ba and Akkha encounters
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging poison splat", priority=160)
public class DodgingPoisonSplatTask extends KephriManager {

    // Constants
    private static final int FALSE = 0;
    private static final int AREA_OFFSET = 12;
    private static final int TRUE = 1;
    private static final int MAX_DISTANCE = 4;
    private static final int LARGE_OFFSET = 8;
    private static final int TILE_SIZE = 2;

    // Log message
    private static final String LOG_MESSAGE = "Trying to dodge poison splats";

    @Inject
    protected DodgingPoisonSplatTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Checks for poison splats and moves the player to safety
     */
    @Override
    public boolean validate() {
        Player localPlayer = Players.getLocal();
        List<WorldPoint> poisonSplatLocations = this.getPoisonSplatLocations();

        if (poisonSplatLocations.isEmpty()) {
            return false;
        }

        // Check if player is standing on a poison splat
        if (poisonSplatLocations.stream().noneMatch(splat -> splat.equals(localPlayer.getWorldLocation()))) {
            return false;
        }

        Log.info(LOG_MESSAGE);

        // Create area around player to search for safe tiles
        WorldArea searchArea = localPlayer.getWorldArea().offset(AREA_OFFSET);

        // Find the best safe tile to move to
        WorldPoint safeTile = searchArea.toWorldPointList().stream()
            // Filter out tiles with poison splats
            .filter(tile -> poisonSplatLocations.stream().noneMatch(splat -> splat.equals(tile)))
            // Only consider walkable tiles
            .filter(Reachable::isWalkable)
            // Filter by distance to current boss
            .filter(tile -> tile.distanceTo(this.getCurrentBoss()) > MAX_DISTANCE)
            // Find closest tile to player
            .min(Comparator.comparingInt(tile -> tile.distanceTo2D(localPlayer.getWorldLocation())))
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        // Get tile objects (obstacles)
        List<TileObject> obstacles = this.getTileObstacles();

        // Find safe path to destination, avoiding obstacles and poison
        WorldPoint destination = this.findSafePath(
            localPlayer.getWorldLocation(),
            safeTile,
            tile -> {
                // Tile is safe if it has no obstacles and no poison
                boolean noObstacles = obstacles.stream().noneMatch(obstacle ->
                    tile.equals(obstacle.getWorldLocation()));
                boolean noPoison = !poisonSplatLocations.contains(tile);
                return noObstacles && noPoison;
            }
        );

        Movement.setDestination(destination);
        return true;
    }
}
