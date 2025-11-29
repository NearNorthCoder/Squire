/*
 * Deobfuscated Great Olm Portals Task
 * Handles navigating to portal locations during the Great Olm fight
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
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

/**
 * Task for handling portal teleports during the Great Olm fight.
 *
 * Great Olm portal mechanics:
 * - During certain phases, Olm summons portals around the arena
 * - Players can be teleported through these portals
 * - Must navigate to safe positions near portals
 * - Portals appear during transition phases
 * - Proper positioning prevents being teleported to dangerous areas
 */
@TaskDesc(name = "Olm Portals", priority = 25000, blocking = true)
public class OlmPortalsTask extends CoxManager {

    @Inject
    protected OlmPortalsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    /**
     * Main execution method for the portals task
     */
    @Override
    public boolean execute() {
        // Check if Olm fight is active
        if (!isOlmActive()) {
            return false;
        }

        // Get portal positions from Olm tracker
        List<WorldPoint> portalPositions = olmTracker.getPortalPositions();

        // If no portals are active, nothing to do
        if (olmTracker.getPortalPositions().isEmpty()) {
            return false;
        }

        // If already at first portal position, we're done
        if (localPlayer.getWorldLocation().equals(portalPositions.get(0))) {
            return true;
        }

        // Move to first portal position
        Movement.setDestination(portalPositions.get(0));
        return true;
    }

    /**
     * Gets the required prayers for the portals phase
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
     * Gets the equipment setup for portals phase
     * No specific gear required, returns null
     */
    @Override
    public EquipmentSetup getGear() {
        return null;
    }
}
