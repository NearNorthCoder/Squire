package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

import java.util.Iterator;
import java.util.List;

/**
 * Task for creating potions during Chambers of Xeric preparation.
 *
 * This task handles mixing herbs with vials of water to create potions
 * at the preparation stations. It creates both revitalisation potions
 * (for healing) and Xeric's aid (for combat stats). The task manages
 * the production interface and handles crafting logic.
 */
@TaskDesc(name="Prep Make Pots", priority=21001, blocking=true)
public class PrepMakePotsTask extends CoxManager {

    // Item IDs
    private static final int VIAL_OF_WATER = 227;
    private static final int[] HERBS = {20889, 20891, 20887}; // Noxifer, Golpar, Buchu
    private static final int PREPARATION_STATION = 29742;

    // Potion crafting state
    private boolean craftingRestore = false;

    @Inject
    protected PrepMakePotsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
        this.craftingRestore = false;
    }

    @Override
    public boolean validate() {
        // Check if we have enough herbs to make potions
        if (getHerbCount() < getRequiredHerbCount()) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        TileObject prepStation = TileObjects.getNearest(PREPARATION_STATION);

        // Check inventory fullness and potion counts
        if (Inventory.isFull() && getPotionCount() > getMinPotionsRequired()) {
            if (!Inventory.contains(VIAL_OF_WATER)) {
                return -1;
            }
        }

        // Drop excess unfinished potions if we have them
        if (Inventory.contains(HERBS)) {
            List<Item> herbs = Inventory.getAll(HERBS);
            int maxDrop = 4;
            Iterator<Item> iterator = herbs.iterator();

            while (iterator.hasNext() && maxDrop > 0) {
                Item herb = iterator.next();
                maxDrop--;
                herb.interact("Drop");
            }
            return 600;
        }

        // Handle production interface if open
        if (Production.isOpen()) {
            if (getRestorePotionCount() < this.config.restorePotionCount()) {
                // Craft revitalisation potion
                this.craftingRestore = true;
                Production.chooseOption("Revitalisation");
                this.sleep(5);
                return 600;
            }

            // Craft Xeric's aid
            this.craftingRestore = false;
            Production.chooseOption("Xeric's aid");
            this.sleep(5);
            return 600;
        }

        // Use herb on vial to open production interface
        Item vial = Inventory.getFirst(VIAL_OF_WATER);
        Item herb = Inventory.getFirst(HERBS);

        if (vial == null || herb == null) {
            return -1;
        }

        System.out.println("CraftRestore: " + this.craftingRestore + " | count: " + getRestorePotionCount());

        // Wait if player is animating and not crafting restore
        if (!this.craftingRestore && this.player.isAnimating()) {
            return 600;
        }

        // Wait if crafting restore and haven't reached target count
        if (this.craftingRestore && this.player.isAnimating() &&
            getRestorePotionCount() < this.config.restorePotionCount()) {
            return 600;
        }

        // Use herb on vial
        herb.useOn(vial);
        return 600;
    }
}
