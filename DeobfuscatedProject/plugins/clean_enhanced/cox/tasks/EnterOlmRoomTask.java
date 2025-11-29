/*
 * Deobfuscated Enter Olm Room Task
 * Handles entering the Great Olm boss room
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for entering the Great Olm boss room.
 *
 * Entry mechanics:
 * - Players must click on the entrance barrier/door to enter
 * - Only enter when ready and raid is in correct state
 * - Entering begins the Great Olm fight
 * - No re-entry after leaving until raid is complete
 */
@TaskDesc(name = "Enter Olm Room", priority = 21000, blocking = true)
public class EnterOlmRoomTask extends CoxManager {

    @Inject
    protected EnterOlmRoomTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    /**
     * Main execution method for entering the Olm room
     */
    @Override
    public boolean execute() {
        // Check if already in Olm room or should not enter
        if (isOlmActive()) {
            return false;
        }

        // Check if raid state allows entering Olm room
        if (plugin.getRaidState() == RaidState.GET_OUT) {
            return false;
        }

        // Find the entrance to Olm room
        TileObject olmEntrance = getOlmRoomEntrance();
        if (olmEntrance == null) {
            return false;
        }

        // Interact with the entrance
        olmEntrance.interact("Enter");
        return true;
    }

    /**
     * Gets the required prayers for entering Olm room
     */
    @Override
    public List<Prayer> getPrayers() {
        ArrayList<Prayer> prayers = new ArrayList<>();

        // Get defensive prayer from Olm tracker
        Prayer defensivePrayer = olmTracker.getDefensivePrayer();
        if (defensivePrayer == null) {
            defensivePrayer = Prayer.PROTECT_FROM_MAGIC;
        }

        // Add offensive prayers
        List<Prayer> offensivePrayers = Prayers.getOffensive();
        prayers.add(defensivePrayer);
        prayers.addAll(offensivePrayers);

        return prayers;
    }

    /**
     * Gets the equipment setup for entering Olm room
     * No specific gear required, returns null
     */
    @Override
    public EquipmentSetup getGear() {
        return null;
    }
}
