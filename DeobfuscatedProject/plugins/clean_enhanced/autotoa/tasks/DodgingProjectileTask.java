/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Projectile Task - Handles dodging projectiles during TOA encounters
 * This task moves the player away from dangerous projectile landing zones while maintaining
 * melee distance with NPCs when possible
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging projectile", priority=100, register=true, blocking=true)
public class DodgingProjectileTask extends AutotoaManager {

    // Sleeper/delay utilities
    @Inject
    protected Sleeper primarySleeper;
    @Inject
    private Sleeper secondarySleeper;
    @Inject
    private Sleeper tertiarySleeper;
    @Inject
    private Sleeper quaternarySleeper;

    // Constants
    private static final int FALSE = 0;
    private static final int PRAYER_DELAY = 48;
    private static final int TRUE = 1;
    private static final int OFFSET_SMALL = 3;
    private static final int OFFSET_LARGE = 5;

    // NPC name to check for (eggs from Kephri encounter)
    private static final String EGG_NAME = "egg";

    @Inject
    protected DodgingProjectileTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Main task execution logic
     * Checks for dangerous projectile landing zones and moves the player to safety
     * while trying to maintain combat positioning
     */
    @Override
    protected boolean validate() {
        // Get all dangerous projectile landing points
        Set<WorldPoint> dangerousZones = this.getProjectileLandingZones();

        if (dangerousZones.isEmpty()) {
            return false;
        }

        if (this.isRoomComplete()) {
            return false;
        }

        Player localPlayer = client.getLocalPlayer();

        // Check if player is standing in a dangerous zone
        if (dangerousZones.stream().noneMatch(zone -> zone.equals(localPlayer.getWorldLocation()))) {
            return false;
        }

        Actor interactingWith = localPlayer.getInteracting();
        NPC currentBoss = this.getCurrentBoss();

        if (currentBoss == null) {
            return false;
        }

        // Enable run if not already enabled
        if (!Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        // Trigger prayer switch delay
        this.primarySleeper.sleep(PRAYER_DELAY);

        WorldPoint bestTile = this.getBestTile();

        // Comparator to find closest safe tile, preferring tiles near best tile
        Comparator<WorldPoint> tileComparator = Comparator
            .comparingDouble(tile -> ((WorldPoint)tile).distanceToPath(this.client, localPlayer.getWorldLocation()))
            .thenComparing(tile -> Float.valueOf(((WorldPoint)tile).distanceTo2DHypotenuse(bestTile)));

        // If not attacking the boss or attacking something else (like eggs)
        if (interactingWith != currentBoss || interactingWith == null ||
            interactingWith.getName().toLowerCase().contains(EGG_NAME)) {

            WorldArea bossArea = currentBoss.getWorldArea();

            // Try to find a safe tile in melee distance
            Stream<WorldPoint> potentialTiles = bossArea.offset(TRUE).toWorldPointList().stream()
                .filter(tile -> !bossArea.contains(tile));

            WorldArea finalBossArea = bossArea;
            WorldPoint safeTile = potentialTiles
                .filter(finalBossArea::isInMeleeDistance)
                .filter(tile -> !dangerousZones.contains(tile))
                .filter(Reachable::isWalkable)
                .min(tileComparator)
                .orElse(null);

            // If no melee safe tile found, try slightly farther
            if (safeTile == null) {
                safeTile = bossArea.offset(OFFSET_SMALL).toWorldPointList().stream()
                    .filter(tile -> !bossArea.contains(tile))
                    .filter(tile -> !dangerousZones.contains(tile))
                    .filter(Reachable::isWalkable)
                    .min(tileComparator)
                    .orElse(null);

                // Last resort: find any safe tile near player
                if (safeTile == null) {
                    safeTile = localPlayer.getWorldArea().offset(OFFSET_LARGE).toWorldPointList().stream()
                        .filter(tile -> !bossArea.contains(tile))
                        .filter(tile -> !dangerousZones.contains(tile))
                        .filter(Reachable::isWalkable)
                        .min(tileComparator)
                        .orElse(null);

                    if (safeTile == null) {
                        return false;
                    }

                    this.quaternarySleeper.sleep(OFFSET_LARGE);
                }
            }

            Movement.setDestination(safeTile);
            return true;
        }

        // Already attacking boss - find safe tile near current target
        WorldPoint safeNearTarget = interactingWith.getWorldArea().offset(TRUE).toWorldPointList().stream()
            .filter(Reachable::isWalkable)
            .filter(tile -> !dangerousZones.contains(tile))
            .filter(tile -> interactingWith.getWorldArea().isInMeleeDistance(tile))
            .filter(tile -> !interactingWith.getWorldArea().contains(tile))
            .min(Comparator.comparingInt(tile -> tile.distanceTo(localPlayer.getWorldLocation())))
            .orElse(interactingWith.getWorldLocation());

        Movement.setDestination(safeNearTarget);

        if (!interactingWith.getWorldArea().isInMeleeDistance(safeNearTarget)) {
            this.secondarySleeper.sleep(OFFSET_SMALL);
            this.tertiarySleeper.sleep(OFFSET_SMALL);
        }

        return true;
    }
}
