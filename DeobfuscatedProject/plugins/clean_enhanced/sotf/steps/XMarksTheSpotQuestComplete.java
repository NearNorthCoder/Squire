package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles the "X Marks the Spot" quest in OSRS.
 *
 * <p>This is a beginner quest that involves:
 * <ol>
 *   <li>Speaking to Veos at the Port Sarim docks</li>
 *   <li>Obtaining a treasure scroll and spade from the bank</li>
 *   <li>Digging at 4 marked locations around Lumbridge</li>
 *   <li>Returning to Veos to complete the quest</li>
 *   <li>Selecting Slayer as the lamp reward</li>
 * </ol>
 *
 * <p><b>Quest Requirements:</b> None<br>
 * <b>Rewards:</b> 200 Slayer XP, 300 coins, Antique lamp
 *
 * <p>Quest varbits progression:
 * <ul>
 *   <li>0: Not started</li>
 *   <li>1: Received treasure scroll</li>
 *   <li>2: First dig location</li>
 *   <li>3: Second dig location</li>
 *   <li>4: Third dig location</li>
 *   <li>5: Fourth dig location</li>
 *   <li>6: Fifth dig location</li>
 *   <li>7: Return to Veos</li>
 *   <li>8+: Quest complete</li>
 * </ul>
 */
public class XMarksTheSpotQuestComplete implements ac {

    // ==================== ITEM IDS ====================

    /** Spade item ID - used for digging */
    private static final int SPADE_ID = 952;

    /** Amulet of Glory item ID - teleportation jewelry */
    private static final int GLORY_ID = 11978;

    /** Food item ID 1 */
    private static final int FOOD_1_ID = 8008;

    /** Ring of Wealth item ID */
    private static final int RING_OF_WEALTH_ID = 11980;

    /** Food item ID 2 */
    private static final int FOOD_2_ID = 8009;

    /** Food item ID 3 */
    private static final int FOOD_3_ID = 8007;

    /** Stamina potion item ID */
    private static final int STAMINA_POTION_ID = 12625;

    /** Antique lamp reward item ID */
    private static final int ANTIQUE_LAMP_ID = 23072;

    // ==================== GRAND EXCHANGE PRICES ====================

    /** Price to buy Amulet of Glory */
    private static final int GLORY_PRICE = 15900;

    /** Price to buy stamina potions */
    private static final int STAMINA_PRICE = 5900;

    /** Generic teleport item price */
    private static final int TELEPORT_PRICE = 500;

    /** Price to buy Ring of Wealth */
    private static final int RING_OF_WEALTH_PRICE = 11980;

    /** Generic item price */
    private static final int GENERIC_ITEM_PRICE = 25000;

    /** Food purchase price */
    private static final int FOOD_PRICE = 1900;

    // ==================== WIDGET IDS ====================

    /** Parent widget ID for antique lamp interface */
    private static final int LAMP_WIDGET_PARENT_ID = 240;

    /** Child widget ID for Slayer skill selection in lamp interface */
    private static final int LAMP_WIDGET_SLAYER_CHILD_ID = 14;

    /** Child widget ID for confirmation button in lamp interface */
    private static final int LAMP_WIDGET_CONFIRM_CHILD_ID = 26;

    // ==================== WORLD LOCATIONS ====================

    /**
     * Veos location at Port Sarim docks (3054, 3246, 0)
     * This is where the quest starts and ends
     */
    private static final WorldPoint VEOS_LOCATION = new WorldPoint(3054, 3246, 0);

    /**
     * First dig location near Lumbridge (3229, 3240, 0)
     * Quest varbit 0 - where player starts the quest with Veos
     */
    private static final WorldPoint DIG_LOCATION_1 = new WorldPoint(3229, 3240, 0);

    /**
     * Second dig location (3230, 3209, 0)
     * Quest varbit 2
     */
    private static final WorldPoint DIG_LOCATION_2 = new WorldPoint(3230, 3209, 0);

    /**
     * Third dig location (3203, 3212, 0)
     * Quest varbit 3
     */
    private static final WorldPoint DIG_LOCATION_3 = new WorldPoint(3203, 3212, 0);

    /**
     * Fourth dig location (3109, 3264, 0)
     * Quest varbit 4
     */
    private static final WorldPoint DIG_LOCATION_4 = new WorldPoint(3109, 3264, 0);

    /**
     * Fifth dig location (3078, 3259, 0)
     * Quest varbit 5
     */
    private static final WorldPoint DIG_LOCATION_5 = new WorldPoint(3078, 3259, 0);

    // ==================== DIALOGUE OPTIONS ====================

    /**
     * Dialogue options used during the quest.
     * These are selected automatically when interacting with NPCs.
     */
    public static final String[] DIALOGUE_OPTIONS = {
        "Ok, I'm up for an adventure.",
        "A glass of your finest ale please.",
        "Morgan needs your help!",
        "Yes.",
        "I'm looking for a quest!",
        "Ok, let me help then.",
        "Father Aereck sent me to talk to you.",
        "He's got a ghost haunting his graveyard.",
        "Yep, now tell me what the problem is.",
        "Sure.",
        "I'm wearing an amulet of ghost speak!",
        "Yes, I'm sure.",
        "How can I help?",
        "I'm looking for a quest.",
        "Can I help?"
    };

    // ==================== STATE VARIABLES ====================

    /** List of items to buy from the Grand Exchange if missing from bank */
    public static List<ItemToBuy> itemsToBuy;

    /** Whether the bot has checked the bank for quest supplies */
    public static boolean hasCheckedBank;

    /** Counter for NPC interaction attempts (prevents getting stuck) */
    public static int npcInteractionAttempts;

    /** Counter for dig location attempts */
    public static int digLocationAttempts;

    /** Timestamp of last interaction (used for timeout detection) */
    public static long lastInteractionTime;

    /** Flag indicating quest has been initialized */
    public static boolean questInitialized;

    static {
        itemsToBuy = new ArrayList<>();
        npcInteractionAttempts = 0;
    }

    // ==================== AC INTERFACE IMPLEMENTATION ====================

    /**
     * Returns whether this quest step is enabled/active.
     *
     * @return false - always disabled (controlled by other logic)
     */
    @Override
    public boolean ae() {
        return false;
    }

    /**
     * Returns the name/description of this quest step.
     *
     * @return "X marks the spot quest"
     */
    @Override
    public String ag() {
        return "X marks the spot quest";
    }

    /**
     * Executes the main quest logic.
     * This is called repeatedly by the quest manager.
     *
     * @return execution priority (100)
     */
    @Override
    public int af() {
        try {
            performQuestActions();
        } catch (Exception e) {
            // Silently handle exceptions to prevent bot crashes
        }
        return 100;
    }

    /**
     * Checks if this quest step should execute.
     * Returns true if quest is at varbit 8+ and player has antique lamp.
     *
     * @return true if should execute, false otherwise
     */
    @Override
    public boolean ah() {
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) >= 8) {
            return Inventory.contains(ANTIQUE_LAMP_ID);
        }
        return false;
    }

    // ==================== MAIN QUEST LOGIC ====================

    /**
     * Main quest execution logic that handles all quest progression.
     * This method orchestrates banking, item management, movement, and dialogue.
     */
    public static void performQuestActions() {
        // Initial bank check and item buying from GE
        if (!hasCheckedBank) {
            AccBuilderSotf.c = "Buying items";
            GrandExchangeHelper.buyItems(itemsToBuy);

            if (itemsToBuy.size() > 1) {
                System.out.println("Finished buying items, switching back to quest");
                hasCheckedBank = false;
            }
        }

        if (hasCheckedBank) {
            handleQuestProgressionByVarbit();
        }
    }

    /**
     * Handles the quest progression based on the current quest varbit value.
     * Each varbit value represents a different stage of the quest.
     */
    private static void handleQuestProgressionByVarbit() {
        // Manage stamina potions and food
        handleStaminaAndFood();

        // Enable run if disabled and we have energy
        if (!Movement.isRunEnabled() && Movement.getRunEnergy() > 0) {
            Movement.toggleRun();
        }

        // Quest not started (varbit 0) - prepare supplies
        if (!hasRequiredItems() && Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 0) {
            handleBanking();
        }

        // Quest varbit 0: Not started - walk to Veos to start
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 0 && hasRequiredItems()) {
            walkToLocationAndInteractWithNPC(DIG_LOCATION_1, "Nav to start", "Interact npc", "Veos");
        }

        // Quest varbit 1: Got treasure scroll - handle dialogue
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 1) {
            digLocationAttempts = 0;
            if (!Inventory.contains("Treasure scroll")) {
                DialogueHelper.handleDialogue(DIALOGUE_OPTIONS);
            }
        }

        // Quest varbit 2: First dig location
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 2) {
            handleJewelryEquipping();
            handleDigAtLocation(DIG_LOCATION_2, "Nav to dig 1");
        }

        // Quest varbit 3: Second dig location
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 3) {
            handleJewelryEquipping();
            handleDigAtLocation(DIG_LOCATION_3, "Nav to dig 2");
        }

        // Quest varbit 4: Third dig location
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 4) {
            handleJewelryEquipping();
            handleDigAtLocation(DIG_LOCATION_4, "Nav to dig 3");
        }

        // Quest varbit 5: Fourth dig location
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 5) {
            handleJewelryEquipping();
            handleDigAtLocation(DIG_LOCATION_5, "Nav to dig 4");
        }

        // Quest varbit 6: Fifth dig location
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 6) {
            handleDigAtLocation(new WorldPoint(3109, 3264, 0), "Nav to dig 5");
        }

        // Quest varbit 7: Return to Veos to complete
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 7) {
            completeQuestAtVeos();
        }

        // Quest varbit 10: Quest fully complete
        if (Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()) == 10) {
            DialogueHelper.handleDialogue(DIALOGUE_OPTIONS);
        }

        // Handle antique lamp reward
        if (Inventory.contains(ANTIQUE_LAMP_ID)) {
            handleAntiqueLampReward();
        } else {
            DialogueHelper.handleDialogue(new String[0]);
        }
    }

    // ==================== HELPER METHODS ====================

    /**
     * Handles stamina potion drinking and food eating for health/energy management.
     * Uses stamina potions when run energy is below 70, eats food when health is low.
     */
    private static void handleStaminaAndFood() {
        // Drink stamina potion if run energy is low
        if (Inventory.contains(StaminaHelper.STAMINA_POTIONS) && Movement.getRunEnergy() < 70) {
            Inventory.getFirst(StaminaHelper.STAMINA_POTIONS).interact("Drink");
            Time.sleepTicks(1);
        }

        // Eat food if health is below 70%
        if (HealthHelper.getHealthPercent() < 70.0) {
            if (Inventory.contains(SPADE_ID)) {
                Inventory.getFirst(SPADE_ID).interact("Eat");
            }
        }
    }

    /**
     * Checks if player has all required items for the quest.
     *
     * @return true if player has spade and required supplies
     */
    private static boolean hasRequiredItems() {
        return Inventory.contains("Spade") && Inventory.contains(SPADE_ID);
    }

    /**
     * Handles banking operations - withdrawing quest supplies and managing inventory.
     * If missing items, populates the Grand Exchange shopping list.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to bank";
            BankingHelper.walkToBank(nearestBank);
            Time.sleepTicks(2);
        }

        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Handling banking";

            // Open bank
            if (!Bank.isOpen()) {
                BankingHelper.openBank();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
            }

            if (Bank.isOpen()) {
                // Deposit all items
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(4);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Define required items
                int[] requiredItems = {GLORY_ID, FOOD_1_ID, STAMINA_POTION_ID, FOOD_3_ID, SPADE_ID, STAMINA_POTION_ID};

                // Check if we have all required items
                if (!InventoryHelper.hasBankItems(requiredItems)) {
                    populateShoppingList();
                    System.out.println("We are missing quest supplies, switching to BUYING");
                    hasCheckedBank = true;
                    return;
                }

                // Withdraw required items
                if (InventoryHelper.hasBankItems(requiredItems)) {
                    Bank.withdraw(FOOD_1_ID, 10, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);

                    Bank.withdraw(STAMINA_POTION_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);

                    Bank.withdraw(FOOD_2_ID, 10, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);

                    Bank.withdraw(FOOD_3_ID, 5, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);

                    Bank.withdraw(GLORY_ID, 1, Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks(1);

                    BankingHelper.withdrawItems(StaminaHelper.STAMINA_POTIONS, 4);
                    BankingHelper.withdrawItems(SPADE_ID, 10);
                    BankingHelper.withdrawItems(TeleportHelper.TELEPORT_ITEMS, 1);
                }
            }
        }
    }

    /**
     * Populates the shopping list with items to buy from the Grand Exchange.
     * Only adds items that are missing from the bank.
     */
    private static void populateShoppingList() {
        if (!Bank.contains(GLORY_ID)) {
            itemsToBuy.add(new ItemToBuy(GLORY_ID, 1, GLORY_PRICE));
        }

        if (!Bank.contains(STAMINA_POTION_ID)) {
            itemsToBuy.add(new ItemToBuy(STAMINA_POTION_ID, 1, STAMINA_PRICE));
        }

        if (!Bank.contains(SPADE_ID)) {
            itemsToBuy.add(new ItemToBuy(SPADE_ID, 40, FOOD_PRICE));
        }

        if (Bank.contains(item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            itemsToBuy.add(new ItemToBuy(RING_OF_WEALTH_ID, 5, RING_OF_WEALTH_PRICE));
        }

        if (!Bank.contains(FOOD_1_ID)) {
            itemsToBuy.add(new ItemToBuy(FOOD_1_ID, 10, FOOD_2_ID));
        }

        if (!Bank.contains(FOOD_2_ID)) {
            itemsToBuy.add(new ItemToBuy(FOOD_2_ID, 10, FOOD_2_ID));
        }

        if (!Bank.contains(FOOD_3_ID)) {
            itemsToBuy.add(new ItemToBuy(FOOD_3_ID, 40, FOOD_2_ID));
        }

        if (!Bank.contains(STAMINA_POTION_ID)) {
            itemsToBuy.add(new ItemToBuy(STAMINA_POTION_ID, 5, QuestHelper.QUEST_ITEM_PRICE));
        }
    }

    /**
     * Walks to a location and interacts with an NPC.
     * Handles timeout and retry logic if stuck.
     *
     * @param destination The WorldPoint to walk to
     * @param walkStatus Status message while walking
     * @param interactStatus Status message while interacting
     * @param npcName Name of NPC to interact with
     */
    private static void walkToLocationAndInteractWithNPC(WorldPoint destination, String walkStatus, String interactStatus, String npcName) {
        // Walk to location if far away
        if (Players.getLocal().getWorldLocation().distanceTo(destination) > 2) {
            AccBuilderSotf.c = walkStatus;

            if (npcInteractionAttempts < 1) {
                CombatHelper.toggleAutoRetaliate();
                npcInteractionAttempts += 1;
            }

            Movement.walkTo(destination);
            Time.sleepTicks(1);
        }

        // Interact with NPC when close
        if (Players.getLocal().getWorldLocation().distanceTo(destination) <= 2) {
            AccBuilderSotf.c = interactStatus;

            // Initialize interaction timer
            if (lastInteractionTime == 0L) {
                lastInteractionTime = System.currentTimeMillis();
            }

            // Reset if stuck for more than 30 seconds
            if (lastInteractionTime != 0L && (System.currentTimeMillis() - lastInteractionTime) > 30000L) {
                npcInteractionAttempts = 0;
                lastInteractionTime = System.currentTimeMillis();
            }

            if (npcInteractionAttempts < 1) {
                CombatHelper.toggleAutoRetaliate();
                npcInteractionAttempts += 1;
            }

            // Drop spade if inventory is full
            if (Inventory.isFull()) {
                Inventory.getFirst(SPADE_ID).interact("Drop");
                Time.sleepTicks(2);
            }

            DialogueHelper.handleDialogue(npcName, DIALOGUE_OPTIONS, 1);
        }
    }

    /**
     * Handles digging at a specific location.
     * Navigates to the location and uses the spade.
     *
     * @param digLocation The WorldPoint to dig at
     * @param statusMessage Status message to display
     */
    private static void handleDigAtLocation(WorldPoint digLocation, String statusMessage) {
        // Navigate to dig location
        if (!Players.getLocal().getWorldLocation().equals(digLocation)) {
            AccBuilderSotf.c = statusMessage;
            Movement.walkTo(digLocation);
            Time.sleepTicks(1);
        }

        // Dig when at location
        if (Players.getLocal().getWorldLocation().equals(digLocation)) {
            Inventory.getFirst("Spade").interact("Dig");
            Time.sleepTicks(2);
        }
    }

    /**
     * Equips Amulet of Glory or Ring of Wealth if in inventory and not already equipped.
     * This provides teleportation options during the quest.
     */
    private static void handleJewelryEquipping() {
        // Equip Amulet of Glory
        if (Inventory.contains(item -> item.getName().contains("glory"))
                && !Equipment.contains(item -> item.getName().contains("glory"))) {
            Inventory.getFirst(item -> item.getName().contains("glory")).interact("Wear");
        }

        // Equip Ring of Wealth
        if (Inventory.contains(item -> item.getName().contains("wealth"))
                && !Equipment.contains(item -> item.getName().contains("wealth"))) {
            Inventory.getFirst(item -> item.getName().contains("wealth")).interact("Wear");
        }
    }

    /**
     * Returns to Veos at Port Sarim to complete the quest.
     * Handles walking and final dialogue.
     */
    private static void completeQuestAtVeos() {
        // Walk to Veos
        if (Players.getLocal().getWorldLocation().distanceTo(VEOS_LOCATION) > 3) {
            AccBuilderSotf.c = "Nav to veos finish";
            Movement.walkTo(VEOS_LOCATION);
            Time.sleepTicks(1);
        }

        // Interact with Veos to complete
        if (Players.getLocal().getWorldLocation().distanceTo(VEOS_LOCATION) <= 3) {
            AccBuilderSotf.c = "Interact npc";

            if (digLocationAttempts < 1) {
                NPCHelper.incrementCounter();
                NPCHelper.updateQuestState(AccBuilderSotf.m);
                digLocationAttempts += 1;
                NPCHelper.resetCounter();
                questInitialized = false;
            }

            DialogueHelper.handleDialogue("Veos", DIALOGUE_OPTIONS);
        }
    }

    /**
     * Handles using the antique lamp reward to gain Slayer XP.
     * Selects Slayer skill and confirms the selection.
     */
    private static void handleAntiqueLampReward() {
        if (Widgets.get(LAMP_WIDGET_PARENT_ID) != null) {
            AccBuilderSotf.c = "Rubbing lamp";
            Inventory.getFirst(ANTIQUE_LAMP_ID).interact("Rub");
            Time.sleepTicks(4);

            AccBuilderSotf.c = "Selecting slayer";
            Widget slayerWidget = Widgets.get(LAMP_WIDGET_PARENT_ID, LAMP_WIDGET_SLAYER_CHILD_ID);
            if (slayerWidget != null) {
                slayerWidget.interact("Slayer");
                Time.sleepTicks(1);
            }

            Widget confirmWidget = Widgets.get(LAMP_WIDGET_PARENT_ID, LAMP_WIDGET_CONFIRM_CHILD_ID);
            if (confirmWidget != null) {
                confirmWidget.interact("Confirm");
                Time.sleepTicks(2);
            }
        }

        Time.sleepTicks(1);
    }

    // ==================== HELPER CLASSES (PLACEHOLDERS) ====================

    /**
     * Placeholder for ItemToBuy class.
     * Represents an item to purchase from the Grand Exchange.
     */
    private static class ItemToBuy {
        int itemId;
        int quantity;
        int price;

        public ItemToBuy(int itemId, int quantity, int price) {
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }

    /**
     * Placeholder for helper classes referenced in the original code.
     * These would normally be imported from other packages.
     */
    private static class GrandExchangeHelper {
        static void buyItems(List<ItemToBuy> items) {
            // Implementation would be in separate helper class
        }
    }

    private static class BankingHelper {
        static void walkToBank(BankLocation location) {
            // Implementation in helper class
        }

        static void openBank() {
            // Implementation in helper class
        }

        static void withdrawItems(int[] itemIds, int quantity) {
            // Implementation in helper class
        }
    }

    private static class InventoryHelper {
        static boolean hasBankItems(int[] itemIds) {
            // Implementation in helper class
            return true;
        }
    }

    private static class StaminaHelper {
        static int[] STAMINA_POTIONS = {};
    }

    private static class TeleportHelper {
        static int[] TELEPORT_ITEMS = {};
    }

    private static class HealthHelper {
        static double getHealthPercent() {
            return 100.0;
        }
    }

    private static class DialogueHelper {
        static void handleDialogue(String[] options) {
            // Implementation in helper class
        }

        static void handleDialogue(String npcName, String[] options) {
            // Implementation in helper class
        }

        static void handleDialogue(String npcName, String[] options, int mode) {
            // Implementation in helper class
        }
    }

    private static class CombatHelper {
        static void toggleAutoRetaliate() {
            // Implementation in helper class
        }
    }

    private static class NPCHelper {
        static void incrementCounter() {
            // Implementation in helper class
        }

        static void updateQuestState(Object state) {
            // Implementation in helper class
        }

        static void resetCounter() {
            // Implementation in helper class
        }
    }

    private static class QuestHelper {
        static int QUEST_ITEM_PRICE = 10000;
    }
}
