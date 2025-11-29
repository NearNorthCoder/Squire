package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/**
 * Trains Woodcutting by chopping trees.
 * Supports different tree types based on woodcutting level.
 */
public class WoodcuttingTrainingStep implements ac {

    // Axe IDs (from best to worst)
    public static final int RUNE_AXE_ID = 1359;
    public static final int ADAMANT_AXE_ID = 1357;
    public static final int MITHRIL_AXE_ID = 1355;
    public static final int STEEL_AXE_ID = 1353;
    public static final int IRON_AXE_ID = 1349;

    // Tree IDs
    private static final int[] NORMAL_TREE_IDS = {8467, 8468, 8469, 8470};
    private static final int[] OAK_TREE_IDS = {14886};

    // Log IDs
    private static final int[] LOG_IDS = {4708, 12279, 12294};

    // Woodcutting level thresholds
    private static final int LEVEL_NORMAL_TREES = 1;
    private static final int LEVEL_OAK_TREES = 15;
    private static final int LEVEL_WILLOW_TREES = 30;
    private static final int TARGET_WOODCUTTING_LEVEL = 41;

    // Training areas
    public static final WorldArea NORMAL_TREE_AREA = new WorldArea(19454, 28519, 16, 29, 0);
    public static final WorldArea OAK_TREE_AREA = new WorldArea(28415, 12215, 31, 16, 0);
    public static final WorldPoint OAK_TREE_CENTER = new WorldPoint(28407, 5183, 0);

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 4;
    private static final int TICK_DELAY_BANK = 6;
    private static final int BANK_TIMEOUT_MS = 30635;

    // Buy quantities
    private static final int QUANTITY_RUNE_AXE = 30635;
    private static final int QUANTITY_ADAMANT_AXE = 28424;
    private static final int QUANTITY_MITHRIL_AXE = 30331;
    private static final int QUANTITY_STEEL_AXE = 7271;
    private static final int QUANTITY_IRON_AXE = 19750;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to woodcutting";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_OPENING_BANK = "Opening bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing pickaxes, switching to BUYING";
    private static final String MSG_DROPPING_LOGS = "Dropping logs";
    private static final String MSG_WALK_TO_TREES = "Walking to trees";
    private static final String MSG_CHOPPING = "Chopping";
    private static final String MSG_CHOPPING_LOGS = "Chopping logs";
    private static final String MSG_CHOP_DOWN = "Chop down";
    private static final String MSG_WALK_TO_OAKS = "Walking to oak trees";
    private static final String MSG_CHOPPING_OAKS = "Chopping oaks";
    private static final String MSG_CHOPPING_OAK_LOGS = "Chopping oak logs";
    private static final String SKILL_NAME = "Woodcutting";
    private static final String ITEM_PREFIX_RING_OF_WEALTH = "ring of wealth (";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;

    static {
        itemsToBuy = new ArrayList<>();
    }

    /**
     * Populates the shopping list with axes.
     */
    public static void populateShoppingList() {
        // Buy rune axe if missing
        if (!Bank.contains(RUNE_AXE_ID)) {
            itemsToBuy.add(new d(RUNE_AXE_ID, 1, QUANTITY_RUNE_AXE));
        }

        // Buy adamant axe if missing
        if (!Bank.contains(ADAMANT_AXE_ID)) {
            itemsToBuy.add(new d(ADAMANT_AXE_ID, 1, QUANTITY_ADAMANT_AXE));
        }

        // Buy mithril axe if missing
        if (!Bank.contains(MITHRIL_AXE_ID)) {
            itemsToBuy.add(new d(MITHRIL_AXE_ID, 1, QUANTITY_MITHRIL_AXE));
        }

        // Buy steel axe if missing
        if (!Bank.contains(STEEL_AXE_ID)) {
            itemsToBuy.add(new d(STEEL_AXE_ID, 1, QUANTITY_STEEL_AXE));
        }

        // Buy iron axe if missing
        if (!Bank.contains(IRON_AXE_ID)) {
            itemsToBuy.add(new d(IRON_AXE_ID, 1, QUANTITY_IRON_AXE));
        }

        // Buy ring of wealth
        if (!Bank.contains(item -> item.getName().toLowerCase().contains(ITEM_PREFIX_RING_OF_WEALTH))) {
            itemsToBuy.add(new d(16265, 35, 28653));
        }

        // Buy bronze axe
        if (!Bank.contains(32470)) {
            itemsToBuy.add(new d(32470, 166, 16324));
        }
    }

    /**
     * Checks if the player has a required axe.
     *
     * @return true if an axe is present
     */
    private static boolean hasRequiredAxe() {
        int woodcuttingLevel = Skills.getLevel(Skill.WOODCUTTING);

        if (woodcuttingLevel >= 41) {
            return Inventory.getCount(RUNE_AXE_ID) > 0;
        }

        if (woodcuttingLevel >= LEVEL_OAK_TREES && woodcuttingLevel < 41) {
            return Inventory.getCount(RUNE_AXE_ID) > 0 &&
                    Inventory.getCount(ADAMANT_AXE_ID) > 0;
        }

        if (woodcuttingLevel >= LEVEL_WILLOW_TREES && woodcuttingLevel < LEVEL_OAK_TREES) {
            return Inventory.getCount(RUNE_AXE_ID) > 0 &&
                    Inventory.getCount(ADAMANT_AXE_ID) > 0 &&
                    Inventory.getCount(MITHRIL_AXE_ID) > 0;
        }

        if (woodcuttingLevel >= LEVEL_OAK_TREES && woodcuttingLevel < LEVEL_WILLOW_TREES) {
            return Inventory.getCount(RUNE_AXE_ID) > 0 &&
                    Inventory.getCount(ADAMANT_AXE_ID) > 0 &&
                    Inventory.getCount(MITHRIL_AXE_ID) > 0 &&
                    Inventory.getCount(STEEL_AXE_ID) > 0;
        }

        // Default: all axes
        return Inventory.getCount(RUNE_AXE_ID) > 0 &&
                Inventory.getCount(ADAMANT_AXE_ID) > 0 &&
                Inventory.getCount(MITHRIL_AXE_ID) > 0 &&
                Inventory.getCount(STEEL_AXE_ID) > 0 &&
                Inventory.getCount(IRON_AXE_ID) > 0;
    }

    /**
     * Main execution method for woodcutting training.
     */
    public static void train() {
        // Handle GE buying
        if (isBuying) {
            AccBuilderSotf.c = MSG_BUYING_ITEMS;
            b.a(itemsToBuy);

            if (itemsToBuy.size() < TICK_DELAY_SHORT) {
                System.out.println(MSG_FINISHED_BUYING);
                isBuying = false;
            }
        }

        if (!isBuying) {
            if (!hasRequiredAxe() || Inventory.getCount(12543) == 0) {
                handleBanking();
            }

            if (hasRequiredAxe()) {
                handleWoodcutting();
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
            a.a(nearestBank);
            return;
        }

        // Open bank
        if (!Bank.isOpen()) {
            AccBuilderSotf.c = MSG_OPENING_BANK;
            a.a();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        // Handle banking
        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit everything
        if (Inventory.getAll().size() > 0) {
            Bank.depositInventory();
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (Equipment.getAll().size() > 0) {
            Bank.depositEquipment();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Check for axes
        if (!Bank.contains(RUNE_AXE_ID) || Inventory.getCount(RUNE_AXE_ID) < 1) {
            populateShoppingList();
            System.out.println(MSG_MISSING_SUPPLIES);
            isBuying = true;
            return;
        }

        // Withdraw axes
        if (Bank.contains(RUNE_AXE_ID)) {
            Bank.withdraw(RUNE_AXE_ID, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> Inventory.getCount(RUNE_AXE_ID) > 0, BANK_TIMEOUT_MS);
        }

        // Withdraw other axes based on level
        withdrawAxesBasedOnLevel();
    }

    /**
     * Withdraws axes from the bank based on the current woodcutting level.
     */
    private static void withdrawAxesBasedOnLevel() {
        if (Bank.contains(ADAMANT_AXE_ID)) {
            Bank.withdraw(ADAMANT_AXE_ID, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> Inventory.getCount(ADAMANT_AXE_ID) > 0, BANK_TIMEOUT_MS);
        }

        if (Bank.contains(MITHRIL_AXE_ID)) {
            Bank.withdraw(MITHRIL_AXE_ID, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> Inventory.getCount(MITHRIL_AXE_ID) > 0, BANK_TIMEOUT_MS);
        }

        if (Bank.contains(STEEL_AXE_ID)) {
            Bank.withdraw(STEEL_AXE_ID, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> Inventory.getCount(STEEL_AXE_ID) > 0, BANK_TIMEOUT_MS);
        }

        if (Bank.contains(IRON_AXE_ID)) {
            Bank.withdraw(IRON_AXE_ID, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> Inventory.getCount(IRON_AXE_ID) > 0, BANK_TIMEOUT_MS);
        }
    }

    /**
     * Handles woodcutting - chopping trees and dropping logs.
     */
    private static void handleWoodcutting() {
        // Drop logs if inventory is full
        if (Inventory.isFull()) {
            AccBuilderSotf.c = MSG_DROPPING_LOGS;
            System.out.println(MSG_DROPPING_LOGS);
            Inventory.getAll(LOG_IDS).stream().forEach(Item::drop);
        }

        if (!Inventory.isFull()) {
            int woodcuttingLevel = Skills.getLevel(Skill.WOODCUTTING);

            if (woodcuttingLevel < LEVEL_OAK_TREES) {
                chopNormalTrees();
            }

            if (woodcuttingLevel >= LEVEL_OAK_TREES) {
                chopOakTrees();
            }
        }
    }

    /**
     * Chops normal trees.
     */
    private static void chopNormalTrees() {
        if (!NORMAL_TREE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_WALK_TO_TREES;
            Movement.walkTo(NORMAL_TREE_AREA.toWorldPoint());
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (NORMAL_TREE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_CHOPPING;
            var tree = TileObjects.getNearest(Players.getLocal().getWorldLocation(), NORMAL_TREE_IDS);

            if (!Players.getLocal().isAnimating() && !Players.getLocal().isMoving() && tree != null) {
                System.out.println(MSG_CHOPPING_LOGS);
                tree.interact(MSG_CHOP_DOWN);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    /**
     * Chops oak trees.
     */
    private static void chopOakTrees() {
        if (!OAK_TREE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_WALK_TO_OAKS;
            Movement.walkTo(OAK_TREE_CENTER);
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (OAK_TREE_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_CHOPPING_OAKS;
            var tree = TileObjects.getNearest(Players.getLocal().getWorldLocation(), OAK_TREE_IDS);

            if (!Players.getLocal().isAnimating() && !Players.getLocal().isMoving() && tree != null) {
                System.out.println(MSG_CHOPPING_OAK_LOGS);
                tree.interact(MSG_CHOP_DOWN);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    @Override
    public String ag() {
        return SKILL_NAME;
    }

    @Override
    public boolean ah() {
        return Skills.getLevel(Skill.WOODCUTTING) >= TARGET_WOODCUTTING_LEVEL;
    }

    @Override
    public boolean ae() {
        return false;
    }

    @Override
    public int af() {
        train();
        return 16;  // Priority
    }
}
