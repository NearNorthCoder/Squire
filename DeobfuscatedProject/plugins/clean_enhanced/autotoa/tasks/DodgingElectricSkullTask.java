/*
 * Decompiled with CFR 0.152.
 *
 * Dodging Electric Skull Task - Handles dodging electric skull projectiles
 * Electric skulls spawn at specific graphics locations and explode after a delay
 * This task detects skull spawns and moves the player to a safe adjacent tile
 * Appears in Akkha encounter
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Dodging electric skull", priority=30, blocking=true, register=true)
public class DodgingElectricSkullTask extends KephriManager {

    // Graphics IDs for electric skull
    private static final int ELECTRIC_SKULL_SPAWN_GRAPHIC = 29687;  // -(0xFFFF9EDB & 0x7B75) & (0xFFFF9FFF & 0x7FF7)
    private static final int ELECTRIC_SKULL_IMPACT_GRAPHIC = 31422; // 0xFFFF8DD7 & 0x7ABE

    // Constants
    private static final int FALSE = 0;
    private static final int TRUE = 1;
    private static final int DANGER_RADIUS = 4;
    private static final int SAFE_SEARCH_AREA = 3;
    private static final int MOVE_OFFSET = -1;
    private static final int TILE_COUNT = 2;
    private static final int SKULL_LIFETIME_TICKS = 5;  // 0xA3 ^ 0xA5 ^ 3

    private WorldPoint electricSkullLocation;
    private int skullExpiryTick;

    @Inject
    protected DodgingElectricSkullTask(Client client, AutotoaPlugin plugin, TOAConfig config) {
        super(client, plugin, config);
    }

    /**
     * Listen for electric skull graphics spawning
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated event) {
        WorldPoint graphicsLocation = WorldPoint.fromLocal(this.client, event.getGraphicsObject().getLocation());

        // Skull spawn graphic - mark location and set expiry
        if (event.getGraphicsObject().getId() == ELECTRIC_SKULL_SPAWN_GRAPHIC) {
            if (graphicsLocation.distanceTo(Players.getLocal().getWorldLocation()) > DANGER_RADIUS) {
                return;
            }
            this.electricSkullLocation = graphicsLocation;
            this.skullExpiryTick = this.client.getTickCount() + SKULL_LIFETIME_TICKS;
            return;
        }

        // Impact graphic - skull has exploded, clear location
        if (event.getGraphicsObject().getId() == ELECTRIC_SKULL_IMPACT_GRAPHIC &&
            graphicsLocation.equals(this.electricSkullLocation)) {
            this.electricSkullLocation = null;
        }
    }

    @Override
    public void reset() {
        super.reset();
        this.electricSkullLocation = null;
    }

    @Override
    public ConfigStorageBox<EquipmentSetup> getEquipmentSetup() {
        return null;
    }

    /**
     * Main task validation logic
     * Moves player to adjacent safe tile when electric skull detected
     */
    @Override
    public boolean validate() {
        // No active skull or skull expired
        if (this.electricSkullLocation == null || this.client.getTickCount() > this.skullExpiryTick) {
            this.electricSkullLocation = null;
            return false;
        }

        int distanceToSkull = this.electricSkullLocation.distanceTo(Players.getLocal().getWorldLocation());

        // Already safe distance from skull
        if (distanceToSkull == TRUE || distanceToSkull > DANGER_RADIUS) {
            return true;
        }

        // Trigger prayer switch delay
        this.primarySleeper.sleep(59);  // 0x4D ^ 0x57 ^ (0xB ^ 0x32)

        // First try: Find adjacent safe tile
        WorldPoint adjacentSafeTile = this.findAdjacentSafeTile();

        if (adjacentSafeTile == null) {
            // Second try: Find any safe tile in nearby area
            adjacentSafeTile = this.findNearbySafeTile();
        }

        if (adjacentSafeTile == null) {
            return false;
        }

        Movement.setDestination(adjacentSafeTile);
        return true;
    }

    /**
     * Find a safe tile adjacent to the skull location (cardinal directions)
     */
    private WorldPoint findAdjacentSafeTile() {
        WorldPoint[] adjacentTiles = new WorldPoint[DANGER_RADIUS];
        adjacentTiles[0] = this.electricSkullLocation.dx(SAFE_SEARCH_AREA);
        adjacentTiles[1] = this.electricSkullLocation.dx(TRUE);
        adjacentTiles[2] = this.electricSkullLocation.dy(SAFE_SEARCH_AREA);
        adjacentTiles[3] = this.electricSkullLocation.dy(TRUE);

        return Stream.of(adjacentTiles)
            // Not the skull location itself
            .filter(tile -> !tile.equals(this.electricSkullLocation))
            // Not inside boss area
            .filter(tile -> !this.getFinalWarden().getWorldArea().contains(tile))
            // Walkable
            .filter(Reachable::isWalkable)
            // Closest to player
            .min(Comparator.comparingDouble(tile -> tile.distanceToHypotenuse(Players.getLocal().getWorldLocation())))
            .orElse(null);
    }

    /**
     * Find any safe tile in nearby area (fallback if no adjacent tiles work)
     */
    private WorldPoint findNearbySafeTile() {
        return Players.getLocal().getWorldLocation().createWorldArea(SAFE_SEARCH_AREA).toWorldPointList().stream()
            // Must be farther from skull than current position
            .filter(tile -> tile.distanceTo(this.electricSkullLocation) > DANGER_RADIUS)
            // Walkable
            .filter(Reachable::isWalkable)
            // Closest to player
            .min(Comparator.comparingInt(tile -> tile.distanceTo(Players.getLocal())))
            .orElse(null);
    }
}
