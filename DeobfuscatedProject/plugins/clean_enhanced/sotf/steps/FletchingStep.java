package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Training step handler for Fletching skill in SOTF plugin.
 * Handles fletching training from level 1 to 60, including:
 * - Arrow shafts (level 1-10)
 * - Oak longbows (level 10-35)
 * - Willow shortbows (level 35-40)
 * - Willow longbows (level 40-55)
 * - Maple longbows (level 55+)
 */
public class FletchingStep implements QuestStep {

    // Item IDs
    private static final int ARROW_SHAFTS = 53;
    private static final int HEADLESS_ARROWS = 53;
    private static final int FEATHERS = 314;
    private static final int KNIFE = 946;
    private static final int LOGS = 1511;
    private static final int OAK_LOGS = 1521;
    private static final int WILLOW_LOGS = 1519;
    private static final int MAPLE_LOGS = 1517;

    // Unfinished bow item IDs
    private static final int OAK_LONGBOW_U = 54;
    private static final int WILLOW_SHORTBOW_U = 60;
    private static final int WILLOW_LONGBOW_U = 58;
    private static final int MAPLE_LONGBOW_U = 62;

    // Target levels
    private static final int LEVEL_ARROWS = 1;
    private static final int LEVEL_OAK_LONGBOW = 10;
    private static final int LEVEL_WILLOW_SHORTBOW = 35;
    private static final int LEVEL_WILLOW_LONGBOW = 40;
    private static final int LEVEL_MAPLE_LONGBOW = 55;

    // State management
    public static boolean needsBuying = false;
    public static List<ShoppingItem> shoppingList = new ArrayList<>();

    @Override
    public String getStepName() {
        return "Fletching";
    }

    @Override
    public boolean shouldExecute() {
        return false; // Managed by plugin
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.FLETCHING) >= 60;
    }

    @Override
    public int execute() {
        handleFletching();
        return 100;
    }

    /**
     * Main fletching handler
     */
    public static void handleFletching() {
        // Handle shopping mode
        if (needsBuying) {
            AccBuilderSotf.currentStatus = "Buying items";
            ShoppingHelper.buyItems(shoppingList);
            if (shoppingList.size() < 1) {
                System.out.println("Finished buying items, switching back to fletching");
                needsBuying = false;
            }
        }

        if (needsBuying || Skills.getLevel(Skill.FLETCHING) >= 60) {
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
                if (!Bank.isOpen()) {
                    AccBuilderSotf.currentStatus = "Opening bank";
                    BankHelper.openBank();
                    Time.sleepUntil(() -> Bank.isOpen(), 3000);
                }

                if (Bank.isOpen()) {
                    AccBuilderSotf.currentStatus = "Handling banking";

                    // Deposit inventory and equipment
                    if (Inventory.getAll().size() > 0) {
                        Bank.depositInventory();
                        Time.sleepTicks(6);
                    }

                    if (Equipment.getAll().size() > 0) {
                        Bank.depositEquipment();
                        Time.sleepTicks(3);
                    }

                    // Check for required items based on level
                    if (Skills.getLevel(Skill.FLETCHING) < LEVEL_OAK_LONGBOW) {
                        if (!Bank.contains(ARROW_SHAFTS) && !Inventory.contains(ARROW_SHAFTS)) {
                            checkMissingItems();
                            System.out.println("We are missing supplies, switching to BUYING");
                            needsBuying = true;
                            return;
                        }

                        if (!Bank.contains(FEATHERS) && !Inventory.contains(FEATHERS)) {
                            checkMissingItems();
                            System.out.println("We are missing supplies, switching to BUYING");
                            needsBuying = true;
                            return;
                        }

                        // Withdraw arrows and feathers
                        Bank.withdrawAll(ARROW_SHAFTS, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(ARROW_SHAFTS) > 0, 3000);

                        Bank.withdrawAll(FEATHERS, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(FEATHERS) > 0, 3000);
                    } else if (Skills.getLevel(Skill.FLETCHING) >= LEVEL_OAK_LONGBOW
                        && Skills.getLevel(Skill.FLETCHING) < LEVEL_WILLOW_SHORTBOW) {
                        if (!Bank.contains(ARROW_SHAFTS) && !Inventory.contains(ARROW_SHAFTS)) {
                            checkMissingItems();
                            System.out.println("We are missing supplies, switching to BUYING");
                            needsBuying = true;
                            return;
                        }

                        if (!Bank.contains(OAK_LOGS) && !Inventory.contains(OAK_LOGS)) {
                            checkMissingItems();
                            System.out.println("We are missing supplies, switching to BUYING");
                            needsBuying = true;
                            return;
                        }

                        // Withdraw oak logs and arrow shafts
                        Bank.withdrawAll(ARROW_SHAFTS, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(ARROW_SHAFTS) > 0, 3000);

                        Bank.withdrawAll(OAK_LOGS, Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(1);
                        Time.sleepUntil(() -> Inventory.getCount(OAK_LOGS) > 0, 3000);
                    } else if (Skills.getLevel(Skill.FLETCHING) >= LEVEL_WILLOW_SHORTBOW) {
                        if (!Bank.contains(KNIFE) || Inventory.getCount(KNIFE) < 1) {
                            checkMissingItems();
                            System.out.println("We are missing supplies, switching to BUYING");
                            needsBuying = true;
                            return;
                        }

                        // Withdraw knife
                        if (Inventory.getCount(KNIFE) < 1) {
                            Bank.withdraw(KNIFE, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(KNIFE) > 0, 3000);
                        }

                        // Withdraw appropriate logs
                        if (Inventory.getCount(KNIFE) > 0) {
                            Bank.withdrawAll(getLogsForLevel(), Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(getLogsForLevel()) > 0, 3000);
                        }
                    }
                }
            }
        }

        // Fletching phase
        if (hasRequiredItems()) {
            if (Bank.isOpen()) {
                Bank.close();
            }

            if (!Bank.isOpen() && !Players.getLocal().isAnimating()) {
                if (GrandExchange.isOpen()) {
                    GrandExchange.openBank();
                }

                // Open production interface
                if (!Production.isOpen()) {
                    AccBuilderSotf.currentStatus = "Using items";

                    Item firstItem = Inventory.getFirst(getFirstItemForLevel());
                    Item secondItem = Inventory.getFirst(getSecondItemForLevel());

                    if (firstItem != null && secondItem != null) {
                        Time.sleepTicks(3);
                        firstItem.useOn(secondItem);
                        Time.sleepUntil(() -> Production.isOpen(), 3000);
                    }
                }

                // Make items based on level
                if (Production.isOpen()) {
                    int currentLevel = Skills.getLevel(Skill.FLETCHING);

                    if (currentLevel >= LEVEL_WILLOW_SHORTBOW) {
                        handleBowFletching();
                    } else if (currentLevel >= LEVEL_OAK_LONGBOW
                        && currentLevel < LEVEL_WILLOW_SHORTBOW) {
                        handleOakLongbows();
                    } else {
                        handleArrows();
                    }
                }
            }
        }
    }

    /**
     * Handles arrow making for low levels
     */
    private static void handleArrows() {
        AccBuilderSotf.currentStatus = "Making arrows";
        Production.chooseOption(1);
        Time.sleepTicks(6);
        Time.sleepUntil(() -> Dialog.isOpen() || Dialog.canLevelUpContinue(),
            RandomHelper.getInt(30000, 40000));
    }

    /**
     * Handles oak longbow making
     */
    private static void handleOakLongbows() {
        AccBuilderSotf.currentStatus = "Fletching oak longs";
        Production.chooseOption("Oak longbow");
        Time.sleepTicks(6);
        Time.sleepUntil(() -> Dialog.isOpen() || Inventory.getCount(OAK_LONGBOW_U) < 1,
            RandomHelper.getInt(60000, 90000));
    }

    /**
     * Handles bow fletching for mid-high levels
     */
    private static void handleBowFletching() {
        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel >= LEVEL_WILLOW_SHORTBOW && currentLevel < LEVEL_WILLOW_LONGBOW) {
            AccBuilderSotf.currentStatus = "Fletching willow shorts";
            Production.chooseOption("Willow shortbow");
            Time.sleepTicks(6);
            Time.sleepUntil(() -> Dialog.isOpen() || Inventory.getCount(WILLOW_SHORTBOW_U) < 1,
                RandomHelper.getInt(60000, 90000));
        } else if (currentLevel >= LEVEL_WILLOW_LONGBOW && currentLevel < LEVEL_MAPLE_LONGBOW) {
            AccBuilderSotf.currentStatus = "Fletching willow longbows";
            Production.chooseOption("Willow longbow");
            Time.sleepTicks(6);
            Time.sleepUntil(() -> Dialog.isOpen() || Inventory.getCount(WILLOW_LONGBOW_U) < 1,
                RandomHelper.getInt(60000, 90000));
        } else if (currentLevel >= LEVEL_MAPLE_LONGBOW) {
            AccBuilderSotf.currentStatus = "Fletching maple longs";
            Production.chooseOption("Maple longbow");
            Time.sleepTicks(6);
            Time.sleepUntil(() -> Dialog.isOpen() || Inventory.getCount(MAPLE_LONGBOW_U) < 1,
                RandomHelper.getInt(60000, 90000));
        }
    }

    /**
     * Gets the appropriate logs for current fletching level
     */
    private static int getLogsForLevel() {
        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel >= LEVEL_MAPLE_LONGBOW) {
            return MAPLE_LONGBOW_U;
        } else if (currentLevel >= LEVEL_WILLOW_LONGBOW && currentLevel < LEVEL_MAPLE_LONGBOW) {
            return WILLOW_LONGBOW_U;
        } else if (currentLevel >= LEVEL_WILLOW_SHORTBOW && currentLevel < LEVEL_WILLOW_LONGBOW) {
            return WILLOW_SHORTBOW_U;
        } else if (currentLevel < OAK_LOGS) {
            return ARROW_SHAFTS;
        }

        return 0;
    }

    /**
     * Gets first item to use based on level
     */
    private static int getFirstItemForLevel() {
        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel >= LEVEL_WILLOW_SHORTBOW) {
            return KNIFE;
        } else if (currentLevel >= LEVEL_OAK_LONGBOW && currentLevel < LEVEL_WILLOW_SHORTBOW) {
            return OAK_LOGS;
        } else {
            return FEATHERS;
        }
    }

    /**
     * Gets second item to use based on level
     */
    private static int getSecondItemForLevel() {
        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel >= LEVEL_MAPLE_LONGBOW) {
            return MAPLE_LONGBOW_U;
        } else if (currentLevel >= LEVEL_WILLOW_LONGBOW && currentLevel < LEVEL_MAPLE_LONGBOW) {
            return WILLOW_LONGBOW_U;
        } else if (currentLevel >= LEVEL_WILLOW_SHORTBOW && currentLevel < LEVEL_WILLOW_LONGBOW) {
            return WILLOW_SHORTBOW_U;
        } else if (currentLevel >= LEVEL_OAK_LONGBOW && currentLevel < LEVEL_WILLOW_SHORTBOW) {
            return ARROW_SHAFTS;
        } else {
            return ARROW_SHAFTS;
        }
    }

    /**
     * Checks if player has required items in inventory
     */
    private static boolean hasRequiredItems() {
        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel >= LEVEL_OAK_LONGBOW && currentLevel < LEVEL_WILLOW_SHORTBOW) {
            return Inventory.getCount(ARROW_SHAFTS) > 0
                && Inventory.getCount(OAK_LOGS) > 0;
        } else if (currentLevel >= LEVEL_WILLOW_SHORTBOW) {
            return Inventory.getCount(KNIFE) > 0
                && Inventory.getCount(getLogsForLevel()) > 0;
        } else {
            return Inventory.getCount(ARROW_SHAFTS) > 0
                && Inventory.getCount(FEATHERS) > 0;
        }
    }

    /**
     * Checks which items are missing and adds to shopping list
     */
    private static void checkMissingItems() {
        shoppingList.clear();

        int currentLevel = Skills.getLevel(Skill.FLETCHING);

        if (currentLevel < LEVEL_OAK_LONGBOW) {
            shoppingList.add(new ShoppingItem(ARROW_SHAFTS, 27000, 10));
            shoppingList.add(new ShoppingItem(FEATHERS, 26000, 18));
        } else if (currentLevel >= LEVEL_OAK_LONGBOW && currentLevel < LEVEL_WILLOW_SHORTBOW) {
            shoppingList.add(new ShoppingItem(ARROW_SHAFTS, 27000, 10));
            shoppingList.add(new ShoppingItem(OAK_LOGS, 26000, 233));
        } else if (currentLevel >= LEVEL_WILLOW_SHORTBOW && currentLevel < LEVEL_WILLOW_LONGBOW) {
            shoppingList.add(new ShoppingItem(WILLOW_SHORTBOW_U, 38000, 60));
            shoppingList.add(new ShoppingItem(KNIFE, 1, 3000));
        } else if (currentLevel >= LEVEL_WILLOW_LONGBOW && currentLevel < LEVEL_MAPLE_LONGBOW) {
            shoppingList.add(new ShoppingItem(WILLOW_LONGBOW_U, 27000, 60));
            shoppingList.add(new ShoppingItem(KNIFE, 1, 3000));
        } else if (currentLevel >= LEVEL_MAPLE_LONGBOW) {
            shoppingList.add(new ShoppingItem(MAPLE_LONGBOW_U, 27000, 60));
            shoppingList.add(new ShoppingItem(KNIFE, 1, 3000));
        }

        // Check for ring of wealth
        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShoppingItem(11980, 5, 13000));
        }

        if (!Bank.contains(12082)) {
            shoppingList.add(new ShoppingItem(12082, 10, ShoppingHelper.DEFAULT_PRICE));
        }

        if (!Bank.contains(11978)) {
            shoppingList.add(new ShoppingItem(11978, 10, ShoppingHelper.DEFAULT_PRICE));
        }
    }
}
