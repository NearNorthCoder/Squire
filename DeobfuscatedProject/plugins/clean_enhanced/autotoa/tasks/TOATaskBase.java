/*
 * Deobfuscated TOA Task Base Class
 * Abstract base class for all TOA-related tasks
 */
package gg.squire.autotoa.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.autotoa.TOAConfig;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Base class for all TOA fight tasks.
 *
 * Provides common functionality:
 * - Access to state manager for fight tracking
 * - Access to client and config
 * - Room detection and validation
 * - Safe spot calculation
 * - NPC detection utilities
 */
public abstract class TOATaskBase extends Task {

    /** Kephri NPC IDs */
    protected static final int[] KEPHRI_NPC_IDS = {11721, 11722, 11723};

    /** Kephri swarm indicator graphic */
    protected static final int KEPHRI_SWARM_GRAPHIC = 2111;

    /** Whether we're currently dealing with swarms */
    protected static boolean inSwarmPhase = false;

    /** RuneLite client reference */
    protected final Client client;

    /** TOA state manager */
    protected final TOAStateManager stateManager;

    /** Plugin configuration */
    protected final TOAConfig config;

    /** Optional phase restriction for this task */
    private final KephriPhase restrictedPhase;

    /**
     * Safe positions for Kephri room (region coordinates)
     */
    protected static final List<Point> KEPHRI_SAFE_POSITIONS = List.of(
        // Row 1
        new Point(24, 28), new Point(24, 30), new Point(26, 30), new Point(28, 30),
        new Point(24, 32), new Point(26, 32), new Point(28, 32),
        new Point(24, 28), new Point(26, 28), new Point(28, 28),
        new Point(24, 26), new Point(26, 26), new Point(28, 26),
        // Row 2
        new Point(32, 36), new Point(34, 36), new Point(34, 24),
        new Point(34, 26), new Point(36, 36), new Point(36, 24),
        new Point(36, 26), new Point(38, 36), new Point(38, 24),
        new Point(38, 26), new Point(40, 36), new Point(40, 24),
        new Point(40, 26),
        // Row 3
        new Point(42, 38), new Point(42, 32), new Point(44, 32),
        new Point(40, 32), new Point(42, 34), new Point(44, 34),
        new Point(40, 34), new Point(42, 36), new Point(44, 36),
        new Point(40, 36), new Point(42, 38), new Point(44, 38),
        new Point(40, 38),
        // Row 4
        new Point(46, 44), new Point(28, 44), new Point(28, 40),
        new Point(28, 38), new Point(30, 44), new Point(30, 40),
        new Point(30, 38), new Point(32, 44), new Point(32, 40),
        new Point(32, 38), new Point(28, 44), new Point(28, 40),
        new Point(28, 38)
    );

    /**
     * Quadrant safe spots for Kephri
     */
    protected static final List<Point> KEPHRI_QUADRANT_SAFESPOTS = List.of(
        new Point(28, 28),
        new Point(32, 30),
        new Point(34, 38),
        new Point(46, 32)
    );

    /**
     * Constructor for TOA tasks
     */
    protected TOATaskBase(Client client, TOAStateManager stateManager, TOAConfig config) {
        this(client, stateManager, config, null);
    }

    /**
     * Constructor with phase restriction
     */
    protected TOATaskBase(Client client, TOAStateManager stateManager, TOAConfig config, KephriPhase restrictedPhase) {
        this.client = client;
        this.stateManager = stateManager;
        this.config = config;
        this.restrictedPhase = restrictedPhase;
    }

    /**
     * Main task entry point - validates phase before executing
     *
     * @return true if task took action, false otherwise
     */
    @Override
    public boolean run() {
        // If restricted to a phase, check current phase matches
        if (restrictedPhase != null && restrictedPhase != getCurrentKephriPhase()) {
            return true; // Skip this task
        }
        return execute();
    }

    /**
     * Get the priority for this task
     */
    @Override
    public int priority() {
        return 0;
    }

    /**
     * Determine the current Kephri phase based on nearby NPCs
     */
    public KephriPhase getCurrentKephriPhase() {
        NPC kephri = getKephriNPC();
        if (kephri == null || kephri.getId() == KEPHRI_NPC_IDS[1]) {
            inSwarmPhase = true;
            return KephriPhase.SWARM;
        }
        return KephriPhase.ATTACK;
    }

    /**
     * Get the Kephri NPC
     */
    public NPC getKephriNPC() {
        return NPCs.getNearest(KEPHRI_NPC_IDS);
    }

    /**
     * Get equipment setup for Kephri gear swap
     */
    public ConfigStorageBox<EquipmentSetup> getKephriGearSwap() {
        return config.kephriGearSwap();
    }

    /**
     * Check if a tile has a teleport crystal
     */
    public boolean hasTeleportCrystal() {
        TileObject crystal = TileObjects.getNearest("Teleport crystal");
        return crystal != null && Reachable.isInteractable(crystal);
    }

    /**
     * Use the teleport crystal to exit room
     */
    public boolean useTeleportCrystal() {
        TileObject crystal = TileObjects.getNearest("Teleport crystal");
        if (crystal == null || !Reachable.isInteractable(crystal)) {
            return false;
        }
        crystal.interact("Quick-Use");
        return true;
    }

    /**
     * Check if we're in the Scabaras (Kephri) room
     */
    public boolean isInScabarasRoom() {
        NPC scabaras = NPCs.getNearest("Scabaras", "Osmumten");
        return scabaras != null && Reachable.isInteractable(scabaras);
    }

    /**
     * Exit the current room by talking to NPC
     */
    public boolean exitRoom() {
        if (super.run()) {
            return true;
        }

        // Handle dialog
        if (Dialog.isOpen() && Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }

        NPC exitNpc = NPCs.getNearest("Scabaras", "Osmumten");
        if (exitNpc == null) {
            return false;
        }

        if (exitNpc.hasAction("Quick-leave")) {
            exitNpc.interact("Quick-leave");
            return true;
        }

        exitNpc.interact("Talk-to");
        return true;
    }

    /**
     * Check if any Kephri NPC is nearby
     */
    public boolean isKephriNearby() {
        return NPCs.getNearest(KEPHRI_NPC_IDS) != null;
    }

    /**
     * Get all Kephri room objects at a specific type
     */
    public List<TileObject> getKephriRoomObjects() {
        return TileObjects.getAll(KEPHRI_SWARM_GRAPHIC);
    }

    /**
     * Check if player has a spot animation (e.g., poison)
     */
    public boolean hasSpotAnim() {
        Player player = client.getLocalPlayer();
        return player.hasSpotAnim(KEPHRI_SWARM_GRAPHIC);
    }

    /**
     * Check if player is currently moving
     */
    public boolean isPlayerMoving() {
        WorldPoint destination = Movement.getDestination();
        Player player = Players.getLocal();

        int threshold = Movement.isRunEnabled() ? 2 : 1;

        if (destination == null || destination.distanceTo2D(player.getWorldLocation()) <= threshold) {
            return false;
        }

        return true;
    }

    /**
     * Get dangerous tile positions (fire graphics, etc.)
     */
    protected Set<WorldPoint> getDangerousTiles() {
        Set<WorldPoint> dangerous = new HashSet<>();

        for (GraphicsObject graphicsObject : client.getGraphicsObjects()) {
            int id = graphicsObject.getId();
            // Check for fire/danger graphics
            if (id == 2128 || id == 2129 || id == 2130 || id == 2131) {
                LocalPoint local = graphicsObject.getLocation();
                if (local != null) {
                    WorldPoint world = WorldPoint.fromLocal(client, local);
                    dangerous.add(world);
                }
            }
        }

        return dangerous;
    }

    /**
     * Convert a region point to world point
     */
    protected WorldPoint regionToWorld(Point regionPoint) {
        // Convert using instance base
        int baseX = client.getBaseX();
        int baseY = client.getBaseY();
        return new WorldPoint(
            baseX + regionPoint.getX(),
            baseY + regionPoint.getY(),
            client.getPlane()
        );
    }

    /**
     * Get the direction from player to NPC
     */
    public Direction getDirectionToNPC() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();
        WorldPoint npcLoc = getKephriNPC().getWorldLocation();

        int dx = npcLoc.getWorldX() - playerLoc.getWorldX();
        int dy = npcLoc.getWorldY() - playerLoc.getWorldY();

        if (Math.abs(dx) > Math.abs(dy)) {
            return dx > 0 ? Direction.EAST : Direction.WEST;
        } else {
            return dy > 0 ? Direction.NORTH : Direction.SOUTH;
        }
    }

    /**
     * Get safe spot positions in the Kephri room
     */
    protected List<WorldPoint> getKephriSafeSpots() {
        return KEPHRI_QUADRANT_SAFESPOTS.stream()
            .map(this::regionToWorld)
            .collect(Collectors.toList());
    }

    /**
     * Find nearest safe spot from dangerous tiles
     */
    protected WorldPoint findNearestSafeSpot() {
        Set<WorldPoint> dangerous = getDangerousTiles();
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        for (Point safePoint : KEPHRI_SAFE_POSITIONS) {
            WorldPoint worldPoint = regionToWorld(safePoint);

            // Check if this position is dangerous
            boolean isDangerous = dangerous.stream()
                .anyMatch(d -> d.equals(worldPoint));

            if (!isDangerous && Reachable.isWalkable(worldPoint)) {
                return worldPoint;
            }
        }

        return playerLoc; // Return current position if no safe spot found
    }

    /**
     * Set swarm phase flag
     */
    public static void setSwarmPhase(boolean inSwarm) {
        inSwarmPhase = inSwarm;
    }

    /**
     * Check if we're in swarm phase
     */
    public static boolean isSwarmPhase() {
        return inSwarmPhase;
    }

    /**
     * Abstract method to be implemented by each specific task
     *
     * @return true if action was taken, false otherwise
     */
    protected abstract boolean execute();
}
