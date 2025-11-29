package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

import java.util.List;

/**
 * Task for depositing items into private storage during Chambers of Xeric preparation.
 *
 * The private storage is a shared chest within the raid where players can store
 * potions, food, and other supplies before starting the raid. This task deposits
 * prepared potions and other items while keeping essential gear.
 */
@TaskDesc(name="Prep Deposit inventory", priority=21004, blocking=true)
public class PrepDepositInventoryTask extends CoxManager {

    // Item IDs to keep (not deposit)
    private static final int TWISTED_BOW = 20997;
    private static final int DRAGON_HUNTER_CROSSBOW = 21012;
    private static final int BANDOS_GODSWORD = 11804;

    @Inject
    protected PrepDepositInventoryTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Get items that should be deposited
        List<Item> itemsToDeposit = getItemsToDeposit();

        // Check if we've made enough potions
        if (getRestorePotionCount() >= this.config.restorePotionCount()) {
            return false;
        }

        // Check if deposit interface is open and we have items to deposit
        if (isPrivateStorageOpen()) {
            if (itemsToDeposit.isEmpty()) {
                return false;
            }
        }

        // Check if we should deposit
        if (itemsToDeposit.isEmpty()) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        List<Item> itemsToDeposit = getItemsToDeposit();

        // Close storage if we're done depositing
        if (isPrivateStorageOpen()) {
            if (isDoneDepositing()) {
                closePrivateStorage();
                return 600;
            }

            // Deposit items one by one
            Item item = itemsToDeposit.get(0);
            Widget itemWidget = Widgets.get(12, 4, item.getSlot());

            if (itemWidget == null) {
                System.out.println("Could not find item widget");
            }

            itemWidget.interact("Deposit");
            return 600;
        }

        // Open private storage
        TileObject privateStorage = TileObjects.getNearest(tileObject -> {
            if (tileObject.getName().toLowerCase().contains("private")) {
                if (tileObject.hasAction("Use") && this.currentRoom.isInRoom(tileObject)) {
                    return true;
                }
            }
            return false;
        });

        if (privateStorage == null) {
            System.out.println("Can't find private storage");
            return -1;
        }

        privateStorage.interact("Use");
        return 600;
    }

    /**
     * Gets list of items that should be deposited into private storage.
     * Excludes essential gear like weapons.
     */
    private List<Item> getItemsToDeposit() {
        return Inventory.getAll(item -> {
            // Keep essential combat gear
            if (item.getId() == TWISTED_BOW ||
                item.getId() == DRAGON_HUNTER_CROSSBOW ||
                item.getId() == BANDOS_GODSWORD) {
                return false;
            }
            return true;
        });
    }

    /**
     * Checks if we're done depositing items.
     */
    private boolean isDoneDepositing() {
        List<Item> itemsToDeposit = getItemsToDeposit();

        if (!itemsToDeposit.isEmpty()) {
            return false;
        }

        // Also check if we have the right amount of gear items
        if (Inventory.getCount(getRequiredGearIds()) > 3) {
            return false;
        }

        return true;
    }
}
