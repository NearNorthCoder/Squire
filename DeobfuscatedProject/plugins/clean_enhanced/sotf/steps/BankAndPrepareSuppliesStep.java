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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.f;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.g;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

/**
 * Handles banking and supply preparation for the SOTF (Sins of the Father) quest.
 *
 * This step manages:
 * - Building a shopping list of required quest items
 * - Banking to deposit all inventory and equipment
 * - Withdrawing necessary supplies from bank
 * - Using consumables (stamina potions, prayer potions, food) during preparation
 * - Navigating to the quest start location
 *
 * The step operates in two phases:
 * 1. Shopping phase: If required items are missing from bank, create a shopping list
 * 2. Preparation phase: Bank items, withdraw supplies, and navigate to start location
 */
public class BankAndPrepareSuppliesStep implements ac {

    // Quest item IDs
    private static final int ROPE_ID = 954;                    // Rope item
    private static final int CROSSBOW_ID = 9177;               // Crossbow weapon
    private static final int VARROCK_TELEPORT_ID = 8007;       // Varrock teleport tablet
    private static final int SILVER_BAR_ID = 2355;             // Silver bar for quest
    private static final int BOLTS_ID = 877;                   // Crossbow bolts ammunition
    private static final int BROAD_BOLTS_ID = 11875;           // Broad bolts (higher tier)
    private static final int TELEPORT_TABLET_ID = 8013;        // Generic teleport tablet
    private static final int STAKE_ID = 1549;                  // Wooden stake for vampyres
    private static final int STAMINA_POTION_ID = 12625;        // Stamina potion (4 dose)

    // Quantity constants
    private static final int ROPE_QUANTITY = 2;                // Need 2 ropes
    private static final int CROSSBOW_QUANTITY = 7964;         // Price or quantity for crossbow
    private static final int VARROCK_TELEPORT_QUANTITY = 12;   // 12 teleport tablets
    private static final int SILVER_BAR_QUANTITY = 8157;       // Price or quantity for silver
    private static final int BOLTS_QUANTITY = 1;               // 1 set of bolts
    private static final int BROAD_BOLTS_QUANTITY = 28589;     // Price for broad bolts
    private static final int TELEPORT_QUANTITY = 14;           // 14 teleport tablets
    private static final int STAKE_QUANTITY = 7933;            // Price or quantity for stakes
    private static final int STAMINA_QUANTITY = 15;            // 15 stamina potions
    private static final int STAMINA_PRICE = 8111;             // Price for stamina potions

    // Consumable thresholds
    private static final int MIN_RUN_ENERGY = 161;             // Minimum run energy before drinking stamina
    private static final int MIN_PRAYER_POINTS = 24;           // Minimum prayer points before drinking prayer potion
    private static final int PRAYER_RESTORE_THRESHOLD = 5;     // Threshold for prayer restoration

    // Timing constants
    private static final int BANK_OPEN_TIMEOUT = 3000;         // 3000ms timeout for bank opening
    private static final int TICK_DELAY_SHORT = 1;             // 1 game tick delay
    private static final int TICK_DELAY_MEDIUM = 2;            // 2 game tick delay
    private static final int TICK_DELAY_LONG = 4;              // 4 game tick delay
    private static final int NAVIGATION_DISTANCE = 6;          // Distance threshold for navigation

    // Quest constants
    private static final int X_MARKS_SPOT_COMPLETE = 6;        // X Marks the Spot quest completion varbit value
    private static final int QUEST_STEP_TICK_DELAY = 72;       // Return value for quest step tick delay
    private static final int QUEST_STEP_INDEX = 11;            // This quest step's index

    // Food items
    private static final String FOOD_NAME = "Shark";           // Name of food item to use
    private static final String FOOD_INTERACTION = "Eat";      // Interaction text for food

    // Messages
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to quest";
    private static final String MSG_NAV_TO_BANK = "Nav to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing quest supplies, switching to BUYING";
    private static final String MSG_NAV_TO_START = "Nav to start";
    private static final String MSG_DRINK = "Drink";
    private static final String MSG_EMPTY_STRING = "";
    private static final String ITEM_RING_OF_WEALTH = "ring of wealth (";
    private static final String DIALOG_YES = "Yes.";

    // State management
    public static List<d> shoppingList;                        // List of items to buy
    public static boolean isPrepared;                          // Whether supplies are prepared
    static int currentQuestStep;                               // Current step in quest progression
    static WorldPoint startLocation;                           // Quest start location
    private static String[] dialogOptions;                     // Dialog options for interactions

    static {
        shoppingList = new ArrayList<d>();
        startLocation = new WorldPoint(0, 0, 0);               // Initialize to origin
        currentQuestStep = 0;
        dialogOptions = new String[] { DIALOG_YES };
    }

    /**
     * Main execution method for the banking and preparation step.
     * Handles the complete flow from checking supplies to preparing for the quest.
     */
    public static void executeBankingAndPreparation() {
        // Phase 1: Check if we need to build a shopping list
        if (!isPrepared) {
            b.a(shoppingList);
            if (shoppingList.size() == 1) {
                System.out.println(MSG_FINISHED_BUYING);
                isPrepared = false;
            }
        }

        // Phase 2: Handle banking and supply preparation
        if (isPrepared) {
            // Check if we have required items in inventory
            if (hasRequiredItems() && e.j(currentQuestStep) == 0) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank if not already there
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = MSG_NAV_TO_BANK;
                    a.a(nearestBank);
                }

                // Handle banking operations
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    // Open bank if not already open
                    if (!Bank.isOpen()) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), BANK_OPEN_TIMEOUT);
                    }

                    // Perform banking operations
                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = MSG_HANDLING_BANKING;

                        // Deposit all inventory items
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(TICK_DELAY_LONG);
                        }

                        // Deposit all equipped items
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(TICK_DELAY_MEDIUM);
                        }

                        // Check if we have required items in bank
                        int[] requiredItems = new int[2];
                        requiredItems[0] = STAMINA_POTION_ID;
                        requiredItems[1] = SILVER_BAR_ID;

                        if (!e.c(requiredItems)) {
                            buildShoppingList();
                            System.out.println(MSG_MISSING_SUPPLIES);
                            isPrepared = false;
                            return;
                        }

                        // Withdraw required items if we have them
                        if (e.c(requiredItems)) {
                            a.a(STAMINA_POTION_ID, 2);         // Withdraw 2 stamina potions
                            a.a(VARROCK_TELEPORT_ID, 1);       // Withdraw 1 teleport
                        }
                    }
                }
            }

            // Use stamina potion if run energy is low
            if (Inventory.contains(f.ba) && Movement.getRunEnergy() < MIN_RUN_ENERGY) {
                Inventory.getFirst(f.ba).interact(MSG_DRINK);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }

            // Use prayer potion if prayer points are low
            if (Inventory.contains(f.aX) && Prayers.getPoints() < MIN_PRAYER_POINTS) {
                Inventory.getFirst(f.aX).interact(MSG_DRINK);
            }

            // Eat food if health is low (below 60%)
            if (e.w() < 60.0) {
                String[] foodNames = new String[1];
                foodNames[0] = FOOD_NAME;

                if (Inventory.contains(foodNames)) {
                    String[] foodSearch = new String[1];
                    foodSearch[0] = FOOD_NAME;
                    Inventory.getFirst(foodSearch).interact(FOOD_INTERACTION);
                    Time.sleepTicks(TICK_DELAY_MEDIUM);
                }
            }

            // Navigate to quest start location
            if (hasRequiredItems() && !e.j(currentQuestStep)) {
                if (Players.getLocal().getWorldLocation().distanceTo(startLocation) > NAVIGATION_DISTANCE) {
                    AccBuilderSotf.c = MSG_NAV_TO_START;

                    // Close any open dialogs
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }

                    // Walk to start location
                    Movement.walkTo(startLocation);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }

                // Interact with start NPC/object
                if (Players.getLocal().getWorldLocation().distanceTo(startLocation) <= NAVIGATION_DISTANCE) {
                    g.a(MSG_EMPTY_STRING, dialogOptions);
                }
            }
        }
    }

    /**
     * Checks if the player has all required items for the quest.
     *
     * Required items:
     * - Rope (item ID 954)
     * - Crossbow (item ID 9177)
     * - Varrock teleport (item ID 8007)
     *
     * @return true if all required items are in inventory, false otherwise
     */
    private static boolean hasRequiredItems() {
        int[] requiredItemIds = new int[3];
        requiredItemIds[0] = STAMINA_POTION_ID;
        requiredItemIds[1] = CROSSBOW_ID;
        requiredItemIds[2] = VARROCK_TELEPORT_ID;

        // Check each required item
        for (int itemId : requiredItemIds) {
            int[] itemCheck = new int[1];
            itemCheck[0] = itemId;
            if (!Inventory.contains(itemCheck)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Builds a shopping list of items needed for the quest.
     * Only adds items that are missing from the bank or don't have enough quantity.
     *
     * The shopping list includes:
     * - Crossbow with bolts
     * - Silver bars for holy symbols
     * - Food (sharks)
     * - Teleport tablets
     * - Varrock teleports
     * - Teleport to house tablets
     * - Stamina potions
     */
    private static void buildShoppingList() {
        // Check for crossbow (need at least 2)
        int[] crossbowCheck = new int[1];
        crossbowCheck[0] = CROSSBOW_ID;
        if (!Bank.contains(crossbowCheck)) {
            d crossbowItem = new d(CROSSBOW_ID, 2, e.c(7932, 6258));
            shoppingList.add(crossbowItem);
        }
        if (Bank.contains(crossbowCheck)) {
            int[] crossbowQuantityCheck = new int[1];
            crossbowQuantityCheck[0] = CROSSBOW_ID;
            if (Bank.getFirst(crossbowQuantityCheck).getQuantity() < 2) {
                d crossbowItem = new d(CROSSBOW_ID, 2, e.c(7932, 6258));
                shoppingList.add(crossbowItem);
            }
        }

        // Check for silver bars (221)
        int[] silverBarCheck = new int[1];
        silverBarCheck[0] = 221;
        if (!Bank.contains(silverBarCheck)) {
            d silverBarItem = new d(221, 22508, 20);
            shoppingList.add(silverBarItem);
        }

        // Check for ring of wealth (by name contains check)
        if (!Bank.contains((item) -> item.getName().toLowerCase().contains(ITEM_RING_OF_WEALTH))) {
            d ringItem = new d(8151, 5, 28664);
            shoppingList.add(ringItem);
        }

        // Check for teleport tablets (16342)
        int[] teleportCheck = new int[1];
        teleportCheck[0] = 16342;
        if (!Bank.contains(teleportCheck)) {
            d teleportItem = new d(16342, 1, 31159);
            shoppingList.add(teleportItem);
        }

        // Check for Varrock teleports (need at least 4)
        int[] varrockTeleportCheck = new int[1];
        varrockTeleportCheck[0] = VARROCK_TELEPORT_ID;
        if (!Bank.contains(varrockTeleportCheck)) {
            d varrockItem = new d(VARROCK_TELEPORT_ID, 4, j.cf);
            shoppingList.add(varrockItem);
        }
        if (Bank.contains(varrockTeleportCheck)) {
            int[] varrockQuantityCheck = new int[1];
            varrockQuantityCheck[0] = VARROCK_TELEPORT_ID;
            if (Bank.getFirst(varrockQuantityCheck).getQuantity() < 4) {
                d varrockItem = new d(VARROCK_TELEPORT_ID, 4, j.cf);
                shoppingList.add(varrockItem);
            }
        }

        // Check for teleport to house tablets (need at least 20)
        int[] houseTabCheck = new int[1];
        houseTabCheck[0] = 8013;
        if (!Bank.contains(houseTabCheck)) {
            d houseTabItem = new d(8013, 20, 7933);
            shoppingList.add(houseTabItem);
        }
        if (Bank.contains(houseTabCheck)) {
            int[] houseTabQuantityCheck = new int[1];
            houseTabQuantityCheck[0] = 8013;
            if (Bank.getFirst(houseTabQuantityCheck).getQuantity() < 20) {
                d houseTabItem = new d(8013, 20, 7933);
                shoppingList.add(houseTabItem);
            }
        }

        // Check for stamina potions (need at least 15)
        int[] staminaCheck = new int[1];
        staminaCheck[0] = STAMINA_POTION_ID;
        if (!Bank.contains(staminaCheck)) {
            d staminaItem = new d(STAMINA_POTION_ID, 32, 8111);
            shoppingList.add(staminaItem);
        }
        if (Bank.contains(staminaCheck)) {
            int[] staminaQuantityCheck = new int[1];
            staminaQuantityCheck[0] = STAMINA_POTION_ID;
            if (Bank.getFirst(staminaQuantityCheck).getQuantity() < 15) {
                d staminaItem = new d(STAMINA_POTION_ID, 32, 8111);
                shoppingList.add(staminaItem);
            }
        }
    }

    /**
     * Returns the tick delay for this quest step.
     * Controls how frequently this step's logic executes.
     *
     * @return tick delay (72 ticks)
     */
    @Override
    public int af() {
        try {
            executeBankingAndPreparation();
        } catch (Exception e) {
            // Silently handle exceptions to prevent step from crashing
        }
        return QUEST_STEP_TICK_DELAY;
    }

    /**
     * Returns the name/description of this quest step.
     *
     * @return empty string (step name not displayed)
     */
    @Override
    public String ag() {
        return MSG_EMPTY_STRING;
    }

    /**
     * Checks if this quest step should be executed.
     * Only executes if X Marks the Spot quest is complete.
     *
     * In OSRS, X Marks the Spot is a tutorial quest that must be completed
     * before accessing other content. This ensures the player has completed
     * basic tutorial steps.
     *
     * @return true if X Marks the Spot is complete, false otherwise
     */
    @Override
    public boolean ah() {
        return Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == X_MARKS_SPOT_COMPLETE;
    }

    /**
     * Checks if this quest step is complete.
     *
     * @return false - this step is never marked as complete, it's a recurring preparation step
     */
    @Override
    public boolean ae() {
        return false;
    }
}
