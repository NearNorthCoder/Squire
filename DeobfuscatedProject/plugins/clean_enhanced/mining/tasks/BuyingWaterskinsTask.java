/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Mining Plugin
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import net.runelite.api.NPC;
import net.runelite.api.ItemID;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;

/**
 * Task for buying waterskins from Shantay at the Shantay Pass.
 * Waterskins are required for mining in the desert (granite, sandstone).
 */
@TaskDesc(name="Buying waterskins", priority=20, blocking=true)
public class BuyingWaterskinsTask extends MiningTaskBase {

    private static final int SHANTAY_NPC_ID = 2897;
    private static final int WATERSKIN_EMPTY_ID = 11838;
    private static final int COINS_ID = 10842;
    private static final int WATERSKIN_FILLED_ID = 11812;

    private static final String BUY_PASS_ACTION = "Buy-pass";
    private static final String TRADE_ACTION = "Trade";

    @Inject
    protected BuyingWaterskinsTask(SquireMinerConfig config) {
        super(config);
    }

    @Override
    public boolean t() {
        // Don't buy waterskins if not in desert or we have enough
        if (z() || y() > 0) {
            return false;
        }

        // Find Shantay NPC
        NPC shantay = NPCs.getNearest(SHANTAY_NPC_ID);
        if (shantay == null) {
            return false;
        }

        // If we don't have waterskins in inventory, open shop/buy pass
        if (!Inventory.contains(WATERSKIN_EMPTY_ID)) {
            shantay.interact(BUY_PASS_ACTION);
            return true;
        }

        // If shop is open, handle buying/selling
        if (Shop.isOpen()) {
            // Sell coins if we have them (likely means we bought the pass)
            if (Inventory.contains(COINS_ID)) {
                Shop.sellFifty(COINS_ID);
                return true;
            }

            // Buy filled waterskins
            Shop.buyFifty(WATERSKIN_FILLED_ID);
            return true;
        }

        // Trade with Shantay to open shop
        shantay.interact(TRADE_ACTION);
        return true;
    }
}
