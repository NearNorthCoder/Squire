/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Lightning Task - Handles dodging lightning strikes in Final Warden encounter
 * Lightning strikes appear as graphics objects that telegraph where damage will occur
 * This task tracks lightning spawns and their animation frames to find safe tiles
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging lightning", priority=50, blocking=true, register=true)
public class DodgingLightningTask extends AutotoaManager {

    // Graphics IDs for lightning strikes
    private static final int LIGHTNING_STRIKE_GRAPHIC = 15019;   // -(0xFFFFCB4D & 0x77B3) & (0xFFFFCBFF & 0x7FCB)
    private static final int LIGHTNING_WARNING_GRAPHIC = 15061;  // 0xFFFFCDB7 & 0x3ADD
    private static final int LIGHTNING_IMPACT_GRAPHIC = 31422;   // 0xFFFF8DD7 & 0x7ABE

    // Safe position during lightning phase (region-relative)
    private static final Point SAFE_POSITION = new Point(107, 37);  // 0x1C ^ 0x61 ^ (0xCC ^ 0xAE), 0x7C ^ 0x59

    // Constants
    private static final int FALSE = 0;
    private static final int TRUE = 1;
    private static final int SLEEP_DURATION = 3;
    private static final int LIGHTNING_WARNING_LIFETIME = 6;
    private static final int LIGHTNING_STRIKE_LIFETIME = 5;
    private static final int UNSAFE_THRESHOLD = 10;
    private static final int VERY_UNSAFE_THRESHOLD = 2;
    private static final int SAFE_FRAME_THRESHOLD = -1;
    private static final int SEARCH_AREA_SIZE = 2;

    // Log messages
    private static final String LOG_NOT_UNSAFE = "Not on an unsafe enough tile to have to move";
    private static final String LOG_NO_SAFE_TILE = "Not on a super unsafe tile and no good tile to move to";
    private static final String LOG_SUPER_UNSAFE = "No decent worldpoint found and we are super unsafe, finding ok tile";
    private static final String LOG_TANKING = "Tanking some damage, unavoidable";
    private static final String LOG_STAYING_PUT = "Staying where we are as it is the safest spot currently";

    private int lastMoveTick;

    @Inject
    private Sleeper sleeper;

    @Inject
    private GameStateManager gameStateManager;

    private final Map<GraphicsObject, Integer> lightningExpiry;

    @Inject
    protected DodgingLightningTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
        this.lightningExpiry = new HashMap<>();
    }

    /**
     * Listen for lightning graphics spawning
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated event) {
        GraphicsObject graphicsObject = event.getGraphicsObject();

        // Lightning strike graphic - expires in 3 ticks
        if (graphicsObject.getId() == LIGHTNING_STRIKE_GRAPHIC) {
            this.lightningExpiry.put(graphicsObject, this.client.getTickCount() + SLEEP_DURATION);
            return;
        }

        // Other lightning graphics - expire in 6 ticks
        this.lightningExpiry.put(graphicsObject, this.client.getTickCount() + LIGHTNING_WARNING_LIFETIME);
    }

    /**
     * Main task validation logic
     * Analyzes lightning patterns and moves to safest available tile
     */
    @Override
    public boolean validate() {
        if (!this.isFinalWardenPhase()) {
            return false;
        }

        HashSet<WorldPoint> veryUnsafeTiles = new HashSet<>();
        HashSet<WorldPoint> unsafeTiles = new HashSet<>();
        HashMap<WorldPoint, GraphicsObject> lightningGraphics = new HashMap<>();

        // Scan all graphics objects for lightning
        Iterator<GraphicsObject> graphicsIterator = this.client.getGraphicsObjects().iterator();
        while (graphicsIterator.hasNext()) {
            GraphicsObject graphicsObject = graphicsIterator.next();
            WorldPoint location = WorldPoint.fromLocal(this.client, graphicsObject.getLocation());

            // Warning graphic - tile will be hit soon
            if (graphicsObject.getId() == LIGHTNING_WARNING_GRAPHIC) {
                unsafeTiles.add(location);
            }

            // Active lightning strike - very dangerous
            if (graphicsObject.getId() == LIGHTNING_STRIKE_GRAPHIC && graphicsObject.getFrame() > SLEEP_DURATION) {
                veryUnsafeTiles.add(location);
            }

            // Track all lightning graphics with their current frame
            if (graphicsObject.getId() == LIGHTNING_STRIKE_GRAPHIC ||
                graphicsObject.getFrame() < LIGHTNING_STRIKE_LIFETIME) {
                lightningGraphics.put(location, graphicsObject);
            }
        }

        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        // Comparator to find safest tile (lowest frame number = safest, then closest to warden)
        Comparator<WorldPoint> safetyComparator = Comparator
            .comparingDouble(tile -> this.getLightningSafety(lightningGraphics, tile))
            .thenComparingDouble(tile -> tile.distanceToHypotenuse(this.getFinalWarden().getWorldArea().getCenter()));

        // Find best safe tile
        WorldPoint safeTile = playerLocation.createWorldArea(LIGHTNING_STRIKE_LIFETIME).toWorldPointList().stream()
            // Not on very unsafe tile
            .filter(tile -> !veryUnsafeTiles.contains(tile))
            // On same row as safe position
            .filter(tile -> this.toWorldPoint(SAFE_POSITION).getWorldY() == tile.getWorldY())
            // Walkable
            .filter(Reachable::isWalkable)
            // Find safest
            .min(safetyComparator)
            .orElse(null);

        int currentTileSafety = this.getLightningSafety(lightningGraphics, playerLocation);

        // If not on very unsafe tile and reasonably safe, stay put
        if (!veryUnsafeTiles.contains(playerLocation) && currentTileSafety <= UNSAFE_THRESHOLD) {
            Log.info(LOG_NOT_UNSAFE);
            return false;
        }

        // No good safe tile found
        if (safeTile == null) {
            if (!veryUnsafeTiles.contains(playerLocation)) {
                Log.info(LOG_NO_SAFE_TILE);
                return false;
            }

            Log.info(LOG_SUPER_UNSAFE);

            // Find any tile that's not our current location and not very unsafe
            safeTile = playerLocation.createWorldArea(LIGHTNING_STRIKE_LIFETIME).toWorldPointList().stream()
                .filter(tile -> !tile.equals(Players.getLocal().getWorldLocation()))
                .filter(tile -> !veryUnsafeTiles.contains(tile))
                .filter(tile -> this.toWorldPoint(SAFE_POSITION).getWorldY() == tile.getWorldY())
                .filter(Reachable::isWalkable)
                .min(safetyComparator)
                .orElse(null);

            if (safeTile == null) {
                Log.info(LOG_TANKING);
                return false;
            }
        }

        // If we're already at the safest spot, don't move
        if (safeTile.equals(Players.getLocal().getWorldLocation())) {
            Log.info(LOG_STAYING_PUT);
            return currentTileSafety > LIGHTNING_WARNING_LIFETIME;
        }

        Movement.setDestination(safeTile);
        this.lastMoveTick = this.client.getTickCount();
        return true;
    }

    /**
     * Get the frame of lightning at a specific tile (lower is safer)
     * Returns -1 if no lightning on tile
     */
    private int getLightningFrame(Map<WorldPoint, GraphicsObject> lightningMap, WorldPoint tile) {
        return Optional.ofNullable(lightningMap.get(tile))
            .map(GraphicsObject::getFrame)
            .orElse(SAFE_FRAME_THRESHOLD);
    }

    /**
     * Calculate safety score for a tile
     * Accounts for whether player is currently on the tile (adds penalty if so and lightning present)
     */
    private int getLightningSafety(Map<WorldPoint, GraphicsObject> lightningMap, WorldPoint tile) {
        boolean isCurrentTile = tile.equals(Players.getLocal().getWorldLocation());
        int frame = this.getLightningFrame(lightningMap, tile);

        // If on current tile and has dangerous lightning, return max danger
        if (isCurrentTile && frame >= UNSAFE_THRESHOLD) {
            return SAFE_FRAME_THRESHOLD;
        }

        return frame;
    }

    /**
     * Check if a tile is safe (no imminent lightning)
     */
    private boolean isTileSafe(Map<WorldPoint, GraphicsObject> lightningMap, WorldPoint tile) {
        return this.getLightningSafety(lightningMap, tile) < SLEEP_DURATION;
    }
}
