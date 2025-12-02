package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
import gg.squire.sotf.framework.ShopItem;
import gg.squire.sotf.framework.QuestStep;

/**
 * Trains Fletching by cutting logs and stringing bows.
 * Supports multiple log types and bow types based on fletching level.
 */
public class FletchingTrainingStep implements QuestStep {

    // Item IDs - Logs
    private static final int LOGS_ID = 12278;
    private static final int OAK_LOGS_ID = 12279;
    private static final int WILLOW_LOGS_ID = 12294;
    private static final int MAPLE_LOGS_ID = 12289;

    // Item IDs - Tools
    private static final int KNIFE_ID = 8579;
    private static final int BOW_STRING_ID = 8579;

    // Item IDs - Unstrung Bows
    private static final int SHORTBOW_U_ID = 8467;
    private static final int LONGBOW_U_ID = 8468;
    private static final int OAK_SHORTBOW_U_ID = 8469;
    private static final int OAK_LONGBOW_U_ID = 8470;
    private static final int WILLOW_SHORTBOW_U_ID = 8471;
    private static final int WILLOW_LONGBOW_U_ID = 8472;
    private static final int MAPLE_SHORTBOW_U_ID = 8473;
    private static final int MAPLE_LONGBOW_U_ID = 8474;

    // Item IDs - Strung Bows
    private static final int SHORTBOW_ID = 14886;
    private static final int LONGBOW_ID = 14887;
    private static final int OAK_SHORTBOW_ID = 14888;
    private static final int OAK_LONGBOW_ID = 14889;

    // Fletching level thresholds
    private static final int LEVEL_THRESHOLD_LOW = 5;
    private static final int LEVEL_THRESHOLD_MID_1 = 10;
    private static final int LEVEL_THRESHOLD_MID_2 = 20;
    private static final int LEVEL_THRESHOLD_MID_3 = 25;
    private static final int LEVEL_THRESHOLD_MID_4 = 35;
    private static final int LEVEL_THRESHOLD_MID_5 = 40;
    private static final int LEVEL_THRESHOLD_HIGH_1 = 50;
    private static final int LEVEL_THRESHOLD_HIGH_2 = 55;
    private static final int LEVEL_THRESHOLD_HIGH_3 = 65;
    private static final int LEVEL_THRESHOLD_HIGH_4 = 70;
    private static final int TARGET_FLETCHING_LEVEL = 72;

    // Production widget IDs
    private static final int PRODUCTION_WIDGET_GROUP = 8270;
    private static final int PRODUCTION_WIDGET_CHILD = 1;

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 3;
    private static final int TICK_DELAY_BANK = 4;
    private static final int BANK_TIMEOUT_MS = 15357;
    private static final int PRODUCTION_TIMEOUT_MS = 30635;

    // Buy quantities and prices
    private static final int BUY_LOGS_QUANTITY = 3000;
    private static final int BUY_LOGS_PRICE = 16398;
    private static final int BUY_OAK_LOGS_PRICE = 31798;
    private static final int BUY_WILLOW_LOGS_QUANTITY = 5000;
    private static final int BUY_WILLOW_LOGS_PRICE = 19454;
    private static final int BUY_MAPLE_LOGS_PRICE = 16354;
    private static final int BUY_KNIFE_QUANTITY = 1;
    private static final int BUY_KNIFE_PRICE = 19750;
    private static final int BUY_BOW_STRING_QUANTITY = 3000;
    private static final int BUY_BOW_STRING_PRICE = 12202;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to fletching";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing supplies, switching to BUYING";
    private static final String MSG_CUTTING_LOGS = "Cutting logs";
    private static final String MSG_STRINGING_BOWS = "Stringing bows";
    private static final String SKILL_NAME = "Fletching";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;

    static {
        itemsToBuy = new ArrayList<>();
    }

    /**
     * Returns the log ID to use based on current fletching level.
     *
     * @return The log item ID
     */
    private static int getLogIdForLevel() {
        int fletchingLevel = Skills.getLevel(Skill.FLETCHING);

        if (fletchingLevel < LEVEL_THRESHOLD_LOW) {
            return LOGS_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_LOW && fletchingLevel < LEVEL_THRESHOLD_MID_2) {
            return OAK_LOGS_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_2 && fletchingLevel < LEVEL_THRESHOLD_MID_4) {
            return WILLOW_LOGS_ID;
        } else {
            return MAPLE_LOGS_ID;
        }
    }

    /**
     * Returns the unstrung bow ID based on current fletching level.
     *
     * @return The unstrung bow item ID
     */
    private static int getUnstrungBowIdForLevel() {
        int fletchingLevel = Skills.getLevel(Skill.FLETCHING);

        if (fletchingLevel < LEVEL_THRESHOLD_LOW) {
            return SHORTBOW_U_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_LOW && fletchingLevel < LEVEL_THRESHOLD_MID_1) {
            return OAK_SHORTBOW_U_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_1 && fletchingLevel < LEVEL_THRESHOLD_MID_2) {
            return OAK_LONGBOW_U_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_2 && fletchingLevel < LEVEL_THRESHOLD_MID_3) {
            return WILLOW_SHORTBOW_U_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_3 && fletchingLevel < LEVEL_THRESHOLD_MID_4) {
            return WILLOW_LONGBOW_U_ID;
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_4 && fletchingLevel < LEVEL_THRESHOLD_MID_5) {
            return MAPLE_SHORTBOW_U_ID;
        } else {
            return MAPLE_LONGBOW_U_ID;
        }
    }

    /**
     * Populates the shopping list with logs and supplies.
     */
    public static void populateShoppingList() {
        int fletchingLevel = Skills.getLevel(Skill.FLETCHING);

        // Buy knife
        if (!Bank.contains(KNIFE_ID)) {
            itemsToBuy.add(new ShopItem(KNIFE_ID, BUY_KNIFE_QUANTITY, BUY_KNIFE_PRICE));
        }

        // Buy logs based on level
        if (fletchingLevel < LEVEL_THRESHOLD_LOW) {
            if (!Bank.contains(LOGS_ID)) {
                itemsToBuy.add(new ShopItem(LOGS_ID, BUY_LOGS_QUANTITY, BUY_LOGS_PRICE));
            }
            if (!Bank.contains(BOW_STRING_ID)) {
                itemsToBuy.add(new ShopItem(BOW_STRING_ID, BUY_BOW_STRING_QUANTITY, BUY_BOW_STRING_PRICE));
            }
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_LOW && fletchingLevel < LEVEL_THRESHOLD_MID_2) {
            if (!Bank.contains(OAK_LOGS_ID)) {
                itemsToBuy.add(new ShopItem(OAK_LOGS_ID, BUY_LOGS_QUANTITY, BUY_OAK_LOGS_PRICE));
            }
            if (!Bank.contains(BOW_STRING_ID)) {
                itemsToBuy.add(new ShopItem(BOW_STRING_ID, BUY_BOW_STRING_QUANTITY, BUY_BOW_STRING_PRICE));
            }
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_2 && fletchingLevel < LEVEL_THRESHOLD_MID_4) {
            if (!Bank.contains(WILLOW_LOGS_ID)) {
                itemsToBuy.add(new ShopItem(WILLOW_LOGS_ID, BUY_WILLOW_LOGS_QUANTITY, BUY_WILLOW_LOGS_PRICE));
            }
            if (!Bank.contains(BOW_STRING_ID)) {
                itemsToBuy.add(new ShopItem(BOW_STRING_ID, BUY_BOW_STRING_QUANTITY, BUY_BOW_STRING_PRICE));
            }
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_4) {
            if (!Bank.contains(MAPLE_LOGS_ID)) {
                itemsToBuy.add(new ShopItem(MAPLE_LOGS_ID, BUY_LOGS_QUANTITY, BUY_MAPLE_LOGS_PRICE));
            }
            if (!Bank.contains(BOW_STRING_ID)) {
                itemsToBuy.add(new ShopItem(BOW_STRING_ID, BUY_BOW_STRING_QUANTITY, BUY_BOW_STRING_PRICE));
            }
        }
    }

    /**
     * Checks if the player has required supplies.
     *
     * @return true if supplies are present
     */
    private static boolean hasRequiredSupplies() {
        int fletchingLevel = Skills.getLevel(Skill.FLETCHING);

        if (fletchingLevel >= LEVEL_THRESHOLD_LOW && fletchingLevel < LEVEL_THRESHOLD_MID_1) {
            return Inventory.getCount(OAK_LOGS_ID) > 0 && Inventory.getCount(OAK_SHORTBOW_U_ID) > 0;
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_1 && fletchingLevel < LEVEL_THRESHOLD_MID_2) {
            return Inventory.getCount(OAK_LOGS_ID) > 0 && Inventory.getCount(OAK_LONGBOW_U_ID) > 0;
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_2 && fletchingLevel < LEVEL_THRESHOLD_MID_3) {
            return Inventory.getCount(WILLOW_LOGS_ID) > 0 && Inventory.getCount(WILLOW_SHORTBOW_U_ID) > 0;
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_3 && fletchingLevel < LEVEL_THRESHOLD_MID_4) {
            return Inventory.getCount(WILLOW_LOGS_ID) > 0 && Inventory.getCount(WILLOW_LONGBOW_U_ID) > 0;
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_4 && fletchingLevel < LEVEL_THRESHOLD_MID_5) {
            return Inventory.getCount(MAPLE_LOGS_ID) > 0 && Inventory.getCount(MAPLE_SHORTBOW_U_ID) > 0;
        }

        if (fletchingLevel >= LEVEL_THRESHOLD_MID_5) {
            return Inventory.getCount(MAPLE_LOGS_ID) > 0 && Inventory.getCount(MAPLE_LONGBOW_U_ID) > 0;
        }

        return false;
    }

    /**
     * Main training execution method.
     */
    public static void train() {
        // Handle GE buying
        if (isBuying) {
            AccBuilderSotf.c = MSG_BUYING_ITEMS;
            b.a(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println(MSG_FINISHED_BUYING);
                isBuying = false;
            }
        }

        if (!isBuying) {
            if (!hasRequiredSupplies() && GrandExchange.isOpen()) {
                handleBanking();
            }

            if (hasRequiredSupplies()) {
                handleFletching();
            }
        }
    }

    /**
     * Handles banking operations.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();
        if (nearestBank == null) {
            return;
        }

        // Navigate to bank
        if (!nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_BANK;
            BankingUtil.navigateToBank(nearestBank);
            return;
        }

        // Open bank
        if (!Bank.isOpen()) {
            BankingUtil.openNearestBank();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        // Handle banking
        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit everything except knife
        if (Inventory.getAll().size() > 0) {
            Bank.depositAllExcept(KNIFE_ID);
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (Equipment.getAll().size() > 0) {
            Bank.depositEquipment();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Check for supplies
        int logId = getLogIdForLevel();
        if (!Bank.contains(logId)) {
            populateShoppingList();
            System.out.println(MSG_MISSING_SUPPLIES);
            isBuying = true;
            return;
        }

        // Withdraw supplies
        withdrawSupplies();
    }

    /**
     * Withdraws fletching supplies from the bank.
     */
    private static void withdrawSupplies() {
        int fletchingLevel = Skills.getLevel(Skill.FLETCHING);
        int logId = getLogIdForLevel();

        if (fletchingLevel < LEVEL_THRESHOLD_LOW) {
            BankingUtil.withdrawItem(logId, 500);
            BankingUtil.withdrawItem(BOW_STRING_ID, 500);
        } else if (fletchingLevel >= LEVEL_THRESHOLD_LOW && fletchingLevel < LEVEL_THRESHOLD_MID_2) {
            BankingUtil.withdrawItem(logId, 500);
            BankingUtil.withdrawItem(BOW_STRING_ID, 500);
        } else if (fletchingLevel >= LEVEL_THRESHOLD_MID_2 && fletchingLevel < LEVEL_THRESHOLD_MID_4) {
            BankingUtil.withdrawItem(logId, 500);
            BankingUtil.withdrawItem(BOW_STRING_ID, 500);
        } else {
            BankingUtil.withdrawItem(logId, 500);
            BankingUtil.withdrawItem(BOW_STRING_ID, 500);
        }
    }

    /**
     * Handles fletching - cutting logs and stringing bows.
     */
    private static void handleFletching() {
        int logId = getLogIdForLevel();
        int unstrungBowId = getUnstrungBowIdForLevel();

        // Cut logs into unstrung bows
        if (Inventory.contains(logId) && Inventory.contains(KNIFE_ID)) {
            AccBuilderSotf.c = MSG_CUTTING_LOGS;

            Inventory.getFirst(KNIFE_ID).useOn(Inventory.getFirst(logId));
            Time.sleepTicks(TICK_DELAY_MEDIUM);

            if (Production.isOpen()) {
                Production.selectOption(unstrungBowId);
                Time.sleepTicks(TICK_DELAY_SHORT);
                Time.sleepUntil(() -> !Inventory.contains(logId) || Dialog.canLevelUpContinue(),
                        PRODUCTION_TIMEOUT_MS);
            }
        }

        // String bows
        if (!Inventory.contains(logId) && Inventory.contains(unstrungBowId) &&
                Inventory.contains(BOW_STRING_ID)) {
            AccBuilderSotf.c = MSG_STRINGING_BOWS;

            Inventory.getFirst(BOW_STRING_ID).useOn(Inventory.getFirst(unstrungBowId));
            Time.sleepTicks(TICK_DELAY_MEDIUM);

            if (Production.isOpen()) {
                Production.selectOption(unstrungBowId);
                Time.sleepTicks(TICK_DELAY_SHORT);
                Time.sleepUntil(() -> !Inventory.contains(unstrungBowId) || Dialog.canLevelUpContinue(),
                        PRODUCTION_TIMEOUT_MS);
            }
        }
    }

    @Override
    public String getName() {
        return SKILL_NAME;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.FLETCHING) >= TARGET_FLETCHING_LEVEL;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        train();
        return 11;  // Priority
    }
}
