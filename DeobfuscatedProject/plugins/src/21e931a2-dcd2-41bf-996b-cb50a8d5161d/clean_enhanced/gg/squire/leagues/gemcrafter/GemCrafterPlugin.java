package gg.squire.leagues.gemcrafter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.widgets.Production;

/**
 * Leagues utility plugin for automated gem cutting with shop interaction.
 *
 * This plugin helps with gem crafting activities during Leagues by:
 * - Buying uncut gems from a shop
 * - Using a chisel on the gems to cut them
 * - Selling cut gems back to the shop
 * - Managing inventory and shop interactions automatically
 *
 * The plugin is designed to work with gem shops and will continuously buy,
 * cut, and sell gems in a loop.
 *
 * Usage:
 * 1. Have a chisel in your inventory
 * 2. Stand near a gem shop NPC (e.g., "Gem merchant")
 * 3. Enable the plugin
 * 4. The plugin will automatically buy gems, cut them, and sell them
 */
@PluginDescriptor(
        name = "[Leagues] Gem Crafter",
        enabledByDefault = false
)
@SquireUtil
public class GemCrafterPlugin extends SquirePlugin {

    // Decrypted string constants
    private static final String NPC_GEM_MERCHANT = "Gem merchant";
    private static final String ACTION_TRADE = "Trade";
    private static final String NPC_GEM_TRADER = "Gem trader";
    private static final String ACTION_TRADE_ALT = "Trade";

    /** Item ID for uncut gems to buy from shop */
    private static final int UNCUT_GEM_ID = 1623;  // Uncut sapphire

    /** Item ID for chisel used to cut gems */
    private static final int CHISEL_ID = 1755;

    /** Item ID for cut gems to sell */
    private static final int CUT_GEM_ID = 1607;  // Cut sapphire

    /** Number of gems to buy at once */
    private static final int GEMS_TO_BUY = 28;

    /** Cooldown timer to prevent spam clicking */
    private int actionCooldown;

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
     * Handles the gem buying, cutting, and selling logic.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Decrement cooldown
        int currentCooldown = this.actionCooldown;
        this.actionCooldown = currentCooldown - 1;

        // If cooldown is active, wait
        if (currentCooldown > 0) {
            return;
        }

        // If player is animating (cutting gems), reset cooldown
        if (Players.getLocal().isAnimating()) {
            this.actionCooldown = 4;
            return;
        }

        // If inventory is full, either cut gems or sell them
        if (Inventory.isFull()) {
            // Check if we have uncut gems to cut
            if (Inventory.contains(UNCUT_GEM_ID)) {
                // If production window is open, select previous option (cut all)
                if (Production.isOpen()) {
                    Production.choosePreviousOption();
                    this.actionCooldown = 4;
                    return;
                }

                // Use chisel on uncut gem to open production window
                Inventory.use(CHISEL_ID, UNCUT_GEM_ID);
                this.actionCooldown = 3;
                return;
            }

            // If shop is not open, open it to sell gems
            if (!Shop.isOpen()) {
                NPC gemMerchant = NPCs.getNearest(NPC_GEM_MERCHANT);
                if (gemMerchant != null) {
                    gemMerchant.interact(ACTION_TRADE);
                    this.actionCooldown = 4;
                    return;
                }
            }

            // Sell cut gems (sell 50 at a time)
            Shop.sellFifty(CUT_GEM_ID);
            return;
        }

        // If inventory is not full, buy more uncut gems
        if (!Shop.isOpen()) {
            NPC gemTrader = NPCs.getNearest(NPC_GEM_TRADER);
            if (gemTrader != null) {
                gemTrader.interact(ACTION_TRADE_ALT);
                this.actionCooldown = 4;
                return;
            }
        }

        // Buy uncut gems from the shop (one at a time, 28 times to fill inventory)
        for (int i = 0; i < GEMS_TO_BUY; i++) {
            Shop.buyOne(UNCUT_GEM_ID);
        }
    }
}
