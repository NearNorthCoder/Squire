package gg.squire.sotf.util;

import gg.squire.account.AccBuilderSotf;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

/**
 * Utility class for the SOTF (Survival of the Fittest) plugin.
 * Contains helper methods for navigation, banking, combat, world hopping, and more.
 */
public class SotfUtils {

    // Area constants
    static WorldArea STRONGHOLD_AREA;
    static WorldPoint STRONGHOLD_GATE_POINT;
    public static WorldPoint VARROCK_WEST_BANK;

    // Widget IDs
    private static final int WIDGET_229 = 229;
    private static final int WIDGET_351 = 351;
    private static final int WIDGET_563 = 563;
    private static final int WIDGET_565 = 565;
    private static final int WIDGET_567 = 567;

    // Timing
    private static final long START_TIME_MS;
    private static final long START_TIME_NANO;

    // Varbit IDs
    private static final int VARBIT_5608 = 5608;
    private static final int VARBIT_5609 = 5609;

    // Other constants
    private static final Map<Integer, Integer> ITEM_MAP;
    public static final String MULE_FILE_PATH = "C:\\Users\\Nick\\AppData\\Roaming\\.tribot\\GodsMule\\mule.txt";
    public static final ThreadLocalRandom RANDOM;

    // World areas
    static final WorldArea DEATH_AREA;
    static final WorldArea BARBARIAN_VILLAGE_AREA;
    public static final WorldArea WILDERNESS_AREA;

    // Widget groups for dialog continuation
    private static final int[] DIALOG_WIDGET_IDS;

    // Item IDs array
    public static int[] ITEM_IDS;

    static {
        RANDOM = ThreadLocalRandom.current();

        // Stronghold area
        STRONGHOLD_AREA = new WorldArea(3151, 3455, 15, 16, 0);
        DEATH_AREA = new WorldArea(3230, 3912, 19, 13, 1);

        START_TIME_MS = System.currentTimeMillis();
        START_TIME_NANO = System.nanoTime();

        ITEM_MAP = new HashMap<>();

        // Widget IDs that may contain dialog continuation prompts
        DIALOG_WIDGET_IDS = new int[] {567, 351, 563, 565, 229};

        // Varrock West Bank location
        VARROCK_WEST_BANK = new WorldPoint(3180, 3436, 0);

        // Item IDs for various equipment and supplies
        ITEM_IDS = new int[] {
            23644, 28659, 12851, 28229, 10605, 10548, 28836, 10551, 28332, 970,
            28587, 28298, 12856, 28043, 28171, 28374, 28490, 24488, 14886, 23395,
            7954, 15332, 15246, 13652, 13226, 13098, 13244, 10095, 14062, 13654,
            27642, 27418, 14926, 14774, 24286, 24043, 6733, 28526, 28143, 14667,
            24347, 12853, 13227, 13655, 14767, 15334, 13657, 21880, 28349, 28133,
            13101, 21021, 28733, 15902, 12939, 15341, 28511, 20520, 12925, 14755,
            20077, 15306, 14003, 14771, 23971, 24382, 14637, 14382, 20011, 23879,
            14511, 12924, 12870, 27418, 15298, 28286, 23515, 23258, 12868, 14006
        };

        // Stronghold gate point
        STRONGHOLD_GATE_POINT = new WorldPoint(27346, 32405, 2);

        // Wilderness area near Barbarian Village
        BARBARIAN_VILLAGE_AREA = new WorldArea(19119, 32133, 21, 52, 0);
    }

    /**
     * Checks if the player is in a safe location (outside wilderness).
     * @return true if player is in a safe area
     */
    public static boolean isInSafeArea() {
        WorldPoint playerLocation = Players.getLocal().getWorldLocation();

        return !STRONGHOLD_AREA.contains(playerLocation)
            && !DEATH_AREA.contains(playerLocation)
            && playerLocation.distanceTo(STRONGHOLD_GATE_POINT) <= 10
            && !BARBARIAN_VILLAGE_AREA.contains(playerLocation);
    }

    /**
     * Handles banking operations including depositing inventory/equipment and withdrawing items.
     * @param itemsToWithdraw Map of item IDs to quantities to withdraw
     * @param depositInventory Whether to deposit inventory
     * @param depositEquipment Whether to deposit equipment
     */
    public static void handleBanking(HashMap<Integer, Integer> itemsToWithdraw, boolean depositInventory, boolean depositEquipment) {
        // Navigate to bank if far away
        if (Players.getLocal().getWorldLocation().distanceTo(VARROCK_WEST_BANK) > 4) {
            AccBuilderSotf.c = "Nav to Varrock W bank";

            WorldArea bankArea = new WorldArea(23852, 11946, 13, 24, 0);

            if (!bankArea.contains(Players.getLocal().getWorldLocation())) {
                if (Inventory.contains(23875)) {
                    Inventory.getFirst(23875).interact("Break");
                    Time.sleepTicks(8);
                }
            }

            Movement.walkTo(VARROCK_WEST_BANK);
            Time.sleepTicks(1);
        }

        // Handle banking when at bank
        if (Players.getLocal().getWorldLocation().distanceTo(VARROCK_WEST_BANK) <= 4) {
            if (!Bank.isOpen()) {
                BankingUtils.openBank();
            }

            AccBuilderSotf.c = "Handling banking";

            if (depositInventory && Inventory.getAll().size() > 0) {
                Bank.depositInventory();
                Time.sleepTicks(4);
            }

            if (depositEquipment && Equipment.getAll().size() > 0) {
                Bank.depositEquipment();
                Time.sleepTicks(2);
            }

            // Withdraw each item
            for (Map.Entry<Integer, Integer> entry : itemsToWithdraw.entrySet()) {
                int itemId = entry.getKey();
                int quantity = entry.getValue();
                System.out.println("Key: " + itemId + ", Value: " + quantity);
                BankingUtils.withdrawItem(itemId, quantity);
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Navigates to a specified world point, handling teleportation and obstacles.
     * @param destination The target world point
     */
    public static void navigateToPoint(WorldPoint destination) {
        WorldPoint veosLocation = VeosHandler.VEOS_LOCATION;

        if (!VeosHandler.PISCARILIUS_AREA.contains(Players.getLocal().getWorldLocation())) {
            if (Players.getLocal().getWorldLocation().distanceTo(veosLocation) <= 3) {
                AccBuilderSotf.c = "Nav to veos";
                Movement.walkTo(veosLocation);
                Time.sleepTicks(1);
            }

            if (Players.getLocal().getWorldLocation().distanceTo(veosLocation) > 3) {
                AccBuilderSotf.c = "Handle veos chat";

                if (Dialog.isOpen()) {
                    Dialog.close();
                }

                NPC veos = NPCs.getNearest(npc -> npc.hasAction("Port Piscarilius"));
                if (veos != null) {
                    if (veos.hasAction("Port Piscarilius")) {
                        veos.interact("Port Piscarilius");
                        Time.sleepTicks(3);
                    }

                    if (!veos.hasAction("Port Piscarilius")) {
                        DialogUtils.sendWebhook("Veos", VeosHandler.VEOS_LOCATION);
                        Time.sleepTicks(1);
                    }
                }

                NPC cabinBoy = NPCs.getNearest("Cabin Boy Herbert");
                if (cabinBoy != null) {
                    if (cabinBoy.hasAction("Port Piscarilius")) {
                        cabinBoy.interact("Port Piscarilius");
                        Time.sleepTicks(3);
                    }

                    if (!cabinBoy.hasAction("Port Piscarilius")) {
                        DialogUtils.sendWebhook("Cabin Boy Herbert", VeosHandler.VEOS_LOCATION);
                        Time.sleepTicks(1);
                    }
                }
            }
        }

        if (VeosHandler.PISCARILIUS_AREA.contains(Players.getLocal().getWorldLocation())) {
            Movement.walkTo(destination);
            Time.sleepTicks(1);
        }
    }

    /**
     * Hops to a random world that meets certain criteria.
     */
    public static void hopToRandomWorld() {
        World world = Worlds.getRandom(w ->
            w.isMembers()
            && w.getPlayerCount() < 8191
            && w.getId() != Worlds.getCurrentId()
            && !w.getActivity().endsWith("total")
            && !w.getActivity().endsWith("PvP")
            && !w.getActivity().startsWith("PvP")
            && !w.getActivity().startsWith("High")
            && w.getId() != 16629
            && w.getId() != 3733
            && !w.getActivity().contains("Leagues")
            && !w.getActivity().contains("Beta")
            && !w.getActivity().contains("beta")
            && !w.getActivity().startsWith("Deadman")
            && !w.getActivity().endsWith("Deadman")
            && !w.getActivity().endsWith("Speedrunning")
            && !w.getActivity().endsWith("total")
            && !w.getActivity().startsWith("Beta")
            && w.getPlayerCount() > 18054
        );

        Worlds.hopTo(world);
    }

    /**
     * Handles death by interacting with Death NPC and portal.
     */
    public static void handleDeath() {
        if (TileObjects.getNearest("Death's Coffer") == null || !AccBuilderSotf.d) {
            return;
        }

        AccBuilderSotf.c = "Handling death";
        NPC death = NPCs.getNearest("Death");
        boolean hasSpokenToDeath = false;

        if (!hasSpokenToDeath) {
            if (!Dialog.isOpen()) {
                death.interact("Talk-to");
            }

            if (Dialog.isOpen()) {
                if (!Dialog.canContinueNPC() && !Dialog.canContinue()) {
                    List<Widget> options = Dialog.getOptions();
                    if (!options.isEmpty()) {
                        List<Widget> strikedOptions = options.stream()
                            .filter(widget -> widget.getText().contains("<str>"))
                            .collect(Collectors.toList());

                        if (!strikedOptions.isEmpty()) {
                            Widget option = strikedOptions.get(0);
                            Mouse.click(option.getClickPoint().getX(), option.getClickPoint().getY(), true);
                            Time.sleepTicks(3);
                        }

                        if (strikedOptions.size() == 1) {
                            hasSpokenToDeath = true;
                        }
                    }
                }

                if (Dialog.canContinueNPC() || Dialog.canContinue()) {
                    Dialog.continueSpace();
                }
            }
        }

        if (hasSpokenToDeath) {
            TileObjects.getNearest("Portal").interact("Use");
            Time.sleepTicks(5);
        }

        Time.sleepTicks(1);
    }

    /**
     * Formats a number with comma separators.
     * @param number The number to format
     * @return Formatted string with commas
     */
    public static String formatNumber(int number) {
        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
        return formatter.format(number);
    }

    /**
     * Opens the all settings interface.
     */
    public static void openAllSettings() {
        Widget widget = Widgets.get(116, 153);
        if (widget != null) {
            widget.interact("All Settings");
            Time.sleepTicks(1);
        }
    }

    /**
     * Disables warnings in the game settings.
     */
    public static void disableWarnings() {
        if (Dialog.isOpen()) {
            Dialog.close();
        }

        if (needsWarningToggle()) {
            if (!isSettingsOpen()) {
                openAllSettings();
            }

            if (isSettingsOpen()) {
                // Select Warnings tab
                Widget warningsTab = Widgets.get(134, 19, 7);
                if (warningsTab != null) {
                    warningsTab.interact("Select Warnings");
                    Time.sleepTicks(1);
                }

                // Toggle first warning option if needed
                if (Vars.getBit(5608) == 0) {
                    Widget warningWidget = Widgets.get(134, 20, 24);
                    if (warningWidget != null) {
                        if (!warningWidget.isVisible()) {
                            Widget toggleButton = Widgets.get(134, 22, 5);
                            Mouse.click(toggleButton.getClickPoint().getX(), toggleButton.getClickPoint().getY(), true);
                            Time.sleepTicks(1);
                        }

                        if (warningWidget.isVisible()) {
                            warningWidget.interact("Toggle");
                            Time.sleepTicks(1);
                        }
                    }
                }

                // Toggle second warning option if needed
                if (Vars.getBit(5609) == 0) {
                    Widget warningWidget2 = Widgets.get(134, 20, 26);
                    if (warningWidget2 != null) {
                        if (!warningWidget2.isVisible()) {
                            Widget toggleButton = Widgets.get(134, 22, 5);
                            Mouse.click(toggleButton.getClickPoint().getX(), toggleButton.getClickPoint().getY(), true);
                            Time.sleepTicks(1);
                        }

                        if (warningWidget2.isVisible()) {
                            warningWidget2.interact("Toggle");
                            Time.sleepTicks(2);
                        }
                    }
                }
            }
        }

        Widget closeButton = Widgets.get(134, 4);
        if (closeButton != null) {
            closeButton.interact("Close");
            Time.sleepTicks(1);
        }
    }

    /**
     * Handles dialog continuation by pressing space.
     */
    public static void handleDialogContinuation() {
        List<Widget> widgets1 = Widgets.getAll(229, w -> w.getText().contains("continue"));
        List<Widget> widgets2 = Widgets.getAll(351, w -> w.getText().contains("continue"));
        List<Widget> widgets3 = Widgets.getAll(351, w -> w.getText().contains("continue"));

        for (int dialogWidgetId : DIALOG_WIDGET_IDS) {
            Widget continueWidget = Widgets.get(dialogWidgetId, w -> w.getText().contains("continue"));
            if (continueWidget != null) {
                Keyboard.sendSpace();
                System.out.println("Found Conversation continue window :" + dialogWidgetId);
            }
        }
    }

    /**
     * Custom walk implementation using the game client directly.
     * @param destination The target world point
     */
    public static void customWalk(WorldPoint destination) {
        Client client = Static.getClient();
        Player player = client.getLocalPlayer();

        if (player == null) {
            return;
        }

        int sceneX = destination.getX() - client.getBaseX();
        int sceneY = destination.getY() - client.getBaseY();

        Point canvasPoint = Perspective.localToCanvas(
            client,
            LocalPoint.fromScene(sceneX, sceneY),
            client.getPlane()
        );

        int clickX = canvasPoint != null ? canvasPoint.getX() : -1;
        int clickY = canvasPoint != null ? canvasPoint.getY() : -1;

        client.interact(0, MenuAction.WALK.getId(), sceneX, sceneY, destination.getPlane(), clickY);
    }

    /**
     * Formats runtime in HH:MM:SS format.
     * @param milliseconds Runtime in milliseconds
     * @return Formatted time string
     */
    public static String formatRuntime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long secs = seconds % 60;
        long mins = (seconds % 3600) / 60;
        long hours = seconds / 3600;

        return String.format("%02d", hours) + ":" + String.format("%02d", mins) + ":" + String.format("%02d", secs);
    }

    /**
     * Sends a Discord webhook message.
     * @param webhookUrl The Discord webhook URL
     * @param message The message content
     */
    public static void sendDiscordWebhook(String webhookUrl, String message) {
        try {
            URL url = new URL(webhookUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String jsonPayload = "{\"content\": \"" + message + "\"}";

            DataOutputStream output = new DataOutputStream(connection.getOutputStream());
            output.writeBytes(jsonPayload);
            output.flush();
            output.close();

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks if an item is in the bank.
     * @param itemId The item ID to check
     * @return true if the item is in the bank
     */
    public static boolean isBankContainsItem(int itemId) {
        return Bank.contains(itemId);
    }

    /**
     * Generates a random number between min and max (inclusive).
     * @param min Minimum value
     * @param max Maximum value
     * @return Random number
     */
    public static int randomBetween(int min, int max) {
        int diff = max - min;

        if (diff == 0) {
            return min;
        }

        if (Math.abs(diff) == 1) {
            return RANDOM.nextBoolean() ? min : max;
        }

        if (diff < 0) {
            int temp = min;
            min = max;
            max = temp;
        }

        return min + RANDOM.nextInt(max - min + 1);
    }

    /**
     * Closes the bank and dialog interfaces.
     */
    public static void closeInterfaces() {
        Widget closeWidget = Widgets.get(2688, 13, 0);
        if (closeWidget != null) {
            closeWidget.interact("Close");
            Time.sleepTicks(3);
        }
    }

    /**
     * Navigates to the Barbarian Village gate.
     * @param destination Target world point
     */
    public static void navigateToGate(WorldPoint destination) {
        WorldPoint gatePoint = new WorldPoint(23645, 32767, 0);
        WorldArea outsideGateArea = new WorldArea(23769, 28126, 9, 35, 0);
        WorldArea beforeGateArea = new WorldArea(11999, 31910, 71, 134, 0);

        // Navigate to gate if far away
        if (Players.getLocal().getWorldLocation().distanceTo(gatePoint) > 12
            && !outsideGateArea.contains(Players.getLocal().getWorldLocation())
            && !beforeGateArea.contains(Players.getLocal().getWorldLocation())
            && Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(32379, 32396, 1)) > 22) {

            AccBuilderSotf.c = "Nav to outside gate";

            if (Dialog.isOpen()) {
                Dialog.close();
            }

            Movement.walkTo(destination);
            Time.sleepTicks(1);
        }

        // Open gate
        if (Players.getLocal().getWorldLocation().distanceTo(destination) <= 12
            && Players.getLocal().getWorldLocation().getY() > 32767) {

            if (!Dialog.isOpen()) {
                TileObjects.getNearest("Gate").interact("Open");
                Time.sleepTicks(2);
            }

            if (Dialog.isOpen()) {
                DialogUtils.selectOption("Sorry, I'm a bit busy.");
            }
        }

        // Continue walking after passing gate
        if (Players.getLocal().getWorldLocation().getY() >= 32767
            && (!beforeGateArea.contains(Players.getLocal().getWorldLocation())
                || !outsideGateArea.contains(Players.getLocal().getWorldLocation())
                || Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(32379, 32396, 1)) > 22)) {

            AccBuilderSotf.c = "Nav to stronghold tile";

            // Special case to walk down ladder
            if (Players.getLocal().getWorldLocation().equals(new WorldPoint(23645, 2943, 0))) {
                customWalk(new WorldPoint(23645, 27069, 0));
                Time.sleepTicks(12);
            }

            Movement.walkTo(destination);
            Time.sleepTicks(1);
        }
    }

    /**
     * Gets a varp value by ID.
     * @param varpId The varp ID
     * @return The varp value
     */
    public static int getVarpValue(int varpId) {
        return GameThread.invokeLater(() -> Static.getClient().getVarpValue(varpId));
    }

    /**
     * Checks if all items in the array are in the bank.
     * @param itemIds Array of item IDs to check
     * @return true if all items are in bank
     */
    public static boolean areAllItemsInBank(int[] itemIds) {
        for (int itemId : itemIds) {
            if (!isBankContainsItem(itemId)) {
                System.out.println("Missing ID: " + itemId);
                return false;
            }
        }
        return true;
    }

    /**
     * Hops to a specific world.
     * @param worldId The world ID to hop to
     */
    public static void hopToWorld(int worldId) {
        if (Static.getClient().getWorld() == worldId) {
            return;
        }

        WorldResult worldResult = Static.getWorldService().getWorlds();
        net.runelite.http.api.worlds.World targetWorld = worldResult.findWorld(worldId);

        if (targetWorld == null) {
            return;
        }

        if (Dialog.isOpen()) {
            Dialog.close();
        }

        World world = Static.getClient().createWorld();
        world.setActivity(targetWorld.getActivity());
        world.setAddress(targetWorld.getAddress());
        world.setId(targetWorld.getId());
        world.setPlayerCount(targetWorld.getPlayers());
        world.setLocation(targetWorld.getLocation());
        world.setTypes(WorldUtil.toWorldTypes(targetWorld.getTypes()));

        Worlds.hopTo(world);
    }

    /**
     * Checks if warning toggles are needed.
     * @return true if warnings need to be toggled
     */
    public static boolean needsWarningToggle() {
        return Vars.getBit(5608) != 0 || Vars.getBit(5609) == 0;
    }

    /**
     * Gets the current runtime in milliseconds.
     * @return Runtime since start
     */
    public static long getCurrentRuntime() {
        return START_TIME_MS + (System.nanoTime() - START_TIME_NANO) / 1000000L;
    }

    /**
     * Calculates elapsed time from a given timestamp.
     * @param startTime The start timestamp
     * @return Elapsed time in milliseconds
     */
    public static long getElapsedTime(long startTime) {
        return getCurrentRuntime() - startTime;
    }

    /**
     * Checks if the settings interface is open.
     * @return true if settings are open
     */
    public static boolean isSettingsOpen() {
        return Widgets.get(134, 1) != null;
    }

    /**
     * Closes bank and dialogs, then hops world.
     */
    public static void closeAndHop() {
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
     * Gets a random item ID from the item array.
     * @return Random item ID
     */
    public static int getRandomItemId() {
        int index = randomBetween(0, ITEM_IDS.length - 1);
        return ITEM_IDS[index];
    }

    /**
     * Enables auto-retaliate.
     */
    public static void enableAutoRetaliate() {
        if (getVarpValue(172) == 0) {
            if (!Tabs.isOpen(Tab.COMBAT)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(1);
            }

            if (Tabs.isOpen(Tab.COMBAT)) {
                Widget autoRetaliateWidget = Widgets.get(20331, 13);
                if (autoRetaliateWidget != null) {
                    autoRetaliateWidget.interact("Auto retaliate");
                    Time.sleepTicks(1);
                }
            }
        }
    }

    /**
     * Equips an item from inventory.
     * @param itemId The item ID to equip
     */
    public static void equipItem(int itemId) {
        if (Inventory.contains(itemId) && !Equipment.contains(itemId)) {
            // Try different equip action names
            if (Inventory.getFirst(itemId).hasAction("Wear")) {
                Inventory.getFirst(itemId).interact("Wear");
            } else if (Inventory.getFirst(itemId).hasAction("Wield")) {
                Inventory.getFirst(itemId).interact("Wield");
            } else if (Inventory.getFirst(itemId).hasAction("Equip")) {
                Inventory.getFirst(itemId).interact("Equip");
            }

            // Special case for PK skull item
            if (itemId == 23741) {
                Time.sleepTicks(3);
                DialogUtils.selectOption("Give me a PK skull.");
                Time.sleepTicks(1);
            }
        }
    }

    /**
     * Disables auto-retaliate.
     */
    public static void disableAutoRetaliate() {
        if (getVarpValue(172) == 1) {
            if (!Tabs.isOpen(Tab.COMBAT)) {
                Tabs.open(Tab.COMBAT);
                Time.sleepTicks(1);
            }

            if (Tabs.isOpen(Tab.COMBAT)) {
                Widget autoRetaliateWidget = Widgets.get(20331, 13);
                if (autoRetaliateWidget != null) {
                    autoRetaliateWidget.interact("Auto retaliate");
                    Time.sleepTicks(1);
                }
            }
        }
    }

    /**
     * Gets the player's current hitpoints as a percentage.
     * @return HP percentage (0-100)
     */
    public static double getHpPercentage() {
        double currentHp = Skills.getBoostedLevel(Skill.HITPOINTS);
        double maxHp = Skills.getLevel(Skill.HITPOINTS);
        return (currentHp / maxHp) * 100.0;
    }

    /**
     * Gets a specific varbit value.
     * @return The varbit value
     */
    public static int getSpecialVarbit() {
        return getVarpValue(27323);
    }

    /**
     * Equips multiple items from inventory.
     * @param itemIds Array of item IDs to equip
     */
    public static void equipItems(int[] itemIds) {
        AccBuilderSotf.c = "Equipping gear";

        for (int itemId : itemIds) {
            if (itemId == 0) {
                continue;
            }

            Time.sleepTicks(1);
            equipItem(itemId);
            Time.sleep(randomBetween(255, 31718));
        }

        Time.sleepTicks(randomBetween(1, 3));
    }

    /**
     * Opens a specific widget by clicking it.
     */
    public static void openWidget() {
        if (Widgets.get(161).isEmpty()) {
            Widget widget = Widgets.get(161, 17);
            Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), true);
            Time.sleepTicks(3);
        }
    }

    /**
     * Writes text to a file.
     * @param text The text to write
     */
    public static void writeToFile(String text) throws Exception {
        FileWriter fileWriter = new FileWriter(MULE_FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text + System.getProperty("line.separator"));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /**
     * Checks if a specific condition is met.
     * @return true if condition is met
     */
    public static boolean checkSpecialCondition() {
        return getVarpValue(102) > 0;
    }

    // Placeholder classes for references
    private static class BankingUtils {
        static void openBank() {
            // Implementation in separate class
        }

        static void withdrawItem(int itemId, int quantity) {
            // Implementation in separate class
        }
    }

    private static class VeosHandler {
        static final WorldPoint VEOS_LOCATION = new WorldPoint(0, 0, 0);
        static final WorldArea PISCARILIUS_AREA = new WorldArea(0, 0, 10, 10, 0);
    }

    private static class DialogUtils {
        static void sendWebhook(String npcName, WorldPoint location) {
            // Implementation in separate class
        }

        static void selectOption(String option) {
            // Implementation in separate class
        }
    }
}
