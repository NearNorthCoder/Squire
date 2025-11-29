/*
 * Deobfuscated TOA State Manager
 * Tracks state during TOA raids - projectiles, objects, positions
 */
package gg.squire.autotoa.tasks;

import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.GroundObject;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import java.util.*;

/**
 * Manages state tracking for TOA raids.
 *
 * Tracks:
 * - Ground objects (poison tiles, damage tiles)
 * - Projectiles (boss attacks, mechanics)
 * - Game objects (puzzle elements, boss mechanics)
 * - World points (safe spots, paths)
 * - Tick-based timing for mechanics
 */
@Singleton
public class TOAStateManager {

    /** Puzzle tile object IDs */
    private static final int PUZZLE_TILE_START = 45348;
    private static final int PUZZLE_TILE_END = 45356;

    /** Match puzzle tile range */
    private static final int MATCH_TILE_START = 45340;
    private static final int MATCH_TILE_END = 45348;

    /** Danger tile object ID */
    private static final int DANGER_TILE_ID = 45384;

    /** Boulder path object ID */
    private static final int BOULDER_PATH_ID = 45379;

    /** Lightning graphic ID */
    private static final int LIGHTNING_GRAPHIC = 45392;

    /** Client reference */
    private final Client client;

    /** Map of ground objects to their spawn tick */
    private final Map<GroundObject, Integer> groundObjectTicks;

    /** Set of active danger ground objects */
    private final Set<GroundObject> dangerGroundObjects;

    /** Queue of path positions (for boulder dash, etc.) */
    private final Queue<WorldPoint> pathQueue;

    /** List of active projectiles (boss attacks) */
    private final List<Projectile> activeProjectiles;

    /** List of tracked projectiles (for prediction) */
    private final List<Projectile> trackedProjectiles;

    /** Set of active puzzle tiles */
    private final Set<GroundObject> puzzleTiles;

    /** List of safe positions */
    private final List<WorldPoint> safePositions;

    /** Map of match puzzle tiles */
    private final Map<GroundObject, Integer> matchPuzzleTiles;

    /** Map of pressure plate tiles */
    private final Map<GroundObject, Integer> pressurePlateTiles;

    /** Set of active game objects (boss mechanics) */
    private final Set<GameObject> activeGameObjects;

    /** Tick when last action was taken */
    private int lastActionTick;

    /** Tick when path was last updated */
    private int lastPathUpdateTick;

    /** Tick when puzzle state changed */
    private int puzzleStateTick;

    /** Whether currently using melee gear */
    private boolean usingMeleeGear;

    @Inject
    public TOAStateManager(Client client) {
        this.client = client;
        this.groundObjectTicks = new HashMap<>();
        this.dangerGroundObjects = new HashSet<>();
        this.pathQueue = new LinkedList<>();
        this.activeProjectiles = new ArrayList<>();
        this.trackedProjectiles = new ArrayList<>();
        this.puzzleTiles = new HashSet<>();
        this.safePositions = new ArrayList<>();
        this.matchPuzzleTiles = new HashMap<>();
        this.pressurePlateTiles = new HashMap<>();
        this.activeGameObjects = new HashSet<>();
    }

    /**
     * Reset state for new raid
     */
    public void reset() {
        groundObjectTicks.clear();
        dangerGroundObjects.clear();
        pathQueue.clear();
        activeProjectiles.clear();
        trackedProjectiles.clear();
        puzzleTiles.clear();
        safePositions.clear();
        matchPuzzleTiles.clear();
        pressurePlateTiles.clear();
        activeGameObjects.clear();
        lastActionTick = 0;
        lastPathUpdateTick = 0;
        puzzleStateTick = 0;
    }

    // ========== Event Handlers ==========

    @Subscribe
    public void onGameObjectSpawned(GameObjectSpawned event) {
        int currentTick = client.getTickCount();
        GameObject gameObject = event.getGameObject();

        // Track boulder path objects
        if (gameObject.getId() == BOULDER_PATH_ID) {
            if (currentTick - lastPathUpdateTick > 5) {
                pathQueue.clear();
            }
            lastPathUpdateTick = currentTick;
            pathQueue.add(gameObject.getTile().getWorldLocation());
        }

        // Track danger tiles
        if (gameObject.getId() == DANGER_TILE_ID && puzzleStateTick != currentTick) {
            puzzleStateTick = currentTick;
            safePositions.clear();
        }

        // Track lightning graphics
        if (gameObject.getId() == LIGHTNING_GRAPHIC) {
            activeGameObjects.add(gameObject);
        }

        // Remove overlapping ground objects
        Iterator<GroundObject> iter = matchPuzzleTiles.keySet().iterator();
        while (iter.hasNext()) {
            GroundObject obj = iter.next();
            if (obj.getWorldLocation().equals(gameObject.getWorldLocation())) {
                iter.remove();
                break;
            }
        }

        iter = pressurePlateTiles.keySet().iterator();
        while (iter.hasNext()) {
            GroundObject obj = iter.next();
            if (obj.getWorldLocation().equals(gameObject.getWorldLocation())) {
                iter.remove();
                break;
            }
        }
    }

    @Subscribe
    public void onGroundObjectSpawned(GroundObjectSpawned event) {
        GroundObject groundObject = event.getGroundObject();
        int objectId = groundObject.getId();

        // Track puzzle tiles
        if (objectId >= PUZZLE_TILE_START && objectId <= PUZZLE_TILE_END) {
            groundObjectTicks.put(groundObject, calculateTileValue(objectId));
        }

        // Track danger tiles
        if (objectId == PUZZLE_TILE_START) {
            puzzleTiles.add(groundObject);
        }

        // Track match puzzle tiles
        if (objectId >= MATCH_TILE_START && objectId < PUZZLE_TILE_START) {
            matchPuzzleTiles.put(groundObject, 5 + objectId - MATCH_TILE_START);
        }

        // Track pressure plates
        if (objectId >= PUZZLE_TILE_START && objectId < PUZZLE_TILE_END) {
            pressurePlateTiles.put(groundObject, 5 + objectId - PUZZLE_TILE_START);
        }
    }

    @Subscribe
    public void onGroundObjectDespawned(GroundObjectDespawned event) {
        GroundObject groundObject = event.getGroundObject();
        groundObjectTicks.remove(groundObject);
        dangerGroundObjects.remove(groundObject);
        puzzleTiles.remove(groundObject);
        matchPuzzleTiles.remove(groundObject);
        pressurePlateTiles.remove(groundObject);
    }

    @Subscribe
    public void onGameObjectDespawned(GameObjectDespawned event) {
        activeGameObjects.remove(event.getGameObject());
    }

    @Subscribe
    public void onProjectileSpawned(ProjectileSpawned event) {
        activeProjectiles.add(event.getProjectile());
    }

    @Subscribe
    public void onProjectileMoved(ProjectileMoved event) {
        // Track projectile movement for prediction
        Projectile projectile = event.getProjectile();
        if (!trackedProjectiles.contains(projectile)) {
            trackedProjectiles.add(projectile);
        }
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        // Clean up expired projectiles
        activeProjectiles.removeIf(p -> p.getRemainingCycles() <= 0);
        trackedProjectiles.removeIf(p -> p.getRemainingCycles() <= 0);
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged event) {
        if (event.getGameState() == GameState.LOADING) {
            // Clear state on loading
            dangerGroundObjects.clear();
            puzzleTiles.clear();
            activeGameObjects.clear();
        }
    }

    // ========== Getters ==========

    /**
     * Get the path queue
     */
    public Queue<WorldPoint> getPathQueue() {
        return pathQueue;
    }

    /**
     * Get the last action tick
     */
    public int getLastActionTick() {
        return lastActionTick;
    }

    /**
     * Set the last action tick
     */
    public void setLastActionTick(int tick) {
        this.lastActionTick = tick;
    }

    /**
     * Get active projectiles
     */
    public List<Projectile> getActiveProjectiles() {
        return activeProjectiles;
    }

    /**
     * Get tracked projectiles
     */
    public List<Projectile> getTrackedProjectiles() {
        return trackedProjectiles;
    }

    /**
     * Get active game objects
     */
    public Set<GameObject> getActiveGameObjects() {
        return activeGameObjects;
    }

    /**
     * Get danger ground objects
     */
    public Set<GroundObject> getDangerGroundObjects() {
        return dangerGroundObjects;
    }

    /**
     * Get safe positions
     */
    public List<WorldPoint> getSafePositions() {
        return safePositions;
    }

    /**
     * Check if using melee gear
     */
    public boolean isUsingMeleeGear() {
        return usingMeleeGear;
    }

    /**
     * Set melee gear state
     */
    public void setUsingMeleeGear(boolean usingMelee) {
        this.usingMeleeGear = usingMelee;
    }

    /**
     * Get puzzle tiles
     */
    public Set<GroundObject> getPuzzleTiles() {
        return puzzleTiles;
    }

    /**
     * Get match puzzle tiles
     */
    public Map<GroundObject, Integer> getMatchPuzzleTiles() {
        return matchPuzzleTiles;
    }

    /**
     * Get pressure plate tiles
     */
    public Map<GroundObject, Integer> getPressurePlateTiles() {
        return pressurePlateTiles;
    }

    // ========== Helper Methods ==========

    /**
     * Calculate tile value from object ID
     */
    private int calculateTileValue(int objectId) {
        return objectId - PUZZLE_TILE_START;
    }

    /**
     * Find nearest safe position
     */
    public WorldPoint findNearestSafePosition(WorldPoint from) {
        return safePositions.stream()
            .min(Comparator.comparingInt(wp -> wp.distanceTo(from)))
            .orElse(null);
    }

    /**
     * Check if a position is dangerous
     */
    public boolean isPositionDangerous(WorldPoint position) {
        return dangerGroundObjects.stream()
            .anyMatch(obj -> obj.getWorldLocation().equals(position));
    }

    /**
     * Add safe position
     */
    public void addSafePosition(WorldPoint position) {
        if (!safePositions.contains(position)) {
            safePositions.add(position);
        }
    }
}
