/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Dung Attack Task - Handles dodging dung projectile attacks
 * Dung attacks appear in the Ba-Ba encounter where Ba-Ba throws dung
 * that lands on specific tiles and damages the player
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging dung attack", priority=8, blocking=true)
public class DodgingDungAttackTask extends KephriManager {

    // Tile object ID for dung
    private static final int DUNG_OBJECT_ID = 63944;  // 0xFFFFB7F7 & 0xF9C8

    // Constants
    private static final int FALSE = 0;
    private static final int TRUE = 1;

    @Inject
    protected DodgingDungAttackTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects dung on the ground and moves to the safest tile
     */
    @Override
    protected boolean validate() {
        if (!this.isRoomComplete()) {
            return false;
        }

        WorldPoint safeTile = this.getBestTile();

        if (safeTile == null) {
            return false;
        }

        // Helper method to log the move
        this.logMovement(TRUE);

        Movement.setDestination(safeTile);
        return true;
    }

    /**
     * Calculate the total distance from a point to all dung objects
     * Used to find the safest spot (farthest from all dung)
     */
    private int calculateDungProximityScore(WorldPoint point) {
        double totalDistance = 0.0;

        Iterator<TileObject> dungIterator = this.getDungObjects().iterator();

        while (dungIterator.hasNext()) {
            TileObject dung = dungIterator.next();
            WorldPoint dungLocation = dung.getWorldLocation();
            totalDistance += dungLocation.distanceToHypotenuse(point);
        }

        return (int) totalDistance;
    }
}
