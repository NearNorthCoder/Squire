package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step handler for Doric's Quest.
 * Handles mining ore collection, banking, and quest dialogue.
 */
public class DoricsQuestStep implements QuestStep {

    // Item IDs for quest requirements
    public static final int CLAY = 434;
    public static final int COPPER_ORE = 436;
    public static final int IRON_ORE = 440;
    public static final int BRONZE_PICKAXE = 1265;

    // Quest NPC and location
    private static final WorldPoint DORIC_LOCATION = new WorldPoint(2950, 3451, 0);

    // Quest progression tracking
    public static List<ItemToBuy> itemsToBuy = new ArrayList<>();
    public static boolean shouldBuyItems = false;
    private static int dialogAttempts = 0;
    private static boolean questStarted = false;
    private static int navigationAttempts = 0;

    // Dialog options for Doric
    private static final String[] DORIC_DIALOG = new String[]{
        "I wanted to use your anvils.",
        "Yes, I will get you the materials.",
        "Certainly, I'll be right back!",
        "Yes."
    };

    @Override
    public String getQuestName() {
        return "Dorics quest";
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public boolean shouldExecute() {
        return QuestVarbits.getQuestVarbit(31) >= 100;
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 10;
    }

    /**
     * Main quest step handler.
     */
    public static void handleQuestStep() {
        // Handle item buying
        if (shouldBuyItems) {
            AccBuilderSotf.currentAction = "Buying items";
            ItemBuyer.buyItems(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Handle stamina potion
            if (Inventory.contains(StaminaPotionIds.STAMINA_POTIONS)
                && Movement.getRunEnergy() < 50) {
                Inventory.getFirst(StaminaPotionIds.STAMINA_POTIONS)
                    .interact("Drink");
                Time.sleepTicks(1);
            }

            // Enable run if disabled
            if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
                Movement.toggleRun();
            }

            // Check if we have all quest items
            if (!hasAllQuestItems() && QuestVarbits.getQuestVarbit(31) < 1) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Nav to bank";
                    BankHelper.walkToBank(nearestBank);
                    Time.sleepTicks(2);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Handling banking";

                    if (!Bank.isOpen()) {
                        BankHelper.openBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 7995);
                    }

                    if (Bank.isOpen()) {
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check for missing items - need specific quantities
                        if (!Bank.contains(CLAY) || Bank.getFirst(CLAY).getQuantity() < 6) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }
                        if (!Bank.contains(COPPER_ORE) || Bank.getFirst(COPPER_ORE).getQuantity() < 2) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }
                        if (!Bank.contains(IRON_ORE) || Bank.getFirst(IRON_ORE).getQuantity() < 4) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        // Withdraw quest items
                        int[] requiredItems = {IRON_ORE, COPPER_ORE, CLAY, BRONZE_PICKAXE};
                        if (!QuestVarbits.hasAllItems(requiredItems)) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        if (QuestVarbits.hasAllItems(requiredItems)) {
                            BankHelper.withdrawItem(IRON_ORE, 4);
                            BankHelper.withdrawItem(COPPER_ORE, 2);
                            BankHelper.withdrawItem(CLAY, 6);
                            BankHelper.withdrawItem(BRONZE_PICKAXE, 1);
                        }

                        if (AccBuilderSotf.hasStaminaPotion) {
                            BankHelper.withdrawStaminaPotion(1);
                        }
                    }
                }
            }

            // Navigate to Doric if we have items
            if (hasAllQuestItems() && QuestVarbits.getQuestVarbit(31) > 0
                && Players.getLocal().getWorldLocation().distanceTo(DORIC_LOCATION) > 7) {
                handleBankingForQuestItems();
            }

            if ((!hasAllQuestItems() || Players.getLocal().getWorldLocation().distanceTo(DORIC_LOCATION) <= 7)
                && QuestVarbits.getQuestVarbit(31) < 100) {
                if (Players.getLocal().getWorldLocation().distanceTo(DORIC_LOCATION) > 4) {
                    navigationAttempts = 0;
                    AccBuilderSotf.currentAction = "Nav to start";
                    if (dialogAttempts < 1) {
                        QuestVarbits.handleCombat();
                        dialogAttempts += 1;
                    }
                    Movement.walkTo(DORIC_LOCATION);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(DORIC_LOCATION) <= 6) {
                    AccBuilderSotf.currentAction = "Handle dialog";

                    // Open door if needed
                    var door = TileObjects.getNearest("Door");
                    if (door != null) {
                        if (door.hasAction("Open")) {
                            door.interact("Open");
                            Time.sleepTicks(3);
                        }
                    }

                    if (dialogAttempts < 1) {
                        PlayerStats.incrementTotalXP();
                        PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                        dialogAttempts += 1;
                        PlayerStats.resetTotalXP();
                        questStarted = false;
                    }

                    DialogHandler.handleDialog("Doric", DORIC_DIALOG);
                }
            }

            DialogHandler.handleDialog(new String[0]);
        }

        System.out.println("Setting: " + QuestVarbits.getQuestVarbit(31));
    }

    /**
     * Handles banking to get quest items.
     */
    private static void handleBankingForQuestItems() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Nav to bank";
            BankHelper.walkToBank(nearestBank);
            Time.sleepTicks(2);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.currentAction = "Handling banking";

            if (!Bank.isOpen()) {
                BankHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 7995);
            }

            if (Bank.isOpen()) {
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }
                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                int[] requiredItems = {IRON_ORE, COPPER_ORE, CLAY, BRONZE_PICKAXE};
                if (!QuestVarbits.hasAllItems(requiredItems)) {
                    createBuyList();
                    System.out.println("We are missing quest supplies, switching to BUYING");
                    shouldBuyItems = true;
                    return;
                }

                if (QuestVarbits.hasAllItems(requiredItems)) {
                    BankHelper.withdrawItem(IRON_ORE, 4);
                    BankHelper.withdrawItem(COPPER_ORE, 2);
                    BankHelper.withdrawItem(CLAY, 6);
                    BankHelper.withdrawItem(BRONZE_PICKAXE, 1);
                }
            }
        }
    }

    /**
     * Checks if the player has all required quest items.
     */
    private static boolean hasAllQuestItems() {
        if (Inventory.getCount(CLAY) >= 6) {
            if (Inventory.getCount(COPPER_ORE) >= 2) {
                if (Inventory.getCount(IRON_ORE) >= 4) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Creates a list of items to buy from the Grand Exchange.
     */
    private static void createBuyList() {
        // Check what we're missing and add to buy list
        if (!Bank.contains(CLAY)) {
            if (Bank.contains(CLAY) && Bank.getFirst(CLAY).getQuantity() < 6) {
                itemsToBuy.add(new ItemToBuy(CLAY, 6, 32759));
            }
        } else {
            itemsToBuy.add(new ItemToBuy(CLAY, 6, 32759));
        }

        if (!Bank.contains(COPPER_ORE)) {
            if (Bank.contains(COPPER_ORE) && Bank.getFirst(COPPER_ORE).getQuantity() < 2) {
                itemsToBuy.add(new ItemToBuy(COPPER_ORE, 2, 32759));
            }
        } else {
            itemsToBuy.add(new ItemToBuy(COPPER_ORE, 2, 32759));
        }

        if (!Bank.contains(IRON_ORE)) {
            if (Bank.contains(IRON_ORE) && Bank.getFirst(IRON_ORE).getQuantity() < 4) {
                itemsToBuy.add(new ItemToBuy(IRON_ORE, 4, 32759));
            }
        } else {
            itemsToBuy.add(new ItemToBuy(IRON_ORE, 4, 32759));
        }

        if (!Bank.contains(BRONZE_PICKAXE)) {
            itemsToBuy.add(new ItemToBuy(BRONZE_PICKAXE, 7, 32767));
        }

        Predicate<net.runelite.api.Item> ringOfWealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ItemToBuy(28542, 5, 26555));
        }

        if (!Bank.contains(16359)) {
            itemsToBuy.add(new ItemToBuy(16359, 40, 19932));
        }
    }
}
