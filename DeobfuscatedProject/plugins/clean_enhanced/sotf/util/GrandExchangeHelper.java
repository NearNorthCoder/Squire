package gg.squire.sotf.util;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.util.ItemNameLookup;
import gg.squire.sotf.util.PurchaseRequest;
import gg.squire.sotf.util.NavigationHelper;
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
 * Utility class for managing Grand Exchange operations, banking, and item purchasing.
 *
 * <p>This helper provides methods for:
 * <ul>
 *   <li>Buying items from the Grand Exchange with price adjustments</li>
 *   <li>Selling items on the Grand Exchange</li>
 *   <li>Navigating to/from the Grand Exchange</li>
 *   <li>Managing purchase queues and lists</li>
 *   <li>Handling inventory and equipment</li>
 * </ul>
 */
public class GrandExchangeHelper {

    /** Location of the Grand Exchange in Varrock */
    public static final WorldPoint GRAND_EXCHANGE_LOCATION = new WorldPoint(3165, 3487, 0);

    /** List of item IDs to purchase */
    public static List<Integer> itemIdList = new ArrayList<>();

    /** List of quantities to purchase for each item */
    public static List<Integer> quantityList = new ArrayList<>();

    /** List of prices to pay for each item */
    public static List<Integer> priceList = new ArrayList<>();

    /**
     * Checks if inventory contains an item matching the given name.
     *
     * @param itemName The name of the item to search for
     * @return true if the item is found in inventory
     */
    public static boolean inventoryContainsItem(String itemName) {
        List<Item> items = Inventory.getAll();

        if (items.isEmpty()) {
            return false;
        }

        // Handle tablet items specially (remove (tablet) suffix)
        String searchName = itemName;
        if (itemName.contains("tablet")) {
            searchName = itemName.replace("(tablet)", "").trim();
        }

        for (Item item : items) {
            String currentItemName = item.getName();
            if (currentItemName != null) {
                if (currentItemName.contains(itemName) ||
                   (searchName != null && currentItemName.contains(searchName))) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Closes the currently open Grand Exchange tab.
     */
    public static void closeGrandExchangeTab() {
        Widget closeButton = Widgets.get(465, 2, 11);
        if (closeButton != null) {
            closeButton.interact("Close");
            Time.sleepTicks(2);
        }
    }

    /**
     * Processes a list of purchase requests by buying items from the Grand Exchange.
     *
     * <p>This method handles the entire purchase workflow:
     * <ul>
     *   <li>Navigates to the Grand Exchange</li>
     *   <li>Buys coins if needed</li>
     *   <li>Creates buy offers with price adjustments</li>
     *   <li>Collects completed offers</li>
     * </ul>
     *
     * @param purchaseList The list of items to purchase
     */
    public static void processPurchaseList(List<PurchaseRequest> purchaseList) {
        // Populate the purchase lists from the request objects
        if (!purchaseList.isEmpty() && itemIdList.isEmpty()) {
            for (PurchaseRequest request : purchaseList) {
                itemIdList.add(request.getItemId());
                quantityList.add(request.getQuantity());
                priceList.add(request.getPrice());
            }
        }

        // Check if we need to go to GE (no coins or far from GE)
        if (Inventory.getCount(995) < 1 ||
            Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) > 6) {

            if (Bank.isOpen()) {
                Time.sleepTicks(3);

                // Withdraw Ring of Wealth for teleport
                Predicate<Item> wealthRingPredicate = item ->
                    item.getName().toLowerCase().contains("ring of wealth (");

                if (Bank.contains(wealthRingPredicate) &&
                    !Inventory.contains(item -> item.getName().contains("wealth")) &&
                    Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) > 6) {
                    Bank.withdraw(wealthRingPredicate, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(3);
                    Time.sleepUntil(() -> Inventory.getCount(wealthRingPredicate) > 0, 5000);
                }

                // Withdraw Stamina potion if needed
                if (!Bank.contains(Teleporter.STAFF_IDS) &&
                    !Inventory.contains(item -> item.getName().contains("Stamina potion"))) {
                    if (Bank.contains(12625) &&
                        Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) > 6) {
                        Bank.withdraw(12625, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(3);
                        Time.sleepUntil(() -> Inventory.getCount(12625) > 0, 5000);
                    }
                }

                // Withdraw all coins
                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) <= 6) {
                    if (Inventory.getCount(995) < 1) {
                        Bank.withdrawAll(995, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(3);
                        Time.sleepUntil(() -> Inventory.contains(995), 5000);
                    }
                }
            }

            // Navigate to Grand Exchange if we're too far
            if (Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) > 6) {
                if (Bank.isOpen()) {
                    Bank.close();
                    Time.sleepTicks(4);
                }

                if (!Bank.isOpen()) {
                    // Use Ring of Wealth teleport
                    if (Inventory.contains(Teleporter.STAFF_IDS)) {
                        Inventory.getFirst(Teleporter.STAFF_IDS).interact("Wear");
                        Time.sleepTicks(2);
                    }

                    if (Equipment.contains(Teleporter.STAFF_IDS) &&
                        Players.getLocal().getAnimation() != -1) {
                        Equipment.getFirst(Teleporter.STAFF_IDS).interact("Grand Exchange");
                        Time.sleepTicks(3);
                    }

                    Movement.walkTo(GRAND_EXCHANGE_LOCATION);
                }
            }
        }

        // Open bank if we don't have coins
        if (!Bank.isOpen() &&
            Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) <= 6) {
            if (Inventory.getCount(995) < 1) {
                NavigationHelper.openBank();
            }
        }

        // Open GE if not already open
        if (!GrandExchange.isOpen()) {
            if (Inventory.getCount(995) > 0 &&
                Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) <= 6) {
                GrandExchange.open();
                Time.sleepUntil(GrandExchange::isOpen, 5000);
            }
        }

        // Process the buying queue
        if (GrandExchange.isOpen() && Inventory.getCount(995) > 0) {
            for (int i = 0; i < itemIdList.size(); i++) {
                String itemName = ItemNameLookup.getItemName(itemIdList.get(i));
                System.out.println("Buying " + itemName + " and itemID is: " + itemIdList.get(i));

                // Keep trying to buy until we have the item
                while (!inventoryContainsItem(itemName)) {
                    // Check for world type (members/f2p)
                    if (!Worlds.inMembersWorld()) {
                        System.out.println("In F2P, need to switch to a P2P world, ending script");
                        AccBuilderSotf.d = true;
                        return;
                    }

                    // Ensure GE is open
                    if (!GrandExchange.isOpen()) {
                        GrandExchange.open();
                    }

                    // Collect any completed offers
                    if (GrandExchange.canCollect()) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> !GrandExchange.canCollect(), 5000);
                    }

                    // Handle existing offers for this item
                    if (!GrandExchange.canCollect()) {
                        int currentItemId = itemIdList.get(i);
                        long existingOffers = GrandExchange.getOffers().stream()
                            .filter(offer -> offer.getItemId() == currentItemId)
                            .count();

                        if (existingOffers > 0 && existingOffers > 1) {
                            // Abort duplicate offers
                            GrandExchange.abortOffer(itemIdList.get(i));
                        }

                        if (existingOffers == 0) {
                            // Create new buy offer
                            if (!GrandExchange.isBuying() ||
                                GrandExchange.getItemId() != itemIdList.get(i)) {
                                createBuyOffer(itemIdList.get(i));
                            }

                            // Set quantity
                            if (GrandExchange.getItemId() == itemIdList.get(i) &&
                                GrandExchange.getQuantity() != quantityList.get(i)) {
                                GrandExchange.setQuantity(quantityList.get(i));
                            }

                            // Set price with adjustment
                            int requestedPrice = priceList.get(i);
                            int currentGuidePrice = 0;

                            // Get guide price
                            Widget priceWidget = Widgets.get(465, 24);
                            if (GrandExchange.isOpen() && GrandExchange.isBuying() &&
                                priceWidget != null && !priceWidget.getText().isEmpty()) {
                                currentGuidePrice = GrandExchange.getGuidePrice();
                                System.out.println("Guide price: " + currentGuidePrice +
                                                 "|Given price: " + priceList.get(i));
                            }

                            // Apply price adjustment if needed
                            if (currentGuidePrice >= requestedPrice) {
                                double multiplier = currentGuidePrice > 100 ? 0.1 : 0.3;
                                int adjustedPrice = (int) (currentGuidePrice +
                                                          currentGuidePrice * multiplier);
                                System.out.println("Increased price: " + adjustedPrice);

                                if (GrandExchange.getItemId() == itemIdList.get(i) &&
                                    GrandExchange.getPrice() != adjustedPrice) {
                                    GrandExchange.setPrice(adjustedPrice);
                                }

                                if (GrandExchange.getItemId() == itemIdList.get(i) &&
                                    GrandExchange.getPrice() == adjustedPrice) {
                                    GrandExchange.confirm();
                                }
                            } else {
                                // Use requested price
                                if (GrandExchange.getItemId() == itemIdList.get(i) &&
                                    GrandExchange.getPrice() != priceList.get(i)) {
                                    GrandExchange.setPrice(priceList.get(i));
                                }

                                if (GrandExchange.getItemId() == itemIdList.get(i) &&
                                    GrandExchange.getPrice() == priceList.get(i)) {
                                    GrandExchange.confirm();
                                }
                            }
                        }
                    }

                    // Navigate to GE if too far
                    if (Players.getLocal().getWorldLocation().distanceTo(GRAND_EXCHANGE_LOCATION) > 7) {
                        Movement.walkTo(GRAND_EXCHANGE_LOCATION);
                        Time.sleepTicks(1);
                    }

                    // Check if we received the item (various IDs for different forms)
                    boolean itemReceived = false;
                    if (itemIdList.get(i) == 11732 && Inventory.contains(11732)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 24242 && Inventory.contains(23987)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 10143 && Inventory.contains(10143)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 24501 && Inventory.contains(12158)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 23909 && Inventory.contains(23909)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 23909 && Inventory.contains(13652)) {
                        itemReceived = true;
                    } else if (itemIdList.get(i) == 28982 &&
                              (Inventory.contains("Camulet") ||
                               Inventory.contains("Camulet (4)"))) {
                        itemReceived = true;
                    }

                    // Remove from queue if received
                    if (itemReceived) {
                        itemIdList.remove(0);
                        quantityList.remove(0);
                        priceList.remove(0);
                        purchaseList.remove(0);
                        Time.sleepTicks(2);
                        break;
                    }

                    // Check if we actually have the item by name
                    if (inventoryContainsItem(itemName)) {
                        itemIdList.remove(0);
                        quantityList.remove(0);
                        priceList.remove(0);
                        purchaseList.remove(0);
                        break;
                    }

                    if (AccBuilderSotf.d) {
                        break;
                    }

                    Time.sleepTicks(3);
                }

                // Collect final offers
                if (GrandExchange.canCollect()) {
                    GrandExchange.collect();
                    Time.sleepUntil(() -> !GrandExchange.canCollect(), 5000);
                }

                // Remove items that we couldn't buy (probably not available)
                if (itemIdList.get(i) == 24242) {
                    itemIdList.remove(0);
                    quantityList.remove(0);
                    priceList.remove(0);
                    purchaseList.remove(0);
                }

                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Creates a buy offer for the specified item.
     *
     * @param itemId The item ID to buy
     */
    public static void createBuyOffer(int itemId) {
        if (!GrandExchange.isBuying()) {
            GrandExchange.createBuyOffer();
        }

        // Get the noted version of the item
        int notedItemId;
        if (Static.getClient().isItemDefinitionCached(itemId)) {
            notedItemId = Static.getClient().getItemComposition(itemId).getLinkedNoteId();
        } else {
            notedItemId = GameThread.invokeLater(() ->
                Static.getClient().getItemComposition(itemId).getLinkedNoteId());
        }

        // Search for the item if not already selected
        if (GrandExchange.getItemId() != -1 ||
            (GrandExchange.getItemId() != itemId && GrandExchange.getItemId() != notedItemId)) {
            if (!GrandExchange.isSearchingItem()) {
                GrandExchange.openItemSearch();
            }
            GrandExchange.setItem(itemId);
        }
    }

    /**
     * Sells items on the Grand Exchange.
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
            Time.sleepTicks(2);

            for (int i = 0; i < itemIds.size(); i++) {
                int itemId = itemIds.get(i);

                if (Inventory.getCount(itemId) > 0) {
                    // Create sell offer
                    if (!GrandExchange.isSelling()) {
                        GrandExchange.sell(itemId);
                        Time.sleepTicks(2);
                        final int index = i;
                        Time.sleepUntil(() ->
                            GrandExchange.getItemId() == itemIds.get(index), 10000);
                    }

                    // Set price to 1 gp
                    if (GrandExchange.isSelling()) {
                        if (GrandExchange.getPrice() != -1) {
                            GrandExchange.setPrice(1);
                            Time.sleepTicks(2);
                            Time.sleepUntil(() -> GrandExchange.getPrice() == 1, 10000);
                        }

                        // Confirm the offer
                        if (GrandExchange.getPrice() == 1) {
                            GrandExchange.confirm();
                            Time.sleepUntil(GrandExchange::canCollect, 10000);
                        }
                    }

                    // Collect the coins
                    if (GrandExchange.canCollect()) {
                        GrandExchange.collect();
                        Time.sleepUntil(() -> !GrandExchange.canCollect(), 5000);
                    }
                }
            }
        }
    }
}
