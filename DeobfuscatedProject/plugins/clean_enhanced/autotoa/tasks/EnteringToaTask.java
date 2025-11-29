package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

/**
 * Handles entering the Tombs of Amascut (TOA) raid.
 * This task manages the pre-raid setup and entry process:
 *
 * 1. Verifies the player has the correct spellbook (Ancient)
 * 2. Ensures the player has the required gear/inventory from loadout
 * 3. Opens the inventory tab for visibility
 * 4. Handles dialog options when entering the raid
 * 5. Interacts with the TOA entrance object
 *
 * The task will automatically stop the plugin if the player doesn't have
 * the Ancient spellbook equipped, as it's required for TOA raids.
 */
@TaskDesc(name="Entering TOA")
public class EnteringToaTask extends TOAConfigurableTask {

    // Game object ID for the TOA entrance
    // Calculated from: -(0xFFFFD575 & 0x6BEB) & (0xFFFFF569 & 0xFFFF)
    private static final int TOA_ENTRANCE_OBJECT_ID = 0xB069; // 45161

    // Error message when wrong spellbook is active
    private static final String WRONG_SPELLBOOK_ERROR = "We need ancient spellbook, stopping";

    // Dialog options
    private static final String DIALOG_YES = "Yes";
    private static final String ENTER_ACTION = "Enter";

    @Inject
    protected SquireAutoTOA aY;

    @Inject
    protected EnteringToaTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    @Override
    public boolean validate() {
        // Find the TOA entrance object
        TileObject toaEntrance = TileObjects.getNearest(TOA_ENTRANCE_OBJECT_ID);
        if (toaEntrance == null) {
            return false;
        }

        // Get the configured bank loadout
        BankLoadout loadout = (BankLoadout) this.hY.loadout().selected(BankLoadout.class);

        // Check if player needs to bank (missing required items)
        if (loadout.needsToBank()) {
            return false;
        }

        // Ensure inventory tab is open for visibility
        if (!Tabs.isOpen(Tab.INVENTORY)) {
            Tabs.open(Tab.INVENTORY);
            return true;
        }

        // Verify player has Ancient spellbook active (required for TOA)
        if (Magic.getCurrentSpellBook() != SpellBook.ANCIENT) {
            Log.info(WRONG_SPELLBOOK_ERROR);
            this.plugin.forceStop();
            return false;
        }

        // Handle dialog continuation (space to continue)
        if (Dialog.canContinue()) {
            Dialog.continueSpace();
            return true;
        }

        // Handle dialog options (e.g., "Are you sure you want to enter?")
        if (Dialog.isViewingOptions()) {
            Dialog.chooseOption(DIALOG_YES);
            return true;
        }

        // Interact with the entrance to enter TOA
        toaEntrance.interact(ENTER_ACTION);
        return true;
    }
}
