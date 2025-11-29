/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum11;
import java.util.Objects;
import net.runelite.api.Player;

/**
 * PlayerRoomAssignment - Tracks which player is assigned to which room in a raid.
 *
 * This class maintains the assignment of a player to a specific room type,
 * along with a counter that tracks some temporal aspect of the assignment.
 */
public class PlayerRoomAssignment {
    private final C roomType;
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
     * Creates a new player room assignment.
     *
     * @param player the player being assigned
     * @param roomType the type of room the player is assigned to
     */
    public PlayerRoomAssignment(Player player, C roomType) {
        this.player = player;
        this.roomType = roomType;
        this.assignmentCounter = roomType.bB();
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
            && this.roomType == other.roomType;
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
     * Gets the room type for this assignment.
     *
     * @return the room type
     */
    public C getRoomType() {
        return this.roomType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.player.getName(), this.roomType);
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
