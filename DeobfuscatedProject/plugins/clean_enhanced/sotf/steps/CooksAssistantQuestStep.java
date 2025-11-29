package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Quest step handler for Cook's Assistant quest.
 * Handles banking, item acquisition, and quest progression dialogue.
 */
public class CooksAssistantQuestStep implements QuestStep {

    // Item IDs for quest requirements
    public static final int BUCKET_OF_MILK = 1927;
    public static final int EGG = 1944;
    public static final int POT_OF_FLOUR = 1933;

    // Quest NPC location (Cook in Lumbridge Castle)
    public static final WorldPoint COOK_LOCATION = new WorldPoint(3207, 3213, 0);
    public static final WorldPoint LUMBRIDGE_CASTLE = new WorldPoint(3206, 3212, 2);

    // Quest progression tracking
    public static List<ItemToBuy> itemsToBuy = new ArrayList<>();
    public static boolean shouldBuyItems = false;
    private static int dialogAttempts = 0;
    private static boolean questStarted = false;
    private static int navigationAttempts = 0;

    // Dialog options for quest
    private static final String[] QUEST_DIALOG = new String[]{
        "Can you make me a cake?",
        "I'm always happy to help a cook in distress.",
        "Actually, I know where to find this stuff.",
        "Yes.",
        "What's wrong?"
    };

    @Override
    public String getQuestName() {
        return "Cooks Assistant Quest";
    }

    @Override
    public boolean isComplete() {
        // Quest is complete when varbit >= 2
        return QuestVarbits.getQuestVarbit(29) >= 2;
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }

    @Override
    public int execute() {
        try {
            handleQuestStep();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 164;
    }

    /**
     * Main quest step handler.
     * Manages the quest flow: buying items, banking, navigating, and dialog.
     */
    public static void handleQuestStep() {
        // Handle item buying if needed
        if (shouldBuyItems) {
            AccBuilderSotf.currentAction = "Buying items";
            ItemBuyer.buyItems(itemsToBuy);
            if (itemsToBuy.size() < 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Check if we have all required items
            if (!hasAllQuestItems() && Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) > 32
                    && QuestVarbits.getQuestVarbit(29) >= 2) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank if not there
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Walking to bank";
                    BankHelper.walkToBank(nearestBank);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.currentAction = "Handling banking";

                    if (!Bank.isOpen()) {
                        BankHelper.openBank();
                        Time.sleepUntil(() -> Bank.isOpen(), 5000);
                    }

                    if (Bank.isOpen()) {
                        // Deposit inventory and equipment
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(32);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we're missing required items
                        int[] requiredItems = {BUCKET_OF_MILK, EGG, POT_OF_FLOUR};
                        if (!QuestVarbits.hasAllItems(requiredItems)) {
                            createBuyList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        // Withdraw stamina potion if account has it
                        if (AccBuilderSotf.hasStaminaPotion) {
                            BankHelper.withdrawStaminaPotion(1);
                        }

                        // Withdraw quest items
                        if (QuestVarbits.hasAllItems(requiredItems)) {
                            BankHelper.withdrawItems(requiredItems);
                        }
                    }
                }
            }

            // Navigate to Cook if we have items and are far away
            if ((!hasAllQuestItems() || Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) <= 32)
                    && QuestVarbits.getQuestVarbit(29) >= 2) {
                AccBuilderSotf.currentAction = "Nav to start";

                if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) > 3) {
                    navigationAttempts = 0;
                    Movement.walkTo(COOK_LOCATION);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) <= 3) {
                    if (dialogAttempts < 1) {
                        PlayerStats.incrementTotalXP();
                        PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                        dialogAttempts += 1;
                        PlayerStats.resetTotalXP();
                        questStarted = false;
                    }

                    AccBuilderSotf.currentAction = "Handling dialog";
                    if (navigationAttempts < 1) {
                        QuestVarbits.handleCombat();
                        navigationAttempts += 1;
                    }
                    DialogHandler.handleDialog("Cook", QUEST_DIALOG);
                }
            }

            DialogHandler.handleDialog(new String[0]);
        }
    }

    /**
     * Checks if the player has all required quest items.
     */
    private static boolean hasAllQuestItems() {
        if (Inventory.getCount(BUCKET_OF_MILK) > 0) {
            if (Inventory.getCount(POT_OF_FLOUR) > 0) {
                if (Inventory.getCount(EGG) > 0) {
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
        if (!Bank.contains(POT_OF_FLOUR)) {
            itemsToBuy.add(new ItemToBuy(POT_OF_FLOUR, 1, 5000));
        }
        if (!Bank.contains(EGG)) {
            itemsToBuy.add(new ItemToBuy(EGG, 1, 5000));
        }
        if (!Bank.contains(BUCKET_OF_MILK)) {
            itemsToBuy.add(new ItemToBuy(BUCKET_OF_MILK, 1, 5000));
        }

        // Add basic supplies
        if (!Bank.contains(POT_OF_FLOUR)) {
            itemsToBuy.add(new ItemToBuy(POT_OF_FLOUR, 10, 32767));
        }

        Predicate<net.runelite.api.Item> ringOfWealthPredicate = item ->
            item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuy.add(new ItemToBuy(28542, 5, 26555));
        }

        if (!Bank.contains(16359)) {
            itemsToBuy.add(new ItemToBuy(16359, 40, 8173));
        }
    }
}
