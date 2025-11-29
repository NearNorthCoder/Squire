package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

import java.util.ArrayList;
import java.util.List;

/**
 * Training step handler for Crafting skill in SOTF plugin.
 * Handles glass blowing training from level 1 to 46, creating:
 * - Beer glasses (level 1-4)
 * - Candle lanterns (level 4-12)
 * - Oil lamps (level 12-21)
 * - Vials (level 21-34)
 * - Fishbowls (level 34-42)
 * - Unpowered orbs (level 42-46)
 * - Lantern lenses (level 46-49)
 * - Light orbs (level 49+)
 */
public class CraftingStep implements QuestStep {

    // Item IDs
    private static final int MOLTEN_GLASS = 1775;
    private static final int GLASSBLOWING_PIPE = 1785;

    // Target levels for each crafting item
    private static final int LEVEL_CANDLE_LANTERN = 4;
    private static final int LEVEL_OIL_LAMP = 12;
    private static final int LEVEL_VIAL = 21;
    private static final int LEVEL_FISHBOWL = 34;
    private static final int LEVEL_ORB = 42;
    private static final int LEVEL_LENS = 46;
    private static final int LEVEL_LIGHT_ORB = 49;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();

    @Override
    public String getStepName() {
        return "Crafting";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.CRAFTING) >= 46;
    }

    @Override
    public int execute() {
        handleCrafting();
        return 100;
    }

    /**
     * Main crafting handler
     */
    public static void handleCrafting() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to crafting");
                needsBuying = false;
            }
        }

        if (needsBuying || Skills.getLevel(Skill.CRAFTING) >= 46) {
            return;
        }

        // Banking phase
        if (!hasRequiredItems()) {
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
                    // Deposit inventory and equipment
                    if (Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(3);
                    }

                    if (Equipment.getAll().size() > 0) {
                        Bank.depositEquipment();
                        Time.sleepTicks(2);
                    }

                    // Check if we have required items in bank
                    if (!Bank.contains(MOLTEN_GLASS) || !Bank.contains(GLASSBLOWING_PIPE)) {
                        checkMissingItems();
                        System.out.println("We are missing supplies, switching to BUYING");
                        needsBuying = true;
                        return;
                    }

                    // Withdraw items
                    if (Inventory.getCount(MOLTEN_GLASS) < 1) {
                        Bank.withdrawAll(MOLTEN_GLASS, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS) > 0, 3000);
                    }

                    if (Inventory.getCount(GLASSBLOWING_PIPE) < 1) {
                        Bank.withdraw(GLASSBLOWING_PIPE, 1, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(GLASSBLOWING_PIPE) > 0, 3000);
                    }
                }
            }
        }

        // Crafting phase
        if (hasRequiredItems()) {
            if (Bank.isOpen()) {
                Bank.close();
            }

            if (!Bank.isOpen() && !Players.getLocal().isAnimating()) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }

                // Open production interface
                if (!Production.isOpen()) {
                    AccBuilderSotf.currentStatus = "Using items";
                    Time.sleepTicks(2);

                    Item glass = Inventory.getFirst(MOLTEN_GLASS);
                    Item pipe = Inventory.getFirst(GLASSBLOWING_PIPE);

                    if (glass != null && pipe != null) {
                        glass.useOn(pipe);
                        Time.sleepUntil(() -> Production.isOpen(), 3000);
                    }
                }

                // Make items based on level
                if (Production.isOpen()) {
                    int currentLevel = Skills.getLevel(Skill.CRAFTING);

                    if (currentLevel < LEVEL_CANDLE_LANTERN) {
                        AccBuilderSotf.currentStatus = "Crafting glass";
                        Production.chooseOption("Beer glass");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_CANDLE_LANTERN && currentLevel < LEVEL_VIAL) {
                        AccBuilderSotf.currentStatus = "Crafting candle lantern";
                        Production.chooseOption(2);
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_VIAL && currentLevel < LEVEL_FISHBOWL) {
                        AccBuilderSotf.currentStatus = "Crafting lamp";
                        Production.chooseOption("Oil lamp");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_FISHBOWL && currentLevel < LEVEL_ORB) {
                        AccBuilderSotf.currentStatus = "Crafting vial";
                        Production.chooseOption("Vial");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_ORB && currentLevel < LEVEL_LENS) {
                        AccBuilderSotf.currentStatus = "Crafting fishbowl";
                        Production.chooseOption("Fishbowl");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_LENS && currentLevel < LEVEL_LIGHT_ORB) {
                        AccBuilderSotf.currentStatus = "Crafting orb";
                        Production.chooseOption("Unpowered staff orb");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= LEVEL_LIGHT_ORB) {
                        AccBuilderSotf.currentStatus = "Crafting lens";
                        Production.chooseOption("Lantern lens");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    } else if (currentLevel >= 49) {
                        AccBuilderSotf.currentStatus = "Crafting light orb";
                        Production.chooseOption("Light orb");
                        Time.sleepTicks(6);
                        Time.sleepUntil(() -> !Inventory.contains(MOLTEN_GLASS) || Dialog.isOpen(),
                            65000);
                    }
                }
            }
        }
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        return Inventory.getCount(MOLTEN_GLASS) > 0
            && Inventory.getCount(GLASSBLOWING_PIPE) > 0;
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        if (!Bank.contains(MOLTEN_GLASS)) {
            System.out.println("Buying molten glass");
            shoppingList.add(new ShoppingItem(MOLTEN_GLASS, 16000, 32));
        }

        if (!Bank.contains(GLASSBLOWING_PIPE)) {
            System.out.println("Buying glassblowing pipe");
            shoppingList.add(new ShoppingItem(GLASSBLOWING_PIPE, 1, 24000));
        }

        // Check for ring of wealth for teleports
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShoppingItem(11980, 5, 13000));
        }

        if (!Bank.contains(12082)) {
            shoppingList.add(new ShoppingItem(12082, 36, ShoppingHelper.DEFAULT_PRICE));
        }
    }
}
