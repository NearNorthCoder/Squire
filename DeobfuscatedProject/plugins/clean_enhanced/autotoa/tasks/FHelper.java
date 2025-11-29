/*
 * Deobfuscated TOA Static Helper
 * Provides static storage for NPCs and WorldPoints used across TOA tasks
 */
package gg.squire.autotoa.tasks;

import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;

/**
 * Static helper class for storing and accessing NPC lists and WorldPoints
 * during TOA encounters.
 *
 * This class maintains state that is shared across multiple task implementations,
 * including NPC tracking and position markers.
 */
public class FHelper {
    // NPC ID Constants
    /** Primary NPC ID constant */
    public static final int NPC_ID_PRIMARY = 2181;

    /** Secondary NPC ID constant */
    public static final int NPC_ID_SECONDARY = 11733;

    /** List of additional NPC IDs */
    public static final List<Integer> NPC_ID_LIST = List.of(2059, 10444);

    // State Storage
    private static List<NPC> npcListPrimary;
    private static List<NPC> npcListSecondary;
    private static WorldPoint worldPointPrimary;
    private static WorldPoint worldPointSecondary;

    /**
     * Set the primary NPC list
     */
    public static void setNpcListPrimary(List<NPC> list) {
        npcListPrimary = list;
    }

    /**
     * Get the primary NPC list
     */
    public static List<NPC> getNpcListPrimary() {
        return npcListPrimary;
    }

    /**
     * Set the secondary NPC list
     */
    public static void setNpcListSecondary(List<NPC> list) {
        npcListSecondary = list;
    }

    /**
     * Get the secondary NPC list
     */
    public static List<NPC> getNpcListSecondary() {
        return npcListSecondary;
    }

    /**
     * Set the primary world point
     */
    public static void setWorldPointPrimary(WorldPoint worldPoint) {
        worldPointPrimary = worldPoint;
    }

    /**
     * Get the primary world point
     */
    public static WorldPoint getWorldPointPrimary() {
        return worldPointPrimary;
    }

    /**
     * Set the secondary world point
     */
    public static void setWorldPointSecondary(WorldPoint worldPoint) {
        worldPointSecondary = worldPoint;
    }

    /**
     * Get the secondary world point
     */
    public static WorldPoint getWorldPointSecondary() {
        return worldPointSecondary;
    }

    /**
     * Reset all stored state to null
     */
    public static void reset() {
        worldPointPrimary = null;
        worldPointSecondary = null;
        npcListPrimary = null;
        npcListSecondary = null;
    }
}
