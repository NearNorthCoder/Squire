package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

/**
 * Handles prayer point restoration in Chambers of Xeric.
 * Drinks prayer restore potions when prayer points are low.
 * Avoids drinking during certain boss mechanics (like Vespula portal).
 */
@TaskDesc(name="Restoring prayer", priority=30000)
public class RestoringPrayerTask extends Task {

    private static final int OVERLOAD_VARBIT = 5417;

    private final SquireChambersPlugin plugin;

    @Inject
    public RestoringPrayerTask(SquireChambersPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        if (!plugin.shouldManagePrayer()) {
            return false;
        }

        if (Prayers.getPoints() > 20) {
            return false;
        }

        // Don't drink restore during Vespula portal phase with overload active
        Room currentRoom = plugin.getCurrentRoom();
        if (currentRoom != null &&
            currentRoom.contains(Players.getLocal()) &&
            Static.getClient().getVarbitValue(OVERLOAD_VARBIT) > 0 &&
            currentRoom.getRoomType() == RoomType.VESPULA) {
            return false;
        }

        Item restore = Inventory.getFirst(item ->
            item.getName() != null &&
            (item.getName().startsWith("Prayer restore") ||
             item.getName().startsWith("Super restore") ||
             item.getName().startsWith("Revitalisation"))
        );

        if (restore == null) {
            return false;
        }

        restore.interact("Drink");
        sleep(3);
        return true;
    }
}
