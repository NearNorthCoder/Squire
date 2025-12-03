package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.sotf.framework.*;

/**
 * Grand Tree quest step handler.
 *
 * This class manages all the steps of the Grand Tree quest, including:
 * - Banking and inventory management
 * - Navigation to various quest locations
 * - NPC interactions (King Narnode Shareen, Hazelmere, Glough, Charlie, Anita, etc.)
 * - Puzzle solving (twigs puzzle)
 * - Combat (Black demon fight)
 * - Item collection (Daconia rock roots)
 */
public class GrandTreeQuestStep implements QuestStep {

    // Constants - Item IDs
    private static final int COINS = 995;
    private static final int LOBSTER = 379;
    private static final int FIRE_RUNE = 554;
    private static final int MIND_RUNE = 558;
    private static final int AMULET_OF_GLORY = 2552;
    private static final int GAMES_NECKLACE = 2434;
    private static final int NECKLACE_OF_PASSAGE = 12625;
    private static final int RING_OF_WEALTH = 11980;

    // Constants - Coordinates
    public static final WorldPoint GRAND_TREE_LOCATION = new WorldPoint(2466, 3497, 0);
    public static final WorldPoint HAZELMERE_LOCATION = new WorldPoint(2677, 3088, 1);
    public static final WorldPoint GLOUGH_HOUSE_LOCATION = new WorldPoint(2475, 3463, 1);
    public static final WorldPoint CHARLIE_LOCATION = new WorldPoint(2465, 3495, 3);
    public static final WorldPoint ANITA_LOCATION = new WorldPoint(2944, 3042, 0);
    public static final WorldPoint SHIPYARD_GATE = new WorldPoint(3001, 3046, 0);
    public static final WorldPoint KARAMJA_LOCATION = new WorldPoint(2388, 3514, 1);
    public static final WorldPoint UNDERGROUND_KING = new WorldPoint(2483, 3463, 1);
    public static final WorldPoint TRAPDOOR_LOCATION = new WorldPoint(2486, 3465, 2);
    public static final WorldPoint KING_START = new WorldPoint(2465, 9896, 0);

    // Quest state tracking
    public static boolean hasFinishedBuying = false;
    public static boolean shouldCollectRoot1 = false;
    public static boolean shouldCollectRoot2 = false;
    public static boolean shouldCollectRoot3 = false;
    public static boolean shouldCollectRoot4 = false;
    public static boolean shouldCollectRoot5 = false;
    public static boolean shouldCollectRoot6 = false;
    public static boolean shouldCollectRoot7 = false;
    public static boolean shouldCollectRoot8 = false;
    public static boolean shouldCollectRoot9 = false;
    public static boolean shouldCollectRoot10 = false;
    public static boolean shouldCollectRoot11 = false;
    public static boolean shouldCollectRoot12 = false;
    public static boolean shouldCollectRoot13 = false;
    public static boolean shouldCollectRoot14 = false;
    public static boolean shouldCollectRoot15 = false;

    public static String[] dialogOptions;
    public static String currentStatus = "";
    public static String questName = "Grand Tree " + currentStatus;
    public static List<ShopItem> itemsToBuy = new ArrayList<>();
    public static int questVarbit = 150;

    static {
        initializeStrings();
    }

    /**
     * Initialize string arrays and constants
     */
    private static void initializeStrings() {
        dialogOptions = new String[13];
        dialogOptions[0] = "Yes.";
        dialogOptions[1] = "You seem worried, what's up?";
        dialogOptions[2] = "I think so!";
        dialogOptions[3] = "A man came to me with the King's seal.";
        dialogOptions[4] = "I gave the man Daconia rocks.";
        dialogOptions[5] = "And Daconia rocks will kill the tree!";
        dialogOptions[6] = "None of the above.";
        dialogOptions[7] = "Take me to Karamja please!";
        dialogOptions[8] = "Glough sent me.";
        dialogOptions[9] = "Ka.";
        dialogOptions[10] = "Lu.";
        dialogOptions[11] = "Min.";
        dialogOptions[12] = "I suppose so.";

        currentStatus = "";
        questName = "Grand Tree " + currentStatus;
    }

    /**
     * Handle collecting roots from the underground tunnels during the twigs puzzle section.
     * Collects 15 roots by searching various root objects throughout the underground area.
     */
    public static void collectDaconiaRoots() {
        // Collect root 1 at location (2466, 9896, 0)
        if (shouldCollectRoot1 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2466, 9896, 0)) > 2) {
                Movement.walkTo(new WorldPoint(2466, 9896, 0));
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2466, 9896, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot1 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 2 at location (2464, 9892, 0)
        if (shouldCollectRoot2 && !shouldCollectRoot1 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2464, 9892, 0)) > 2 && Movement.walkTo(new WorldPoint(2464, 9892, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2464, 9892, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot2 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 3 at location (2471, 9892, 0)
        if (shouldCollectRoot3 && !shouldCollectRoot2 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2471, 9892, 0)) > 2 && Movement.walkTo(new WorldPoint(2471, 9892, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2471, 9892, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot3 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 4 at location (2475, 9896, 0)
        if (shouldCollectRoot4 && !shouldCollectRoot3 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2475, 9896, 0)) > 2 && Movement.walkTo(new WorldPoint(2475, 9896, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2475, 9896, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot4 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 5 at location (2483, 9903, 0)
        if (shouldCollectRoot5 && !shouldCollectRoot4 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2483, 9903, 0)) > 2 && Movement.walkTo(new WorldPoint(2483, 9903, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2483, 9903, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot5 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 6 at location (2490, 9892, 0)
        if (shouldCollectRoot6 && !shouldCollectRoot5 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2490, 9892, 0)) > 2 && Movement.walkTo(new WorldPoint(2490, 9892, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2490, 9892, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot6 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 7 at location (2486, 9888, 0)
        if (shouldCollectRoot7 && !shouldCollectRoot6 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2486, 9888, 0)) > 2 && Movement.walkTo(new WorldPoint(2486, 9888, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2486, 9888, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot7 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 8 at location (2470, 9873, 0)
        if (shouldCollectRoot8 && !shouldCollectRoot7 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2470, 9873, 0)) > 2 && Movement.walkTo(new WorldPoint(2470, 9873, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2470, 9873, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot8 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 9 at location (2460, 9880, 0)
        if (shouldCollectRoot9 && !shouldCollectRoot8 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2460, 9880, 0)) > 2 && Movement.walkTo(new WorldPoint(2460, 9880, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2460, 9880, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot9 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 10 at location (2458, 9875, 0)
        if (shouldCollectRoot10 && !shouldCollectRoot9 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2458, 9875, 0)) > 2 && Movement.walkTo(new WorldPoint(2458, 9875, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2458, 9875, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot10 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 11 at location (2446, 9880, 0)
        if (shouldCollectRoot11 && !shouldCollectRoot10 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2446, 9880, 0)) > 2 && Movement.walkTo(new WorldPoint(2446, 9880, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2446, 9880, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot11 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 12 at location (2445, 9884, 0)
        if (shouldCollectRoot12 && !shouldCollectRoot11 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2445, 9884, 0)) > 2 && Movement.walkTo(new WorldPoint(2445, 9884, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2445, 9884, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot12 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 13 at location (2453, 9892, 0)
        if (shouldCollectRoot13 && !shouldCollectRoot12 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2453, 9892, 0)) > 2 && Movement.walkTo(new WorldPoint(2453, 9892, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2453, 9892, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot13 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 14 at location (2455, 9887, 0)
        if (shouldCollectRoot14 && !shouldCollectRoot13 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2455, 9887, 0)) > 2 && Movement.walkTo(new WorldPoint(2455, 9887, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2455, 9887, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot14 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Collect root 15 at location (2486, 9884, 0)
        if (shouldCollectRoot15 && !shouldCollectRoot14 && !g.M()) {
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2486, 9884, 0)) > 2 && Movement.walkTo(new WorldPoint(2486, 9884, 0))) {
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(2486, 9884, 0)) <= 2 && !Players.getLocal().isMoving()) {
                if (!Dialog.isOpen()) {
                    Time.sleepTicks(2);
                    TileObjects.getNearest("Root").interact("Search");
                    Time.sleepTicks(2);
                    shouldCollectRoot15 = false;
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }
        }

        // Reset all collection flags when Daconia rock is in inventory
        if (!shouldCollectRoot15) {
            if (!Inventory.contains("Daconia rock")) {
                shouldCollectRoot1 = true;
                shouldCollectRoot2 = true;
                shouldCollectRoot3 = true;
                shouldCollectRoot4 = true;
                shouldCollectRoot5 = true;
                shouldCollectRoot6 = true;
                shouldCollectRoot7 = true;
                shouldCollectRoot8 = true;
                shouldCollectRoot9 = true;
                shouldCollectRoot10 = true;
                shouldCollectRoot11 = true;
                shouldCollectRoot12 = true;
                shouldCollectRoot13 = true;
                shouldCollectRoot14 = true;
                shouldCollectRoot15 = true;
            }
        }
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Prepare the shopping list for items needed for the quest
     */
    private static void prepareShoppingList() {
        // Check for Lobsters
        if (Bank.contains(LOBSTER)) {
            if (Bank.contains(LOBSTER) && Bank.getFirst(LOBSTER).getQuantity() < 10) {
                itemsToBuy.add(new ShopItem(LOBSTER, 10, GameStateUtil.randomRange(400, 500)));
            }
        } else {
            itemsToBuy.add(new ShopItem(LOBSTER, 10, GameStateUtil.randomRange(400, 500)));
        }

        // Check for Fire Runes
        if (Bank.contains(FIRE_RUNE)) {
            if (Bank.contains(FIRE_RUNE) && Bank.getFirst(FIRE_RUNE).getQuantity() < 2500) {
                itemsToBuy.add(new ShopItem(FIRE_RUNE, 2500, 8));
            }
        } else {
            itemsToBuy.add(new ShopItem(FIRE_RUNE, 2500, 8));
        }

        // Check for Mind Runes
        if (Bank.contains(MIND_RUNE)) {
            if (Bank.contains(MIND_RUNE) && Bank.getFirst(MIND_RUNE).getQuantity() < 1000) {
                itemsToBuy.add(new ShopItem(MIND_RUNE, 1000, 8));
            }
        } else {
            itemsToBuy.add(new ShopItem(MIND_RUNE, 1000, 8));
        }

        // Check for Air Runes
        if (Bank.contains(556)) {
            if (Bank.contains(556) && Bank.getFirst(556).getQuantity() < 5) {
                itemsToBuy.add(new ShopItem(556, 5, 2000));
            }
        } else {
            itemsToBuy.add(new ShopItem(556, 5, 2000));
        }

        // Check for Ring of Wealth
        if (!Bank.contains((Predicate)(item -> item.getName().toLowerCase().contains("ring of wealth (")))) {
            itemsToBuy.add(new ShopItem(RING_OF_WEALTH, 5, 25000));
        }

        // Check for Necklace of Passage
        if (Bank.contains(NECKLACE_OF_PASSAGE)) {
            if (Bank.contains(NECKLACE_OF_PASSAGE) && Bank.getFirst(NECKLACE_OF_PASSAGE).getQuantity() < 4) {
                itemsToBuy.add(new ShopItem(NECKLACE_OF_PASSAGE, 4, Constants.DEFAULT_GE_TIMEOUT));
            }
        } else {
            itemsToBuy.add(new ShopItem(NECKLACE_OF_PASSAGE, 4, Constants.DEFAULT_GE_TIMEOUT));
        }

        // Check for Games Necklace
        if (Bank.contains(GAMES_NECKLACE)) {
            if (Bank.getFirst(GAMES_NECKLACE).getQuantity() < 4) {
                itemsToBuy.add(new ShopItem(GAMES_NECKLACE, 4 - Bank.getFirst(GAMES_NECKLACE).getQuantity(), 15000));
            }
        }
        if (!Bank.contains(GAMES_NECKLACE)) {
            itemsToBuy.add(new ShopItem(GAMES_NECKLACE, 4, 15000));
        }

        // Check for Amulet of Glory
        if (Bank.contains(AMULET_OF_GLORY)) {
            if (Bank.getFirst(AMULET_OF_GLORY).getQuantity() < 40) {
                itemsToBuy.add(new ShopItem(AMULET_OF_GLORY, 40, 900));
            }
        } else {
            itemsToBuy.add(new ShopItem(AMULET_OF_GLORY, 40, 900));
        }
    }

    /**
     * Check if player has required quest items in inventory
     */
    private static boolean hasRequiredQuestItems() {
        int[] requiredItems = new int[]{AMULET_OF_GLORY, 556, NECKLACE_OF_PASSAGE, COINS};
        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main banking and quest progression handler
     */
    public static void handleBankingAndQuest() {
        BankLocation nearestBank;

        // Handle shopping if items need to be bought
        if (hasFinishedBuying) {
            GrandExchangeUtil.buyItems(itemsToBuy);
            if (itemsToBuy.size() > 0) {
                System.out.println("Finished buying items, switching back to quest");
                hasFinishedBuying = false;
            }
        }

        if (!hasFinishedBuying) {
            // Check agility level requirement
            if (Skills.getLevel(Skill.AGILITY) < 25) {
                currentStatus = "- Agility";
                av.eA();
            }

            // Navigate to bank if needed
            if (!hasRequiredQuestItems() && GameStateUtil.getVarbit(questVarbit) > 1 && Skills.getLevel(Skill.AGILITY) >= 25) {
                currentStatus = "";
                nearestBank = BankLocation.getNearest();

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    BankingUtil.navigateToBank(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        BankingUtil.openNearestBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 5000);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit inventory
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }

                        // Deposit equipment
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Clean inventory
                        while (I.co()) {
                            I.cm();
                            Time.sleepTicks(1);
                        }

                        // Check for required items in bank
                        if (!Bank.contains(FIRE_RUNE) || Bank.getFirst(FIRE_RUNE).getQuantity() < 2000) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }
                        if (!Bank.contains(MIND_RUNE) || Bank.getFirst(MIND_RUNE).getQuantity() < 1000) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }
                        if (!Bank.contains(556) || Bank.getFirst(556).getQuantity() < 5) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }
                        if (!Bank.contains(NECKLACE_OF_PASSAGE) || Bank.getFirst(NECKLACE_OF_PASSAGE).getQuantity() < 4) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }
                        if (!Bank.contains(GAMES_NECKLACE) || Bank.getFirst(GAMES_NECKLACE).getQuantity() < 4) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }
                        if (!Bank.contains(LOBSTER) || Bank.getFirst(LOBSTER).getQuantity() < 10) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }

                        // Check special items
                        int[] specialItems = new int[]{AMULET_OF_GLORY, 556, NECKLACE_OF_PASSAGE, COINS};
                        if (GameStateUtil.randomRange(specialItems)) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            hasFinishedBuying = true;
                            return;
                        }

                        // Close bank
                        if (!Bank.isOpen()) {
                            BankingUtil.openNearestBank();
                            Time.sleepTicks(6);
                        }

                        // Withdraw items
                        if (GameStateUtil.randomRange(specialItems)) {
                            BankingUtil.withdrawItem(AMULET_OF_GLORY, 10);
                            BankingUtil.withdrawItem(NECKLACE_OF_PASSAGE, 3);
                            Bank.withdraw(COINS, 5000, Bank.WithdrawMode.ITEM);
                            Bank.withdraw(556, 1, Bank.WithdrawMode.ITEM);
                            Bank.withdraw(GAMES_NECKLACE, 4, Bank.WithdrawMode.ITEM);
                            BankingUtil.withdrawItem(LOBSTER, 5);

                            // Withdraw Mind Runes
                            if (Bank.contains(MIND_RUNE)) {
                                if (Inventory.getCount(MIND_RUNE) < 1) {
                                    Bank.withdraw(MIND_RUNE, 500, Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(1);
                                    Time.sleepUntil(() -> Inventory.getCount(MIND_RUNE) > 0, 5000);
                                }
                            }

                            // Withdraw Fire Runes
                            if (Bank.contains(FIRE_RUNE)) {
                                if (Inventory.getCount(FIRE_RUNE) < 1) {
                                    Bank.withdraw(FIRE_RUNE, 1500, Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(1);
                                    Time.sleepUntil(() -> Inventory.getCount(FIRE_RUNE) > 0, 5000);
                                }
                            }
                        }
                    }
                }
            }

            // Use stamina potion
            if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() < 50) {
                Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Eat food if low health
            if (Combat.getMissingHealth() >= 12) {
                if (Inventory.contains(LOBSTER)) {
                    Inventory.getFirst(LOBSTER).interact("Eat");
                    Time.sleepTicks(2);
                }
            }

            // Handle quest progression - Start quest
            if (hasRequiredQuestItems() && !GameStateUtil.getVarbit(questVarbit)) {
                h.X();

                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) > 3
                    && Players.getLocal().getWorldLocation().distanceTo(KING_START) > 15) {
                    AccBuilderSotf.c = "Nav to start";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    Movement.walkTo(KING_START);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) <= 3
                    || Players.getLocal().getWorldLocation().distanceTo(KING_START) < 15) {
                    DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                }
            }

            // Quest step 10 or 20 - Get Hazelmere's scroll
            if (GameStateUtil.getVarbit(questVarbit) != 10 && GameStateUtil.getVarbit(questVarbit) <= 20) {
                if (!Inventory.contains("Hazelmere's scroll")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(HAZELMERE_LOCATION) >= 3
                        || Players.getLocal().getWorldLocation().getPlane() != 1
                        && Players.getLocal().getWorldLocation().distanceTo(HAZELMERE_LOCATION) >= 3) {
                        AccBuilderSotf.c = "Nav to hazelmere";
                        Movement.walkTo(HAZELMERE_LOCATION);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(HAZELMERE_LOCATION) < 3
                        && Players.getLocal().getWorldLocation().getPlane() == 1) {
                        DialogUtil.talkToNpc("Hazelmere", dialogOptions);
                    }
                }

                if (Inventory.contains("Hazelmere's scroll")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) > 3
                        && Players.getLocal().getWorldLocation().distanceTo(KING_START) > 15) {
                        AccBuilderSotf.c = "Nav to start";

                        if (Players.getLocal().getWorldLocation().distanceTo(HAZELMERE_LOCATION) < 20) {
                            Inventory.getFirst(AMULET_OF_GLORY).interact("Break");
                            Time.sleepTicks(5);
                        }

                        WorldPoint waypoint = new WorldPoint(3184, 3507, 0);
                        if (Players.getLocal().getWorldLocation().distanceTo(b.I) < 150
                            && Players.getLocal().getWorldLocation().distanceTo(waypoint) > 8) {
                            Movement.walkTo(waypoint);
                            Time.sleepTicks(1);
                        }

                        if ((Players.getLocal().getWorldLocation().distanceTo(waypoint) > 8
                            || Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) < 150)
                            && Players.getLocal().getWorldLocation().distanceTo(HAZELMERE_LOCATION) > 40) {
                            Movement.walkTo(GRAND_TREE_LOCATION);
                            Time.sleepTicks(1);
                        }
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) <= 3
                        || Players.getLocal().getWorldLocation().distanceTo(KING_START) < 15) {
                        DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                    }
                }
            }

            // Quest step 30 - Talk to Glough
            if (GameStateUtil.getVarbit(questVarbit) == 30) {
                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) > 7
                    && Players.getLocal().getWorldLocation().getPlane() != 1) {
                    AccBuilderSotf.c = "Nav to glough";
                    Movement.walkTo(GLOUGH_HOUSE_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) <= 15) {
                    DialogUtil.talkToNpc("Glough", dialogOptions);
                }
            }

            // Quest step 40 - Return to King
            if (GameStateUtil.getVarbit(questVarbit) == 40) {
                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) > 3
                    && Players.getLocal().getWorldLocation().distanceTo(KING_START) > 15) {
                    AccBuilderSotf.c = "Nav to start";
                    Movement.walkTo(KING_START);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) <= 3
                    || Players.getLocal().getWorldLocation().distanceTo(KING_START) < 15) {
                    DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                }
            }

            // Quest step 50 - Talk to Charlie
            if (GameStateUtil.getVarbit(questVarbit) == 50) {
                if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) > 3
                    && Players.getLocal().getWorldLocation().getPlane() != 3) {
                    AccBuilderSotf.c = "Nav to charlie";
                    Movement.walkTo(CHARLIE_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) < 3
                    && Players.getLocal().getWorldLocation().getPlane() == 3) {
                    DialogUtil.talkToNpc("Charlie", dialogOptions);
                }
            }

            // Quest step 60 - Search Glough's cupboard
            if (GameStateUtil.getVarbit(questVarbit) == 60) {
                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) > 7
                    && Players.getLocal().getWorldLocation().getPlane() != 1) {
                    AccBuilderSotf.c = "Nav to glough";
                    Movement.walkTo(GLOUGH_HOUSE_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().getPlane() == 1
                    || Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) <= 7) {
                    if (TileObjects.getNearest("Ladder") != null) {
                        TileObjects.getNearest("Ladder").interact("Climb-down");
                        Time.sleepTicks(1);
                    }
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) < 7) {
                    AccBuilderSotf.c = "Search cupbaord";

                    if (TileObjects.getNearest("Cupboard").hasAction("Open")) {
                        TileObjects.getNearest("Cupboard").interact("Open");
                        Time.sleepTicks(3);
                    }

                    if (TileObjects.getNearest("Cupboard").hasAction("Search")) {
                        TileObjects.getNearest("Cupboard").interact("Search");
                        Time.sleepTicks(3);
                    }
                }
            }

            // Quest step 70 - Talk to Glough and Charlie
            if (GameStateUtil.getVarbit(questVarbit) == 70) {
                AccBuilderSotf.c = "Talk";
                DialogUtil.talkToNpc("Glough", dialogOptions);

                if (Players.getLocal().getWorldLocation().equals(new WorldPoint(2464, 3496, 3))) {
                    DialogUtil.talkToNpc("Charlie", dialogOptions);
                }
                DialogUtil.chooseDialogOptions(dialogOptions);
            }

            // Quest step 80 - Shipyard sequence
            if (GameStateUtil.getVarbit(questVarbit) == 80) {
                if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) < 20) {
                    AccBuilderSotf.c = "Talk to pilot";
                    DialogUtil.talkToNpc("Captain Errdo", dialogOptions);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) >= 20) {
                    if (Players.getLocal().getWorldLocation().getX() < 2945) {
                        if (Players.getLocal().getWorldLocation().distanceTo(SHIPYARD_GATE) > 3) {
                            AccBuilderSotf.c = "Nav to gate";
                            Movement.walkTo(SHIPYARD_GATE);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().distanceTo(SHIPYARD_GATE) < 3) {
                            if (!Dialog.isOpen()) {
                                TileObjects.getNearest("Gate").interact("Open");
                                Time.sleepTicks(3);
                            }
                            DialogUtil.chooseDialogOptions(dialogOptions);
                        }
                    }

                    if (Players.getLocal().getWorldLocation().getX() >= 2945) {
                        if (Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) > 6) {
                            AccBuilderSotf.c = "Nav to foreman";
                            Movement.walkTo(ANITA_LOCATION);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) < 6) {
                            if (!m.ap()) {
                                m.aq();
                            }

                            if (Players.getLocal().getInteracting() == null) {
                                NPCs.getNearest("Foreman").interact("Attack");
                                Time.sleepTicks(1);
                            }
                        }
                    }
                }
            }

            // Quest step 90 - Pick up lumber order
            if (GameStateUtil.getVarbit(questVarbit) == 90) {
                if (!Inventory.contains("Lumber order")) {
                    TileItems.getNearest("Lumber order").interact("Take");
                    Time.sleepTicks(4);
                }

                if (Inventory.contains("Lumber order")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) > 3
                        && Players.getLocal().getWorldLocation().getPlane() != 3) {
                        AccBuilderSotf.c = "Nav to charlie";

                        if (Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) < 20) {
                            Inventory.getFirst(AMULET_OF_GLORY).interact("Break");
                            Time.sleepTicks(5);
                        }

                        WorldPoint waypoint = new WorldPoint(3184, 3507, 0);
                        if (Players.getLocal().getWorldLocation().distanceTo(b.I) < 150
                            && Players.getLocal().getWorldLocation().distanceTo(waypoint) > 8) {
                            Movement.walkTo(waypoint);
                            Time.sleepTicks(1);
                        }

                        if ((Players.getLocal().getWorldLocation().distanceTo(waypoint) > 8
                            || Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) < 150)
                            && Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) > 40) {
                            Movement.walkTo(CHARLIE_LOCATION);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().getPlane() == 2
                            || Players.getLocal().getWorldLocation().getPlane() == 1) {
                            if (TileObjects.getNearest("Ladder") != null) {
                                TileObjects.getNearest("Ladder").interact("Climb-up");
                                Time.sleepTicks(3);
                            }
                        }
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) < 3
                        && Players.getLocal().getWorldLocation().getPlane() == 3) {
                        DialogUtil.talkToNpc("Charlie", dialogOptions);
                    }
                }
            }

            // Quest step 100 - Get Glough's key from Anita
            if (GameStateUtil.getVarbit(questVarbit) == 100) {
                if (!Inventory.contains("Glough's key")) {
                    if (Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) > 5) {
                        AccBuilderSotf.c = "Nav to anita";

                        if (Players.getLocal().getWorldLocation().getPlane() != 3
                            || Players.getLocal().getWorldLocation().getPlane() != 2
                            || Players.getLocal().getWorldLocation().getPlane() == 1) {
                            if (TileObjects.getNearest("Ladder") != null) {
                                TileObjects.getNearest("Ladder").interact("Climb-down");
                                Time.sleepTicks(3);
                            }
                        }

                        if (Players.getLocal().getWorldLocation().getPlane() == 0) {
                            Movement.walkTo(ANITA_LOCATION);
                            Time.sleepTicks(1);
                        }
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(ANITA_LOCATION) < 5) {
                        DialogUtil.talkToNpc("Anita", dialogOptions);
                    }
                }

                if (Inventory.contains("Glough's key")) {
                    if (TileObjects.getNearest("Staircase") != null) {
                        TileObjects.getNearest("Staircase").interact("Climb-up");
                        Time.sleepTicks(3);
                    }

                    if (Inventory.contains("Glough's key")) {
                        if (TileObjects.getNearest("Staircase") != null) {
                            TileObjects.getNearest("Staircase").interact("Climb-down");
                            Time.sleepTicks(3);
                        }

                        if (TileObjects.getNearest("Staircase") != null) {
                            TileObjects.getNearest("Staircase").interact("Climb-down");
                            Time.sleepTicks(3);
                        }
                    }
                }
            }

            // Quest step 110 - Use key on chest
            if (GameStateUtil.getVarbit(questVarbit) == 110) {
                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) > 7
                    && Players.getLocal().getWorldLocation().getPlane() != 1) {
                    AccBuilderSotf.c = "Nav to glough";
                    Movement.walkTo(GLOUGH_HOUSE_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GLOUGH_HOUSE_LOCATION) < 7
                    && Players.getLocal().getWorldLocation().getPlane() == 1) {
                    TileObjects.getNearest("Closed chest").useItem(Inventory.getFirst("Glough's key"));
                    TileObjects.getNearest("Closed chest").interact("Open");
                }
            }

            // Quest step 120 - Return to King
            if (GameStateUtil.getVarbit(questVarbit) == 120) {
                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) > 3
                    && Players.getLocal().getWorldLocation().distanceTo(KING_START) > 15) {
                    AccBuilderSotf.c = "Nav to start";
                    Movement.walkTo(KING_START);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(GRAND_TREE_LOCATION) <= 3
                    || Players.getLocal().getWorldLocation().distanceTo(KING_START) < 15) {
                    DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                }
            }

            // Quest step 130 - Solve twigs puzzle and go down trapdoor
            if (GameStateUtil.getVarbit(questVarbit) == 130) {
                AccBuilderSotf.c = "Nav to twigs tile";
                AccBuilderSotf.c = "Solving puzzle";
                aN.aM();

                AccBuilderSotf.c = "Go down";
                TileObjects.getNearest("Trapdoor").interact("Climb-down");
                Time.sleepTicks(2);
            }

            // Quest step 140 - Find Daconia rock and fight Black demon
            if (GameStateUtil.getVarbit(questVarbit) == 140) {
                if (Players.getLocal().getWorldLocation().distanceTo(CHARLIE_LOCATION) < 20) {
                    AccBuilderSotf.c = "Nav to king underground";
                    DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                }

                AccBuilderSotf.c = "Find rock";
                TileObjects.getNearest("Daconia rock").interact("Search");

                if (Inventory.contains(ItemIdArrays.EXTENDED_ANTIFIRE_POTIONS)) {
                    Inventory.getFirst(ItemIdArrays.EXTENDED_ANTIFIRE_POTIONS).interact("Drink");
                    Time.sleepTicks(2);
                }

                NPCs.getNearest("Black demon").interact("Attack");
            }

            // Quest step 150 - Collect Daconia roots
            if (GameStateUtil.getVarbit(questVarbit) == 150) {
                AccBuilderSotf.c = "Nav to king underground";
                DialogUtil.talkToNpc("King Narnode Shareen", dialogOptions);
                collectDaconiaRoots();
            }
        }
    }

    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(questVarbit) <= 160;
    }

    @Override
    public String getName() {
        return questName;
    }

    @Override
    public int execute() {
        try {
            handleBankingAndQuest();
        } catch (Exception e) {
            // Silently handle exceptions
        }
        return 100;
    }
}
