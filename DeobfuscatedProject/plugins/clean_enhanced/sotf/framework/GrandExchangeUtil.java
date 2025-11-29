/*
 * Deobfuscated from class 'b' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * GrandExchangeUtil provides utility methods for Grand Exchange operations.
 * Handles buying and selling items, managing offers, and collecting items.
 *
 * Original obfuscated methods:
 *   a(List<d>) -> buyItems(List<ShopItem> items)
 *   a(String) -> hasItemInInventory(String itemName)
 *   a(int) -> setupBuyOffer(int itemId)
 *   b(List<Integer>) -> sellItems(List<Integer> itemIds)
 *   g() -> closeGrandExchange()
 */
package gg.squire.sotf.framework;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Utility class for Grand Exchange operations.
 * Provides methods for buying and selling items on the GE.
 */
public final class GrandExchangeUtil {

    // =====================================================================
    // Constants
    // =====================================================================

    /** Coins item ID */
    private static final int COINS_ID = 995;

    /** Distance threshold for GE operations */
    private static final int GE_DISTANCE_THRESHOLD = 10;

    /** Walk distance threshold */
    private static final int WALK_DISTANCE = 7;

    /** Tick delays */
    private static final int TICK_DELAY_SHORT = 2;
    private static final int TICK_DELAY_MEDIUM = 3;
    private static final int TICK_DELAY_LONG = 4;

    /** Timeouts */
    private static final int GE_TIMEOUT_MS = 5000;
    private static final int COLLECT_TIMEOUT_MS = 3000;

    /** High price threshold for adjusting buy price */
    private static final int HIGH_PRICE_THRESHOLD = 50000;

    /** GE widget IDs */
    private static final int GE_WIDGET_GROUP = 465;
    private static final int GE_PRICE_CHILD = 27;
    private static final int GE_CLOSE_CHILD = 11;

    /** Ring of wealth item ID */
    private static final int RING_OF_WEALTH_ID = 11980;

    // =====================================================================
    // Static Fields
    // =====================================================================

    /** Grand Exchange location */
    public static final WorldPoint GE_LOCATION = new WorldPoint(3165, 3486, 0);

    /** List of item IDs to buy */
    public static List<Integer> itemIdsToBuy = new ArrayList<>();

    /** List of quantities for each item */
    public static List<Integer> quantities = new ArrayList<>();

    /** List of prices/timeouts for each item */
    public static List<Integer> prices = new ArrayList<>();

    // Obfuscated field names preserved for compatibility
    public static final WorldPoint I = GE_LOCATION;
    public static List<Integer> J = itemIdsToBuy;
    public static List<Integer> K = quantities;
    public static List<Integer> L = prices;

    // =====================================================================
    // Public Methods
    // =====================================================================

    /**
     * Check if an item exists in the inventory by name.
     * Handles tablet items specially (removes "(tablet)" suffix).
     * Original obfuscated method: b.a(String)
     *
     * @param itemName The item name to search for
     * @return true if the item is in inventory
     */
    public static boolean hasItemInInventory(String itemName) {
        List<Item> items = Inventory.getAll();

        if (!items.isEmpty()) {
            String searchName = itemName;

            // Handle tablet items - remove "(tablet)" suffix
            if (itemName.contains("tablet")) {
                searchName = itemName.replace("(tablet)", "").trim();
            }

            for (Item item : items) {
                String name = item.getName();
                if (name != null) {
                    if (name.contains(itemName)) {
                        return true;
                    }
                    if (searchName != null && name.contains(searchName)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #hasItemInInventory(String)} instead
     */
    @Deprecated
    public static boolean a(String itemName) {
        return hasItemInInventory(itemName);
    }

    /**
     * Close the Grand Exchange window.
     * Original obfuscated method: b.g()
     */
    public static void closeGrandExchange() {
        Widget closeButton = Widgets.get(GE_WIDGET_GROUP, TICK_DELAY_SHORT, GE_CLOSE_CHILD);
        if (closeButton != null) {
            closeButton.interact("Close");
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #closeGrandExchange()} instead
     */
    @Deprecated
    public static void g() {
        closeGrandExchange();
    }

    /**
     * Setup a buy offer for a specific item.
     * Original obfuscated method: b.a(int)
     *
     * @param itemId The item ID to set up an offer for
     */
    public static void setupBuyOffer(int itemId) {
        // Open buy offer if not already buying
        if (!GrandExchange.isBuying()) {
            GrandExchange.createBuyOffer();
        }

        // Get the noted version ID if exists
        int noteId;
        if (Static.getClient().isItemDefinitionCached(itemId)) {
            noteId = Static.getClient().getItemComposition(itemId).getLinkedNoteId();
        } else {
            noteId = GameThread.invokeLater(() ->
                    Static.getClient().getItemComposition(itemId).getLinkedNoteId());
        }

        // Set item if not already selected
        if (GrandExchange.getItemId() == -1 ||
                (GrandExchange.getItemId() != itemId && GrandExchange.getItemId() != noteId)) {
            if (!GrandExchange.isSearchingItem()) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(itemId);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #setupBuyOffer(int)} instead
     */
    @Deprecated
    public static void a(int itemId) {
        setupBuyOffer(itemId);
    }

    /**
     * Buy items from the Grand Exchange.
     * Main method for processing GE buy orders.
     * Original obfuscated method: b.a(List<d>)
     *
     * @param items List of ShopItem objects to buy
     */
    public static void buyItems(List<ShopItem> items) {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Initialize lists if empty
        if (!items.isEmpty() && itemIdsToBuy.isEmpty()) {
            for (ShopItem item : items) {
                itemIdsToBuy.add(item.getItemId());
                quantities.add(item.getQuantity());
                prices.add(item.getTimeout());
            }
        }

        // Ensure we have coins and are near GE
        if (Inventory.getCount(COINS_ID) < 1 || playerLoc.distanceTo(GE_LOCATION) > GE_DISTANCE_THRESHOLD) {

            // Handle bank operations
            if (Bank.isOpen()) {
                Time.sleepTicks(TICK_DELAY_LONG);

                // Withdraw ring of wealth if needed
                Predicate<Item> ringPredicate = item -> item.getName().toLowerCase().contains("ring of wealth (");

                if (Bank.contains(ringPredicate) &&
                        !Inventory.contains(item -> item.getName().contains("wealth")) &&
                        playerLoc.distanceTo(GE_LOCATION) > GE_DISTANCE_THRESHOLD) {
                    Bank.withdraw(ringPredicate, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(TICK_DELAY_LONG);
                    Time.sleepUntil(() -> Inventory.getCount(ringPredicate) > 0, GE_TIMEOUT_MS);
                }

                // Withdraw backup ring if primary not found
                if (!Bank.contains(ItemIdArrays.RING_OF_WEALTH) &&
                        !Inventory.contains(item -> item.getName().contains("wealth"))) {
                    if (Bank.contains(RING_OF_WEALTH_ID) && playerLoc.distanceTo(GE_LOCATION) > GE_DISTANCE_THRESHOLD) {
                        Bank.withdraw(RING_OF_WEALTH_ID, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(TICK_DELAY_LONG);
                        Time.sleepUntil(() -> Inventory.getCount(RING_OF_WEALTH_ID) > 0, GE_TIMEOUT_MS);
                    }
                }

                // Withdraw coins if near GE
                if (playerLoc.distanceTo(GE_LOCATION) <= GE_DISTANCE_THRESHOLD) {
                    if (Inventory.getCount(COINS_ID) < 1) {
                        Bank.withdrawAll(COINS_ID, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(TICK_DELAY_LONG);
                        Time.sleepUntil(() -> Inventory.contains(COINS_ID), GE_TIMEOUT_MS);
                    }
                }
            }

            // Walk to GE if far away
            if (playerLoc.distanceTo(GE_LOCATION) > GE_DISTANCE_THRESHOLD) {
                if (Bank.isOpen()) {
                    Bank.close();
                    Time.sleepTicks(5);
                }

                if (!Bank.isOpen()) {
                    // Wear ring of wealth if in inventory
                    if (Inventory.contains(ItemIdArrays.RING_OF_WEALTH)) {
                        Inventory.getFirst(ItemIdArrays.RING_OF_WEALTH).interact("Wear");
                        Time.sleepTicks(TICK_DELAY_SHORT);
                    }

                    // Teleport using ring if equipped
                    if (Equipment.contains(ItemIdArrays.RING_OF_WEALTH) && Players.getLocal().getAnimation() != 714) {
                        Equipment.getFirst(ItemIdArrays.RING_OF_WEALTH).interact("Grand Exchange");
                        Time.sleepTicks(TICK_DELAY_LONG);
                    }

                    Movement.walkTo(GE_LOCATION);
                }
            }
        }

        // Open bank if needed
        if (!Bank.isOpen() && playerLoc.distanceTo(GE_LOCATION) <= GE_DISTANCE_THRESHOLD) {
            if (Inventory.getCount(COINS_ID) < 1) {
                BankingUtil.openNearestBank();
            }
        }

        // Open GE if needed
        if (!GrandExchange.isOpen()) {
            if (Inventory.getCount(COINS_ID) > 0 && playerLoc.distanceTo(GE_LOCATION) <= GE_DISTANCE_THRESHOLD) {
                GrandExchange.open();
                Time.sleepUntil(GrandExchange::isOpen, GE_TIMEOUT_MS);
            }
        }

        // Process buy orders
        if (GrandExchange.isOpen() && Inventory.getCount(COINS_ID) > 0) {
            for (int i = 0; i < itemIdsToBuy.size(); i++) {
                int itemId = itemIdsToBuy.get(i);
                String itemName = ItemNameUtil.getItemName(itemId);

                System.out.println("Buying " + itemName + " and itemID is: " + itemId);

                // Loop until item is purchased
                while (!hasItemInInventory(itemName)) {

                    // Check if we can collect
                    if (!GrandExchange.canCollect()) {
                        final int currentIndex = i;

                        // Check if we already have an offer for this item
                        boolean hasOffer = GrandExchange.getOffers().stream()
                                .anyMatch(offer -> offer.getItemId() == itemIdsToBuy.get(currentIndex));

                        // Abort existing offer if needed
                        if (hasOffer && GrandExchange.getOffers().stream()
                                .filter(offer -> offer.getItemId() == itemIdsToBuy.get(currentIndex))
                                .collect(Collectors.toList()).size() > 1) {
                            GrandExchange.abortOffer(itemIdsToBuy.get(i));
                        }

                        // Setup and confirm buy offer
                        if (!hasOffer) {
                            if (!GrandExchange.isBuying() || GrandExchange.getItemId() != itemIdsToBuy.get(i)) {
                                setupBuyOffer(itemIdsToBuy.get(i));
                            }

                            // Set quantity
                            if (GrandExchange.getItemId() == itemIdsToBuy.get(i) &&
                                    GrandExchange.getQuantity() != quantities.get(i)) {
                                GrandExchange.setQuantity(quantities.get(i));
                            }

                            // Get guide price and set price
                            int givenPrice = prices.get(i);
                            int guidePrice = 0;

                            Widget priceWidget = Widgets.get(GE_WIDGET_GROUP, GE_PRICE_CHILD);
                            if (GrandExchange.isOpen() && GrandExchange.isBuying() &&
                                    priceWidget != null && !priceWidget.getText().isEmpty()) {
                                guidePrice = GrandExchange.getGuidePrice();
                                System.out.println("Guide price: " + guidePrice + "|Given price: " + givenPrice);
                            }

                            // Adjust price based on guide price
                            if (guidePrice >= givenPrice) {
                                double multiplier = guidePrice > HIGH_PRICE_THRESHOLD ? 0.1 : 0.3;
                                int adjustedPrice = (int) (guidePrice + guidePrice * multiplier);
                                System.out.println("Increased price: " + adjustedPrice);

                                if (GrandExchange.getItemId() == itemIdsToBuy.get(i) &&
                                        GrandExchange.getPrice() != adjustedPrice) {
                                    GrandExchange.setPrice(adjustedPrice);
                                }

                                if (GrandExchange.getItemId() == itemIdsToBuy.get(i) &&
                                        GrandExchange.getPrice() == adjustedPrice) {
                                    GrandExchange.confirm();
                                }
                            } else {
                                if (GrandExchange.getItemId() == itemIdsToBuy.get(i) &&
                                        GrandExchange.getPrice() != prices.get(i)) {
                                    GrandExchange.setPrice(prices.get(i));
                                }

                                if (GrandExchange.getItemId() == itemIdsToBuy.get(i) &&
                                        GrandExchange.getPrice() == prices.get(i)) {
                                    GrandExchange.confirm();
                                }
                            }
                        }
                    }

                    // Walk to GE if too far
                    if (playerLoc.distanceTo(GE_LOCATION) > WALK_DISTANCE) {
                        Movement.walkTo(GE_LOCATION);
                        Time.sleepTicks(1);
                    }

                    // Check for F2P world
                    if (!Worlds.inMembersWorld()) {
                        System.out.println("In F2P, need to switch to a P2P world, ending script");
                        AccBuilderSotf.d = true;
                        return;
                    }

                    // Ensure GE is open
                    if (!GrandExchange.isOpen()) {
                        GrandExchange.open();
                    }

                    // Collect items
                    if (GrandExchange.canCollect()) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> !GrandExchange.canCollect(), GE_TIMEOUT_MS);
                    }

                    // Check for stop condition
                    if (hasItemInInventory(itemName) || AccBuilderSotf.d) {
                        break;
                    }

                    Time.sleepTicks(TICK_DELAY_LONG);
                }

                // Collect any remaining items
                if (GrandExchange.canCollect()) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> !GrandExchange.canCollect(), GE_TIMEOUT_MS);
                }

                // Remove processed item from lists
                if (hasItemInInventory(itemName)) {
                    itemIdsToBuy.remove(0);
                    quantities.remove(0);
                    prices.remove(0);
                    items.remove(0);
                }

                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #buyItems(List)} instead
     */
    @Deprecated
    public static void a(List<ShopItem> items) {
        buyItems(items);
    }

    /**
     * Sell items on the Grand Exchange.
     * Original obfuscated method: b.b(List<Integer>)
     *
     * @param itemIds List of item IDs to sell
     */
    public static void sellItems(List<Integer> itemIds) {
        // Open GE if not already open
        if (!GrandExchange.isOpen()) {
            if (Bank.isOpen()) {
                Bank.close();
            }
            if (!Bank.isOpen()) {
                GrandExchange.open();
            }
        }

        if (GrandExchange.isOpen()) {
            Time.sleepTicks(TICK_DELAY_SHORT);

            for (int i = 0; i < itemIds.size(); i++) {
                int itemId = itemIds.get(i);

                // Skip if item not in inventory
                if (Inventory.getCount(itemId) <= 0) {
                    continue;
                }

                // Create sell offer
                if (!GrandExchange.isSelling()) {
                    GrandExchange.sell(itemId);
                    Time.sleepTicks(TICK_DELAY_SHORT);

                    final int currentIndex = i;
                    Time.sleepUntil(() -> GrandExchange.getItemId() == itemIds.get(currentIndex), COLLECT_TIMEOUT_MS);
                }

                // Set minimum price and confirm
                if (GrandExchange.isSelling()) {
                    if (GrandExchange.getPrice() != -1) {
                        GrandExchange.setPrice(1);
                        Time.sleepTicks(TICK_DELAY_SHORT);
                        Time.sleepUntil(() -> GrandExchange.getPrice() == 1, COLLECT_TIMEOUT_MS);
                    }

                    if (GrandExchange.getPrice() == 1) {
                        GrandExchange.confirm();
                        Time.sleepUntil(GrandExchange::canCollect, COLLECT_TIMEOUT_MS);
                    }
                }

                // Collect GP
                if (GrandExchange.canCollect()) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> !GrandExchange.canCollect(), GE_TIMEOUT_MS);
                }
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #sellItems(List)} instead
     */
    @Deprecated
    public static void b(List<Integer> itemIds) {
        sellItems(itemIds);
    }

    // =====================================================================
    // Private Constructor
    // =====================================================================

    /** Prevent instantiation */
    private GrandExchangeUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    // =====================================================================
    // Inner Helper Class for Item Names (referenced by c.c())
    // =====================================================================

    /**
     * Helper class for getting item names from IDs.
     * This replaces the functionality from class 'c'.
     */
    public static class ItemNameUtil {
        /**
         * Get the name of an item by its ID.
         *
         * @param itemId The item ID
         * @return The item name
         */
        public static String getItemName(int itemId) {
            if (Static.getClient().isItemDefinitionCached(itemId)) {
                return Static.getClient().getItemComposition(itemId).getName();
            }
            return GameThread.invokeLater(() ->
                    Static.getClient().getItemComposition(itemId).getName());
        }
    }
}
