package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.util.BankingUtils;
import gg.squire.sotf.util.GrandExchangeHelper;
import gg.squire.sotf.util.PurchaseRequest;
import net.runelite.api.Skill;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

import java.util.ArrayList;
import java.util.List;

/**
 * Cooking training step for SOTF account builder.
 * Trains cooking at Castle Wars from level 1 to 75.
 * Cooks shrimp (1-5), sardines (5-30), and trout (30+).
 */
public class CookingStep implements QuestStepInterface {

    // Item IDs
    private static final int RAW_SHRIMP_ID = 317;
    private static final int RAW_SARDINE_ID = 327;
    private static final int RAW_TROUT_ID = 335;
    private static final int RING_OF_DUELING_ID = 2552;
    private static final int RING_OF_WEALTH_ID = 11980;
    private static final int FIRE_STAFF_ID = 13655;

    // Level thresholds
    private static final int LEVEL_SARDINES = 5;
    private static final int LEVEL_TROUT = 30;
    private static final int TARGET_LEVEL = 75;

    // Castle Wars locations
    private static final WorldPoint CASTLE_WARS_BANK = new WorldPoint(2440, 3093, 0);
    private static final WorldPoint COOKING_RANGE = new WorldPoint(2442, 3090, 0);

    public static List<PurchaseRequest> itemsToBuy = new ArrayList<>();
    public static boolean buyingMode = false;

    /**
     * Prepares the shopping list for required items.
     */
    public static void prepareShoppingList() {
        itemsToBuy.clear();

        int cookingLevel = Skills.getLevel(Skill.COOKING);

        // Add raw fish based on level
        if (cookingLevel < LEVEL_SARDINES) {
            itemsToBuy.add(new PurchaseRequest(RAW_SHRIMP_ID, 1000, 3375));
        }

        if (cookingLevel >= LEVEL_SARDINES && cookingLevel < LEVEL_TROUT) {
            itemsToBuy.add(new PurchaseRequest(RAW_SARDINE_ID, 1000, 5108));
        }

        if (cookingLevel >= LEVEL_TROUT) {
            itemsToBuy.add(new PurchaseRequest(RAW_TROUT_ID, 1000, 5108));
        }

        // Add ring of dueling if not in bank
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of dueling("))) {
            itemsToBuy.add(new PurchaseRequest(RING_OF_DUELING_ID, 4, 17403));
        }

        // Add ring of wealth if not in bank
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemsToBuy.add(new PurchaseRequest(RING_OF_WEALTH_ID, 10, 11551));
        }

        // Add fire staff
        if (!Bank.contains(FIRE_STAFF_ID)) {
            itemsToBuy.add(new PurchaseRequest(FIRE_STAFF_ID, 40, 27565));
        }
    }

    /**
     * Checks if player has required supplies.
     */
    private static boolean hasRequiredSupplies() {
        int cookingLevel = Skills.getLevel(Skill.COOKING);

        if (cookingLevel < LEVEL_SARDINES) {
            return Inventory.getCount(RAW_SHRIMP_ID) > 0;
        }

        if (cookingLevel >= LEVEL_SARDINES && cookingLevel < LEVEL_TROUT) {
            return Inventory.getCount(RAW_SARDINE_ID) > 0;
        }

        return Inventory.getCount(RAW_TROUT_ID) > 0;
    }

    /**
     * Executes the cooking training logic.
     */
    public static void executeCooking() {
        int cookingLevel = Skills.getLevel(Skill.COOKING);

        // Handle buying mode
        if (buyingMode) {
            AccBuilderSotf.status = "Buying items";
            GrandExchangeHelper.processPurchases(itemsToBuy);

            if (itemsToBuy.isEmpty()) {
                System.out.println("Finished buying items, switching back to cooking");
                buyingMode = false;
            }
        }

        if (!buyingMode) {
            // Check if we have required supplies
            if (!hasRequiredSupplies()) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.status = "Navigating to bank";
                    BankingUtils.walkToBank(nearestBank);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.status = "Handling banking";

                    if (!Bank.isOpen()) {
                        BankingUtils.openBank();
                        Time.sleepUntil(Bank::isOpen, 5000);
                    }

                    if (Bank.isOpen()) {
                        // Deposit all
                        if (!Inventory.getAll().isEmpty()) {
                            Bank.depositInventory();
                            Time.sleepTicks(1);
                        }

                        if (!Equipment.getAll().isEmpty()) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check for required items
                        if (cookingLevel < LEVEL_SARDINES && !Bank.contains(RAW_SHRIMP_ID)) {
                            prepareShoppingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            buyingMode = true;
                            return;
                        }

                        if (cookingLevel >= LEVEL_SARDINES && cookingLevel < LEVEL_TROUT && !Bank.contains(RAW_SARDINE_ID)) {
                            prepareShoppingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            buyingMode = true;
                            return;
                        }

                        if (cookingLevel >= LEVEL_TROUT && !Bank.contains(RAW_TROUT_ID)) {
                            prepareShoppingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            buyingMode = true;
                            return;
                        }

                        // Withdraw ring of dueling if needed and far from cooking location
                        if (!Equipment.contains(RING_OF_DUELING_ID) &&
                            Players.getLocal().getWorldLocation().distanceTo(COOKING_RANGE) > 15) {
                            BankingUtils.withdraw(BankingUtils.RING_OF_DUELING_CHARGES, 1);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(RING_OF_DUELING_ID) > 0, 5000);
                        }

                        // Withdraw raw fish
                        if (cookingLevel < LEVEL_SARDINES) {
                            Bank.withdrawAll(RAW_SHRIMP_ID, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(RAW_SHRIMP_ID) > 0, 5000);
                        }

                        if (cookingLevel >= LEVEL_SARDINES && cookingLevel < LEVEL_TROUT) {
                            Bank.withdrawAll(RAW_SARDINE_ID, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(RAW_SARDINE_ID) > 0, 5000);
                        }

                        if (cookingLevel >= LEVEL_TROUT) {
                            Bank.withdrawAll(RAW_TROUT_ID, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(RAW_TROUT_ID) > 0, 5000);
                        }
                    }
                }
            }

            // Cooking logic
            if (hasRequiredSupplies()) {
                // Equip ring of dueling if needed
                if (Inventory.contains(RING_OF_DUELING_ID) && !Equipment.contains(RING_OF_DUELING_ID)) {
                    AccBuilderSotf.status = "Equiping duel";
                    var ring = Inventory.getFirst(RING_OF_DUELING_ID);
                    if (ring != null) {
                        ring.interact("Wear");
                        Time.sleepTicks(3);
                    }
                }

                // Navigate to range
                if (Players.getLocal().getWorldLocation().distanceTo(COOKING_RANGE) > 10) {
                    AccBuilderSotf.status = "Navigate to range";
                    Movement.walkTo(COOKING_RANGE);
                    Time.sleepTicks(4);
                }

                // Cook at range
                if (Players.getLocal().getWorldLocation().distanceTo(COOKING_RANGE) <= 10) {
                    AccBuilderSotf.status = "Cooking";

                    var range = TileObjects.getNearest(Players.getLocal().getWorldLocation(), "Range");
                    if (range != null) {
                        if (!Production.isOpen()) {
                            range.interact("Cook");
                            Time.sleepTicks(2);
                            Time.sleepUntil(Production::isOpen, 5000);
                        }

                        if (Production.isOpen()) {
                            Production.chooseOption(1);
                            Time.sleepTicks(4);
                            Time.sleepUntil(() -> !hasRequiredSupplies() || Dialog.isOpen(), 65535);
                        }
                    }
                }
            }
        }
    }

    @Override
    public String getStepName() {
        return "Cooking";
    }

    @Override
    public int execute() {
        executeCooking();
        return 600;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.COOKING) >= TARGET_LEVEL;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
