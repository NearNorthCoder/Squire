/*
 * Deobfuscated from SandWorms
 * Package: gg.squire.basics.favor
 *
 * Plugin for collecting sandworms in the Hosidius region.
 * Used for gaining Hosidius house favor.
 *
 * Item IDs:
 * - 11876: Spade
 * - 11877: Sandworms (collected)
 * - 11878: Bucket
 *
 * World coordinates: (1783, 3491, 0) - Hosidius sandworm area
 */
package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;

/**
 * Sandworm collection plugin for Hosidius favor.
 * Automates the process of digging up sandworms and selling them.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Sandworm Digger",
    description="Collects sandworms",
    enabledByDefault=false
)
public class SandWorms extends SquirePlugin {

    /** Item ID: Spade for digging */
    private static final int ITEM_SPADE = 11876;

    /** Item ID: Bucket (possibly for collecting) */
    private static final int ITEM_BUCKET = 11877;

    /** Item ID: Collected sandworms */
    private static final int ITEM_SANDWORMS = 11878;

    /** World location: Sandworm digging area */
    private static final WorldPoint SANDWORM_LOCATION = new WorldPoint(1783, 3491, 0);

    /** Tile object name: Sandworm spawn point */
    private static final String OBJECT_SANDWORMS = "Sandworms spawn point";

    /** NPC name: Sandworm buyer/trader */
    private static final String NPC_TRADER = "Arnold";

    /** Action: Empty container */
    private static final String ACTION_EMPTY = "Empty";

    /** Action: Trade with NPC */
    private static final String ACTION_TRADE = "Trade";

    /** Action: Dig for sandworms */
    private static final String ACTION_DIG = "Dig";

    @Override
    protected void onStart() {
        // No initialization needed
    }

    @Override
    protected void onStop() {
        // No cleanup needed
    }

    /**
     * Main game tick handler.
     * Manages the sandworm collection cycle:
     * 1. Empty full containers
     * 2. Buy supplies from shop if needed
     * 3. Walk to sandworm area if not there
     * 4. Dig for sandworms
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Get inventory items
        Item bucket = Inventory.getFirst(ITEM_BUCKET);
        Item spade = Inventory.getFirst(ITEM_SPADE);
        Item sandworms = Inventory.getFirst(ITEM_SANDWORMS);

        // Get sandworm dig spot
        TileObject sandwormSpot = TileObjects.getNearest(OBJECT_SANDWORMS);

        // Empty full containers if needed
        if (bucket != null) {
            bucket.interact(ACTION_EMPTY);
        }

        // Handle shop purchases
        if (Shop.isOpen()) {
            Shop.buyFifty(ITEM_SPADE);
        }

        // Get trader NPC
        NPC trader = NPCs.getNearest(NPC_TRADER);

        // If missing spade, buy from trader
        if (spade == null) {
            if (sandwormSpot != null) {
                // Trade with trader if available
                if (trader != null) {
                    trader.interact(ACTION_TRADE);
                }

                // Walk to area if not there
                if (trader == null) {
                    Movement.walkTo(SANDWORM_LOCATION);
                    Time.sleep(2L);
                }
            }

            // Open shop if at trader
            if (bucket != null && sandwormSpot != null && !Shop.isOpen()) {
                trader.interact(ACTION_TRADE);
            }
        }

        // Dig for sandworms if ready
        if (spade != null && sandwormSpot != null && !Players.getLocal().isMoving()) {
            sandwormSpot.interact(ACTION_DIG);
            Time.sleep(1L);
        }
    }

    /**
     * No tasks defined - uses event-based logic instead.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }
}
