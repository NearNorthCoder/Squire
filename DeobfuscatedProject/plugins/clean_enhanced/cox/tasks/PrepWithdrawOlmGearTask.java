package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Task for withdrawing Olm combat gear from private storage.
 *
 * After preparation is complete, this task withdraws the necessary combat
 * gear and supplies from private storage for the Great Olm fight. This includes
 * weapons, armor, prayer potions, and food.
 */
@TaskDesc(name="Prep Withdraw Olm Gear", priority=20999, blocking=true)
public class PrepWithdrawOlmGearTask extends CoxManager {

    @Inject
    protected PrepWithdrawOlmGearTask(SquireChambersPlugin plugin, SquireChambersConfig config, Client client) {
        super(plugin, config, client);
    }

    @Override
    public boolean validate() {
        // Check if herb picking and potion making are complete
        if (getHerbCount() < getRequiredHerbCount()) {
            return false;
        }

        if (getRestorePotionCount() < this.config.restorePotionCount()) {
            return false;
        }

        return true;
    }

    @Override
    public int execute() {
        System.out.println("Inv: " + Bank.Inventory.getAll().size());

        // Get the gear set we need to withdraw
        HashSet<Integer> gearSet = getRequiredGearIds();
        ArrayList<Integer> gearList = new ArrayList<>(gearSet);

        // Convert to int array for inventory checks
        int[] gearIds = new int[gearSet.size()];
        for (int i = 0; i < gearIds.length; i++) {
            gearIds[i] = gearList.get(i);
        }

        // Get items we need to withdraw
        List<Item> itemsToWithdraw = Inventory.getAll(gearIds);

        // Check for stamina potions in storage
        List<Item> staminaPotions = Inventory.getAll(item ->
            item.getName().startsWith("Stamina")
        );

        // Check for super combat potions in storage
        List<Item> superCombatPotions = Inventory.getAll(item ->
            item.getName().startsWith("Super combat")
        );

        // Add stamina potion if we don't have one and one exists in storage
        if (!superCombatPotions.isEmpty() &&
            !Inventory.contains(item -> item.getName().startsWith("Stamina"))) {
            itemsToWithdraw.add(superCombatPotions.get(0));
        }

        // Calculate how many super combat doses we need
        int neededDoses = 4 - Inventory.getCount(item ->
            item.getName().startsWith("Super combat")
        );

        // Add super combat potions up to needed doses
        for (Item potion : staminaPotions) {
            if (neededDoses <= 0) break;
            if (potion == null) continue;

            itemsToWithdraw.add(potion);
            neededDoses -= potion.getQuantity();
        }

        // If nothing to withdraw, move to Olm room
        if (itemsToWithdraw.isEmpty()) {
            if (!Movement.getDestination().equals(this.startRoom.position)) {
                return -1;
            }

            System.out.println("Moving to Olm room");
            Movement.setDestination(this.startRoom.position);
            return 600;
        }

        // Handle private storage interface
        if (isPrivateStorageOpen()) {
            // Close if inventory is full and we have all gear
            if (Inventory.isFull() && Inventory.contains(gearIds)) {
                return 600;
            }

            // Withdraw items one by one
            for (Item item : itemsToWithdraw) {
                if (item == null) continue;

                Widget itemWidget = Widgets.get(12, 4, item.getSlot());
                if (itemWidget == null) {
                    System.out.println("Could not find item widget");
                }

                itemWidget.interact("Withdraw");
            }
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
}
