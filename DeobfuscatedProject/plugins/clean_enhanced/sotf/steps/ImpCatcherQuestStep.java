package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.sotf.framework.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step for completing the Imp Catcher quest.
 * This quest requires collecting four colored beads (red, yellow, black, white)
 * and delivering them to Wizard Mizgog in the Wizards' Tower.
 */
public class ImpCatcherQuestStep implements QuestStep {

    // Item IDs
    private static final int RED_BEAD_ID = 1470;
    private static final int YELLOW_BEAD_ID = 1472;
    private static final int BLACK_BEAD_ID = 1474;
    private static final int WHITE_BEAD_ID = 1476;
    private static final int LOBSTER_ID = 379;
    private static final int CHEESE_ID = 1985;
    private static final int VARROCK_TELEPORT_ID = 8007;
    private static final int FALADOR_TELEPORT_ID = 8009;
    private static final int STAMINA_POTION_ID = 12625;
    private static final int MIND_RUNE_ID = 558;
    private static final int AIR_RUNE_ID = 556;
    private static final int WATER_RUNE_ID = 555;
    private static final int EARTH_RUNE_ID = 557;

    // Prices (in GP)
    private static final int RED_BEAD_PRICE = 9510;
    private static final int YELLOW_BEAD_PRICE = 9110;
    private static final int LOBSTER_PRICE = 400;
    private static final int CHEESE_PRICE = 5110;
    private static final int WEALTH_RING_PRICE = 11980;
    private static final int VARROCK_TAB_PRICE = 1900;
    private static final int FALADOR_TAB_PRICE = 1900;
    private static final int RUNE_PRICE = 17000;

    // Quantities
    private static final int RUNE_COUNT_REQUIRED = 1000;
    private static final int MIND_RUNE_QUANTITY = 10;
    private static final int LOBSTER_MIN_QUANTITY = 100;
    private static final int LOBSTER_BUY_QUANTITY = 40;
    private static final int CHEESE_QUANTITY = 5;
    private static final int TABLET_QUANTITY = 20;
    private static final int WEALTH_RING_QUANTITY = 18;
    private static final int RUNE_WITHDRAW_QUANTITY = 500;
    private static final int RUNE_BUY_QUANTITY = 2000;

    // Timeouts
    private static final int BANK_TIMEOUT = 5000;

    // Quest varbit
    private static final int QUEST_VARBIT = 160;

    // Wizard Mizgog location (Wizards' Tower)
    private static final WorldPoint WIZARD_LOCATION = new WorldPoint(3104, 3163, 2);

    // Magic portal area
    private static final WorldArea MAGIC_PORTAL_AREA = new WorldArea(2580, 3080, 20, 15, 2);

    // NPC name
    private static final String WIZARD_NPC_NAME = "Wizard Mizgog";

    // Dialog options for quest
    private static final String[] DIALOG_OPTIONS = {
        "Give me a quest please.",
        "I'll try.",
        "Actually, I know where to find this stuff.",
        "Yes.",
        "What's the matter?",
        "Ok, I'll see what I can do."
    };

    // State management
    public static boolean needsToBuyItems = false;
    public static List<d> itemsToBuy = new ArrayList<>();
    static int dialogState = 0;
    static int completionState = 0;
    static boolean questStarted = false;

    /**
     * Handles banking operations for the quest.
     * Withdraws necessary items including beads, food, teleports, and runes.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Navigating to bank";
            BankingUtil.navigateToBank(nearestBank);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                AccBuilderSotf.c = "Opening bank";
                BankingUtil.openNearestBank();
                Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT);
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";

                // Deposit all items first
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(3);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Check rune requirements
                if (Bank.contains(MIND_RUNE_ID)) {
                    if (Bank.getFirst(MIND_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                        addMissingItemsToBuyList();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsToBuyItems = true;
                        return;
                    }
                }

                if (Bank.contains(EARTH_RUNE_ID)) {
                    if (Bank.getFirst(EARTH_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                        addMissingItemsToBuyList();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsToBuyItems = true;
                        return;
                    }
                }

                if (Bank.contains(WATER_RUNE_ID)) {
                    if (Bank.getFirst(WATER_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                        addMissingItemsToBuyList();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsToBuyItems = true;
                        return;
                    }
                }

                // Check for all required items
                int[] requiredItems = {
                    VARROCK_TELEPORT_ID, RED_BEAD_ID, YELLOW_BEAD_ID, BLACK_BEAD_ID,
                    WHITE_BEAD_ID, FALADOR_TELEPORT_ID, CHEESE_ID, LOBSTER_ID,
                    AIR_RUNE_ID, WATER_RUNE_ID, EARTH_RUNE_ID
                };

                if (!GameStateUtil.randomRange(requiredItems)) {
                    addMissingItemsToBuyList();
                    System.out.println("We are missing supplies, switching to BUYING");
                    needsToBuyItems = true;
                    return;
                }

                // Equip items from storage
                while (!I.co()) {
                    I.cm();
                    Time.sleepTicks(1);
                }

                // Close bank to withdraw items
                if (!Bank.isOpen()) {
                    BankingUtil.openNearestBank();
                    Time.sleepTicks(4);
                }

                // Withdraw yellow bead
                if (Bank.contains(YELLOW_BEAD_ID) && Inventory.getCount(YELLOW_BEAD_ID) < 1) {
                    Bank.withdraw(YELLOW_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(YELLOW_BEAD_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw black bead
                if (Bank.contains(BLACK_BEAD_ID) && Inventory.getCount(BLACK_BEAD_ID) < 1) {
                    Bank.withdraw(BLACK_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(BLACK_BEAD_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw red bead
                if (Bank.contains(RED_BEAD_ID) && Inventory.getCount(RED_BEAD_ID) < 1) {
                    Bank.withdraw(RED_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(RED_BEAD_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw white bead
                if (Bank.contains(WHITE_BEAD_ID) && Inventory.getCount(WHITE_BEAD_ID) < 1) {
                    Bank.withdraw(WHITE_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(WHITE_BEAD_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw Falador teleport
                if (Bank.contains(FALADOR_TELEPORT_ID) && Inventory.getCount(FALADOR_TELEPORT_ID) < 1) {
                    Bank.withdraw(FALADOR_TELEPORT_ID, 5, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(FALADOR_TELEPORT_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw cheese
                if (Bank.contains(CHEESE_ID) && Inventory.getCount(CHEESE_ID) < 1) {
                    Bank.withdraw(CHEESE_ID, 4, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(CHEESE_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw mind runes
                if (Bank.contains(AIR_RUNE_ID) && Inventory.getCount(AIR_RUNE_ID) < 1) {
                    Bank.withdraw(AIR_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(AIR_RUNE_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw water runes
                if (Bank.contains(WATER_RUNE_ID) && Inventory.getCount(WATER_RUNE_ID) < 1) {
                    Bank.withdraw(WATER_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(WATER_RUNE_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw earth runes
                if (Bank.contains(EARTH_RUNE_ID) && Inventory.getCount(EARTH_RUNE_ID) < 1) {
                    Bank.withdraw(EARTH_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(EARTH_RUNE_ID) > 0, BANK_TIMEOUT);
                }

                // Withdraw stamina potion
                if (Bank.contains(STAMINA_POTION_ID) && !Inventory.contains(STAMINA_POTION_ID)) {
                    Bank.withdraw(STAMINA_POTION_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.contains(STAMINA_POTION_ID), BANK_TIMEOUT);
                }

                // Withdraw all lobsters
                if (Bank.contains(LOBSTER_ID) && Inventory.getCount(LOBSTER_ID) < 1) {
                    Bank.withdrawAll(LOBSTER_ID, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);
                    Time.sleepUntil(() -> Inventory.getCount(LOBSTER_ID) > 0, BANK_TIMEOUT);
                }
            }
        }
    }

    /**
     * Adds missing items to the buy list for Grand Exchange purchasing.
     */
    private static void addMissingItemsToBuyList() {
        // Check beads
        if (!Bank.contains(RED_BEAD_ID)) {
            System.out.println("Adding red bead to buy list");
            itemsToBuy.add(new ShopItem(RED_BEAD_ID, 1, RED_BEAD_PRICE));
        }

        if (!Bank.contains(YELLOW_BEAD_ID)) {
            System.out.println("Adding yellow bead to buy list");
            itemsToBuy.add(new ShopItem(YELLOW_BEAD_ID, 1, YELLOW_BEAD_PRICE));
        }

        if (!Bank.contains(BLACK_BEAD_ID)) {
            System.out.println("Adding black bead to buy list");
            itemsToBuy.add(new ShopItem(BLACK_BEAD_ID, 1, YELLOW_BEAD_PRICE));
        }

        if (!Bank.contains(WHITE_BEAD_ID)) {
            System.out.println("Adding white bead to buy list");
            itemsToBuy.add(new ShopItem(WHITE_BEAD_ID, 1, YELLOW_BEAD_PRICE));
        }

        // Check food
        if (!Bank.contains(LOBSTER_ID)) {
            System.out.println("Adding lobster to buy list");
            itemsToBuy.add(new ShopItem(LOBSTER_ID, LOBSTER_MIN_QUANTITY, LOBSTER_PRICE));
        }

        if (Bank.contains(LOBSTER_ID) && Bank.getFirst(LOBSTER_ID).getQuantity() < TABLET_QUANTITY) {
            System.out.println("Adding lobster to buy list");
            itemsToBuy.add(new ShopItem(LOBSTER_ID, LOBSTER_BUY_QUANTITY, LOBSTER_PRICE));
        }

        // Check cheese
        if (!Bank.contains(CHEESE_ID)) {
            System.out.println("Adding cheese to buy list");
            itemsToBuy.add(new ShopItem(CHEESE_ID, CHEESE_QUANTITY, CHEESE_PRICE));
        }

        if (Bank.contains(CHEESE_ID) && Bank.getFirst(CHEESE_ID).getQuantity() < CHEESE_QUANTITY) {
            System.out.println("Adding cheese to buy list");
            itemsToBuy.add(new ShopItem(CHEESE_ID, CHEESE_QUANTITY, CHEESE_PRICE));
        }

        // Check ring of wealth
        Predicate<net.runelite.api.Item> wealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(wealthPredicate)) {
            System.out.println("Adding wealth to buy list");
            itemsToBuy.add(new ShopItem(WEALTH_RING_PRICE, WEALTH_RING_QUANTITY, RUNE_PRICE));
        }

        // Check Varrock teleports
        if (Bank.contains(VARROCK_TELEPORT_ID) &&
            Bank.getFirst(VARROCK_TELEPORT_ID).getQuantity() < TABLET_QUANTITY) {
            System.out.println("Adding varrock tabs to buy list");
            itemsToBuy.add(new ShopItem(VARROCK_TELEPORT_ID, LOBSTER_BUY_QUANTITY, VARROCK_TAB_PRICE));
        }

        // Check Falador teleports
        if (!Bank.contains(FALADOR_TELEPORT_ID)) {
            System.out.println("Adding fally tabs to buy list");
            itemsToBuy.add(new ShopItem(FALADOR_TELEPORT_ID, TABLET_QUANTITY, VARROCK_TAB_PRICE));
        }

        if (Bank.contains(FALADOR_TELEPORT_ID) &&
            Bank.getFirst(FALADOR_TELEPORT_ID).getQuantity() < TABLET_QUANTITY) {
            System.out.println("Adding fally tabs to buy list");
            itemsToBuy.add(new ShopItem(FALADOR_TELEPORT_ID, TABLET_QUANTITY, VARROCK_TAB_PRICE));
        }

        // Check stamina potions
        if (!Bank.contains(STAMINA_POTION_ID)) {
            System.out.println("Adding staminas to buy list");
            itemsToBuy.add(new ShopItem(STAMINA_POTION_ID, CHEESE_QUANTITY, Constants.DEFAULT_GE_TIMEOUT));
        }

        // Check runes
        if (Bank.contains(AIR_RUNE_ID) && Bank.getFirst(AIR_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
            System.out.println("Adding mind runes to buy list");
            itemsToBuy.add(new ShopItem(AIR_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (Bank.contains(AIR_RUNE_ID) && Bank.getFirst(AIR_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
            System.out.println("Adding air runes to buy list");
            itemsToBuy.add(new ShopItem(AIR_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (Bank.contains(WATER_RUNE_ID) && Bank.getFirst(WATER_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
            System.out.println("Adding water runes to buy list");
            itemsToBuy.add(new ShopItem(WATER_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (Bank.contains(EARTH_RUNE_ID) && Bank.getFirst(EARTH_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
            System.out.println("Adding earth runes to buy list");
            itemsToBuy.add(new ShopItem(EARTH_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        // Add missing runes if not present
        if (!Bank.contains(AIR_RUNE_ID)) {
            System.out.println("Adding air runes to buy list");
            itemsToBuy.add(new ShopItem(AIR_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (!Bank.contains(WATER_RUNE_ID)) {
            System.out.println("Adding water runes to buy list");
            itemsToBuy.add(new ShopItem(WATER_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (!Bank.contains(EARTH_RUNE_ID)) {
            System.out.println("Adding earth runes to buy list");
            itemsToBuy.add(new ShopItem(EARTH_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }

        if (!Bank.contains(MIND_RUNE_ID)) {
            System.out.println("Adding mind runes to buy list");
            itemsToBuy.add(new ShopItem(MIND_RUNE_ID, RUNE_BUY_QUANTITY, 7));
        }
    }

    /**
     * Checks if the player has all required items for the quest.
     * @return true if all items are present, false otherwise
     */
    private static boolean hasAllRequiredItems() {
        return Inventory.contains("Red bead") &&
               Inventory.contains("Yellow bead") &&
               Inventory.contains("Black bead") &&
               Inventory.contains("White bead") &&
               Inventory.contains(MIND_RUNE_ID) &&
               Inventory.contains(WATER_RUNE_ID) &&
               Inventory.contains(EARTH_RUNE_ID) &&
               Inventory.contains(FALADOR_TELEPORT_ID) &&
               Inventory.contains(LOBSTER_ID) &&
               Inventory.contains("Cheese");
    }

    /**
     * Main quest execution logic.
     */
    public static void executeQuest() {
        // Handle buying items from GE
        if (needsToBuyItems) {
            AccBuilderSotf.c = "Buying items";
            b.a(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to questing");
                needsToBuyItems = false;
            }
        }

        if (!needsToBuyItems) {
            // Quest not started yet
            if (GameStateUtil.getVarbit(QUEST_VARBIT) == 0) {
                BankLocation nearestBank;

                // Check if we need to bank for supplies
                if (!hasAllRequiredItems()) {
                    nearestBank = BankLocation.getNearest();

                    if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.c = "Navigating to bank";
                        BankingUtil.navigateToBank(nearestBank);
                    }

                    if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        if (!Bank.isOpen()) {
                            AccBuilderSotf.c = "Opening bank";
                            BankingUtil.openNearestBank();
                            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT);
                        }

                        if (Bank.isOpen()) {
                            AccBuilderSotf.c = "Handling banking";

                            // Deposit all first
                            if (Inventory.getAll().size() > 0) {
                                Bank.depositInventory();
                                Time.sleepTicks(3);
                            }

                            if (Equipment.getAll().size() > 0) {
                                Bank.depositEquipment();
                                Time.sleepTicks(2);
                            }

                            // Check if we have enough Falador teleports
                            if (Bank.contains(FALADOR_TELEPORT_ID)) {
                                if (Bank.getFirst(FALADOR_TELEPORT_ID).getQuantity() < MIND_RUNE_QUANTITY) {
                                    addMissingItemsToBuyList();
                                    System.out.println("We are missing supplies, switching to BUYING");
                                    needsToBuyItems = true;
                                    return;
                                }
                            }

                            // Check mind runes
                            if (Bank.contains(MIND_RUNE_ID)) {
                                if (Bank.getFirst(MIND_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                                    addMissingItemsToBuyList();
                                    System.out.println("We are missing supplies, switching to BUYING");
                                    needsToBuyItems = true;
                                    return;
                                }
                            }

                            // Check earth runes
                            if (Bank.contains(EARTH_RUNE_ID)) {
                                if (Bank.getFirst(EARTH_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                                    addMissingItemsToBuyList();
                                    System.out.println("We are missing supplies, switching to BUYING");
                                    needsToBuyItems = true;
                                    return;
                                }
                            }

                            // Check water runes
                            if (Bank.contains(WATER_RUNE_ID)) {
                                if (Bank.getFirst(WATER_RUNE_ID).getQuantity() < RUNE_COUNT_REQUIRED) {
                                    addMissingItemsToBuyList();
                                    System.out.println("We are missing supplies, switching to BUYING");
                                    needsToBuyItems = true;
                                    return;
                                }
                            }

                            // Check cheese
                            if (Bank.contains(CHEESE_ID)) {
                                if (Bank.getFirst(CHEESE_ID).getQuantity() < CHEESE_QUANTITY) {
                                    addMissingItemsToBuyList();
                                    System.out.println("We are missing supplies, switching to BUYING");
                                    needsToBuyItems = true;
                                    return;
                                }
                            }

                            // Check all required items
                            int[] requiredItems = {
                                VARROCK_TELEPORT_ID, RED_BEAD_ID, YELLOW_BEAD_ID, BLACK_BEAD_ID,
                                WHITE_BEAD_ID, FALADOR_TELEPORT_ID, CHEESE_ID, LOBSTER_ID,
                                AIR_RUNE_ID, WATER_RUNE_ID, EARTH_RUNE_ID
                            };

                            if (!GameStateUtil.randomRange(requiredItems)) {
                                addMissingItemsToBuyList();
                                System.out.println("We are missing supplies, switching to BUYING");
                                needsToBuyItems = true;
                                return;
                            }

                            // Equip items
                            while (!I.co()) {
                                I.cm();
                                Time.sleepTicks(1);
                            }

                            // Close bank
                            if (!Bank.isOpen()) {
                                BankingUtil.openNearestBank();
                                Time.sleepTicks(4);
                            }

                            // Withdraw yellow bead
                            if (Bank.contains(YELLOW_BEAD_ID) && Inventory.getCount(YELLOW_BEAD_ID) < 1) {
                                Bank.withdraw(YELLOW_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(YELLOW_BEAD_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw black bead
                            if (Bank.contains(BLACK_BEAD_ID) && Inventory.getCount(BLACK_BEAD_ID) < 1) {
                                Bank.withdraw(BLACK_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(BLACK_BEAD_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw red bead
                            if (Bank.contains(RED_BEAD_ID) && Inventory.getCount(RED_BEAD_ID) < 1) {
                                Bank.withdraw(RED_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(RED_BEAD_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw white bead
                            if (Bank.contains(WHITE_BEAD_ID) && Inventory.getCount(WHITE_BEAD_ID) < 1) {
                                Bank.withdraw(WHITE_BEAD_ID, 1, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(WHITE_BEAD_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw Falador teleport
                            if (Bank.contains(FALADOR_TELEPORT_ID) && Inventory.getCount(FALADOR_TELEPORT_ID) < 1) {
                                Bank.withdraw(FALADOR_TELEPORT_ID, 5, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(FALADOR_TELEPORT_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw cheese
                            if (Bank.contains(CHEESE_ID) && Inventory.getCount(CHEESE_ID) < 1) {
                                Bank.withdraw(CHEESE_ID, 4, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(CHEESE_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw mind runes
                            if (Bank.contains(AIR_RUNE_ID) && Inventory.getCount(AIR_RUNE_ID) < 1) {
                                Bank.withdraw(AIR_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(AIR_RUNE_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw water runes
                            if (Bank.contains(WATER_RUNE_ID) && Inventory.getCount(WATER_RUNE_ID) < 1) {
                                Bank.withdraw(WATER_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(WATER_RUNE_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw earth runes
                            if (Bank.contains(EARTH_RUNE_ID) && Inventory.getCount(EARTH_RUNE_ID) < 1) {
                                Bank.withdraw(EARTH_RUNE_ID, RUNE_WITHDRAW_QUANTITY, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(EARTH_RUNE_ID) > 0, BANK_TIMEOUT);
                            }

                            // Withdraw stamina potion
                            if (Bank.contains(STAMINA_POTION_ID) && !Inventory.contains(STAMINA_POTION_ID)) {
                                Bank.withdraw(STAMINA_POTION_ID, 1, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.contains(STAMINA_POTION_ID), BANK_TIMEOUT);
                            }

                            // Withdraw all lobsters
                            if (Bank.contains(LOBSTER_ID) && Inventory.getCount(LOBSTER_ID) < 1) {
                                Bank.withdrawAll(LOBSTER_ID, Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(1);
                                Time.sleepUntil(() -> Inventory.getCount(LOBSTER_ID) > 0, BANK_TIMEOUT);
                            }
                        }
                    }
                }

                // Walk to Wizard Mizgog
                if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_LOCATION) > 4 &&
                    Players.getLocal().getWorldLocation().getPlane() != 2 &&
                    hasAllRequiredItems()) {

                    if (Bank.isOpen()) {
                        Bank.close();
                        Time.sleepTicks(4);
                    }

                    AccBuilderSotf.c = "Walking to imp start";

                    if (!Bank.isOpen()) {
                        if (dialogState < 1) {
                            GameStateUtil.closeBankAndHopWorld();
                            dialogState += 1;
                        }

                        if (MAGIC_PORTAL_AREA.contains(Players.getLocal().getWorldLocation())) {
                            TileObjects.getNearest("Magic Portal").interact("Enter");
                            Time.sleepTicks(GameStateUtil.randomRange(6, 8));
                        }

                        Movement.walkTo(WIZARD_LOCATION);
                        Time.sleepTicks(2);
                    }
                }

                // Interact with wizard
                if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_LOCATION) <= 6) {
                    AccBuilderSotf.c = "Handling quest";
                    completionState = 0;
                    DialogUtil.talkToNpc(WIZARD_NPC_NAME, DIALOG_OPTIONS);

                    if (g.M()) {
                        DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
                    }
                }
            }

            // Quest in progress
            if (GameStateUtil.getVarbit(QUEST_VARBIT) > 0 && GameStateUtil.getVarbit(QUEST_VARBIT) < 2) {
                if (!hasAllRequiredItems()) {
                    handleBanking();
                }

                if (hasAllRequiredItems()) {
                    if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_LOCATION) > 6) {
                        AccBuilderSotf.c = "Nav to start";

                        if (Dialog.isOpen()) {
                            Dialog.close();
                        }

                        Movement.walkTo(WIZARD_LOCATION);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(WIZARD_LOCATION) <= 6) {
                        AccBuilderSotf.c = "Finishing quest";

                        if (completionState < 1) {
                            aN.sZ += 1;
                            aN.u(AccBuilderSotf.m);
                            completionState += 1;
                            aN.sZ = 0;
                            questStarted = false;
                        }

                        DialogUtil.talkToNpc(WIZARD_NPC_NAME, DIALOG_OPTIONS);

                        if (g.M()) {
                            DialogUtil.chooseDialogOptions(DIALOG_OPTIONS);
                        }
                    }
                }
            }

            System.out.println("Setting: " + GameStateUtil.getVarbit(QUEST_VARBIT));
            DialogUtil.chooseDialogOptions(new String[0]);
        }
    }

    @Override
    public int execute() {
        try {
            executeQuest();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 100;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public String getName() {
        return "Imp Catcher quest";
    }

    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(QUEST_VARBIT) >= 2;
    }
}
