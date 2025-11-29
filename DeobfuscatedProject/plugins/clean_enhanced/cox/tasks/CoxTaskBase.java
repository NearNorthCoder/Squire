/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.SquireChambersPlugin;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.NHelper;
import java.util.List;

/**
 * Base class for all Chambers of Xeric (CoX) task implementations.
 *
 * <p>This abstract class provides the foundation for individual raid room tasks
 * and combat encounters within the Chambers of Xeric. Each task is responsible
 * for handling a specific room, boss, or mechanic during the raid.
 *
 * <p>The task system in CoX manages:
 * <ul>
 *   <li>Room navigation and positioning</li>
 *   <li>Boss combat mechanics</li>
 *   <li>Puzzle room solutions</li>
 *   <li>Resource gathering tasks</li>
 *   <li>Prayer management and gear swapping</li>
 * </ul>
 *
 * <p>Common CoX rooms and tasks include:
 * <ul>
 *   <li>Combat rooms: Tekton, Vespula, Vasa, Muttadiles, Guardians, Mystics, Shamans</li>
 *   <li>Puzzle rooms: Crabs, Thieving, Ice Demon, Tightrope</li>
 *   <li>Resource rooms: Farming, Scavengers</li>
 *   <li>Final boss: The Great Olm (head, melee hand, mage hand, portals)</li>
 * </ul>
 *
 * <p>Each task has access to:
 * <ul>
 *   <li>The raid manager for tracking statistics</li>
 *   <li>Room helper containing layout and positioning data</li>
 *   <li>The plugin instance for configuration and utilities</li>
 * </ul>
 *
 * @author Squire Deobfuscation Team
 */
public abstract class CoxTaskBase {

    // ========== Task Context ==========

    /**
     * List of all room helpers for the current raid layout.
     * Each helper contains information about room type, position, and orientation.
     * The raid layout is determined during scouting and contains 7 rooms before Olm.
     */
    protected List<NHelper> roomHelpers;

    /**
     * The main Chambers of Xeric plugin instance.
     * Provides access to configuration, utilities, and plugin-level functionality.
     */
    protected SquireChambersPlugin plugin;

    /**
     * The index of the current room in the raid layout.
     * Rooms are numbered 0-6 for the main raid path, with special indices
     * for prep area and Olm's chamber.
     */
    protected int roomIndex;

    /**
     * The CoX raid manager.
     * Tracks raid statistics including points, completion count, and raid state.
     */
    protected CoxManager raidManager;

    /**
     * The room helper for the current room being processed.
     * Contains room-specific data like type, area bounds, entry/exit points.
     */
    protected NHelper roomHelper;

    // ========== Constructor ==========

    /**
     * Creates a new CoX task for a specific room in the raid.
     *
     * <p>This constructor initializes the task with:
     * <ul>
     *   <li>The plugin instance (for config and utilities)</li>
     *   <li>The raid manager (from plugin.C())</li>
     *   <li>The room index (which room this task handles)</li>
     *   <li>All room helpers (from plugin.D())</li>
     *   <li>The specific room helper for this room (from the room index)</li>
     * </ul>
     *
     * @param squireChambersPlugin The main CoX plugin instance
     * @param n2 The room index this task will handle (0-based index)
     */
    public CoxTaskBase(SquireChambersPlugin squireChambersPlugin, int n2) {
        this.plugin = squireChambersPlugin;
        this.raidManager = squireChambersPlugin.C();
        this.roomIndex = n2;
        this.roomHelpers = squireChambersPlugin.D();
        this.roomHelper = this.roomHelpers.get(n2);
    }

    // ========== Abstract Methods ==========

    /**
     * Determines if this task should execute in the current game state.
     *
     * <p>Implementing classes must define their validation logic, which typically checks:
     * <ul>
     *   <li>Player location (are we in the correct room?)</li>
     *   <li>Room state (is the room active/complete?)</li>
     *   <li>Boss presence (is the boss spawned?)</li>
     *   <li>Required items/equipment (do we have what we need?)</li>
     *   <li>Task prerequisites (are earlier steps complete?)</li>
     * </ul>
     *
     * <p>Example implementations:
     * <pre>
     * // For a combat room:
     * return isInRoom() && isBossAlive() && !isRoomComplete();
     *
     * // For a puzzle room:
     * return isInRoom() && isPuzzleActive() && hasRequiredItems();
     * </pre>
     *
     * @return true if this task should execute, false otherwise
     */
    public abstract boolean validate();
}
