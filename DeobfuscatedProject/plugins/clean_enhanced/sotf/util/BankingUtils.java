package gg.squire.sotf.util;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.sotf.util.DialogUtils;
import gg.squire.sotf.config.ItemIds;
import gg.squire.sotf.util.EquipmentManager;

/**
 * Utility class for banking operations and navigation in SOTF plugin.
 * Handles bank interactions, item withdrawals, and navigation between different bank locations.
 */
public class BankingUtils {

    // Grand Exchange area and center point
    public static final WorldArea GRAND_EXCHANGE_AREA = new WorldArea(3160, 3485, 7, 19, 0);
    public static final WorldPoint GE_CENTER = new WorldPoint(3165, 3489, 0);

    // Varrock area
    public static final WorldArea VARROCK_AREA = new WorldArea(3251, 3419, 97, 97, 0);

    // Falador area
    public static final WorldArea FALADOR_AREA = new WorldArea(2943, 3365, 54, 36, 0);

    // Draynor area
    public static final WorldArea DRAYNOR_AREA = new WorldArea(3077, 3241, 26, 55, 0);

    // Edgeville area
    public static final WorldArea EDGEVILLE_AREA = new WorldArea(3078, 3470, 92, 37, 0);

    // Lumbridge area
    public static final WorldArea LUMBRIDGE_AREA = new WorldArea(3202, 3209, 47, 62, 0);

    // Ardougne area
    public static final WorldArea ARDOUGNE_AREA = new WorldArea(2626, 3326, 5, 170, 0);

    // Falador West area
    public static final WorldArea FALADOR_WEST_AREA = new WorldArea(2943, 3365, 29, 66, 0);

    // Falador East bank point
    public static final WorldPoint FALADOR_EAST_POINT = new WorldPoint(3015, 3355, 0);

    // Grand Exchange bank point
    public static final WorldPoint GE_BANK_POINT = new WorldPoint(3163, 3485, 0);

    // NPC banker location (Emerald Benedict)
    public static final WorldPoint EMERALD_BENEDICT_POINT = new WorldPoint(3161, 3487, 1);

    /**
     * Withdraws all items from the provided array.
     * Withdraws 1 of each item with a 1 tick delay between withdrawals.
     *
     * @param itemIds Array of item IDs to withdraw
     */
    public static void withdrawItems(int[] itemIds) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws items from the provided array with a specified quantity.
     * Continues until all items are present in inventory.
     *
     * @param itemIds Array of item IDs to withdraw
     * @param quantity Amount of each item to withdraw
     */
    public static void withdrawItemsWithQuantity(int[] itemIds, int quantity) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws items from the provided array with a specified quantity.
     * Checks if each item is in inventory before moving to the next.
     *
     * @param itemIds Array of item IDs to withdraw
     * @param quantity Amount of each item to withdraw
     */
    public static void withdrawItemsFromArray(int[] itemIds, int quantity) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);

            if (!Inventory.contains(itemId)) {
                break;
            }
        }
    }

    /**
     * Withdraws a single item from the bank.
     *
     * @param itemId The item ID to withdraw
     * @param quantity The amount to withdraw
     */
    public static void withdrawItem(int itemId, int quantity) {
        if (!Bank.contains(itemId)) {
            System.out.println("[Plugin] Missing " + itemId + " item id");
        }

        if (Bank.contains(itemId)) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws an item in noted form from the bank.
     *
     * @param itemId The item ID to withdraw
     * @param quantity The amount to withdraw
     */
    public static void withdrawItemNoted(int itemId, int quantity) {
        Bank.withdraw(itemId, quantity, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(1);
    }

    /**
     * Opens the nearest available bank based on current player location.
     * Handles multiple bank types including GE, NPC bankers, bank chests, and bank booths.
     */
    public static void openNearestBank() {
        // Check if near Emerald Benedict (GE upper floor)
        if (Players.getLocal().getWorldLocation().distanceTo(EMERALD_BENEDICT_POINT) <= 14) {
            NPCs.getNearest("Emerald Benedict").interact("Bank");
            Time.sleepUntil(() -> Bank.isOpen(), 20000);
            return;
        }

        // Handle Grand Exchange banking
        if (BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(Players.getLocal().getWorldLocation()) ||
            GRAND_EXCHANGE_AREA.contains(Players.getLocal().getWorldLocation())) {
            GrandExchange.openBank();
            Time.sleepTicks(3);
            Time.sleepUntil(() -> Bank.isOpen(), 20000);
            return;
        }

        // Handle other bank locations (Castle Wars, Barbarian Outpost, Shantay Pass, Draynor, Ardougne)
        if (!BankLocation.CASTLE_WARS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) &&
            !BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(Players.getLocal().getWorldLocation()) &&
            !BankLocation.SHANTAY_PASS_BANK.getArea().contains(Players.getLocal().getWorldLocation()) &&
            !DRAYNOR_AREA.contains(Players.getLocal().getWorldLocation()) &&
            !ARDOUGNE_AREA.contains(Players.getLocal().getWorldLocation()) &&
            Players.getLocal().getWorldLocation().distanceTo(GE_BANK_POINT) <= 55) {

            TileObject bankChest = TileObjects.getNearest(Players.getLocal().getWorldLocation(), "Bank chest");
            if (bankChest != null) {
                // Try "Use" action on bank chest
                if (bankChest.hasAction("Use")) {
                    bankChest.interact("Use");
                    Time.sleepTicks(3);
                    Time.sleepUntil(() -> Bank.isOpen(), 20000);
                }

                // Try "Bank" action on bank chest
                if (bankChest.hasAction("Bank")) {
                    bankChest.interact("Bank");
                    Time.sleepTicks(3);
                    Time.sleepUntil(() -> Bank.isOpen(), 20000);
                }
            }
        }
        // Handle bank booth interactions
        else if (GRAND_EXCHANGE_AREA.contains(Players.getLocal().getWorldLocation()) &&
                Players.getLocal().getWorldLocation().distanceTo(EMERALD_BENEDICT_POINT) > 14) {

            TileObject bankBooth = TileObjects.getNearest(Players.getLocal().getWorldLocation(), "Bank booth");
            if (bankBooth != null) {
                bankBooth.interact("Bank");
                Time.sleepTicks(3);
                Time.sleepUntil(() -> Bank.isOpen(), 20000);
            }
        }
    }

    /**
     * Navigates to the specified bank location.
     * Handles teleportation, equipment wearing, and obstacle interactions.
     *
     * @param bankLocation The target bank location to navigate to
     */
    public static void navigateToBank(BankLocation bankLocation) {
        // Handle dialog interruptions
        if (Vars.getBit(6180) == 1 && Dialog.isOpen()) {
            DialogUtils.selectOption("Yes");
        }

        // Define key waypoints
        WorldPoint lumbridgeCastle = new WorldPoint(3222, 3217, 0);
        WorldPoint varrockSquare = new WorldPoint(3214, 3423, 0);
        WorldArea faladorPark = new WorldArea(2943, 3365, 27, 46, 0);

        // Handle teleport usage when far from key locations
        if (!Players.getLocal().getWorldLocation().equals(lumbridgeCastle) &&
            Players.getLocal().getWorldLocation().distanceTo(varrockSquare) > -1 &&
            !faladorPark.contains(Players.getLocal().getWorldLocation()) &&
            Inventory.contains(item -> item.getName().contains("teleport")) &&
            Players.getLocal().getAnimation() == -1) {

            Inventory.getFirst(item -> item.getName().contains("teleport")).interact("Break");
            Time.sleepTicks(6);
        }

        // Equip combat bracelet if in inventory
        if (Inventory.contains(ItemIds.COMBAT_BRACELET) && !Equipment.contains(ItemIds.COMBAT_BRACELET)) {
            Inventory.getFirst(ItemIds.COMBAT_BRACELET).interact("Wear");
            Time.sleepTicks(2);
        }

        // Equip skills necklace if in inventory
        if (Inventory.contains(ItemIds.SKILLS_NECKLACE) && !Equipment.contains(ItemIds.SKILLS_NECKLACE)) {
            Inventory.getFirst(ItemIds.SKILLS_NECKLACE).interact("Wear");
            Time.sleepTicks(2);
        }

        // Navigate to Varrock West Bank if not near GE center or in Falador area
        if (Players.getLocal().getWorldLocation().distanceTo(GE_CENTER) > 55 ||
            FALADOR_AREA.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            Time.sleepTicks(2);
            return;
        }

        // Navigate to Falador East Bank if conditions met
        if (Players.getLocal().getWorldLocation().distanceTo(FALADOR_EAST_POINT) > 40 ||
            VARROCK_AREA.contains(Players.getLocal().getWorldLocation()) ||
            EDGEVILLE_AREA.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            Time.sleepTicks(2);
            return;
        }

        // Navigate to Falador West Bank
        if (FALADOR_WEST_AREA.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            Time.sleepTicks(2);
            return;
        }

        // Navigate to Lumbridge if in that area
        if (LUMBRIDGE_AREA.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(EquipmentManager.LUMBRIDGE_SPAWN_POINT);
            Time.sleepTicks(2);
            return;
        }

        // Handle teleport usage and lever interaction
        WorldArea ardougneMarket = new WorldArea(2654, 3310, 6, 5, 0);
        WorldArea camelot = new WorldArea(2748, 3477, 21, 10, 0);

        if (!ardougneMarket.contains(Players.getLocal().getWorldLocation()) ||
            camelot.contains(Players.getLocal().getWorldLocation()) &&
            Inventory.contains(item -> item.getName().contains("teleport"))) {

            Inventory.getFirst(item -> item.getName().contains("teleport")).interact("Break");
            Time.sleepTicks(4);
        }

        // Interact with lever if in specific area
        WorldArea leverArea = new WorldArea(3839, 3537, 7, 6, 0);
        if (leverArea.contains(Players.getLocal().getWorldLocation())) {
            TileObject lever = TileObjects.getNearest("Lever");
            if (lever != null) {
                lever.interact("Pull");
                Time.sleepTicks(4);
            }
        }

        // Default: walk to the specified bank location
        Movement.walkTo(bankLocation);
        Time.sleepTicks(2);
    }
}
