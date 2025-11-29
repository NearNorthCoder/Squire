/*
 * Deobfuscated TOA Akkha Attack Task
 * Handles attacking Akkha during the fight including death tile avoidance
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Task for attacking Akkha while avoiding death tiles.
 *
 * Akkha mechanics handled:
 * - Death tile quadrant avoidance (based on orientation)
 * - Form-specific gear swapping
 * - Safe positioning for melee/ranged combat
 * - Final phase special attack gear
 */
@TaskDesc(name = "Attacking Akkha")
public class AttackingAkkhaTask extends TOATaskBase {

    /** Akkha NPC ID (unstable form that creates death tiles) */
    private static final int AKKHA_UNSTABLE_ID = 11792;

    /** Akkha memory orb NPC ID */
    private static final int MEMORY_ORB_ID = 11796;

    /** Maximum death tile check distance */
    private static final int DEATH_TILE_RANGE = 4;

    /** Angle divisions for quadrant calculation (8 directions) */
    private static final int ANGLE_DIVISIONS = 256;

    /** Reference to memory orb manager */
    private final TOAStateManager stateManager;

    /** Last tick we attacked */
    private int lastAttackTick;

    @Inject
    protected AttackingAkkhaTask(Client client, TOAStateManager stateManager, TOAConfig config) {
        super(client, stateManager, config);
        this.stateManager = stateManager;
    }

    /**
     * Calculate death tile positions based on Akkha's orientation
     * Death tiles spawn in 4 directions based on where Akkha is facing
     */
    private List<WorldPoint> calculateDeathTilePositions() {
        List<WorldPoint> deathTiles = new ArrayList<>();
        NPC[] orbs = NPCs.getAll(MEMORY_ORB_ID).toArray(new NPC[0]);

        for (NPC orb : orbs) {
            WorldPoint orbLocation = orb.getWorldLocation();
            if (orbLocation == null) {
                continue;
            }

            Angle angle = new Angle(orb.getOrientation());
            int direction = (angle.getAngle() + 2) / ANGLE_DIVISIONS;

            // Add death tiles based on direction (0-7 for 8 cardinal/diagonal directions)
            for (int distance = 1; distance < DEATH_TILE_RANGE; distance++) {
                WorldPoint deathTile = calculateTileInDirection(orbLocation, direction, distance);
                if (deathTile != null) {
                    deathTiles.add(deathTile);
                }
            }
        }

        return deathTiles;
    }

    /**
     * Calculate a tile position in a specific direction
     */
    private WorldPoint calculateTileInDirection(WorldPoint origin, int direction, int distance) {
        switch (direction) {
            case 0: // North
                return origin.dy(-distance);
            case 1: // Northeast
                return origin.dy(distance).dx(-distance);
            case 2: // East
                return origin.dx(-distance);
            case 3: // Southeast
                return origin.dx(-distance).dy(distance);
            case 4: // South
                return origin.dy(distance);
            case 5: // Southwest
                return origin.dy(distance).dx(distance);
            case 6: // West
                return origin.dx(distance);
            case 7: // Northwest
                return origin.dx(distance).dy(-distance);
            default:
                return null;
        }
    }

    @Override
    protected boolean execute() {
        // Check if we should skip (e.g., during special mechanics)
        if (shouldSkipAttack()) {
            return false;
        }

        NPC akkha = findAkkha();
        if (akkha == null) {
            return false;
        }

        // Check if Akkha is transitioning (shouldn't attack)
        if (isAkkhaTransitioning(akkha)) {
            return false;
        }

        // If using melee gear and not in melee range, check for special conditions
        if (stateManager.isUsingMeleeGear() &&
            getEquippedGear() == config.meleeGearAkkha() &&
            !akkha.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) &&
            !shouldUseMeleeNow()) {
            return false;
        }

        // Check if we're in unstable phase (death tiles active)
        boolean inUnstablePhase = akkha.getId() == AKKHA_UNSTABLE_ID;

        if (inUnstablePhase) {
            WorldPoint playerLocation = Players.getLocal().getWorldLocation();
            List<WorldPoint> deathTiles = calculateDeathTilePositions();

            // If standing on a death tile, move away
            if (deathTiles.contains(playerLocation)) {
                WorldPoint safeTile = findSafeTileNear(playerLocation, deathTiles, akkha);
                if (safeTile == null) {
                    return false;
                }
                Movement.setDestination(safeTile);
                return true;
            }

            // If not in melee range during unstable phase, find safe position
            if (!akkha.getWorldArea().isInMeleeDistance(playerLocation)) {
                WorldPoint safeTile = findSafeTileNear(playerLocation, deathTiles, akkha);
                if (safeTile == null) {
                    return false;
                }
                Movement.setDestination(safeTile);
                return true;
            }
        }

        // Set appropriate attack speed based on phase
        int attackSpeed = inUnstablePhase ? 8 : 45;
        plugin.setAttackSpeed(attackSpeed);

        // Swap gear if needed
        swapGearIfNeeded(inUnstablePhase);

        // Attack Akkha
        akkha.interact("Attack");

        // Track melee attack timing
        if (akkha.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation())) {
            lastAttackTick = client.getTickCount();
        }

        return true;
    }

    /**
     * Find a safe tile near the player that avoids death tiles
     */
    private WorldPoint findSafeTileNear(WorldPoint playerLocation, List<WorldPoint> deathTiles, NPC akkha) {
        return playerLocation.createWorldArea(2).toWorldPointList().stream()
            .filter(tile -> !deathTiles.contains(tile))
            .filter(Reachable::isWalkable)
            .min(Comparator.comparingInt(tile -> tile.distanceTo((Locatable) akkha)))
            .orElse(null);
    }

    /**
     * Find Akkha NPC
     */
    private NPC findAkkha() {
        return NPCs.getNearest("Akkha", "Akkha's Shadow");
    }

    /**
     * Check if Akkha is transitioning between phases
     */
    private boolean isAkkhaTransitioning(NPC akkha) {
        // Akkha transitions when health reaches certain thresholds
        return stateManager.isAkkhaTransitioning();
    }

    /**
     * Get final phase special gear if applicable
     */
    public ConfigStorageBox<EquipmentSetup> getFinalPhaseGear() {
        if (shouldUseFinalSpec()) {
            return config.akkhaFinalSpec();
        }
        return null;
    }

    /**
     * Check if we should use final spec gear
     */
    private boolean shouldUseFinalSpec() {
        // Check if in final phase and should spec
        return stateManager.isAkkhaFinalPhase();
    }

    /**
     * Swap gear based on current phase
     */
    private void swapGearIfNeeded(boolean unstable) {
        // Implementation handles gear swapping logic
    }

    /**
     * Check if we should skip attacking this tick
     */
    private boolean shouldSkipAttack() {
        return false;
    }

    /**
     * Check if we should use melee now
     */
    private boolean shouldUseMeleeNow() {
        return stateManager.shouldUseMeleeAkkha();
    }

    /**
     * Get currently equipped gear setup
     */
    private ConfigStorageBox<EquipmentSetup> getEquippedGear() {
        return null; // Actual implementation checks inventory
    }

    /** Reference to main plugin */
    @Inject
    private SquireAutoTOA plugin;
}
