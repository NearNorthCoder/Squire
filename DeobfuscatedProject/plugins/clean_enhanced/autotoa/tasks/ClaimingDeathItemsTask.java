/*
 * Decompiled with CFR 0.152.
 *
 * Claiming Death Items Task
 *
 * This task handles recovering items from the death chest after dying in TOA.
 *
 * Functionality:
 * - Detects death via chat message: "You failed to survive the Tombs"
 * - Manages inventory space before claiming items:
 *   1. Equips Kephri melee gear to free space
 *   2. Fills rune pouch with runes to consolidate inventory
 * - Interacts with death chest widget (602):
 *   - Unlocks the chest if locked
 *   - Takes all items from the chest
 *   - Claims items from death storage
 * - Handles bank PIN window if it appears
 *
 * Widget IDs:
 * - Death chest widget group: 602 (0x25A)
 * - Death chest child widget: 3
 * - Death chest unlock/take widget: 6
 *
 * Object IDs:
 * - Death chest object: 46078 (0xB3FE)
 *
 * Rune Pouch:
 * - Divine rune pouch item name: "Divine rune pouch"
 * - Regular rune pouch: "rune pouch"
 * - Fills 3 or 4 slots depending on pouch type
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.RunePouch;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Claiming Death Items", priority=100, blocking=true, register=true)
public class ClaimingDeathItemsTask extends TOAConfigurableTask {

    // Widget IDs for death chest interface
    private static final int DEATH_CHEST_WIDGET_GROUP = 602;      // 0x25A
    private static final int DEATH_CHEST_MAIN_CHILD = 3;
    private static final int DEATH_CHEST_ACTION_CHILD = 6;

    // Object IDs
    private static final int DEATH_CHEST_OBJECT_ID = 46078;       // 0xB3FE

    // Action strings
    private static final String ACTION_CLAIM = "Claim";
    private static final String ACTION_UNLOCK = "Unlock";
    private static final String ACTION_TAKE_ALL = "Take-All";

    // Item names
    private static final String DIVINE_RUNE_POUCH_NAME = "Divine rune pouch";
    private static final String RUNE_POUCH_NAME = "rune pouch";
    private static final String RUNE_SUFFIX = "rune";

    // Chat messages
    private static final String DEATH_MESSAGE = "You failed to survive the Tombs";

    // Log messages
    private static final String LOG_PIN_WAITING = "[ClaimDeathItems] Pin window is open, waiting...";
    private static final String LOG_EQUIPPING_GEAR = "[ClaimDeathItems] Equipping kephri melee gear for space";
    private static final String LOG_FILLING_POUCH = "[ClaimDeathItems] Trying to fill rune pouch for space";
    private static final String LOG_OPENING_CHEST = "[ClaimDeathItems] Opening death chest";
    private static final String LOG_UNLOCKING_CHEST = "[ClaimDeathItems] Unlocking death chest";
    private static final String LOG_TAKING_ALL = "[ClaimDeathItems] Taking all items from death chest";
    private static final String LOG_SETTING_DIED_FALSE = "[ClaimDeathItems] Setting died to false";

    // Rune pouch capacity
    private static final int REGULAR_RUNE_POUCH_SLOTS = 3;
    private static final int DIVINE_RUNE_POUCH_SLOTS = 4;

    // Manager instances
    private final TOAEquipmentManager equipmentManager;

    // State tracking
    private boolean hasDied;

    @Inject
    protected ClaimingDeathItemsTask(Client client, TOAConfig config, TOAEquipmentManager equipmentManager) {
        super(client, config);
        this.equipmentManager = equipmentManager;
        this.hasDied = false;
    }

    /**
     * Listens for death message in chat to set the died flag.
     *
     * @param chatMessage The chat message event
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        if (chatMessage.getMessage().contains(DEATH_MESSAGE)) {
            this.hasDied = true;
        }
    }

    /**
     * Fills the rune pouch with loose runes from inventory to save space.
     * Handles both regular rune pouch (3 slots) and divine rune pouch (4 slots).
     */
    private void fillRunePouch() {
        // Don't proceed if we don't have a rune pouch
        if (!RunePouch.hasPouch()) {
            return;
        }

        // Don't fill if we have runes as unnoted items ending with "rune"
        if (Inventory.contains(item -> item.getName().toLowerCase().endsWith(RUNE_SUFFIX))) {
            return;
        }

        // Get the rune pouch item
        Item runePouch = Inventory.getFirst(item -> item.getName().toLowerCase().contains(RUNE_POUCH_NAME));

        // Determine rune pouch capacity
        int runePouchSlots;
        if (Inventory.contains(DIVINE_RUNE_POUCH_NAME)) {
            runePouchSlots = DIVINE_RUNE_POUCH_SLOTS;
        } else {
            runePouchSlots = REGULAR_RUNE_POUCH_SLOTS;
        }

        // Fill each empty slot in the rune pouch
        for (int slotIndex = 0; slotIndex < runePouchSlots; slotIndex++) {
            RunePouch.RuneSlot runeSlot = RunePouch.RuneSlot.values()[slotIndex];

            // If this slot already has runes, skip it
            if (runeSlot.getQuantity() > 0) {
                continue;
            }

            // Find a rune in inventory to add to the pouch
            Item looseRune = Inventory.getFirst(item -> item.getName().toLowerCase().endsWith(RUNE_SUFFIX));
            if (looseRune == null) {
                return;
            }

            // Use the rune on the pouch to fill it
            looseRune.useOn(runePouch);
            return;
        }
    }

    /**
     * Checks if any widgets in the death chest are visible.
     *
     * @param deathChestWidgets Array of widgets to check
     * @return true if any widget is visible, false otherwise
     */
    private boolean areDeathChestWidgetsVisible(Widget[] deathChestWidgets) {
        for (Widget widget : deathChestWidgets) {
            if (Widgets.isVisible(widget)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validate() {
        // Don't run if we haven't died
        if (!this.hasDied) {
            return false;
        }

        // Wait if bank PIN window is open
        if (Bank.isPinWindowOpen()) {
            Log.info(LOG_PIN_WAITING);
            return true;
        }

        // If we can continue dialog, we've successfully claimed items
        if (Dialog.canContinue()) {
            this.hasDied = false;
            return false;
        }

        // Handle dialog options (choose option 2)
        if (Dialog.isViewingOptions()) {
            Dialog.chooseOption(2);
            return true;
        }

        // Free up inventory space if full
        if (Inventory.isFull()) {
            // Try to equip Kephri melee gear to free inventory slots
            ConfigStorageBox<EquipmentSetup> kephriMeleeSetup = this.config.kephriMelee();
            int[] gearItemIds = this.equipmentManager.getEquipmentItemIds(kephriMeleeSetup);

            if (Inventory.contains(gearItemIds)) {
                Log.info(LOG_EQUIPPING_GEAR);
                this.equipmentManager.equipItems(gearItemIds);
            } else {
                // If we can't equip gear, try filling rune pouch
                Log.info(LOG_FILLING_POUCH);
                fillRunePouch();
            }
            return true;
        }

        // Get the death chest main widget
        Widget deathChestMainWidget = Widgets.get(DEATH_CHEST_WIDGET_GROUP, DEATH_CHEST_MAIN_CHILD);

        // If the death chest widget is not visible, try to open it
        if (!Widgets.isVisible(deathChestMainWidget)) {
            Log.info(LOG_OPENING_CHEST);
            TileObject deathChest = TileObjects.getNearest(DEATH_CHEST_OBJECT_ID);
            if (deathChest == null) {
                return false;
            }
            deathChest.interact(ACTION_CLAIM);
            return true;
        }

        // Check if any child widgets are visible
        Widget[] childWidgets = deathChestMainWidget.getChildren();
        if (childWidgets == null || childWidgets.length == 0 || areDeathChestWidgetsVisible(childWidgets)) {
            Log.info(LOG_SETTING_DIED_FALSE);
            this.hasDied = false;
            return true;
        }

        // Get the action widget (unlock/take-all)
        Widget actionWidget = Widgets.get(DEATH_CHEST_WIDGET_GROUP, DEATH_CHEST_ACTION_CHILD);

        // Try to unlock the chest if it has an unlock action
        if (Widgets.isVisible(actionWidget)) {
            if (actionWidget.hasAction(ACTION_UNLOCK)) {
                Log.info(LOG_UNLOCKING_CHEST);
                actionWidget.interact(ACTION_UNLOCK);
                return true;
            }
        }

        // Try to take all items from the chest
        if (Widgets.isVisible(actionWidget)) {
            if (actionWidget.hasAction(ACTION_TAKE_ALL)) {
                Log.info(LOG_TAKING_ALL);
                actionWidget.interact(ACTION_TAKE_ALL);
                return true;
            }
        }

        return false;
    }
}
