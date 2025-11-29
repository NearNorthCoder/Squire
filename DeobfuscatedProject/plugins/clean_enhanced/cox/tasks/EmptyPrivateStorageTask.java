package gg.squire.cox.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Empties items from private storage chest in Chambers of Xeric.
 * Private storage is a shared chest accessible to all raid party members
 * where resources can be deposited and withdrawn.
 *
 * This task handles withdrawing all items before leaving the raid.
 */
@TaskDesc(name="Empty Private Storage", priority=Integer.MAX_VALUE - 50, blocking=true)
public class EmptyPrivateStorageTask extends CoxTaskBase {

    private static final int STORAGE_WIDGET_ID = 15728650;
    private static final int[] STORAGE_ITEM_IDS = {20693, 20697, 20699}; // Various storage items

    @Override
    public boolean execute() {
        if (!plugin.shouldEmptyStorage()) {
            return true;
        }

        if (plugin.getRoomLayout().hasCompletedRaid()) {
            return true;
        }

        // Check if storage interface is open
        Widget storageWidget = Widgets.get(271, widget ->
            widget.hasAction("Take")
        );

        if (storageWidget != null && storageWidget.isVisible()) {
            storageWidget.interact("Take");
            return true;
        }

        // Find private storage chest
        TileObject storage = TileObjects.getNearest(obj ->
            obj.getName() != null &&
            obj.getName().contains("Private storage") &&
            obj.hasAction("Use")
        );

        if (storage == null) {
            Movement.walkTo(plugin.getStartLocation());
            return true;
        }

        storage.interact("Use");
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
            depositWidget.getText() != null && depositWidget.getText().contains("Deposit")) {
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
}
