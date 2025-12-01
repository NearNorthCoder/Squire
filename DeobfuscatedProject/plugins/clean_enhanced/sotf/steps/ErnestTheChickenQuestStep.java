package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.sotf.framework.ShopItem;

import gg.squire.sotf.framework.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Quest step handler for Ernest the Chicken quest.
 *
 * This quest step manages the completion of the Ernest the Chicken quest,
 * which involves helping Veronica find Ernest who has been transformed into a chicken
 * by Professor Oddenstein's machine. The quest requires navigating through a mansion,
 * solving lever puzzles, and collecting various items to fix the machine.
 */
public class ErnestTheChickenQuestStep implements QuestStep {

    // Item IDs
    private static final int FISH_FOOD = 272;
    private static final int POISONED_FISH_FOOD = 273;
    private static final int POISON = 274;
    private static final int CAKE = 379;
    private static final int SPADE = 952;
    private static final int STAMINA_POTION_4 = 8007;
    private static final int STAMINA_POTION_1 = 12625;
    private static final int RING_OF_WEALTH_5 = 19615;

    // Varbit IDs for lever states
    private static final int LEVER_A_VARBIT = 1788;
    private static final int LEVER_B_VARBIT = 1789;
    private static final int LEVER_C_VARBIT = 1790;
    private static final int LEVER_D_VARBIT = 1791;
    private static final int LEVER_E_VARBIT = 1792;
    private static final int LEVER_F_VARBIT = 1793;

    // Quest varbit
    private static final int ERNEST_QUEST_VARBIT = 32;

    // Object IDs
    private static final int DOOR_OBJECT_145 = 145;
    private static final int DOOR_OBJECT_141 = 141;

    // Timeouts
    private static final int BANK_TIMEOUT = 5000;
    private static final int DIALOG_TIMEOUT = 25000;
    private static final int ITEM_PICKUP_TIMEOUT = 9220;
    private static final int ITEM_PURCHASE_TIMEOUT = 11980;
    private static final int ITEM_DROP_TIMEOUT = 1300;

    // Locations - Quest start and key areas
    public static WorldPoint QUEST_START_LOCATION;  // Veronica location (3110, 3329, 0)
    public static WorldPoint COMPOST_HEAP_LOCATION;  // (3087, 3360, 0)
    public static WorldPoint FOUNTAIN_LOCATION;  // (3089, 3336, 0)
    public static WorldPoint LADDER_DOWN_LOCATION;  // (3094, 3359, 0)
    public static WorldPoint PROFESSOR_LOCATION;  // (3110, 3366, 2)

    // Quest state tracking
    public static int questVarbit;
    public static boolean shouldBuyItems;
    private static int retryAttempts;
    public static boolean questComplete;

    // Shopping list for quest items
    public static List<d> shoppingList;

    // Dialog options for quest
    static String[] veronicaDialog;

    // Basement maze area
    static WorldArea basementMazeArea;

    static {
        // Initialize shopping list
        shoppingList = new ArrayList<>();

        // Initialize quest locations
        QUEST_START_LOCATION = new WorldPoint(3110, 3329, 0);
        COMPOST_HEAP_LOCATION = new WorldPoint(3087, 3360, 0);
        FOUNTAIN_LOCATION = new WorldPoint(3089, 3336, 0);
        LADDER_DOWN_LOCATION = new WorldPoint(3094, 3359, 0);
        PROFESSOR_LOCATION = new WorldPoint(3110, 3366, 2);

        // Quest varbit
        questVarbit = ERNEST_QUEST_VARBIT;

        // Initialize dialog options for Veronica conversation
        veronicaDialog = new String[] {
            "Yes.",
            "I'm looking for a guy called Ernest.",
            "I'm glad Veronica didn't actually get engaged to a chicken."
        };

        // Define the basement maze area
        basementMazeArea = new WorldArea(3087, 9743, 35, 28, 0);
    }

    @Override
    public String getName() {
        return "Ernest the Chicken";
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            executeQuestStep();
        } catch (Exception e) {
            // Silently handle exceptions
        }
        return 100;
    }

    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(ERNEST_QUEST_VARBIT) >= 3;
    }

    /**
     * Main quest step execution method.
     * Handles all quest logic including banking, item gathering, and puzzle solving.
     */
    public static void executeQuestStep() {
        // Handle item shopping if needed
        if (shouldBuyItems) {
            b.a(shoppingList);
            if (shoppingList.size() <= 1) {
                System.out.println("Finished buying items, switching back to quest");
                shouldBuyItems = false;
            }
        }

        if (!shouldBuyItems) {
            // Handle banking if we don't have required items and quest hasn't started
            if (!hasRequiredQuestItems() && GameStateUtil.getVarbit(questVarbit) <= 1) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank if not in bank area
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Nav to bank";
                    BankingUtil.navigateToBank(nearestBank);
                }

                // Handle banking operations
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        BankingUtil.openNearestBank();
                        Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = "Handling banking";

                        // Deposit inventory and equipment
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(4);
                        }

                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }

                        // Check if we're missing quest supplies
                        int[] requiredItems = {STAMINA_POTION_4, RING_OF_WEALTH_5, SPADE, POISON};
                        if (!GameStateUtil.randomRange(requiredItems)) {
                            prepareShoppingList();
                            System.out.println("We are missing quest supplies, switching to BUYING");
                            shouldBuyItems = true;
                            return;
                        }

                        // Withdraw quest items
                        if (GameStateUtil.randomRange(requiredItems)) {
                            BankingUtil.withdrawItem(STAMINA_POTION_4, 10);
                            BankingUtil.withdrawItem(RING_OF_WEALTH_5, 10);
                            BankingUtil.withdrawItem(SPADE, 1);
                            BankingUtil.withdrawItem(FISH_FOOD, 1);
                            BankingUtil.withdrawItem(POISON, 1);
                            BankingUtil.withdrawItem(STAMINA_POTION_1, 1);
                            BankingUtil.withdrawItem(CAKE, 5);
                        }
                    }
                }
            }

            // Drink stamina potion if needed
            if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() <= 50) {
                Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
                Time.sleepTicks(1);
            }

            // Eat food if health is low
            if (Inventory.contains(CAKE) && GameStateUtil.getHealthPercentage() < 50.0) {
                Inventory.getFirst(CAKE).interact("Eat");
                Time.sleepTicks(2);
            }

            // Quest hasn't started yet - talk to Veronica
            if (!hasRequiredQuestItems() && GameStateUtil.getVarbit(questVarbit) == 0) {
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) > 8) {
                    AccBuilderSotf.c = "Nav to start";
                    Movement.walkTo(QUEST_START_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) <= 8) {
                    AccBuilderSotf.c = "Start quest";
                    if (Dialog.isOpen()) {
                        Dialog.close();
                    }
                    DialogUtil.talkToNpc("Veronica", veronicaDialog);
                }
            }

            // Quest stage 1 - Collect fish food and poison
            if (GameStateUtil.getVarbit(questVarbit) == 1) {
                retryAttempts = 0;

                // Get fish food if we don't have it
                if (!Inventory.contains(FISH_FOOD)) {
                    if (!Inventory.contains(POISON)) {
                        if (!Inventory.contains("Key")) {
                            WorldPoint fishFoodLocation = new WorldPoint(3108, 3357, 1);

                            if (!Inventory.contains(FISH_FOOD)) {
                                if (Players.getLocal().getWorldLocation().distanceTo(fishFoodLocation) > 5) {
                                    AccBuilderSotf.c = "Nav to fish food";
                                    Movement.walkTo(fishFoodLocation);
                                    Time.sleepTicks(1);
                                }

                                if (Players.getLocal().getWorldLocation().distanceTo(fishFoodLocation) <= 5) {
                                    TileItem fishFoodItem = TileItems.getNearest(FISH_FOOD);
                                    if (fishFoodItem != null) {
                                        if (!Reachable.isInteractable(fishFoodItem)) {
                                            AccBuilderSotf.c = "Can't reach, navigating";
                                            Movement.walkTo(fishFoodItem.getWorldLocation());
                                            Time.sleepTicks(1);
                                        }

                                        if (Reachable.isInteractable(fishFoodItem)) {
                                            AccBuilderSotf.c = "Taking food";
                                            fishFoodItem.interact("Take");
                                            Time.sleepTicks(3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                // Make poisoned fish food
                if (!Inventory.contains(FISH_FOOD)) {
                    if (Inventory.contains(POISON)) {
                        if (Inventory.contains(FISH_FOOD)) {
                            AccBuilderSotf.c = "Making poison fish food";
                            Inventory.getFirst(FISH_FOOD).useOn(Inventory.getFirst(POISON));
                            Time.sleepTicks(1);
                        }
                    }

                    // Get poison from compost heap
                    if (Inventory.contains(POISON)) {
                        if (!Inventory.contains("Key")) {
                            if (Players.getLocal().getWorldLocation().distanceTo(COMPOST_HEAP_LOCATION) > 4) {
                                AccBuilderSotf.c = "Nav to compost";
                                Movement.walkTo(COMPOST_HEAP_LOCATION);
                                Time.sleepTicks(1);
                            }

                            if (Players.getLocal().getWorldLocation().distanceTo(COMPOST_HEAP_LOCATION) <= 4) {
                                AccBuilderSotf.c = "Digging";
                                TileObjects.getNearest("Compost heap").interact("Search");
                                Time.sleepTicks(9);
                            }
                        }

                        // Poison the fountain
                        if (Inventory.contains("Key")) {
                            if (Players.getLocal().getWorldLocation().distanceTo(FOUNTAIN_LOCATION) > 3) {
                                AccBuilderSotf.c = "Nav to fountain";
                                Movement.walkTo(FOUNTAIN_LOCATION);
                                Time.sleepTicks(1);
                            }

                            if (Players.getLocal().getWorldLocation().distanceTo(FOUNTAIN_LOCATION) <= 3) {
                                Inventory.getFirst(POISON).useOn(TileObjects.getNearest("Fountain"));
                                Time.sleepTicks(1);
                            }
                        }
                    }
                }

                // Get pressure gauge from fountain
                if (Inventory.contains("Key")) {
                    if (!Inventory.contains(POISON)) {
                        if (!Inventory.contains("Pressure gauge")) {
                            AccBuilderSotf.c = "Getting guage";
                            if (!Dialog.isOpen()) {
                                TileObjects.getNearest("Fountain").interact("Search");
                                Time.sleepTicks(4);
                            }
                            DialogUtil.chooseDialogOptions(veronicaDialog);
                        }
                    }
                }

                // Get rubber tube and oil can
                if (Inventory.contains("Pressure gauge")) {
                    if (Inventory.contains("Pressure gauge")) {
                        if (!Inventory.contains("Rubber tube")) {
                            WorldPoint doorLocation = new WorldPoint(3107, 3367, 1);
                            WorldPoint tubeLocation = new WorldPoint(3108, 3367, 1);
                            WorldArea roomArea = new WorldArea(3108, 3366, 5, 3, 1);

                            if (!Players.getLocal().getWorldLocation().equals(doorLocation) &&
                                !Players.getLocal().getWorldLocation().equals(tubeLocation) &&
                                !roomArea.contains(Players.getLocal().getWorldLocation())) {
                                AccBuilderSotf.c = "Nav to door";
                                Movement.walkTo(doorLocation);
                                Time.sleepTicks(1);
                            }

                            if (Players.getLocal().getWorldLocation().equals(doorLocation)) {
                                TileObjects.getNearest("Door").interact("Open");
                                Time.sleepTicks(2);
                            }

                            if (roomArea.contains(Players.getLocal().getWorldLocation())) {
                                AccBuilderSotf.c = "Get tube";
                                TileItems.getNearest("Rubber tube").interact("Take");
                                Time.sleepTicks(3);
                            }
                        }
                    }
                }

                // Navigate through mansion and get oil can
                if (Inventory.contains("Rubber tube")) {
                    if (!Inventory.contains("Oil can")) {
                        WorldArea entryArea = new WorldArea(3108, 3366, 5, 3, 1);
                        WorldArea hallwayArea = new WorldArea(3090, 3353, 7, 11, 1);

                        if (entryArea.contains(Players.getLocal().getWorldLocation())) {
                            TileObjects.getNearest("Door").interact("Open");
                            Time.sleepTicks(2);
                        }

                        if (!hallwayArea.contains(Players.getLocal().getWorldLocation()) &&
                            !basementMazeArea.contains(Players.getLocal().getWorldLocation())) {
                            AccBuilderSotf.c = "Nav to final room";
                            Movement.walkTo(LADDER_DOWN_LOCATION);
                            Time.sleepTicks(1);
                        }

                        if (hallwayArea.contains(Players.getLocal().getWorldLocation())) {
                            TileObjects.getNearest("Ladder").interact("Climb-down");
                            Time.sleepTicks(4);
                        }

                        // Handle basement lever puzzle
                        if (basementMazeArea.contains(Players.getLocal().getWorldLocation())) {
                            handleLeverPuzzle();
                        }
                    }
                }

                // Complete the quest - talk to professor
                if (Inventory.contains("Rubber tube") && Inventory.contains("Oil can")) {
                    WorldArea oilCanArea = new WorldArea(3089, 9753, 11, 5, 0);

                    if (oilCanArea.contains(Players.getLocal().getWorldLocation())) {
                        TileObjects.getNearest(DOOR_OBJECT_141).interact("Open");
                        Time.sleepTicks(5);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(PROFESSOR_LOCATION) > 10) {
                        AccBuilderSotf.c = "Nav to professor";
                        Movement.walkTo(PROFESSOR_LOCATION);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().distanceTo(PROFESSOR_LOCATION) <= 10) {
                        var door = TileObjects.getNearest(tileObject -> {
                            if (tileObject.getName().contains("Door")) {
                                if (tileObject.hasAction("Open") &&
                                    tileObject.getWorldLocation().distanceTo(new WorldPoint(3108, 3365, 2)) <= 2) {
                                    return true;
                                }
                            }
                            return false;
                        });

                        if (door != null) {
                            door.interact("Open");
                            Time.sleepTicks(3);
                        }

                        if (door == null) {
                            DialogUtil.talkToNpcWithWalk("Professor Oddenstein", veronicaDialog, true);
                        }
                    }
                }
            }

            // Quest stage 2 - Final dialog with professor
            if (GameStateUtil.getVarbit(questVarbit) == 2) {
                if (Players.getLocal().getWorldLocation().distanceTo(PROFESSOR_LOCATION) > 10) {
                    AccBuilderSotf.c = "Nav to professor";
                    Movement.walkTo(PROFESSOR_LOCATION);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().distanceTo(PROFESSOR_LOCATION) <= 10) {
                    var door = TileObjects.getNearest(tileObject -> {
                        if (tileObject.getName().contains("Door")) {
                            if (tileObject.hasAction("Open") &&
                                tileObject.getWorldLocation().distanceTo(new WorldPoint(3108, 3365, 2)) <= 2) {
                                return true;
                            }
                        }
                        return false;
                    });

                    if (door != null) {
                        door.interact("Open");
                        Time.sleepTicks(3);
                    }

                    if (door == null) {
                        if (retryAttempts <= 1) {
                            aN.tb += 1;
                            aN.u(AccBuilderSotf.m);
                            retryAttempts += 1;
                            aN.tb = 0;
                            questComplete = false;
                        }
                        DialogUtil.talkToNpcWithWalk("Professor Oddenstein", veronicaDialog, true);
                    }
                }
            }

            DialogUtil.chooseDialogOptions(veronicaDialog);
        }
    }

    /**
     * Handles the complex lever puzzle in the basement to access the oil can.
     * The puzzle requires pulling specific levers in the correct order to open doors.
     *
     * Lever states guide the player through a maze of rooms with locked doors.
     * The solution involves: A, B, D, then reversing B and A, navigating through doors,
     * and finally pulling E, F, and C to access the oil can room.
     */
    private static void handleLeverPuzzle() {
        // Define key lever locations in the maze
        WorldPoint leverALocation = new WorldPoint(3108, 9750, 0);
        WorldPoint leverBLocation = new WorldPoint(3116, 9752, 0);
        WorldPoint leverCLocation = new WorldPoint(3110, 9761, 0);
        WorldPoint leverDLocation = new WorldPoint(3107, 9765, 0);
        WorldPoint leverELocation = new WorldPoint(3097, 9765, 0);
        WorldPoint leverFLocation = new WorldPoint(3097, 9765, 0);

        // Define maze areas
        WorldArea northEastArea = new WorldArea(3105, 9758, 9, 11, 0);
        WorldArea northWestArea = new WorldArea(3095, 9763, 5, 6, 0);
        WorldArea southArea = new WorldArea(3100, 9745, 20, 13, 0);

        // State 1: Initial state - Pull lever A
        // Required: A=0 (not pulled), D=0
        if (Vars.getBit(LEVER_A_VARBIT) != 1 && Vars.getBit(LEVER_D_VARBIT) == 0) {
            if (!Players.getLocal().getWorldLocation().equals(leverALocation)) {
                AccBuilderSotf.c = "Nav to a";
                Movement.walkTo(leverALocation);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(leverALocation)) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever A").interact("Pull");
                Time.sleepTicks(3);
            }
        }

        // State 2: Pull lever B
        // Required: A=1, B=0, D=0
        if (Vars.getBit(LEVER_A_VARBIT) == 1 && Vars.getBit(LEVER_B_VARBIT) == 0 && Vars.getBit(LEVER_D_VARBIT) == 0) {
            if (!Players.getLocal().getWorldLocation().equals(leverBLocation)) {
                AccBuilderSotf.c = "Nav to b";
                Movement.walkTo(leverBLocation);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(leverBLocation)) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever B").interact("Pull");
                Time.sleepTicks(3);
            }
        }

        // State 3: Navigate to lever D and pull it
        // Required: A=1, B=1, D=0
        if (Vars.getBit(LEVER_A_VARBIT) == 1 && Vars.getBit(LEVER_B_VARBIT) == 1 && Vars.getBit(LEVER_D_VARBIT) == 0) {
            if (!northEastArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorLocation = new WorldPoint(3108, 9757, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorLocation)) {
                    AccBuilderSotf.c = "Nav to d";
                    Movement.walkTo(doorLocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorLocation)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            if (northEastArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever D").interact("Pull");
                Time.sleepTicks(3);
            }
        }

        // State 4: Go through doors after pulling D
        // Required: A=1, B=1, D=1
        if (Vars.getBit(LEVER_A_VARBIT) == 1 && Vars.getBit(LEVER_B_VARBIT) == 1 && Vars.getBit(LEVER_D_VARBIT) == 1) {
            if (northEastArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorNavPoint = new WorldPoint(3108, 9759, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorNavPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(doorNavPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorNavPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            if (!northEastArea.contains(Players.getLocal().getWorldLocation())) {
                if (!Players.getLocal().getWorldLocation().equals(leverBLocation)) {
                    AccBuilderSotf.c = "Nav to b";
                    Movement.walkTo(leverBLocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(leverBLocation)) {
                    AccBuilderSotf.c = "Pull lever";
                    TileObjects.getNearest("Lever B").interact("Pull");
                    Time.sleepTicks(3);
                }
            }
        }

        // State 5: Reset lever A
        // Required: A=1, B=0, D=1
        if (Vars.getBit(LEVER_A_VARBIT) == 1 && Vars.getBit(LEVER_B_VARBIT) == 0 && Vars.getBit(LEVER_D_VARBIT) == 1) {
            if (!Players.getLocal().getWorldLocation().equals(leverALocation)) {
                AccBuilderSotf.c = "Nav to a";
                Movement.walkTo(leverALocation);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(leverALocation)) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever A").interact("Pull");
                Time.sleepTicks(3);
            }
        }

        // State 6: Navigate through western section to lever E
        // Required: A=0, B=0, D=1, E=0, puzzle not complete
        if (Vars.getBit(LEVER_A_VARBIT) == 0 && Vars.getBit(LEVER_B_VARBIT) == 0 &&
            Vars.getBit(LEVER_D_VARBIT) == 1 && Vars.getBit(LEVER_E_VARBIT) == 0 && !areLeversSolved()) {

            if (!northWestArea.contains(Players.getLocal().getWorldLocation())) {
                if (southArea.contains(Players.getLocal().getWorldLocation())) {
                    WorldPoint navPoint = new WorldPoint(3102, 9757, 0);
                    if (!Players.getLocal().getWorldLocation().equals(navPoint)) {
                        AccBuilderSotf.c = "Move to door";
                        Movement.walkTo(navPoint);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().equals(navPoint)) {
                        TileObjects.getNearest("Door").interact("Open");
                        Time.sleepTicks(3);
                    }
                }

                // Navigate through multiple doors
                WorldArea room1 = new WorldArea(3100, 9758, 5, 5, 0);
                if (room1.contains(Players.getLocal().getWorldLocation()) && !areLeversSolved()) {
                    WorldPoint doorPoint = new WorldPoint(3101, 9760, 0);
                    if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                        AccBuilderSotf.c = "Move to door";
                        Movement.walkTo(doorPoint);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                        TileObjects.getNearest("Door").interact("Open");
                        Time.sleepTicks(3);
                    }
                }

                WorldArea room2 = new WorldArea(3095, 9758, 5, 5, 0);
                if (room2.contains(Players.getLocal().getWorldLocation())) {
                    WorldPoint doorPoint = new WorldPoint(3097, 9762, 0);
                    if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                        AccBuilderSotf.c = "Move to door";
                        Movement.walkTo(doorPoint);
                        Time.sleepTicks(1);
                    }

                    if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                        TileObjects.getNearest("Door").interact("Open");
                        Time.sleepTicks(3);
                    }
                }
            }

            if (northWestArea.contains(Players.getLocal().getWorldLocation()) && !areLeversSolved()) {
                if (!Players.getLocal().getWorldLocation().equals(leverELocation)) {
                    AccBuilderSotf.c = "Nav to e";
                    Movement.walkTo(leverELocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(leverELocation)) {
                    AccBuilderSotf.c = "Pull lever";
                    TileObjects.getNearest("Lever E").interact("Pull");
                    Time.sleepTicks(3);
                }
            }
        }

        // State 7: Pull lever F
        // Required: A=0, B=0, D=1, E=1, F=0
        if (Vars.getBit(LEVER_A_VARBIT) == 0 && Vars.getBit(LEVER_B_VARBIT) == 0 &&
            Vars.getBit(LEVER_D_VARBIT) == 1 && Vars.getBit(LEVER_E_VARBIT) == 1 &&
            Vars.getBit(LEVER_F_VARBIT) == 0) {

            if (!Players.getLocal().getWorldLocation().equals(leverFLocation)) {
                AccBuilderSotf.c = "Nav to f";
                Movement.walkTo(leverFLocation);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().equals(leverFLocation)) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever F").interact("Pull");
                Time.sleepTicks(3);
            }
        }

        // State 8: Navigate back through doors to lever C
        // Required: A=0, B=0, D=1, E=1, F=1, C=0
        if (Vars.getBit(LEVER_A_VARBIT) == 0 && Vars.getBit(LEVER_B_VARBIT) == 0 &&
            Vars.getBit(LEVER_D_VARBIT) == 1 && Vars.getBit(LEVER_E_VARBIT) == 1 &&
            Vars.getBit(LEVER_F_VARBIT) == 1 && Vars.getBit(LEVER_C_VARBIT) == 0) {

            WorldArea leverCArea = new WorldArea(3100, 9763, 5, 5, 0);

            if (northWestArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorPoint = new WorldPoint(3099, 9765, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(doorPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            if (leverCArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorPoint = new WorldPoint(3104, 9765, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(doorPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            WorldArea leverCApproachArea = new WorldArea(3105, 9758, 9, 11, 0);
            if (leverCApproachArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Pull lever";
                TileObjects.getNearest("Lever C").interact("Pull");
                Time.sleepTicks(8);
            }
        }

        // State 9: Navigate to oil can room
        // Required: A=0, B=0, D=1, E=1, F=1, C=1
        if (Vars.getBit(LEVER_A_VARBIT) == 0 && Vars.getBit(LEVER_B_VARBIT) == 0 &&
            Vars.getBit(LEVER_D_VARBIT) == 1 && Vars.getBit(LEVER_E_VARBIT) == 1 &&
            Vars.getBit(LEVER_F_VARBIT) == 1 && Vars.getBit(LEVER_C_VARBIT) == 1) {

            WorldArea leverCArea = new WorldArea(3100, 9763, 5, 5, 0);

            if (northWestArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint navPoint = new WorldPoint(3106, 9765, 0);
                if (!Players.getLocal().getWorldLocation().equals(navPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(navPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(navPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            if (leverCArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint navPoint = new WorldPoint(3101, 9765, 0);
                if (!Players.getLocal().getWorldLocation().equals(navPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(navPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(navPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            // Navigate through final doors to oil can room
            WorldArea finalDoorArea1 = new WorldArea(3100, 9758, 5, 5, 0);
            if (northWestArea.contains(Players.getLocal().getWorldLocation())) {
                if (!Players.getLocal().getWorldLocation().equals(leverELocation)) {
                    AccBuilderSotf.c = "Nav to e";
                    Movement.walkTo(leverELocation);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(leverELocation)) {
                    AccBuilderSotf.c = "Pull lever";
                    TileObjects.getNearest("Lever E").interact("Pull");
                    Time.sleepTicks(3);
                }
            }

            // Open final doors
            if (northWestArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorPoint = new WorldPoint(3102, 9764, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(doorPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            if (finalDoorArea1.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint doorPoint = new WorldPoint(3102, 9764, 0);
                if (!Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    AccBuilderSotf.c = "Move to door";
                    Movement.walkTo(doorPoint);
                    Time.sleepTicks(1);
                }

                if (Players.getLocal().getWorldLocation().equals(doorPoint)) {
                    TileObjects.getNearest("Door").interact("Open");
                    Time.sleepTicks(3);
                }
            }

            // Special door handling for object ID 145
            WorldArea room3 = new WorldArea(3100, 9758, 5, 5, 0);
            if (room3.contains(Players.getLocal().getWorldLocation()) && !Players.getLocal().isMoving()) {
                AccBuilderSotf.c = "Opening 145";
                Time.sleepTicks(1);
                TileObjects.getNearest(DOOR_OBJECT_145).interact("Open");
                Time.sleepTicks(3);
            }

            // Open door by object ID 141
            if (southArea.contains(Players.getLocal().getWorldLocation())) {
                TileObjects.getNearest(DOOR_OBJECT_141).interact("Open");
                Time.sleepTicks(3);
            }

            // Pick up oil can
            WorldArea oilCanArea = new WorldArea(3089, 9753, 11, 5, 0);
            if (oilCanArea.contains(Players.getLocal().getWorldLocation())) {
                if (!Inventory.contains("Oil can")) {
                    TileItems.getNearest("Oil can").interact("Take");
                    Time.sleepTicks(5);
                }
            }
        }
    }

    /**
     * Prepares the shopping list for required quest items that are missing from the bank.
     */
    private static void prepareShoppingList() {
        if (!Bank.contains(RING_OF_WEALTH_5)) {
            shoppingList.add(new ShopItem(RING_OF_WEALTH_5, 10, ITEM_PICKUP_TIMEOUT));
        }

        if (!Bank.contains(STAMINA_POTION_4) && !Bank.contains(STAMINA_POTION_1)) {
            shoppingList.add(new ShopItem(STAMINA_POTION_4, 40, ITEM_PURCHASE_TIMEOUT));
        }

        if (!Bank.contains(SPADE)) {
            shoppingList.add(new ShopItem(SPADE, 1, ITEM_DROP_TIMEOUT));
        }

        if (!Bank.contains(STAMINA_POTION_4)) {
            if (Bank.contains(STAMINA_POTION_4)) {
                if (Bank.contains(STAMINA_POTION_4) && Bank.getFirst(STAMINA_POTION_4).getQuantity() < 15) {
                    shoppingList.add(new ShopItem(STAMINA_POTION_4, 40, ITEM_PURCHASE_TIMEOUT));
                }
            }
        }
    }

    /**
     * Checks if the player has all required quest items in their inventory.
     * @return true if all quest items are present, false otherwise
     */
    private static boolean hasRequiredQuestItems() {
        int[] requiredItems = {STAMINA_POTION_4, RING_OF_WEALTH_5, SPADE, POISON};
        for (int itemId : requiredItems) {
            if (!Inventory.contains(itemId)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if all levers are in the correct position to access the oil can.
     * @return true if the lever puzzle is solved, false otherwise
     */
    static boolean areLeversSolved() {
        return Vars.getBit(LEVER_A_VARBIT) == 0 &&
               Vars.getBit(LEVER_B_VARBIT) == 0 &&
               Vars.getBit(LEVER_D_VARBIT) == 1 &&
               Vars.getBit(LEVER_E_VARBIT) == 1 &&
               Vars.getBit(LEVER_F_VARBIT) == 1 &&
               Vars.getBit(LEVER_C_VARBIT) == 1;
    }
}
