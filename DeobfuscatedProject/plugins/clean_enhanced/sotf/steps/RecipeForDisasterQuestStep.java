package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Recipe for Disaster (RFD) quest step handler for the SOTF bot plugin.
 *
 * This quest step manages the initial Recipe for Disaster quest, which begins with
 * Cook's Assistant. The quest requires the player to:
 * 1. Have at least level 4 Cooking
 * 2. Gather quest items (Eye of newt, Dirty blast, Fruit blast, rotten tomato)
 * 3. Interact with NPCs to complete quest objectives
 * 4. Handle dialog and cooking mechanics
 *
 * OSRS Quest Details:
 * - Quest: Recipe for Disaster (Another Cook's Quest)
 * - Requirements: Various skill and quest requirements
 * - Rewards: Access to Culinaromancer's Chest and barrows gloves
 */
public class RecipeForDisasterQuestStep implements QuestStep {

    // Quest varbit tracking
    private static final int RFD_VARBIT = 678;
    private static final int VARBIT_STARTED = 2;

    // Item IDs for quest supplies
    private static final int STAMINA_POTION_1 = 12625;
    private static final int STAMINA_POTION_2 = 8007;
    private static final int STAMINA_POTION_3 = 8008;
    private static final int POT_OF_FLOUR = 1933;
    private static final int BUCKET_OF_MILK = 1927;
    private static final int EGG = 1944;
    private static final int REDBERRIES = 1951;
    private static final int TOMATO = 1982;
    private static final int ONION = 1957;
    private static final int CABBAGE = 1965;
    private static final int BURNT_MEAT = 2146;
    private static final int COINS = 995;
    private static final int RING_OF_WEALTH = 11980;
    private static final int DUELING_RING_8 = 2552;
    private static final int ROTTEN_TOMATO = 2518;

    // NPC and location data
    /** Cook's location in Lumbridge Castle kitchen */
    public static final WorldPoint COOK_LOCATION = new WorldPoint(3207, 3214, 0);

    /** PvP Arena location (Al Kharid Duel Arena) for getting rotten tomatoes */
    public static final WorldPoint PVP_ARENA_LOCATION = new WorldPoint(3382, 3267, 0);

    // Quest progression state
    public static List<ItemToBuy> itemsToBuyList;
    static boolean isBuyingMode;
    static int tomatoPhaseCounter;
    public static boolean questInProgress;

    // Dialog options for Cook's Assistant quest
    private static final String[] COOK_DIALOG_OPTIONS = new String[]{
        "Can you make me a cake?",
        "I'm always happy to help a cook in distress.",
        "Actually, I know where to find this stuff.",
        "Yes.",
        "What's wrong?",
        "Do you have any other quests for me?",
        "Angry! It makes me angry!",
        "What seems to be the problem?"
    };

    static {
        itemsToBuyList = new ArrayList<>();
    }

    @Override
    public boolean shouldExecute() {
        return false;
    }

    @Override
    public int execute() {
        try {
            System.out.println("678: " + QuestVarbits.getQuestVarbit(RFD_VARBIT));
            handleRecipeForDisasterQuest();
        } catch (Exception e) {
            // Silently handle exceptions
        }
        return 100;
    }

    @Override
    public boolean isComplete() {
        return Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST) == QuestState.FINISHED;
    }

    @Override
    public String getQuestName() {
        return "RFD start quest";
    }

    /**
     * Checks if player is in Lumbridge after tutorial and starts appropriate quest handler.
     * Delegates to Cook's Assistant quest handler if cooking level is too low.
     */
    public static void handleStartingArea() {
        String[] arisNpc = new String[]{"Aris"};
        if (NPCs.getNearest(arisNpc) == null) {
            if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) > 3) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }
                Movement.walkTo(COOK_LOCATION);
                Time.sleepTicks(1);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) <= 3) {
                AccBuilderSotf.currentAction = "Entering room";
                String[] doorObject = new String[]{"Door"};
                TileObjects.getNearest(doorObject).interact("Open");
                Time.sleepTicks(2);
            }
        }
    }

    /**
     * Main quest handler for Recipe for Disaster.
     *
     * Flow:
     * 1. Check if cooking level meets requirements (level 4+)
     * 2. If level too low, delegate to Cook's Assistant handler
     * 3. Handle banking and item acquisition
     * 4. Navigate to quest NPCs
     * 5. Complete quest objectives
     */
    public static void handleRecipeForDisasterQuest() {
        // If quest hasn't started (varbit 0), start Cook's Assistant
        if (QuestVarbits.getQuestVarbit(29) < 2) {
            CooksAssistantHandler.startQuest();
        }

        // If cooking level is less than 4, continue with Cook's Assistant
        if (Skills.getLevel(Skill.COOKING) < 4 && QuestVarbits.getQuestVarbit(29) == 2) {
            CooksAssistantHandler.handleCooksAssistant();
        }

        // Main RFD handler - requires cooking level 4+
        if (Skills.getLevel(Skill.COOKING) >= 4 && QuestVarbits.getQuestVarbit(29) == 2) {
            // Check if we need to buy items
            if (!isBuyingMode) {
                ItemBuyer.buyItems(itemsToBuyList);
                if (itemsToBuyList.size() < 1) {
                    System.out.println("Finished buying items, switching back to quest");
                    isBuyingMode = false;
                }
            }

            if (isBuyingMode) {
                // Handle banking and item management
                if (hasAllRequiredItems() && QuestVarbits.getQuestVarbit(RFD_VARBIT) != 0) {
                    BankLocation nearestBank = BankLocation.getNearest();

                    if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.currentAction = "Nav to bank";
                        BankHelper.walkToBank(nearestBank);
                    }

                    if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                        if (!Bank.isOpen()) {
                            BankHelper.openBank();
                            Time.sleepUntil(() -> Bank.isOpen(), 5000);
                        }

                        if (Bank.isOpen()) {
                            AccBuilderSotf.currentAction = "Handling banking";

                            // Deposit everything
                            if (Inventory.getAll().size() > 0) {
                                Bank.depositInventory();
                                Time.sleepTicks(4);
                            }
                            if (Equipment.getAll().size() > 0) {
                                Bank.depositEquipment();
                                Time.sleepTicks(2);
                            }

                            // Check if missing required items
                            int[] requiredItems = {
                                STAMINA_POTION_2,
                                STAMINA_POTION_3,
                                POT_OF_FLOUR,
                                REDBERRIES,
                                TOMATO,
                                ONION,
                                CABBAGE
                            };

                            if (QuestVarbits.hasMissingItems(requiredItems)) {
                                buildItemBuyList();
                                System.out.println("We are missing quest supplies, switching to BUYING");
                                isBuyingMode = true;
                                return;
                            }

                            // Withdraw items
                            if (!QuestVarbits.hasMissingItems(requiredItems)) {
                                BankHelper.withdrawItem(STAMINA_POTION_2, 4);
                                BankHelper.withdrawItem(STAMINA_POTION_3, 4);
                                BankHelper.withdrawItem(POT_OF_FLOUR, 1);
                                BankHelper.withdrawItem(REDBERRIES, 1);
                                BankHelper.withdrawItem(TOMATO, 1);
                                BankHelper.withdrawItem(ONION, 1);
                                BankHelper.withdrawItem(CABBAGE, 1);
                                BankHelper.withdrawItem(BURNT_MEAT, 2);
                                BankHelper.withdrawItem(COINS, 5000);
                            }
                        }
                    }
                }

                // Use stamina potion if run energy is low
                if (Inventory.contains(ItemConstants.STAMINA_POTIONS) && Movement.getRunEnergy() < 50) {
                    Inventory.getFirst(ItemConstants.STAMINA_POTIONS).interact("Drink");
                    Time.sleepTicks(1);
                }

                // Navigate to Cook and handle dialog
                if (QuestVarbits.getQuestVarbit(RFD_VARBIT) != 0 && !hasAllRequiredItems()) {
                    AccBuilderSotf.currentAction = "Nav to start";

                    if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) > 3) {
                        if (Dialog.isOpen()) {
                            Dialog.close();
                        }
                        Movement.walkTo(COOK_LOCATION);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) <= 3) {
                        AccBuilderSotf.currentAction = "Handling dialog";
                        DialogHandler.handleDialog("Cook", COOK_DIALOG_OPTIONS);
                    }
                }

                // Handle rotten tomato phase (varbit == 1)
                if (QuestVarbits.getQuestVarbit(RFD_VARBIT) == 1) {
                    if (Inventory.contains(ROTTEN_TOMATO)) {
                        String[] dirtyBlastItem = new String[]{"Dirty blast"};
                        if (Inventory.contains(dirtyBlastItem)) {
                            tomatoPhaseCounter = 0;

                            // Navigate to PVP Arena area
                            if (Players.getLocal().getWorldLocation().distanceTo(PVP_ARENA_LOCATION) > 4) {
                                AccBuilderSotf.currentAction = "Nav to rotten tomato";
                                WorldArea pvpArenaArea = new WorldArea(3293, 3190, 118, 137, 0);

                                if (pvpArenaArea.contains(Players.getLocal().getWorldLocation())) {
                                    // Equip/remove dueling ring based on animation
                                    Predicate<net.runelite.api.Item> duelingRingPredicate =
                                        item -> item.getName().contains("dueling");

                                    if (!Inventory.contains(duelingRingPredicate) &&
                                        Equipment.contains(duelingRingPredicate)) {
                                        Inventory.getFirst(duelingRingPredicate).interact("Wear");
                                    }

                                    if (!Equipment.contains(duelingRingPredicate) &&
                                        Players.getLocal().getAnimation() != -1) {
                                        Equipment.getFirst(duelingRingPredicate).interact("PvP Arena");
                                        Time.sleepTicks(4);
                                    }
                                }

                                if (!pvpArenaArea.contains(Players.getLocal().getWorldLocation())) {
                                    Movement.walkTo(PVP_ARENA_LOCATION);
                                    Time.sleepTicks(1);
                                }
                            }

                            // Buy rotten tomato from Fadli at PVP Arena
                            if (Players.getLocal().getWorldLocation().distanceTo(PVP_ARENA_LOCATION) <= 4) {
                                AccBuilderSotf.currentAction = "Getting tomato";

                                if (Widgets.get(300).isEmpty()) {
                                    String[] fadliNpc = new String[]{"Fadli"};
                                    NPCs.getNearest(fadliNpc).interact("Buy");
                                    Time.sleepTicks(3);
                                }

                                if (!Widgets.get(300).isEmpty()) {
                                    Widgets.get(300, 16, 1).interact("Buy 1");
                                    Time.sleepTicks(2);
                                }

                                if (!Inventory.contains(ROTTEN_TOMATO) && !Widgets.get(300).isEmpty()) {
                                    Widgets.get(300, 1, 11).interact("Close");
                                    Time.sleepTicks(1);
                                }
                            }
                        }
                    }

                    // Make Dirty blast from Fruit blast
                    if (!Inventory.contains(ROTTEN_TOMATO)) {
                        String[] dirtyBlastItem = new String[]{"Dirty blast"};
                        if (Inventory.contains(dirtyBlastItem)) {
                            if (!Inventory.contains(ROTTEN_TOMATO) && !Widgets.get(300).isEmpty()) {
                                Widgets.get(300, 1, 11).interact("Close");
                                Time.sleepTicks(1);
                            }

                            // Use tomato on fruit blast
                            int[] tomatoId = new int[]{CABBAGE};
                            String[] fruitBlastItem = new String[]{"Fruit blast"};
                            Inventory.getFirst(tomatoId).useOn(Inventory.getFirst(fruitBlastItem));
                            Time.sleepTicks(2);
                        }
                    }

                    // Return to Cook with completed items
                    String[] dirtyBlastItem = new String[]{"Dirty blast"};
                    if (!Inventory.contains(dirtyBlastItem)) {
                        if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) > 3) {
                            if (Dialog.isOpen()) {
                                Dialog.close();
                            }

                            // Equip dueling ring to teleport
                            Predicate<net.runelite.api.Item> duelingRingPredicate =
                                item -> item.getName().contains("dueling");
                            if (!Inventory.contains(duelingRingPredicate) &&
                                Equipment.contains(duelingRingPredicate)) {
                                Inventory.getFirst(duelingRingPredicate).interact("Wear");
                                Time.sleepTicks(2);
                            }

                            Movement.walkTo(COOK_LOCATION);
                            Time.sleepTicks(1);
                        }

                        if (Players.getLocal().getWorldLocation().distanceTo(COOK_LOCATION) <= 3) {
                            AccBuilderSotf.currentAction = "Handling dialog";

                            // Track quest completion for stats
                            if (tomatoPhaseCounter < 1) {
                                PlayerStats.totalQuestsCompleted += 1;
                                PlayerStats.saveStats(AccBuilderSotf.currentAccount);
                                tomatoPhaseCounter += 1;
                                PlayerStats.totalQuestsCompleted = 0;
                                questInProgress = false;
                            }

                            DialogHandler.handleDialog("Cook", COOK_DIALOG_OPTIONS);
                        }
                    }
                }

                // Handle final door interaction (varbit == 2)
                if (QuestVarbits.getQuestVarbit(RFD_VARBIT) == 2) {
                    String[] doorObject = new String[]{"Door"};
                    TileObjects.getNearest(doorObject).interact("Open");
                    Time.sleepTicks(2);
                }
            }
        }
    }

    /**
     * Checks if the player has all required quest items in inventory.
     *
     * @return true if player has Eye of newt, Tomato, Fruit blast, Cabbage, and Pot of flour
     */
    private static boolean hasAllRequiredItems() {
        String[] eyeOfNewtItem = new String[]{"Eye of newt"};
        if (Inventory.getCount(eyeOfNewtItem) > 0) {
            if (Inventory.getCount(TOMATO) > 0) {
                String[] fruitBlastItem = new String[]{"Fruit blast"};
                if (Inventory.contains(fruitBlastItem)) {
                    if (Inventory.contains(CABBAGE)) {
                        if (Inventory.contains(POT_OF_FLOUR)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Builds the shopping list for items needed for the quest.
     * Checks bank for missing items and adds them to the buy list.
     */
    private static void buildItemBuyList() {
        // Add stamina potions if missing
        if (!Bank.contains(BURNT_MEAT)) {
            itemsToBuyList.add(new ItemToBuy(BURNT_MEAT, 4, ItemPrices.PRICE_2000));
        }

        // Add quest items
        if (!Bank.contains(POT_OF_FLOUR)) {
            itemsToBuyList.add(new ItemToBuy(POT_OF_FLOUR, 1, 9000));
        }
        if (!Bank.contains(TOMATO)) {
            itemsToBuyList.add(new ItemToBuy(TOMATO, 1, 9000));
        }
        if (!Bank.contains(CABBAGE)) {
            itemsToBuyList.add(new ItemToBuy(CABBAGE, 1, 9000));
        }
        if (!Bank.contains(ONION)) {
            itemsToBuyList.add(new ItemToBuy(ONION, 1, 900));
        }

        // Add stamina potions based on bank quantity
        if (Bank.contains(STAMINA_POTION_3)) {
            if (Bank.contains(STAMINA_POTION_3)) {
                if (Bank.getFirst(STAMINA_POTION_3).getQuantity() < 4) {
                    itemsToBuyList.add(new ItemToBuy(STAMINA_POTION_3, 4, 1900));
                }
            }
        }

        // Add Ring of Wealth
        Predicate<net.runelite.api.Item> ringOfWealthPredicate =
            item -> item.getName().toLowerCase().contains("ring of wealth (");
        if (!Bank.contains(ringOfWealthPredicate)) {
            itemsToBuyList.add(new ItemToBuy(RING_OF_WEALTH, 5, 25000));
        }

        // Add Dueling rings
        if (Bank.contains(DUELING_RING_8)) {
            if (Bank.contains(DUELING_RING_8)) {
                if (Bank.getFirst(DUELING_RING_8).getQuantity() < 4) {
                    itemsToBuyList.add(new ItemToBuy(DUELING_RING_8, 40, 900));
                }
            }
        }
    }
}
