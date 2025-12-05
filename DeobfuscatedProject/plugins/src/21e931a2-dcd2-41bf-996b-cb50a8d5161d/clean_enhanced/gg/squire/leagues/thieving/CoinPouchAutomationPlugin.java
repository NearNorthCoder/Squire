package gg.squire.leagues.thieving;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unelite.api.items.Inventory;

/**
 * Leagues utility plugin for automated thieving with coin pouch management.
 *
 * This plugin helps with thieving activities during Leagues by:
 * - Automatically pickpocketing the nearest NPC when not already pickpocketing
 * - Opening coin pouches when you have 28 or more in your inventory
 * - Continuing to pickpocket after opening pouches
 *
 * The plugin is designed to work with any NPC that has a "Pickpocket" action.
 * It will automatically manage coin pouches to prevent them from becoming full.
 *
 * Usage:
 * 1. Stand near NPCs you want to pickpocket
 * 2. Enable the plugin
 * 3. The plugin will automatically pickpocket and manage coin pouches
 */
@PluginDescriptor(
        name = "[Leagues] Pickpocket nearest",
        enabledByDefault = false
)
@SquireUtil
public class CoinPouchAutomationPlugin extends SquirePlugin {

    // Decrypted string constants
    private static final String ACTION_PICKPOCKET = "Pickpocket";
    private static final String ITEM_COIN_POUCH = "Coin pouch";
    private static final String ACTION_OPEN_POUCH = "Open-all";
    private static final String ACTION_PICKPOCKET_CONTINUE = "Pickpocket";

    /** Minimum number of coin pouches before opening them */
    private static final int MIN_POUCHES_TO_OPEN = 28;

    /**
     * Called when the plugin is started.
     * No initialization needed for this plugin.
     */
    @Override
    protected void onStart() {
    }

    /**
     * Called when the plugin is stopped.
     * No cleanup needed for this plugin.
     */
    @Override
    protected void onStop() {
    }

    /**
     * Returns the tasks that should be executed by this plugin.
     * This plugin doesn't use the task framework.
     *
     * @return empty array (no tasks)
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[0];
    }

    /**
     * Called on each game tick.
     * Handles the pickpocketing and coin pouch management logic.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Player localPlayer = Players.getLocal();
        Actor interacting = localPlayer.getInteracting();

        // If player is not currently interacting with an NPC (not pickpocketing)
        if (interacting == null) {
            // Find the nearest NPC with "Pickpocket" action
            NPC nearestNPC = NPCs.getNearest(npc ->
                    npc.hasAction(ACTION_PICKPOCKET)
            );

            if (nearestNPC == null) {
                return;
            }

            // Start pickpocketing the NPC
            nearestNPC.interact(ACTION_PICKPOCKET);
            return;
        }

        // Check if we have coin pouches that need to be opened
        Item coinPouch = Inventory.getFirst(ITEM_COIN_POUCH);

        if (coinPouch != null && coinPouch.getQuantity() >= MIN_POUCHES_TO_OPEN) {
            // Open all coin pouches
            coinPouch.interact(ACTION_OPEN_POUCH);

            // Resume pickpocketing
            interacting.interact(ACTION_PICKPOCKET_CONTINUE);
        }
    }
}
