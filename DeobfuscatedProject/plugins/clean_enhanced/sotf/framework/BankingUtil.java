/*
 * Deobfuscated from class 'a' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * BankingUtil provides utility methods for banking operations in OSRS.
 * Handles opening banks, withdrawing items, and navigating to bank locations.
 *
 * Original obfuscated methods:
 *   a() -> openNearestBank()
 *   a(BankLocation) -> navigateToBank(BankLocation)
 *   a(int, int) -> withdrawItem(int itemId, int quantity)
 *   a(int[]) -> withdrawItems(int[] itemIds)
 *   a(int[], int) -> withdrawItemsWithQuantity(int[] itemIds, int quantity)
 *   b(int, int) -> withdrawNoted(int itemId, int quantity)
 *   b(int[], int) -> withdrawItemsUntilFound(int[] itemIds, int quantity)
 */
package gg.squire.sotf.framework;

import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/**
 * Utility class for banking operations.
 * Provides methods for opening banks, withdrawing items, and navigation.
 */
public final class BankingUtil {

    // =====================================================================
    // Constants
    // =====================================================================

    // Varbit for dialog state check
    private static final int DIALOG_VARBIT = 12414;

    // Timeouts and delays
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 3;
    private static final int BANK_TIMEOUT_MS = 3000;

    // Distance thresholds
    private static final int BANK_DISTANCE_THRESHOLD = 10;
    private static final int EMERALD_BENEDICT_DISTANCE = 30;
    private static final int TELEPORT_THRESHOLD = 40;

    // NPC and object names
    private static final String NPC_EMERALD_BENEDICT = "Emerald Benedict";
    private static final String OBJECT_BANK_CHEST = "Bank chest";
    private static final String OBJECT_BANK_BOOTH = "Bank booth";

    // Actions
    private static final String ACTION_BANK = "Bank";
    private static final String ACTION_USE = "Use";
    private static final String ACTION_WEAR = "Wear";
    private static final String ACTION_BREAK = "Break";
    private static final String ACTION_PULL = "Pull";

    // =====================================================================
    // World Areas and Points
    // =====================================================================

    /** Grand Exchange area */
    public static final WorldArea GE_AREA = new WorldArea(3153, 3474, 23, 39, 0);

    /** GE center point */
    public static final WorldPoint GE_CENTER = new WorldPoint(3164, 3485, 0);

    /** Varrock West area */
    public static final WorldArea VARROCK_WEST_AREA = new WorldArea(3180, 3428, 105, 105, 0);

    /** Falador area */
    public static final WorldArea FALADOR_AREA = new WorldArea(2945, 3355, 69, 70, 0);

    /** Castle Wars area */
    public static final WorldArea CASTLE_WARS_AREA = new WorldArea(2435, 3080, 60, 10, 0);

    /** Shantay Pass area */
    public static final WorldArea SHANTAY_AREA = new WorldArea(3286, 3113, 92, 37, 0);

    /** Al Kharid area */
    public static final WorldArea AL_KHARID_AREA = new WorldArea(3267, 3161, 55, 86, 0);

    /** Wilderness lever area */
    public static final WorldArea WILDERNESS_LEVER_AREA = new WorldArea(3152, 3921, 45, 24, 0);

    /** Navigation waypoints */
    public static WorldPoint VARROCK_WAYPOINT = new WorldPoint(3179, 3434, 0);
    public static WorldPoint FALADOR_WAYPOINT = new WorldPoint(2966, 3381, 0);
    public static WorldPoint H_WAYPOINT = new WorldPoint(3094, 3491, 1);

    // Obfuscated field names preserved for compatibility
    public static final WorldArea w = GE_AREA;
    public static final WorldPoint x = GE_CENTER;
    public static final WorldArea y = VARROCK_WEST_AREA;
    public static final WorldArea z = FALADOR_AREA;
    public static final WorldArea A = CASTLE_WARS_AREA;
    public static final WorldArea B = SHANTAY_AREA;
    public static final WorldArea C = AL_KHARID_AREA;
    public static final WorldArea D = WILDERNESS_LEVER_AREA;
    public static final WorldArea E = new WorldArea(3152, 3921, 45, 24, 0);
    public static WorldPoint F = VARROCK_WAYPOINT;
    public static WorldPoint G = FALADOR_WAYPOINT;
    static WorldPoint H = H_WAYPOINT;

    // =====================================================================
    // Public Methods - Bank Opening
    // =====================================================================

    /**
     * Open the nearest bank based on current location.
     * Handles special cases for GE, Castle Wars, Shantay Pass, etc.
     * Original obfuscated method: a.a()
     */
    public static void openNearestBank() {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Check if near Emerald Benedict (GE banker)
        if (playerLoc.distanceTo(H_WAYPOINT) <= EMERALD_BENEDICT_DISTANCE) {
            NPCs.getNearest(NPC_EMERALD_BENEDICT).interact(ACTION_BANK);
            Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT_MS);
            return;
        }

        // Check if in GE area
        if (BankLocation.GRAND_EXCHANGE_BANK.getArea().contains(playerLoc) || GE_AREA.contains(playerLoc)) {
            GrandExchange.openBank();
            Time.sleepTicks(TICK_DELAY_LONG);
            Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT_MS);
            return;
        }

        // Check if in special bank areas (Castle Wars, Barbarian Outpost, Shantay Pass)
        if (!BankLocation.CASTLE_WARS_BANK.getArea().contains(playerLoc)
                && !BankLocation.BARBARIAN_OUTPOST_BANK.getArea().contains(playerLoc)
                && !BankLocation.SHANTAY_PASS_BANK.getArea().contains(playerLoc)
                && !CASTLE_WARS_AREA.contains(playerLoc)
                && !WILDERNESS_LEVER_AREA.contains(playerLoc)
                && playerLoc.distanceTo(FALADOR_WAYPOINT) > BANK_DISTANCE_THRESHOLD) {

            // Look for bank chest
            TileObject bankChest = TileObjects.getNearest(playerLoc, OBJECT_BANK_CHEST);
            if (bankChest != null) {
                if (bankChest.hasAction(ACTION_USE)) {
                    bankChest.interact(ACTION_USE);
                    Time.sleepTicks(TICK_DELAY_LONG);
                    Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT_MS);
                }
                if (bankChest.hasAction(ACTION_BANK)) {
                    bankChest.interact(ACTION_BANK);
                    Time.sleepTicks(TICK_DELAY_LONG);
                    Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT_MS);
                }
            }
            return;
        }

        // Check if in GE area but far from Emerald Benedict
        if (!GE_AREA.contains(playerLoc) && playerLoc.distanceTo(H_WAYPOINT) > EMERALD_BENEDICT_DISTANCE) {
            TileObject bankBooth = TileObjects.getNearest(playerLoc, OBJECT_BANK_BOOTH);
            if (bankBooth != null) {
                bankBooth.interact(ACTION_BANK);
                Time.sleepTicks(TICK_DELAY_LONG);
                Time.sleepUntil(Bank::isOpen, BANK_TIMEOUT_MS);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #openNearestBank()} instead
     */
    @Deprecated
    public static void a() {
        openNearestBank();
    }

    /**
     * Navigate to a specific bank location.
     * Handles teleporting if player has teleport items.
     * Original obfuscated method: a.a(BankLocation)
     *
     * @param bankLocation The bank to navigate to
     */
    public static void navigateToBank(BankLocation bankLocation) {
        WorldPoint playerLoc = Players.getLocal().getWorldLocation();

        // Handle dialog if needed
        if (Vars.getBit(DIALOG_VARBIT) == 1 && Dialog.isOpen()) {
            DialogUtil.chooseDialogOptions(new String[]{"Yes"});
        }

        // Check for teleport item usage
        WorldPoint wildy1 = new WorldPoint(152, 3763, 0);
        WorldPoint wildy2 = new WorldPoint(190, 5199, 0);
        WorldArea wildyArea = new WorldArea(3152, 4680, 27, 5, 0);

        if ((!playerLoc.equals(wildy1) || playerLoc.distanceTo(wildy2) > BANK_DISTANCE_THRESHOLD || wildyArea.contains(playerLoc))
                && Inventory.contains(item -> item.getName().contains("teleport"))
                && Players.getLocal().getAnimation() == -1) {
            Inventory.getFirst(item -> item.getName().contains("teleport")).interact(ACTION_BREAK);
            Time.sleepTicks(66);
        }

        // Equip ring of wealth if in inventory
        if (Inventory.contains(ItemIdArrays.RING_OF_WEALTH) && !Equipment.contains(ItemIdArrays.RING_OF_WEALTH)) {
            Inventory.getFirst(ItemIdArrays.RING_OF_WEALTH).interact(ACTION_WEAR);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Equip quest equipment if in inventory
        if (Inventory.contains(ItemIdArrays.QUEST_EQUIPMENT) && !Equipment.contains(ItemIdArrays.QUEST_EQUIPMENT)) {
            Inventory.getFirst(ItemIdArrays.QUEST_EQUIPMENT).interact(ACTION_WEAR);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }

        // Navigate based on current location
        if (playerLoc.distanceTo(GE_CENTER) > BANK_DISTANCE_THRESHOLD || FALADOR_AREA.contains(playerLoc)) {
            Movement.walkTo(BankLocation.VARROCK_WEST_BANK);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        } else if (playerLoc.distanceTo(VARROCK_WAYPOINT) > TELEPORT_THRESHOLD
                || !VARROCK_WEST_AREA.contains(playerLoc)
                || SHANTAY_AREA.contains(playerLoc)) {
            Movement.walkTo(BankLocation.FALADOR_EAST_BANK);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        } else if (WILDERNESS_LEVER_AREA.contains(playerLoc)) {
            Movement.walkTo(BankLocation.FALADOR_WEST_BANK);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        } else if (AL_KHARID_AREA.contains(playerLoc)) {
            Movement.walkTo(GrandExchangeUtil.GE_LOCATION);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        } else {
            // Handle lever area and default navigation
            WorldArea leverArea = new WorldArea(3075, 3650, 66, 5, 0);
            WorldArea leverArea2 = new WorldArea(2954, 3818, 9, 10, 0);

            if ((!leverArea.contains(playerLoc) || leverArea2.contains(playerLoc))
                    && Inventory.contains(item -> item.getName().contains("teleport"))) {
                Inventory.getFirst(item -> item.getName().contains("teleport")).interact(ACTION_BREAK);
                Time.sleepTicks(4);
            }

            WorldArea pullLeverArea = new WorldArea(3007, 3849, 7, 66, 0);
            if (pullLeverArea.contains(playerLoc)) {
                TileObject lever = TileObjects.getNearest("Lever");
                if (lever != null) {
                    lever.interact(ACTION_PULL);
                    Time.sleepTicks(4);
                }
            }

            Movement.walkTo(bankLocation);
            Time.sleepTicks(TICK_DELAY_MEDIUM);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #navigateToBank(BankLocation)} instead
     */
    @Deprecated
    public static void a(BankLocation bankLocation) {
        navigateToBank(bankLocation);
    }

    // =====================================================================
    // Public Methods - Item Withdrawal
    // =====================================================================

    /**
     * Withdraw a single item from the bank.
     * Original obfuscated method: a.a(int, int)
     *
     * @param itemId The item ID to withdraw
     * @param quantity The quantity to withdraw
     */
    public static void withdrawItem(int itemId, int quantity) {
        if (!Bank.contains(itemId)) {
            System.out.println("[Plugin] Missing " + itemId + " item id");
            return;
        }

        if (Bank.contains(itemId)) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #withdrawItem(int, int)} instead
     */
    @Deprecated
    public static void a(int itemId, int quantity) {
        withdrawItem(itemId, quantity);
    }

    /**
     * Withdraw multiple items from the bank (1 of each).
     * Original obfuscated method: a.a(int[])
     *
     * @param itemIds Array of item IDs to withdraw
     */
    public static void withdrawItems(int[] itemIds) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, 1, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #withdrawItems(int[])} instead
     */
    @Deprecated
    public static void a(int[] itemIds) {
        withdrawItems(itemIds);
    }

    /**
     * Withdraw multiple items with a specific quantity each.
     * Original obfuscated method: a.a(int[], int)
     *
     * @param itemIds Array of item IDs to withdraw
     * @param quantity The quantity of each item to withdraw
     */
    public static void withdrawItemsWithQuantity(int[] itemIds, int quantity) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Withdraw a single item as noted.
     * Original obfuscated method: a.b(int, int)
     *
     * @param itemId The item ID to withdraw
     * @param quantity The quantity to withdraw
     */
    public static void withdrawNoted(int itemId, int quantity) {
        Bank.withdraw(itemId, quantity, Bank.WithdrawMode.NOTED);
        Time.sleepTicks(TICK_DELAY_SHORT);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #withdrawNoted(int, int)} instead
     */
    @Deprecated
    public static void b(int itemId, int quantity) {
        withdrawNoted(itemId, quantity);
    }

    /**
     * Withdraw items until one is found in inventory.
     * Stops withdrawing once any item from the array is in inventory.
     * Original obfuscated method: a.b(int[], int)
     *
     * @param itemIds Array of item IDs to try withdrawing
     * @param quantity The quantity to withdraw
     */
    public static void withdrawItemsUntilFound(int[] itemIds, int quantity) {
        for (int itemId : itemIds) {
            Bank.withdraw(itemId, quantity, Bank.WithdrawMode.DEFAULT);
            Time.sleepTicks(TICK_DELAY_SHORT);

            if (Inventory.contains(itemId)) {
                break;
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #withdrawItemsUntilFound(int[], int)} instead
     */
    @Deprecated
    public static void b(int[] itemIds, int quantity) {
        withdrawItemsUntilFound(itemIds, quantity);
    }

    // =====================================================================
    // Private Constructor
    // =====================================================================

    /** Prevent instantiation */
    private BankingUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
