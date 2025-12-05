package gg.squire.leagues.banknote;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.common.LeaguesConstants;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import org.pf4j.util.StringUtils;

/**
 * Task that handles noting and unnoting items using a Banker's Note.
 * This task allows converting items between noted and unnoted forms during Leagues.
 */
@TaskDesc(name = "note item task")
public class NoteItemTask extends Task {

    private final NoteItemsConfig config;

    /**
     * Constructs a new NoteItemTask with the specified configuration.
     *
     * @param config the configuration for this task
     */
    public NoteItemTask(NoteItemsConfig config) {
        this.config = config;
    }

    /**
     * Executes the note/unnote task logic.
     *
     * This task will:
     * - Note items when the inventory is full (if unnoted mode is disabled)
     * - Unnote items when there are no unnoted items in inventory (if unnoted mode is enabled)
     *
     * @return false always (task continues running)
     */
    @Override
    public boolean run() {
        // Check if item name is not configured
        if (StringUtils.isNotNullOrEmpty(this.config.noteItem())) {
            System.out.println("[Leagues] Note Items: Please configure an item name in the plugin settings. " +
                    "Enter the name of the item you want to note/unnote. Make sure you have a Banker's Note " +
                    "in your inventory.");
            return false;
        }

        // Mode: Note items when inventory is full (unnoted mode disabled)
        if (!this.config.getUnnotedMode() && Inventory.isFull()) {
            // Check if we have a banker's note
            if (Inventory.contains(LeaguesConstants.BANKERS_NOTE_ID)) {
                // Check if item name is configured
                if (!StringUtils.isNotNullOrEmpty(this.config.noteItem())) {
                    // Find the unnoted item matching the configured name
                    Item unnotedItem = Inventory.getFirst(item ->
                            item.getName().equalsIgnoreCase(this.config.noteItem()) &&
                            !item.isNoted()
                    );

                    if (unnotedItem != null) {
                        // Use the unnoted item on the banker's note to note it
                        Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
                        unnotedItem.useOn(bankersNote);
                    }
                }
            }
        }

        // Mode: Unnote items when no unnoted items exist (unnoted mode enabled)
        if (this.config.getUnnotedMode()) {
            // Check if we don't have any unnoted items matching the configured name
            boolean hasUnnotedItem = Inventory.contains(item ->
                    item.getName().equalsIgnoreCase(this.config.noteItem()) &&
                    !item.isNoted()
            );

            if (!hasUnnotedItem) {
                // Check if we have a banker's note
                if (Inventory.contains(LeaguesConstants.BANKERS_NOTE_ID)) {
                    // Find the noted item matching the configured name
                    Item notedItem = Inventory.getFirst(item ->
                            item.getName().equalsIgnoreCase(this.config.noteItem()) &&
                            item.isNoted()
                    );

                    if (notedItem != null) {
                        // Use the noted item on the banker's note to unnote it
                        Item bankersNote = Inventory.getFirst(LeaguesConstants.BANKERS_NOTE_ID);
                        notedItem.useOn(bankersNote);
                    }
                }
            }
        }

        return false;
    }
}
