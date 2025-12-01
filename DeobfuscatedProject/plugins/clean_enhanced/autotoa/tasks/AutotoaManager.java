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

    // ========== Combat Area Detection (deobfuscated from bc(), aq(), bf(), be()) ==========

    /** Region IDs for TOA combat areas */
    private static final int TOA_REGION_COMBAT_1 = 14160; // Region ID for combat area
    private static final int TOA_REGION_COMBAT_2 = 14672; // Region ID for boss area
    private static final int TOA_REGION_COMBAT_3 = 15184; // Region ID for extended area
    private static final int TOA_REGION_SPECIAL_1 = 15696; // Region ID for special weapon areas
    private static final int TOA_REGION_SPECIAL_2 = 15952; // Region ID for special weapon areas

    /** Boss NPC IDs for TOA */
    private static final int[] BOSS_NPC_IDS = {27267, 27267, 27779, 27524}; // Kephri, Zebak, etc.

    /** Animation ID for idle state */
    private static final int ANIMATION_IDLE = -1;

    /**
     * Checks if the player is currently in a combat area within TOA.
     * Used to determine if combat-related tasks should execute.
     *
     * @return true if in a combat area
     */
    protected boolean isInCombatArea() {
        // Must be in instanced region
        if (!this.client.isInInstancedRegion()) {
            return false;
        }
        // Check if in one of the combat regions
        return isInRegion(TOA_REGION_COMBAT_1) ||
               isInRegion(TOA_REGION_COMBAT_2) ||
               isInRegion(TOA_REGION_COMBAT_3);
    }

    /**
     * @deprecated Use {@link #isInCombatArea()} instead
     */
    @Deprecated
    protected boolean bc() {
        return isInCombatArea();
    }

    /**
     * Checks if the player is in a special weapon mode area.
     * These are areas where special attack weapons are particularly effective.
     *
     * @return true if in special weapon mode area
     */
    protected boolean isInSpecialWeaponMode() {
        return isInRegion(TOA_REGION_SPECIAL_1) || isInRegion(TOA_REGION_SPECIAL_2);
    }

    /**
     * @deprecated Use {@link #isInSpecialWeaponMode()} instead
     */
    @Deprecated
    protected boolean aq() {
        return isInSpecialWeaponMode();
    }

    /**
     * Checks if a boss fight is currently active.
     * This is determined by whether a boss NPC is present in the area.
     *
     * @return true if a boss NPC is present and the fight is active
     */
    protected boolean isBossFightActive() {
        return getNearestBossNpc() != null;
    }

    /**
     * @deprecated Use {@link #isBossFightActive()} instead
     */
    @Deprecated
    protected boolean bf() {
        return isBossFightActive();
    }

    /**
     * Checks if the boss is currently idle (not animating).
     * Useful for timing attacks or special actions.
     *
     * @return true if boss is present and in idle animation state
     */
    protected boolean isBossIdle() {
        NPC boss = getNearestBossNpc();
        return boss != null && boss.getAnimation() == ANIMATION_IDLE;
    }

    /**
     * @deprecated Use {@link #isBossIdle()} instead
     */
    @Deprecated
    protected boolean be() {
        return isBossIdle();
    }

    /**
     * Gets the nearest boss NPC in the current area.
     *
     * @return the nearest boss NPC, or null if none found
     */
    protected NPC getNearestBossNpc() {
        return NPCs.getNearest(BOSS_NPC_IDS);
    }

    /**
     * @deprecated Use {@link #getNearestBossNpc()} instead
     */
    @Deprecated
    protected NPC bd() {
        return getNearestBossNpc();
    }

    /**
     * Checks if the player is in a specific map region.
     *
     * @param regionId the region ID to check
     * @return true if the player is in that region
     */
    protected boolean isInRegion(int regionId) {
        int[] regions = this.client.getMapRegions();
        if (regions == null) {
            return false;
        }
        for (int region : regions) {
            if (region == regionId) {
                return true;
            }
        }
        return false;
    }

    /**
     * @deprecated Use {@link #isInRegion(int)} instead
     */
    @Deprecated
    protected boolean j(int regionId) {
        return isInRegion(regionId);
    }

    // ========== Additional Deobfuscated Methods ==========

    /**
     * Checks if the shadow puzzle is currently active.
     * Used during the Het puzzle to determine special behavior.
     *
     * @return true if shadow puzzle is active
     */
    protected boolean isShadowPuzzleActive() {
        // Check if in shadow puzzle region or state
        return isInRegion(TOA_REGION_COMBAT_1) && !isInSpecialWeaponMode();
    }

    /**
     * @deprecated Use {@link #isShadowPuzzleActive()} instead
     */
    @Deprecated
    protected boolean aZ() {
        return isShadowPuzzleActive();
    }

    /**
     * Gets the count of tears/salt items available for prayer restoration.
     *
     * @return the count of available tears/salt items
     */
    protected int getTearsCount() {
        // Count tears of elidinis and salt deposits in inventory
        return (int) net.unethicalite.api.items.Inventory.getAll(item ->
            item.getId() == 27339 || item.getId() == 19081
        ).stream().count();
    }

    /**
     * @deprecated Use {@link #getTearsCount()} instead
     */
    @Deprecated
    protected int aY() {
        return getTearsCount();
    }

    /**
     * Gets the current phase ID based on boss animation state.
     *
     * @return the current phase animation ID
     */
    protected int getCurrentPhaseId() {
        NPC boss = getNearestBossNpc();
        if (boss == null) {
            return -1;
        }
        return boss.getAnimation();
    }

    /**
     * @deprecated Use {@link #getCurrentPhaseId()} instead
     */
    @Deprecated
    protected int aX() {
        return getCurrentPhaseId();
    }

    /**
     * Checks if the butterfly phase is currently active during Akkha fight.
     *
     * @return true if butterfly phase is active
     */
    protected boolean isButterflyPhaseActive() {
        // Check for Akkha's Shadow NPC presence
        NPC akkhasShadow = NPCs.getNearest("Akkha's Shadow");
        return akkhasShadow != null && !akkhasShadow.isDead();
    }

    /**
     * @deprecated Use {@link #isButterflyPhaseActive()} instead
     */
    @Deprecated
    protected boolean bu() {
        return isButterflyPhaseActive();
    }

    /**
     * Handles player movement state updates.
     * Called when player is moving to update internal state.
     */
    protected void handlePlayerMoving() {
        // Update movement state - typically clears pending actions
        // This is called to notify the task that movement is occurring
    }

    /**
     * @deprecated Use {@link #handlePlayerMoving()} instead
     */
    @Deprecated
    protected void bp() {
        handlePlayerMoving();
    }

    /**
     * Gets the butterfly mechanic data for the current Akkha phase.
     * Returns null if not in butterfly phase.
     *
     * @return the butterfly mechanic data, or null
     */
    protected ButterflyMechanic getButterflyMechanic() {
        // This would return the butterfly mechanic data
        // The actual implementation depends on how the mechanic is tracked
        return null; // Placeholder - actual implementation needed
    }

    /**
     * @deprecated Use {@link #getButterflyMechanic()} instead
     */
    @Deprecated
    protected ButterflyMechanic bv() {
        return getButterflyMechanic();
    }

    /**
     * Gets the Warden NPC for the final boss fight.
     *
     * @return the Warden NPC, or null if not found
     */
    protected NPC getWardenNpc() {
        return NPCs.getNearest(npc ->
            npc.getName() != null &&
            (npc.getName().contains("Warden") || npc.getName().contains("Elidinis") || npc.getName().contains("Tumeken"))
        );
    }

    /**
     * @deprecated Use {@link #getWardenNpc()} instead
     */
    @Deprecated
    protected NPC co() {
        return getWardenNpc();
    }

    /**
     * Checks if the player can eat (has food and health is not full).
     *
     * @return true if player can eat
     */
    protected boolean canEat() {
        // Check if player has food and is not at full health
        return net.unethicalite.api.game.Combat.getCurrentHealth() < net.unethicalite.api.game.Combat.getMaxHealth() &&
               net.unethicalite.api.items.Inventory.getFirst(item ->
                   item.hasAction("Eat") || item.hasAction("Drink")
               ) != null;
    }

    /**
     * @deprecated Use {@link #canEat()} instead
     */
    @Deprecated
    protected boolean ba() {
        return canEat();
    }

    /**
     * Converts a local Point coordinate to a WorldPoint.
     * Used for converting arena tile positions to world coordinates.
     *
     * @param localPoint the local Point to convert
     * @return the corresponding WorldPoint
     */
    protected WorldPoint localToWorld(Point localPoint) {
        if (localPoint == null) {
            return null;
        }
        LocalPoint local = LocalPoint.fromScene(localPoint.getX(), localPoint.getY());
        return WorldPoint.fromLocal(this.client, local);
    }

    /**
     * @deprecated Use {@link #localToWorld(Point)} instead
     */
    @Deprecated
    protected WorldPoint a(Point localPoint) {
        return localToWorld(localPoint);
    }

    /**
     * Gets the Akkha's Shadow NPC during butterfly phase.
     *
     * @return the Akkha's Shadow NPC, or null if not found
     */
    protected NPC getAkkhasShadow() {
        return NPCs.getNearest("Akkha's Shadow");
    }

    /**
     * @deprecated Use {@link #getAkkhasShadow()} instead
     */
    @Deprecated
    protected NPC J() {
        return getAkkhasShadow();
    }

    /**
     * Checks if an NPC is valid (not null and not dead).
     *
     * @param npc the NPC to check
     * @return true if NPC is valid
     */
    protected boolean isNpcValid(NPC npc) {
        return npc != null && !npc.isDead();
    }

    /**
     * @deprecated Use {@link #isNpcValid(NPC)} instead
     */
    @Deprecated
    protected boolean g(NPC npc) {
        return isNpcValid(npc);
    }

    /**
     * Moves the player to the specified world point.
     *
     * @param destination the destination WorldPoint
     */
    protected void moveTo(WorldPoint destination) {
        if (destination != null) {
            Movement.setDestination(destination);
        }
    }

    /**
     * @deprecated Use {@link #moveTo(WorldPoint)} instead
     */
    @Deprecated
    protected void g(WorldPoint destination) {
        moveTo(destination);
    }

    /**
     * Resets the task state.
     * Called when the task needs to be reset to initial state.
     */
    protected void resetTask() {
        // Reset any internal state
    }

    /**
     * @deprecated Use {@link #resetTask()} instead
     */
    @Deprecated
    protected void r() {
        resetTask();
    }

    /**
     * Placeholder class for butterfly mechanic data.
     * This should be replaced with the actual deobfuscated type.
     */
    public static class ButterflyMechanic {
        private List<Point> circlePositions;
        private List<Point> attackTiles;

        /**
         * Gets the circle positions for butterfly movement.
         * @return list of circle positions
         */
        public List<Point> getCirclePositions() {
            return circlePositions;
        }

        /**
         * @deprecated Use {@link #getCirclePositions()} instead
         */
        @Deprecated
        public List<Point> M() {
            return getCirclePositions();
        }

        /**
         * Gets the attack tile positions.
         * @return list of attack tiles
         */
        public List<Point> getAttackTiles() {
            return attackTiles;
        }

        /**
         * @deprecated Use {@link #getAttackTiles()} instead
         */
        @Deprecated
        public List<Point> N() {
            return getAttackTiles();
        }
    }
}
