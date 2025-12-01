/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire COX Plugin
 *
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package gg.squire.cox.tasks;

import java.util.Objects;
import net.runelite.api.Player;

/**
 * PlayerRoomAssignment - Tracks which player is assigned to which room/effect in a raid.
 *
 * This class maintains the assignment of a player to a specific effect type
 * (such as BURN, ACID, or TELEPORT during Olm), along with a counter that
 * tracks the remaining tick duration of the assignment.
 */
public class PlayerRoomAssignment {
    private final CoxEffectType effectType;
    private int assignmentCounter;
    private final Player player;

    static {
        PlayerRoomAssignment.initializeMapper();
    }

    /**
     * Gets the current assignment counter value.
     * This counter tracks the duration or status of the room assignment.
     *
     * @return the current counter value
     */
    public int getCounter() {
        return this.assignmentCounter;
    }

    /**
     * Creates a new player effect assignment.
     *
     * @param player the player being assigned
     * @param effectType the type of effect the player is assigned to handle
     */
    public PlayerRoomAssignment(Player player, CoxEffectType effectType) {
        this.player = player;
        this.effectType = effectType;
        this.assignmentCounter = effectType.getTickDuration();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        PlayerRoomAssignment other = (PlayerRoomAssignment) object;
        return Objects.equals(this.player.getName(), other.player.getName())
            && this.effectType == other.effectType;
    }

    /**
     * Gets the player assigned to this room.
     *
     * @return the assigned player
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * Decrements the assignment counter.
     * Called periodically to track the progress or duration of the assignment.
     */
    public void decrementCounter() {
        if (this.assignmentCounter > 0) {
            this.assignmentCounter -= 1;
        }
    }

    /**
     * Gets the effect type for this assignment.
     *
     * @return the effect type
     */
    public CoxEffectType getEffectType() {
        return this.effectType;
    }

    /**
     * @deprecated Use {@link #getEffectType()} instead
     */
    @Deprecated
    public CoxEffectType getRoomType() {
        return getEffectType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.player.getName(), this.effectType);
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
