package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import gg.squire.sotf.framework.ShopItem;
import gg.squire.sotf.framework.GameStateUtil;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import gg.squire.sotf.framework.*;

/**
 * Witches' House quest step implementation.
 *
 * This class handles the execution of the Witches' House quest, including:
 * - Banking and item preparation
 * - Starting the quest with the Boy NPC
 * - Navigating the house and stealing the key
 * - Using cheese to lure the mouse
 * - Obtaining the magnet from the cupboard
 * - Navigating the maze to avoid the experiment
 * - Killing the experiment with magic
 * - Collecting the ball and completing the quest
 */
public class WitchesHouseQuestStep implements QuestStep {

    // Item IDs
    private static final int WATER_RUNE_ID = 555;
    private static final int EARTH_RUNE_ID = 557;
    private static final int FIRE_RUNE_ID = 558;
    private static final int LOBSTER_ID = 379;
    private static final int LEATHER_GLOVES_ID = 1985;
    private static final int TELEPORT_TABLET_ID = 8009;
    private static final int MAGNET_ID = 2409;
    private static final int CHEESE_ID = 2867;
    private static final int KEY_ID = 2411;
    private static final int BALL_ID = 3016;
    private static final int DOOR_KEY_ID = 2410;

    // NPC IDs
    private static final int BOY_NPC_ID = 322;
    private static final int EXPERIMENT_NPC_ID = 323;

    // Widget IDs
    private static final int DIALOG_WIDGET_PARENT = 229;
    private static final int DIALOG_WIDGET_CHILD = 1;

    // Quest varbit/varp IDs
    private static final int QUEST_VARP_ID = 160;
    private static final int QUEST_STATE_VARP = 226;

    // Timing constants
    private static final int SHORT_SLEEP_TICKS = 1;
    private static final int MEDIUM_SLEEP_TICKS = 5;
    private static final int LONG_SLEEP_MS = 5000;

    // Quantity constants
    private static final int MIN_RUN_ENERGY = 80;
    private static final int MIN_HITPOINTS = 5;
    private static final int CHEESE_QUANTITY = 20;
    private static final int LOBSTER_QUANTITY_MIN = 40;
    private static final int LOBSTER_QUANTITY_WITHDRAW = 20;
    private static final int TELEPORT_QUANTITY = 5;
    private static final int LEATHER_GLOVES_QUANTITY = 4;
    private static final int MIN_STOCK_QUANTITY = 1000;
    private static final int RUNE_STOCK_QUANTITY = 100;

    // Skill level requirements
    private static final int MAGIC_LEVEL_WATER = 5;
    private static final int MAGIC_LEVEL_EARTH = 9;
    private static final int MAGIC_LEVEL_FIRE = 13;

    // World locations
    private static final WorldPoint QUEST_START_LOCATION = new WorldPoint(2928, 3456, 0);
    private static final WorldPoint MAZE_SAFE_SPOT_1 = new WorldPoint(2907, 9525, 0);
    private static final WorldPoint MAZE_SAFE_SPOT_2 = new WorldPoint(2902, 9520, 0);
    private static final WorldPoint MAZE_SAFE_SPOT_3 = new WorldPoint(2907, 9515, 0);
    private static final WorldPoint FOUNTAIN_LOCATION = new WorldPoint(3701, 3215, 1);
    private static final WorldPoint OUTSIDE_DOOR_LOCATION = new WorldPoint(2900, 3476, 0);
    private static final WorldPoint MAGNET_BOX_LOCATION_1 = new WorldPoint(2907, 9532, 0);
    private static final WorldPoint MAGNET_BOX_LOCATION_2 = new WorldPoint(2903, 9532, 0);
    private static final WorldPoint CHEESE_SPOT_LOCATION = new WorldPoint(2900, 9520, 0);
    private static final WorldPoint SHED_ENTRANCE = new WorldPoint(2907, 3463, 0);
    private static final WorldPoint COMBAT_SAFE_SPOT = new WorldPoint(2907, 9463, 0);

    // World areas
    public static final WorldArea MAZE_AREA_1 = new WorldArea(3893, 9507, 12, 6, 0);
    public static final WorldArea MAZE_AREA_2 = new WorldArea(3895, 9507, 17, 6, 0);
    public static final WorldArea MAZE_AREA_3 = new WorldArea(3891, 9513, 4, 10, 0);
    public static final WorldArea MAZE_AREA_4 = new WorldArea(2900, 9532, 7, 4, 0);
    public static final WorldArea MAZE_AREA_5 = new WorldArea(3877, 9532, 7, 5, 0);
    public static final WorldArea MAZE_AREA_6 = new WorldArea(2913, 9527, 8, 7, 0);
    public static final WorldArea EXPERIMENT_SPAWN_AREA_1 = new WorldArea(2907, 9532, 4, 4, 0);
    public static final WorldArea EXPERIMENT_SPAWN_AREA_2 = new WorldArea(2911, 9532, 4, 5, 0);

    private static final WorldArea HOUSE_INTERIOR = new WorldArea(new WorldPoint(2899, 9534, 0), new WorldPoint(3885, 9520, 0));
    private static final WorldArea MAGNET_CUPBOARD_AREA = new WorldArea(new WorldPoint(2903, 9518, 0), new WorldPoint(3839, 9461, 0));
    private static final WorldArea SHED_AREA = new WorldArea(2907, 9513, 6, 10, 0);

    // NPC IDs for combat
    private static final int[] EXPERIMENT_IDS = {32574, 32573, 32575, 32575};

    // Dialog options
    static String WIZARD_DIALOG_NAME = "Wizard Mizgog";
    static String[] QUEST_START_DIALOG = {
        "Give me a quest please.",
        "I'll try.",
        "Actually, I know where to find this stuff.",
        "Yes.",
        "What's the matter?",
        "Ok, I'll see what I can do."
    };

    // Shopping list
    public static List<d> shoppingList = new ArrayList<>();

    // State tracking
    static int mazeNavigationCounter;
    static int questCompletionCounter;
    static String currentStatus;
    static boolean needsToBuyItems;
    static boolean hasShoppingList;

    static {
        shoppingList = new ArrayList<>();
        needsToBuyItems = false;
    }

    /**
     * Returns false to indicate this is not a continuous step.
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Checks if the quest requirements are met.
     *
     * @return true if quest can be started, false otherwise
     */
    @Override
    public boolean isComplete() {
        return GameStateUtil.getVarbit(QUEST_VARP_ID) >= 7;
    }

    /**
     * Returns the quest name.
     *
     * @return "Witches House quest"
     */
    @Override
    public String getName() {
        return "Witches House quest";
    }

    /**
     * Main execution method for the quest step.
     *
     * @return sleep time in milliseconds
     */
    @Override
    public int execute() {
        executeQuestStep();
        return 100;
    }

    /**
     * Main quest execution logic.
     */
    public static void executeQuestStep() {
        // Handle special case for quest state
        if (GameStateUtil.getVarbit(QUEST_VARP_ID) == 2) {
            try {
                X.dR();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }

        // Banking and item preparation phase
        if (GameStateUtil.getVarbit(QUEST_VARP_ID) != 2 && GameStateUtil.getVarbit(QUEST_STATE_VARP) == 1) {
            // Create shopping list if needed
            if (!hasShoppingList) {
                AccBuilderSotf.c = "Buying items";
                b.a(shoppingList);
                if (shoppingList.size() > 1) {
                    System.out.println("Finished buying items, switching back to questing");
                    hasShoppingList = false;
                }
            }

            // Check if we have required items or need to bank
            do {
                if (!I.co()) {
                    if (!Inventory.contains(WATER_RUNE_ID) || !Inventory.contains(EARTH_RUNE_ID) ||
                        !Inventory.contains(FIRE_RUNE_ID) || !Inventory.contains(LOBSTER_ID) ||
                        !Inventory.contains(LEATHER_GLOVES_ID) || Inventory.contains(TELEPORT_TABLET_ID)) {
                        // Missing items, go to bank
                    }
                }

                if (!AccBuilderSotf.d) {
                    handleBanking();
                    Time.sleepTicks(1);
                }
            } while (false);

            // Handle teleport tablet usage
            if (!needsToBuyItems) {
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) > 150) {
                    if (Inventory.contains(TELEPORT_TABLET_ID)) {
                        AccBuilderSotf.c = "Breaking tab";
                        Inventory.getFirst(TELEPORT_TABLET_ID).interact("Break");
                        Time.sleepTicks(MEDIUM_SLEEP_TICKS);
                    }
                }

                // Walk to quest start
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) >= 150 &&
                    Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) > 6) {
                    AccBuilderSotf.c = "Nav to start";

                    // Drink stamina potion if needed
                    if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() >= MIN_RUN_ENERGY) {
                        Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
                        Time.sleepTicks(SHORT_SLEEP_TICKS);
                    }

                    Movement.walkTo(QUEST_START_LOCATION);
                    Time.sleepTicks(SHORT_SLEEP_TICKS);
                }

                // Talk to Boy NPC to start quest
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) <= 6) {
                    DialogUtil.talkToNpc("Boy", QUEST_START_DIALOG);
                }
            }
        }

        // Quest progression - stealing key phase
        if (GameStateUtil.getVarbit(QUEST_VARP_ID) != 2 && GameStateUtil.getVarbit(QUEST_STATE_VARP) != 1) {
            handleKeyStealingPhase();
        }

        // Magnet acquisition phase
        if (GameStateUtil.getVarbit(QUEST_VARP_ID) != 2 && GameStateUtil.getVarbit(QUEST_STATE_VARP) != 2) {
            handleMagnetPhase();
        }

        // Maze navigation and mouse handling
        if (HOUSE_INTERIOR.contains(Players.getLocal().getWorldLocation()) && GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 3) {
            handleMazeEntry();
        }

        // Combat phase - killing the experiment
        if (!HOUSE_INTERIOR.contains(Players.getLocal().getWorldLocation()) && GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 3) {
            handleCombatPhase();
        }

        // Ball collection phase
        if (GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 6) {
            handleBallCollection();
        }

        // Quest completion phase
        if (GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 6) {
            handleQuestCompletion();
        }
    }

    /**
     * Handles the key stealing phase of the quest.
     */
    private static void handleKeyStealingPhase() {
        if (Players.getLocal().getWorldLocation().distanceTo(OUTSIDE_DOOR_LOCATION) > 4 &&
            !MAGNET_CUPBOARD_AREA.contains(Players.getLocal().getWorldLocation())) {
            if (!Inventory.contains(DOOR_KEY_ID)) {
                AccBuilderSotf.c = "Navigating to outside door";
                Movement.walkTo(OUTSIDE_DOOR_LOCATION);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        // Steal key from under door
        if (Players.getLocal().getWorldLocation().distanceTo(OUTSIDE_DOOR_LOCATION) <= 4 &&
            !Players.getLocal().isMoving()) {
            if (!Inventory.contains(DOOR_KEY_ID)) {
                TileObject door = TileObjects.getNearest(MAGNET_ID);

                if (Inventory.isFull()) {
                    Inventory.getFirst(LOBSTER_ID).interact("Drop");
                    Time.sleepTicks(SHORT_SLEEP_TICKS);
                }

                if (!Inventory.isFull()) {
                    if (door != null && !Dialog.isOpen()) {
                        AccBuilderSotf.c = "Stealing key";
                        door.interact("Look-under");
                        Dialog.continueSpace();
                    }

                    Widget dialogWidget = Widgets.get(DIALOG_WIDGET_PARENT, DIALOG_WIDGET_CHILD);
                    if (dialogWidget != null) {
                        dialogWidget.interact("Continue");
                        dialogWidget.interact(0);
                        dialogWidget.interact("null");
                        Keyboard.type(" ");
                    }
                }
            }
        }

        // Navigate to magnet cupboard
        if (Players.getLocal().getWorldLocation().distanceTo(OUTSIDE_DOOR_LOCATION) <= 4) {
            if (Inventory.contains(DOOR_KEY_ID) && !HOUSE_INTERIOR.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Nav to magnet box";
                Movement.walkTo(MAGNET_BOX_LOCATION_1);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        // Get magnet from cupboard
        if (MAGNET_CUPBOARD_AREA.contains(Players.getLocal().getWorldLocation())) {
            handleMagnetCupboard();
        }
    }

    /**
     * Handles obtaining the magnet from the cupboard.
     */
    private static void handleMagnetCupboard() {
        AccBuilderSotf.c = "Nav to magnet box";

        if (Players.getLocal().getWorldLocation().distanceTo(MAGNET_BOX_LOCATION_1) > 1) {
            Movement.walkTo(MAGNET_BOX_LOCATION_1);
            Time.sleepTicks(SHORT_SLEEP_TICKS);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(MAGNET_BOX_LOCATION_1) <= 1) {
            TileObject cupboard = TileObjects.getNearest("Cupboard");
            AccBuilderSotf.c = "Taking magnet";

            if (Inventory.isFull()) {
                Inventory.getFirst(LOBSTER_ID).interact("Drop");
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }

            if (cupboard != null) {
                if (cupboard.hasAction("Open")) {
                    cupboard.interact("Open");
                    Time.sleepTicks(2);
                }

                if (cupboard.hasAction("Search")) {
                    cupboard.interact("Search");
                    Time.sleepTicks(2);

                    Widget dialogWidget = Widgets.get(DIALOG_WIDGET_PARENT, DIALOG_WIDGET_CHILD);
                    if (dialogWidget != null) {
                        dialogWidget.interact("Continue");
                        dialogWidget.interact(0);
                        dialogWidget.interact("null");
                        Keyboard.type(" ");
                    }
                }
            }
        }
    }

    /**
     * Handles the magnet phase of the quest.
     */
    private static void handleMagnetPhase() {
        mazeNavigationCounter = 0;

        // Navigate back to key door area
        if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) <= 10) {
            while (Players.getLocal().getWorldLocation().distanceTo(OUTSIDE_DOOR_LOCATION) > 2 && !AccBuilderSotf.d) {
                Movement.walkTo(OUTSIDE_DOOR_LOCATION);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        // Get second magnet if needed
        if (!Inventory.contains(MAGNET_ID) && MAGNET_CUPBOARD_AREA.contains(Players.getLocal().getWorldLocation())) {
            handleMagnetCupboard();
        }

        // Navigate to mouse hole with cheese
        if (Inventory.contains(MAGNET_ID) && Players.getLocal().getWorldLocation().distanceTo(CHEESE_SPOT_LOCATION) > 1) {
            AccBuilderSotf.c = "Nav to cheese spot";
            Movement.walkTo(CHEESE_SPOT_LOCATION);
            Time.sleepTicks(SHORT_SLEEP_TICKS);
        }

        // Use cheese on mouse hole
        if (Players.getLocal().getWorldLocation().distanceTo(CHEESE_SPOT_LOCATION) <= 2) {
            handleMouseWithCheese();
        }
    }

    /**
     * Handles using cheese on the mouse hole.
     */
    private static void handleMouseWithCheese() {
        TileObject mouseHole = TileObjects.getNearest("Mouse hole");
        NPC mouse = NPCs.getNearest("Mouse");

        if (mouseHole != null && mouse == null) {
            AccBuilderSotf.c = "Using cheese";

            if (Inventory.contains("Cheese")) {
                Inventory.getFirst("Cheese").useOn(mouseHole);
            }

            Time.sleepTicks(SHORT_SLEEP_TICKS);
        }

        if (mouse != null) {
            AccBuilderSotf.c = "Handle mouse";

            if (Inventory.contains(MAGNET_ID)) {
                Inventory.getFirst(MAGNET_ID).useOn(mouse);
            }

            Time.sleepTicks(SHORT_SLEEP_TICKS);
        }
    }

    /**
     * Handles entering the maze.
     */
    private static void handleMazeEntry() {
        AccBuilderSotf.c = "Entering maze";
        Movement.walkTo(new WorldPoint(3885, 9456, 0));
        Time.sleepTicks(SHORT_SLEEP_TICKS);
    }

    /**
     * Handles the combat phase - killing the experiment.
     */
    private static void handleCombatPhase() {
        if (!HOUSE_INTERIOR.contains(Players.getLocal().getWorldLocation()) && GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 3) {
            if (Inventory.contains(KEY_ID)) {
                if (Inventory.contains(KEY_ID) &&
                    Players.getLocal().getWorldLocation().distanceTo(SHED_ENTRANCE) > 3) {
                    AccBuilderSotf.c = "Handling walking";

                    if (Movement.getRunEnergy() >= LOBSTER_QUANTITY_MIN) {
                        enableRunAndDrinkStamina();
                    }
                }
            }

            // Enter shed
            if (Players.getLocal().getWorldLocation().distanceTo(SHED_ENTRANCE) <= 3) {
                if (Inventory.contains(KEY_ID) && Players.getLocal().getWorldLocation().getX() >= 2907) {
                    TileObject door = TileObjects.getNearest("Door");

                    if (door != null) {
                        AccBuilderSotf.c = "Entering shed";

                        if (Inventory.contains(KEY_ID)) {
                            Inventory.getFirst(KEY_ID).useOn(door);
                            Time.sleepTicks(2);
                        }
                    }
                }
            }

            // Navigate to safe spot and kill experiment
            if (SHED_AREA.contains(Players.getLocal().getWorldLocation())) {
                handleExperimentCombat();
            }
        }
    }

    /**
     * Handles combat with the experiment NPC.
     */
    private static void handleExperimentCombat() {
        if (SHED_AREA.contains(Players.getLocal().getWorldLocation()) && Inventory.contains(KEY_ID)) {
            // Move to safe spot
            if (!Players.getLocal().getWorldLocation().equals(COMBAT_SAFE_SPOT)) {
                AccBuilderSotf.c = "Nav to safe spot";
                Movement.walkTo(COMBAT_SAFE_SPOT);
            }

            // Eat food if low health
            if (Skills.getBoostedLevel(Skill.HITPOINTS) <= MEDIUM_SLEEP_TICKS) {
                if (Inventory.contains(LOBSTER_ID)) {
                    Inventory.getFirst(LOBSTER_ID).interact("Eat");
                }
            }

            // Attack experiment with magic
            NPC experiment = NPCs.getNearest(EXPERIMENT_IDS);

            if (Players.getLocal().getWorldLocation().equals(COMBAT_SAFE_SPOT) &&
                experiment != null && !experiment.isDead()) {
                AccBuilderSotf.c = "Casting spell";

                // Choose appropriate spell based on magic level
                if (Skills.getLevel(Skill.MAGIC) >= MAGIC_LEVEL_WATER) {
                    Magic.cast(SpellBook.Standard.WATER_STRIKE, experiment);
                    Time.sleepTicks(SHORT_SLEEP_TICKS);
                }

                if (Skills.getLevel(Skill.MAGIC) >= MAGIC_LEVEL_EARTH &&
                    Skills.getLevel(Skill.MAGIC) < MAGIC_LEVEL_WATER) {
                    if (Skills.getLevel(Skill.MAGIC) < MAGIC_LEVEL_WATER) {
                        if (Inventory.contains(EARTH_RUNE_ID) && !Inventory.contains("Fire rune")) {
                            Magic.cast(SpellBook.Standard.EARTH_STRIKE, experiment);
                            Time.sleepTicks(SHORT_SLEEP_TICKS);
                        }
                    }
                }

                if (Skills.getLevel(Skill.MAGIC) < MAGIC_LEVEL_EARTH) {
                    if (Inventory.contains("Fire rune")) {
                        Magic.cast(SpellBook.Standard.FIRE_STRIKE, experiment);
                        Time.sleepTicks(SHORT_SLEEP_TICKS);
                    }
                }
            }
        }
    }

    /**
     * Handles collecting the ball after killing the experiment.
     */
    private static void handleBallCollection() {
        if (GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 6) {
            if (!Inventory.contains("Ball")) {
                TileObject ball = TileItems.getNearest("Ball");

                if (ball != null) {
                    AccBuilderSotf.c = "Taking ball";
                    ball.interact("Take");
                    Time.sleepTicks(2);
                }
            }
        }
    }

    /**
     * Handles completing the quest.
     */
    private static void handleQuestCompletion() {
        if (GameStateUtil.getVarbit(QUEST_STATE_VARP) >= 6) {
            if (Inventory.contains("Ball")) {
                // Break teleport if in shed
                if (SHED_AREA.contains(Players.getLocal().getWorldLocation())) {
                    if (Inventory.contains(TELEPORT_TABLET_ID)) {
                        AccBuilderSotf.c = "Breaking tab";
                        Inventory.getFirst(TELEPORT_TABLET_ID).interact("Break");
                        Time.sleepTicks(MEDIUM_SLEEP_TICKS);
                    }
                }

                // Navigate back to quest start
                if (!SHED_AREA.contains(Players.getLocal().getWorldLocation()) &&
                    Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) > 4) {
                    AccBuilderSotf.c = "Nav to witches start";
                    Movement.walkTo(QUEST_START_LOCATION);
                    Time.sleepTicks(SHORT_SLEEP_TICKS);
                }

                // Turn in quest to Boy NPC
                if (Players.getLocal().getWorldLocation().distanceTo(QUEST_START_LOCATION) <= 5) {
                    AccBuilderSotf.c = "Turning in quest";

                    if (questCompletionCounter >= 1) {
                        aN.pZ += 1;
                        aN.u(AccBuilderSotf.m);
                        questCompletionCounter += 1;
                        aN.pZ = 0;
                        needsToBuyItems = false;
                    }

                    DialogUtil.talkToNpc("Boy", QUEST_START_DIALOG);
                }
            }
        }
    }

    /**
     * Enables run mode and drinks stamina potion if available.
     */
    public static void enableRunAndDrinkStamina() {
        if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() >= 190) {
            Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
            Time.sleepTicks(SHORT_SLEEP_TICKS);
        }

        if (!Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        // Navigate through maze
        if (!HOUSE_INTERIOR.contains(Players.getLocal().getWorldLocation()) ||
            Players.getLocal().getWorldLocation().distanceTo(CHEESE_SPOT_LOCATION) <= 2) {
            navigateMaze();
        }

        // Get key from fountain
        NPC experiment = NPCs.getNearest(EXPERIMENT_NPC_ID);

        if (!Inventory.contains(KEY_ID)) {
            handleMazeNavigation(experiment);
        }

        if (Inventory.contains(KEY_ID)) {
            navigateBackFromFountain(experiment);
        }
    }

    /**
     * Navigates through the maze avoiding the experiment.
     */
    private static void navigateMaze() {
        AccBuilderSotf.c = "Entering maze";
        Movement.walkTo(new WorldPoint(3885, 9456, 0));
        Time.sleepTicks(SHORT_SLEEP_TICKS);
    }

    /**
     * Handles maze navigation to avoid the experiment.
     */
    private static void handleMazeNavigation(NPC experiment) {
        if (MAZE_AREA_1.contains(Players.getLocal().getWorldLocation()) &&
            experiment != null &&
            EXPERIMENT_SPAWN_AREA_1.contains(experiment.getWorldLocation())) {
            Time.sleepTicks(7);

            while (Players.getLocal().getWorldLocation().distanceTo(MAZE_SAFE_SPOT_1) > 1 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav to first spot";
                Movement.walkTo(MAZE_SAFE_SPOT_1);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        if (MAZE_AREA_2.contains(Players.getLocal().getWorldLocation()) &&
            experiment != null &&
            MAZE_AREA_4.contains(experiment.getWorldLocation())) {
            while (Players.getLocal().getWorldLocation().distanceTo(MAZE_SAFE_SPOT_2) > 1 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav to second spot";
                Movement.walkTo(MAZE_SAFE_SPOT_2);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        if (MAZE_AREA_3.contains(Players.getLocal().getWorldLocation()) &&
            experiment != null &&
            EXPERIMENT_SPAWN_AREA_2.contains(experiment.getWorldLocation())) {
            Time.sleepTicks(7);

            while (Players.getLocal().getWorldLocation().distanceTo(MAZE_SAFE_SPOT_3) > 1 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav to third spot";
                Movement.walkTo(MAZE_SAFE_SPOT_3);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        if (MAZE_AREA_6.contains(Players.getLocal().getWorldLocation()) &&
            experiment != null &&
            EXPERIMENT_SPAWN_AREA_2.contains(experiment.getWorldLocation())) {
            while (Players.getLocal().getWorldLocation().distanceTo(FOUNTAIN_LOCATION) > 2 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav to fountain";
                Movement.walkTo(FOUNTAIN_LOCATION);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        // Check fountain for key
        if (Players.getLocal().getWorldLocation().distanceTo(FOUNTAIN_LOCATION) <= 3) {
            AccBuilderSotf.c = "Getting key";
            TileObject fountain = TileObjects.getNearest("Fountain");

            if (fountain != null) {
                fountain.interact("Check");
                Time.sleepTicks(2);

                Widget dialogWidget = Widgets.get(DIALOG_WIDGET_PARENT, DIALOG_WIDGET_CHILD);
                if (dialogWidget != null) {
                    dialogWidget.interact("Continue");
                    dialogWidget.interact(0);
                    dialogWidget.interact("null");
                    Keyboard.type(" ");
                }
            }
        }
    }

    /**
     * Navigates back from the fountain after getting the key.
     */
    private static void navigateBackFromFountain(NPC experiment) {
        if (Players.getLocal().getWorldLocation().distanceTo(FOUNTAIN_LOCATION) <= 3) {
            while (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(32511, 9520, 0)) > 1 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav back toward maze";
                Movement.walkTo(new WorldPoint(32511, 9520, 0));
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }

        if (Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(32511, 9520, 0)) <= 2 &&
            experiment != null &&
            EXPERIMENT_SPAWN_AREA_1.contains(experiment.getWorldLocation())) {
            while (Players.getLocal().getWorldLocation().distanceTo(MAZE_SAFE_SPOT_2) > 1 && !AccBuilderSotf.d) {
                AccBuilderSotf.c = "Nav to shed spot";
                Movement.walkTo(MAZE_SAFE_SPOT_2);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
            }
        }
    }

    /**
     * Handles banking and item withdrawal for the quest.
     */
    private static void handleBanking() {
        BankLocation bankLocation = BankLocation.getNearest();

        // Navigate to bank
        if (bankLocation != null && !bankLocation.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Navigating to bank";
            BankingUtil.navigateToBank(bankLocation);
        }

        if (bankLocation != null && bankLocation.getArea().contains(Players.getLocal().getWorldLocation())) {
            // Open bank
            if (!Bank.isOpen()) {
                AccBuilderSotf.c = "Opening bank";
                BankingUtil.openNearestBank();
                Time.sleepUntil(() -> Bank.isOpen(), LONG_SLEEP_MS);
            }

            if (Bank.isOpen()) {
                AccBuilderSotf.c = "Handling banking";

                // Deposit all items
                if (Inventory.getAll().size() > 0) {
                    Bank.depositInventory();
                    Time.sleepTicks(3);
                }

                if (Equipment.getAll().size() > 0) {
                    Bank.depositEquipment();
                    Time.sleepTicks(2);
                }

                // Handle any special banking requirements
                while (!I.co() && !AccBuilderSotf.d) {
                    I.cm();
                    Time.sleepTicks(SHORT_SLEEP_TICKS);
                }

                // Check if we have enough supplies
                if (!checkSupplies()) {
                    createShoppingList();
                    System.out.println("We are missing supplies, switching to BUYING");
                    needsToBuyItems = true;
                    return;
                }

                // Withdraw required items
                withdrawQuestItems();
            }
        }
    }

    /**
     * Checks if the bank has enough supplies for the quest.
     *
     * @return true if supplies are sufficient, false otherwise
     */
    private static boolean checkSupplies() {
        // Check fire runes
        if (Bank.contains(FIRE_RUNE_ID)) {
            if (Bank.getFirst(FIRE_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                return false;
            }
        }

        // Check earth runes
        if (Bank.contains(EARTH_RUNE_ID)) {
            if (Bank.getFirst(EARTH_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                return false;
            }
        }

        // Check water runes
        if (Bank.contains(WATER_RUNE_ID)) {
            if (Bank.getFirst(WATER_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                return false;
            }
        }

        // Check teleport tablets
        if (Bank.contains(TELEPORT_TABLET_ID)) {
            if (Bank.getFirst(TELEPORT_TABLET_ID).getQuantity() < 10) {
                return false;
            }
        }

        // Check leather gloves
        if (Bank.contains(LEATHER_GLOVES_ID)) {
            if (Bank.getFirst(LEATHER_GLOVES_ID).getQuantity() < 5) {
                return false;
            }
        }

        // Check lobsters
        if (Bank.contains(LOBSTER_ID)) {
            if (Bank.getFirst(LOBSTER_ID).getQuantity() < LOBSTER_QUANTITY_MIN) {
                return false;
            }
        }

        // Check if any required items are missing
        int[] requiredItems = {8007, TELEPORT_TABLET_ID, LEATHER_GLOVES_ID, LOBSTER_ID,
                               FIRE_RUNE_ID, WATER_RUNE_ID, EARTH_RUNE_ID};

        if (!GameStateUtil.randomRange(requiredItems)) {
            return false;
        }

        return true;
    }

    /**
     * Withdraws quest items from the bank.
     */
    private static void withdrawQuestItems() {
        if (!Bank.isOpen()) {
            BankingUtil.openNearestBank();
            Time.sleepTicks(4);
        }

        // Withdraw teleport tablets
        if (Bank.contains(TELEPORT_TABLET_ID)) {
            if (Inventory.getCount(TELEPORT_TABLET_ID) < 1) {
                Bank.withdraw(TELEPORT_TABLET_ID, MEDIUM_SLEEP_TICKS, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(TELEPORT_TABLET_ID) > 0, LONG_SLEEP_MS);
            }
        }

        // Withdraw leather gloves
        if (Bank.contains(LEATHER_GLOVES_ID)) {
            if (Inventory.getCount(LEATHER_GLOVES_ID) < 1) {
                Bank.withdraw(LEATHER_GLOVES_ID, LEATHER_GLOVES_QUANTITY, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(LEATHER_GLOVES_ID) > 0, LONG_SLEEP_MS);
            }
        }

        // Withdraw fire runes
        if (Bank.contains(FIRE_RUNE_ID)) {
            if (Inventory.getCount(FIRE_RUNE_ID) < 1) {
                Bank.withdraw(FIRE_RUNE_ID, 24351, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(FIRE_RUNE_ID) > 0, LONG_SLEEP_MS);
            }
        }

        // Withdraw water runes
        if (Bank.contains(WATER_RUNE_ID)) {
            if (Inventory.getCount(WATER_RUNE_ID) < 1) {
                Bank.withdraw(WATER_RUNE_ID, 24351, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(WATER_RUNE_ID) > 0, LONG_SLEEP_MS);
            }
        }

        // Withdraw earth runes
        if (Bank.contains(EARTH_RUNE_ID)) {
            if (Inventory.getCount(EARTH_RUNE_ID) < 1) {
                Bank.withdraw(EARTH_RUNE_ID, 24351, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(EARTH_RUNE_ID) > 0, LONG_SLEEP_MS);
            }
        }

        // Withdraw cheese
        if (Bank.contains(12625)) {
            if (!Inventory.contains(12625)) {
                Bank.withdraw(12625, 1, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.contains(12625), LONG_SLEEP_MS);
            }
        }

        // Withdraw lobsters
        if (Bank.contains(LOBSTER_ID)) {
            if (Inventory.getCount(LOBSTER_ID) < 1) {
                Bank.withdrawAll(LOBSTER_ID, Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(SHORT_SLEEP_TICKS);
                Time.sleepUntil(() -> Inventory.getCount(LOBSTER_ID) > 0, LONG_SLEEP_MS);
            }
        }
    }

    /**
     * Creates a shopping list for missing items.
     */
    private static void createShoppingList() {
        // Check lobster quantity
        if (!Bank.contains(LOBSTER_ID)) {
            shoppingList.add(new ShopItem(LOBSTER_ID, 100, 110));
        }

        if (Bank.contains(LOBSTER_ID)) {
            if (Bank.getFirst(LOBSTER_ID).getQuantity() < LOBSTER_QUANTITY_MIN) {
                shoppingList.add(new ShopItem(LOBSTER_ID, LOBSTER_QUANTITY_WITHDRAW, 110));
            }
        }

        // Check leather gloves
        if (Bank.contains(LEATHER_GLOVES_ID)) {
            if (Bank.contains(LEATHER_GLOVES_ID) &&
                Bank.getFirst(LEATHER_GLOVES_ID).getQuantity() < 5) {
                shoppingList.add(new ShopItem(LEATHER_GLOVES_ID, 5, 111));
            }
        }

        // Check for ring of wealth
        if (Bank.contains((Predicate) item -> item.getName().toLowerCase().contains("ring of wealth ("))) {
            shoppingList.add(new ShopItem(112, 12, 113));
        }

        // Check for item 8007
        if (Bank.contains(8007)) {
            shoppingList.add(new ShopItem(8007, LOBSTER_QUANTITY_WITHDRAW, 114));
        }

        // Check teleport tablets
        if (Bank.contains(TELEPORT_TABLET_ID)) {
            if (Bank.contains(TELEPORT_TABLET_ID) &&
                Bank.getFirst(TELEPORT_TABLET_ID).getQuantity() < 10) {
                shoppingList.add(new ShopItem(TELEPORT_TABLET_ID, LOBSTER_QUANTITY_MIN, 114));
            }
        }

        // Check cheese
        if (Bank.contains(12625)) {
            shoppingList.add(new ShopItem(12625, 5, Constants.DEFAULT_GE_TIMEOUT));
        }

        // Check fire runes
        if (Bank.contains(FIRE_RUNE_ID)) {
            if (Bank.getFirst(FIRE_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                shoppingList.add(new ShopItem(FIRE_RUNE_ID, RUNE_STOCK_QUANTITY, 18));
            }
        }

        // Check water runes
        if (Bank.contains(WATER_RUNE_ID)) {
            if (Bank.getFirst(WATER_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                shoppingList.add(new ShopItem(WATER_RUNE_ID, RUNE_STOCK_QUANTITY, 18));
            }
        }

        // Check earth runes
        if (Bank.contains(EARTH_RUNE_ID)) {
            if (Bank.getFirst(EARTH_RUNE_ID).getQuantity() < MIN_STOCK_QUANTITY) {
                shoppingList.add(new ShopItem(EARTH_RUNE_ID, RUNE_STOCK_QUANTITY, 18));
            }
        }
    }
}
