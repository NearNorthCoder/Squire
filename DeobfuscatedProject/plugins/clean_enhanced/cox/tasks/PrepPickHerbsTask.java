package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/**
 * Task for picking herbs from farming patches during Chambers of Xeric preparation.
 *
 * After seeds have been planted and grown, this task harvests the herbs from the
 * farming patches. The herbs (Noxifer, Golpar, Buchu) are used to make potions
 * including overloads, Xeric's aid, and revitalisation potions.
 */
@TaskDesc(name="Prep Pick Herbs", priority=21000, blocking=true)
public class PrepPickHerbsTask extends CoxManager {

    // Item IDs
    private static final int[] HERBS = {20889, 20891, 20887}; // Noxifer, Golpar, Buchu herbs
    private static final int GROWN_FARMING_PATCH = 29732; // Patch with grown herbs

    @Inject
    protected PrepPickHerbsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Don't pick if we already have herbs
        if (Inventory.contains(HERBS)) {
            return false;
        }

        // Find a farming patch with grown herbs
        TileObject grownPatch = TileObjects.getNearest(GROWN_FARMING_PATCH);
        if (grownPatch == null) {
            return false;
        }

        // Check herb count and patch progress
        if (getHerbCount() < getRequiredHerbCount()) {
            return false;
        }

        // Don't pick if inventory is full and we still need more patches
        if (Inventory.isFull() && getPatchesRemaining() > getMinPatchesRequired()) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        TileObject grownPatch = TileObjects.getNearest(GROWN_FARMING_PATCH);
        if (grownPatch == null) {
            return -1;
        }

        // Wait if player is already animating (picking)
        if (this.player.isAnimating()) {
            System.out.println("Already picking herbs...");
            return 0;
        }

        // Pick the herbs
        grownPatch.interact("Pick");
        this.sleep(3);
        return 0;
    }
}
