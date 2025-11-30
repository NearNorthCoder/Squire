package gg.squire.sotf.steps;

import gg.squire.account.AccBuilderSotf;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import gg.squire.sotf.framework.*;

/**
 * Trains Fishing skill from level 1 to 20+.
 *
 * <p>This step handles:
 * <ul>
 *   <li>Automatically purchasing fishing equipment from the GE</li>
 *   <li>Level-based fishing progression (nets → bait → fly fishing)</li>
 *   <li>Banking and inventory management</li>
 *   <li>Navigation between fishing spots</li>
 * </ul>
 *
 * <p>Fishing progression:
 * <ul>
 *   <li>Levels 1-4: Small net fishing for shrimp</li>
 *   <li>Levels 5-19: Bait fishing for sardines/herring</li>
 *   <li>Levels 20+: Fly fishing for trout/salmon</li>
 * </ul>
 *
 * <p>OSRS Fishing Mechanics:
 * Small net fishing requires only a small fishing net in inventory.
 * Bait fishing requires a fishing rod and fishing bait.
 * Fly fishing requires a fly fishing rod and feathers.
 * Fishing spots are represented as NPCs that can be interacted with.
 */
public class FishingTrainingStep implements QuestStep {

    // ========== Item IDs ==========

    /** Small fishing net (ID: 303) - Used for catching shrimp and anchovies */
    private static final int SMALL_FISHING_NET_ID = 303;

    /** Fishing rod (ID: 307) - Used with bait for catching sardines and herring */
    private static final int FISHING_ROD_ID = 307;

    /** Fly fishing rod (ID: 309) - Used with feathers for catching trout and salmon */
    private static final int FLY_FISHING_ROD_ID = 309;

    /** Feather (ID: 314) - Bait for fly fishing */
    private static final int FEATHER_ID = 314;

    /** Fishing bait (ID: 313) - Bait for regular fishing rod */
    private static final int FISHING_BAIT_ID = 313;

    /** Barb-tail harpoon (ID: 8008) - Alternative fishing equipment */
    private static final int BARB_TAIL_HARPOON_ID = 8008;

    /** Ring of wealth (ID: 11980) - Worn for teleports and coin collection */
    private static final int RING_OF_WEALTH_ID = 11980;

    /** Shrimps (ID: 317) - Caught with small net */
    private static final int SHRIMPS_ID = 317;

    /** Sardine (ID: 327) - Caught with fishing rod */
    private static final int SARDINE_ID = 327;

    /** Salmon (ID: 331) - Caught with fly fishing rod */
    private static final int SALMON_ID = 331;

    /** Trout (ID: 335) - Caught with fly fishing rod */
    private static final int TROUT_ID = 335;

    /** Mackerel (ID: 345) - Caught with fishing rod */
    private static final int MACKEREL_ID = 345;

    /** Anchovies (ID: 1511) - Caught with small net */
    private static final int ANCHOVIES_ID = 1511;

    /** Crayfish (ID: 1521) - Caught with crayfish cage */
    private static final int CRAYFISH_ID = 1521;

    /** Raw mackerel (ID: 1519) - Caught fishing */
    private static final int RAW_MACKEREL_ID = 1519;

    // ========== NPC IDs ==========

    /** Fishing spot NPC ID (1544) - Rod fishing spot */
    private static final int FISHING_SPOT_ROD_NPC_ID = 1544;

    /** Fishing spot NPC ID (1508) - Another fishing spot type */
    private static final int FISHING_SPOT_FLY_NPC_ID = 1508;

    // ========== Fishing Levels ==========

    /** Fishing level required for bait fishing */
    private static final int FISHING_LEVEL_BAIT = 5;

    /** Fishing level required for fly fishing */
    private static final int FISHING_LEVEL_FLY = 20;

    /** Target fishing level before moving to next step */
    private static final int TARGET_FISHING_LEVEL = 99;

    // ========== Buy Prices ==========

    /** Price to buy small fishing net from GE */
    private static final int BUY_PRICE_SMALL_NET = 9000;

    /** Price to buy fishing rod from GE */
    private static final int BUY_PRICE_FISHING_ROD = 300;

    /** Price to buy fly fishing rod from GE */
    private static final int BUY_PRICE_FLY_ROD = 500;

    /** Price to buy feathers (1000) from GE */
    private static final int BUY_PRICE_FEATHERS = 13000;

    /** Price to buy fishing bait (100000) from GE */
    private static final int BUY_PRICE_BAIT = 100000;

    /** Price to buy ring of wealth from GE */
    private static final int BUY_PRICE_RING = 25000;

    /** Price to buy barb-tail harpoon from GE */
    private static final int BUY_PRICE_HARPOON = 900;

    // ========== Buy Quantities ==========

    /** Quantity of feathers to withdraw */
    private static final int QUANTITY_FEATHERS = 1000;

    /** Quantity of fishing bait to withdraw */
    private static final int QUANTITY_BAIT = 100000;

    /** Standard withdraw quantity for most items */
    private static final int QUANTITY_ONE = 1;

    // ========== Tick Delays ==========

    /** 1 tick delay (~600ms) */
    private static final int TICK_DELAY_1 = 1;

    /** 2 tick delay (~1200ms) */
    private static final int TICK_DELAY_2 = 2;

    /** 3 tick delay (~1800ms) */
    private static final int TICK_DELAY_3 = 3;

    /** 4 tick delay (~2400ms) */
    private static final int TICK_DELAY_4 = 4;

    /** 5 tick delay (~3000ms) */
    private static final int TICK_DELAY_5 = 5;

    // ========== Timeouts ==========

    /** Timeout for bank operations (5000ms) */
    private static final int BANK_TIMEOUT_MS = 5000;

    // ========== Other Constants ==========

    /** Animation ID for idle/not fishing */
    private static final int ANIMATION_IDLE = -1;

    /** Distance threshold for navigation */
    private static final int DISTANCE_THRESHOLD_CLOSE = 5;

    /** Distance threshold for far destinations */
    private static final int DISTANCE_THRESHOLD_FAR = 15;

    /** Distance threshold for banking */
    private static final int DISTANCE_THRESHOLD_BANK = 8;

    /** Return value for step execution */
    private static final int STEP_RETURN_VALUE = 100;

    // ========== Locations ==========

    /**
     * Draynor fishing area (near willows)
     * Area: (2506, 3556, 19, 12, plane 0)
     */
    public static WorldArea DRAYNOR_FISHING_AREA;

    /**
     * Small net fishing spot location in Draynor
     * Point: (2517, 3572, plane 0)
     */
    private static WorldPoint SMALL_NET_FISHING_SPOT;

    /**
     * Fly fishing spot location in Barbarian Village
     * Point: (2532, 3412, plane 0)
     */
    private static WorldPoint FLY_FISHING_SPOT;

    // ========== Item Arrays ==========

    /**
     * Array of fish IDs to drop when inventory is full.
     * Includes all types of fish caught during training.
     */
    private static int[] FISH_TO_DROP;

    // ========== Shopping List ==========

    /**
     * List of items to buy from the Grand Exchange if missing.
     * Populated when checking bank and finding insufficient supplies.
     */
    public static List<d> shoppingList;

    /**
     * Flag indicating whether we need to buy items from GE.
     * When true, switches to buying mode.
     */
    public static boolean needsToBuyItems;

    // ========== Status Messages ==========

    private static final String STATUS_BUYING_ITEMS = "Buying items";
    private static final String STATUS_FINISHED_BUYING = "Finished buying items, switching back to fishing";
    private static final String STATUS_NAV_TO_BANK = "Navigating to bank";
    private static final String STATUS_OPENING_BANK = "Opening bank";
    private static final String STATUS_HANDLING_BANKING = "Handling banking";
    private static final String STATUS_MISSING_SUPPLIES = "We are missing supplies, switching to BUYING";
    private static final String STATUS_DROPPING_LOGS = "Dropping logs";
    private static final String STATUS_NAV_TO_SMALL_FISH = "Nav to small fish spot";
    private static final String STATUS_NAV_TO_FLY_FISH = "Nav to fly fish spot";
    private static final String STATUS_NAV_TO_BANK_DEPOSIT = "Nav to bank";
    private static final String STATUS_FISHING = "Fishing";

    // ========== Item Names ==========

    private static final String ITEM_NAME_SMALL_NET = "Small fishing net";
    private static final String ITEM_NAME_FISHING_ROD = "Fishing rod";
    private static final String ITEM_NAME_FLY_ROD = "Fly fishing rod";
    private static final String ITEM_NAME_FEATHER = "Feather";
    private static final String ITEM_NAME_BAIT = "Fishing bait";
    private static final String ITEM_NAME_RING = "ring of wealth (";
    private static final String ITEM_NAME_FISHING_SPOT = "Fishing spot";

    // ========== Interaction Options ==========

    private static final String INTERACT_WEAR = "Wear";
    private static final String INTERACT_BAIT = "Bait";
    private static final String INTERACT_LURE = "Lure";
    private static final String INTERACT_USE_ROD = "Use-rod";

    private static final String SKILL_NAME = "Fishing";

    // Static initializer
    static {
        // Initialize fishing area in Draynor Village
        DRAYNOR_FISHING_AREA = new WorldArea(2506, 3556, 19, 12, 0);

        // Initialize shopping list
        shoppingList = new ArrayList<>();

        // Initialize fishing spot locations
        SMALL_NET_FISHING_SPOT = new WorldPoint(2517, 3572, 0);
        FLY_FISHING_SPOT = new WorldPoint(2532, 3412, 0);

        // Initialize fish to drop array (all caught fish types)
        FISH_TO_DROP = new int[] {
            ANCHOVIES_ID,      // 1511
            CRAYFISH_ID,       // 1521
            RAW_MACKEREL_ID,   // 1519
            SHRIMPS_ID,        // 317
            SARDINE_ID,        // 327
            SALMON_ID,         // 331
            MACKEREL_ID,       // 345
            TROUT_ID,          // 335
            11330,             // Additional fish
            11332,             // Additional fish
            11328              // Additional fish
        };
    }

    /**
     * Populates the shopping list with items needed for fishing training.
     * Checks bank for each required item and adds to buy list if missing.
     *
     * <p>Items checked:
     * <ul>
     *   <li>Small fishing net (1)</li>
     *   <li>Fishing rod (1)</li>
     *   <li>Fly fishing rod (1)</li>
     *   <li>Fishing bait (100000)</li>
     *   <li>Feathers (1000)</li>
     *   <li>Ring of wealth (1)</li>
     *   <li>Barb-tail harpoon (1)</li>
     *   <li>Equipped weapon/tool</li>
     * </ul>
     */
    public static void populateShoppingList() {
        // Check for small fishing net
        if (!Bank.contains(SMALL_FISHING_NET_ID)) {
            shoppingList.add(new ShopItem(SMALL_FISHING_NET_ID, 1, BUY_PRICE_SMALL_NET));
        }

        // Check for fishing rod
        if (!Bank.contains(FISHING_ROD_ID)) {
            shoppingList.add(new ShopItem(FISHING_ROD_ID, 1, BUY_PRICE_FISHING_ROD));
        }

        // Check for fly fishing rod
        if (!Bank.contains(FLY_FISHING_ROD_ID)) {
            shoppingList.add(new ShopItem(FLY_FISHING_ROD_ID, 1, BUY_PRICE_FLY_ROD));
        }

        // Check for fishing bait (high quantity)
        if (!Bank.contains(FISHING_BAIT_ID)) {
            shoppingList.add(new ShopItem(FISHING_BAIT_ID, QUANTITY_BAIT, BUY_PRICE_BAIT));
        }

        // Check for feathers
        if (!Bank.contains(FEATHER_ID)) {
            shoppingList.add(new ShopItem(FEATHER_ID, QUANTITY_FEATHERS, BUY_PRICE_FEATHERS));
        }

        // Check for barb-tail harpoon
        if (!Bank.contains(BARB_TAIL_HARPOON_ID)) {
            shoppingList.add(new ShopItem(BARB_TAIL_HARPOON_ID, 1, BUY_PRICE_HARPOON));
        }

        // Check for ring of wealth
        if (!Bank.contains(RING_OF_WEALTH_ID)) {
            shoppingList.add(new ShopItem(RING_OF_WEALTH_ID, 16, BUY_PRICE_RING));
        }

        // Check for ring of wealth (by name pattern)
        Predicate<Item> ringPredicate = item ->
            item.getName().toLowerCase().contains(ITEM_NAME_RING);
        if (!Bank.contains(ringPredicate)) {
            shoppingList.add(new ShopItem(RING_OF_WEALTH_ID, 7, BUY_PRICE_RING));
        }

        // Check for weapon/tool (from equipment class)
        if (!Bank.contains(f.aT)) {
            shoppingList.add(new ShopItem(f.aT[0], 54, 900));
        }
    }

    /**
     * Main handler for fishing training with full equipment management.
     * Handles banking, equipment withdrawal, navigation, and fishing.
     */
    public static void trainFishing() {
        // Handle buying mode
        if (needsToBuyItems) {
            AccBuilderSotf.c = STATUS_BUYING_ITEMS;
            b.a(shoppingList);

            // If shopping list is empty, we're done buying
            if (shoppingList.size() < 1) {
                System.out.println(STATUS_FINISHED_BUYING);
                needsToBuyItems = false;
            }
        }

        if (!needsToBuyItems) {
            // Banking phase - get equipment
            if (!hasAllFishingEquipment()) {
                BankLocation nearestBank = BankLocation.getNearest();

                // Navigate to bank
                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_NAV_TO_BANK;
                    a.a(nearestBank);
                }

                // Open bank and handle banking
                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        AccBuilderSotf.c = STATUS_OPENING_BANK;
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = STATUS_HANDLING_BANKING;

                        // Deposit inventory and equipment
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(TICK_DELAY_4);
                        }
                        if (Equipment.getAll().size() > 0) {
                            Bank.depositEquipment();
                            Time.sleepTicks(TICK_DELAY_2);
                        }

                        // Check if we have all required items
                        boolean missingItems = false;

                        // Check for small net
                        if (Bank.contains(SMALL_FISHING_NET_ID)) {
                            if (Inventory.getCount(ITEM_NAME_SMALL_NET) < 1) {
                                missingItems = true;
                            }
                        }

                        // Check for fishing rod
                        if (Bank.contains(FISHING_ROD_ID)) {
                            if (Inventory.getCount(ITEM_NAME_FISHING_ROD) < 1) {
                                missingItems = true;
                            }
                        }

                        // Check for fly rod
                        if (Bank.contains(FLY_FISHING_ROD_ID)) {
                            if (Inventory.getCount(ITEM_NAME_FLY_ROD) < 1) {
                                missingItems = true;
                            }
                        }

                        // Check for feathers
                        if (Bank.contains(FEATHER_ID)) {
                            if (Inventory.getCount(ITEM_NAME_FEATHER) < 1) {
                                missingItems = true;
                            }
                        }

                        // Check for bait
                        if (Bank.contains(FISHING_BAIT_ID)) {
                            if (Inventory.getCount(ITEM_NAME_BAIT) < 1) {
                                missingItems = true;
                            }
                        }

                        // Check for weapon/tool
                        if (!Bank.contains(f.aT) || Inventory.getCount(f.aT) < 1) {
                            if (!Equipment.contains(f.aT)) {
                                missingItems = true;
                            }
                        }

                        // If missing items, switch to buying mode
                        if (missingItems) {
                            populateShoppingList();
                            System.out.println(STATUS_MISSING_SUPPLIES);
                            needsToBuyItems = true;
                            return;
                        }

                        // Withdraw all required items
                        if (Bank.contains(SMALL_FISHING_NET_ID)) {
                            Bank.withdraw(ITEM_NAME_SMALL_NET, QUANTITY_ONE, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_SMALL_NET) > 0, BANK_TIMEOUT_MS);
                        }

                        if (Bank.contains(FISHING_ROD_ID)) {
                            Bank.withdraw(ITEM_NAME_FISHING_ROD, QUANTITY_ONE, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_FISHING_ROD) > 0, BANK_TIMEOUT_MS);
                        }

                        if (Bank.contains(FLY_FISHING_ROD_ID)) {
                            Bank.withdraw(ITEM_NAME_FLY_ROD, QUANTITY_ONE, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_FLY_ROD) > 0, BANK_TIMEOUT_MS);
                        }

                        if (Bank.contains(FEATHER_ID)) {
                            Bank.withdraw(ITEM_NAME_FEATHER, QUANTITY_FEATHERS, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_FEATHER) > 0, BANK_TIMEOUT_MS);
                        }

                        if (Bank.contains(FISHING_BAIT_ID)) {
                            Bank.withdraw(ITEM_NAME_BAIT, QUANTITY_BAIT, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_BAIT) > 0, BANK_TIMEOUT_MS);
                        }

                        // Withdraw weapon/tool
                        if (Bank.contains(f.aT)) {
                            a.b(f.aT, QUANTITY_ONE);
                        }

                        // Withdraw barb-tail harpoon
                        if (Bank.contains(BARB_TAIL_HARPOON_ID)) {
                            a.a(BARB_TAIL_HARPOON_ID, QUANTITY_ONE);
                        }
                    }
                }
            }

            // Fishing phase
            if (hasAllFishingEquipment()) {
                // Close any open dialogs
                if (Dialog.isOpen()) {
                    Dialog.close();
                }

                // Drop fish if inventory is full
                if (Inventory.isFull()) {
                    AccBuilderSotf.c = STATUS_DROPPING_LOGS;
                    System.out.println(STATUS_DROPPING_LOGS);
                    Inventory.getAll(FISH_TO_DROP).stream().forEach(Item::drop);
                }

                // Fish based on level
                if (!Inventory.isFull()) {
                    int fishingLevel = Skills.getLevel(Skill.FISHING);

                    // Low level (1-4): Small net fishing
                    if (fishingLevel < FISHING_LEVEL_BAIT) {
                        if (fishingLevel >= FISHING_LEVEL_BAIT) {
                            // Navigate to small net spot
                            if (!DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())
                                && Players.getLocal().getWorldLocation().distanceTo(SMALL_NET_FISHING_SPOT) > FISHING_LEVEL_BAIT) {
                                AccBuilderSotf.c = STATUS_NAV_TO_SMALL_FISH;

                                // Wear weapon if in inventory
                                if (Inventory.contains(f.aT)) {
                                    Inventory.getFirst(f.aT).interact(INTERACT_WEAR);
                                }

                                Movement.walkTo(SMALL_NET_FISHING_SPOT);
                                Time.sleepTicks(TICK_DELAY_1);
                            }

                            // Fish with small net
                            if (DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())) {
                                AccBuilderSotf.c = STATUS_FISHING;

                                if (Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                                    NPC fishingSpot = NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID);
                                    if (fishingSpot != null && DRAYNOR_FISHING_AREA.contains((Locatable) fishingSpot)) {
                                        NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID).interact(0);
                                        Time.sleepTicks(TICK_DELAY_2);
                                    }
                                }
                            }
                        }

                        // Mid level (5-19): Bait fishing
                        if (fishingLevel >= FISHING_LEVEL_BAIT && fishingLevel < FISHING_LEVEL_FLY) {
                            // Navigate to bait fishing spot
                            if (!DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())) {
                                AccBuilderSotf.c = STATUS_NAV_TO_SMALL_FISH;
                                Movement.walkTo(SMALL_NET_FISHING_SPOT);
                                Time.sleepTicks(TICK_DELAY_1);
                            }

                            // Fish with bait
                            if (DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())) {
                                AccBuilderSotf.c = STATUS_FISHING;

                                if (Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                                    NPC fishingSpot = NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID);
                                    if (fishingSpot != null && DRAYNOR_FISHING_AREA.contains((Locatable) fishingSpot)) {
                                        NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID).interact(INTERACT_BAIT);
                                        Time.sleepTicks(TICK_DELAY_2);
                                    }
                                }
                            }
                        }
                    }

                    // High level (20+): Fly fishing
                    if (fishingLevel >= FISHING_LEVEL_FLY) {
                        // Navigate to fly fishing spot
                        if (Players.getLocal().getWorldLocation().distanceTo(FLY_FISHING_SPOT) > DISTANCE_THRESHOLD_FAR) {
                            AccBuilderSotf.c = STATUS_NAV_TO_FLY_FISH;
                            Movement.walkTo(FLY_FISHING_SPOT);
                            Time.sleepTicks(TICK_DELAY_1);
                        }

                        // Fly fish for trout/salmon
                        if (Players.getLocal().getWorldLocation().distanceTo(FLY_FISHING_SPOT) <= DISTANCE_THRESHOLD_FAR) {
                            AccBuilderSotf.c = STATUS_FISHING;

                            if (Players.getLocal().getAnimation() == ANIMATION_IDLE
                                && NPCs.getNearest(npc ->
                                    npc.getId() == FISHING_SPOT_FLY_NPC_ID
                                    && npc.getWorldLocation().distanceTo(FLY_FISHING_SPOT) <= DISTANCE_THRESHOLD_FAR) != null) {
                                NPCs.getNearest(npc ->
                                    npc.getId() == FISHING_SPOT_FLY_NPC_ID
                                    && npc.getWorldLocation().distanceTo(FLY_FISHING_SPOT) <= DISTANCE_THRESHOLD_FAR)
                                    .interact(INTERACT_LURE);
                                Time.sleepTicks(TICK_DELAY_2);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Alternative fishing training handler for lower levels.
     * Focuses on small net fishing only.
     */
    public static void trainFishingBasic() {
        // Handle buying mode
        if (needsToBuyItems) {
            AccBuilderSotf.c = STATUS_BUYING_ITEMS;
            b.a(shoppingList);

            if (shoppingList.size() < 1) {
                System.out.println(STATUS_FINISHED_BUYING);
                needsToBuyItems = false;
            }
        }

        if (!needsToBuyItems) {
            // Banking phase
            if (!hasSmallFishingNet()) {
                BankLocation nearestBank = BankLocation.getNearest();

                if (nearestBank != null && !nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    AccBuilderSotf.c = STATUS_NAV_TO_BANK;
                    a.a(nearestBank);
                }

                if (nearestBank != null && nearestBank.getArea().contains(Players.getLocal().getWorldLocation())) {
                    if (!Bank.isOpen()) {
                        AccBuilderSotf.c = STATUS_OPENING_BANK;
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), BANK_TIMEOUT_MS);
                    }

                    if (Bank.isOpen()) {
                        AccBuilderSotf.c = STATUS_HANDLING_BANKING;

                        // Deposit inventory
                        if (Inventory.getAll().size() > 0) {
                            Bank.depositInventory();
                            Time.sleepTicks(TICK_DELAY_4);
                        }

                        // Check for missing items
                        boolean missingSmallNet = Bank.contains(SMALL_FISHING_NET_ID)
                            && Inventory.getCount(ITEM_NAME_SMALL_NET) < 1;
                        boolean missingWeapon = !Bank.contains(f.aT)
                            && !Inventory.contains(f.aT)
                            && !Equipment.contains(f.aT);

                        if (missingSmallNet || missingWeapon) {
                            populateShoppingList();
                            System.out.println(STATUS_MISSING_SUPPLIES);
                            needsToBuyItems = true;
                            return;
                        }

                        // Withdraw small fishing net
                        if (Bank.contains(SMALL_FISHING_NET_ID)) {
                            Bank.withdraw(ITEM_NAME_SMALL_NET, QUANTITY_ONE, Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(TICK_DELAY_2);
                            Time.sleepUntil(() -> Inventory.getCount(ITEM_NAME_SMALL_NET) > 0, BANK_TIMEOUT_MS);
                        }

                        // Withdraw weapon
                        if (Bank.contains(f.aT)) {
                            a.b(f.aT, QUANTITY_ONE);
                        }
                    }
                }
            }

            // Fishing phase
            if (hasSmallFishingNet()) {
                if (Dialog.isOpen()) {
                    Dialog.close();
                }

                // Handle full inventory
                if (Inventory.isFull()) {
                    // If no shrimps in inventory, bank them
                    if (!Inventory.contains(SHRIMPS_ID)) {
                        WorldPoint bankPoint = new WorldPoint(2535, 3573, 0);

                        if (Players.getLocal().getWorldLocation().distanceTo(bankPoint) > DISTANCE_THRESHOLD_CLOSE) {
                            AccBuilderSotf.c = STATUS_NAV_TO_BANK_DEPOSIT;
                            Movement.walkTo(bankPoint);
                            Time.sleepTicks(TICK_DELAY_1);
                        }

                        if (Players.getLocal().getWorldLocation().distanceTo(bankPoint) <= DISTANCE_THRESHOLD_BANK) {
                            if (!Bank.isOpen()) {
                                a.a();
                            }

                            if (Bank.isOpen()) {
                                Time.sleepTicks(TICK_DELAY_2);
                                Bank.depositInventory();
                                Time.sleepTicks(TICK_DELAY_2);
                                a.a(SMALL_FISHING_NET_ID, QUANTITY_ONE);
                            }
                        }
                    }
                }

                // Fish with small net
                if (!Inventory.isFull()) {
                    // Navigate to fishing spot
                    if (!DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())
                        && Players.getLocal().getWorldLocation().distanceTo(SMALL_NET_FISHING_SPOT) > FISHING_LEVEL_BAIT) {
                        AccBuilderSotf.c = STATUS_NAV_TO_SMALL_FISH;

                        if (Inventory.contains(f.aT)) {
                            Inventory.getFirst(f.aT).interact(INTERACT_WEAR);
                        }

                        Movement.walkTo(SMALL_NET_FISHING_SPOT);
                        Time.sleepTicks(TICK_DELAY_1);
                    }

                    // Fish
                    if (DRAYNOR_FISHING_AREA.contains(Players.getLocal().getWorldLocation())) {
                        AccBuilderSotf.c = STATUS_FISHING;

                        if (Players.getLocal().getAnimation() == ANIMATION_IDLE) {
                            if (NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID) != null) {
                                NPCs.getNearest(FISHING_SPOT_ROD_NPC_ID).interact(0);
                                Time.sleepTicks(TICK_DELAY_5);
                            }
                        }
                    }
                }

                // Drop fish if inventory is full
                if (Inventory.isFull()) {
                    if (Inventory.contains(SHRIMPS_ID)) {
                        Inventory.getAll(SHRIMPS_ID).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    /**
     * Drops fish and continues fishing with a rod.
     * Used for continuous training without banking.
     */
    public static void dropAndFish() {
        // Drop fish when inventory is full
        if (Inventory.isFull()) {
            AccBuilderSotf.c = STATUS_DROPPING_LOGS;
            System.out.println(STATUS_DROPPING_LOGS);
            Inventory.getAll(FISH_TO_DROP).stream().forEach(Item::drop);
        }

        // Fish with rod
        if (!Inventory.isFull() && Players.getLocal().getAnimation() == ANIMATION_IDLE) {
            NPCs.getNearest(ITEM_NAME_FISHING_SPOT).interact(INTERACT_USE_ROD);
            Time.sleepTicks(TICK_DELAY_2);
        }
    }

    /**
     * Checks if player has all required fishing equipment in inventory.
     * Includes small net, fishing rod, fly rod, feathers, bait, and weapon.
     *
     * @return true if all equipment is present, false otherwise
     */
    public static boolean hasAllFishingEquipment() {
        return Inventory.contains(ITEM_NAME_SMALL_NET)
            && Inventory.contains(ITEM_NAME_FISHING_ROD)
            && Inventory.contains(ITEM_NAME_FLY_ROD)
            && Inventory.contains(ITEM_NAME_FEATHER)
            && Inventory.contains(ITEM_NAME_BAIT)
            && (!Inventory.contains(f.aT) || Equipment.contains(f.aT));
    }

    /**
     * Checks if player has a small fishing net.
     * Also checks for weapon in inventory or equipped.
     *
     * @return true if small net and weapon are available, false otherwise
     */
    public static boolean hasSmallFishingNet() {
        return Inventory.contains(ITEM_NAME_SMALL_NET)
            && (!Inventory.contains(f.aT) || Equipment.contains(f.aT));
    }

    @Override
    public String getName() {
        return SKILL_NAME;
    }

    @Override
    public int execute() {
        trainFishing();
        return STEP_RETURN_VALUE;
    }

    @Override
    public boolean arePrerequisitesMet() {
        return false;
    }

    @Override
    public boolean isComplete() {
        return Skills.getLevel(Skill.FISHING) >= TARGET_FISHING_LEVEL;
    }
}
