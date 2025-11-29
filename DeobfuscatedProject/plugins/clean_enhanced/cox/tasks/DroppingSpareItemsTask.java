package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

/**
 * Manages dropping unnecessary items during Chambers of Xeric based on room type.
 * Different rooms require different resources - this task drops items that won't be needed.
 *
 * Examples:
 * - Drop kindling outside Ice Demon room
 * - Drop lockpicks outside Thieving room
 * - Drop hammers outside Crabs room
 */
@TaskDesc(name="Dropping spare items", priority=30000)
public class DroppingSpareItemsTask extends Task {

    private static final int KINDLING_ID = 20694;
    private static final int HAMMER_ID = 20720;
    private static final int LOCKPICK_ID = 20695;
    private static final int TINDERBOX_ID = 20696;

    private final SquireChambersPlugin plugin;

    @Inject
    public DroppingSpareItemsTask(SquireChambersPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        if (!plugin.isInRaid() || !plugin.shouldAutoManageInventory()) {
            return false;
        }

        Player player = Players.getLocal();
        if (player == null) {
            return false;
        }

        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom == null || !currentRoom.contains(player)) {
            return false;
        }

        RoomType roomType = currentRoom.getRoomType();

        // Drop buchu seeds outside farming room
        if (Inventory.contains(KINDLING_ID)) {
            Inventory.dropAll(KINDLING_ID);
            return true;
        }

        // Drop kindling if not in Ice Demon room
        if (Inventory.contains(TINDERBOX_ID)) {
            if (roomType != RoomType.ICE_DEMON) {
                Inventory.dropAll(TINDERBOX_ID);
                return true;
            }

            int neededKindling = calculateNeededKindling();
            if (neededKindling <= 0) {
                Inventory.dropAll(TINDERBOX_ID);
                return true;
            }
        }

        // Drop hammers if not in Ice Demon or Muttadiles room
        if (Inventory.contains(HAMMER_ID)) {
            if (roomType != RoomType.ICE_DEMON && roomType != RoomType.MUTTADILES) {
                Inventory.dropAll(HAMMER_ID);
                return true;
            }

            if (roomType == RoomType.ICE_DEMON) {
                int neededHammers = calculateNeededKindling();
                if (neededHammers <= 0) {
                    Inventory.dropAll(HAMMER_ID);
                    return true;
                }
            }
        }

        // Drop lockpicks outside Thieving room
        if (Inventory.contains(LOCKPICK_ID) && roomType != RoomType.THIEVING) {
            Inventory.dropAll(LOCKPICK_ID);
            return true;
        }

        // Drop various seeds/items not needed
        int[] miscSeeds = {20703, 20704, 20705}; // Various seed IDs
        if (Inventory.contains(miscSeeds)) {
            Inventory.dropAll(miscSeeds);
            return true;
        }

        // Drop noxious grubs outside final boss
        int[] grubIds = {20732, 20733};
        if (Inventory.contains(grubIds) && roomType != RoomType.END) {
            Inventory.dropAll(grubIds);
            return true;
        }

        // Drop cicely outside Crabs room
        if (Inventory.contains(20734) && roomType != RoomType.CRABS) {
            Inventory.dropAll(20734);
            return true;
        }

        return false;
    }

    /**
     * Calculate how much kindling is needed based on team size and woodcutting level
     */
    private int calculateNeededKindling() {
        int teamSize = plugin.getTeamSize();
        int woodcuttingLevel = Skills.getLevel(Skill.WOODCUTTING);

        return 40 - teamSize + (50 - woodcuttingLevel) / 10;
    }

    /**
     * Drops bread to make inventory space
     */
    private boolean dropBread() {
        Item bread = Inventory.getFirst(item ->
            item.getName() != null &&
            item.getName().startsWith("Bread") &&
            item.hasAction("Drop")
        );

        if (bread == null) {
            return false;
        }

        bread.interact("Drop");
        sleep(1);
        return true;
    }
}
