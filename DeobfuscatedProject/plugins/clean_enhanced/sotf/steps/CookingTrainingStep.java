/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
import gg.squire.sotf.framework.*;

/**
 * Handles cooking skill training for the SOTF (Sins of the Father) account build.
 *
 * This step trains cooking by:
 * 1. Determining appropriate food based on cooking level (shrimp -> trout -> tuna)
 * 2. Banking to withdraw raw food
 * 3. Navigating to a cooking range
 * 4. Cooking the food until inventory is empty
 * 5. Switching to buying mode if supplies run out
 *
 * <p>OSRS Cooking Training Mechanics:
 * - Cooking requires a raw food item and a heat source (range, fire)
 * - Ranges provide better success rates than fires
 * - Higher cooking levels unlock new foods and reduce burn rates
 * - Ring of dueling is used for quick teleportation during training
 * </p>
 */
public class CookingTrainingStep implements QuestStep {
    // Item IDs for OSRS
    private static final int RAW_SHRIMP_ID = 317;           // Used for cooking level 1-14
    private static final int RAW_TROUT_ID = 8527;           // Used for cooking level 15-29 (possibly custom ID)
    private static final int RAW_TUNA_ID = 359;             // Used for cooking level 30+
    private static final int RING_OF_DUELING_ID = 3576;     // Teleportation ring
    private static final int RING_OF_WEALTH_ID = 11948;     // Wealth enhancement ring
    private static final int COINS_ID = 995;                // GP currency

    // Cooking level thresholds for food progression
    private static final int SHRIMP_TO_TROUT_LEVEL = 15;
    private static final int TROUT_TO_TUNA_LEVEL = 30;
    private static final int MAX_TRAINING_LEVEL = 99;

    // World locations
    public static final WorldPoint COOKING_RANGE_LOCATION = new WorldPoint(3269, 3680, 0);
    public static final WorldPoint ALTERNATIVE_LOCATION = new WorldPoint(3272, 3148, 0);

    // Shopping list for items to buy when out of supplies
    public static List<ShopItem> shoppingList;

    // Flag to indicate if we need to switch to buying mode
    public static boolean needsToBuySupplies;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to cooking";
    private static final String MSG_NAVIGATING_TO_BANK = "Navigating to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing supplies, switching to BUYING";
    private static final String MSG_EQUIPPING_RING = "Equiping duel";
    private static final String MSG_NAVIGATE_TO_RANGE = "Navigate to range";
    private static final String MSG_COOKING = "Cooking";
    private static final String INTERACT_WEAR = "Wear";
    private static final String OBJECT_RANGE = "Range";
    private static final String INTERACT_COOK = "Cook";
    private static final String ITEM_RING_OF_WEALTH = "ring of wealth (";
    private static final String ITEM_RING_OF_DUELING = "ring of dueling(";

    // Timing constants
    private static final int TIMEOUT_5_SECONDS = 5000;
    private static final int TIMEOUT_64_SECONDS = 64488;

    // Shopping quantities and prices
    private static final int SHRIMP_QUANTITY = 250;
    private static final int SHRIMP_PRICE = 876;
    private static final int TROUT_QUANTITY = 5620;
    private static final int TROUT_PRICE = 200;
    private static final int RING_DUELING_QUANTITY = 20;
    private static final int RING_DUELING_PRICE = 2000;
    private static final int RING_WEALTH_QUANTITY = 5;
    private static final int RING_WEALTH_PRICE = 28072;
    private static final int COINS_QUANTITY = 40;
    private static final int COINS_PRICE = 25540;

    static {
        shoppingList = new ArrayList<d>();
    }

    /**
     * Checks if we have the required raw food in inventory based on current cooking level.
     *
     * @return true if we have the appropriate food, false if we need to bank/buy
     */
    private static boolean hasRequiredFood() {
        int cookingLevel = Skills.getLevel(Skill.COOKING);

        // Level 30+: Check for raw tuna
        if (cookingLevel >= TROUT_TO_TUNA_LEVEL) {
            return Inventory.getCount(RAW_TUNA_ID) > 0;
        }

        // Level 15-29: Check for raw trout
        if (cookingLevel >= SHRIMP_TO_TROUT_LEVEL && cookingLevel < TROUT_TO_TUNA_LEVEL) {
            return Inventory.getCount(RAW_TROUT_ID) > 0;
        }

        // Level 1-14: Check for raw shrimp
        return Inventory.getCount(RAW_SHRIMP_ID) > 0;
    }

    /**
     * Populates the shopping list with items needed based on cooking level.
     * This is called when bank supplies run out.
     */
    private static void populateShoppingList() {
        int cookingLevel = Skills.getLevel(Skill.COOKING);

        // Add appropriate food to shopping list
        if (cookingLevel < SHRIMP_TO_TROUT_LEVEL) {
            shoppingList.add(new ShopItem(RAW_SHRIMP_ID, SHRIMP_QUANTITY, SHRIMP_PRICE));
        }

        if (cookingLevel >= SHRIMP_TO_TROUT_LEVEL && cookingLevel < TROUT_TO_TUNA_LEVEL) {
            shoppingList.add(new ShopItem(RAW_TROUT_ID, TROUT_QUANTITY, TROUT_PRICE));
        }

        if (cookingLevel >= TROUT_TO_TUNA_LEVEL) {
            shoppingList.add(new ShopItem(RAW_TUNA_ID, TROUT_QUANTITY, TROUT_PRICE));
        }

        // Add rings if not in bank
        if (!Bank.contains(item -> item.getName().toLowerCase().contains(ITEM_RING_OF_DUELING))) {
            shoppingList.add(new ShopItem(RING_OF_DUELING_ID, RING_DUELING_QUANTITY, RING_DUELING_PRICE));
        }

        if (!Bank.contains(item -> item.getName().toLowerCase().contains(ITEM_RING_OF_WEALTH))) {
            shoppingList.add(new ShopItem(RING_OF_WEALTH_ID, RING_WEALTH_QUANTITY, RING_WEALTH_PRICE));
        }

        // Add coins if not in bank
        if (!Bank.contains(COINS_ID)) {
            shoppingList.add(new ShopItem(COINS_ID, COINS_QUANTITY, COINS_PRICE));
        }
    }

    /**
     * Main execution method for the cooking training step.
     * Handles the complete training cycle:
     * 1. Check if we need to buy supplies
     * 2. Bank to get raw food
     * 3. Navigate to cooking range
     * 4. Cook all food in inventory
     */
    public static void execute() {
        int cookingLevel = Skills.getLevel(Skill.COOKING);

        // Handle buying mode
        if (needsToBuySupplies) {
            AccBuilderSotf.c = MSG_BUYING_ITEMS;
            GrandExchangeUtil.buyItems(shoppingList);

            if (shoppingList.size() < 1) {
                System.out.println(MSG_FINISHED_BUYING);
                needsToBuySupplies = false;
            }
        }

        // Handle cooking mode
        if (!needsToBuySupplies) {
            BankLocation nearestBank;

            // Need to bank for supplies
            if (!hasRequiredFood()) {
                nearestBank = BankLocation.getNearest();

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = MSG_NAVIGATING_TO_BANK;
                    BankingUtil.navigateToBank(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = MSG_HANDLING_BANKING;

                    // Open bank if not already open
                    if (!Bank.isOpen()) {
                        BankingUtil.openNearestBank();
                        Time.sleepUntil(() -> Bank.isOpen(), TIMEOUT_5_SECONDS);
                    }

                    // Deposit inventory and equipment
                    if (Bank.isOpen()) {
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(1);
                        }

                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }
                    }

                    // Check if we have supplies in bank, otherwise switch to buying mode
                    if (cookingLevel < SHRIMP_TO_TROUT_LEVEL) {
                        if (!Bank.contains(RAW_SHRIMP_ID)) {
                            populateShoppingList();
                            System.out.println(MSG_MISSING_SUPPLIES);
                            needsToBuySupplies = true;
                            return;
                        }
                    }

                    if (cookingLevel >= SHRIMP_TO_TROUT_LEVEL && cookingLevel < TROUT_TO_TUNA_LEVEL) {
                        if (!Bank.contains(RAW_TROUT_ID)) {
                            populateShoppingList();
                            System.out.println(MSG_MISSING_SUPPLIES);
                            needsToBuySupplies = true;
                            return;
                        }
                    }

                    if (cookingLevel >= TROUT_TO_TUNA_LEVEL) {
                        if (!Bank.contains(RAW_TUNA_ID)) {
                            populateShoppingList();
                            System.out.println(MSG_MISSING_SUPPLIES);
                            needsToBuySupplies = true;
                            return;
                        }
                    }

                    // Withdraw ring of dueling if far from cooking location
                    if (!Equipment.contains(RING_OF_DUELING_ID) &&
                        Players.getLocal().getWorldLocation().distanceTo(ALTERNATIVE_LOCATION) > 135) {
                        BankingUtil.withdrawItemsUntilFound(ItemIdArrays.aS, 1);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(RING_OF_DUELING_ID) > 0, TIMEOUT_5_SECONDS);
                    }

                    // Withdraw appropriate raw food based on level
                    if (cookingLevel < SHRIMP_TO_TROUT_LEVEL) {
                        Bank.withdrawAll(RAW_SHRIMP_ID, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(RAW_SHRIMP_ID) > 0, TIMEOUT_5_SECONDS);
                    }

                    if (cookingLevel >= SHRIMP_TO_TROUT_LEVEL && cookingLevel < TROUT_TO_TUNA_LEVEL) {
                        Bank.withdrawAll(RAW_TROUT_ID, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(RAW_TROUT_ID) > 0, TIMEOUT_5_SECONDS);
                    }

                    if (cookingLevel >= TROUT_TO_TUNA_LEVEL) {
                        Bank.withdrawAll(RAW_TUNA_ID, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(RAW_TUNA_ID) > 0, TIMEOUT_5_SECONDS);
                    }
                }
            }

            // Have supplies, ready to cook
            if (hasRequiredFood()) {
                // Equip ring of dueling if in inventory
                if (Inventory.contains(RING_OF_DUELING_ID)) {
                    if (!Equipment.contains(RING_OF_DUELING_ID)) {
                        AccBuilderSotf.c = MSG_EQUIPPING_RING;
                        nearestBank = Inventory.getFirst(RING_OF_DUELING_ID);
                        if (nearestBank != null) {
                            nearestBank.interact(INTERACT_WEAR);
                            Time.sleepTicks(3);
                        }
                    }
                }

                // Navigate to cooking range if not there
                if (Players.getLocal().getWorldLocation().distanceTo(ALTERNATIVE_LOCATION) > 5) {
                    AccBuilderSotf.c = MSG_NAVIGATE_TO_RANGE;
                    Movement.walkTo(ALTERNATIVE_LOCATION);
                    Time.sleepTicks(4);
                }

                // Cook at range if close enough
                if (Players.getLocal().getWorldLocation().distanceTo(ALTERNATIVE_LOCATION) <= 5) {
                    AccBuilderSotf.c = MSG_COOKING;
                    nearestBank = TileObjects.getNearest(Players.getLocal().getWorldLocation(), OBJECT_RANGE);

                    if (nearestBank != null) {
                        // Open production interface
                        if (!Production.isOpen()) {
                            nearestBank.interact(INTERACT_COOK);
                            Time.sleepTicks(2);
                            Time.sleepUntil(() -> Production.isOpen(), TIMEOUT_5_SECONDS);
                        }

                        // Select cooking option and wait until done
                        if (Production.isOpen()) {
                            Production.chooseOption(1);
                            Time.sleepTicks(4);
                            Time.sleepUntil(() -> !hasRequiredFood() || Dialog.isOpen(), TIMEOUT_64_SECONDS);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        execute();
        return 100;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.COOKING) >= MAX_TRAINING_LEVEL;
    }

    @Override
    public String getName() {
        return MSG_COOKING;
    }
}
