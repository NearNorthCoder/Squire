package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
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
 * Agility training quest step for SOTF plugin.
 * Handles agility training across multiple courses (Gnome, Varrock, Canifis)
 * with automatic banking, equipment management, and mark of grace collection.
 */
public class AgilityTrainingMultiCourseStep implements QuestStep {

    // Static fields
    public static int STAMINA_POTION_ID;
    public static int SUMMER_PIE_ID;
    public static boolean hasStartedTraining;
    public static List<d> buyList;

    // World areas for agility courses
    static WorldArea VARROCK_COURSE_PLANE_0;
    static WorldArea VARROCK_COURSE_PLANE_1;
    static WorldArea VARROCK_COURSE_PLANE_2;

    // Navigation waypoint
    private static WorldPoint navigationWaypoint;

    // String constants
    private static final String STATUS_BUYING = "Buying items";
    private static final String STATUS_FINISHED_BUYING = "Finished buying items, switching back to agility";
    private static final String STATUS_NAV_TO_BANK = "Navigating to bank";
    private static final String STATUS_BANKING = "Handling banking";
    private static final String STATUS_MISSING_SUPPLIES = "We are missing quest supplies, switching to BUYING";
    private static final String ITEM_VIAL = "Vial";
    private static final String ACTION_DROP = "Drop";
    private static final String ACTION_DRINK = "Drink";
    private static final String ACTION_EAT = "Eat";
    private static final String STATUS_NAV_GNOME = "Nav to gnome course";
    private static final String STATUS_CROSSING_LOG = "Crossing log";
    private static final String OBJECT_LOG_BALANCE = "Log balance";
    private static final String ACTION_WALK_ACROSS = "Walk-across";
    private static final String STATUS_CLIMBING_NET = "Climbing net";
    private static final String OBJECT_OBSTACLE_NET = "Obstacle net";
    private static final String ACTION_CLIMB_OVER = "Climb-over";
    private static final String STATUS_CLIMBING_BRANCH = "Climbing branch";
    private static final String OBJECT_TREE_BRANCH = "Tree branch";
    private static final String ACTION_CLIMB = "Climb";
    private static final String STATUS_CROSSING_ROPE = "Crossing rope";
    private static final String OBJECT_BALANCING_ROPE = "Balancing rope";
    private static final String ACTION_WALK_ON = "Walk-on";
    private static final String STATUS_CLIMBING_DOWN = "Climbing down";
    private static final String ACTION_CLIMB_DOWN = "Climb-down";
    private static final String STATUS_CROSSING_PIPE = "Crossing pipe";
    private static final String OBJECT_PIPE = "pipe";
    private static final String ACTION_SQUEEZE_THROUGH = "Squeeze-through";
    private static final String STATUS_NAV_TO_START = "Nav to start";
    private static final String ITEM_MARK_OF_GRACE = "Mark of grace";
    private static final String STATUS_TAKING_MARK = "Taking mark";
    private static final String STATUS_FOUND_MARK = "Found mark on ground";
    private static final String ACTION_TAKE = "Take";
    private static final String STATUS_STARTING_COURSE = "Starting course";
    private static final String OBJECT_ROUGH_WALL = "Rough wall";
    private static final String STATUS_CROSSING_CLOTHES_LINE = "Crossing clothes line";
    private static final String OBJECT_CLOTHES_LINE = "Clothes line";
    private static final String ACTION_CROSS = "Cross";
    private static final String STATUS_LEAPING = "Leaping";
    private static final String OBJECT_GAP = "Gap";
    private static final String ACTION_LEAP = "Leap";
    private static final String STATUS_BALANCING = "Balancing";
    private static final String OBJECT_WALL = "Wall";
    private static final String ACTION_BALANCE = "Balance";
    private static final String STATUS_JUMPING_GAP = "Jumping gap";
    private static final String STATUS_JUMPING_GAP_2 = "Jumping gap 2";
    private static final String STATUS_JUMPING_GAP_3 = "Jumping gap 3";
    private static final String STATUS_HURDLE_ROOF = "Hurdle roof";
    private static final String ACTION_HURDLE = "Hurdle";
    private static final String STATUS_FINISHING_COURSE = "Finishing course";
    private static final String OBJECT_EDGE = "Edge";
    private static final String ACTION_JUMP_OFF = "Jump-off";
    private static final String STATUS_NAV_CANIFIS = "Nav to canafis course";
    private static final String OBJECT_TALL_TREE = "Tall tree";
    private static final String STATUS_JUMPING_GAP_1 = "Jumping gap 1";
    private static final String ACTION_JUMP = "Jump";
    private static final String STATUS_JUMPING_GAP_4 = "Jumping gap 4";
    private static final String STATUS_JUMPING_GAP_5 = "Jumping gap 5";
    private static final String STATUS_JUMPING_GAP_6 = "Jumping gap 6";
    private static final String STATUS_VAULTING = "Vaulting";
    private static final String ACTION_VAULT = "Vault";
    private static final String ACTION_CLIMB_UP = "Climb-up";
    private static final String STATUS_CROSS_ROPE = "cross rope";
    private static final String STATUS_JUMPING_EDGE = "Jumping Edge";
    private static final String QUEST_NAME = "Agility";
    private static final String OBJECT_PASSAGE = "passage";
    private static final String OBJECT_TIGHTROPE = "Tightrope";
    private static final String OBJECT_POLE_VAULT = "Pole-vault";

    // Item IDs
    private static final int COINS_ID = 995;
    private static final int LEATHER_BODY_ID = 1129;
    private static final int LEATHER_GLOVES_ID = 1059;
    private static final int LEATHER_BOOTS_ID = 1061;
    private static final int SPOTTIER_CAPE_ID = 19476;
    private static final int GRACEFUL_HOOD_ID = 11850;
    private static final int GRACEFUL_TOP_ID = 11852;
    private static final int GRACEFUL_LEGS_ID = 11854;
    private static final int GRACEFUL_GLOVES_ID = 11856;
    private static final int GRACEFUL_BOOTS_ID = 11858;
    private static final int GRACEFUL_CAPE_ID = 11860;
    private static final int MARK_OF_GRACE_ID = 11849;

    // Object IDs
    private static final int GNOME_PIPE_ID = 43597;
    private static final int VARROCK_GAP_1_ID = 14835;
    private static final int VARROCK_GAP_2_ID = 14834;

    // Constants
    private static final int AGILITY_LEVEL_VARROCK = 30;
    private static final int AGILITY_LEVEL_CANIFIS = 40;
    private static final int AGILITY_LEVEL_SEERS = 60;
    private static final int RUN_ENERGY_THRESHOLD = 30;
    private static final int HEALTH_THRESHOLD = 20;
    private static final int MIN_FOOD_COUNT = 10;
    private static final int STAMINA_COUNT = 2;
    private static final int SUMMER_PIE_COUNT = 40;
    private static final int GRACEFUL_COUNT = 10;
    private static final int TIMEOUT_TICKS = 30000;

    static {
        buyList = new ArrayList<>();
        STAMINA_POTION_ID = 12631;
        SUMMER_PIE_ID = 7218;
        VARROCK_COURSE_PLANE_0 = new WorldArea(3214, 3414, 31, 11, 0);
        VARROCK_COURSE_PLANE_1 = new WorldArea(3214, 3414, 31, 11, 1);
        VARROCK_COURSE_PLANE_2 = new WorldArea(3214, 3414, 31, 11, 2);
        navigationWaypoint = new WorldPoint(3222, 3415, 0);
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public int execute() {
        try {
            performAgilityTraining();
        } catch (Exception e) {
            // Ignore exceptions
        }
        return 100;
    }

    @Override
    public String getName() {
        return QUEST_NAME;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.AGILITY) >= 99;
    }

    /**
     * Main agility training method that handles:
     * - Banking and equipment management
     * - Course selection based on level
     * - Mark of grace collection
     * - Food and stamina potion usage
     */
    public static void performAgilityTraining() {
        // Handle buying phase
        if (hasStartedTraining) {
            AccBuilderSotf.c = STATUS_BUYING;
            b.a(buyList);
            if (buyList.size() < 1) {
                System.out.println(STATUS_FINISHED_BUYING);
                hasStartedTraining = false;
            }
        }

        // Main training loop
        if (!hasStartedTraining) {
            // Check if we need to bank
            if (!hasRequiredItems()) {
                BankLocation nearestBank = BankLocation.getNearest();

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_NAV_TO_BANK;

                    // Special handling for Falador area
                    WorldArea faladorArea = new WorldArea(2944, 3368, 119, 195, 0);
                    if (faladorArea.contains(Players.getLocal().getWorldLocation())) {
                        WorldPoint faladorWaypoint = new WorldPoint(2945, 3368, 0);
                        if (Players.getLocal().getWorldLocation().distanceTo(faladorWaypoint) > 3) {
                            Movement.walkTo(faladorWaypoint);
                            Time.sleepTicks(1);
                        }
                    }

                    a.a(nearestBank);
                }

                // Handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_BANKING;

                    // Open bank if not open
                    if (!Bank.isOpen()) {
                        a.a();
                        Time.sleepUntil(Bank::isOpen, 5000);
                    }

                    // Deposit inventory and equipment
                    if (Bank.isOpen()) {
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(1);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(2);
                        }
                    }

                    // Check if we have required items in bank
                    int[] requiredItems = {
                        COINS_ID, LEATHER_BODY_ID, LEATHER_GLOVES_ID, SPOTTIER_CAPE_ID,
                        GRACEFUL_CAPE_ID, GRACEFUL_BOOTS_ID, GRACEFUL_GLOVES_ID,
                        SUMMER_PIE_ID, GRACEFUL_LEGS_ID, STAMINA_POTION_ID
                    };

                    if (!GameStateUtil.randomRange(requiredItems)) {
                        prepareBuyList();
                        System.out.println(STATUS_MISSING_SUPPLIES);
                        hasStartedTraining = true;
                        return;
                    }

                    // Withdraw items based on agility level
                    if (GameStateUtil.randomRange(requiredItems)) {
                        // Withdraw graceful pieces
                        a.a(GRACEFUL_HOOD_ID, 1);
                        a.a(GRACEFUL_TOP_ID, 1);
                        a.a(GRACEFUL_LEGS_ID, 1);
                        a.a(GRACEFUL_GLOVES_ID, 1);
                        a.a(GRACEFUL_BOOTS_ID, 1);
                        a.a(GRACEFUL_CAPE_ID, 1);
                        a.a(SPOTTIER_CAPE_ID, 1);

                        // Handle mark of grace
                        if (!Inventory.contains(GRACEFUL_HOOD_ID) && !Equipment.contains(GRACEFUL_HOOD_ID) &&
                            !Bank.contains(GRACEFUL_HOOD_ID)) {
                            a.a(MARK_OF_GRACE_ID, 1);
                        }

                        // Withdraw stamina potions
                        a.a(GRACEFUL_CAPE_ID, 1);
                        e.l(GRACEFUL_HOOD_ID);
                        e.l(GRACEFUL_TOP_ID);
                        e.l(GRACEFUL_LEGS_ID);
                        e.l(GRACEFUL_GLOVES_ID);
                        e.l(GRACEFUL_BOOTS_ID);
                        Time.sleepTicks(1);
                        e.l(SPOTTIER_CAPE_ID);
                        e.l(11862);
                        e.l(GRACEFUL_CAPE_ID);
                        e.l(MARK_OF_GRACE_ID);
                        e.l(GRACEFUL_CAPE_ID);
                        Time.sleepTicks(3);

                        // Reopen bank if needed
                        if (!Bank.isOpen()) {
                            a.a();
                            Time.sleepTicks(6);
                        }

                        // Withdraw equipment based on agility level
                        if (Bank.isOpen()) {
                            if (Skills.getLevel(Skill.AGILITY) < AGILITY_LEVEL_VARROCK) {
                                a.a(COINS_ID, 10);
                                a.a(LEATHER_BODY_ID, 10);
                                a.a(GRACEFUL_GLOVES_ID, 10);
                                a.a(LEATHER_GLOVES_ID, 10);
                                a.b(f.bk, 1);
                                a.a(STAMINA_POTION_ID, 1);
                                a.a(GRACEFUL_BOOTS_ID, 5);
                                a.a(SUMMER_PIE_ID, 173);
                            }
                            if (Skills.getLevel(Skill.AGILITY) >= AGILITY_LEVEL_VARROCK) {
                                a.a(COINS_ID, 10);
                                a.a(GRACEFUL_GLOVES_ID, 10);
                                a.a(GRACEFUL_LEGS_ID, 10);
                                a.b(f.bk, 1);
                                a.a(STAMINA_POTION_ID, 1);
                                a.a(GRACEFUL_BOOTS_ID, 8);
                                a.a(SUMMER_PIE_ID, 10);
                            }
                        }
                    }
                }
            }

            // Handle training
            if (hasRequiredItems()) {
                // Drop vials
                if (Inventory.contains(ITEM_VIAL)) {
                    Inventory.getFirst(ITEM_VIAL).interact(ACTION_DROP);
                }

                // Drink stamina potions
                if (Inventory.contains(f.ba) && Movement.getRunEnergy() < RUN_ENERGY_THRESHOLD) {
                    Inventory.getFirst(f.ba).interact(ACTION_DRINK);
                    Time.sleepTicks(1);
                }

                // Eat food if low health
                if (Combat.getMissingHealth() > HEALTH_THRESHOLD) {
                    if (Inventory.contains(SUMMER_PIE_ID)) {
                        Inventory.getFirst(SUMMER_PIE_ID).interact(ACTION_EAT);
                        Time.sleepTicks(2);
                    }
                }

                // Toggle run
                if (Movement.getRunEnergy() > 12 && !Movement.isRunEnabled()) {
                    Movement.toggleRun();
                }

                // Route to appropriate course based on level
                if (Skills.getLevel(Skill.AGILITY) < 16) {
                    runGnomeCourse();
                }

                if ((GameStateUtil.getVarbit(11849) < 74 || GameStateUtil.getVarbit(21061) < 5) &&
                    Skills.getLevel(Skill.AGILITY) >= 16 &&
                    Skills.getLevel(Skill.AGILITY) < 74) {
                    runVarrockCourse();
                }

                if (GameStateUtil.getVarbit(11849) >= 74 && GameStateUtil.getVarbit(21061) >= 5) {
                    if (Skills.getLevel(Skill.AGILITY) >= 16 && Skills.getLevel(Skill.AGILITY) < AGILITY_LEVEL_VARROCK) {
                        runVarrockCourse();
                    }
                    if (Skills.getLevel(Skill.AGILITY) >= AGILITY_LEVEL_VARROCK && Skills.getLevel(Skill.AGILITY) < 74) {
                        runCanifisCourse();
                    }
                }

                if (Skills.getLevel(Skill.AGILITY) >= 74) {
                    runCanifisCourse2();
                }
            }
        }
    }

    /**
     * Runs the Gnome Stronghold agility course (Level 1+)
     */
    private static void runGnomeCourse() {
        WorldArea startArea = new WorldArea(2472, 3435, 7, 6, 0);
        WorldArea logArea = new WorldArea(2472, 3436, 7, 8, 0);
        WorldArea netArea1 = new WorldArea(2472, 3437, 7, 8, 1);
        WorldArea treeArea = new WorldArea(2469, 3422, 10, 11, 2);
        WorldArea ropeArea = new WorldArea(7547, 7674, 10, 8, 2);
        WorldArea netArea2 = new WorldArea(2484, 3418, 4, 7, 2);
        WorldArea pipeArea = new WorldArea(2484, 3430, 9, 7, 1);
        WorldArea pipeArea2 = new WorldArea(2484, 3425, 10, 8, 2);
        WorldArea endArea = new WorldArea(2486, 3427, 15, 20, 2);
        WorldArea endArea2 = new WorldArea(2487, 3421, 11, 10, 2);
        WorldArea endArea3 = new WorldArea(2476, 3417, 7, 9, 2);
        WorldArea endArea4 = new WorldArea(2476, 3418, 10, 7, 2);

        // Navigate to start if not in course
        if (!startArea.contains(Players.getLocal().getWorldLocation()) &&
            !logArea.contains(Players.getLocal().getWorldLocation()) &&
            !netArea1.contains(Players.getLocal().getWorldLocation()) &&
            !treeArea.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_NAV_GNOME;
            if (Bank.isOpen()) {
                Bank.close();
            }
            if (Dialog.isOpen()) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(2480, 3437, 0));
            Time.sleepTicks(1);
        }

        // Handle obstacles
        if (Players.getLocal().getAnimation() == -1 && !Players.getLocal().isMoving()) {
            TileItem markOfGrace = TileItems.getNearest(ITEM_MARK_OF_GRACE);
            if (markOfGrace != null && !isMarkInCourse()) {
                AccBuilderSotf.c = STATUS_TAKING_MARK;
                System.out.println(STATUS_FOUND_MARK);
                markOfGrace.interact(ACTION_TAKE);
                Time.sleepTicks(3);
            }

            if (!isMarkInCourse()) {
                // Log balance
                WorldArea logObstacle = new WorldArea(2473, 3436, 7, 11, 0);
                if (logObstacle.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_CROSSING_LOG;
                    int currentXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest(OBJECT_LOG_BALANCE).interact(ACTION_WALK_ACROSS);
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                    Time.sleepTicks(1);
                }

                // Obstacle net
                WorldArea netObstacle = new WorldArea(2473, 3425, 9, 7, 0);
                if (netObstacle.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_CLIMBING_NET;
                    int currentXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest(OBJECT_CLOTHES_LINE).interact(ACTION_CROSS);
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                    Time.sleepTicks(1);
                }

                // Tree branch (additional obstacles follow similar pattern)
                WorldArea branchObstacle = new WorldArea(2469, 3422, 9, 11, 1);
                if (branchObstacle.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_CLIMBING_BRANCH;
                    int currentXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest(OBJECT_GAP).interact(ACTION_LEAP);
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                    Time.sleepTicks(1);
                }

                // Continue with remaining obstacles...
                handleRemainingGnomeObstacles();
            }
        }
    }

    /**
     * Handles the remaining obstacles in the Gnome course
     */
    private static void handleRemainingGnomeObstacles() {
        // Balancing rope
        WorldArea ropeObstacle = new WorldArea(2477, 3420, 9, 7, 2);
        if (ropeObstacle.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_CROSSING_ROPE;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(OBJECT_WALL).interact(ACTION_BALANCE);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Tree branch down
        WorldArea branchDownObstacle = new WorldArea(2486, 3419, 9, 7, 2);
        if (branchDownObstacle.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_CLIMBING_DOWN;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(OBJECT_GAP).interact(ACTION_LEAP);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Obstacle net 2
        WorldArea netObstacle2 = new WorldArea(2483, 3426, 9, 7, 1);
        if (netObstacle2.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_2;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(VARROCK_GAP_1_ID).interact(ACTION_LEAP);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Pipe
        WorldArea pipeObstacle = new WorldArea(2484, 3431, 10, 7, 0);
        if (pipeObstacle.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_3;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(VARROCK_GAP_2_ID).interact(ACTION_LEAP);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Rope down
        WorldArea ropeDownObstacle = new WorldArea(2487, 3427, 10, 9, 2);
        if (ropeDownObstacle.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_HURDLE_ROOF;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(14840).interact(ACTION_HURDLE);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Final obstacle
        WorldArea finalObstacle = new WorldArea(2492, 3403, 10, 7, 3);
        if (finalObstacle.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_FINISHING_COURSE;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            TileObjects.getNearest(OBJECT_EDGE).interact(ACTION_JUMP_OFF);
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }
    }

    /**
     * Runs the Varrock agility course (Level 30+)
     */
    private static void runVarrockCourse() {
        WorldArea varrockStart = new WorldArea(3220, 3414, 32, 23, 0);
        WorldArea varrockPlane1 = new WorldArea(3220, 3414, 32, 23, 1);
        WorldArea varrockPlane2 = new WorldArea(3220, 3414, 32, 23, 2);
        WorldArea varrockPlane3 = new WorldArea(3220, 3414, 32, 23, 3);
        WorldArea varrockArea1 = new WorldArea(12143, 3403, 7, 10, 2);
        WorldArea varrockArea2 = new WorldArea(12159, 12143, 7, 8, 2);
        WorldArea varrockArea3 = new WorldArea(12026, 3419, 4, 7, 2);
        WorldArea varrockArea4 = new WorldArea(7568, 3407, 10, 11, 3);
        WorldArea varrockArea5 = new WorldArea(12046, 20488, 7, 9, 2);
        WorldArea varrockArea6 = new WorldArea(11709, 3403, 13, 6, 3);
        WorldArea varrockArea7 = new WorldArea(12022, 16336, 4, 11, 2);
        WorldPoint varrockWaypoint = new WorldPoint(12022, 3419, 0);

        if (Dialog.isOpen()) {
            Dialog.close();
        }

        // Navigate to start
        if (!varrockStart.contains(Players.getLocal().getWorldLocation()) &&
            !varrockPlane1.contains(Players.getLocal().getWorldLocation()) &&
            !varrockPlane2.contains(Players.getLocal().getWorldLocation()) &&
            !varrockPlane3.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_NAV_CANIFIS;
            Movement.walkTo(varrockWaypoint);
            Time.sleepTicks(1);
        }

        if (varrockStart.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(varrockWaypoint) > 6) {
                AccBuilderSotf.c = STATUS_NAV_TO_START;
                Movement.walkTo(varrockWaypoint);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(varrockWaypoint) <= 6) {
                AccBuilderSotf.c = STATUS_STARTING_COURSE;
                int currentXp = Skills.getExperience(Skill.AGILITY);
                TileObjects.getNearest(OBJECT_TALL_TREE).interact(ACTION_CLIMB);
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                Time.sleepTicks(1);
            }
        }

        // Handle marks of grace
        TileItem markOfGrace = TileItems.getNearest(ITEM_MARK_OF_GRACE);
        if (markOfGrace != null && !isMarkInCourse()) {
            AccBuilderSotf.c = STATUS_TAKING_MARK;
            System.out.println(STATUS_FOUND_MARK);
            markOfGrace.interact(ACTION_TAKE);
            Time.sleepTicks(3);
        }

        if (!isMarkInCourse()) {
            handleCanifisObstacles();
        }
    }

    /**
     * Handles obstacles in the Canifis agility course
     */
    private static void handleCanifisObstacles() {
        // Gap 1
        WorldArea gap1Area = new WorldArea(12143, 3407, 7, 10, 2);
        TileObject gap1 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(7661, 3419, 2)) <= 2);

        if (gap1Area.contains(Players.getLocal().getWorldLocation()) && gap1 != null) {
            int currentXp = Skills.getExperience(Skill.AGILITY);
            AccBuilderSotf.c = STATUS_JUMPING_GAP_1;
            gap1.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Gap 2
        WorldArea gap2Area = new WorldArea(12159, 12143, 7, 8, 2);
        TileObject gap2 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(3419, 7640, 2)) <= 2);

        if (gap2Area.contains(Players.getLocal().getWorldLocation()) && gap2 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_2;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            gap2.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Continue with remaining obstacles...
        handleRemainingCanifisObstacles();
    }

    /**
     * Handles remaining obstacles in Canifis course
     */
    private static void handleRemainingCanifisObstacles() {
        if (isMarkInCourse()) {
            return;
        }

        // Gap 3
        WorldArea gap3Area = new WorldArea(12026, 3419, 4, 7, 2);
        TileObject gap3 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(3419, 7622, 2)) <= 2);

        if (gap3Area.contains(Players.getLocal().getWorldLocation()) && gap3 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_3;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            gap3.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Gap 4
        WorldArea gap4Area = new WorldArea(7568, 3407, 10, 11, 3);
        TileObject gap4 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(3422, 7656, 3)) <= 2);

        if (gap4Area.contains(Players.getLocal().getWorldLocation()) && gap4 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_4;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            gap4.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Continue with remaining gaps...
        handleFinalCanifisObstacles();
    }

    /**
     * Handles the final obstacles in Canifis course
     */
    private static void handleFinalCanifisObstacles() {
        if (isMarkInCourse()) {
            return;
        }

        // Pole vault
        WorldArea poleArea = new WorldArea(12046, 20488, 7, 9, 2);
        TileObject pole = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_POLE_VAULT) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(20488, 12026, 2)) <= 2);

        if (poleArea.contains(Players.getLocal().getWorldLocation()) && pole != null) {
            AccBuilderSotf.c = STATUS_VAULTING;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            pole.interact(ACTION_VAULT);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Gap 5
        WorldArea gap5Area = new WorldArea(11709, 3403, 13, 6, 3);
        TileObject gap5 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(3398, 7674, 2)) <= 2);

        if (gap5Area.contains(Players.getLocal().getWorldLocation()) && gap5 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_5;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            gap5.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Gap 6 (final)
        WorldArea gap6Area = new WorldArea(12022, 16336, 4, 11, 2);
        TileObject gap6 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_EDGE) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(7680, 3515, 2)) <= 2);

        if (gap6Area.contains(Players.getLocal().getWorldLocation()) && gap6 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_EDGE;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            gap6.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }
    }

    /**
     * Runs the Canifis agility course (Level 40+) - Alternative route
     */
    private static void runCanifisCourse() {
        WorldArea canifisStart = new WorldArea(28419, 3506, 32, 23, 0);
        WorldArea canifisPlane1 = new WorldArea(28419, 3506, 32, 23, 1);
        WorldArea canifisPlane2 = new WorldArea(28419, 3506, 32, 23, 2);
        WorldArea canifisPlane3 = new WorldArea(28419, 3506, 32, 23, 3);
        WorldArea canifisArea1 = new WorldArea(28547, 3495, 7, 10, 3);
        WorldArea canifisArea2 = new WorldArea(28491, 3491, 173, 6, 3);
        WorldArea canifisArea3 = new WorldArea(12533, 20424, 7, 9, 3);
        WorldArea canifisArea4 = new WorldArea(6831, 3495, 15, 11, 3);
        WorldArea canifisArea5 = new WorldArea(28459, 28467, 62, 4, 2);
        WorldPoint canifisWaypoint = new WorldPoint(12549, 28430, 0);

        if (Dialog.isOpen()) {
            Dialog.close();
        }

        // Navigate to start
        if (!canifisStart.contains(Players.getLocal().getWorldLocation()) &&
            !canifisPlane1.contains(Players.getLocal().getWorldLocation()) &&
            !canifisPlane2.contains(Players.getLocal().getWorldLocation()) &&
            !canifisPlane3.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_NAV_CANIFIS;
            Movement.walkTo(canifisWaypoint);
            Time.sleepTicks(1);
        }

        if (canifisStart.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(canifisWaypoint) > 6) {
                AccBuilderSotf.c = STATUS_NAV_TO_START;
                Movement.walkTo(canifisWaypoint);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(canifisWaypoint) <= 6) {
                AccBuilderSotf.c = STATUS_STARTING_COURSE;
                int currentXp = Skills.getExperience(Skill.AGILITY);
                TileObjects.getNearest(OBJECT_WALL).interact(ACTION_CLIMB_UP);
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                Time.sleepTicks(1);
            }
        }

        // Handle marks and obstacles similar to other courses
        handleCanifis2Obstacles();
    }

    /**
     * Handles obstacles in the second Canifis course variant
     */
    private static void handleCanifis2Obstacles() {
        TileItem markOfGrace = TileItems.getNearest(ITEM_MARK_OF_GRACE);
        if (markOfGrace != null && !isMarkInCourse()) {
            AccBuilderSotf.c = STATUS_TAKING_MARK;
            System.out.println(STATUS_FOUND_MARK);
            markOfGrace.interact(ACTION_TAKE);
            Time.sleepTicks(3);
        }

        if (!isMarkInCourse()) {
            // Handle each obstacle in sequence
            WorldArea obstacle1 = new WorldArea(28547, 3495, 7, 10, 3);
            TileObject obj1 = TileObjects.getNearest(obj ->
                obj.getName().contains(OBJECT_GAP) &&
                obj.getWorldLocation().distanceTo(new WorldPoint(7137, 3419, 3)) <= 2);

            if (obstacle1.contains(Players.getLocal().getWorldLocation()) && obj1 != null) {
                int currentXp = Skills.getExperience(Skill.AGILITY);
                AccBuilderSotf.c = STATUS_JUMPING_GAP_1;
                obj1.interact(ACTION_JUMP);
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                Time.sleepTicks(1);
            }

            // Continue with remaining obstacles...
        }
    }

    /**
     * Runs the Canifis agility course (Level 60+) - Second variant
     */
    private static void runCanifisCourse2() {
        WorldArea canifis2Start = new WorldArea(28547, 3970, 35, 35, 0);
        WorldArea canifis2Plane1 = new WorldArea(28547, 3970, 35, 35, 1);
        WorldArea canifis2Plane2 = new WorldArea(28547, 3970, 35, 35, 2);
        WorldArea canifis2Plane3 = new WorldArea(28547, 3970, 35, 35, 3);
        WorldArea canifis2Area1 = new WorldArea(28579, 3491, 11, 10, 3);
        WorldArea canifis2Area2 = new WorldArea(28555, 3491, 173, 53, 2);
        WorldArea canifis2Area3 = new WorldArea(12501, 20424, 7, 9, 2);
        WorldArea canifis2Area4 = new WorldArea(7600, 3495, 19, 11, 3);
        WorldArea canifis2Area5 = new WorldArea(28459, 28483, 62, 4, 2);
        WorldPoint canifis2Waypoint = new WorldPoint(12565, 28446, 0);

        if (Dialog.isOpen()) {
            Dialog.close();
        }

        // Navigate and handle obstacles similar to other courses
        if (!canifis2Start.contains(Players.getLocal().getWorldLocation()) &&
            !canifis2Plane1.contains(Players.getLocal().getWorldLocation()) &&
            !canifis2Plane2.contains(Players.getLocal().getWorldLocation()) &&
            !canifis2Plane3.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = STATUS_NAV_CANIFIS;
            Movement.walkTo(canifis2Waypoint);
            Time.sleepTicks(1);
        }

        if (canifis2Start.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(canifis2Waypoint) > 6) {
                AccBuilderSotf.c = STATUS_NAV_TO_START;
                Movement.walkTo(canifis2Waypoint);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(canifis2Waypoint) <= 6) {
                AccBuilderSotf.c = STATUS_STARTING_COURSE;
                int currentXp = Skills.getExperience(Skill.AGILITY);
                TileObjects.getNearest(OBJECT_WALL).interact(ACTION_CLIMB_UP);
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
                Time.sleepTicks(1);
            }
        }

        // Handle marks and obstacles
        TileItem markOfGrace = TileItems.getNearest(ITEM_MARK_OF_GRACE);
        if (markOfGrace != null && !isMarkInCourse()) {
            AccBuilderSotf.c = STATUS_TAKING_MARK;
            System.out.println(STATUS_FOUND_MARK);
            markOfGrace.interact(ACTION_TAKE);
            Time.sleepTicks(3);
        }

        if (!isMarkInCourse()) {
            handleCanifis2FullObstacles();
        }
    }

    /**
     * Handles all obstacles in the Canifis 2 course
     */
    private static void handleCanifis2FullObstacles() {
        // Gap 1
        WorldArea gap1 = new WorldArea(28579, 3491, 11, 10, 3);
        TileObject obj1 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_TIGHTROPE) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(7137, 3403, 3)) <= 2);

        if (gap1.contains(Players.getLocal().getWorldLocation()) && obj1 != null) {
            int currentXp = Skills.getExperience(Skill.AGILITY);
            AccBuilderSotf.c = STATUS_JUMPING_GAP_1;
            obj1.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Rope
        WorldArea ropeArea = new WorldArea(28555, 3491, 173, 53, 2);
        TileObject rope = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_TIGHTROPE) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(19126, 3403, 2)) <= 2);

        if (ropeArea.contains(Players.getLocal().getWorldLocation()) && rope != null) {
            AccBuilderSotf.c = STATUS_CROSS_ROPE;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            rope.interact(ACTION_CROSS);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        // Continue with remaining obstacles...
        handleCanifis2RemainingObstacles();
    }

    /**
     * Handles the remaining obstacles in Canifis 2 course
     */
    private static void handleCanifis2RemainingObstacles() {
        if (isMarkInCourse()) {
            return;
        }

        // Gap 3
        WorldArea gap3 = new WorldArea(12501, 20424, 7, 9, 2);
        TileObject obj3 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(15031, 3981, 2)) <= 2);

        if (gap3.contains(Players.getLocal().getWorldLocation()) && obj3 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_3;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            obj3.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Gap 4
        WorldArea gap4 = new WorldArea(7600, 3495, 19, 11, 3);
        TileObject obj4 = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_GAP) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(7680, 7645, 3)) <= 2);

        if (gap4.contains(Players.getLocal().getWorldLocation()) && obj4 != null) {
            AccBuilderSotf.c = STATUS_JUMPING_GAP_4;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            obj4.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }

        if (isMarkInCourse()) {
            return;
        }

        // Final edge
        WorldArea finalEdge = new WorldArea(28459, 28483, 62, 4, 2);
        TileObject edge = TileObjects.getNearest(obj ->
            obj.getName().contains(OBJECT_EDGE) &&
            obj.getWorldLocation().distanceTo(new WorldPoint(7680, 3515, 2)) <= 2);

        if (finalEdge.contains(Players.getLocal().getWorldLocation()) && edge != null) {
            AccBuilderSotf.c = STATUS_JUMPING_EDGE;
            int currentXp = Skills.getExperience(Skill.AGILITY);
            edge.interact(ACTION_JUMP);
            Time.sleepTicks(GameStateUtil.randomRange(1, 2));
            Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > currentXp, TIMEOUT_TICKS);
            Time.sleepTicks(1);
        }
    }

    /**
     * Checks if a mark of grace is within the current agility course
     * @return true if mark is in course, false otherwise
     */
    private static boolean isMarkInCourse() {
        WorldArea[] courseAreas = {
            new WorldArea(2472, 3435, 31, 11, 0),
            new WorldArea(2473, 3435, 10, 11, 3),
            new WorldArea(2484, 3418, 4, 7, 3),
            new WorldArea(7488, 12135, 8, 5, 1),
            new WorldArea(2484, 3425, 10, 8, 3),
            new WorldArea(7558, 7643, 28, 173, 3),
            new WorldArea(2487, 3421, 11, 10, 3),
            new WorldArea(2476, 3417, 7, 9, 3),
            new WorldArea(2476, 3418, 10, 7, 3),
            new WorldArea(12143, 3403, 7, 10, 2),
            new WorldArea(12159, 12143, 7, 8, 2),
            new WorldArea(12026, 3419, 4, 7, 2),
            new WorldArea(7568, 3407, 10, 11, 3),
            new WorldArea(12046, 20488, 7, 9, 2),
            new WorldArea(11709, 3403, 13, 6, 3),
            new WorldArea(12022, 16336, 4, 11, 2),
            new WorldArea(28579, 3491, 11, 10, 3),
            new WorldArea(28555, 3491, 173, 53, 2),
            new WorldArea(12501, 20424, 7, 9, 2),
            new WorldArea(7600, 3495, 19, 11, 3),
            new WorldArea(28459, 28483, 62, 4, 2)
        };

        TileItem mark = TileItems.getNearest(MARK_OF_GRACE_ID);
        if (mark != null) {
            System.out.println(STATUS_FOUND_MARK);
            for (WorldArea area : courseAreas) {
                if (area.contains(mark.getWorldLocation()) &&
                    area.contains(Players.getLocal().getWorldLocation())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if the player has all required items for agility training
     * @return true if has all items, false otherwise
     */
    private static boolean hasRequiredItems() {
        if (Skills.getBoostedLevel(Skill.AGILITY) >= AGILITY_LEVEL_VARROCK) {
            if (Inventory.contains(COINS_ID) && Inventory.contains(GRACEFUL_LEGS_ID) &&
                Inventory.contains(SUMMER_PIE_ID) &&
                (!Inventory.contains(item -> item.getName().contains(OBJECT_PASSAGE)) ||
                 Equipment.contains(item -> item.getName().contains(OBJECT_PASSAGE))) &&
                (!Inventory.contains(f.bk) || Equipment.contains(f.bk))) {
                return true;
            }
        }

        if (Inventory.contains(COINS_ID) && Inventory.contains(LEATHER_GLOVES_ID) &&
            Inventory.contains(LEATHER_BODY_ID) &&
            (!Inventory.contains(item -> item.getName().contains(OBJECT_PASSAGE)) ||
             Equipment.contains(item -> item.getName().contains(OBJECT_PASSAGE))) &&
            (!Inventory.contains(f.bk) || Equipment.contains(f.bk))) {
            return true;
        }

        return false;
    }

    /**
     * Prepares the buy list with items needed for agility training
     */
    public static void prepareBuyList() {
        buyList.clear();

        if (!Bank.contains(SPOTTIER_CAPE_ID)) {
            buyList.add(new d(SPOTTIER_CAPE_ID, 1, 19534));
        }

        if (!Bank.contains(GRACEFUL_CAPE_ID)) {
            buyList.add(new d(GRACEFUL_CAPE_ID, 2, 28207));
        }

        if (!Bank.contains(STAMINA_POTION_ID)) {
            buyList.add(new d(STAMINA_POTION_ID, 2, 28207));
        }

        if (!Bank.contains(COINS_ID)) {
            buyList.add(new d(COINS_ID, 10, 19124));
        }

        if (!Bank.contains(GRACEFUL_GLOVES_ID)) {
            buyList.add(new d(GRACEFUL_GLOVES_ID, 10, 29111));
        }

        if (!Bank.contains(LEATHER_GLOVES_ID)) {
            buyList.add(new d(LEATHER_GLOVES_ID, 10, 29111));
        }

        if (!Bank.contains(LEATHER_BOOTS_ID)) {
            buyList.add(new d(LEATHER_BOOTS_ID, 10, 29111));
        }

        if (!Bank.contains(LEATHER_BODY_ID)) {
            buyList.add(new d(LEATHER_BODY_ID, 10, 29111));
        }

        // Check summer pie quantity
        if (Bank.contains(SUMMER_PIE_ID)) {
            if (Bank.contains(SUMMER_PIE_ID) && Bank.getFirst(SUMMER_PIE_ID).getQuantity() < 10) {
                buyList.add(new d(SUMMER_PIE_ID, 74, 16126));
            }
        }

        // Check graceful legs quantity
        if (Bank.contains(GRACEFUL_LEGS_ID)) {
            if (Bank.contains(GRACEFUL_LEGS_ID) && Bank.getFirst(GRACEFUL_LEGS_ID).getQuantity() < 10) {
                buyList.add(new d(GRACEFUL_LEGS_ID, 10, 15095));
            }
        }

        if (!Bank.contains(28160)) {
            buyList.add(new d(28160, 1, 28033));
        }

        if (!Bank.contains(GRACEFUL_BOOTS_ID)) {
            buyList.add(new d(GRACEFUL_BOOTS_ID, 20, j.cf));
        }
    }
}
