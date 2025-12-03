package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/**
 * Handles looting the reward chest after completing Tombs of Amascut (TOA).
 * This task:
 * 1. Opens reward chest or supply chests
 * 2. Takes all rewards from the reward interface
 * 3. Banks items if needed
 * 4. Exits via Osmumten NPC or sarcophagus
 */
@TaskDesc(name="Looting chest room", priority=1000, blocking=true)
public class LootingChestRoomTask extends KephriManager {

    // TOA Object IDs
    private static final int REWARD_CHEST_ID = 45750;          // Main reward chest
    private static final int SUPPLY_CHEST_1_ID = 44787;        // Supply chest variant 1
    private static final int SUPPLY_CHEST_2_ID = 44788;        // Supply chest variant 2
    private static final int SUPPLY_CHEST_3_ID = 52949;        // Supply chest variant 3
    private static final int SARCOPHAGUS_ID = 46220;           // Sarcophagus exit
    private static final int ENTRANCE_ROOM_OBJECT_ID = 15632;  // Room entrance marker

    // Widget IDs
    private static final int REWARD_WIDGET_PARENT = 771;       // Reward interface parent
    private static final int REWARD_WIDGET_CHILD = 4;          // Reward interface child

    // State tracking
    private boolean hasInteractedWithRewardInterface = false;

    @Inject
    protected LootingChestRoomTask(Client client, ToaPlugin plugin, TOAConfig tOAConfig) {
        super(client, plugin, tOAConfig);
    }

    /**
     * Checks if reward collection has been completed.
     * Returns true when the reward chest is no longer available and we've interacted with the interface.
     *
     * @return true if reward collection is complete
     */
    @Override
    public boolean hasCompletedRewardCollection() {
        TileObject rewardChest = TileObjects.getNearest(obj ->
            obj.getId() == REWARD_CHEST_ID && obj.hasAction("Open")
        );

        return rewardChest == null && this.hasInteractedWithRewardInterface;
    }

    /**
     * Checks if we are currently in the chest room area.
     *
     * @return true if in the chest room
     */
    @Override
    public boolean isInChestRoom() {
        return TileObjects.getNearest(ENTRANCE_ROOM_OBJECT_ID) != null;
    }

    @Override
    protected boolean shouldExecute() {
        // Main task execution logic

        // Check if reward interface is open
        Widget rewardWidget = Widgets.get(REWARD_WIDGET_PARENT, REWARD_WIDGET_CHILD);
        ItemContainer rewardContainer = this.client.getItemContainer(InventoryID.TOA_REWARD_CHEST);

        if (Widgets.isVisible(rewardWidget) && rewardContainer != null) {
            // Reward interface is open - check if there are items to take
            Item[] items = rewardContainer.getItems();
            boolean hasItems = false;

            for (Item item : items) {
                if (item.getId() > 1) {  // Item exists (not empty slot)
                    hasItems = true;
                    break;
                }
            }

            if (hasItems) {
                // Take all items from the reward chest
                this.hasInteractedWithRewardInterface = false;
                rewardWidget.interact("Bank-all");
                return true;
            }
        }

        // Try to open the reward chest
        TileObject rewardChest = TileObjects.getNearest(obj ->
            obj.getId() == REWARD_CHEST_ID && obj.hasAction("Open")
        );

        // Try to find supply chests
        TileObject supplyChest = TileObjects.getNearest(obj ->
            List.of(SUPPLY_CHEST_1_ID, SUPPLY_CHEST_2_ID, SUPPLY_CHEST_3_ID).contains(obj.getId())
            && obj.hasAction("Search")
        );

        // If neither chest is available, try to exit
        if (rewardChest == null && supplyChest == null) {
            // Try to find sarcophagus or exit
            TileObject sarcophagus = TileObjects.getNearest(obj ->
                obj.getId() == SARCOPHAGUS_ID
            );

            if (sarcophagus != null) {
                // Check if this is actually a sarcophagus by name
                TileObject exitObject = TileObjects.getNearest(obj ->
                    obj.getName().toLowerCase().contains("sarcophagus")
                );

                if (exitObject != null) {
                    return false;  // Exit not yet available
                }

                // Interact with the sarcophagus to exit
                sarcophagus.interact("Open", "Search");
                return true;
            }
        }

        // Open the appropriate chest
        if (rewardChest != null) {
            rewardChest.interact("Open");
        } else if (supplyChest != null) {
            supplyChest.interact("Search");
        }

        return true;
    }

    /**
     * Handles dialog with the Osmumten NPC for exiting the raid.
     * Processes dialog options and initiates the leave interaction.
     *
     * @return true if dialog was handled or exit was initiated
     */
    @Override
    public boolean handleExitDialog() {
        if (Dialog.isViewingOptions()) {
            // Choose "Yes" to confirm exit
            Dialog.chooseOption("Yes");
            this.sleep(5);  // Wait for dialog to process
            return true;
        }

        if (Dialog.canContinue()) {
            // Continue through dialog
            Dialog.continueSpace();
            return true;
        }

        // Find and talk to Osmumten
        NPC osmumten = NPCs.getNearest("Osmumten");
        if (osmumten == null) {
            return false;
        }

        osmumten.interact("Leave");
        return true;
    }

    @Override
    public void reset() {
        // Reset task state
        this.hasInteractedWithRewardInterface = false;
    }

    /**
     * Gets the gear swap configuration for this task.
     * Returns null as no equipment swap is needed for looting.
     *
     * @return null - no gear swap required
     */
    @Override
    public ConfigStorageBox<EquipmentSetup> getGearSwap() {
        return null;  // No equipment setup required for looting
    }

    /**
     * Gets the room marker object ID used to detect if we're in this room.
     *
     * @return the entrance room object ID
     */
    @Override
    public int getRoomObjectId() {
        return ENTRANCE_ROOM_OBJECT_ID;
    }
}
