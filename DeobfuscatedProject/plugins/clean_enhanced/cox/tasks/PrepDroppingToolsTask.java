package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;

/**
 * Task for dropping farming tools after preparation is complete.
 *
 * Once all farming and potion preparation is finished, the farming tools
 * (seed dibber, spade, secateurs) are no longer needed and should be dropped
 * to free up inventory space for combat gear and supplies.
 */
@TaskDesc(name="Prep Dropping Tools", priority=21000, blocking=true)
public class PrepDroppingToolsTask extends CoxManager {

    // Farming tool IDs to drop
    private static final int SEED_DIBBER = 5343;
    private static final int SPADE = 952;
    private static final int SECATEURS = 5329;
    private static final int HAMMER = 2347;
    private static final int PESTLE_AND_MORTAR = 233;

    // Additional tool IDs
    private static final int[] ALL_TOOLS = {
        SEED_DIBBER,
        SPADE,
        SECATEURS,
        HAMMER,
        PESTLE_AND_MORTAR,
        5325, // Watering can
        5340, // Rake
        6032, // Magic secateurs
        5331, // Gardening trowel
        952   // Spade (duplicate for different variants)
    };

    @Inject
    protected PrepDroppingToolsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Only drop tools after potion making is complete
        if (getRestorePotionCount() < this.config.restorePotionCount()) {
            return false;
        }

        // And after herb picking is done
        if (getHerbCount() < getRequiredHerbCount()) {
            return false;
        }

        // Check if we have any tools to drop
        if (!Inventory.contains(ALL_TOOLS)) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        // Drop all farming tools
        Inventory.dropAll(ALL_TOOLS);
        return -1;
    }
}
