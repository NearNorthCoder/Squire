/*
 * Deobfuscated TOA Akkha Luring Task
 * Handles luring Akkha to specific quadrants during the fight
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Task for luring Akkha to specific quadrants during the fight.
 *
 * Akkha's room is divided into quadrants. This task handles:
 * - Moving to pull Akkha to desired quadrant
 * - Positioning for optimal damage phases
 * - Coordinating with shadow spawns
 */
@TaskDesc(name = "Luring Akkha to Quadrant")
public class LuringAkkhaToQuadrantTask extends TOATaskBase {

    /** Akkha's Shadow NPC name */
    private static final String SHADOW_NAME = "Akkha's Shadow";

    /** Number of shadows that indicates lure needed */
    private static final int SHADOW_THRESHOLD = 2;

    /** Search radius for movement tiles */
    private static final int SEARCH_RADIUS = 6;

    /** Minimum shadow distance for lure condition */
    private static final int MIN_SHADOW_DISTANCE = 6;

    /** Distance to close gap when keep back is enabled */
    private static final int KEEP_BACK_DISTANCE = 3;

    /** Reference to main plugin */
    private final SquireAutoTOA plugin;

    @Inject
    protected LuringAkkhaToQuadrantTask(Client client, TOAStateManager stateManager, TOAConfig config, SquireAutoTOA plugin) {
        super(client, stateManager, config);
        this.plugin = plugin;
    }

    @Override
    protected boolean execute() {
        // Skip if busy with other mechanics
        if (shouldSkipAttack()) {
            return false;
        }

        // Get all active shadows
        List<NPC> shadows = getActiveShadows();

        // Find main Akkha NPC
        NPC akkha = findAkkha();
        if (akkha == null) {
            return false;
        }

        // Check if we should lure based on shadow count and attack status
        if (canAttackNPC(akkha) && shadows.size() == SHADOW_THRESHOLD) {
            // Don't lure if attacking and at shadow threshold
            return false;
        }

        // Skip if melee condition met
        if (shouldSkipForMelee()) {
            return false;
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Find optimal lure tile
        WorldPoint lureTile = findOptimalLureTile(playerLocation, shadows);
        if (lureTile == null) {
            return false;
        }

        // Determine required movement distance
        int requiredDistance = canAttackNPC(akkha) ? 1 : 1;

        // Handle keep back mechanic - move towards Akkha if needed
        if (canAttackNPC(akkha) && akkha.distanceTo(playerLocation) > KEEP_BACK_DISTANCE && !config.keepBack()) {
            Movement.setDestination(akkha.getWorldLocation());
            return true;
        }

        // Check if already at optimal position
        if (playerLocation.distanceTo(lureTile) < requiredDistance) {
            return false;
        }

        // Check if all shadows are idle (animation -1)
        if (stateManager.isUsingMeleeGear() && shadows.stream().allMatch(npc -> npc.getAnimation() == -1)) {
            return true;
        }

        // Move to lure position
        plugin.setAttackSpeed(0);
        trackLurePosition(lureTile);
        return true;
    }

    /**
     * Find optimal tile to lure Akkha
     */
    private WorldPoint findOptimalLureTile(WorldPoint playerLocation, List<NPC> shadows) {
        return playerLocation.createWorldArea(SEARCH_RADIUS).toWorldPointList().stream()
            // Filter tiles with nearby shadows
            .filter(tile -> {
                NPC nearestShadow = findNearestShadow(tile);
                return nearestShadow != null && nearestShadow.distanceTo(tile) > SEARCH_RADIUS;
            })
            // Filter walkable tiles
            .filter(tile -> Reachable.isWalkable(tile.getWorldLocation()))
            // Find tile furthest from shadow (to pull Akkha)
            .max(Comparator.comparingDouble(tile -> {
                NPC shadow = findNearestShadow(tile);
                return shadow != null ? tile.distanceToHypotenuse(shadow.getWorldLocation()) : 0;
            }))
            .orElse(null);
    }

    /**
     * Find nearest shadow to a position
     */
    private NPC findNearestShadow(WorldPoint position) {
        return NPCs.getNearest(position, SHADOW_NAME);
    }

    /**
     * Get all active Akkha's Shadow NPCs
     */
    private List<NPC> getActiveShadows() {
        return NPCs.getAll(SHADOW_NAME);
    }

    /**
     * Find main Akkha NPC
     */
    private NPC findAkkha() {
        return NPCs.getNearest("Akkha");
    }

    /**
     * Track lure position
     */
    private void trackLurePosition(WorldPoint location) {
        stateManager.setLastLurePosition(location);
    }

    /**
     * Check if we should skip for melee
     */
    private boolean shouldSkipForMelee() {
        return stateManager.shouldSkipLure();
    }

    /**
     * Check if we can attack the NPC
     */
    private boolean canAttackNPC(NPC npc) {
        return npc != null && !npc.isDead();
    }

    /**
     * Check if we should skip attacking
     */
    private boolean shouldSkipAttack() {
        return stateManager.isAkkhaTransitioning();
    }
}
