/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Wave Task - Handles dodging wave attacks in TOA (primarily Akkha encounter)
 * This task detects when Akkha summons waves and positions the player to avoid taking damage
 * Waves move horizontally or vertically across the arena
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging wave", priority=150, blocking=true)
public class DodgingWaveTask extends KephriManager {

    // Constants
    private static final int SAFE_DISTANCE = 7;
    private static final int TRUE = 1;
    private static final int FALSE = 0;
    private static final int SAFE_DISTANCE_THRESHOLD = 64;
    private static final int MOVEMENT_OFFSET_SOUTH = -1;
    private static final int OFFSET_SMALL = 3;
    private static final int AREA_OFFSET = 6;
    private static final int MOVEMENT_OFFSET_NORTH = -2;
    private static final int ANIMATION_CHECK = 146;
    private static final int ORIENTATION_SOUTH = 33;
    private static final int PLANE = 0;

    // Safe spot to retreat to during waves
    private static final RegionPoint SAFE_RETREAT_POINT = new RegionPoint(ANIMATION_CHECK, ORIENTATION_SOUTH, PLANE, 8181);

    @Inject
    protected DodgingWaveTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config, BossType.WAVE);
    }

    /**
     * Main task validation logic
     * Detects wave NPCs and moves player to avoid being hit
     */
    @Override
    public boolean validate() {
        Player localPlayer = Players.getLocal();
        List<NPC> waveNPCs = this.getWaveNPCs();
        List<TileObject> obstacles = this.getTileObstacles();

        // Determine if waves are moving horizontally or vertically
        boolean horizontalWaves = this.areWavesHorizontal();

        NPC closestWave;
        if (horizontalWaves) {
            // Find wave closest to player on Y-axis (horizontal movement)
            closestWave = waveNPCs.stream()
                .filter(wave -> wave.getWorldY() <= localPlayer.getWorldY())
                .min(Comparator.comparingInt(wave -> wave.getWorldLocation().distanceTo2D(localPlayer.getWorldLocation())))
                .orElse(null);
        } else {
            // Find wave closest to player on X-axis (vertical movement)
            closestWave = waveNPCs.stream()
                .filter(wave -> wave.getWorldY() >= localPlayer.getWorldY())
                .min(Comparator.comparingInt(wave -> wave.getWorldLocation().distanceTo2D(localPlayer.getWorldLocation())))
                .orElse(null);
        }

        // If no wave found, check if we need to return to safe spot
        if (closestWave == null) {
            WorldPoint playerLocation = Players.getLocal().getWorldLocation();
            if (this.distanceToSafeSpot(playerLocation) > SAFE_DISTANCE) {
                this.moveToPoint(this.toWorldPoint(SAFE_RETREAT_POINT), tile -> !this.isWaveTile(obstacles, tile));
                return true;
            }
            return false;
        }

        // Filter waves that are on the same row/column as the closest wave
        waveNPCs = waveNPCs.stream()
            .filter(wave -> wave.getWorldY() == closestWave.getWorldY())
            .collect(Collectors.toList());

        NPC currentBoss = this.getCurrentBoss();
        WorldArea bossArea = currentBoss.getWorldArea();
        int bossRightEdge = bossArea.getX() + bossArea.getWidth();

        // If no waves blocking horizontally, check if we should wait
        if (waveNPCs.stream().noneMatch(wave -> wave.getWorldX() == localPlayer.getWorldX())) {
            // If too far from boss edge, wait
            if (Math.abs(bossRightEdge - localPlayer.getWorldX()) > SAFE_DISTANCE_THRESHOLD) {
                return false;
            }
        }

        // Calculate movement direction based on wave type
        int movementOffset = horizontalWaves ? TRUE : MOVEMENT_OFFSET_SOUTH;

        NPC finalClosestWave = closestWave;

        // If close to wave, move perpendicular to its movement
        if (closestWave.distanceTo(localPlayer) > OFFSET_SMALL) {
            WorldPoint currentLocation = Players.getLocal().getWorldLocation();

            // Check if all tiles in column/row are safe
            if (currentLocation.toWorldArea().offset(TRUE).toWorldPointList().stream()
                .filter(tile -> horizontalWaves ?
                    tile.getWorldX() == currentLocation.getWorldX() :
                    tile.getWorldY() == currentLocation.getWorldY())
                .allMatch(tile -> this.isTileSafe(tile) && this.distanceToSafeSpot(tile) <= SAFE_DISTANCE)) {
                return false;
            }

            // Find safe tile to move to
            List<WorldPoint> safeTiles = this.toWorldPoint(SAFE_RETREAT_POINT).toWorldArea().offset(AREA_OFFSET).toWorldPointList();
            WorldPoint safeTile = safeTiles.stream()
                // Within range of safe spot
                .filter(tile -> this.distanceToSafeSpot(tile) <= AREA_OFFSET)
                // Not in wave path
                .filter(tile -> {
                    if (horizontalWaves) {
                        return tile.getWorldY() > finalClosestWave.getWorldY();
                    } else {
                        return tile.getWorldY() < finalClosestWave.getWorldY();
                    }
                })
                // No wave on same column/row
                .filter(tile -> !this.hasWaveOnPath(obstacles, tile))
                // All adjacent tiles in line are walkable
                .filter(tile -> tile.toWorldArea().offset(TRUE).toWorldPointList().stream()
                    .filter(adjacent -> horizontalWaves ?
                        adjacent.getWorldX() == tile.getWorldX() :
                        adjacent.getWorldY() == tile.getWorldY())
                    .allMatch(Reachable::isWalkable))
                // Safe from waves
                .filter(this::isTileSafe)
                .filter(Reachable::isWalkable)
                // Closest to player
                .min(Comparator.comparingInt(tile -> tile.distanceTo(localPlayer)))
                .orElse(null);

            if (safeTile == null) {
                return false;
            }

            if (!safeTile.equals(currentLocation)) {
                this.moveToPoint(safeTile, tile -> !this.isWaveTile(obstacles, tile));
                return true;
            }
            return false;
        }

        // Very close to wave - move immediately
        if (closestWave.distanceTo(localPlayer) > TRUE) {
            return false;
        }

        if (!localPlayer.isMoving()) {
            Movement.walkTo(localPlayer.getWorldLocation().dy(movementOffset));
        } else {
            Movement.walkTo(localPlayer.getWorldLocation().dy(movementOffset * MOVEMENT_OFFSET_NORTH));
        }

        return true;
    }

    /**
     * Check if waves are moving horizontally (orientation 0) or vertically
     */
    private boolean areWavesHorizontal() {
        return this.getWaveNPCs().stream().noneMatch(wave -> wave.getOrientation() == 0);
    }

    /**
     * Calculate distance to safe retreat point
     */
    private int distanceToSafeSpot(WorldPoint point) {
        return point.distanceTo(this.toWorldPoint(SAFE_RETREAT_POINT));
    }

    /**
     * Check if there's a wave on the same path (row or column) as the tile
     */
    private boolean hasWaveOnPath(List<TileObject> obstacles, WorldPoint tile) {
        return tile.toWorldArea().offset(TRUE).toWorldPointList().stream()
            .filter(adjacent -> adjacent.getWorldX() == tile.getWorldX())
            .noneMatch(adjacent -> this.isWaveTile(obstacles, adjacent));
    }

    /**
     * Check if a tile has a wave on it
     */
    private boolean isWaveTile(List<TileObject> obstacles, WorldPoint tile) {
        return !this.isTileSafe(tile);
    }

    /**
     * Check if tile is safe (no wave)
     */
    private boolean isTileSafe(WorldPoint tile) {
        return !this.isWaveTile(null, tile);
    }
}
