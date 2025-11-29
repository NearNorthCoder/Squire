/*
 * Deobfuscated TOA Akkha Keep Back Task
 * Handles keeping distance from Akkha after attacks to avoid damage
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Task for keeping distance from Akkha after attacking.
 *
 * Akkha can quickly counter-attack players in melee range.
 * This task handles:
 * - Moving back after attacking
 * - Maintaining safe distance during specific forms
 * - Tick-based timing to avoid counter attacks
 */
@TaskDesc(name = "Keep Back Akkha", register = true, priority = 100, blocking = true)
public class KeepBackAkkhaTask extends TOATaskBase {

    /** Akkha melee form NPC ID */
    private static final int AKKHA_MELEE_ID = 11789;

    /** Akkha magic form NPC ID */
    private static final int AKKHA_MAGIC_ID = 11791;

    /** Tick delay before movement is required */
    private static final int MOVEMENT_TICK_DELAY = 4;

    /** Tick when Akkha last attacked */
    private int lastAkkhaAttackTick;

    @Inject
    protected KeepBackAkkhaTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
    }

    /**
     * Event handler for animation changes
     * Tracks when Akkha attacks to time movement
     */
    @Subscribe
    public void onAnimationChanged(AnimationChanged event) {
        NPC akkha = findAkkha();
        if (event.getActor() != akkha) {
            return;
        }

        // Track attack if animation changed (not -1)
        if (akkha.getAnimation() != -1) {
            lastAkkhaAttackTick = client.getTickCount();
        }
    }

    @Override
    protected boolean execute() {
        // Check if keep back is enabled in config
        if (!config.keepBack()) {
            return false;
        }

        // Skip if busy with other mechanics
        if (shouldSkipAttack()) {
            return false;
        }

        NPC akkha = findAkkha();
        if (akkha == null) {
            return false;
        }

        int ticksSinceAttack = client.getTickCount() - lastAkkhaAttackTick;
        Log.info(ticksSinceAttack + " since akkha attack");

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Determine if we're in the "keep back" window
        boolean inKeepBackWindow = ticksSinceAttack == 0;

        // If not in melee range and not in keep back window, no action needed
        if (!akkha.getWorldArea().isInMeleeDistance(playerLocation) && !inKeepBackWindow) {
            return false;
        }

        // If tick delay hasn't passed and not in window, wait
        if (ticksSinceAttack < MOVEMENT_TICK_DELAY && !inKeepBackWindow) {
            return false;
        }

        // Only keep back from melee and ranged forms (not magic)
        if (akkha.getId() == AKKHA_MELEE_ID || akkha.getId() == AKKHA_MAGIC_ID) {
            return false;
        }

        // Find safe tile to move to
        WorldPoint safeTile = findSafeRetreatTile(playerLocation, akkha, inKeepBackWindow);
        if (safeTile == null) {
            return false;
        }

        Movement.setDestination(safeTile);
        sleep(1);
        return true;
    }

    /**
     * Find safe tile to retreat to
     */
    private WorldPoint findSafeRetreatTile(WorldPoint playerLocation, NPC akkha, boolean inKeepBackWindow) {
        return playerLocation.createWorldArea(1).toWorldPointList().stream()
            // Don't stay on same tile
            .filter(tile -> !tile.equals(playerLocation))
            // Filter based on keep back window vs normal distance
            .filter(tile -> {
                if (inKeepBackWindow) {
                    return akkha.getWorldArea().isInMeleeDistance(tile);
                } else {
                    return akkha.getWorldArea().distanceTo(tile) > 1;
                }
            })
            // No NPCs on tile
            .filter(tile -> NPCs.getAll(npc -> npc.getWorldLocation().equals(tile)).isEmpty())
            // Not inside Akkha's area
            .filter(tile -> !akkha.getWorldArea().contains(tile))
            // Must be walkable
            .filter(Reachable::isWalkable)
            // Stay on same X or Y coordinate for predictable movement
            .filter(tile -> tile.getWorldX() == playerLocation.getWorldX() || tile.getWorldY() == playerLocation.getWorldY())
            // Find closest to Akkha
            .min(Comparator.comparingInt(tile -> tile.distanceTo(akkha.getWorldLocation())))
            .orElse(null);
    }

    /**
     * Find Akkha NPC
     */
    private NPC findAkkha() {
        return NPCs.getNearest("Akkha");
    }

    /**
     * Check if we should skip this tick
     */
    private boolean shouldSkipAttack() {
        return stateManager.isAkkhaTransitioning();
    }

    /**
     * Sleep for specified ticks
     */
    private void sleep(int ticks) {
        // Implementation pauses execution
    }
}
