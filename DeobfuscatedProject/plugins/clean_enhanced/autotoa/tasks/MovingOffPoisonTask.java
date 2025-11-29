package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

/**
 * Task for moving off poison splats on the ground.
 *
 * This task:
 * - Detects poison splats (ground hazards)
 * - Checks if player is standing on poison
 * - Finds safe tiles nearby
 * - Moves to closest safe tile
 */
@TaskDesc(name = "Moving off poison", priority = 30)
public class MovingOffPoisonTask extends KephriManager {
    private static final int AREA_OFFSET = 2; // Search 2 tiles around player
    private static final int MAX_HEALTH_TO_DODGE = 189; // Only dodge if health below this

    @Inject
    protected MovingOffPoisonTask(Client client, RaidStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    @Override
    public boolean shouldExecute() {
        Player player = Players.getLocal();

        // Get all poison splat locations
        Set<WorldPoint> poisonLocations = getPoisonSplats().stream()
            .map(Locatable::getWorldLocation)
            .collect(Collectors.toSet());

        // No poison on ground
        if (poisonLocations.isEmpty()) {
            return false;
        }

        // Player not standing on poison
        WorldPoint playerLocation = player.getWorldLocation();
        if (poisonLocations.stream().noneMatch(poison -> poison.equals(playerLocation))) {
            return false;
        }

        Log.info("Trying to dodge poison splats");

        // Find safe tile nearby
        WorldArea searchArea = player.getWorldArea().offset(AREA_OFFSET);
        WorldPoint safeTile = searchArea.toWorldPointList().stream()
            .filter(tile -> poisonLocations.stream().noneMatch(poison -> poison.equals(tile)))
            .min(Comparator.comparingInt(tile -> tile.distanceTo2D(playerLocation)))
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        // Find walkable path to safe tile
        WorldPoint destination = findWalkablePath(playerLocation, safeTile, tile -> {
            // Only walk on tiles without poison
            return !poisonLocations.contains(tile);
        });

        Movement.setDestination(destination);
        return true;
    }
}
