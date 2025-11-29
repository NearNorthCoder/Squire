package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
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
import net.unethicalite.api.widgets.Dialog;

import java.util.ArrayList;
import java.util.List;

/**
 * Mining training step for SOTF account builder.
 * Trains mining from level 1 by mining copper/tin at Lumbridge swamp.
 */
public class MiningStep implements QuestStep {

    private static final int COPPER_ORE_ID = 436;
    private static final int TIN_ORE_ID = 438;
    private static final int BRONZE_PICKAXE_ID = 1265;
    private static final int IRON_PICKAXE_ID = 1267;
    private static final int STEEL_PICKAXE_ID = 1269;
    private static final int MITHRIL_PICKAXE_ID = 1273;
    private static final int ADAMANT_PICKAXE_ID = 1271;
    private static final int RUNE_PICKAXE_ID = 1275;
    private static final int RING_OF_WEALTH_ID = 20786;

    private static final int COPPER_ROCK_ID = 11960;
    private static final int TIN_ROCK_ID = 11957;

    private static final int LEVEL_IRON_PICKAXE = 1;
    private static final int LEVEL_STEEL_PICKAXE = 6;
    private static final int LEVEL_MITHRIL_PICKAXE = 21;
    private static final int LEVEL_ADAMANT_PICKAXE = 31;
    private static final int LEVEL_RUNE_PICKAXE = 41;
    private static final int TARGET_LEVEL = 15;

    private static final WorldPoint MINING_CENTER = new WorldPoint(3225, 3148, 0);
    private static final WorldArea MINING_AREA = new WorldArea(3222, 3145, 8, 7, 0);

    private static final int[] ORES_TO_DROP = {COPPER_ORE_ID, TIN_ORE_ID};

    public static List<ShopItem> itemsToBuy = new ArrayList<>();
    public static boolean buyingMode = false;

    /**
     * Prepares the shopping list for required items.
     */
    public static void prepareShoppingList() {
        itemsToBuy.clear();

        // Check and add pickaxes to shopping list based on level
        if (!Bank.contains(BRONZE_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(BRONZE_PICKAXE_ID, 1, 5000));
        }

        if (!Bank.contains(IRON_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(IRON_PICKAXE_ID, 1, 5000));
        }

        if (!Bank.contains(STEEL_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(STEEL_PICKAXE_ID, 1, 5000));
        }

        if (!Bank.contains(MITHRIL_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(MITHRIL_PICKAXE_ID, 1, 10000));
        }

        if (!Bank.contains(ADAMANT_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(ADAMANT_PICKAXE_ID, 1, 15000));
        }

        if (!Bank.contains(RUNE_PICKAXE_ID)) {
            itemsToBuy.add(new ShopItem(RUNE_PICKAXE_ID, 1, 20000));
        }

        // Ring of wealth
        if (Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemsToBuy.add(new ShopItem(RING_OF_WEALTH_ID, 4, 15000));
        }
    }

    /**
     * Executes the mining training logic.
     */
    public static void executeMining() {
        // Handle buying mode
        if (buyingMode) {
            AccBuilderSotf.status = "Buying items";
            GrandExchangeHelper.buyItems(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to mining");
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
                    BankHelper.walkToBank(nearestBank);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        AccBuilderSotf.status = "Opening bank";
                        BankHelper.openBank();
                        Time.sleepUntil(Bank::isOpen, 5000);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.status = "Handling banking";

                        // Deposit inventory if not empty
                        if (!Inventory.getAll().isEmpty()) {
                            Bank.depositInventory();
                            Time.sleepTicks(5);
                        }

                        // Deposit equipment if not empty
                        if (!Equipment.getAll().isEmpty()) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we have required items
                        if (!hasPickaxeInBank() || !hasRingOfWealth()) {
                            prepareShoppingList();
                            System.out.println("We are missing supplies, switching to BUYING");
                            buyingMode = true;
                            return;
                        }

                        // Withdraw best pickaxe
                        withdrawBestPickaxe();

                        // Withdraw ring of wealth if available
                        if (Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
                            BankHelper.withdraw(RING_OF_WEALTH_ID, 1);
                        }
                    }
                }
            }

            // Mining logic
            if (hasRequiredSupplies()) {
                // Close dialog if open
                if (Dialog.isOpen()) {
                    Dialog.close();
                }

                // Drop ores if inventory is full
                if (Inventory.isFull()) {
                    AccBuilderSotf.status = "Dropping ores";
                    System.out.println("Dropping ores");
                    Inventory.getAll(ORES_TO_DROP).forEach(Item::drop);
                }

                // Mine if not full
                if (!Inventory.isFull()) {
                    // Navigate to mining area
                    if (!MINING_AREA.contains(Players.getLocal().getWorldLocation()) &&
                        Players.getLocal().getWorldLocation().distanceTo(MINING_CENTER) > 5) {
                        AccBuilderSotf.status = "Nav to mining spot";

                        // Equip ring of wealth if in inventory
                        if (Equipment.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
                            Equipment.getFirst(item -> item.getName().toLowerCase().contains("ring of wealth ("))
                                .interact("Wear");
                        }

                        Movement.walkTo(MINING_CENTER);
                        Time.sleepTicks(1);
                    }

                    // Mine if in area
                    if (MINING_AREA.contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.status = "Mining";

                        if (Players.getLocal().getAnimation() == -1) {
                            // Try to mine copper
                            var copperRock = TileObjects.getNearest(COPPER_ROCK_ID);
                            if (copperRock != null && MINING_AREA.contains(copperRock.getWorldLocation())) {
                                copperRock.interact("Mine");
                                Time.sleepTicks(2);
                            }

                            // Try to mine tin
                            var tinRock = TileObjects.getNearest(TIN_ROCK_ID);
                            if (tinRock != null && MINING_AREA.contains(tinRock.getWorldLocation())) {
                                tinRock.interact("Mine");
                                Time.sleepTicks(2);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks if player has the required supplies to mine.
     */
    private static boolean hasRequiredSupplies() {
        return hasPickaxe() && hasRingOfWealthEquipped();
    }

    /**
     * Checks if player has a pickaxe equipped or in inventory.
     */
    private static boolean hasPickaxe() {
        return Equipment.contains(item -> item.getName().toLowerCase().contains("pickaxe")) ||
               Inventory.contains(item -> item.getName().toLowerCase().contains("pickaxe"));
    }

    /**
     * Checks if player has a pickaxe in bank.
     */
    private static boolean hasPickaxeInBank() {
        return Bank.contains(BRONZE_PICKAXE_ID) || Bank.contains(IRON_PICKAXE_ID) ||
               Bank.contains(STEEL_PICKAXE_ID) || Bank.contains(MITHRIL_PICKAXE_ID) ||
               Bank.contains(ADAMANT_PICKAXE_ID) || Bank.contains(RUNE_PICKAXE_ID);
    }

    /**
     * Checks if ring of wealth is equipped or in inventory/bank.
     */
    private static boolean hasRingOfWealth() {
        return Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth (")) ||
               Inventory.contains(item -> item.getName().toLowerCase().contains("ring of wealth (")) ||
               Equipment.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("));
    }

    /**
     * Checks if ring of wealth is equipped.
     */
    private static boolean hasRingOfWealthEquipped() {
        return !Equipment.contains(item -> item.getName().toLowerCase().contains("ring of wealth (")) ||
               Equipment.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("));
    }

    /**
     * Withdraws the best pickaxe available based on mining level.
     */
    private static void withdrawBestPickaxe() {
        int miningLevel = Skills.getLevel(Skill.MINING);

        if (miningLevel >= LEVEL_RUNE_PICKAXE && Bank.contains(RUNE_PICKAXE_ID)) {
            BankHelper.withdraw(RUNE_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_ADAMANT_PICKAXE && Bank.contains(ADAMANT_PICKAXE_ID)) {
            BankHelper.withdraw(ADAMANT_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_MITHRIL_PICKAXE && Bank.contains(MITHRIL_PICKAXE_ID)) {
            BankHelper.withdraw(MITHRIL_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_STEEL_PICKAXE && Bank.contains(STEEL_PICKAXE_ID)) {
            BankHelper.withdraw(STEEL_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_IRON_PICKAXE && Bank.contains(IRON_PICKAXE_ID)) {
            BankHelper.withdraw(IRON_PICKAXE_ID, 1);
        } else if (Bank.contains(BRONZE_PICKAXE_ID)) {
            BankHelper.withdraw(BRONZE_PICKAXE_ID, 1);
        }
    }

    @Override
    public String getStepName() {
        return "Mining";
    }

    @Override
    public int execute() {
        executeMining();
        return 600;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.MINING) >= TARGET_LEVEL;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }
}
