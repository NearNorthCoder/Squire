package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;

/**
 * Handles moving the player to the center position during TOA raid encounters.
 * This task is activated when the player needs to reposition to the center
 * of the arena, typically for mechanics that require central positioning or
 * when using special attacks.
 *
 * The task ensures:
 * - Player is not in spec mode
 * - Special attack is not enabled
 * - There are enemies present in the arena
 * - The center position is safe and accessible
 */
@TaskDesc(name="Moving to center", priority=30)
public class MovingToCenterTask extends KephriManager {

    // Center position of the arena at region coordinates (29, 47, plane 0, region 15809)
    private static final RegionPoint CENTER_POSITION = new RegionPoint(29, 47, 0, 15809);

    // Maximum distance to consider "at center" (2 tiles)
    private static final int CENTER_PROXIMITY_THRESHOLD = 2;

    @Inject
    protected MovingToCenterTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig, ZebakPhase.ATTACK);
    }

    @Override
    protected boolean shouldExecute() {
        // Don't move to center if in spec mode or special attack is enabled
        if (this.isInSpecMode() && !Combat.isSpecEnabled()) {
            return false;
        }

        // Don't run if there are no enemies
        if (this.getEnemies().isEmpty()) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Find the closest center position instance
        // (there may be multiple instances in multi-area raids)
        WorldPoint centerWorld = WorldPoint.toLocalInstance(this.client, CENTER_POSITION.toWorld())
            .stream()
            .min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo2D(playerLocation)))
            .orElse(null);

        // No valid center position found
        if (centerWorld == null) {
            return false;
        }

        // Already at or very close to center, and aligned on X-axis
        if (centerWorld.distanceTo(playerLocation) <= CENTER_PROXIMITY_THRESHOLD &&
            playerLocation.getWorldX() >= centerWorld.getWorldX()) {
            return false;
        }

        // Get the current target NPC
        NPC targetNPC = this.getTargetNPC();
        if (targetNPC == null) {
            return false;
        }

        // Don't move if the center position is dangerous
        if (!this.isSafePosition(centerWorld)) {
            return false;
        }

        // Move to the center position
        // Uses the movement helper method with a callback
        this.moveToPosition(centerWorld, this::onMovementComplete);
        return true;
    }
}
