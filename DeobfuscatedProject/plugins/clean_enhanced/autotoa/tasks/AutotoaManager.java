package gg.squire.autotoa.tasks;

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
 * Base manager class for Kephri boss fight in Tombs of Amascut.
 *
 * <p>This class manages the Kephri encounter mechanics including:
 * <ul>
 *   <li>Swarm detection and handling</li>
 *   <li>Dung management and safe tile navigation</li>
 *   <li>Boss phase transitions</li>
 *   <li>Equipment swapping for the encounter</li>
 *   <li>Dialog and interaction handling</li>
 * </ul>
 *
 * <p>Kephri is a scarab boss that spawns swarms of smaller scarabs and places
 * dung tiles that damage the player. This manager coordinates movement to safe
 * tiles and handles attack priorities.
 *
 * @author Squire Deobfuscation Team
 */
public abstract class KephriManager extends ToaTaskBase {

    // ========== NPC and Graphics Object IDs ==========

    /** Kephri boss NPC ID */
    private static final int KEPHRI_NPC_ID = 45504;

    /** Kephri overlord (swarm phase) NPC ID */
    private static final int KEPHRI_OVERLORD_NPC_ID = 12230;

    /** Explosive dung graphics object ID */
    private static final int EXPLOSIVE_DUNG_GFX_ID = 2164;

    /** Sticky dung graphics object ID 1 */
    private static final int STICKY_DUNG_GFX_ID_1 = 2157;

    /** Sticky dung graphics object ID 2 */
    private static final int STICKY_DUNG_GFX_ID_2 = 2158;

    /** Sticky dung graphics object ID 3 */
    private static final int STICKY_DUNG_GFX_ID_3 = 2143;

    /** Dung pile tile object ID */
    private static final int DUNG_PILE_ID = 45504;

    /** Player spot animation for being in dung */
    private static final int DUNG_SPOT_ANIM = 2167;

    // ========== Priority Constants ==========

    /** Task priority level */
    protected static final int TASK_PRIORITY = 0;

    // ========== Tile Grid Coordinates ==========

    /**
     * All valid tile positions in the Kephri arena.
     * This represents the complete grid of walkable tiles during the encounter.
     * Organized as a comprehensive list of Points representing local coordinates.
     */
    protected static final List<Point> ALL_ARENA_TILES;

    /**
     * Designated safe spot positions in the Kephri arena.
     * These are specific tiles used for strategic positioning during the fight.
     */
    protected static final List<Point> SAFE_SPOT_TILES;

    /**
     * NPC IDs for Kephri and her forms.
     * Index 0: Kephri boss
     * Index 1: Kephri overlord (swarm phase)
     * Index 2: Alternative Kephri form
     */
    protected static final int[] KEPHRI_NPC_IDS;

    // ========== State Management ==========

    /**
     * Global flag indicating if we're in swarm phase.
     * When true, the boss has spawned swarms that need to be managed.
     */
    protected static boolean isSwarmPhase;

    /**
     * The current phase/mode of the Kephri encounter.
     */
    private final KephriPhase currentPhase;

    /**
     * Phases of the Kephri boss fight.
     */
    public enum KephriPhase {
        /** Regular attack phase - focus on boss */
        ATTACK,

        /** Swarm phase - deal with smaller scarabs */
        SWARM
    }

    // ========== Static Initialization ==========

    static {
        // Initialize all arena tiles - represents the full walkable grid
        Point[] arenaTiles = new Point[50];

        // Grid pattern: Organized by rows and columns
        // First section: Main arena (positions 0-12)
        arenaTiles[0] = new Point(27, 30);
        arenaTiles[1] = new Point(27, 31);
        arenaTiles[2] = new Point(28, 31);
        arenaTiles[3] = new Point(29, 31);
        arenaTiles[4] = new Point(27, 32);
        arenaTiles[5] = new Point(28, 32);
        arenaTiles[6] = new Point(29, 32);
        arenaTiles[7] = new Point(27, 29);
        arenaTiles[8] = new Point(28, 29);
        arenaTiles[9] = new Point(29, 29);
        arenaTiles[10] = new Point(27, 28);
        arenaTiles[11] = new Point(28, 28);
        arenaTiles[12] = new Point(29, 28);

        // Second section: Extended arena (positions 13-25)
        arenaTiles[13] = new Point(15, 26);
        arenaTiles[14] = new Point(23, 26);
        arenaTiles[15] = new Point(23, 27);
        arenaTiles[16] = new Point(23, 28);
        arenaTiles[17] = new Point(25, 26);
        arenaTiles[18] = new Point(25, 27);
        arenaTiles[19] = new Point(25, 28);
        arenaTiles[20] = new Point(24, 26);
        arenaTiles[21] = new Point(24, 27);
        arenaTiles[22] = new Point(24, 28);
        arenaTiles[23] = new Point(18, 26);
        arenaTiles[24] = new Point(18, 27);
        arenaTiles[25] = new Point(18, 28);

        // Third section: Outer ring (positions 26-37)
        arenaTiles[26] = new Point(16, 18);
        arenaTiles[27] = new Point(16, 23);
        arenaTiles[28] = new Point(18, 23);
        arenaTiles[29] = new Point(21, 18);
        arenaTiles[30] = new Point(16, 21);
        arenaTiles[31] = new Point(18, 21);
        arenaTiles[32] = new Point(21, 21);
        arenaTiles[33] = new Point(22, 18);
        arenaTiles[34] = new Point(22, 23);
        arenaTiles[35] = new Point(22, 24);
        arenaTiles[36] = new Point(29, 18);
        arenaTiles[37] = new Point(29, 23);

        // Fourth section: Final positions (positions 38-49)
        arenaTiles[38] = new Point(30, 18);
        arenaTiles[39] = new Point(30, 23);
        arenaTiles[40] = new Point(31, 18);
        arenaTiles[41] = new Point(31, 23);
        arenaTiles[42] = new Point(32, 18);
        arenaTiles[43] = new Point(32, 23);
        arenaTiles[44] = new Point(33, 18);
        arenaTiles[45] = new Point(30, 24);
        arenaTiles[46] = new Point(31, 24);
        arenaTiles[47] = new Point(32, 24);
        arenaTiles[48] = new Point(33, 24);
        arenaTiles[49] = new Point(33, 25);

        ALL_ARENA_TILES = List.of(arenaTiles);

        // Initialize NPC IDs for Kephri forms
        int[] npcIds = new int[3];
        npcIds[0] = KEPHRI_NPC_ID;           // 45504 - Main boss
        npcIds[1] = KEPHRI_OVERLORD_NPC_ID;  // 12230 - Swarm phase
        npcIds[2] = 12249;                    // Alternative form
        KEPHRI_NPC_IDS = npcIds;

        // Initialize safe spot positions
        SAFE_SPOT_TILES = List.of(
            new Point(30, 30),
            new Point(15, 31),
            new Point(23, 18),
            new Point(22, 15)
        );
    }

    // ========== Constructors ==========

    /**
     * Creates a new Kephri manager with the specified phase.
     *
     * @param client The RuneLite client instance
     * @param plugin The TOA plugin instance
     * @param config The TOA configuration
     * @param phase The initial phase for this manager
     */
    protected KephriManager(Client client, ToaPlugin plugin, TOAConfig config, KephriPhase phase) {
        super(client, plugin, config);
        this.currentPhase = phase;
    }

    /**
     * Creates a new Kephri manager without a specific phase.
     *
     * @param client The RuneLite client instance
     * @param plugin The TOA plugin instance
     * @param config The TOA configuration
     */
    protected KephriManager(Client client, ToaPlugin plugin, TOAConfig config) {
        this(client, plugin, config, null);
    }

    // ========== Task Priority ==========

    @Override
    public int getPriority() {
        return TASK_PRIORITY;
    }

    // ========== Equipment Management ==========

    @Override
    public ConfigStorageBox<EquipmentSetup> getGearSwap() {
        return config.kephriGearSwap();
    }

    // ========== Phase Detection ==========

    /**
     * Determines the current phase based on NPC state.
     *
     * @return The current Kephri phase (ATTACK or SWARM)
     */
    public KephriPhase determinePhase() {
        NPC kephri = getKephriNpc();

        // If no Kephri found or it's the overlord form, we're in swarm phase
        if (kephri == null || kephri.getId() == KEPHRI_NPC_IDS[2]) {
            isSwarmPhase = true;
            return KephriPhase.SWARM;
        }

        return KephriPhase.ATTACK;
    }

    /**
     * Gets the global swarm phase state.
     *
     * @return true if currently in swarm phase
     */
    public static boolean isSwarmPhase() {
        return isSwarmPhase;
    }

    /**
     * Sets the global swarm phase state.
     *
     * @param swarmPhase true to indicate swarm phase
     */
    public static void setSwarmPhase(boolean swarmPhase) {
        isSwarmPhase = swarmPhase;
    }

    // ========== Validation ==========

    @Override
    public boolean validate() {
        // If phase differs from expected, defer to subclass validation
        if (this.currentPhase != this.determinePhase() && this.currentPhase != null) {
            return false;
        }
        return shouldExecute();
    }

    /**
     * Subclass-specific validation logic.
     *
     * @return true if this task should execute
     */
    protected abstract boolean shouldExecute();

    // ========== NPC Management ==========

    /**
     * Gets the Kephri boss NPC.
     *
     * @return The nearest Kephri NPC or null if not found
     */
    public NPC getKephriNpc() {
        return NPCs.getNearest(KEPHRI_NPC_IDS);
    }

    /**
     * Checks if Kephri is present and reachable.
     *
     * @return true if can interact with Kephri
     */
    @Override
    public boolean canInteract() {
        NPC kephri = NPCs.getNearest("Scabaras", "Osmumten");
        return kephri != null && Reachable.isInteractable(kephri);
    }

    @Override
    public boolean isNpcPresent() {
        return isKephriPresent(KEPHRI_NPC_IDS);
    }

    // ========== Dung Detection ==========

    /**
     * Checks if the player is standing in dung.
     *
     * @return true if player has the dung spot animation
     */
    public boolean isStandingInDung() {
        Player player = this.client.getLocalPlayer();
        return player.hasSpotAnim(DUNG_SPOT_ANIM);
    }

    /**
     * Gets all dung pile tile objects in the arena.
     *
     * @return List of dung pile objects
     */
    public List<TileObject> getDungPiles() {
        return TileObjects.getAll(KEPHRI_NPC_ID);
    }

    /**
     * Gets all world points containing dangerous dung graphics.
     * This includes explosive and sticky dung that should be avoided.
     *
     * @return Set of world points with dung graphics
     */
    protected Set<WorldPoint> getDungTiles() {
        HashSet<WorldPoint> dungTiles = new HashSet<>();

        for (GraphicsObject gfxObj : this.client.getGraphicsObjects()) {
            int gfxId = gfxObj.getId();

            // Check if this is any type of dung graphics
            if (gfxId == EXPLOSIVE_DUNG_GFX_ID ||
                gfxId == STICKY_DUNG_GFX_ID_1 ||
                gfxId == STICKY_DUNG_GFX_ID_2 ||
                gfxId == STICKY_DUNG_GFX_ID_3) {

                LocalPoint local = gfxObj.getLocation();
                if (local == null) {
                    continue;
                }

                WorldPoint world = WorldPoint.fromLocal(this.client, local);
                dungTiles.add(world);
            }
        }

        return dungTiles;
    }

    // ========== Safe Tile Navigation ==========

    /**
     * Gets the predefined safe spot world points.
     *
     * @return List of safe spot world points
     */
    protected List<WorldPoint> getSafeSpots() {
        return SAFE_SPOT_TILES.stream()
            .map(this::localToWorld)
            .collect(Collectors.toList());
    }

    /**
     * Finds the best safe tile to move to.
     * Prioritizes tiles without dung piles and that are reachable.
     *
     * @return World point of a safe tile, or player location if none found
     */
    protected WorldPoint findSafeTile() {
        // First pass: Find tiles without dung that are walkable
        for (Point arenaPoint : ALL_ARENA_TILES) {
            WorldPoint tileWorld = localToWorld(arenaPoint);

            // Check if this tile has a dung pile
            boolean hasDung = !TileObjects.getAll(obj ->
                obj.getWorldLocation().equals(tileWorld) &&
                obj.getId() == DUNG_PILE_ID
            ).isEmpty();

            if (!hasDung && Reachable.isWalkable(tileWorld)) {
                return tileWorld;
            }
        }

        // Second pass: If no clean walkable tiles, just find any walkable tile
        for (Point arenaPoint : ALL_ARENA_TILES) {
            WorldPoint tileWorld = localToWorld(arenaPoint);

            if (Reachable.isWalkable(tileWorld)) {
                return tileWorld;
            }
        }

        // Default to current location if no safe tile found
        return Players.getLocal().getWorldLocation();
    }

    /**
     * Checks if should continue moving to current destination.
     *
     * @return true if should keep moving
     */
    public boolean shouldContinueMoving() {
        WorldPoint destination = Movement.getDestination();
        Player player = Players.getLocal();

        int maxDistance = Movement.isRunEnabled() ? 2 : 1;

        // Keep moving if we have a destination and aren't close enough
        if (destination != null && destination.distanceTo2D(player.getWorldLocation()) > maxDistance) {
            return true;
        }

        return false;
    }

    /**
     * Gets the direction from player to Kephri.
     *
     * @return Direction to face Kephri, or null if not applicable
     */
    public Direction getDirectionToKephri() {
        WorldPoint playerPos = Players.getLocal().getWorldLocation();
        WorldPoint kephriPos = getKephriNpc().getWorldLocation();

        int dx = playerPos.getWorldX() - kephriPos.getWorldX();
        int dy = playerPos.getWorldY() - kephriPos.getWorldY();

        // Could implement full direction calculation here
        // For now returning null as the original implementation
        return null;
    }

    // ========== Exit/Teleport Handling ==========

    /**
     * Interacts with the teleport crystal to leave.
     *
     * @return true if successfully interacted
     */
    @Override
    public boolean handleExit() {
        TileObject teleportCrystal = TileObjects.getNearest("Teleport crystal");

        if (teleportCrystal == null || !Reachable.isInteractable(teleportCrystal)) {
            return false;
        }

        teleportCrystal.interact("Quick-Use");
        return true;
    }

    /**
     * Handles NPC dialog interactions for leaving the encounter.
     *
     * @return true if dialog was handled
     */
    @Override
    public boolean handleDialog() {
        // First check if parent class handles it
        if (super.handleDialog()) {
            return true;
        }

        // Handle continue dialogs
        if (Dialog.isOpen() && Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }

        // Find and interact with exit NPCs
        NPC exitNpc = NPCs.getNearest("Scabaras", "Osmumten");
        if (exitNpc == null) {
            return false;
        }

        // Prefer quick-leave if available, otherwise talk
        if (exitNpc.hasAction("Quick-leave")) {
            exitNpc.interact("Quick-leave");
            return true;
        }

        exitNpc.interact("Talk-to");
        return true;
    }
}
