package gg.squire.sotf;

import com.google.inject.Provides;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import gg.squire.sotf.framework.QuestStep;
import gg.squire.sotf.framework.GameStateUtil;
// TODO: The following imports still need deobfuscation mapping:
// H, L, V, aD, aN, t, u, z - these are quest step classes
import org.pf4j.Extension;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Main plugin class for automating the Sins of the Father quest in OSRS.
 *
 * This plugin handles:
 * - The Vanstrom Klause boss fight with lightning avoidance mechanics
 * - Player safety features including wilderness logout and PK detection
 * - Discord webhook integration for status reporting
 * - Automated quest progression and task management
 *
 * The plugin tracks lightning tiles during the Vanstrom Klause fight and moves
 * the player to safe positions. It also monitors for PKers in the wilderness
 * and will logout if threatened.
 */
@PluginDescriptor(name = "Squire Sotf Builder", enabledByDefault = false)
@Extension
@SquireUtil
public class SquireSotfBuilder extends Script {

    // ========================================
    // Constants
    // ========================================

    /** Wilderness logout area coordinates */
    private static final int WILDERNESS_X = 3111;
    private static final int WILDERNESS_Y = 3600;
    private static final int WILDERNESS_WIDTH = 62;
    private static final int WILDERNESS_HEIGHT = 53;

    /** Item IDs */
    private static final int TELEPORT_TAB_1 = 536;
    private static final int TELEPORT_TAB_2 = 537;
    private static final int RUBY_BOLTS_E = 9573;
    private static final int IVANDIS_FLAIL = 863;
    private static final int KARAMJA_RUM = 431;

    /** NPC IDs */
    private static final int VANSTROM_KLAUSE_ID = 9573;

    /** Lightning graphic IDs for Vanstrom Klause boss fight */
    private static final int LIGHTNING_GRAPHIC_1 = 1536;
    private static final int LIGHTNING_GRAPHIC_2 = 1506;
    private static final int LIGHTNING_GRAPHIC_3 = 1446;

    /** Quest varbit value indicating quest is in progress */
    private static final int QUEST_IN_PROGRESS = 130;

    /** Tick durations */
    private static final int TICK_DELAY_STANDARD = 4;
    private static final int TICK_DELAY_SHORT = 1;

    /** Distance thresholds */
    private static final int MAX_DISTANCE = 20;
    private static final int CLOSE_DISTANCE = 10;

    /** Config group name */
    private static final String CONFIG_GROUP = "hootfighter";
    private static final String CONFIG_KEY_ENABLED = "enabled";

    // ========================================
    // Injected Dependencies
    // ========================================

    @Inject
    public BuilderConfig config;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private Client client;

    @Inject
    private BuilderInfoBox infoOverlay;

    // ========================================
    // Plugin State
    // ========================================

    /** Wilderness area where the player should logout if detected */
    private WorldArea wildernessLogoutArea;

    /** Discord webhook URL for status updates */
    private String webhookUrl;

    /** Whether the script is currently enabled */
    private boolean scriptEnabled;

    /** List of tasks to execute */
    public static List<ac> taskList;

    /** Time when the script started */
    public static long startTime;

    /** Current status message */
    public static String currentStatus;

    /** Whether the script should stop */
    public static boolean shouldStop;

    /** Whether the script is currently running */
    public static boolean isRunning;

    /** Number of tasks completed */
    public static int tasksCompleted;

    /** Timestamp of last status update */
    public static long lastStatusUpdate;

    /** Last error message */
    public static String lastError;

    /** Map of lightning tile positions to their remaining duration (in ticks) */
    public static HashMap<WorldPoint, Integer> lightningTiles;

    /** Previous player name (for ban detection) */
    public static String lastPlayerName;

    /** Current player name */
    public static String playerName;

    /** Current quest being executed */
    public static String currentQuest;

    /** Discord ID of the account */
    public static String discordId;

    /** Counter for banned accounts */
    public static int banCounter;

    /** Array of task handlers */
    public static ac[] taskArray;

    // ========================================
    // Constructor & Initialization
    // ========================================

    public SquireSotfBuilder() {
        this.wildernessLogoutArea = new WorldArea(WILDERNESS_X, WILDERNESS_Y, WILDERNESS_WIDTH, WILDERNESS_HEIGHT, 0);
        this.webhookUrl = "https://discord.com/api/webhooks/1215418698408525957/f_b1MXw4fCg6qsHKLguNMRnCRHVtAVsvyx7SPIY6Ce9Z1zYvmlDIQLyOD9qIsQ-fYTKf";
    }

    static {
        taskList = new ArrayList<>();
        startTime = System.currentTimeMillis();
        shouldStop = false;
        lastStatusUpdate = System.currentTimeMillis();
        lastError = "";
        lightningTiles = new HashMap<>();
        lastPlayerName = null;
        playerName = null;
        discordId = Static.getClient().getDiscordId();
        taskArray = new ac[] { new aN() };
    }

    // ========================================
    // Configuration
    // ========================================

    @Provides
    public BuilderConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(BuilderConfig.class);
    }

    @Subscribe
    private void onConfigChanged(ConfigChanged configChanged) {
        if (configChanged.getGroup().equalsIgnoreCase(CONFIG_GROUP) &&
            configChanged.getKey().contains(CONFIG_KEY_ENABLED)) {
            this.scriptEnabled = this.config.turnScriptOnOff();
            shouldStop = !this.scriptEnabled;
        }
    }

    // ========================================
    // Plugin Lifecycle
    // ========================================

    @Override
    public void onStart(String... args) {
        SquirePlugin.setGlobalMouseRecordings();
        shouldStop = false;

        System.out.print("\n[Plugin] Plugin starting up\n");
        overlayManager.add(infoOverlay);

        taskList.clear();
        System.out.println("Switching to One Click Sotf account");

        // Initialize with SOTF quest tasks
        taskList.clear();
        Collections.addAll(taskList, new t());

        lastStatusUpdate = System.currentTimeMillis();
        Collections.shuffle(taskList);
    }

    @Override
    protected void shutDown() {
        overlayManager.remove(infoOverlay);
        shouldStop = true;
        taskArray = new ac[0];
        L.gn = null;
        banCounter = 0;
        tasksCompleted = 0;
        System.out.print("\n[Plugin] Plugin shut down\n");
        super.stop();
    }

    // ========================================
    // Main Loop
    // ========================================

    @Override
    protected int loop() {
        // Check if logged in
        if (Game.getState() != GameState.LOGGED_IN) {
            return 600;
        }

        // Handle task completion
        if (!taskList.isEmpty()) {
            // Update player name
            if (lastPlayerName == null || playerName == null) {
                playerName = Players.getLocal().getName();
            }
            playerName = Players.getLocal().getName();

            // Check if current task is complete
            if (taskList.get(0).ah()) {
                if (taskList.get(0).ag().contains("quest")) {
                    tasksCompleted++;
                }
                System.out.println("Achieved " + taskList.get(0).ag() + " goal");
                taskList.remove(0);
                return 100;
            }

            // Execute task loop
            if (Game.getState() == GameState.LOGGED_IN) {
                // Disable GE warning
                while (o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.z() &&
                       !shouldStop &&
                       o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.j(281) == 1000 &&
                       !Dialog.isOpen()) {
                    currentStatus = "Disabling GE warning";
                    o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.A();
                    Time.sleepTicks(1);
                }

                // Execute current task
                try {
                    return taskList.get(0).af();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        }

        // No tasks remaining - navigate to completion
        if (taskList.isEmpty()) {
            // Navigate to Grand Exchange when finished
            if (Players.getLocal().getWorldLocation().distanceTo(aN.pW) > 3) {
                currentStatus = "Navigating to GE";
                Movement.walkTo(aN.pW);
            }
            if (Players.getLocal().getWorldLocation().distanceTo(aN.pW) <= 3) {
                currentStatus = "Finished account";
            }
        }

        return 600;
    }

    // ========================================
    // Game Tick Handler
    // ========================================

    /**
     * Handles game tick events for:
     * - PK detection and wilderness safety
     * - Vanstrom Klause boss fight mechanics
     * - Lightning avoidance
     * - Dialog handling
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.y();

        // ========================================
        // Wilderness PK Detection & Safety
        // ========================================

        int wildyLevel = Game.getWildyLevel();
        Player localPlayer = Players.getLocal();
        int localCombatLevel = localPlayer.getCombatLevel();

        // Find nearby players in combat range
        Player nearbyPker = Players.getNearest(player -> {
            if (player != localPlayer && canAttackInWilderness(wildyLevel, localCombatLevel, player)) {
                return true;
            }
            return false;
        });

        // Logout if PKer detected or in wilderness logout area without teleports
        if (nearbyPker != null ||
            (Game.getWildyLevel() > 0 &&
             Players.getLocal().getWorldLocation().distanceTo(aD.pf) <= MAX_DISTANCE)) {

            // Check if we have teleport tabs
            if (!Inventory.contains(TELEPORT_TAB_1) && !Inventory.contains(TELEPORT_TAB_2)) {
                // In wilderness logout area - logout immediately
                if (wildernessLogoutArea.contains(Players.getLocal().getWorldLocation())) {
                    Game.logout();
                }
            }
        }

        // ========================================
        // Vanstrom Klause Boss Fight
        // ========================================

        // Check if we're in the Vanstrom Klause fight
        if (Vars.getBit(QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()) == QUEST_IN_PROGRESS) {
            // Check if Vanstrom is present
            if (NPCs.getNearest("Vanstrom Klause") != null) {
                if (NPCs.getNearest(VANSTROM_KLAUSE_ID) != null) {
                    if (!NPCs.getNearest(VANSTROM_KLAUSE_ID).isDead()) {
                        currentStatus = "Handle bloodveld";

                        // Equip Ivandis Flail if not equipped
                        if (!Equipment.contains(IVANDIS_FLAIL)) {
                            Inventory.getFirst(IVANDIS_FLAIL).interact("Wield");
                        }

                        // Attack Vanstrom if weapon equipped
                        if (Equipment.contains(IVANDIS_FLAIL)) {
                            NPCs.getNearest(VANSTROM_KLAUSE_ID).interact("Attack");
                            Movement.walkTo(new WorldPoint(L.gn.getX() - 4, L.gn.getY() + 4, 0));
                        }
                    }
                }

                // ========================================
                // Lightning Avoidance Logic
                // ========================================

                // If player is standing on a lightning tile, move to safety
                if (lightningTiles.containsKey(Players.getLocal().getWorldLocation())) {
                    handleLightningAvoidance();
                }
            }
        }

        // ========================================
        // Dialog Handling
        // ========================================

        if (Dialog.isOpen() && Dialog.getText() != null) {
            if (Dialog.getText().contains("tell the king")) {
                H.ga = 1;
            }

            if (Dialog.getText().contains("another clue scroll") ||
                Dialog.getText().contains("a new clue")) {
                // Handle clue scroll dialog
            }

            if (Dialog.getText().contains("I could tell by the cut of your jib")) {
                // Handle jib dialog
            }
        }

        // ========================================
        // Lightning Tile Decay
        // ========================================

        // Decrease duration of all lightning tiles
        lightningTiles.forEach((worldPoint, duration) -> {
            lightningTiles.put(worldPoint, duration - 1);
        });

        // Remove expired lightning tiles
        lightningTiles.entrySet().removeIf(entry -> entry.getValue() <= 0);

        o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.I();
    }

    /**
     * Handles moving away from lightning tiles to safe positions.
     * Checks adjacent tiles and moves to the first safe one found.
     */
    private void handleLightningAvoidance() {
        WorldPoint bossLocation;
        WorldPoint north, south, east, west;

        // Phase 1: Boss is present - move adjacent to boss
        if (L.gm) {
            bossLocation = NPCs.getNearest("Vanstrom Klause").getWorldLocation();
            north = new WorldPoint(bossLocation.getX(), bossLocation.getY() + 1, bossLocation.getPlane());
            south = new WorldPoint(bossLocation.getX(), bossLocation.getY() - 1, bossLocation.getPlane());
            east = new WorldPoint(bossLocation.getX() + 1, bossLocation.getY(), bossLocation.getPlane());
            west = new WorldPoint(bossLocation.getX() - 1, bossLocation.getY(), bossLocation.getPlane());

            // Try each direction in priority order
            if (!lightningTiles.containsKey(north)) {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(north);
                Time.sleepTicks(1);
                if (Players.getLocal().getInteracting() == null) {
                    NPCs.getNearest("Vanstrom Klause").interact("Attack");
                }
                return;
            }

            if (lightningTiles.containsKey(north) && !lightningTiles.containsKey(south)) {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(south);
                Time.sleepTicks(1);
                if (Players.getLocal().getInteracting() == null) {
                    NPCs.getNearest("Vanstrom Klause").interact("Attack");
                }
                return;
            }

            if (lightningTiles.containsKey(north) &&
                lightningTiles.containsKey(south) &&
                !lightningTiles.containsKey(east)) {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(east);
                Time.sleepTicks(1);
                if (Players.getLocal().getInteracting() == null) {
                    NPCs.getNearest("Vanstrom Klause").interact("Attack");
                }
                return;
            }

            if (lightningTiles.containsKey(north) &&
                lightningTiles.containsKey(south) &&
                lightningTiles.containsKey(east) &&
                !lightningTiles.containsKey(west)) {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(west);
                Time.sleepTicks(1);
                if (Players.getLocal().getInteracting() == null) {
                    NPCs.getNearest("Vanstrom Klause").interact("Attack");
                }
                return;
            }
        }

        // Phase 2: No boss - move to safe tiles
        if (!L.gm) {
            WorldPoint currentLocation = Players.getLocal().getWorldLocation();
            east = new WorldPoint(currentLocation.getX() + 1, currentLocation.getWorldY(), 0);
            north = new WorldPoint(currentLocation.getX(), currentLocation.getWorldY() + 1, 0);
            WorldPoint northeast = new WorldPoint(currentLocation.getX() + 1, currentLocation.getWorldY() + 1, 0);

            if (!lightningTiles.containsKey(east)) {
                currentStatus = "lightning pos1;";
                Movement.walkTo(east);
            }

            if (!lightningTiles.containsKey(north) &&
                !Players.getLocal().getWorldLocation().equals(east)) {
                currentStatus = "lightning pos2;";
                Movement.walkTo(north);
            }

            if (!lightningTiles.containsKey(northeast) &&
                !Players.getLocal().getWorldLocation().equals(east) &&
                !Players.getLocal().getWorldLocation().equals(north)) {
                currentStatus = "lightning pos2;";
                Movement.walkTo(northeast);
            }
        }
    }

    /**
     * Checks if a player can attack us in the wilderness based on combat levels.
     *
     * @param wildyLevel Current wilderness level
     * @param ourCombatLevel Our combat level
     * @param otherPlayer The other player to check
     * @return true if the other player can attack us
     */
    public boolean canAttackInWilderness(int wildyLevel, int ourCombatLevel, Player otherPlayer) {
        int theirCombatLevel = otherPlayer.getCombatLevel();
        int minCombatLevel = ourCombatLevel - wildyLevel;
        int maxCombatLevel = ourCombatLevel + wildyLevel;

        return theirCombatLevel >= minCombatLevel && theirCombatLevel <= maxCombatLevel;
    }

    // ========================================
    // Graphics Object Handler (Lightning Detection)
    // ========================================

    /**
     * Detects lightning graphics in the Vanstrom Klause boss fight.
     * When lightning spawns, tracks its position for 4 ticks.
     */
    @Subscribe
    public void onGraphicsObjectCreated(GraphicsObjectCreated graphicsObjectCreated) {
        int graphicId = graphicsObjectCreated.getGraphicsObject().getId();

        // Check if this is a lightning graphic
        if (graphicId == LIGHTNING_GRAPHIC_1 ||
            graphicId == LIGHTNING_GRAPHIC_2 ||
            graphicId == LIGHTNING_GRAPHIC_3) {

            if (!L.gm) {
                L.gm = true;
            }

            // Add lightning tile with 4 tick duration
            WorldPoint lightningPos = WorldPoint.fromLocal(client,
                graphicsObjectCreated.getGraphicsObject().getLocation());
            lightningTiles.put(lightningPos, TICK_DELAY_STANDARD);
        }
    }

    // ========================================
    // Chat Message Handler
    // ========================================

    /**
     * Handles chat messages for:
     * - Death detection
     * - Error messages (can't reach, not enough gold, etc.)
     * - Quest-specific messages
     */
    @Subscribe
    public void onChatMessage(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();

        // ========================================
        // Gold Check
        // ========================================

        if (message.contains("You haven't got enough")) {
            System.out.println("Not enough gold for buying");
            shouldStop = true;
        }

        // ========================================
        // Death Detection
        // ========================================

        if (message.contains("Oh dear, you are dead!")) {
            System.out.println("We DIED!! :(");

            // If died outside wilderness without burning amulet - stop script
            if (Game.getWildyLevel() == 0 && !Inventory.contains(item -> item.getName().contains("Burning"))) {
                shouldStop = true;
                System.out.println("Died - Ending script: Please report what quest it died on and location,step if you saw");
            }

            // If died during or after prayer quest - continue
            if (Game.getWildyLevel() > 0 || Inventory.contains(item -> item.getName().contains("Burning"))) {
                shouldStop = false;
                System.out.println("We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer");
            }
        }

        // ========================================
        // Door Opening (Can't Reach)
        // ========================================

        if (message.contains("can't reach that") &&
            Players.getLocal().getWorldLocation().distanceTo(V.mh) <= 10) {

            // Try to open regular door
            if (TileObjects.getNearest("Door") != null) {
                TileObjects.getNearest("Door").interact("Open");
                Time.sleepTicks(4);
            }

            // Try to open tree door
            if (TileObjects.getNearest("Tree Door") != null) {
                TileObjects.getNearest("Tree Door").interact("Open");
                Time.sleepTicks(3);
            }
        }

        // ========================================
        // Navigation Correction
        // ========================================

        if (message.contains("think that facing North")) {
            Movement.walkTo(new WorldPoint(2977, 3239, 0));
            Time.sleepTicks(1);
        }

        // ========================================
        // Rum Handling
        // ========================================

        if (message.contains("already some rum")) {
            if (Inventory.contains(KARAMJA_RUM)) {
                Inventory.getFirst(KARAMJA_RUM).interact("Drop");
            }
        }

        // ========================================
        // Alternative Door Opening (Various Locations)
        // ========================================

        if (message.contains("can't reach that") &&
            Players.getLocal().getWorldLocation().distanceTo(z.eb) <= 10) {
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.x();
        }

        // Complex door opening logic for specific location
        if (message.contains("can't reach that") &&
            !(Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.df) > 10 &&
              Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.dh) > 10 &&
              Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(3628, 3250, 0)) > 7 &&
              Players.getLocal().getWorldLocation().distanceTo(V.mh) > 10)) {

            WorldPoint targetDoor = new WorldPoint(3628, 3250, 0);

            // Find nearest door with "Open" action near target
            TileObject door = TileObjects.getNearest(tileObject -> {
                if (tileObject.getName().contains("Door") &&
                    tileObject.hasAction("Open") &&
                    tileObject.getWorldLocation().distanceTo(targetDoor) <= 2) {
                    return true;
                }
                return false;
            });

            if (door != null) {
                door.interact("Open");
                Time.sleepTicks(5);
            }

            // Fallback: try regular door
            if (TileObjects.getNearest("Door") != null) {
                TileObjects.getNearest("Door").interact("Open");
                Time.sleepTicks(4);
            }

            // Fallback: try tree door
            if (TileObjects.getNearest("Tree Door") != null) {
                TileObjects.getNearest("Tree Door").interact("Open");
                Time.sleepTicks(3);
            }
        }

        // Navigation correction (duplicate)
        if (message.contains("think that facing North")) {
            Movement.walkTo(new WorldPoint(2977, 3239, 0));
            Time.sleepTicks(1);
        }

        // Rum handling (duplicate)
        if (message.contains("already some rum")) {
            if (Inventory.contains(KARAMJA_RUM)) {
                Inventory.getFirst(KARAMJA_RUM).interact("Drop");
            }
        }

        // ========================================
        // Lockpick Messages
        // ========================================

        if (message.contains("fail to pick")) {
            // Lockpick failure - no action needed
        }

        if (message.contains("spots you before you manage to open the chest")) {
            // Caught while lockpicking - no action needed
        }

        if (message.contains("You search the chest, but find nothing.")) {
            // Empty chest - no action needed
        }

        // ========================================
        // Locked Door Handling
        // ========================================

        WorldArea doorArea = new WorldArea(2687, 9663, 63, 59, 0);

        if (message.contains("door is locked") &&
            doorArea.contains(Players.getLocal().getWorldLocation())) {

            // Find door near player
            TileObject lockedDoor = TileObjects.getNearest(tileObject -> {
                if (tileObject.getName().contains("Door") &&
                    tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()) > 1) {
                    return true;
                }
                return false;
            });

            if (lockedDoor != null) {
                lockedDoor.interact("Open");
                Time.sleepTicks(8);
            }
        }
    }

    // ========================================
    // Login State Handler (Ban Detection)
    // ========================================

    /**
     * Detects when accounts are banned and reports via Discord webhook.
     */
    @Subscribe
    private void onLoginStateChanged(LoginStateChanged loginStateChanged) {
        int loginIndex = loginStateChanged.getIndex();

        // Index 14 indicates a ban
        if (loginIndex != 14) {
            return;
        }

        if (banCounter == 0) {
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.a(webhookUrl,
                "rsn: " + playerName + " account has been banned? - Acc builder SOTF");
            banCounter++;
        }
    }

    // ========================================
    // Inventory Change Handler
    // ========================================

    @Subscribe
    private void onInventoryChanged(InventoryChanged inventoryChanged) {
        // Only process item additions
        if (inventoryChanged.getChangeType() == InventoryChanged.ChangeType.ITEM_REMOVED) {
            return;
        }
    }
}
