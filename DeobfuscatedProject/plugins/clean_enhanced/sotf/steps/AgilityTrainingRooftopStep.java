package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
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
import gg.squire.sotf.framework.*;

/**
 * Agility training quest step for SOTF plugin.
 *
 * This step trains agility from level 5 onwards using various rooftop agility courses:
 * - Gnome Stronghold course (levels 1-35)
 * - Draynor course (levels 10-40)
 * - Canafis course (levels 40-60)
 * - Ardougne course (levels 60+)
 *
 * Features:
 * - Automatically handles banking and withdrawing supplies
 * - Picks up marks of grace when detected
 * - Manages stamina potions and food
 * - Creates shopping list for missing items
 * - Equips graceful outfit for weight reduction
 */
public class AgilityTrainingRooftopStep implements QuestStep {

    // Quest supplies tracking
    public static List<d> missingSupplies = new ArrayList<>();
    public static boolean isBuyingSupplies = false;

    // Static course areas
    public static int potionItemId = 12629; // Stamina potion (2)
    public static int foodItemId = 7218; // Summer pie
    private static WorldArea gnomeCourseNavArea1;
    private static WorldArea gnomeCourseNavArea2;
    private static WorldArea gnomeCourseNavArea3;
    private static WorldPoint gnomeCourseStartPoint;

    // Item IDs
    private static final int GRACEFUL_HOOD = 11850;
    private static final int GRACEFUL_CAPE = 11852;
    private static final int GRACEFUL_TOP = 11854;
    private static final int GRACEFUL_LEGS = 11856;
    private static final int GRACEFUL_GLOVES = 11858;
    private static final int GRACEFUL_BOOTS = 11860;
    private static final int SUMMER_PIE = 7218;
    private static final int STAMINA_POTION_4 = 12625;
    private static final int STAMINA_POTION_2 = 12629;
    private static final int MARK_OF_GRACE = 11849;

    static {
        // Initialize Gnome course areas
        gnomeCourseNavArea1 = new WorldArea(2470, 3436, 17, 12, 0);
        gnomeCourseNavArea2 = new WorldArea(2470, 3436, 17, 12, 1);
        gnomeCourseNavArea3 = new WorldArea(2470, 3436, 17, 12, 2);
        gnomeCourseStartPoint = new WorldPoint(2476, 3437, 0);
    }

    /**
     * Returns the skill name for this training step.
     * @return "Agility"
     */
    @Override
    public String getName() {
        return "Agility";
    }

    /**
     * Checks if this step is complete.
     * @return false - agility training continues indefinitely
     */
    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    /**
     * Checks if this step should run.
     * @return true if agility level is 5 or higher
     */
    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.AGILITY) >= 5;
    }

    /**
     * Main execution method for the agility training step.
     * @return tick delay (100)
     */
    @Override
    public int execute() {
        try {
            runAgilityTraining();
        } catch (Exception e) {
            // Silently catch exceptions to prevent script crashes
        }
        return 100;
    }

    /**
     * Main agility training logic.
     * Coordinates buying supplies, banking, and running the appropriate agility course.
     */
    public static void runAgilityTraining() {
        // Handle buying missing supplies
        if (isBuyingSupplies) {
            AccBuilderSotf.c = "Buying items";
            b.a(missingSupplies);
            if (missingSupplies.size() < 1) {
                System.out.println("Finished buying items, switching back to agility");
                isBuyingSupplies = false;
            }
        }

        // Only proceed if not buying and agility level is 5+
        if (!isBuyingSupplies && Skills.getLevel(Skill.AGILITY) >= 5) {
            // Check if we have required supplies
            if (!hasRequiredSupplies()) {
                handleBanking();
            }

            // Run agility course if we have supplies
            if (hasRequiredSupplies()) {
                handleCourseExecution();
            }
        }
    }

    /**
     * Handles banking operations including navigation, depositing, and withdrawing items.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();

        // Navigate to bank if not there
        if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Navigating to bank";

            // Special handling for Gnome course area - need to exit first
            WorldArea gnomeArea = new WorldArea(2470, 3436, 4, 3, 0);
            if (gnomeArea.contains(Players.getLocal().getWorldLocation())) {
                WorldPoint exitPoint = new WorldPoint(2473, 3438, 0);
                if (Players.getLocal().getWorldLocation().distanceTo(exitPoint) > 3) {
                    Movement.walkTo(exitPoint);
                    Time.sleepTicks(1);
                }
            }

            BankingUtil.navigateToBank(nearestBank);
        }

        // Handle banking
        if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Handling banking";

            // Open bank
            if (!Bank.isOpen()) {
                BankingUtil.openNearestBank();
                Time.sleepUntil(() -> Bank.isOpen(), 5000);
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

            // Check if we have all required items in bank
            int[] requiredItems = {11850, 11852, 11854, 11856, 32673, 32665, 11860, 7218, 12625, 12629};
            if (!GameStateUtil.randomRange(requiredItems)) {
                addMissingItemsToShoppingList();
                System.out.println("We are missing quest supplies, switching to BUYING");
                isBuyingSupplies = true;
                return;
            }

            // Withdraw required items
            if (GameStateUtil.randomRange(requiredItems)) {
                withdrawSupplies();
            }
        }
    }

    /**
     * Withdraws required supplies from the bank based on agility level.
     */
    private static void withdrawSupplies() {
        // Withdraw and equip gear
        BankingUtil.withdrawItem(11858, 1); // Graceful gloves
        BankingUtil.withdrawItem(11860, 1); // Graceful boots
        BankingUtil.withdrawItem(11854, 1); // Graceful top
        BankingUtil.withdrawItem(11856, 1); // Graceful legs
        BankingUtil.withdrawItem(11850, 1); // Graceful hood
        BankingUtil.withdrawItem(11852, 1); // Graceful cape
        BankingUtil.withdrawItem(13579, 1); // Weight-reducing top

        // Check for stamina potions and withdraw backup if needed
        if (!Inventory.contains(11858) && !Equipment.contains(11858)) {
            if (!Bank.contains(11858)) {
                BankingUtil.withdrawItem(13579, 1);
            }
        }

        BankingUtil.withdrawItem(32665, 1);

        // Equip items
        GameStateUtil.equipItem(11858); // Gloves
        GameStateUtil.equipItem(11860); // Boots
        GameStateUtil.equipItem(11854); // Top
        GameStateUtil.equipItem(11856); // Legs
        GameStateUtil.equipItem(11850); // Hood
        Time.sleepTicks(1);
        GameStateUtil.equipItem(13579);
        GameStateUtil.equipItem(11852); // Cape
        GameStateUtil.equipItem(11852);
        GameStateUtil.equipItem(13579);
        Time.sleepTicks(3);

        // Reopen bank if needed
        if (!Bank.isOpen()) {
            BankingUtil.openNearestBank();
            Time.sleepTicks(6);
        }

        // Withdraw supplies based on level
        if (Bank.isOpen()) {
            int agilityLevel = Skills.getLevel(Skill.AGILITY);

            if (agilityLevel < 40) {
                BankingUtil.withdrawItem(11850, 9);
                BankingUtil.withdrawItem(11852, 9);
                BankingUtil.withdrawItem(11860, 9);
                BankingUtil.withdrawItem(11854, 9);
                BankingUtil.withdrawItemsUntilFound(ItemIdArrays.RING_OF_WEALTH, 1);
                BankingUtil.withdrawItem(12629, 1);
                BankingUtil.withdrawItem(32665, 5);
                BankingUtil.withdrawItem(7218, 15);
            } else if (agilityLevel >= 40) {
                BankingUtil.withdrawItem(11850, 9);
                BankingUtil.withdrawItem(11860, 9);
                BankingUtil.withdrawItem(12625, 9);
                BankingUtil.withdrawItemsUntilFound(ItemIdArrays.RING_OF_WEALTH, 1);
                BankingUtil.withdrawItem(12629, 1);
                BankingUtil.withdrawItem(32665, 8);
                BankingUtil.withdrawItem(7218, 9);
            }
        }
    }

    /**
     * Adds missing items to the shopping list when they're not available in the bank.
     */
    public static void addMissingItemsToShoppingList() {
        if (!Bank.contains(11856)) {
            missingSupplies.add(new ShopItem(11856, 1, 12668));
        }
        if (!Bank.contains(32665)) {
            missingSupplies.add(new ShopItem(32665, 2, 28548));
        }
        if (!Bank.contains(12629)) {
            missingSupplies.add(new ShopItem(12629, 2, 28548));
        }
        if (!Bank.contains(11850)) {
            missingSupplies.add(new ShopItem(11850, 9, 28531));
        }
        if (!Bank.contains(11860)) {
            missingSupplies.add(new ShopItem(11860, 9, 28531));
        }
        if (!Bank.contains(11854)) {
            missingSupplies.add(new ShopItem(11854, 9, 28531));
        }
        if (!Bank.contains(11852)) {
            missingSupplies.add(new ShopItem(11852, 9, 28531));
        }

        // Check for summer pie quantity
        if (Bank.contains(7218)) {
            if (Bank.getFirst(7218).getQuantity() < 9) {
                missingSupplies.add(new ShopItem(foodItemId, 60, 27131));
            }
        }

        // Check for stamina potion quantity
        if (Bank.contains(12625)) {
            if (Bank.getFirst(12625).getQuantity() < 9) {
                missingSupplies.add(new ShopItem(12625, 9, 14848));
            }
        }

        if (!Bank.contains(32651)) {
            missingSupplies.add(new ShopItem(32651, 1, 25805));
        }
        if (!Bank.contains(32665)) {
            missingSupplies.add(new ShopItem(32665, 20, Constants.DEFAULT_GE_TIMEOUT));
        }
    }

    /**
     * Handles course execution including consumables and selecting appropriate course.
     */
    private static void handleCourseExecution() {
        // Drop empty vials
        if (Inventory.contains("Vial")) {
            Inventory.getFirst("Vial").interact("Drop");
        }

        // Drink stamina potion if run energy is low
        if (Inventory.contains(ItemIdArrays.STAMINA_POTIONS) && Movement.getRunEnergy() < 60) {
            Inventory.getFirst(ItemIdArrays.STAMINA_POTIONS).interact("Drink");
            Time.sleepTicks(1);
        }

        // Eat food if health is low
        if (Combat.getMissingHealth() > 20) {
            if (Inventory.contains(7218)) {
                Inventory.getFirst(7218).interact("Eat");
                Time.sleepTicks(2);
            }
        }

        // Enable run if energy is sufficient
        if (Movement.getRunEnergy() > 29 && !Movement.isRunEnabled()) {
            Movement.toggleRun();
        }

        // Run appropriate agility course based on level
        int agilityLevel = Skills.getLevel(Skill.AGILITY);

        if (agilityLevel < 18) {
            runGnomeCourse();
        } else if ((GameStateUtil.getVarbit(4275) < 60 || GameStateUtil.getVarbit(4276) >= 5) && agilityLevel >= 18 && agilityLevel < 60) {
            runDraynorCourse();
        } else if (GameStateUtil.getVarbit(4275) >= 60 && GameStateUtil.getVarbit(4276) < 5) {
            if (agilityLevel >= 18 && agilityLevel < 40) {
                runDraynorCourse();
            }
            if (agilityLevel >= 40 && agilityLevel < 60) {
                runCanafisCourse();
            }
        }

        if (agilityLevel >= 60) {
            runArdougneCourse();
        }
    }

    /**
     * Checks if player has all required supplies in inventory/equipment.
     * @return true if all required items are present
     */
    private static boolean hasRequiredSupplies() {
        int agilityLevel = Skills.getBoostedLevel(Skill.AGILITY);

        if (agilityLevel >= 40) {
            // Higher level requirements (40+)
            return Inventory.contains(11850) // Graceful hood
                && Inventory.contains(12625) // Stamina potion (4)
                && Inventory.contains(7218) // Summer pie
                && (Inventory.contains(item -> item.getName().contains("passage"))
                    || Equipment.contains(item -> item.getName().contains("passage")))
                && (Inventory.contains(ItemIdArrays.RING_OF_WEALTH) || Equipment.contains(ItemIdArrays.RING_OF_WEALTH));
        } else {
            // Lower level requirements (below 40)
            return Inventory.contains(11850) // Graceful hood
                && Inventory.contains(11854) // Graceful top
                && Inventory.contains(11852) // Graceful cape
                && (Inventory.contains(item -> item.getName().contains("passage"))
                    || Equipment.contains(item -> item.getName().contains("passage")))
                && (Inventory.contains(ItemIdArrays.RING_OF_WEALTH) || Equipment.contains(ItemIdArrays.RING_OF_WEALTH));
        }
    }

    /**
     * Runs the Gnome Stronghold agility course.
     */
    private static void runGnomeCourse() {
        // Define course obstacle areas
        WorldArea logBalanceArea = new WorldArea(2473, 3435, 9, 6, 0);
        WorldArea climbNetArea = new WorldArea(2473, 3426, 11, 6, 0);
        WorldArea treeBranch1Area = new WorldArea(2472, 3420, 11, 8, 1);
        WorldArea balancingRopeArea = new WorldArea(2483, 3418, 20, 5, 1);
        WorldArea treeBranch2Area = new WorldArea(2486, 3419, 9, 8, 2);
        WorldArea climbNetDownArea = new WorldArea(2483, 3421, 7, 6, 0);
        WorldArea pipeArea = new WorldArea(2484, 3430, 24, 14, 0);
        WorldArea courseStartArea = new WorldArea(2473, 3435, 62, 6, 0);

        // Navigate to course if not there
        if (!gnomeCourseNavArea1.contains(Players.getLocal().getWorldLocation())
            && !gnomeCourseNavArea2.contains(Players.getLocal().getWorldLocation())
            && !gnomeCourseNavArea3.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to gnome course";
            GameStateUtil.formatTime(gnomeCourseStartPoint);
            Time.sleepTicks(1);
        }

        // Execute course obstacles when player is not animating
        if ((!gnomeCourseNavArea1.contains(Players.getLocal().getWorldLocation())
            || !gnomeCourseNavArea2.contains(Players.getLocal().getWorldLocation())
            || gnomeCourseNavArea3.contains(Players.getLocal().getWorldLocation()))
            && Players.getLocal().getAnimation() == -1
            && !Players.getLocal().isMoving()) {

            if (courseStartArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Crossing log";
                TileObjects.getNearest("Log balance").interact("Walk-across");
                Time.sleepTicks(2);
            }

            if (climbNetArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Climbing net";
                TileObjects.getNearest("Obstacle net").interact("Climb-over");
                Time.sleepTicks(2);
            }

            if (treeBranch1Area.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Climbing branch";
                TileObjects.getNearest("Tree branch").interact("Climb");
                Time.sleepTicks(2);
            }

            if (balancingRopeArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Crossing rope";
                TileObjects.getNearest("Balancing rope").interact("Walk-on");
                Time.sleepTicks(5);
            }

            if (treeBranch2Area.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Climbing down";
                TileObjects.getNearest("Tree branch").interact("Climb-down");
                Time.sleepTicks(4);
            }

            if (climbNetDownArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Climbing net";
                TileObjects.getNearest("Obstacle net").interact("Climb-over");
                Time.sleepTicks(3);
            }

            if (pipeArea.contains(Players.getLocal().getWorldLocation())) {
                AccBuilderSotf.c = "Crossing pipe";
                TileObjects.getNearest("Obstacle pipe").interact("Squeeze-through");
                Time.sleepTicks(4);
            }
        }
    }

    /**
     * Runs the Draynor rooftop agility course.
     */
    private static void runDraynorCourse() {
        WorldArea navArea1 = new WorldArea(3102, 3279, 137, 62, 1);
        WorldArea navArea2 = new WorldArea(3102, 3279, 137, 62, 2);
        WorldArea navArea3 = new WorldArea(3102, 3279, 137, 62, 3);
        WorldArea wallArea = new WorldArea(3103, 3279, 17, 1, 0);
        WorldArea clothesLineArea = new WorldArea(3097, 3277, 9, 1, 3);
        WorldArea gapArea1 = new WorldArea(3095, 3273, 45, 11, 3);
        WorldArea gapArea2 = new WorldArea(3088, 3267, 31, 20, 3);
        WorldArea gapArea3 = new WorldArea(3087, 3273, 17, 1, 3);
        WorldArea gapArea4 = new WorldArea(3092, 3266, 22, 7, 3);
        WorldArea wallBalanceArea = new WorldArea(3089, 3261, 11, 1, 3);
        WorldArea gapArea5 = new WorldArea(3087, 3256, 7, 11, 3);
        WorldArea gapArea6 = new WorldArea(3102, 3261, 14, 1, 3);

        WorldPoint startPoint = new WorldPoint(3103, 3278, 0);

        // Navigate to course start
        if (!navArea1.contains(Players.getLocal().getWorldLocation())
            && !navArea2.contains(Players.getLocal().getWorldLocation())
            && !navArea3.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to start";

            if (Bank.isOpen()) {
                Bank.close();
            }
            if (Dialog.isOpen()) {
                Dialog.close();
            }

            Movement.walkTo(new WorldPoint(3236, 14746, 0));
            Time.sleepTicks(1);
        }

        // Handle marks of grace and obstacles when not animating
        if (Players.getLocal().getAnimation() == -1 && !Players.getLocal().isMoving()) {
            // Pick up marks of grace if found
            TileItem markOfGrace = TileItems.getNearest("Mark of grace");
            if (markOfGrace != null && !isMarkInObstacleArea()) {
                AccBuilderSotf.c = "Taking mark";
                System.out.println("Found mark on ground");
                markOfGrace.interact("Take");
                Time.sleepTicks(3);
            }

            // Execute course obstacles
            if (!isMarkInObstacleArea()) {
                if (wallArea.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Starting course";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Rough wall").interact("Climb");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (clothesLineArea.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Crossing clothes line";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Clothes line").interact("Cross");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea1.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Leaping";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Gap").interact("Leap");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (wallBalanceArea.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Balancing";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Wall").interact("Balance");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea2.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Jumping gap";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Gap").interact("Leap");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea3.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Jumping gap 2";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    int[] gapId = {14762};
                    TileObjects.getNearest(gapId).interact("Leap");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea4.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Jumping gap 3";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    int[] gapId = {14759};
                    TileObjects.getNearest(gapId).interact("Leap");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea5.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Hurdle roof";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    int[] gapId = {31322};
                    TileObjects.getNearest(gapId).interact("Hurdle");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }

                if (gapArea6.contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = "Finishing course";
                    int startXp = Skills.getExperience(Skill.AGILITY);
                    TileObjects.getNearest("Edge").interact("Jump-off");
                    Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                    Time.sleepTicks(1);
                }
            }
        }
    }

    /**
     * Runs the Canafis rooftop agility course.
     */
    private static void runCanafisCourse() {
        WorldArea navArea1 = new WorldArea(3501, 3489, 56, 55, 0);
        WorldArea navArea2 = new WorldArea(3501, 3489, 56, 55, 1);
        WorldArea navArea3 = new WorldArea(3501, 3489, 56, 55, 2);
        WorldArea navArea4 = new WorldArea(3501, 3489, 56, 55, 3);

        WorldArea tallTreeArea = new WorldArea(3507, 3489, 11, 9, 2);
        WorldArea gap1Area = new WorldArea(3496, 3503, 15, 8, 2);
        WorldArea gap2Area = new WorldArea(3485, 3498, 11, 7, 2);
        WorldArea gap3Area = new WorldArea(3478, 3491, 45, 1, 3);
        WorldArea gap4Area = new WorldArea(3510, 3491, 9, 24, 3);
        WorldArea gap5Area = new WorldArea(3532, 3483, 18, 14, 3);
        WorldArea gap6Area = new WorldArea(3546, 3483, 14, 1, 2);

        WorldPoint startPoint = new WorldPoint(3508, 3489, 0);

        // Close dialog if open
        if (Dialog.isOpen()) {
            Dialog.close();
        }

        // Navigate to course
        if (!navArea1.contains(Players.getLocal().getWorldLocation())
            && !navArea2.contains(Players.getLocal().getWorldLocation())
            && !navArea3.contains(Players.getLocal().getWorldLocation())
            && !navArea4.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to canafis course";
            Movement.walkTo(startPoint);
            Time.sleepTicks(1);
        }

        // Start course
        if (navArea1.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(startPoint) > 6) {
                AccBuilderSotf.c = "Nav to start";
                Movement.walkTo(startPoint);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(startPoint) <= 6) {
                AccBuilderSotf.c = "Starting course";
                int startXp = Skills.getExperience(Skill.AGILITY);
                TileObjects.getNearest("Tall tree").interact("Climb");
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                Time.sleepTicks(1);
            }
        }

        // Pick up marks of grace
        TileItem markOfGrace = TileItems.getNearest("Mark of grace");
        if (markOfGrace != null && !isMarkInObstacleArea()) {
            AccBuilderSotf.c = "Taking mark";
            System.out.println("Found mark on ground");
            markOfGrace.interact("Take");
            Time.sleepTicks(3);
        }

        // Execute obstacles
        if (!isMarkInObstacleArea()) {
            executeAgilityObstacle(tallTreeArea, "Jumping gap 1", "Gap", new WorldPoint(3505, 3498, 2), 2);
            executeAgilityObstacle(gap1Area, "Jumping gap 2", "Gap", new WorldPoint(3498, 3504, 2), 2);
            executeAgilityObstacle(gap2Area, "Jumping gap 3", "Gap", new WorldPoint(3487, 3499, 2), 2);
            executeAgilityObstacle(gap3Area, "Jumping gap 4", "Gap", new WorldPoint(3478, 3492, 3), 2);
            executeAgilityObstacle(gap4Area, "Vaulting", "Pole-vault", new WorldPoint(3510, 3483, 3), 2);
            executeAgilityObstacle(gap5Area, "Jumping gap 5", "Gap", new WorldPoint(3532, 3486, 3), 2);
            executeAgilityObstacle(gap6Area, "Jumping gap 6", "Gap", new WorldPoint(3546, 3483, 2), 2);
        }
    }

    /**
     * Runs the Ardougne rooftop agility course.
     */
    private static void runArdougneCourse() {
        WorldArea navArea1 = new WorldArea(2670, 3297, 69, 69, 0);
        WorldArea navArea2 = new WorldArea(2670, 3297, 69, 69, 1);
        WorldArea navArea3 = new WorldArea(2670, 3297, 69, 69, 2);
        WorldArea navArea4 = new WorldArea(2670, 3297, 69, 69, 3);

        WorldArea wallArea = new WorldArea(2671, 3299, 11, 9, 3);
        WorldArea gap1Area = new WorldArea(2665, 3318, 15, 14, 3);
        WorldArea plankArea = new WorldArea(2660, 3318, 11, 7, 3);
        WorldArea gap2Area = new WorldArea(2653, 3314, 24, 1, 3);
        WorldArea gap3Area = new WorldArea(2653, 3300, 18, 9, 3);
        WorldArea balanceArea = new WorldArea(2656, 3297, 21, 1, 3);
        WorldArea gap4Area = new WorldArea(2668, 3297, 14, 1, 3);

        WorldPoint startPoint = new WorldPoint(2673, 3299, 0);

        // Close dialog if open
        if (Dialog.isOpen()) {
            Dialog.close();
        }

        // Navigate to course
        if (!navArea1.contains(Players.getLocal().getWorldLocation())
            && !navArea2.contains(Players.getLocal().getWorldLocation())
            && !navArea3.contains(Players.getLocal().getWorldLocation())
            && !navArea4.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = "Nav to ardougne course";
            Movement.walkTo(startPoint);
            Time.sleepTicks(1);
        }

        // Start course
        if (navArea1.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(startPoint) > 6) {
                AccBuilderSotf.c = "Nav to start";
                Movement.walkTo(startPoint);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(startPoint) <= 6) {
                AccBuilderSotf.c = "Starting course";
                int startXp = Skills.getExperience(Skill.AGILITY);
                TileObjects.getNearest("Wall").interact("Climb-up");
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                Time.sleepTicks(1);
            }
        }

        // Pick up marks of grace
        TileItem markOfGrace = TileItems.getNearest("Mark of grace");
        if (markOfGrace != null && !isMarkInObstacleArea()) {
            AccBuilderSotf.c = "Taking mark";
            System.out.println("Found mark on ground");
            markOfGrace.interact("Take");
            Time.sleepTicks(3);
        }

        // Execute obstacles
        if (!isMarkInObstacleArea()) {
            executeAgilityObstacle(wallArea, "Jumping gap 1", "Gap", new WorldPoint(2671, 3310, 3), 2);
            executeAgilityObstacle(gap1Area, "Cross rope", "Tightrope", new WorldPoint(2665, 3318, 3), 2);
            executeAgilityObstacle(plankArea, "Jumping gap 3", "Gap", new WorldPoint(2653, 3318, 3), 2);
            executeAgilityObstacle(gap2Area, "Jumping gap 4", "Gap", new WorldPoint(2653, 3314, 3), 2);
            executeAgilityObstacle(gap3Area, "Jumping Edge", "Gap", new WorldPoint(2656, 3300, 3), 2);
            executeAgilityObstacle(balanceArea, "Gap 6", "Gap", new WorldPoint(2665, 3297, 3), 2);
            executeAgilityObstacle(gap4Area, "Gap 7", "Gap", new WorldPoint(2668, 3297, 3), 2);
        }
    }

    /**
     * Executes an agility obstacle with location checking.
     * @param area The area containing the obstacle
     * @param statusMessage Status message to display
     * @param objectName Name of the obstacle object
     * @param location Expected location of the obstacle
     * @param maxDistance Maximum distance from expected location
     */
    private static void executeAgilityObstacle(WorldArea area, String statusMessage, String objectName,
                                               WorldPoint location, int maxDistance) {
        if (area.contains(Players.getLocal().getWorldLocation())) {
            TileObject obstacle = TileObjects.getNearest(obj ->
                obj.getName().contains(objectName) && obj.getWorldLocation().distanceTo(location) <= maxDistance
            );

            if (obstacle != null) {
                AccBuilderSotf.c = statusMessage;
                int startXp = Skills.getExperience(Skill.AGILITY);

                // Use appropriate action based on obstacle type
                String action = objectName.contains("Tightrope") ? "Cross" :
                               objectName.contains("Pole-vault") ? "Vault" : "Jump";

                obstacle.interact(action);
                Time.sleepTicks(GameStateUtil.randomRange(1, 2));
                Time.sleepUntil(() -> Skills.getExperience(Skill.AGILITY) > startXp, 12000);
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Checks if a mark of grace is in an obstacle area (and thus unreachable).
     * @return true if mark is in an obstacle area
     */
    private static boolean isMarkInObstacleArea() {
        // Define all obstacle areas where marks might spawn but be unreachable
        WorldArea[] obstacleAreas = {
            new WorldArea(3103, 3277, 15, 1, 0),
            new WorldArea(3097, 3277, 9, 1, 3),
            new WorldArea(3095, 3272, 45, 11, 3),
            new WorldArea(3088, 3267, 20, 5, 1),
            new WorldArea(3087, 3273, 9, 8, 3),
            new WorldArea(3092, 3266, 14, 15, 3),
            new WorldArea(3089, 3261, 17, 1, 3),
            new WorldArea(3087, 3256, 7, 7, 3),
            new WorldArea(3087, 3256, 9, 7, 3),
            new WorldArea(2470, 3436, 11, 9, 2),
            new WorldArea(2470, 3426, 11, 8, 2),
            new WorldArea(2472, 3420, 45, 11, 2),
            new WorldArea(2483, 3418, 9, 1, 3),
            new WorldArea(2486, 3419, 11, 7, 2),
            new WorldArea(2483, 3421, 22, 14, 3),
            new WorldArea(2484, 3430, 14, 1, 2),
            new WorldArea(3507, 3489, 1, 9, 3),
            new WorldArea(3496, 3503, 15, 14, 2),
            new WorldArea(3485, 3498, 11, 7, 2),
            new WorldArea(3478, 3491, 24, 1, 2),
            new WorldArea(3510, 3491, 14, 14, 2)
        };

        TileItem mark = TileItems.getNearest(MARK_OF_GRACE);
        if (mark != null) {
            System.out.println("Found mark on ground");
            for (WorldArea area : obstacleAreas) {
                if (area.contains(mark.getWorldLocation())
                    && area.contains(Players.getLocal().getWorldLocation())) {
                    return true;
                }
            }
        }

        return false;
    }
}
