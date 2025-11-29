package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/**
 * Trains Mining by mining various ore types.
 * Supports different pickaxe types and mining locations based on level.
 */
public class MiningTrainingStep implements ac {

    // Pickaxe IDs (from best to worst)
    public static final int RUNE_PICKAXE_ID = 1275;
    public static final int ADAMANT_PICKAXE_ID = 1271;
    public static final int MITHRIL_PICKAXE_ID = 1273;
    public static final int STEEL_PICKAXE_ID = 1269;
    public static final int IRON_PICKAXE_ID = 1267;
    public static final int BRONZE_PICKAXE_ID = 1265;

    // Ore rock IDs
    public static final int[] COPPER_ROCK_IDS = {8467, 8468, 31941, 31942, 31943};
    public static final int[] TIN_ROCK_IDS = {32291, 32639, 13387, 20196};
    public static final int[] IRON_ROCK_IDS = {14886};

    // Ore item IDs
    public static final int COPPER_ORE_ID = 19454;
    public static final int TIN_ORE_ID = 19467;
    public static final int IRON_ORE_ID = 31941;

    // Other item IDs
    public static final int RING_OF_WEALTH_ID = 16265;
    public static final int GLOVES_ID = 32470;
    public static final int BEER_ID = 29447;

    // Mining level thresholds
    public static final int LEVEL_THRESHOLD_LOW = 14;
    public static final int LEVEL_THRESHOLD_IRON = 15;
    public static final int LEVEL_THRESHOLD_HIGH = 30;
    public static final int TARGET_MINING_LEVEL = 41;

    // Mining areas
    public static WorldArea COPPER_MINING_AREA;
    public static WorldArea TIN_MINING_AREA;
    public static WorldPoint COPPER_MINE_CENTER;
    public static WorldPoint TIN_MINE_CENTER;

    // Pickaxe lists for banking
    public static int[] PICKAXE_LIST_1;
    public static int[] PICKAXE_LIST_2;

    // Constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 3;
    private static final int TICK_DELAY_BANK = 4;
    private static final int BANK_TIMEOUT_MS = 15357;
    private static final int DISTANCE_THRESHOLD = 10;

    // Buy quantities and prices
    private static final int BUY_RUNE_PICKAXE_PRICE = 30635;
    private static final int BUY_ADAMANT_PICKAXE_PRICE = 12245;
    private static final int BUY_MITHRIL_PICKAXE_PRICE = 5211;
    private static final int BUY_STEEL_PICKAXE_PRICE = 7271;
    private static final int BUY_IRON_PICKAXE_PRICE = 19750;
    private static final int BUY_BRONZE_PICKAXE_PRICE = 19829;
    private static final int BUY_RING_PRICE = 28653;
    private static final int BUY_GLOVES_PRICE = 16324;
    private static final int BUY_BEER_PRICE = 8319;

    // Status messages
    private static final String MSG_BUYING_ITEMS = "Buying items";
    private static final String MSG_FINISHED_BUYING = "Finished buying items, switching back to mining";
    private static final String MSG_NAV_TO_BANK = "Navigating to bank";
    private static final String MSG_OPENING_BANK = "Opening bank";
    private static final String MSG_HANDLING_BANKING = "Handling banking";
    private static final String MSG_MISSING_SUPPLIES = "We are missing pickaxes, switching to BUYING";
    private static final String MSG_NAV_TO_COPPER = "Walking to copper";
    private static final String MSG_MINING_COPPER = "Mining copper";
    private static final String MSG_NAV_TO_TIN = "Walking to tin";
    private static final String MSG_MINING_TIN = "Mining tin";
    private static final String MSG_NAV_TO_IRON = "Walking to iron";
    private static final String MSG_MINING_IRON = "Mining iron";
    private static final String MSG_DROPPING = "Dropping";
    private static final String MSG_MINE = "Mine";
    private static final String MSG_DROP = "Drop";
    private static final String SKILL_NAME = "Mining";
    private static final String ITEM_PREFIX_RING_OF_WEALTH = "ring of wealth (";

    // State
    public static List<d> itemsToBuy;
    public static boolean isBuying;

    static {
        // Initialize areas and locations
        COPPER_MINING_AREA = new WorldArea(19454, 28519, 14, 25, 0);
        TIN_MINING_AREA = new WorldArea(28414, 19775, 31, 16, 0);
        COPPER_MINE_CENTER = new WorldPoint(32303, 19706, 0);
        TIN_MINE_CENTER = new WorldPoint(28363, 32447, 0);

        // Initialize pickaxe lists
        PICKAXE_LIST_1 = new int[]{RUNE_PICKAXE_ID, ADAMANT_PICKAXE_ID};
        PICKAXE_LIST_2 = new int[]{RUNE_PICKAXE_ID, ADAMANT_PICKAXE_ID};

        itemsToBuy = new ArrayList<>();
    }

    /**
     * Populates the shopping list with pickaxes.
     */
    public static void populateShoppingList() {
        // Buy rune pickaxe if missing
        if (!Bank.contains(RUNE_PICKAXE_ID)) {
            itemsToBuy.add(new d(RUNE_PICKAXE_ID, 1, BUY_RUNE_PICKAXE_PRICE));
        }

        // Buy adamant pickaxe if missing
        if (!Bank.contains(ADAMANT_PICKAXE_ID)) {
            itemsToBuy.add(new d(ADAMANT_PICKAXE_ID, 1, BUY_ADAMANT_PICKAXE_PRICE));
        }

        // Buy mithril pickaxe if missing
        if (!Bank.contains(MITHRIL_PICKAXE_ID)) {
            itemsToBuy.add(new d(MITHRIL_PICKAXE_ID, 1, BUY_MITHRIL_PICKAXE_PRICE));
        }

        // Buy steel pickaxe if missing
        if (!Bank.contains(STEEL_PICKAXE_ID)) {
            itemsToBuy.add(new d(STEEL_PICKAXE_ID, 1, BUY_STEEL_PICKAXE_PRICE));
        }

        // Buy iron pickaxe if missing
        if (!Bank.contains(IRON_PICKAXE_ID)) {
            itemsToBuy.add(new d(IRON_PICKAXE_ID, 1, BUY_IRON_PICKAXE_PRICE));
        }

        // Buy bronze pickaxe if missing
        if (!Bank.contains(BRONZE_PICKAXE_ID)) {
            itemsToBuy.add(new d(BRONZE_PICKAXE_ID, 1, BUY_BRONZE_PICKAXE_PRICE));
        }

        // Buy ring of wealth
        if (!Bank.contains(item -> item.getName().toLowerCase().contains(ITEM_PREFIX_RING_OF_WEALTH))) {
            itemsToBuy.add(new d(RING_OF_WEALTH_ID, 35, BUY_RING_PRICE));
        }

        // Buy gloves
        if (!Bank.contains(GLOVES_ID)) {
            itemsToBuy.add(new d(GLOVES_ID, 166, BUY_GLOVES_PRICE));
        }

        // Buy beer
        if (!Bank.contains(BEER_ID)) {
            itemsToBuy.add(new d(BEER_ID, 1, BUY_BEER_PRICE));
        }
    }

    /**
     * Checks if the player has a required pickaxe.
     *
     * @return true if a pickaxe is present
     */
    private static boolean hasRequiredPickaxe() {
        return Inventory.contains(RUNE_PICKAXE_ID, ADAMANT_PICKAXE_ID, MITHRIL_PICKAXE_ID,
                STEEL_PICKAXE_ID, IRON_PICKAXE_ID, BRONZE_PICKAXE_ID);
    }

    /**
     * Main execution method for mining training.
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
            if (!hasRequiredPickaxe() || Inventory.getCount(12543) == 0) {
                handleBanking();
            }

            if (hasRequiredPickaxe()) {
                handleMining();
            }
        }
    }

    /**
     * Handles banking operations.
     */
    private static void handleBanking() {
        BankLocation nearestBank = BankLocation.getNearest();
        if (nearestBank == null) {
            return;
        }

        // Navigate to bank
        if (!nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_BANK;
            a.a(nearestBank);
            return;
        }

        // Open bank
        if (!Bank.isOpen()) {
            AccBuilderSotf.c = MSG_OPENING_BANK;
            a.a();
            Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
            return;
        }

        // Handle banking
        AccBuilderSotf.c = MSG_HANDLING_BANKING;

        // Deposit everything
        if (Inventory.getAll().size() > 0) {
            Bank.depositInventory();
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (Equipment.getAll().size() > 0) {
            Bank.depositEquipment();
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Check for pickaxes
        if (!e.c(PICKAXE_LIST_1)) {
            populateShoppingList();
            System.out.println(MSG_MISSING_SUPPLIES);
            isBuying = true;
            return;
        }

        // Withdraw pickaxes
        if (e.c(PICKAXE_LIST_2)) {
            withdrawPickaxes();
        }
    }

    /**
     * Withdraws pickaxes from the bank based on the current mining level.
     */
    private static void withdrawPickaxes() {
        int miningLevel = Skills.getLevel(Skill.MINING);

        // Withdraw based on level
        if (miningLevel >= LEVEL_THRESHOLD_HIGH) {
            a.a(RUNE_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_THRESHOLD_IRON && miningLevel < LEVEL_THRESHOLD_HIGH) {
            a.a(RUNE_PICKAXE_ID, 1);
            a.a(ADAMANT_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_THRESHOLD_LOW && miningLevel < LEVEL_THRESHOLD_IRON) {
            a.a(RUNE_PICKAXE_ID, 1);
            a.a(ADAMANT_PICKAXE_ID, 1);
            a.a(MITHRIL_PICKAXE_ID, 1);
        } else if (miningLevel >= LEVEL_THRESHOLD_LOW) {
            a.a(RUNE_PICKAXE_ID, 1);
            a.a(ADAMANT_PICKAXE_ID, 1);
            a.a(MITHRIL_PICKAXE_ID, 1);
            a.a(STEEL_PICKAXE_ID, 1);
        } else {
            // Low level: all pickaxes
            a.a(RUNE_PICKAXE_ID, 1);
            a.a(ADAMANT_PICKAXE_ID, 1);
            a.a(MITHRIL_PICKAXE_ID, 1);
            a.a(STEEL_PICKAXE_ID, 1);
            a.a(IRON_PICKAXE_ID, 1);
            a.a(BRONZE_PICKAXE_ID, 1);
        }
    }

    /**
     * Handles mining - mining ores and dropping them.
     */
    private static void handleMining() {
        // Drop ores if inventory is full
        if (Inventory.isFull()) {
            AccBuilderSotf.c = MSG_DROPPING;
            System.out.println(MSG_DROPPING);
            Inventory.getAll(COPPER_ORE_ID, TIN_ORE_ID, IRON_ORE_ID).stream().forEach(Item::drop);
        }

        if (!Inventory.isFull()) {
            int miningLevel = Skills.getLevel(Skill.MINING);

            if (miningLevel < LEVEL_THRESHOLD_IRON) {
                mineCopper();
            } else if (miningLevel >= LEVEL_THRESHOLD_IRON && miningLevel < LEVEL_THRESHOLD_HIGH) {
                mineTin();
            } else {
                mineIron();
            }
        }
    }

    /**
     * Mines copper ore.
     */
    private static void mineCopper() {
        if (!COPPER_MINING_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_COPPER;
            Movement.walkTo(COPPER_MINE_CENTER);
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (COPPER_MINING_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_MINING_COPPER;
            var rock = TileObjects.getNearest(Players.getLocal().getWorldLocation(), COPPER_ROCK_IDS);

            if (!Players.getLocal().isAnimating() && !Players.getLocal().isMoving() && rock != null) {
                rock.interact(MSG_MINE);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    /**
     * Mines tin ore.
     */
    private static void mineTin() {
        if (!TIN_MINING_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_NAV_TO_TIN;
            Movement.walkTo(TIN_MINE_CENTER);
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (TIN_MINING_AREA.contains(Players.getLocal().getWorldLocation())) {
            AccBuilderSotf.c = MSG_MINING_TIN;
            var rock = TileObjects.getNearest(Players.getLocal().getWorldLocation(), TIN_ROCK_IDS);

            if (!Players.getLocal().isAnimating() && !Players.getLocal().isMoving() && rock != null) {
                rock.interact(MSG_MINE);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    /**
     * Mines iron ore.
     */
    private static void mineIron() {
        if (Players.getLocal().getWorldLocation().distanceTo(COPPER_MINE_CENTER) > DISTANCE_THRESHOLD) {
            AccBuilderSotf.c = MSG_NAV_TO_IRON;
            Movement.walkTo(COPPER_MINE_CENTER);
            Time.sleepTicks(TICK_DELAY_BANK);
        }

        if (Players.getLocal().getWorldLocation().distanceTo(COPPER_MINE_CENTER) <= DISTANCE_THRESHOLD) {
            AccBuilderSotf.c = MSG_MINING_IRON;
            var rock = TileObjects.getNearest(Players.getLocal().getWorldLocation(), IRON_ROCK_IDS);

            if (!Players.getLocal().isAnimating() && !Players.getLocal().isMoving() && rock != null) {
                rock.interact(MSG_MINE);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    @Override
    public String ag() {
        return SKILL_NAME;
    }

    @Override
    public boolean ah() {
        return Skills.getLevel(Skill.MINING) >= TARGET_MINING_LEVEL;
    }

    @Override
    public boolean ae() {
        return false;
    }

    @Override
    public int af() {
        train();
        return 16;  // Priority
    }
}
