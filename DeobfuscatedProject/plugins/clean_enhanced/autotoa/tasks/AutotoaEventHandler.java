/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Auto TOA Plugin
 *
 * Event handler that tracks game objects and NPCs spawning/despawning
 * during the Tombs of Amascut raid
 */
package gg.squire.autotoa.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

/**
 * Event handler for tracking spawned objects and NPCs in TOA
 * Maintains sets of currently active game objects and NPCs for task processing
 */
public class AutotoaEventHandler {

    // Calculated GameObject and NPC IDs from XOR operations
    // These IDs represent specific TOA raid objects and enemies
    // Note: Actual values computed from bitwise operations in original code

    // GameObject ID for special puzzle/raid objects (var1[0])
    private static final int SPECIAL_GAMEOBJECT_ID = 43844;

    // NPC IDs for tracking specific enemies (var1[1], var1[2])
    private static final int TRACKED_NPC_ID_1 = 28798;  // var1[1] - Likely a specific boss or minion
    private static final int TRACKED_NPC_ID_2 = 28063;  // var1[2] - Likely another boss or minion

    // Additional constants (var1[3], var1[4], var1[5])
    private static final int ROOM_STATE_1 = 65279;  // var1[3] - Possible room state or varbit
    private static final int ROOM_STATE_2 = 32466;  // var1[4] - Possible room state or varbit
    private static final int ROOM_STATE_3 = 20830;  // var1[5] - Possible room state or varbit

    // List of puzzle/interactive GameObject IDs to track (var1[6] through var1[11])
    // These are likely: light beams, pressure plates, obelisks, boulders, etc.
    private static final List<Integer> PUZZLE_GAMEOBJECT_IDS = List.of(
        65518,  // var1[6] - Puzzle object 1
        65407,  // var1[7] - Puzzle object 2
        65470,  // var1[8] - Puzzle object 3
        48853,  // var1[9] - Puzzle object 4
        65239,  // var1[10] - Puzzle object 5
        62143   // var1[11] - Puzzle object 6
    );

    // Sets to track currently spawned objects and NPCs
    private final Set<GameObject> puzzleGameObjects;
    private final Set<NPC> trackedNpcs;
    private final Set<GameObject> specialGameObjects;

    public AutotoaEventHandler() {
        this.puzzleGameObjects = new HashSet<>();
        this.trackedNpcs = new HashSet<>();
        this.specialGameObjects = new HashSet<>();
    }

    /**
     * Clears all tracked objects and NPCs
     * Called when plugin starts or raid resets
     */
    public void clear() {
        this.puzzleGameObjects.clear();
        this.trackedNpcs.clear();
        this.specialGameObjects.clear();
    }

    /**
     * Returns the set of special GameObjects being tracked
     * @return Set of puzzle-related GameObjects
     */
    public Set<GameObject> getPuzzleGameObjects() {
        return this.puzzleGameObjects;
    }

    /**
     * Returns the set of tracked NPCs
     * @return Set of tracked NPCs
     */
    public Set<NPC> getTrackedNpcs() {
        return this.trackedNpcs;
    }

    /**
     * Returns the set of special GameObjects
     * @return Set of special GameObjects
     */
    public Set<GameObject> getSpecialGameObjects() {
        return this.specialGameObjects;
    }

    /**
     * Handles GameObject spawn events
     * Tracks puzzle objects and special objects needed for automation
     */
    @Subscribe
    public void onGameObjectSpawned(GameObjectSpawned event) {
        GameObject gameObject = event.getGameObject();

        // Track puzzle-related objects (pressure plates, light beams, etc.)
        if (PUZZLE_GAMEOBJECT_IDS.contains(gameObject.getId())) {
            this.puzzleGameObjects.add(gameObject);
        }

        // Track special game objects (e.g., breakable boulders, interactive objects)
        if (gameObject.getId() == SPECIAL_GAMEOBJECT_ID) {
            this.specialGameObjects.add(gameObject);
        }
    }

    /**
     * Handles GameObject despawn events
     * Removes objects from tracking when they despawn
     */
    @Subscribe
    public void onGameObjectDespawned(GameObjectDespawned event) {
        this.puzzleGameObjects.remove(event.getGameObject());
    }

    /**
     * Handles NPC spawn events
     * Tracks specific NPCs needed for boss fight automation
     */
    @Subscribe
    public void onNpcSpawned(NpcSpawned event) {
        NPC npc = event.getNpc();

        // Track first NPC type (e.g., Akkha shadow, Kephri scarab, etc.)
        if (npc.getId() == TRACKED_NPC_ID_1) {
            this.trackedNpcs.add(npc);
        }

        // Track second NPC type (e.g., Zebak blood cloud, Ba-Ba boulder, etc.)
        if (npc.getId() == TRACKED_NPC_ID_2) {
            this.trackedNpcs.add(npc);
        }
    }
}
