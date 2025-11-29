package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/**
 * Trains Herblore by making potions and cutting gems.
 * Supports multiple potion types based on the current Herblore level.
 */
public class HerbloreTrainingStep implements QuestStep {

    // Item IDs
    private static final int VIAL_OF_WATER_ID = 221;
    private static final int GUAM_LEAF_ID = 249;
    private static final int MARRENTILL_ID = 251;
    private static final int EYE_OF_NEWT_ID = 221;
    private static final int TARROMIN_ID = 253;
    private static final int UNCUT_SAPPHIRE_ID = 1623;
    private static final int CHISEL_ID = 1755;

    // Herblore level thresholds
    private static final int LEVEL_THRESHOLD_LOW = 14;
    private static final int LEVEL_THRESHOLD_MID = 37;
    private static final int LEVEL_THRESHOLD_HIGH = 48;
    private static final int TARGET_HERBLORE_LEVEL = 30;

    // XP values for calculating quantities
    private static final int GUAM_XP_TARGET = 24597;
    private static final int MARRENTILL_XP_TARGET = 62739;
    private static final int XP_PER_GUAM_POTION = 25;
    private static final int XP_PER_MARRENTILL_POTION = 31;
    private static final int BASE_POTION_QUANTITY = 500;
    private static final int EXTRA_POTION_QUANTITY = 7;

    // UI widget IDs for herblore production
    private static final int PRODUCTION_WIDGET_GROUP = 8270;
    private static final int PRODUCTION_WIDGET_CHILD = 1;
    private static final int PRODUCTION_TIMEOUT_MS = 25900;

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 5;
    private static final int BANK_TIMEOUT_MS = 7020;
    private static final int QUANTITY_TO_BUY_VIALS = 19454;
    private static final int QUANTITY_TO_BUY_HERBS = 12277;
    private static final int QUANTITY_TO_BUY_SECONDARY = 20;
    private static final int QUANTITY_TO_BUY_TARROMIN = 32735;
    private static final int QUANTITY_TO_BUY_MARRENTILL_LOW = 28411;
    private static final int QUANTITY_TO_BUY_MARRENTILL_HIGH = 12223;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to herblore";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing supplies, switching to BUYING";
    private static final String MSG_MIXING_POTIONS = "Mixing potions";
    private static final String SKILL_NAME = "Herblore";
    private static final String ITEM_PREFIX_UNCUT = "Uncut";
    private static final String ITEM_NAME_CHISEL = "Chisel";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;

    static {
        itemsToBuy = new ArrayList<>();
    }

    /**
     * Populates the shopping list with herbs and secondary ingredients based on level.
     */
    public static void populateShoppingList() {
        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);

        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            // Buy guam and eye of newt for attack potions
            if (!Bank.contains(VIAL_OF_WATER_ID)) {
                itemsToBuy.add(new d(VIAL_OF_WATER_ID, QUANTITY_TO_BUY_VIALS, QUANTITY_TO_BUY_SECONDARY));
            }

            if (!Bank.contains(GUAM_LEAF_ID)) {
                itemsToBuy.add(new d(GUAM_LEAF_ID, calculateQuantityNeeded(), QUANTITY_TO_BUY_HERBS));
            }
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            // Buy marrentill and other herbs for prayer potions
            if (!Bank.contains(MARRENTILL_ID)) {
                itemsToBuy.add(new d(MARRENTILL_ID, calculateQuantityNeeded(), QUANTITY_TO_BUY_MARRENTILL_LOW));
            }

            if (!Bank.contains(TARROMIN_ID)) {
                itemsToBuy.add(new d(TARROMIN_ID, calculateQuantityNeeded(), QUANTITY_TO_BUY_TARROMIN));
            }
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_MID) {
            // Continue with vials and marrentill
            if (!Bank.contains(VIAL_OF_WATER_ID)) {
                itemsToBuy.add(new d(VIAL_OF_WATER_ID, QUANTITY_TO_BUY_VIALS, QUANTITY_TO_BUY_SECONDARY));
            }

            if (!Bank.contains(UNCUT_SAPPHIRE_ID)) {
                itemsToBuy.add(new d(UNCUT_SAPPHIRE_ID, QUANTITY_TO_BUY_VIALS, QUANTITY_TO_BUY_MARRENTILL_HIGH));
            }
        }
    }

    /**
     * Calculates the quantity of herbs needed based on current XP.
     *
     * @return The number of herbs to buy
     */
    private static int calculateQuantityNeeded() {
        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);
        int currentXP = Skills.getExperience(Skill.HERBLORE);

        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            return (GUAM_XP_TARGET - currentXP) / XP_PER_GUAM_POTION + TICK_DELAY_LONG;
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            return (MARRENTILL_XP_TARGET - currentXP) / XP_PER_MARRENTILL_POTION + EXTRA_POTION_QUANTITY;
        }

        return TICK_DELAY_SHORT;
    }

    /**
     * Checks if the player has the required supplies in inventory.
     *
     * @return true if supplies are present
     */
    private static boolean hasRequiredSupplies() {
        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);

        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            return Inventory.contains(VIAL_OF_WATER_ID) && Inventory.contains(GUAM_LEAF_ID);
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            return Inventory.contains(MARRENTILL_ID) && Inventory.contains(TARROMIN_ID);
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_MID) {
            return Inventory.contains(VIAL_OF_WATER_ID) && Inventory.contains(UNCUT_SAPPHIRE_ID);
        }

        return false;
    }

    /**
     * Checks if the bank has the required supplies.
     *
     * @return true if bank has supplies
     */
    private static boolean bankHasSupplies() {
        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);

        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            return Bank.contains(VIAL_OF_WATER_ID) && Bank.contains(GUAM_LEAF_ID);
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            return Bank.contains(MARRENTILL_ID) && Bank.contains(TARROMIN_ID);
        }

        if (herbloreLevel >= LEVEL_THRESHOLD_MID) {
            return Bank.contains(VIAL_OF_WATER_ID) && Bank.contains(UNCUT_SAPPHIRE_ID);
        }

        return false;
    }

    /**
     * Main execution method for herblore training.
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
            handleBanking();
            handlePotionMixing();
        }
    }

    /**
     * Handles banking operations - withdrawing herbs and secondaries.
     */
    private static void handleBanking() {
        if (hasRequiredSupplies() || !bankHasSupplies()) {
            return;
        }

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
            a.a();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        // Handle banking
        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit all items
        if (Inventory.getAll().size() > 0) {
            Bank.depositInventory();
            Time.sleepTicks(TICK_DELAY_LONG);
        }

        // Check if we need to buy supplies
        if (!bankHasSupplies()) {
            populateShoppingList();
            System.out.println(MSG_MISSING_SUPPLIES);
            isBuying = true;
            return;
        }

        // Withdraw supplies based on level
        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);

        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            z.a(VIAL_OF_WATER_ID, BASE_POTION_QUANTITY);
            z.a(GUAM_LEAF_ID, BASE_POTION_QUANTITY);
        } else if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            z.a(MARRENTILL_ID, BASE_POTION_QUANTITY);
            z.a(TARROMIN_ID, BASE_POTION_QUANTITY);
        } else if (herbloreLevel >= LEVEL_THRESHOLD_MID) {
            z.a(VIAL_OF_WATER_ID, BASE_POTION_QUANTITY);
            z.a(UNCUT_SAPPHIRE_ID, BASE_POTION_QUANTITY);
        }
    }

    /**
     * Handles mixing potions or cutting gems.
     */
    private static void handlePotionMixing() {
        if (!hasRequiredSupplies()) {
            return;
        }

        AccBuilderSotf.c = MSG_MIXING_POTIONS;

        int herbloreLevel = Skills.getLevel(Skill.HERBLORE);

        // Mix potions based on level
        if (herbloreLevel < LEVEL_THRESHOLD_LOW) {
            if (Inventory.contains(VIAL_OF_WATER_ID) && Inventory.contains(GUAM_LEAF_ID)) {
                Inventory.getFirst(VIAL_OF_WATER_ID).useOn(Inventory.getFirst(GUAM_LEAF_ID));
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        } else if (herbloreLevel >= LEVEL_THRESHOLD_LOW && herbloreLevel < LEVEL_THRESHOLD_MID) {
            if (Inventory.contains(MARRENTILL_ID) && Inventory.contains(TARROMIN_ID)) {
                Inventory.getFirst(MARRENTILL_ID).useOn(Inventory.getFirst(TARROMIN_ID));
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        } else if (herbloreLevel >= LEVEL_THRESHOLD_MID) {
            // Cut gems
            if (Inventory.contains(VIAL_OF_WATER_ID) && Inventory.contains(UNCUT_SAPPHIRE_ID)) {
                Inventory.getFirst(VIAL_OF_WATER_ID).useOn(Inventory.getFirst(UNCUT_SAPPHIRE_ID));
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        }

        // Also handle chisel + uncut gem cutting
        if (Inventory.contains(item -> item.getName().contains(ITEM_NAME_CHISEL))) {
            Inventory.getFirst(item -> item.getName().contains(ITEM_PREFIX_UNCUT))
                    .useOn(Inventory.getFirst(item -> item.getName().contains(ITEM_NAME_CHISEL)));
        }

        // Wait for production dialog and continue
        if (Widgets.get(PRODUCTION_WIDGET_GROUP, PRODUCTION_WIDGET_CHILD) != null) {
            Dialog.continueSpace();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
            Time.sleepUntil(() -> !Inventory.contains(VIAL_OF_WATER_ID) ||
                    !Inventory.contains(MARRENTILL_ID) || Dialog.canLevelUpContinue(),
                    PRODUCTION_TIMEOUT_MS);
        }
    }

    @Override
    public String getName() {
        return SKILL_NAME;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.HERBLORE) >= TARGET_HERBLORE_LEVEL;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        train();
        return 9;  // Priority
    }
}
