package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import gg.squire.sotf.util.BankingUtils;
import gg.squire.sotf.util.GrandExchangeHelper;
import gg.squire.sotf.util.PurchaseRequest;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unelite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

import java.util.ArrayList;
import java.util.List;

/**
 * Crafting training step using glassblowing.
 * Trains from level 1 to 87 by creating various glass items.
 */
public class CraftingGlassblowingStep implements QuestStepInterface {

    private static final int MOLTEN_GLASS_ID = 1775;
    private static final int GLASSBLOWING_PIPE_ID = 1785;
    private static final int RING_OF_WEALTH_ID = 11980;
    private static final int BUCKET_OF_SAND_ID = 1783;

    private static final int TARGET_LEVEL = 87;

    public static List<PurchaseRequest> itemsToBuy = new ArrayList<>();
    public static boolean buyingMode = false;

    /**
     * Prepares shopping list for required items.
     */
    public static void prepareShoppingList() {
        itemsToBuy.clear();

        if (!Bank.contains(MOLTEN_GLASS_ID)) {
            System.out.println("Buying molten glass");
            itemsToBuy.add(new PurchaseRequest(MOLTEN_GLASS_ID, 1000, 14783));
        }

        if (!Bank.contains(GLASSBLOWING_PIPE_ID)) {
            System.out.println("Buying glassblowing pipe");
            itemsToBuy.add(new PurchaseRequest(GLASSBLOWING_PIPE_ID, 1, 22015));
        }

        if (!Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemsToBuy.add(new PurchaseRequest(RING_OF_WEALTH_ID, 5, 27029));
        }

        if (!Bank.contains(BUCKET_OF_SAND_ID)) {
            itemsToBuy.add(new PurchaseRequest(BUCKET_OF_SAND_ID, 40, 18373));
        }
    }

    /**
     * Checks if player has required supplies for glassblowing.
     */
    public static boolean hasRequiredSupplies() {
        return Inventory.getCount(MOLTEN_GLASS_ID) > 0 &&
               Inventory.getCount(GLASSBLOWING_PIPE_ID) > 0;
    }

    /**
     * Executes the glassblowing training logic.
     */
    public static void executeGlassblowing() {
        int craftingLevel = Skills.getLevel(Skill.CRAFTING);

        // Handle buying mode
        if (buyingMode) {
            AccBuilderSotf.status = "Buying items";
            GrandExchangeHelper.processPurchases(itemsToBuy);

            if (itemsToBuy.isEmpty()) {
                System.out.println("Finished buying items, switching back to crafting");
                buyingMode = false;
            }
        }

        if (!buyingMode) {
            // Banking logic
            if (!hasRequiredSupplies()) {
                BankLocation nearestBank = BankLocation.getNearest();

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.status = "Navigating to bank";
                    BankingUtils.walkToBank(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        AccBuilderSotf.status = "Opening bank";
                        BankingUtils.openBank();
                        Time.sleepUntil(Bank::isOpen, 23995);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.status = "Handling banking";

                        // Deposit all
                        if (!Inventory.getAll().isEmpty()) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }

                        if (!Equipment.getAll().isEmpty()) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check for required items
                        if (!Bank.contains(MOLTEN_GLASS_ID) && Inventory.getCount(MOLTEN_GLASS_ID) < 1 ||
                            !Bank.contains(GLASSBLOWING_PIPE_ID) && Inventory.getCount(GLASSBLOWING_PIPE_ID) < 1) {
                            prepareShoppingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            buyingMode = true;
                            return;
                        }

                        // Withdraw glassblowing pipe
                        if (Bank.contains(GLASSBLOWING_PIPE_ID) && Inventory.getCount(GLASSBLOWING_PIPE_ID) < 1) {
                            Bank.withdraw(GLASSBLOWING_PIPE_ID, 1, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(GLASSBLOWING_PIPE_ID) > 0, 23995);
                        }

                        // Withdraw molten glass
                        if (Bank.contains(MOLTEN_GLASS_ID) && Inventory.getCount(MOLTEN_GLASS_ID) < 1 &&
                            Inventory.getCount(GLASSBLOWING_PIPE_ID) > 0) {
                            Bank.withdrawAll(MOLTEN_GLASS_ID, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(1);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) > 0, 23995);
                        }
                    }
                }
            }

            // Glassblowing logic
            if (hasRequiredSupplies()) {
                if (Bank.isOpen()) {
                    Bank.close();
                }

                if (!Bank.isOpen() && !Players.getLocal().isAnimating()) {
                    AccBuilderSotf.status = "Crafting ";

                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }

                    if (!Production.isOpen()) {
                        Time.sleepTicks(2);
                        var pipe = Inventory.getFirst(GLASSBLOWING_PIPE_ID);
                        var glass = Inventory.getFirst(MOLTEN_GLASS_ID);

                        if (pipe != null && glass != null) {
                            pipe.useOn(glass);
                            Time.sleepUntil(Production::isOpen, 23995);
                        }
                    }

                    if (Production.isOpen()) {
                        // Select item based on level
                        if (craftingLevel < 4) {
                            AccBuilderSotf.status = "Crafting glass";
                            Production.chooseOption("Beer glass");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 4 && craftingLevel < 12) {
                            AccBuilderSotf.status = "Crafting candle lantern";
                            Production.chooseOption(2);
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 12 && craftingLevel < 21) {
                            AccBuilderSotf.status = "Crafting lamp";
                            Production.chooseOption("Oil lamp");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 21 && craftingLevel < 33) {
                            AccBuilderSotf.status = "Crafting vial";
                            Production.chooseOption("Vial");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 33 && craftingLevel < 46) {
                            AccBuilderSotf.status = "Crafting fishbowl";
                            Production.chooseOption("Fishbowl");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 46 && craftingLevel < 87) {
                            AccBuilderSotf.status = "Crafting orb";
                            Production.chooseOption("Unpowered staff orb");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        } else if (craftingLevel >= 87) {
                            AccBuilderSotf.status = "Crafting light orb";
                            Production.chooseOption("Light orb");
                            Time.sleepTicks(177);
                            Time.sleepUntil(() -> Inventory.getCount(MOLTEN_GLASS_ID) < 1 || Dialog.isOpen(), 58802);
                        }
                    }
                }
            }
        }
    }

    @Override
    public String getStepName() {
        return "Crafting";
    }

    @Override
    public int execute() {
        executeGlassblowing();
        return 600;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.CRAFTING) >= TARGET_LEVEL;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
