/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Tiles Task - Handles dodging floor tile attacks during Final Warden encounter
 * The Final Warden has multiple tile-based attacks with different patterns
 * This task identifies the attack pattern and moves the player to safety
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Dodging tiles", priority=50, blocking=true)
public class DodgingTilesTask extends AutotoaManager {

    // Animation IDs for different Warden tile attacks
    private static final int WARDEN_ANIMATION_LEFT_TILES = 9677;   // -(0x62 ^ 0x53) & (0xFFFFB5FF & 0x6FFB)
    private static final int WARDEN_ANIMATION_CENTER_TILES = 11775; // 0xFFFFF7CF & 0x2DFF
    private static final int WARDEN_ANIMATION_RIGHT_TILES = 14333;  // -(0xFFFF9EB5 & 0x737B) & (0xFFFFFFFF & 0x37FD)

    // Safe spot positions (region-relative points)
    private static final Point LEFT_SAFE_SPOT = new Point(151, 45);   // 128 + 83 - 105 + 45 ^ 17 + 20 - -21 + 78, 0x29 ^ 0xC
    private static final Point CENTER_SAFE_SPOT = new Point(36, 45);  // 0xBF ^ 0x98 ^ (0xC5 ^ 0xC2), 0x29 ^ 0xC
    private static final Point RIGHT_SAFE_SPOT = new Point(189, 45);  // 51 + 144 - 191 + 185 ^ 41 + 95 - 3 + 23, 0x29 ^ 0xC

    // Constants
    private static final int FALSE = 0;
    private static final int MIN_DISTANCE = 3;
    private static final int TILE_COUNT = 2;
    private static final int TRUE = 1;

    private boolean hasMoved;

    @Inject
    private Sleeper sleeper;

    @Inject
    protected DodgingTilesTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
        this.hasMoved = false;
    }

    /**
     * Main task validation logic
     * Detects Warden tile attacks and moves to appropriate safe spot
     */
    @Override
    public boolean validate() {
        if (!this.isFinalWardenPhase()) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();
        WorldPoint centerSafeSpot = this.toWorldPoint(CENTER_SAFE_SPOT);
        int distanceToCenter = centerSafeSpot.distanceTo(playerLocation);

        // If in enrage phase and at center, preemptively move
        if (!this.isFinalWardenPhase() && !this.isEnragePhase() && distanceToCenter > MIN_DISTANCE) {
            this.sleeper.sleep(distanceToCenter / TILE_COUNT);
            Movement.setDestination(centerSafeSpot);
            return true;
        }

        // Not in the right phase for tile dodging
        if (this.isEnragePhase() || !this.isFinalWardenPhase()) {
            return false;
        }

        // Get the safe spot based on current attack pattern
        WorldPoint targetSafeSpot = this.getSafeSpotForCurrentAttack();

        // No attack detected or already at safe spot
        if (targetSafeSpot == null || playerLocation.equals(targetSafeSpot)) {
            // If we haven't moved yet, try to move to center column
            if (!this.hasMoved) {
                WorldPoint leftSpot = this.toWorldPoint(LEFT_SAFE_SPOT);
                WorldPoint playerRow = new WorldPoint(leftSpot.getWorldX(), playerLocation.getWorldY(), playerLocation.getPlane());
                Movement.setDestination(playerRow);
                this.sleep(TRUE);
                this.hasMoved = true;
                return true;
            }
            return false;
        }

        // Move to the safe spot
        Movement.setDestination(targetSafeSpot);
        this.sleep(TRUE);
        return true;
    }

    /**
     * Determine which safe spot to move to based on Warden's attack animation
     */
    public WorldPoint getSafeSpotForCurrentAttack() {
        NPC finalWarden = this.getFinalWarden();

        if (finalWarden == null) {
            return null;
        }

        int animation = finalWarden.getAnimation();

        // Left tiles attack - move to left safe spot
        if (animation == WARDEN_ANIMATION_LEFT_TILES) {
            return this.toWorldPoint(LEFT_SAFE_SPOT);
        }

        // Center tiles attack - move to center safe spot
        if (animation == WARDEN_ANIMATION_CENTER_TILES) {
            return this.toWorldPoint(CENTER_SAFE_SPOT);
        }

        // Right tiles attack - move to right safe spot
        if (animation == WARDEN_ANIMATION_RIGHT_TILES) {
            return this.toWorldPoint(RIGHT_SAFE_SPOT);
        }

        return null;
    }

    @Override
    public void reset() {
        this.hasMoved = false;
    }
}
