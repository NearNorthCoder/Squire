package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.sotf.framework.*;

/**
 * Handles the "X Marks the Spot" tutorial quest.
 * This is typically one of the first quests completed on a new account.
 */
public class XMarksTheSpotQuestStep implements QuestStep {

    // Item IDs for quest supplies
    private static final int SPADE_ID = 8007;
    private static final int CASKET_ID = 8008;
    private static final int CLUE_SCROLL_ID = 12625;
    private static final int BEER_ID = 8579;  // Example consumable
    private static final int RING_OF_WEALTH_PREFIX_ID = 8023;
    private static final int SWORDFISH_ID = 8206;
    private static final int BREAD_ID = 12993;
    private static final int HAMMER_ID = 8319;
    private static final int FOOD_ID = 8007;  // Food for healing

    // Constants
    private static final int BANK_TIMEOUT_MS = 5000;
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 4;
    private static final int QUEST_DISTANCE = 8;
    private static final int RUN_ENERGY_THRESHOLD = 50;
    private static final int PRAYER_POINTS_THRESHOLD = 24;
    private static final int QUANTITY_TO_BUY = 10;
    private static final int REQUIRED_ITEMS_FOR_QUEST = 7;

    // Status messages
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to quest";
    private static final String MSG_NAV_TO_BANK = "Nav to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing quest supplies, switching to BUYING";
    private static final String MSG_DRINK = "Drink";
    private static final String MSG_EAT = "Eat";
    private static final String MSG_NAV_TO_START = "Nav to start";
    private static final String ITEM_NAME_SHARK = "Shark";
    private static final String ITEM_PREFIX_RING_OF_WEALTH = "ring of wealth (";
    private static final String DIALOG_YES = "Yes.";

    // State variables
    public static List<d> itemsToBuy;
    public static boolean isBuying;
    static WorldPoint questStartLocation;
    static int questVarbitValue;
    private static String[] questDialogOptions;

    static {
        itemsToBuy = new ArrayList<>();
        questStartLocation = new WorldPoint(0, 0, 0);
        questVarbitValue = 0;
        questDialogOptions = new String[]{DIALOG_YES};
    }

    /**
     * Main execution method for the quest step.
     */
    public static void execute() {
        // Handle GE buying if needed
        if (isBuying) {
            b.a(itemsToBuy);
            if (itemsToBuy.size() < TICK_DELAY_SHORT) {
                System.out.println(MSG_FINISHED_BUYING);
                isBuying = false;
            }
        }

        if (!isBuying) {
            // Handle banking if we're missing supplies
            if (hasRequiredItems() && GameStateUtil.getVarbit(questVarbitValue) < TICK_DELAY_SHORT) {
                handleBanking();
            }

            // Use stamina potion if run energy is low
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < RUN_ENERGY_THRESHOLD) {
                Inventory.getFirst(f.ba).interact(MSG_DRINK);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }

            // Use prayer restore if prayer points are low
            if (Inventory.contains(f.aX) && Prayers.getPoints() < PRAYER_POINTS_THRESHOLD) {
                Inventory.getFirst(f.aX).interact(MSG_DRINK);
            }

            // Eat food if health is low
            if (GameStateUtil.getHealthPercentage() < 60.0) {
                if (Inventory.contains(ITEM_NAME_SHARK)) {
                    Inventory.getFirst(ITEM_NAME_SHARK).interact(MSG_EAT);
                    Time.sleepTicks(TICK_DELAY_MEDIUM);
                }
            }

            // Navigate to quest start and complete quest
            if (hasRequiredItems() && GameStateUtil.getVarbit(questVarbitValue) != 0) {
                navigateToQuestStart();
                completeQuestDialog();
            }
        }
    }

    /**
     * Handles banking - deposits all items and withdraws quest supplies.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_BANK;
            a.a(nearestBank);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            if (!Bank.isOpen()) {
                a.a();
                Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.c = MSG_HANDLING_BANKING;

                // Deposit everything
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(TICK_DELAY_LONG);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(TICK_DELAY_MEDIUM);
                }

                // Check if we're missing quest items
                if (!GameStateUtil.randomRange(new int[]{0, SPADE_ID, CASKET_ID})) {
                    populateShoppingList();
                    System.out.println(MSG_MISSING_SUPPLIES);
                    isBuying = true;
                    return;
                }

                // Withdraw quest supplies
                if (GameStateUtil.randomRange(new int[]{0, SPADE_ID, CASKET_ID})) {
                    a.a(SPADE_ID, QUANTITY_TO_BUY);
                    a.a(CLUE_SCROLL_ID, TICK_DELAY_SHORT);
                }
            }
        }
    }

    /**
     * Navigates to the quest start location.
     */
    private static void navigateToQuestStart() {
        if (Players.getLocal().getWorldLocation().distanceTo(questStartLocation) > QUEST_DISTANCE) {
            AccBuilderSotf.c = MSG_NAV_TO_START;

            if (Dialog.isOpen()) {
                Dialog.close();
            }

            Movement.walkTo(questStartLocation);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Completes quest dialog interactions.
     */
    private static void completeQuestDialog() {
        if (Players.getLocal().getWorldLocation().distanceTo(questStartLocation) <= QUEST_DISTANCE) {
            g.a("", questDialogOptions);
        }
    }

    /**
     * Checks if the player has all required items for the quest.
     *
     * @return true if all required items are present
     */
    private static boolean hasRequiredItems() {
        int[] requiredItems = new int[]{SPADE_ID, CASKET_ID, CLUE_SCROLL_ID};

        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Populates the shopping list with items to buy from the Grand Exchange.
     */
    private static void populateShoppingList() {
        // Casket
        if (!Bank.contains(CASKET_ID) || Bank.getFirst(CASKET_ID).getQuantity() < QUANTITY_TO_BUY) {
            itemsToBuy.add(new ShopItem(CASKET_ID, QUANTITY_TO_BUY, GameStateUtil.randomRange(12344, 26482)));
        }

        // Beer (example consumable)
        if (!Bank.contains(BEER_ID)) {
            itemsToBuy.add(new ShopItem(BEER_ID, 22508, 20));
        }

        // Ring of wealth (using predicate to match any charged version)
        if (!Bank.contains(item -> item.getName().toLowerCase().contains(ITEM_PREFIX_RING_OF_WEALTH))) {
            itemsToBuy.add(new ShopItem(RING_OF_WEALTH_PREFIX_ID, 35, 28653));
        }

        // Swordfish
        if (!Bank.contains(SWORDFISH_ID)) {
            itemsToBuy.add(new ShopItem(SWORDFISH_ID, TICK_DELAY_SHORT, 31078));
        }

        // Clue scroll
        if (!Bank.contains(CLUE_SCROLL_ID) || Bank.getFirst(CLUE_SCROLL_ID).getQuantity() < TICK_DELAY_LONG) {
            itemsToBuy.add(new ShopItem(CLUE_SCROLL_ID, TICK_DELAY_LONG, j.cf));
        }

        // Bread
        if (!Bank.contains(BREAD_ID) || Bank.getFirst(BREAD_ID).getQuantity() < 20) {
            itemsToBuy.add(new ShopItem(BREAD_ID, 20, 8061));
        }

        // Hammer
        if (!Bank.contains(HAMMER_ID) || Bank.getFirst(HAMMER_ID).getQuantity() < REQUIRED_ITEMS_FOR_QUEST) {
            itemsToBuy.add(new ShopItem(HAMMER_ID, 30, 9103));
        }
    }

    @Override
    public String getName() {
        return "";  // Quest step name
    }

    @Override
    public boolean isComplete() {
        // Check if quest is complete
        return Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) != QUEST_DISTANCE;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;  // Not enabled/disabled
    }

    @Override
    public int execute() {
        try {
            execute();
        } catch (Exception e) {
            // Silently catch exceptions
        }
        return 10;  // Priority level
    }
}
