package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

import java.util.List;

/**
 * Manages overload potion usage in Chambers of Xeric.
 * Overloads are raid-specific potions that boost combat stats significantly
 * but deal recoil damage when consumed. This task ensures safe usage.
 *
 * Important: Never drink overload when HP is too low (≤20) as it deals damage.
 */
@TaskDesc(name="Drink Overload", priority=30000)
public class DrinkOverloadTask extends Task {

    private static final int OVERLOAD_VARBIT = 5417; // Tracks overload timer

    private final SquireChambersPlugin plugin;
    private final SquireChambersConfig config;

    @Inject
    public DrinkOverloadTask(SquireChambersPlugin plugin, SquireChambersConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public boolean run() {
        if (!shouldDrinkOverload()) {
            return false;
        }

        Item overload = Inventory.getFirst(item ->
            item.getName() != null &&
            item.getName().startsWith("Overload")
        );

        if (overload == null) {
            return false;
        }

        // Check overload cooldown via varbit
        int overloadTimer = Static.getClient().getVarbitValue(OVERLOAD_VARBIT);
        if (overloadTimer > 0) {
            return false;
        }

        // Safety check: don't drink if HP is too low (overload deals damage)
        if (Combat.getCurrentHealth() <= 20) {
            return false;
        }

        overload.interact("Drink");
        return true;
    }

    /**
     * Determines if we should drink an overload potion based on:
     * - Being outside raid prep (inside actual raid)
     * - Being on ground floor
     * - Not being at end of raid
     */
    private boolean shouldDrinkOverload() {
        if (!isInRaidProperlyStarted()) {
            return false;
        }

        if (hasMoreRoomsAhead()) {
            return false;
        }

        return true;
    }

    /**
     * Checks if we're past the raid entrance on the ground floor
     */
    private boolean isInRaidProperlyStarted() {
        if (!plugin.isInRaid()) {
            return false;
        }

        Player player = Players.getLocal();
        if (player == null || player.getPlane() != 0) {
            return false;
        }

        TileObject crystal = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().contains("Crystal") &&
            obj.hasAction("Pass")
        );

        if (crystal == null) {
            return false;
        }

        return player.getWorldY() > crystal.getWorldY();
    }

    /**
     * Checks if there are combat rooms remaining.
     * Don't waste overload on final boss or completed rooms.
     */
    private boolean hasMoreRoomsAhead() {
        if (Players.getLocal() == null || Players.getLocal().getPlane() == 0) {
            return false;
        }

        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom == null) {
            return false;
        }

        List<RoomType> roomList = plugin.getRoomLayout().getRooms();
        boolean foundCurrent = false;

        for (RoomType room : roomList) {
            if (room == null) continue;

            // Skip non-combat rooms
            if (room == RoomType.SCAVENGERS ||
                room == RoomType.CRABS ||
                room == RoomType.END ||
                room == RoomType.START ||
                room == RoomType.FARMING ||
                room == RoomType.THIEVING) {
                continue;
            }

            // If we found current room and there's a combat room ahead
            if (foundCurrent && plugin.getRoomLayout().isRoomCompleted(room)) {
                return true;
            }

            if (room == currentRoom.getRoomType()) {
                foundCurrent = true;
            }
        }

        return false;
    }
}
