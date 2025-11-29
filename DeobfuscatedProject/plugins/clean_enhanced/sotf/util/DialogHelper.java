package gg.squire.sotf.util;

import net.runelite.api.NPC;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.widgets.Dialog;

/**
 * Helper class for handling dialog interactions with NPCs.
 *
 * This utility simplifies the process of talking to NPCs and continuing through dialog.
 */
public class DialogHelper {

    /**
     * Interacts with the specified NPC to initiate a conversation,
     * then continues through the dialog until completion.
     *
     * @param npc The NPC to talk to
     */
    public static void talkAndContinue(NPC npc) {
        if (npc == null) {
            return;
        }

        // Initiate conversation with the NPC
        npc.interact("Talk-to");

        // Wait for dialog to open
        Time.sleepUntil(Dialog::isOpen, 5000);

        // Continue through all dialog
        while (Dialog.isOpen()) {
            Dialog.continueSpace();
            Time.sleepTicks(1);
        }
    }
}
