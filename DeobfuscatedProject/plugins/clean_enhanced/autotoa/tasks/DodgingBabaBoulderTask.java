/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Ba-Ba Boulder Task - Handles dodging rolling boulders from Ba-Ba
 * Ba-Ba periodically rolls boulders across the arena that damage players
 * This task detects boulder paths and moves the player one tile to safety
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging ba-ba boulder", priority=101)
public class DodgingBabaBoulderTask extends KephriManager {

    // Constants
    private static final int FALSE = 0;
    private static final int BOULDER_DETECTION_RANGE = 8;  // 0x6F ^ 0x67
    private static final int TRUE = 1;

    @Inject
    protected DodgingBabaBoulderTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects if player is in path of rolling boulder and moves to safety
     */
    @Override
    public boolean validate() {
        // Don't dodge if already moving
        if (Players.getLocal().isMoving()) {
            return false;
        }

        // Check if boulder mechanics are active
        if (!this.areBabaBouldersMechanicActive()) {
            return false;
        }

        // Get all tiles in boulder paths
        Set<WorldPoint> boulderPath = this.getBoulderPathTiles(BOULDER_DETECTION_RANGE);

        if (boulderPath.isEmpty()) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // If not in boulder path, no need to dodge
        if (!boulderPath.contains(playerLocation)) {
            return false;
        }

        // Don't spam movement
        if (Players.getLocal().isMoving()) {
            return false;
        }

        // Move one tile north to dodge boulder
        WorldPoint safeTile = Stream.of(playerLocation.dy(TRUE))
            .filter(Reachable::isWalkable)
            .findFirst()
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        Movement.setDestination(safeTile);
        return true;
    }
}
