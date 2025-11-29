package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/**
 * Handles moving away from dung objects during TOA boss encounters.
 * This task detects when the boss performs a dung attack (likely Akkha's dung bombs)
 * and intelligently moves the player to the safest position that:
 * - Avoids all dung objects
 * - Maintains proximity to the boss for attacking
 * - Uses predefined safe cycle points when available
 *
 * The task tracks the boss's attack animation to predict when dung will spawn
 * and calculates optimal movement paths to avoid overlapping danger zones.
 */
@TaskDesc(name="Moving away from all dung", priority=40, blocking=true, register=true)
public class MovingAwayFromAllDungTask extends AutotoaManager {

    // Boss animation ID when performing dung attack
    private static final int DUNG_ATTACK_ANIMATION = 10090;

    // Spot animation ID for dung attack indicator
    private static final int DUNG_SPOT_ANIM = 245;

    // Game object ID for spawned dung
    private static final int DUNG_OBJECT_ID = 0xB1C0; // 45504

    // Movement and timing constants
    private static final int NPC_AREA_OFFSET = 10;
    private static final int MIN_DISTANCE_FROM_BOSS = 3;

    // State tracking
    private int moveAwayCounter;
    private int lastDungAttackTick;

    @Inject
    protected MovingAwayFromAllDungTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
        this.moveAwayCounter = 0;
    }

    @Override
    public void r() {
        this.moveAwayCounter = 0;
    }

    @Override
    protected boolean bL() {
        Player localPlayer = this.cu.getLocalPlayer();
        if (localPlayer == null) {
            return false;
        }

        NPC targetNPC = this.bO();

        // Track when the boss performs dung attack animation
        if (targetNPC.getAnimation() == DUNG_ATTACK_ANIMATION) {
            this.lastDungAttackTick = this.cu.getTickCount();
        }

        // Check if player has the dung spot animation (standing in dung)
        if (!localPlayer.hasSpotAnim(DUNG_SPOT_ANIM)) {
            this.moveAwayCounter = 0;
            return false;
        }

        // Don't move if attack was too recent (still in attack animation)
        if (this.cu.getTickCount() - this.lastDungAttackTick <= 1) {
            return false;
        }

        // First try to use predefined cycle points if available
        WorldPoint cycleSafeSpot = this.bX();

        if (cycleSafeSpot == null) {
            // No cycle point available, calculate best escape position
            List<TileObject> allDungObjects = this.bM();

            cycleSafeSpot = targetNPC.getWorldArea()
                .offset(NPC_AREA_OFFSET)
                .toWorldPointList()
                .stream()
                // Must be reasonably close to boss (within 3 tiles)
                .filter(worldPoint -> this.bO().getWorldLocation().distanceTo(worldPoint) > MIN_DISTANCE_FROM_BOSS)
                // Must not be in melee distance of any dung object
                .filter(worldPoint -> allDungObjects.stream().noneMatch(dung ->
                    dung.getWorldLocation().toWorldArea().isInMeleeDistance(worldPoint)))
                // Must be walkable
                .filter(Reachable::isWalkable)
                // Prefer positions that minimize total distance to all dung objects
                .max(Comparator.comparingInt(this::v))
                .orElse(null);
        }

        if (cycleSafeSpot == null) {
            return false;
        }

        // Move to the safe position
        Movement.setDestination(cycleSafeSpot);
        this.moveAwayCounter += 1;
        return true;
    }

    /**
     * Calculates a score for a world point based on its distance from all dung objects.
     * Higher scores indicate safer positions (farther from all dung).
     *
     * @param worldPoint The position to evaluate
     * @return Distance score (higher is safer), or MAX_VALUE if no dung nearby
     */
    private int v(WorldPoint worldPoint) {
        NPC targetNPC = this.bO();

        // Find the nearest dung object in melee range of the boss
        TileObject nearestDungToNPC = TileObjects.getNearest(worldPoint, tileObject ->
            tileObject.getId() == DUNG_OBJECT_ID &&
            targetNPC.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation())
        );

        if (nearestDungToNPC == null) {
            return Integer.MAX_VALUE;
        }

        // Find another dung object to calculate path distance
        TileObject secondDung = TileObjects.getNearest(worldPoint, tileObject ->
            tileObject.getId() == DUNG_OBJECT_ID &&
            targetNPC.getWorldArea().isInMeleeDistance(tileObject.getWorldLocation()) &&
            tileObject != nearestDungToNPC
        );

        if (secondDung == null) {
            // Only one dung object, return simple distance
            return worldPoint.distanceTo(nearestDungToNPC.getWorldLocation());
        }

        // Multiple dung objects - return combined distance
        return worldPoint.distanceTo(nearestDungToNPC.getWorldLocation()) +
               worldPoint.distanceTo(secondDung.getWorldLocation());
    }

    /**
     * Checks predefined cycle points to find the next safe position.
     * Cycles through the eN list of positions, moving to the next point
     * in sequence from the player's current location.
     *
     * @return Next safe cycle point, or null if none available
     */
    private WorldPoint bX() {
        int minDistance = Integer.MAX_VALUE;
        Point closestCyclePoint = null;

        // Find the cycle point we're currently at or closest to
        Iterator<Point> iterator = eN.iterator();
        while (iterator.hasNext()) {
            Point cyclePoint = iterator.next();
            WorldPoint cycleWorld = this.a(cyclePoint);
            WorldPoint playerLocation = Players.getLocal().getWorldLocation();

            // If we're exactly at a cycle point, move to the next one
            if (playerLocation.equals(cycleWorld)) {
                int nextIndex = (eN.indexOf(cyclePoint) + 1) % eN.size();
                return this.a(eN.get(nextIndex));
            }

            // Track the closest cycle point
            int distance = playerLocation.distanceTo(cycleWorld);
            if (distance < minDistance) {
                minDistance = distance;
                closestCyclePoint = cyclePoint;
            }
        }

        // Move to the next point after the closest one
        if (closestCyclePoint == null) {
            return null;
        }

        int nextIndex = (eN.indexOf(closestCyclePoint) + 1) % eN.size();
        return this.a(eN.get(nextIndex));
    }

    /**
     * Listens for dung game objects spawning.
     * This can be used to track dung spawn events if needed.
     */
    @Subscribe
    public void b(GameObjectSpawned gameObjectSpawned) {
        if (gameObjectSpawned.getGameObject().getId() == DUNG_OBJECT_ID) {
            // Dung has spawned - task will handle movement in next tick
        }
    }
}
