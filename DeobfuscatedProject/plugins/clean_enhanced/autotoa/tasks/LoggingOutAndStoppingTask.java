/*
 * Decompiled with CFR 0.152.
 *
 * Logout and Stop Task
 *
 * This task handles logging out and stopping the plugin when critical conditions are met.
 * It monitors chat messages for equipment/item failures (e.g., "has no charges").
 * When triggered:
 * - Stops the Squire plugin
 * - Forces the plugin to stop
 *
 * This prevents the plugin from continuing when equipment is unusable.
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Logging out and stopping", priority=0x7FFFFFFF, blocking=true)
public class LoggingOutAndStoppingTask extends TOAConfigurableTask {

    // Message to watch for in chat
    private static final String OUT_OF_CHARGES_MESSAGE = "has no charges";

    private boolean shouldStop;

    @Inject
    protected LoggingOutAndStoppingTask(Client client, TOAConfig config) {
        super(client, config);
        this.shouldStop = false;
    }

    @Override
    public boolean validate() {
        // Don't stop if flag not set
        if (!this.shouldStop) {
            return false;
        }

        // Stop the Squire plugin
        Squire.stop();

        // Force stop the plugin
        this.aY.forceStop();

        return true;
    }

    /**
     * Listens for chat messages indicating equipment failure
     * @param chatMessage the chat message event
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        // Check if message contains the out-of-charges warning
        if (chatMessage.getMessage().contains(OUT_OF_CHARGES_MESSAGE)) {
            // Set flag to trigger stop on next run
            this.shouldStop = true;
        }
    }
}
