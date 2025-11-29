/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Floor Tiles Task - Handles dodging dangerous floor tile graphics in TOA
 * This task detects graphics objects on the floor that indicate incoming damage
 * and moves the player to an adjacent safe tile
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging floor tiles", priority=105, blocking=true)
public class DodgingFloorTilesTask extends AutotoaManager {

    // Graphics IDs for floor tile warnings
    private static final int FLOOR_TILE_WARNING_GRAPHIC = 6903;  // -(0xFFFFFC1E & 0x1BF7) & (0xFFFFFDBD & 0x1FFF) = 6903

    // List of dangerous floor tile graphics that indicate damage zones
    private static final List<Integer> DANGEROUS_FLOOR_GRAPHICS = List.of(
        24447  // -(0xFFFFDFC7 & 0x7779) & (0xFFFFFFFF & 0x5F7F) = 24447
    );

    // Constants
    private static final int FALSE = 0;
    private static final int DIRECTION_OFFSET = 4;
    private static final int TRUE = 1;
    private static final int NEGATIVE_OFFSET = -1;
    private static final int TILE_COUNT = 2;
    private static final int OFFSET_THREE = 3;

    @Inject
    protected DodgingFloorTilesTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task validation logic
     * Detects dangerous floor tile graphics and moves to safety
     */
    @Override
    public boolean validate() {
        // Check if red X is enabled in config (don't dodge if player wants to tank)
        if (this.config.redX()) {
            return false;
        }

        List<WorldPoint> dangerousTiles = new ArrayList<>();
        AtomicReference<LocalPoint> warningCenter = new AtomicReference<>(null);

        // Scan all graphics objects on the ground
        this.client.getGraphicsObjects().forEach(graphicsObject -> {
            // Check if this is a dangerous floor graphic
            if (DANGEROUS_FLOOR_GRAPHICS.contains(graphicsObject.getId())) {
                dangerousTiles.add(WorldPoint.fromLocal(this.client, graphicsObject.getLocation()));
            }

            // Check if this is the warning graphic (center of attack)
            if (graphicsObject.getId() == FLOOR_TILE_WARNING_GRAPHIC) {
                warningCenter.set(graphicsObject.getLocation());
            }
        });

        // If no dangerous tiles or no warning center, nothing to dodge
        if (dangerousTiles.isEmpty() || warningCenter.get() == null) {
            return false;
        }

        WorldPoint centerPoint = WorldPoint.fromLocal(this.client, warningCenter.get());

        // Calculate the four adjacent safe tiles (cardinal directions from center)
        WorldPoint[] adjacentTiles = new WorldPoint[DIRECTION_OFFSET];
        adjacentTiles[0] = centerPoint.dx(DIRECTION_OFFSET);  // East
        adjacentTiles[1] = centerPoint.dx(NEGATIVE_OFFSET);   // West
        adjacentTiles[2] = centerPoint.dy(DIRECTION_OFFSET);  // North
        adjacentTiles[3] = centerPoint.dy(NEGATIVE_OFFSET);   // South

        // Find the closest safe tile
        WorldPoint safeTile = Stream.of(adjacentTiles)
            // Filter out dangerous tiles
            .filter(tile -> !dangerousTiles.contains(tile))
            // Only walkable tiles
            .filter(Reachable::isWalkable)
            // Closest to player
            .min(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal())))
            .orElse(null);

        if (safeTile == null) {
            return false;
        }

        Movement.setDestination(safeTile);
        return true;
    }
}
