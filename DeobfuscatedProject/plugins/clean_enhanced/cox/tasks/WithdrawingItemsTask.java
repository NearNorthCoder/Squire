package gg.squire.cox.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Handles withdrawing items from bank or private storage in Chambers of Xeric.
 * Manages inventory setup based on room requirements and configured loadouts.
 * Ensures proper supplies are available before entering rooms.
 */
@TaskDesc(name="Withdrawing items", priority=19000, blocking=true)
public class WithdrawingItemsTask extends CoxTaskBase {

    private static final int STORAGE_WIDGET_ID = 15728650;
    private static final int[] STORAGE_ITEM_IDS = {20693, 20697, 20699};

    @Override
    public boolean execute() {
        if (!needsItems()) {
            return true;
        }

        if (plugin.getCurrentRoom() == null) {
            return true;
        }

        // Find private storage or bank
        TileObject storage = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().equals("Private storage") &&
            obj.hasAction("Use")
        );

        if (storage != null && Players.getLocal().distanceTo(storage) > 2) {
            Movement.setDestination(storage.getWorldLocation());
            return true;
        }

        // Handle depositing items to storage if needed
        if (Inventory.contains(STORAGE_ITEM_IDS)) {
            depositItems();
            return true;
        }

        // Get configured loadout for current room
        BankLoadout loadout = getConfiguredLoadout();
        if (loadout == null) {
            Log.error("No loadout configured for current room");
            return true;
        }

        // Check if loadout is complete
        if (!loadout.needsToBank()) {
            if (Bank.isOpen()) {
                Bank.close();
                sleep(500);
                return true;
            }
            return false;
        }

        // Withdraw items from loadout
        if (BankLoadouts.withdrawWithRetries(loadout, 6)) {
            Log.info("Withdrawn items successfully");
            return true;
        }

        sleep(700);
        return true;
    }

    /**
     * Handles depositing items into private storage
     */
    private boolean depositItems() {
        if (!Inventory.contains(STORAGE_ITEM_IDS)) {
            return true;
        }

        if (Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }

        if (Dialog.isViewingOptions() &&
            Dialog.hasOption("Deposit") &&
            Dialog.hasOption("Withdraw")) {
            Dialog.chooseOption("Deposit");
            return true;
        }

        Widget depositWidget = Widgets.get(839, 101, 1);
        if (depositWidget != null && depositWidget.isVisible() &&
            depositWidget.getText() != null &&
            depositWidget.getText().contains("Deposit")) {
            Widget parentWidget = Widgets.get(839, 101);
            if (parentWidget != null) {
                parentWidget.interact("Deposit");
                return true;
            }
        }

        Widget storageWidget = Static.getClient().getWidget(STORAGE_WIDGET_ID);
        if (storageWidget != null) {
            storageWidget.interact(3, -1, -1, 0);
            return true;
        }

        Item storageItem = Inventory.getFirst(STORAGE_ITEM_IDS);
        if (storageItem != null) {
            storageItem.interact("Use");
            return true;
        }

        return true;
    }

    /**
     * Get the configured loadout from plugin settings
     */
    private BankLoadout getConfiguredLoadout() {
        return config.getBankLoadout();
    }

    /**
     * Check if we need to withdraw items
     */
    private boolean needsItems() {
        return plugin.shouldWithdrawItems();
    }
}
