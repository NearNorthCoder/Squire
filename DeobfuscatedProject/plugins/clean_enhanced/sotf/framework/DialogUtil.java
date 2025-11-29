/*
 * Deobfuscated from class 'g' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * DialogUtil provides utility methods for interacting with NPC dialogs
 * in OSRS. Handles talking to NPCs, choosing dialog options, and
 * continuing through conversations.
 *
 * Original obfuscated methods:
 *   a(String[]) -> chooseDialogOptions(String[] options)
 *   a(String, String[]) -> talkToNpc(String npcName, String[] options)
 *   a(String, String[], boolean) -> talkToNpcWithWalk(String npcName, String[] options, boolean walk)
 *   b(String, String[]) -> talkToNpcLoop(String npcName, String[] options)
 *   M() -> isConversationOpen()
 */
package gg.squire.sotf.framework;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

import java.util.List;

/**
 * Utility class for handling NPC dialog interactions.
 * Provides methods for talking to NPCs and navigating dialog options.
 */
public final class DialogUtil {

    // Dialog varbit to check for conversation state
    private static final int DIALOG_VARBIT = 281;
    private static final int DIALOG_THRESHOLD = 1000;

    // Sleep/timeout constants
    private static final int TICK_DELAY = 5;
    private static final int DIALOG_TIMEOUT_MS = 3000;

    // Widget group IDs for conversation windows
    private static final int[] CONVERSATION_WIDGET_IDS = {193, 231, 217, 219, 229};

    // NPC interaction action
    private static final String TALK_TO_ACTION = "Talk-to";
    private static final String STATUS_CHOOSING_DIALOG = "Choosing dialog";

    /**
     * Choose from available dialog options, or continue the conversation.
     * Original obfuscated method: g.a(String[])
     *
     * @param options Array of dialog option text to look for
     */
    public static void chooseDialogOptions(String[] options) {
        if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
            Dialog.chooseOption(options);
        }
        if (Dialog.canContinueNPC() || Dialog.canContinue()) {
            Dialog.continueSpace();
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #chooseDialogOptions(String[])} instead
     */
    @Deprecated
    public static void a(String[] options) {
        chooseDialogOptions(options);
    }

    /**
     * Talk to an NPC by name and choose dialog options.
     * Will initiate conversation if not already in one.
     * Original obfuscated method: g.a(String, String[])
     *
     * @param npcName The name of the NPC to talk to
     * @param options Array of dialog option text to choose from
     */
    public static void talkToNpc(String npcName, String[] options) {
        // If varbit indicates we should start a conversation and no dialog is open
        if (GameStateUtil.getVarbit(DIALOG_VARBIT) < DIALOG_THRESHOLD
                && !Dialog.canContinue() && !Dialog.isViewingOptions()) {
            List<NPC> npcs = NPCs.getAll(npcName);
            if (npcs.size() > 0) {
                npcs.get(0).interact(TALK_TO_ACTION);
                Time.sleepTicks(TICK_DELAY);
            }
        }

        // If dialog is not open, try to open it
        if (!Dialog.isOpen()) {
            List<NPC> npcs = NPCs.getAll(npcName);
            if (npcs.size() > 0) {
                npcs.get(0).interact(TALK_TO_ACTION);
                Time.sleepUntil(Dialog::isOpen, DIALOG_TIMEOUT_MS);
            }
        }

        // Process the dialog
        if (Dialog.isOpen() || Dialog.canContinue() || Dialog.canContinueNPC() || Dialog.isViewingOptions()) {
            AccBuilderSotf.c = STATUS_CHOOSING_DIALOG;

            if (Dialog.isEnterInputOpen()) {
                Dialog.close();
            }

            if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
                Dialog.chooseOption(options);
            }

            if (Dialog.canContinueNPC() || Dialog.canContinue()) {
                Dialog.continueSpace();
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #talkToNpc(String, String[])} instead
     */
    @Deprecated
    public static void a(String npcName, String[] options) {
        talkToNpc(npcName, options);
    }

    /**
     * Talk to an NPC by name, walking to them first if needed.
     * Original obfuscated method: g.a(String, String[], boolean)
     *
     * @param npcName The name of the NPC to talk to
     * @param options Array of dialog option text to choose from
     * @param walkFirst Whether to walk to the NPC if not reachable
     */
    public static void talkToNpcWithWalk(String npcName, String[] options, boolean walkFirst) {
        // If varbit indicates we should start a conversation and no dialog is open
        if (GameStateUtil.getVarbit(DIALOG_VARBIT) < DIALOG_THRESHOLD
                && !Dialog.canContinue() && !Dialog.isViewingOptions()) {
            List<NPC> npcs = NPCs.getAll(npcName);
            if (npcs.size() > 0) {
                npcs.get(0).interact(TALK_TO_ACTION);
                Time.sleepTicks(TICK_DELAY);
            }
        }

        // If dialog is not open, walk to NPC and try to open dialog
        if (!Dialog.isOpen()) {
            List<NPC> npcs = NPCs.getAll(npcName);
            if (npcs.size() > 0) {
                NPC npc = npcs.get(0);

                // Walk to NPC if not interactable
                if (!Reachable.isInteractable((Locatable) npc)) {
                    Movement.walkTo((WorldPoint) npc.getWorldLocation());
                    Time.sleepTicks(1);
                }

                // Interact when reachable
                if (Reachable.isInteractable((Locatable) npc)) {
                    npc.interact(TALK_TO_ACTION);
                    Time.sleepUntil(Dialog::isOpen, DIALOG_TIMEOUT_MS);
                }
            }
        }

        // Process the dialog
        if (Dialog.isOpen() || Dialog.canContinue() || Dialog.canContinueNPC() || Dialog.isViewingOptions()) {
            AccBuilderSotf.c = STATUS_CHOOSING_DIALOG;

            if (Dialog.isEnterInputOpen()) {
                Dialog.close();
            }

            if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
                Dialog.chooseOption(options);
            }

            if (Dialog.canContinueNPC() || Dialog.canContinue()) {
                Dialog.continueSpace();
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #talkToNpcWithWalk(String, String[], boolean)} instead
     */
    @Deprecated
    public static void a(String npcName, String[] options, boolean walkFirst) {
        talkToNpcWithWalk(npcName, options, walkFirst);
    }

    /**
     * Talk to an NPC and loop through dialog until complete.
     * Continues selecting options until no more dialog is available.
     * Original obfuscated method: g.b(String, String[])
     *
     * @param npcName The name of the NPC to talk to
     * @param options Array of dialog option text to choose from
     */
    public static void talkToNpcLoop(String npcName, String[] options) {
        // Start conversation if not already open
        if (!Dialog.isOpen()) {
            List<NPC> npcs = NPCs.getAll(npcName);
            if (npcs.size() > 0) {
                npcs.get(0).interact(TALK_TO_ACTION);
                Time.sleepUntil(Dialog::isOpen, DIALOG_TIMEOUT_MS);
            }
        }

        // Loop through dialog until done
        while (Dialog.isOpen() || Dialog.canContinue() || Dialog.canContinueNPC() || Dialog.isViewingOptions()) {
            try {
                AccBuilderSotf.c = STATUS_CHOOSING_DIALOG;

                if (Dialog.isEnterInputOpen()) {
                    Dialog.close();
                }

                if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
                    Dialog.chooseOption(options);
                }

                if (Dialog.canContinueNPC() || Dialog.canContinue()) {
                    Dialog.continueSpace();
                }

                Time.sleepTicks(1);
            } catch (Exception ignored) {
                // Continue on error
            }

            Time.sleepTicks(1);
            return; // Exit after one iteration in the cleaned version
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #talkToNpcLoop(String, String[])} instead
     */
    @Deprecated
    public static void b(String npcName, String[] options) {
        talkToNpcLoop(npcName, options);
    }

    /**
     * Check if any conversation window is currently visible.
     * Original obfuscated method: g.M()
     *
     * @return true if a conversation widget is visible
     */
    public static boolean isConversationOpen() {
        for (int widgetId : CONVERSATION_WIDGET_IDS) {
            List<Widget> widgets = Widgets.get(widgetId);
            if (!widgets.isEmpty() && widgets.get(0).isVisible()) {
                System.out.println("Found Conversation window: " + widgetId);
                return true;
            }
        }
        return false;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #isConversationOpen()} instead
     */
    @Deprecated
    public static boolean M() {
        return isConversationOpen();
    }

    // Prevent instantiation
    private DialogUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
