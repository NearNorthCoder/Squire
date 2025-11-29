package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Skill;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;

/**
 * Training step handler for Herblore skill in SOTF plugin.
 * Handles herblore training from level 1 to 38, including:
 * - Cleaning and preparing herbs
 * - Making various potions
 * - Gem cutting (as a backup method)
 */
public class HerbloreStep implements QuestStep {

    // Item IDs
    private static final int VIAL = 229;
    private static final int GUAM_LEAF = 249;
    private static final int MARRENTILL = 251;
    private static final int EYE_OF_NEWT = 221;
    private static final int TARROMIN = 253;
    private static final int HARRALANDER = 255;
    private static final int CHISEL = 1755;

    // Experience targets
    private static final int EXP_ATTACK_POTION = 30250; // Level 3
    private static final int EXP_STRENGTH_POTION = 61815; // Level 12

    // Target levels
    private static final int LEVEL_ATTACK_POTION = 3;
    private static final int LEVEL_STRENGTH_POTION = 12;

    // Widget IDs for continue dialogue
    private static final int WIDGET_DIALOG_CONTINUE = 14243;
    private static final int WIDGET_DIALOG_CONTINUE_CHILD = 5;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();

    @Override
    public String getStepName() {
        return "Herblore";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.HERBLORE) >= 38;
    }

    @Override
    public int execute() {
        handleHerblore();
        return 100;
    }

    /**
     * Main herblore handler
     */
    public static void handleHerblore() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to herblore");
                needsBuying = false;
            }
        }

        if (needsBuying || Skills.getLevel(Skill.HERBLORE) >= 38) {
            return;
        }

        // Check if we need to cut gems as backup method
        int questStepType = QuestHelper.getQuestVarbit(4);
        if (questStepType < 2) {
            GemCuttingHelper.cutGems();
        }

        // Banking phase
        if (!hasRequiredItems() && questStepType == 2) {
            BankLocation bank = BankLocation.getNearest();

            if (bank != null && !bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Navigating to bank";
                NavigationHelper.walkTo(bank);
            }

            if (bank != null && bank.getArea().contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.currentStatus = "Handling banking";

                if (!Bank.isOpen()) {
                    BankHelper.openBank();
                    Time.sleepUntil(() -> Bank.isOpen(), 3000);
                }

                if (Bank.isOpen()) {
                    // Deposit inventory
                    if (Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(6);
                    }

                    // Check if we have required items in bank
                    if (!hasRequiredItemsInBank()) {
                        checkMissingItems();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsBuying = true;
                        return;
                    }

                    // Withdraw items based on level
                    int currentLevel = Skills.getLevel(Skill.HERBLORE);

                    if (currentLevel < LEVEL_ATTACK_POTION) {
                        withdrawItemsForLevel(VIAL, 10, GUAM_LEAF, 10);
                    } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
                        withdrawItemsForLevel(MARRENTILL, 10, EYE_OF_NEWT, 10);
                    } else if (currentLevel >= LEVEL_STRENGTH_POTION) {
                        withdrawItemsForLevel(VIAL, 10, HARRALANDER, 10);
                    }
                }
            }
        }

        // Potion making phase
        if (hasRequiredItems()) {
            if (Bank.isOpen()) {
                Bank.close();
            }

            if (Dialog.isOpen()) {
                Dialog.close();
            }

            AccBuilderSotf.currentStatus = "Mixing potions";

            // Make potions based on level
            int currentLevel = Skills.getLevel(Skill.HERBLORE);

            if (currentLevel < LEVEL_ATTACK_POTION) {
                makePotion(VIAL, GUAM_LEAF);
            } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
                makePotion(MARRENTILL, EYE_OF_NEWT);
            } else if (currentLevel >= LEVEL_STRENGTH_POTION) {
                makePotion(VIAL, HARRALANDER);
            }

            // Handle remaining items - cut gems if we have chisel and uncut gems
            if (Inventory.getAll(VIAL).size() == 1
                && Inventory.getAll(HARRALANDER).size() == 1
                && Inventory.getAll(EYE_OF_NEWT).size() == 1
                && Inventory.getAll(GUAM_LEAF).size() == 1
                && Inventory.getAll(MARRENTILL).size() == 1) {
                Time.sleepTicks(10);
            }

            if (Inventory.contains(item -> item.getName().contains("Chisel"))) {
                Inventory.getFirst(item -> item.getName().contains("Chisel"))
                    .useOn(Inventory.getFirst(item -> item.getName().contains("Uncut")));
            }

            // Continue dialogue if present
            Widget continueWidget = Widgets.get(WIDGET_DIALOG_CONTINUE, WIDGET_DIALOG_CONTINUE_CHILD);
            if (continueWidget != null) {
                Dialog.continueSpace();
                Time.sleepTicks(2);
                Time.sleepUntil(() -> !Inventory.contains(VIAL)
                    || !Inventory.contains(MARRENTILL)
                    || Dialog.canLevelUpContinue(), 30000);
            }
        }
    }

    /**
     * Makes a potion by using two items together
     */
    private static void makePotion(int item1, int item2) {
        if (Inventory.contains(item1) && Inventory.contains(item2)) {
            Inventory.getFirst(item1).useOn(Inventory.getFirst(item2));
            Time.sleepTicks(1);
        }
    }

    /**
     * Withdraws items from bank for potion making
     */
    private static void withdrawItemsForLevel(int item1, int amount1, int item2, int amount2) {
        BankHelper.withdrawItem(item1, amount1);
        BankHelper.withdrawItem(item2, amount2);
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        int currentLevel = Skills.getLevel(Skill.HERBLORE);

        if (currentLevel < LEVEL_ATTACK_POTION) {
            return Inventory.contains(VIAL) && Inventory.contains(GUAM_LEAF);
        } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
            return Inventory.contains(MARRENTILL) && Inventory.contains(EYE_OF_NEWT);
        } else if (currentLevel >= LEVEL_STRENGTH_POTION) {
            return Inventory.contains(VIAL) && Inventory.contains(HARRALANDER);
        }

        return false;
    }

    /**
     * Checks if required items are in bank
     */
    private static boolean hasRequiredItemsInBank() {
        int currentLevel = Skills.getLevel(Skill.HERBLORE);

        if (currentLevel < LEVEL_ATTACK_POTION) {
            return Bank.contains(VIAL) && Bank.contains(GUAM_LEAF);
        } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
            return Bank.contains(MARRENTILL) && Bank.contains(EYE_OF_NEWT);
        } else if (currentLevel >= LEVEL_STRENGTH_POTION) {
            return Bank.contains(VIAL) && Bank.contains(HARRALANDER);
        }

        return false;
    }

    /**
     * Calculates number of potions needed to reach target level
     */
    private static int calculatePotionsNeeded() {
        int currentExp = Skills.getExperience(Skill.HERBLORE);
        int currentLevel = Skills.getLevel(Skill.HERBLORE);

        if (currentLevel < LEVEL_ATTACK_POTION) {
            return (EXP_ATTACK_POTION - currentExp) / 25 + 150;
        } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
            return (EXP_STRENGTH_POTION - currentExp) / 50 + 75;
        }

        return 1;
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        int currentLevel = Skills.getLevel(Skill.HERBLORE);
        int potionsNeeded = calculatePotionsNeeded();

        if (currentLevel < LEVEL_ATTACK_POTION) {
            if (!Bank.contains(VIAL)) {
                shoppingList.add(new ShoppingItem(VIAL, potionsNeeded, 20));
            }
            if (!Bank.contains(GUAM_LEAF)) {
                shoppingList.add(new ShoppingItem(GUAM_LEAF, potionsNeeded, 5972));
            }
        } else if (currentLevel >= LEVEL_ATTACK_POTION && currentLevel < LEVEL_STRENGTH_POTION) {
            if (!Bank.contains(MARRENTILL)) {
                shoppingList.add(new ShoppingItem(MARRENTILL, potionsNeeded, 100));
            }
            if (!Bank.contains(EYE_OF_NEWT)) {
                shoppingList.add(new ShoppingItem(EYE_OF_NEWT, potionsNeeded, 12200));
            }
        } else if (currentLevel >= LEVEL_STRENGTH_POTION) {
            if (!Bank.contains(VIAL)) {
                shoppingList.add(new ShoppingItem(VIAL, potionsNeeded, 20));
            }
            if (!Bank.contains(HARRALANDER)) {
                shoppingList.add(new ShoppingItem(HARRALANDER, potionsNeeded, 14847));
            }
        }
    }
}
