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

import java.util.List;

/**
 * Task for collecting water-filled vials during Chambers of Xeric preparation.
 *
 * Vials of water are needed to mix with herbs to create potions. This task
 * handles collecting vials from water barrels and managing inventory space
 * by dropping excess vials when needed.
 */
@TaskDesc(name="Prep Get Vials", priority=21001, blocking=true)
public class PrepGetVialsTask extends CoxManager {

    // Item IDs
    private static final int VIAL_OF_WATER = 227;
    private static final int WATER_BARREL = 30015;
    private static final int EMPTY_WATER_BARREL = 30016;

    @Inject
    protected PrepGetVialsTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // We're done if we have enough vials
        if (getVialCount() > getRequiredVialCount()) {
            return false;
        }

        // Also validate herb count
        if (getHerbCount() >= getRequiredHerbCount()) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        int vialCount = getVialCount();

        // Drop excess vials if we have too many
        if (vialCount > getRequiredVialCount()) {
            List<Item> vials = Inventory.getAll(VIAL_OF_WATER);
            int toDrop = vialCount - getRequiredVialCount();

            for (int i = 0; i < vials.size() && toDrop > 0; i++) {
                if (i >= getRequiredVialCount()) {
                    vials.get(i).drop();
                    toDrop--;
                }
            }
            return 600;
        }

        // Check if we have enough herbs for vials
        if (getHerbCount() >= getRequiredHerbCount()) {
            return -1;
        }

        // Collect more vials if we don't have enough
        if (getVialCount() > 0) {
            // Look for full water barrel
            TileObject waterBarrel = TileObjects.getNearest(tileObject -> {
                if (tileObject.getName().contains("Water butt")) {
                    if (tileObject.hasAction("Drink")) {
                        return true;
                    }
                }
                return false;
            });

            if (waterBarrel == null) {
                System.out.println("No water barrel found");
                return -1;
            }

            // Wait if animating or moving
            if (this.player.isAnimating() || this.player.isMoving()) {
                System.out.println("Waiting for animation/movement...");
                return 600;
            }

            // Collect vials from barrel
            waterBarrel.interact("Drink");
            this.sleep(4);
            return 600;
        }

        // Find empty barrel to fill vials
        TileObject emptyBarrel = TileObjects.getNearest(tileObject -> {
            if (tileObject.getName().contains("Empty")) {
                if (tileObject.hasAction("Fill")) {
                    return true;
                }
            }
            return false;
        });

        if (emptyBarrel == null) {
            return -1;
        }

        // Wait if animating or moving
        if (this.player.isAnimating() || this.player.isMoving()) {
            System.out.println("Waiting before filling...");
            return 600;
        }

        // Fill vials from empty barrel
        emptyBarrel.interact("Fill");
        return 600;
    }
}
