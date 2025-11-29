/*
 * Deobfuscated from class 'e' in package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * GameStateUtil provides utility methods for checking and modifying game state
 * in OSRS. Includes methods for combat settings, world hopping, player status,
 * inventory/equipment management, and navigation.
 *
 * Original obfuscated methods:
 *   j(int) -> getVarbit(int varbitId)
 *   c(int, int) -> randomRange(int min, int max)
 *   c(int[]) -> hasAllItemsInBank(int[] itemIds)
 *   w() -> getHealthPercentage()
 *   z() -> isGrandExchangeWarningEnabled()
 *   A() -> disableGrandExchangeWarning()
 *   B() -> isSettingsWindowOpen()
 *   C() -> openAllSettings()
 *   D() -> hopToRandomWorld()
 *   E() -> enableAutoRetaliate()
 *   F() -> disableAutoRetaliate()
 *   G() -> handleDeath()
 *   H() -> isInSafeArea()
 *   I() -> clickInterfaceButton()
 *   J() -> getCombatLevel()
 *   h(int) -> formatNumber(int number)
 *   b(long) -> formatTime(long millis)
 *   u() -> getRuntime()
 *   a(long) -> getElapsedTime(long startTime)
 *   i(int) -> bankContainsItem(int itemId)
 *   k(int) -> hopToWorld(int worldId)
 *   l(int) -> equipItem(int itemId)
 *   b(int[]) -> equipItems(int[] itemIds)
 *   s() -> isPlayerSkulled()
 *   t() -> handleConversationContinue()
 *   v() -> getRandomWorldFromList()
 *   x() -> closeBankAndHopWorld()
 *   y() -> closeEnterAmountWidget()
 *   a(HashMap, boolean, boolean) -> handleBanking(HashMap items, boolean depositInv, boolean depositEquip)
 *   a(WorldPoint) -> navigateToVeos(WorldPoint destination)
 *   b(WorldPoint) -> navigateToStronghold(WorldPoint destination)
 *   c(WorldPoint) -> clickTile(WorldPoint tile)
 *   c(String) -> writeToFile(String content)
 *   a(String, String) -> sendWebhook(String url, String message)
 */
package gg.squire.sotf.framework;

import gg.squire.account.AccBuilderSotf;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.World;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.WorldResult;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.NumberFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Utility class for game state operations and player management.
 * Provides methods for combat settings, world hopping, equipment, and navigation.
 */
public final class GameStateUtil {

    // Random number generator
    public static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    // Timing
    private static final long START_TIME_MILLIS = System.currentTimeMillis();
    private static final long START_TIME_NANOS = System.nanoTime();

    // Varbit IDs
    private static final int SKULL_VARBIT = 102;
    private static final int AUTO_RETALIATE_VARBIT = 172;
    private static final int COMBAT_LEVEL_VARBIT = 54;
    private static final int GE_WARNING_VARBIT_1 = 12;
    private static final int GE_WARNING_VARBIT_2 = 4538;

    // Widget IDs
    private static final int SETTINGS_WIDGET_GROUP = 60;
    private static final int SETTINGS_WIDGET_CHILD = 55;
    private static final int ALL_SETTINGS_WIDGET_GROUP = 116;
    private static final int ALL_SETTINGS_WIDGET_CHILD = 153;
    private static final int COMBAT_WIDGET_GROUP = 4539;
    private static final int ENTER_AMOUNT_WIDGET_GROUP = 162;
    private static final int INTERFACE_WIDGET_GROUP = 135;

    // Sleep constants
    private static final int TICK_DELAY_SHORT = 1;
    private static final int TICK_DELAY_MEDIUM = 2;
    private static final int TICK_DELAY_LONG = 3;
    private static final int RANDOM_SLEEP_MIN = 255;
    private static final int RANDOM_SLEEP_MAX = 1023;

    // World hop settings
    private static final int MAX_PLAYER_COUNT = 1999;
    private static final int MIN_PLAYER_COUNT = 44;
    private static final int EXCLUDED_WORLD_1 = 577;
    private static final int EXCLUDED_WORLD_2 = 2069;

    // Safe areas for death/respawn
    private static final WorldArea LUMBRIDGE_SAFE_AREA = new WorldArea(4676, 4476, 20, 16, 0);
    private static final WorldArea FEROX_SAFE_AREA = new WorldArea(32639, 3548, 55, 14, 1);
    private static final WorldPoint SAFE_POINT = new WorldPoint(2758, 6013, 2);
    private static final WorldArea DEATH_OFFICE_AREA = new WorldArea(2957, 3037, 89, 79, 0);

    // Bank location
    public static final WorldPoint VARROCK_WEST_BANK = new WorldPoint(3188, 2765, 0);

    // Conversation widget IDs
    private static final int[] CONVERSATION_WIDGET_IDS = {187, 157, 255, 184, 229};

    // World list for random hopping
    public static final int[] WORLD_LIST = buildWorldList();

    // Status messages
    private static final String STATUS_EQUIPPING = "Equipping gear";
    private static final String STATUS_NAV_VEOS = "Nav to veos";
    private static final String STATUS_HANDLE_VEOS = "Handle veos chat";
    private static final String STATUS_NAV_BANK = "Nav to Varrock W bank";
    private static final String STATUS_BANKING = "Handling banking";
    private static final String STATUS_DEATH = "Handling death";
    private static final String STATUS_OUTSIDE_GATE = "Nav to outside gate";
    private static final String STATUS_STRONGHOLD = "Nav to stronghold tile";

    // Actions
    private static final String ACTION_WEAR = "Wear";
    private static final String ACTION_WIELD = "Wield";
    private static final String ACTION_EQUIP = "Equip";
    private static final String ACTION_TALK_TO = "Talk-to";
    private static final String ACTION_OPEN = "Open";
    private static final String ACTION_USE = "Use";
    private static final String ACTION_TOGGLE = "Toggle";
    private static final String ACTION_CLOSE = "Close";
    private static final String ACTION_ALL_SETTINGS = "All Settings";
    private static final String ACTION_AUTO_RETALIATE = "Auto retaliate";

    // File path for mule data
    public static final String MULE_FILE_PATH = "C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";

    /**
     * Build the world list array with decoded values.
     */
    private static int[] buildWorldList() {
        return new int[]{
            4665, 4403, 3254, 2917, 529, 556, 561, 2245, 194, 6221,
            2170, 957, 5941, 1008, 508, 4645, 1001, 2031, 610, 2667,
            2031, 753, 2023, 1038, 770, 5145, 6057, 32639, 2637, 38,
            5949, 5221, 17, 5157, 2158, 1545, 5253, 5645, 5949, 5223,
            5117, 30013, 681, 5757, 6141, 5629, 1539, 5989, 1385, 6149,
            5117, 5381, 30061, 6037, 5597, 17, 31165, 5501, 2997, 19,
            29869, 5573, 1585, 5805, 4548, 1513, 5841, 29953, 4665, 2
        };
    }

    // ==================== VARBIT AND GAME STATE ====================

    /**
     * Get the value of a varbit.
     * Original obfuscated method: e.j(int)
     *
     * @param varbitId The varbit ID to query
     * @return The varbit value
     */
    public static int getVarbit(int varbitId) {
        return (Integer) GameThread.invokeLater(() -> Static.getClient().getVarpValue(varbitId));
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getVarbit(int)} instead
     */
    @Deprecated
    public static int j(int varbitId) {
        return getVarbit(varbitId);
    }

    /**
     * Check if the player has a skull (PK skull).
     * Original obfuscated method: e.s()
     *
     * @return true if player is skulled
     */
    public static boolean isPlayerSkulled() {
        return getVarbit(SKULL_VARBIT) > 0;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #isPlayerSkulled()} instead
     */
    @Deprecated
    public static boolean s() {
        return isPlayerSkulled();
    }

    /**
     * Get the player's combat level from varbit.
     * Original obfuscated method: e.J()
     *
     * @return The combat level
     */
    public static int getCombatLevel() {
        return getVarbit(COMBAT_LEVEL_VARBIT);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getCombatLevel()} instead
     */
    @Deprecated
    public static int J() {
        return getCombatLevel();
    }

    // ==================== PLAYER STATUS ====================

    /**
     * Get the player's current health as a percentage.
     * Original obfuscated method: e.w()
     *
     * @return Health percentage (0-100)
     */
    public static double getHealthPercentage() {
        double currentHp = Skills.getBoostedLevel(Skill.HITPOINTS);
        double maxHp = Skills.getLevel(Skill.HITPOINTS);
        return currentHp / maxHp * 100.0;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getHealthPercentage()} instead
     */
    @Deprecated
    public static double w() {
        return getHealthPercentage();
    }

    /**
     * Check if player is in a safe area (Lumbridge, Ferox, or Death Office).
     * Original obfuscated method: e.H()
     *
     * @return true if in a safe area
     */
    public static boolean isInSafeArea() {
        WorldPoint location = Players.getLocal().getWorldLocation();

        if (LUMBRIDGE_SAFE_AREA.contains(location)) {
            return true;
        }
        if (FEROX_SAFE_AREA.contains(location)) {
            return true;
        }
        if (location.distanceTo(SAFE_POINT) <= 20) {
            return true;
        }
        if (DEATH_OFFICE_AREA.contains(location)) {
            return false; // Not a safe respawn point
        }
        return false;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #isInSafeArea()} instead
     */
    @Deprecated
    public static boolean H() {
        return isInSafeArea();
    }

    // ==================== RANDOM AND TIMING ====================

    /**
     * Generate a random integer between min and max (inclusive).
     * Original obfuscated method: e.c(int, int)
     *
     * @param min Minimum value
     * @param max Maximum value
     * @return Random integer in range [min, max]
     */
    public static int randomRange(int min, int max) {
        int range = max - min;
        if (range == 0) {
            return min;
        }
        if (Math.abs(range) == 1) {
            return RANDOM.nextBoolean() ? min : max;
        }
        if (range < 0) {
            // Swap if min > max
            int temp = min;
            min = max;
            max = temp;
        }
        return min + RANDOM.nextInt(max - min + 1);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #randomRange(int, int)} instead
     */
    @Deprecated
    public static int c(int min, int max) {
        return randomRange(min, max);
    }

    /**
     * Get the current runtime in milliseconds.
     * Original obfuscated method: e.u()
     *
     * @return Runtime in milliseconds
     */
    public static long getRuntime() {
        return START_TIME_MILLIS + (System.nanoTime() - START_TIME_NANOS) / 1000000L;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getRuntime()} instead
     */
    @Deprecated
    public static long u() {
        return getRuntime();
    }

    /**
     * Get elapsed time since a start timestamp.
     * Original obfuscated method: e.a(long)
     *
     * @param startTime The start timestamp
     * @return Elapsed time in milliseconds
     */
    public static long getElapsedTime(long startTime) {
        return getRuntime() - startTime;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getElapsedTime(long)} instead
     */
    @Deprecated
    public static long a(long startTime) {
        return getElapsedTime(startTime);
    }

    // ==================== FORMATTING ====================

    /**
     * Format a number with US locale (comma separators).
     * Original obfuscated method: e.h(int)
     *
     * @param number The number to format
     * @return Formatted string
     */
    public static String formatNumber(int number) {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.US);
        return format.format(number);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #formatNumber(int)} instead
     */
    @Deprecated
    public static String h(int number) {
        return formatNumber(number);
    }

    /**
     * Format time in HH:MM:SS format.
     * Original obfuscated method: e.b(long)
     *
     * @param millis Time in milliseconds
     * @return Formatted time string
     */
    public static String formatTime(long millis) {
        long seconds = millis / 1000;
        String secondsStr = String.format("%02d", seconds % 60);
        String minutesStr = String.format("%02d", seconds % 3600 / 60);
        String hoursStr = String.format("%02d", seconds / 3600);
        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #formatTime(long)} instead
     */
    @Deprecated
    public static String b(long millis) {
        return formatTime(millis);
    }

    // ==================== COMBAT SETTINGS ====================

    /**
     * Enable auto retaliate.
     * Original obfuscated method: e.E()
     */
    public static void enableAutoRetaliate() {
        if (getVarbit(AUTO_RETALIATE_VARBIT) == 0) {
            if (!Tabs.isOpen(Tab.COMBAT)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
            if (Tabs.isOpen(Tab.COMBAT)) {
                Widget widget = Widgets.get(COMBAT_WIDGET_GROUP, 30);
                if (widget != null) {
                    widget.interact(ACTION_AUTO_RETALIATE);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #enableAutoRetaliate()} instead
     */
    @Deprecated
    public static void E() {
        enableAutoRetaliate();
    }

    /**
     * Disable auto retaliate.
     * Original obfuscated method: e.F()
     */
    public static void disableAutoRetaliate() {
        if (getVarbit(AUTO_RETALIATE_VARBIT) == 1) {
            if (!Tabs.isOpen(Tab.COMBAT)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
            if (Tabs.isOpen(Tab.COMBAT)) {
                Widget widget = Widgets.get(COMBAT_WIDGET_GROUP, 30);
                if (widget != null) {
                    widget.interact(ACTION_AUTO_RETALIATE);
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #disableAutoRetaliate()} instead
     */
    @Deprecated
    public static void F() {
        disableAutoRetaliate();
    }

    // ==================== GRAND EXCHANGE WARNINGS ====================

    /**
     * Check if Grand Exchange warning is enabled.
     * Original obfuscated method: e.z()
     *
     * @return true if GE warning is enabled
     */
    public static boolean isGrandExchangeWarningEnabled() {
        Integer varbit1 = (Integer) GameThread.invokeLater(() ->
            Static.getClient().getVarbitValue(GE_WARNING_VARBIT_1));
        Integer varbit2 = (Integer) GameThread.invokeLater(() ->
            Static.getClient().getVarbitValue(GE_WARNING_VARBIT_2));
        return varbit1 != 0 || varbit2 == 0;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #isGrandExchangeWarningEnabled()} instead
     */
    @Deprecated
    public static boolean z() {
        return isGrandExchangeWarningEnabled();
    }

    /**
     * Check if the settings window is open.
     * Original obfuscated method: e.B()
     *
     * @return true if settings window is visible
     */
    public static boolean isSettingsWindowOpen() {
        return Widgets.get(SETTINGS_WIDGET_GROUP, 1) != null;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #isSettingsWindowOpen()} instead
     */
    @Deprecated
    public static boolean B() {
        return isSettingsWindowOpen();
    }

    /**
     * Open the all settings menu.
     * Original obfuscated method: e.C()
     */
    public static void openAllSettings() {
        Widget widget = Widgets.get(ALL_SETTINGS_WIDGET_GROUP, ALL_SETTINGS_WIDGET_CHILD);
        if (widget != null) {
            widget.interact(ACTION_ALL_SETTINGS);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #openAllSettings()} instead
     */
    @Deprecated
    public static void C() {
        openAllSettings();
    }

    /**
     * Disable Grand Exchange warning messages.
     * Original obfuscated method: e.A()
     */
    public static void disableGrandExchangeWarning() {
        if (Dialog.isOpen()) {
            Dialog.close();
        }

        if (isGrandExchangeWarningEnabled()) {
            if (!isSettingsWindowOpen()) {
                openAllSettings();
            }

            if (isSettingsWindowOpen()) {
                // Select Warnings section
                Widget warningsWidget = Widgets.get(SETTINGS_WIDGET_GROUP, SETTINGS_WIDGET_CHILD, 7);
                if (warningsWidget != null) {
                    warningsWidget.interact("Select Warnings");
                    Time.sleepTicks(TICK_DELAY_SHORT);
                }

                // Toggle GE warning varbit 1
                if (Vars.getBit(GE_WARNING_VARBIT_1) == 0) {
                    Widget toggleWidget = Widgets.get(SETTINGS_WIDGET_GROUP, 19, 40);
                    if (toggleWidget != null) {
                        if (!toggleWidget.isVisible()) {
                            Widget scrollWidget = Widgets.get(SETTINGS_WIDGET_GROUP, 21, 5);
                            if (scrollWidget != null) {
                                Mouse.click(scrollWidget.getClickPoint().getX(),
                                           scrollWidget.getClickPoint().getY(), true);
                                Time.sleepTicks(TICK_DELAY_SHORT);
                            }
                        }
                        if (toggleWidget.isVisible()) {
                            toggleWidget.interact(ACTION_TOGGLE);
                            Time.sleepTicks(TICK_DELAY_SHORT);
                        }
                    }
                }

                // Toggle GE warning varbit 2
                if (Vars.getBit(GE_WARNING_VARBIT_2) == 0) {
                    Widget toggleWidget = Widgets.get(SETTINGS_WIDGET_GROUP, 19, 73);
                    if (toggleWidget != null) {
                        if (!toggleWidget.isVisible()) {
                            Widget scrollWidget = Widgets.get(SETTINGS_WIDGET_GROUP, 21, 5);
                            if (scrollWidget != null) {
                                Mouse.click(scrollWidget.getClickPoint().getX(),
                                           scrollWidget.getClickPoint().getY(), true);
                                Time.sleepTicks(TICK_DELAY_SHORT);
                            }
                        }
                        if (toggleWidget.isVisible()) {
                            toggleWidget.interact(ACTION_TOGGLE);
                            Time.sleepTicks(TICK_DELAY_MEDIUM);
                        }
                    }
                }
            }
        }

        // Close settings
        Widget closeWidget = Widgets.get(SETTINGS_WIDGET_GROUP, 4);
        if (closeWidget != null) {
            closeWidget.interact(ACTION_CLOSE);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #disableGrandExchangeWarning()} instead
     */
    @Deprecated
    public static void A() {
        disableGrandExchangeWarning();
    }

    // ==================== WORLD HOPPING ====================

    /**
     * Hop to a random members world.
     * Original obfuscated method: e.D()
     */
    public static void hopToRandomWorld() {
        World world = Worlds.getRandom(w ->
            w.isMembers()
            && w.getPlayerCount() < MAX_PLAYER_COUNT
            && w.getId() != Worlds.getCurrentId()
            && !w.getActivity().endsWith("total")
            && !w.getActivity().endsWith("PvP")
            && !w.getActivity().startsWith("PvP")
            && !w.getActivity().startsWith("High")
            && w.getId() != EXCLUDED_WORLD_1
            && w.getId() != EXCLUDED_WORLD_2
            && !w.getActivity().contains("Leagues")
            && !w.getActivity().contains("Beta")
            && !w.getActivity().contains("beta")
            && !w.getActivity().startsWith("Deadman")
            && !w.getActivity().endsWith("Deadman")
            && !w.getActivity().endsWith("Speedrunning")
            && !w.getActivity().startsWith("Beta")
            && w.getPlayerCount() > MIN_PLAYER_COUNT
        );

        if (world != null) {
            Worlds.hopTo(world);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #hopToRandomWorld()} instead
     */
    @Deprecated
    public static void D() {
        hopToRandomWorld();
    }

    /**
     * Hop to a specific world.
     * Original obfuscated method: e.k(int)
     *
     * @param worldId The world ID to hop to
     */
    public static void hopToWorld(int worldId) {
        if (Static.getClient().getWorld() != worldId) {
            WorldResult worldResult = Static.getWorldService().getWorlds();
            net.runelite.http.api.worlds.World apiWorld = worldResult.findWorld(worldId);

            if (apiWorld == null) {
                return;
            }

            if (Dialog.isOpen()) {
                Dialog.close();
            }

            World world = Static.getClient().createWorld();
            world.setActivity(apiWorld.getActivity());
            world.setAddress(apiWorld.getAddress());
            world.setId(apiWorld.getId());
            world.setPlayerCount(apiWorld.getPlayers());
            world.setLocation(apiWorld.getLocation());
            world.setTypes(WorldUtil.toWorldTypes((EnumSet) apiWorld.getTypes()));

            Worlds.hopTo(world);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #hopToWorld(int)} instead
     */
    @Deprecated
    public static void k(int worldId) {
        hopToWorld(worldId);
    }

    /**
     * Get a random world from the predefined world list.
     * Original obfuscated method: e.v()
     *
     * @return A random world ID
     */
    public static int getRandomWorldFromList() {
        int index = randomRange(0, WORLD_LIST.length - 1);
        return WORLD_LIST[index];
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #getRandomWorldFromList()} instead
     */
    @Deprecated
    public static int v() {
        return getRandomWorldFromList();
    }

    /**
     * Close bank and hop to a random world.
     * Original obfuscated method: e.x()
     */
    public static void closeBankAndHopWorld() {
        if (Bank.isOpen()) {
            Bank.close();
            Time.sleepTicks(4);
        }
        if (Dialog.isOpen()) {
            Dialog.close();
        }
        if (!Bank.isOpen()) {
            hopToRandomWorld();
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #closeBankAndHopWorld()} instead
     */
    @Deprecated
    public static void x() {
        closeBankAndHopWorld();
    }

    // ==================== INVENTORY AND EQUIPMENT ====================

    /**
     * Check if the bank contains an item.
     * Original obfuscated method: e.i(int)
     *
     * @param itemId The item ID to check
     * @return true if bank contains the item
     */
    public static boolean bankContainsItem(int itemId) {
        return Bank.contains(itemId);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #bankContainsItem(int)} instead
     */
    @Deprecated
    public static boolean i(int itemId) {
        return bankContainsItem(itemId);
    }

    /**
     * Check if bank contains all specified items.
     * Original obfuscated method: e.c(int[])
     *
     * @param itemIds Array of item IDs to check
     * @return true if all items are in the bank
     */
    public static boolean hasAllItemsInBank(int[] itemIds) {
        for (int itemId : itemIds) {
            if (!bankContainsItem(itemId)) {
                System.out.println("Missing ID: " + itemId);
                return false;
            }
        }
        return true;
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #hasAllItemsInBank(int[])} instead
     */
    @Deprecated
    public static boolean c(int[] itemIds) {
        return hasAllItemsInBank(itemIds);
    }

    /**
     * Equip an item from inventory.
     * Original obfuscated method: e.l(int)
     *
     * @param itemId The item ID to equip
     */
    public static void equipItem(int itemId) {
        if (Inventory.contains(itemId) && !Equipment.contains(itemId)) {
            var item = Inventory.getFirst(itemId);
            if (item == null) return;

            if (item.hasAction(ACTION_WEAR)) {
                item.interact(ACTION_WEAR);
            } else if (item.hasAction(ACTION_WIELD)) {
                item.interact(ACTION_WIELD);
            } else if (item.hasAction(ACTION_EQUIP)) {
                item.interact(ACTION_EQUIP);
            }

            // Special case for amulet of glory (request skull)
            if (itemId == 1712) {
                Time.sleepTicks(TICK_DELAY_LONG);
                DialogUtil.chooseDialogOptions(new String[]{"Give me a PK skull."});
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #equipItem(int)} instead
     */
    @Deprecated
    public static void l(int itemId) {
        equipItem(itemId);
    }

    /**
     * Equip multiple items from inventory.
     * Original obfuscated method: e.b(int[])
     *
     * @param itemIds Array of item IDs to equip
     */
    public static void equipItems(int[] itemIds) {
        for (int itemId : itemIds) {
            AccBuilderSotf.c = STATUS_EQUIPPING;
            if (itemId == 0) {
                continue;
            }
            Time.sleepTicks(TICK_DELAY_SHORT);
            equipItem(itemId);
            Time.sleep(randomRange(RANDOM_SLEEP_MIN, RANDOM_SLEEP_MAX));
        }
        Time.sleepTicks(randomRange(1, 3));
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #equipItems(int[])} instead
     */
    @Deprecated
    public static void b(int[] itemIds) {
        equipItems(itemIds);
    }

    // ==================== DIALOG AND UI ====================

    /**
     * Handle conversation continue buttons.
     * Original obfuscated method: e.t()
     */
    public static void handleConversationContinue() {
        for (int widgetId : CONVERSATION_WIDGET_IDS) {
            Widget continueWidget = Widgets.get(widgetId,
                widget -> widget.getText().contains("continue"));
            if (continueWidget != null) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window: " + widgetId);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #handleConversationContinue()} instead
     */
    @Deprecated
    public static void t() {
        handleConversationContinue();
    }

    /**
     * Close the enter amount widget.
     * Original obfuscated method: e.y()
     */
    public static void closeEnterAmountWidget() {
        Widget widget = Widgets.get(ENTER_AMOUNT_WIDGET_GROUP, 29, 0);
        if (widget != null) {
            widget.interact(ACTION_CLOSE);
            Time.sleepTicks(TICK_DELAY_LONG);
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #closeEnterAmountWidget()} instead
     */
    @Deprecated
    public static void y() {
        closeEnterAmountWidget();
    }

    /**
     * Click an interface button.
     * Original obfuscated method: e.I()
     */
    public static void clickInterfaceButton() {
        List<Widget> widgets = Widgets.get(INTERFACE_WIDGET_GROUP);
        if (!widgets.isEmpty()) {
            Widget widget = Widgets.get(INTERFACE_WIDGET_GROUP, 24);
            if (widget != null) {
                Mouse.click(widget.getClickPoint().getX(),
                           widget.getClickPoint().getY(), true);
                Time.sleepTicks(TICK_DELAY_LONG);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #clickInterfaceButton()} instead
     */
    @Deprecated
    public static void I() {
        clickInterfaceButton();
    }

    // ==================== DEATH HANDLING ====================

    /**
     * Handle death dialog and respawn through portal.
     * Original obfuscated method: e.G()
     */
    public static void handleDeath() {
        if (TileObjects.getNearest("Death's Coffer") == null || !AccBuilderSotf.d) {
            return;
        }

        AccBuilderSotf.c = STATUS_DEATH;
        NPC death = NPCs.getNearest("Death");
        boolean handledDialog = false;

        if (!handledDialog) {
            if (!Dialog.isOpen()) {
                if (death != null) {
                    death.interact(ACTION_TALK_TO);
                }
            }
            if (Dialog.isOpen()) {
                // Look for non-strikethrough options
                if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
                    List<Widget> options = Dialog.getOptions();
                    if (!options.isEmpty()) {
                        List<Widget> validOptions = options.stream()
                            .filter(widget -> !widget.getText().contains("<str>"))
                            .collect(Collectors.toList());

                        if (!validOptions.isEmpty()) {
                            Widget option = validOptions.get(0);
                            Mouse.click(option.getClickPoint().getX(),
                                       option.getClickPoint().getY(), true);
                            Time.sleepTicks(TICK_DELAY_LONG);
                        }
                        if (validOptions.size() == 1) {
                            handledDialog = true;
                        }
                    }
                }

                if (Dialog.canContinueNPC() || Dialog.canContinue()) {
                    Dialog.continueSpace();
                }
            }
        }

        if (handledDialog) {
            // Use portal to respawn
            var portal = TileObjects.getNearest("Portal");
            if (portal != null) {
                portal.interact(ACTION_USE);
                Time.sleepTicks(5);
            }
        }

        Time.sleepTicks(TICK_DELAY_SHORT);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #handleDeath()} instead
     */
    @Deprecated
    public static void G() {
        handleDeath();
    }

    // ==================== BANKING ====================

    /**
     * Handle banking operations - deposit and withdraw items.
     * Original obfuscated method: e.a(HashMap, boolean, boolean)
     *
     * @param items Map of item IDs to quantities to withdraw
     * @param depositInventory Whether to deposit inventory
     * @param depositEquipment Whether to deposit equipment
     */
    public static void handleBanking(HashMap<Integer, Integer> items,
                                     boolean depositInventory,
                                     boolean depositEquipment) {
        // Navigate to bank if far away
        if (Players.getLocal().getWorldLocation().distanceTo(VARROCK_WEST_BANK) > 4) {
            AccBuilderSotf.c = STATUS_NAV_BANK;
            WorldArea bankArea = new WorldArea(4556, 2046, 45, 40, 0);

            // Break energy potion if in bank area
            if (bankArea.contains(Players.getLocal().getWorldLocation())
                    && Inventory.contains(2477)) {
                Inventory.getFirst(2477).interact("Break");
                Time.sleepTicks(8);
            }

            Movement.walkTo(VARROCK_WEST_BANK);
            Time.sleepTicks(TICK_DELAY_SHORT);
        }

        // Open bank and handle items
        if (Players.getLocal().getWorldLocation().distanceTo(VARROCK_WEST_BANK) <= 4) {
            if (!Bank.isOpen()) {
                BankingUtil.openNearestBank();
            }

            AccBuilderSotf.c = STATUS_BANKING;

            if (depositInventory && !Inventory.getAll().isEmpty()) {
                Bank.depositInventory();
                Time.sleepTicks(4);
            }

            if (depositEquipment && !Equipment.getAll().isEmpty()) {
                Bank.depositEquipment();
                Time.sleepTicks(TICK_DELAY_MEDIUM);
            }

            // Withdraw requested items
            for (Map.Entry<Integer, Integer> entry : items.entrySet()) {
                int itemId = entry.getKey();
                int quantity = entry.getValue();
                System.out.println("Key: " + itemId + ", Value: " + quantity);
                BankingUtil.withdrawItem(itemId, quantity);
                Time.sleepTicks(TICK_DELAY_SHORT);
            }
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #handleBanking(HashMap, boolean, boolean)} instead
     */
    @Deprecated
    public static void a(HashMap<Integer, Integer> items,
                         boolean depositInventory,
                         boolean depositEquipment) {
        handleBanking(items, depositInventory, depositEquipment);
    }

    // ==================== NAVIGATION ====================

    /**
     * Click on a specific tile in the game world.
     * Original obfuscated method: e.c(WorldPoint)
     *
     * @param tile The world point to click
     */
    public static void clickTile(WorldPoint tile) {
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();

        if (player == null) {
            return;
        }

        int sceneX = tile.getX() - client.getBaseX();
        int sceneY = tile.getY() - client.getBaseY();

        Point screenPoint = Perspective.localToCanvas(client,
            LocalPoint.fromScene(sceneX, sceneY), client.getPlane());

        int x = (screenPoint != null) ? screenPoint.getX() : -1;
        int y = (screenPoint != null) ? screenPoint.getY() : -1;

        client.interact(0, MenuAction.WALK.getId(), sceneX, sceneY, x, y);
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #clickTile(WorldPoint)} instead
     */
    @Deprecated
    public static void c(WorldPoint tile) {
        clickTile(tile);
    }

    // ==================== FILE AND NETWORK ====================

    /**
     * Write content to the mule file.
     * Original obfuscated method: e.c(String)
     *
     * @param content The content to write
     */
    public static void writeToFile(String content) {
        try (FileWriter fileWriter = new FileWriter(MULE_FILE_PATH);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(content + System.getProperty("line.separator"));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Send a webhook message to a Discord webhook URL.
     * Original obfuscated method: e.a(String, String)
     *
     * @param webhookUrl The webhook URL
     * @param message The message to send
     */
    public static void sendWebhook(String webhookUrl, String message) {
        try {
            URL url = new URL(webhookUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String jsonPayload = "{\"content\": \"" + message + "\"}";

            try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                outputStream.writeBytes(jsonPayload);
                outputStream.flush();
            }

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Obfuscated method name preserved for compatibility.
     * @deprecated Use {@link #sendWebhook(String, String)} instead
     */
    @Deprecated
    public static void a(String webhookUrl, String message) {
        sendWebhook(webhookUrl, message);
    }

    // Prevent instantiation
    private GameStateUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
