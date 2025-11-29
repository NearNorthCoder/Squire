/*
 * Decompiled with CFR 0.152.
 *
 * Avoiding Blood Cloud Task - Handles avoiding blood cloud attacks
 * Blood clouds chase the player and deal damage if they catch up
 * This task moves the player away from the cloud to maintain distance
 * Appears in various TOA encounters
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Avoiding Blood Cloud", priority=15, blocking=true)
public class AvoidingBloodCloudTask extends KephriManager {

    // Constants
    private static final int FALSE = 0;
    private static final int MIN_SAFE_DISTANCE = 2;
    private static final int SEARCH_AREA_SIZE = 3;
    private static final int TRUE = 1;

    @Inject
    protected AvoidingBloodCloudTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects blood cloud NPC and moves player to maintain safe distance
     */
    @Override
    protected boolean validate() {
        NPC bloodCloud = this.getBloodCloud();

        if (bloodCloud == null) {
            return false;
        }

        Player localPlayer = Players.getLocal();

        // If already at safe distance, no need to move
        if (bloodCloud.distanceTo(localPlayer) > MIN_SAFE_DISTANCE) {
            return false;
        }

        // Find tile that's far from blood cloud
        WorldArea searchArea = localPlayer.getWorldArea().offset(SEARCH_AREA_SIZE);

        WorldPoint safeTile = searchArea.toWorldPointList().stream()
            // Filter safe tiles (not occupied by obstacles)
            .filter(tile -> !this.isTileOccupied(tile))
            // Only walkable tiles
            .filter(Reachable::isWalkable)
            // Find tile farthest from blood cloud
            .max(Comparator.comparingDouble(tile -> tile.distanceTo2DHypotenuse(bloodCloud.getWorldLocation())))
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        // Path to safe tile
        WorldPoint destination = this.findSafePath(localPlayer.getWorldLocation(), safeTile);

        Movement.setDestination(destination);
        return true;
    }
}
