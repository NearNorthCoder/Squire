package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import net.unethicalite.api.widgets.Dialog;

/**
 * Trains Thieving by pickpocketing NPCs and stealing from stalls.
 * Supports multiple training methods based on thieving level.
 */
public class ThievingTrainingStep implements ac {

    // Item IDs
    private static final int DODGY_NECKLACE_ID = 21143;
    private static final int WINE_OF_ZAMORAK_ID = 21146;
    private static final int CABBAGE_SEED_ID = 5319;
    private static final int LOBSTER_ID = 25645;
    private static final int GLOVES_OF_SILENCE_ID = 30587;
    private static final int JUG_OF_WINE_ID = 30681;

    // Food/healing IDs
    private static final int CAKE_ID = 32639;
    private static final int BREAD_ID = 31995;

    // Thieving level thresholds
    private static final int LEVEL_PICKPOCKET_MEN = 1;
    private static final int LEVEL_TEA_STALL = 5;
    private static final int LEVEL_MASTER_FARMER = 38;
    private static final int TARGET_THIEVING_LEVEL = 55;

    // Training locations
    public static final WorldPoint MEN_LOCATION = new WorldPoint(32492, 28116, 0);
    public static final WorldPoint TEA_STALL_LOCATION = new WorldPoint(20130, 19826, 0);
    public static WorldPoint masterFarmerLocation = new WorldPoint(0, 0, 0);
    public static WorldPoint currentTrainingLocation = new WorldPoint(0, 0, 0);
    public static WorldPoint targetLocation = new WorldPoint(0, 0, 0);

    // Configuration
    public static final WorldArea STUNNED_SAFE_ZONE = new WorldArea(19454, 28519, 14, 25, 0);
    public static final WorldPoint POINT_1 = new WorldPoint(32303, 19707, 0);
    public static final WorldPoint POINT_2 = new WorldPoint(28414, 19775, 0);
    public static final WorldPoint POINT_3 = new WorldPoint(31929, 31806, 0);
    public static final WorldPoint POINT_4 = new WorldPoint(28363, 32447, 0);
    public static final WorldPoint POINT_5 = new WorldPoint(26615, 19823, 0);
    public static final WorldPoint POINT_6 = new WorldPoint(32506, 32622, 0);

    // Items to drop (seeds and junk)
    public static final String[] ITEMS_TO_DROP = {
            "Onion seed", "Marigold seed", "Cabbage seed", "Jute seed",
            "Potato seed", "Tomato seed", "Nasturtium seed", "Holy handegg",
            "Peaceful handegg", "Chaotic handegg", "Sweetcorn seed", "Woad seed",
            "Redberry seed", "Jangerberry seed", "Tarromin seed", "Rosemary seed",
            "Strawberry seed", "Hammerstone seed", "Asgarnian seed", "Yanillian seed",
            "Krandorian seed", "Wildblood seed", "Cadavaberry seed", "Dwellberry seed",
            "Poison ivy seed", "Guam seed", "Marrentill seed", "Harralander seed",
            "Mushroom spore", "Belladonna seed", "Cactus seed", "Potato cactus seed",
            "Jug"
    };

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 3;
    private static final int BANK_TIMEOUT_MS = 15357;
    private static final int MIN_HP_THRESHOLD = 4;
    private static final int MIN_HP_PERCENTAGE = 70;
    private static final int DISTANCE_THRESHOLD = 7;
    private static final int STUNNED_GRAPHIC = 245;

    // Buy quantities and prices
    private static final int BUY_DODGY_NECKLACE_QUANTITY = 10;
    private static final int BUY_DODGY_NECKLACE_PRICE = 30455;
    private static final int BUY_WINE_QUANTITY = 10;
    private static final int BUY_WINE_PRICE = 30455;
    private static final int BUY_CABBAGE_SEED_QUANTITY = 40;
    private static final int BUY_CABBAGE_SEED_PRICE = 30387;
    private static final int BUY_LOBSTER_QUANTITY = 4;
    private static final int BUY_LOBSTER_PRICE = j.cf;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to mining";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing supplies, switching to BUYING";
    private static final String MSG_WEAR = "Wear";
    private static final String MSG_NAV_TO_FARMER = "Nav to farmer";
    private static final String MSG_PICKPOCKETING = "Pickpocketing";
    private static final String MSG_PICKPOCKET = "Pickpocket";
    private static final String MSG_STUNNED = "Stunned";
    private static final String MSG_DRINK = "Drink";
    private static final String MSG_NAV_TO_MEN = "Nav to men";
    private static final String MSG_OPEN_ALL = "Open-all";
    private static final String MSG_EAT = "Eat";
    private static final String MSG_NAV_TO_TEA = "Nav to tea tile";
    private static final String MSG_STEALING = "Stealing";
    private static final String MSG_STEAL_FROM = "Steal-from";
    private static final String MSG_DROPPING = "Dropping";
    private static final String MSG_DROP = "Drop";
    private static final String SKILL_NAME = "Thieving";

    // NPC names
    private static final String NPC_MASTER_FARMER = "Master Farmer";
    private static final String NPC_MAN = "Man";
    private static final String OBJECT_TEA_STALL = "Tea stall";
    private static final String ITEM_JUG = "Jug";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;
    static long lastStunTime;
    static int failCount;
    static int thiefType;  // Type of thieving activity

    static {
        itemsToBuy = new ArrayList<>();
        lastStunTime = System.currentTimeMillis();
        failCount = 0;
        thiefType = 1;
    }

    /**
     * Populates the shopping list with supplies for thieving.
     */
    public static void populateShoppingList() {
        // Dodgy necklace
        if (!Bank.contains(DODGY_NECKLACE_ID)) {
            itemsToBuy.add(new d(DODGY_NECKLACE_ID, BUY_DODGY_NECKLACE_QUANTITY, BUY_DODGY_NECKLACE_PRICE));
        }

        // Wine of Zamorak
        if (!Bank.contains(WINE_OF_ZAMORAK_ID)) {
            itemsToBuy.add(new d(WINE_OF_ZAMORAK_ID, BUY_WINE_QUANTITY, BUY_WINE_PRICE));
        }

        // Cabbage seed
        if (!Bank.contains(CABBAGE_SEED_ID)) {
            itemsToBuy.add(new d(CABBAGE_SEED_ID, BUY_CABBAGE_SEED_QUANTITY, BUY_CABBAGE_SEED_PRICE));
        }

        // Lobster
        if (!Bank.contains(LOBSTER_ID)) {
            itemsToBuy.add(new d(LOBSTER_ID, BUY_LOBSTER_QUANTITY, BUY_LOBSTER_PRICE));
        }

        // Gloves of silence (if high enough level)
        if (Skills.getLevel(Skill.THIEVING) >= LEVEL_MASTER_FARMER) {
            if (!Bank.contains(JUG_OF_WINE_ID)) {
                itemsToBuy.add(new d(JUG_OF_WINE_ID, 15307, 20));
            }

            if (!Bank.contains(GLOVES_OF_SILENCE_ID)) {
                itemsToBuy.add(new d(GLOVES_OF_SILENCE_ID, 44, 22081));
            }
        }
    }

    /**
     * Main training execution method.
     */
    public static void train() {
        // Handle GE buying
        if (isBuying) {
            AccBuilderSotf.c = MSG_BUYING_ITEMS;
            b.a(itemsToBuy);

            if (itemsToBuy.size() < 1) {
                System.out.println(MSG_FINISHED_BUYING);
                isBuying = false;
            }
        }

        if (!isBuying) {
            if (!hasRequiredSupplies() && e.j(failCount) < 1) {
                handleBanking();
            }

            // Drop unwanted items
            if (Inventory.isFull()) {
                Inventory.getAll(ITEMS_TO_DROP).forEach(item -> item.interact(MSG_DROP));
            }

            // Equip gloves of silence if available
            if (!Inventory.isFull()) {
                if (Inventory.contains(JUG_OF_WINE_ID) && !Equipment.contains(GLOVES_OF_SILENCE_ID)) {
                    if (Inventory.contains(GLOVES_OF_SILENCE_ID)) {
                        Inventory.getFirst(GLOVES_OF_SILENCE_ID).interact(MSG_WEAR);
                        Time.sleepTicks(TICK_DELAY_SHORT);
                    }
                }
            }

            // Train based on level
            if (hasRequiredSupplies() && e.j(failCount) != 0) {
                int thievingLevel = Skills.getLevel(Skill.THIEVING);

                if (thievingLevel >= LEVEL_MASTER_FARMER) {
                    pickpocketMasterFarmer();
                } else if (thievingLevel >= LEVEL_TEA_STALL && thievingLevel < LEVEL_MASTER_FARMER) {
                    stealFromTeaStall();
                } else {
                    pickpocketMen();
                }
            }
        }
    }

    /**
     * Handles banking operations.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();
        if (nearestBank == null || nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_BANK;
            a.a(nearestBank);
            return;
        }

        if (!Bank.isOpen()) {
            a.a();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit items
        if (Inventory.getAll().size() > 0) {
            Bank.depositInventory();
            Time.sleepTicks(TICK_DELAY_LONG);
        }

        // Check for supplies
        if (Skills.getLevel(Skill.THIEVING) >= LEVEL_MASTER_FARMER) {
            if (!Bank.contains(GLOVES_OF_SILENCE_ID) || !Bank.contains(JUG_OF_WINE_ID)) {
                populateShoppingList();
                System.out.println(MSG_MISSING_SUPPLIES);
                isBuying = true;
                return;
            }
        }

        // Withdraw supplies
        withdrawSupplies();
    }

    /**
     * Withdraws thieving supplies from the bank.
     */
    private static void withdrawSupplies() {
        int thievingLevel = Skills.getLevel(Skill.THIEVING);

        if (thievingLevel < LEVEL_TEA_STALL) {
            a.a(WINE_OF_ZAMORAK_ID, 10);
            a.a(DODGY_NECKLACE_ID, 10);
            a.a(CABBAGE_SEED_ID, 13);
        }

        if (thievingLevel >= LEVEL_TEA_STALL && thievingLevel < LEVEL_MASTER_FARMER) {
            a.a(DODGY_NECKLACE_ID, 10);
        }

        if (thievingLevel >= LEVEL_MASTER_FARMER) {
            a.a(GLOVES_OF_SILENCE_ID, 10);
            a.a(JUG_OF_WINE_ID, 20);
            a.a(32235, 20);
        }

        failCount += 1;
    }

    /**
     * Checks if the player has required supplies.
     */
    private static boolean hasRequiredSupplies() {
        int thievingLevel = Skills.getLevel(Skill.THIEVING);

        if (thievingLevel < LEVEL_TEA_STALL) {
            int[] required = {CABBAGE_SEED_ID, WINE_OF_ZAMORAK_ID, DODGY_NECKLACE_ID};
            if (Inventory.contains(required[0]) && Inventory.contains(required[1]) && thiefType != 0) {
                return true;
            }
            return false;
        }

        if (thievingLevel >= LEVEL_TEA_STALL && thievingLevel < LEVEL_MASTER_FARMER) {
            return true;
        }

        if (thievingLevel >= LEVEL_MASTER_FARMER) {
            if (Inventory.contains(JUG_OF_WINE_ID)) {
                if (!Equipment.contains(GLOVES_OF_SILENCE_ID) && Inventory.contains(GLOVES_OF_SILENCE_ID)) {
                    return true;
                }
            }
        }

        if (Inventory.getFreeSlots() > 7) {
            failCount += 1;
        }

        return false;
    }

    /**
     * Pickpockets master farmers.
     */
    private static void pickpocketMasterFarmer() {
        if (Players.getLocal().getWorldLocation().distanceTo(masterFarmerLocation) > DISTANCE_THRESHOLD) {
            AccBuilderSotf.c = MSG_NAV_TO_FARMER;
            Movement.walkTo(masterFarmerLocation);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(masterFarmerLocation) <= DISTANCE_THRESHOLD) {
            if (!STUNNED_SAFE_ZONE.contains(Players.getLocal().getWorldLocation())) {
                Movement.walkTo(masterFarmerLocation);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }

            if (Dialog.canLevelUpContinue()) {
                Dialog.close();
            }

            if (Players.getLocal().getGraphic() != STUNNED_GRAPHIC) {
                AccBuilderSotf.c = MSG_PICKPOCKETING;

                var farmer = NPCs.getNearest(NPC_MASTER_FARMER);
                if (farmer != null && Players.getLocal().getInteracting() == null) {
                    farmer.interact(MSG_PICKPOCKET);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }
            }

            if (Players.getLocal().getGraphic() == STUNNED_GRAPHIC) {
                AccBuilderSotf.c = MSG_STUNNED;

                // Drink wine if HP is low
                if (e.w() < MIN_HP_PERCENTAGE || Skills.getBoostedLevel(Skill.HITPOINTS) <= MIN_HP_THRESHOLD) {
                    if (Inventory.contains(JUG_OF_WINE_ID)) {
                        Inventory.getFirst(JUG_OF_WINE_ID).interact(MSG_DRINK);
                        Time.sleepTicks(TICK_DELAY_SHORT);
                    }
                }

                // Drop jugs
                if (Inventory.contains(ITEM_JUG)) {
                    Inventory.getAll(ITEM_JUG).stream().forEach(item -> item.interact(MSG_DROP));
                }

                // Drop seeds
                Inventory.getAll(ITEMS_TO_DROP).forEach(item -> item.interact(MSG_DROP));
            }
        }
    }

    /**
     * Steals from tea stalls.
     */
    private static void stealFromTeaStall() {
        if (!Players.getLocal().getWorldLocation().equals(TEA_STALL_LOCATION)) {
            AccBuilderSotf.c = MSG_NAV_TO_TEA;

            if (Dialog.isOpen()) {
                Dialog.close();
            }

            Movement.walkTo(TEA_STALL_LOCATION);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        if (Players.getLocal().getWorldLocation().equals(TEA_STALL_LOCATION)) {
            // Open coin pouches
            if (Inventory.contains(32653)) {
                Inventory.getFirst(32653).interact(MSG_OPEN_ALL);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }

            // Steal from stall
            if (!Inventory.isFull()) {
                AccBuilderSotf.c = MSG_STEALING;

                var teaStall = TileObjects.getNearest(OBJECT_TEA_STALL);
                if (teaStall != null) {
                    teaStall.interact(MSG_STEAL_FROM);
                    Time.sleepUntil(() -> TileObjects.getNearest(OBJECT_TEA_STALL) == null, 10000);
                }
            }

            // Drop items when full
            if (Inventory.isFull()) {
                AccBuilderSotf.c = MSG_DROPPING;

                Inventory.getAll(CAKE_ID, BREAD_ID).forEach(item -> item.interact(MSG_DROP));

                if (Inventory.contains(CABBAGE_SEED_ID)) {
                    Inventory.getAll(CABBAGE_SEED_ID).forEach(item -> item.interact(MSG_DROP));
                }
            }
        }
    }

    /**
     * Pickpockets men.
     */
    private static void pickpocketMen() {
        if (Players.getLocal().getWorldLocation().distanceTo(MEN_LOCATION) > DISTANCE_THRESHOLD) {
            AccBuilderSotf.c = MSG_NAV_TO_MEN;
            Movement.walkTo(MEN_LOCATION);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(MEN_LOCATION) <= DISTANCE_THRESHOLD) {
            if (Dialog.canLevelUpContinue()) {
                Dialog.close();
            }

            // Open coin pouches
            if (System.currentTimeMillis() - lastStunTime >= 0) {
                AccBuilderSotf.c = MSG_PICKPOCKETING;

                if (Inventory.contains(32653) && Inventory.getFirst(32653).getQuantity() >= 25) {
                    Inventory.getFirst(32653).interact(MSG_OPEN_ALL);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }

                var man = NPCs.getNearest(NPC_MAN);
                if (man != null && Players.getLocal().getInteracting() == null && !Players.getLocal().isMoving()) {
                    man.interact(MSG_PICKPOCKET);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }
            }

            if (System.currentTimeMillis() - lastStunTime <= 0) {
                AccBuilderSotf.c = MSG_STUNNED;

                // Eat food if HP is low
                if (e.w() < 30.0 || Skills.getBoostedLevel(Skill.HITPOINTS) <= MIN_HP_THRESHOLD) {
                    if (Inventory.contains(CABBAGE_SEED_ID)) {
                        Inventory.getFirst(CABBAGE_SEED_ID).interact(MSG_EAT);
                        Time.sleepTicks(TICK_DELAY_SHORT);
                    }
                }
            }
        }
    }

    @Override
    public String ag() {
        return SKILL_NAME;
    }

    @Override
    public boolean ah() {
        return Skills.getLevel(Skill.THIEVING) >= TARGET_THIEVING_LEVEL;
    }

    @Override
    public boolean ae() {
        return false;
    }

    @Override
    public int af() {
        train();
        return 9;  // Priority
    }
}
