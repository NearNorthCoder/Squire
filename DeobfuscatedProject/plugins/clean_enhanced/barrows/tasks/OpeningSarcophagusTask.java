/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * This task handles opening sarcophagi to start fighting Barrows brothers.
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.tasks.GameEnum2;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

/**
 * Task for opening Barrows sarcophagi.
 * Handles dialogs and searching/opening the sarcophagus to trigger brother spawns.
 */
@TaskDesc(name="Opening sarcophagus", priority=250, blocking=true)
public class OpeningSarcophagusTask extends Task {

    private final SquireBarrows plugin;

    @Inject
    public OpeningSarcophagusTask(SquireBarrows plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean run() {
        if (!plugin.isInHouse()) {
            return false;
        }

        // Handle any dialogs that appear
        if (Dialog.isOpen()) {
            plugin.incrementBrothersKilledCount();
            if (plugin.getBrothersKilledCount() >= 6) {
                DialogOption[] options = new DialogOption[]{DialogOption.PLAIN_CONTINUE, DialogOption.CHAT_OPTION_ONE};
                Dialog.invokeDialog(options);
                return true;
            }
            return false;
        }

        // Don't open if banking or if less than 6 brothers killed
        if (plugin.isBanking() && plugin.getBrothersKilledCount() != 6) {
            return false;
        }

        // Don't open if we just opened current brother and killed count is low
        if (plugin.getLastOpenedBrother() == plugin.getCurrentBrother() && plugin.getBrothersKilledCount() < 6) {
            return false;
        }

        // Check if a brother NPC is already active
        NPC brotherNpc = NPCs.getNearest(GameEnum2::isBrother);
        if (brotherNpc != null && brotherNpc.getInteracting() == Players.getLocal()) {
            return false;
        }

        return openSarcophagus();
    }

    /**
     * Opens the nearest sarcophagus
     */
    private static boolean openSarcophagus() {
        TileObject sarcophagus = TileObjects.getNearest("Sarcophagus");
        if (sarcophagus == null) {
            return false;
        }

        sarcophagus.interact("Search", "Open");
        return true;
    }
}
