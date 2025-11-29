/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Chambers of Xeric (CoX) Plugin
 *
 * This plugin provides automation and helpers for the Chambers of Xeric raid in OSRS.
 * It handles prayer switching, task management, overlay rendering, raid scouting,
 * and loot tracking for all CoX rooms including combat (Tekton, Guardians, Muttadiles,
 * Vasa, Vespula, Shamans, Mystics) and puzzle rooms (Ice Demon, Crabs, Thieving, Tightrope).
 * The final boss is Great Olm with mage and melee hands.
 */
package gg.squire.cox;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.cox.tasks.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InstanceTemplates;
import net.runelite.api.Item;
import net.runelite.api.MessageNode;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatClient;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ChatInput;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemStack;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ImageCapture;
import net.runelite.client.util.Text;
import net.runelite.http.api.chat.LayoutRoom;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main plugin class for Squire Chambers of Xeric automation
 * Manages automation tasks, overlays, raid scouting, and event handlers for CoX raid
 */
@PluginDescriptor(
    name = "Squire Chambers Of Xeric",
    description = "All squire devs know is vacation and cox",
    tags = {"combat", "raid", "overlay", "pve", "pvm", "bosses", "cox"},
    enabledByDefault = false
)
@SquireUtil
public class SquireChambersPlugin extends SquirePlugin {

    // ========== Constants ==========

    private static final Logger logger = LoggerFactory.getLogger(SquireChambersPlugin.class);
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###.##");
    private static final DecimalFormat THOUSANDS_FORMAT = new DecimalFormat("#,###");

    // CoX game constants
    public static final int COX_CHUNK_SIZE = 8;
    public static final int RAID_LEVEL_6 = 6;
    public static final int RAID_LEVEL_4 = 4;
    public static final int RAID_LEVEL_5 = 5;
    public static final int MAX_MESSAGE_LENGTH = 256;

    // Varbit IDs
    private static final int VARBIT_IN_RAID = 5432;          // Varbit that tracks if player is in raid
    private static final int VARP_RAID_STATE = 1427;         // Varp that tracks raid party state

    // Item IDs for unique drops
    private static final Set<Integer> UNIQUE_DROP_IDS = ImmutableSet.of(
        20849,  // Twisted bow
        21000,  // Elder maul
        21003,  // Kodai insignia
        21010,  // Dexterous prayer scroll
        21013,  // Arcane prayer scroll
        21021,  // Dragon hunter crossbow
        21034,  // Dinhs bulwark
        21079,  // Ancestral hat
        21021,  // Ancestral robe top
        21024,  // Ancestral robe bottom
        21000,  // Dragon claws
        21079,  // Twisted buckler
        21021,  // Metamorphic dust
        21024   // Clue scroll (elite)
    );

    // Chat message strings
    private static final String MSG_RAID_COMPLETE = "Congratulations - your raid is complete!";
    private static final String MSG_LEVEL_COMPLETE = "level complete!";

    // Item names for potions
    private static final String ITEM_SARADOMIN_BREW = "Saradomin brew";
    private static final String ITEM_XERICS_AID = "Xeric's";
    private static final String ITEM_SUPER_RESTORE = "Super restore";
    private static final String ITEM_REVITALISATION = "Revitalisation";

    // Config group name
    private static final String CONFIG_GROUP = "squireraids";

    // ========== Injected Dependencies ==========

    @Inject private Client client;
    @Inject private SquireChambersConfig config;
    @Inject private OverlayManager overlayManager;
    @Inject private CoxOverlay coxOverlay;
    @Inject private CoxPrayerHelper prayerHelper;
    @Inject private ScheduledExecutorService executorService;
    @Inject private ImageCapture imageCapture;
    @Inject private CoxRoomHelper roomHelper;
    @Inject private SpriteManager spriteManager;
    @Inject private CoxLayoutMatcher layoutMatcher;
    @Inject private ChatMessageManager chatMessageManager;
    @Inject private ChatClient chatClient;
    @Inject private CoxEquipmentHelper equipmentHelper;
    @Inject private RuneLiteConfig runeLiteConfig;
    @Inject private InfoBoxManager infoBoxManager;
    @Inject private EventBus eventBus;
    @Inject private CoxRaidEventHandler raidEventHandler;
    @Inject private ClientThread clientThread;

    // ========== Plugin State ==========

    private CoxRaid currentRaid;                    // Current raid instance
    private List<RoomData> roomDataList;            // List of rooms in raid
    private CoxInfoBox infoBox;                     // Info box for raid stats
    private boolean inRaid;                         // True if player is currently in raid
    private boolean hasOverlaySupport;              // True if overlay features are available
    private int raidPartyState;                     // Current raid party state
    private int lastCombatTick;                     // Last game tick when combat occurred
    private int equipmentSwapCount;                 // Counter for equipment swaps
    private int grubsDepositedCount;                // Total grubs deposited (Vespula)
    private int bugsDepositedCount;                 // Total bugs deposited (Vespula)
    private int totalPointsGained;                  // Total personal points in raid
    private GameState previousGameState;            // Previous game state for state change detection

    // Room tracking
    private RoomData currentRoom;                   // Current room player is in
    private RoomData nextRoom;                      // Next room to enter

    // Equipment setups for different bosses
    private EquipmentSetup mageSetup;              // Mage gear setup
    private EquipmentSetup rangeSetup;             // Range gear setup
    private EquipmentSetup meleeSetup;             // Melee gear setup
    private EquipmentSetup olmSetup;               // Olm-specific gear setup

    public SquireChambersPlugin() {
        this.roomDataList = new ArrayList<>();
        this.lastCombatTick = 0;
        this.equipmentSwapCount = 1;
        this.grubsDepositedCount = 0;
        this.bugsDepositedCount = 0;
        this.mageSetup = null;
        this.rangeSetup = null;
        this.meleeSetup = null;
        this.olmSetup = null;
    }

    // ========== Plugin Lifecycle ==========

    @Override
    protected void onStart() {
        // Check for overlay support
        if (!SquireFeatures.hasOverlaySupport() || !SquireFeatures.hasRaidSupport()) {
            this.hasOverlaySupport = false;
        } else {
            this.hasOverlaySupport = true;
        }

        // Add overlays
        overlayManager.add(coxOverlay);

        // Register event handlers
        eventBus.register(prayerHelper);
        prayerHelper.reset();
        eventBus.register(raidEventHandler);
        eventBus.register(equipmentHelper);
        eventBus.register(roomHelper);
        roomHelper.reset();

        // Initialize state on client thread
        clientThread.invokeLater(this::initializeRaidState);

        // Reset counters
        this.grubsDepositedCount = 0;
        this.bugsDepositedCount = 0;

        // Validate configuration
        if (countEnabledCombatRooms() < 5) {
            forceStop();
            Log.error("Not enough Combat Rooms selected, please select more Combat Rooms");
            return;
        }

        if (countEnabledPuzzleRooms() < 4) {
            forceStop();
            Log.error("Not enough Puzzle Rooms selected, please select more Puzzle Rooms");
            return;
        }

        // Validate Guardians room has pickaxe
        if (config.enableGuardians()) {
            BankLoadout loadout = getSelectedBankLoadout();
            if (loadout.getInventorySetup().contains(item ->
                item.getName().toLowerCase().contains("pickaxe"))) {
                forceStop();
                Log.error("Guardians rooms is enabled but no pickaxe found in Bank Loadout");
                return;
            }
        }
    }

    @Override
    protected void onStop() {
        // Remove overlays
        overlayManager.remove(coxOverlay);

        // Remove info box
        infoBoxManager.removeInfoBox(infoBox);
        infoBox = null;

        // Reset raid state
        this.inRaid = false;
        resetRaidState();

        // Unregister event handlers
        eventBus.unregister(raidEventHandler);
        eventBus.unregister(prayerHelper);
        eventBus.unregister(equipmentHelper);
        eventBus.unregister(roomHelper);
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(CoxManager.class);
    }

    @Provides
    SquireChambersConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireChambersConfig.class);
    }

    // ========== Task Definitions ==========

    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[] {
            // Room navigation and setup
            StartRoomTask.class,                    // 0
            RestoringPrayerTask.class,              // 1
            ScavangersTopFloorTask.class,           // 2
            ScavangersPrepTask.class,               // 3
            FarmingTopFloorTask.class,              // 4
            FinishingFloorTask.class,               // 5

            // Puzzle room tasks
            ThievingTask.class,                     // 6
            TightropeTask.class,                    // 7
            IceDemonTask.class,                     // 8
            CrabsTask.class,                        // 9

            // Olm tasks
            PrayerFlickingTask.class,               // 10
            OlmMageHandTask.class,                  // 11
            OlmMeleeHandTask.class,                 // 12
            PrayerFlickingTask.class,               // 13
            DodgingFalligCrystalsTask.class,        // 14
            OlmPortalsTask.class,                   // 15
            OlmMeleeSpecTask.class,                 // 16
            TryingOlmHeadTask.class,                // 17
            EnterOlmRoomTask.class,                 // 18
            LootChestTask.class,                    // 19

            // Preparation tasks
            PrepGettingToolsTask.class,             // 20
            PrepFarmingTask.class,                  // 21
            PrepGetVialsTask.class,                 // 22
            PrepDepositInventoryTask.class,         // 23
            PrepPickHerbsTask.class,                // 24
            PrepMakePotsTask.class,                 // 25
            PrepDroppingToolsTask.class,            // 26
            PrepWithdrawOlmGearTask.class,          // 27
            PrepGetSeedsTask.class,                 // 28

            // Combat room tasks
            GuardiansTask.class,                    // 29
            MuttadilesTask.class,                   // 30
            TektonTask.class,                       // 31
            MysticsTask.class,                      // 32
            ShamansTask.class,                      // 33
            VasaTask.class,                         // 34
            VespulaTask.class,                      // 35

            // Raid setup and management
            ScoutingForARaidTask.class,             // 36
            SettingUpRaidTask.class,                // 37
            SettingUpAutoRoomsTask.class,           // 38
            HoppingToDifferentWorldTask.class,      // 39
            LeaveRaidTask.class,                    // 40
            ConfigurePartyTask.class,               // 41
            MakingPartyTask.class,                  // 42
            WithdrawingItemsTask.class,             // 43
            EmptyPrivateStorageTask.class,          // 44
            RechargingTridentTask.class,            // 45
            TestTask.class,                         // 46

            // Support tasks
            EnablingRunTask.class,                  // 47
            EatingFoodTask.class,                   // 48
            DrinkStaminaTask.class,                 // 49
            DrinkOverloadTask.class,                // 50
            RestoringPrayerTask.class,              // 51
            DroppingSpareItemsTask.class,           // 52
            PickSeedsTask.class,                    // 53
            ManageOverloadsTask.class,              // 54
            PickupEnhanceTask.class,                // 55
            PickupDroppedBrewTask.class             // 56
        };
    }

    // ========== Event Handlers ==========

    /**
     * Handles varbit changes for raid state tracking
     */
    @Subscribe
    public void onVarbitChanged(VarbitChanged event) {
        // Track raid party state
        if (event.getVarpId() == VARP_RAID_STATE) {
            int previousState = this.inRaid ? 1 : 0;
            int previousPartyState = this.raidPartyState;
            this.raidPartyState = event.getValue();

            if (client.getGameState() == GameState.LOGGED_IN &&
                previousState != 0 &&
                previousPartyState != 0 &&
                this.raidPartyState != 0 &&
                this.raidPartyState != previousPartyState) {
                logger.debug("Raid party has been dissolved");
                resetRaidState();
            }
        }

        // Track in-raid varbit
        if (event.getVarbitId() == VARBIT_IN_RAID) {
            System.out.println("IN RAID CHANGED");
            boolean nowInRaid = event.getValue() == 1;
            this.inRaid = nowInRaid;

            if (client.getGameState() == GameState.LOGGED_IN) {
                if (nowInRaid && currentRaid == null) {
                    System.out.println("Scouting raid");
                    initializeRaidState();
                } else if (raidPartyState == 0) {
                    logger.debug("Raid has ended");
                    resetRaidState();
                }
            }
        }
    }

    /**
     * Handles game state changes
     */
    @Subscribe
    public void onGameStateChanged(GameStateChanged event) {
        if (client.getGameState() == GameState.LOGGED_IN && previousGameState == GameState.LOADING) {
            // State changed from loading to logged in
        }

        if (client.getGameState() == GameState.LOGIN_SCREEN) {
            hasOverlaySupport = false;
        }

        previousGameState = client.getGameState();
    }

    /**
     * Handles chat messages for raid events and layout sharing
     */
    @Subscribe
    public void onChatMessage(ChatMessage event) {
        if (inRaid && event.getType() == ChatMessageType.GAMEMESSAGE) {
            String message = Text.removeTags(event.getMessage());

            // Check for floor completion
            if (infoBox != null && message.contains(MSG_LEVEL_COMPLETE)) {
                infoBox.onFloorComplete();
            }

            // Check for raid completion
            if (message.startsWith(MSG_RAID_COMPLETE) && infoBox != null) {
                infoBox.onRaidComplete();
                infoBox.setCountdown(1);
            }
        }
    }

    /**
     * Handles configuration changes
     */
    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        if (!event.getGroup().equals(CONFIG_GROUP)) {
            return;
        }

        if (event.getKey().equals("raidsTimer")) {
            updateInfoBox();
        }
    }

    /**
     * Handles inventory changes for tracking deposits
     */
    @Subscribe(priority = 1000.0f)
    public void onInventoryChanged(InventoryChanged event) {
        int amount = event.getAmount();
        int itemId = event.getItemId();

        if (event.getChangeType() == InventoryChanged.ChangeType.ITEM_REMOVED) {
            // Track grubs deposited (Vespula room)
            if (itemId == 20654) { // Grub ID
                System.out.print("deposited grubs");
                this.grubsDepositedCount += amount;
            }

            // Track bugs deposited
            if (itemId == 20655) { // Bug ID
                System.out.print("deposited grubs");
                this.bugsDepositedCount += amount;
            }
        }
    }

    /**
     * Tracks combat experience for prayer flicking
     */
    @Subscribe(priority = 1000.0f)
    public void onExperienceGained(ExperienceGained event) {
        if (event.getSkill() == Skill.HITPOINTS) {
            this.lastCombatTick = Static.getClient().getTickCount();
        }
    }

    /**
     * Handles loot received from raid completion
     */
    @Subscribe
    public void onLootReceived(LootReceived event) {
        if (!event.getName().contains("Chambers") && !event.getName().contains("Tekton")) {
            return;
        }

        Collection<ItemStack> items = event.getItems();
        ItemStack uniqueDrop = items.stream()
            .filter(item -> UNIQUE_DROP_IDS.contains(item.getId()))
            .findFirst()
            .orElse(null);

        CoxLootLogger.logLoot(uniqueDrop, items, config.anonymize());
    }

    // ========== Raid State Management ==========

    /**
     * Initializes raid state by scanning for raid layout
     */
    private void initializeRaidState() {
        if (client.getGameState() != GameState.LOGGED_IN) {
            return;
        }

        // Check if raid state already initialized
        if (CoxRaidState.getCurrentState() == CoxRaidState.REACHED_BOTTOM) {
            setMageSetup(EquipmentHelper.getMageSetup());
            setRangeSetup(EquipmentHelper.getRangeSetup());
            setMeleeSetup(EquipmentHelper.getMeleeSetup());
            setOlmSetup(EquipmentHelper.getOlmSetup());
            return;
        }

        // Check in raid varbit
        if (client.getVarbitValue(VARBIT_IN_RAID) != 1) {
            this.inRaid = false;
            return;
        }

        this.inRaid = true;

        if (!this.inRaid) {
            return;
        }

        // Build raid layout if not exists
        boolean isFirstScout = (currentRaid == null);
        currentRaid = buildRaidLayout(currentRaid);

        if (currentRaid == null) {
            logger.debug("Failed to build raid");
            return;
        }

        // Match layout to known patterns
        if (currentRaid.getLayoutPattern() == null) {
            LayoutPattern pattern = layoutMatcher.matchLayout(currentRaid.getRoomGrid());
            if (pattern == null) {
                logger.debug("Could not find layout match");
                currentRaid = null;
                return;
            }
            currentRaid.setLayoutPattern(pattern);
        }

        // Build room list
        RoomData[] roomGrid = currentRaid.getRoomGrid();
        CoxRoomSorter.sortRooms(roomGrid);
        currentRaid.setRoomList(roomGrid);
        this.roomDataList = RoomData.buildRoomList(currentRaid);

        // Reset counters
        this.bugsDepositedCount = 0;
        this.grubsDepositedCount = 0;
        prayerHelper.reset();

        // Setup equipment if enabled
        if (SquireFeatures.hasEquipmentSupport()) {
            setMageSetup(EquipmentHelper.getMageSetup());
            setRangeSetup(EquipmentHelper.getRangeSetup());
            setMeleeSetup(EquipmentHelper.getMeleeSetup());
            setOlmSetup(EquipmentHelper.getOlmSetup());
        } else {
            this.rangeSetup = null;
            this.mageSetup = null;
            this.meleeSetup = null;
            this.olmSetup = null;
        }

        Log.error("Scouting for raid");
        eventBus.post(new RaidScoutedEvent(currentRaid, isFirstScout));
    }

    /**
     * Builds the raid layout by scanning tiles
     */
    private CoxRaid buildRaidLayout(CoxRaid existingRaid) {
        CoxRaid raid = existingRaid;

        if (raid == null) {
            Point basePoint = findRaidBasePoint();
            if (basePoint == null) {
                return null;
            }

            Integer rotation = calculateRaidRotation(basePoint);
            if (rotation == null) {
                return null;
            }

            raid = new CoxRaid(
                new WorldPoint(
                    client.getBaseX() + basePoint.getX(),
                    client.getBaseY() + basePoint.getY(),
                    5
                ),
                rotation
            );
        }

        // Calculate grid offset
        int xOffset = raid.getRotation() % 6;
        int yOffset = (raid.getRotation() % 12 > 5) ? 1 : 0;

        // Scan all room positions
        for (int i = 0; i < raid.getRoomGrid().length; i++) {
            int xGrid = i % 6;
            int yGrid = (i % 12 > 5) ? 1 : 0;
            int plane = (i > 9) ? 4 : 5;

            xGrid -= xOffset;
            yGrid -= yOffset;

            // Convert to scene coordinates
            int sceneX = raid.getBasePoint().getX() + xGrid * COX_CHUNK_SIZE - client.getBaseX();
            int sceneY = raid.getBasePoint().getY() - yGrid * COX_CHUNK_SIZE - client.getBaseY();

            // Bounds check
            if (sceneX >= 104 || sceneX >= 104) {
                continue;
            }

            if (sceneX < 3) sceneX = 3;
            if (sceneY < 3) sceneY = 3;

            Tile tile = client.getScene().getTiles()[plane][sceneX][sceneY];
            if (tile == null) {
                continue;
            }

            RoomType roomType = identifyRoomType(tile);
            raid.setRoom(roomType, i);
        }

        return raid;
    }

    /**
     * Finds the base point of the raid by locating the ladder
     */
    private Point findRaidBasePoint() {
        Tile[][] tiles = client.getScene().getTiles()[5];

        for (int x = 0; x < 104; x++) {
            for (int y = 0; y < 104; y++) {
                if (tiles[x][y] != null) {
                    if (tiles[x][y].getWallObject() != null &&
                        tiles[x][y].getWallObject().getId() == 29879) {
                        return tiles[x][y].getSceneLocation();
                    }
                }
            }
        }

        return null;
    }

    /**
     * Calculates raid rotation based on ladder position
     */
    private Integer calculateRaidRotation(Point ladderPoint) {
        if (104 <= ladderPoint.getX() + COX_CHUNK_SIZE || 104 <= ladderPoint.getY() + COX_CHUNK_SIZE) {
            return null;
        }

        Tile[][] tiles = client.getScene().getTiles()[5];

        // Check for walls to determine rotation
        boolean hasNorthWall = (tiles[ladderPoint.getX()][ladderPoint.getY() + COX_CHUNK_SIZE] == null);
        boolean hasEastWall = (tiles[ladderPoint.getX() + COX_CHUNK_SIZE][ladderPoint.getY()] == null);

        if (!hasEastWall) {
            int count = 0;
            while (count < 5) {
                int checkX = ladderPoint.getX() - 3 - COX_CHUNK_SIZE * count;
                if (checkX >= 0 && tiles[checkX][ladderPoint.getY()] == null) {
                    break;
                }
                count++;
            }
            return count + (hasNorthWall ? 1 : 0) * 6;
        }

        return (hasNorthWall ? 1 : 0) + (hasEastWall ? 0 : 1) * 6;
    }

    /**
     * Identifies room type from tile instance template
     */
    private RoomType identifyRoomType(Tile tile) {
        int templateId = client.getInstanceTemplateChunks()
            [tile.getPlane()]
            [tile.getSceneLocation().getX() / 8]
            [tile.getSceneLocation().getY() / 8];

        InstanceTemplates template = InstanceTemplates.findMatch(templateId);

        if (template == null) {
            return RoomType.EMPTY;
        }

        switch (template) {
            case RAIDS_LOBBY:
            case RAIDS_START:
                return RoomType.START;
            case RAIDS_END:
                return RoomType.END;
            case RAIDS_SCAVENGERS:
            case RAIDS_SCAVENGERS_2:
                return RoomType.SCAVENGERS;
            case RAIDS_SHAMANS:
                return RoomType.SHAMANS;
            case RAIDS_VASA:
                return RoomType.VASA;
            case RAIDS_VANGUARDS:
                return RoomType.VANGUARDS;
            case RAIDS_ICE_DEMON:
                return RoomType.ICE_DEMON;
            case RAIDS_THIEVING:
                return RoomType.THIEVING;
            case RAIDS_FARMING:
            case RAIDS_FARMING_2:
                return RoomType.FARMING;
            case RAIDS_MUTTADILE:
                return RoomType.MUTTADILES;
            case RAIDS_MYSTICS:
                return RoomType.MYSTICS;
            case RAIDS_TEKTON:
                return RoomType.TEKTON;
            case RAIDS_TIGHTROPE:
                return RoomType.TIGHTROPE;
            case RAIDS_GUARDIANS:
                return RoomType.GUARDIANS;
            case RAIDS_CRABS:
                return RoomType.CRABS;
            case RAIDS_VESPULA:
                return RoomType.VESPULA;
            default:
                return RoomType.EMPTY;
        }
    }

    /**
     * Resets raid state and cleans up
     */
    private void resetRaidState() {
        this.currentRaid = null;
        updateInfoBox();
        eventBus.post(new RaidEndedEvent());
    }

    /**
     * Updates or removes the info box based on configuration
     */
    private void updateInfoBox() {
        if (infoBox != null && !inRaid) {
            infoBoxManager.removeInfoBox(infoBox);
            infoBox = null;
        }
    }

    // ========== Configuration Helpers ==========

    /**
     * Counts number of enabled combat rooms
     */
    public int countEnabledCombatRooms() {
        int count = 0;
        if (config.enableGuardians()) count++;
        if (config.enableTekton()) count++;
        if (config.enableMuttadiles()) count++;
        if (config.enableVasa()) count++;
        if (config.enableVespula()) count++;
        return count;
    }

    /**
     * Counts number of enabled puzzle rooms
     */
    public int countEnabledPuzzleRooms() {
        int count = 0;
        if (config.enableCrabs()) count++;
        if (config.enableThieving()) count++;
        if (config.enableIceDemon()) count++;
        if (config.enableTightrope()) count++;
        return count;
    }

    /**
     * Gets the selected bank loadout from config
     */
    private BankLoadout getSelectedBankLoadout() {
        return config.bankLoadout().selected(BankLoadout.class);
    }

    /**
     * Drops a potion from inventory
     */
    public boolean dropPotion() {
        // Check for vial of blood (Verzik potion)
        int[] vialBloodId = {20849};
        if (Inventory.contains(vialBloodId)) {
            Item item = Inventory.getFirst(vialBloodId);
            if (item != null) {
                item.interact("Eat");
                return true;
            }
        }

        // Find any potion to drop
        Item potion = Inventory.getFirst(item ->
            item.getName().startsWith(ITEM_SARADOMIN_BREW));
        if (potion == null) {
            potion = Inventory.getFirst(item ->
                item.getName().startsWith(ITEM_XERICS_AID));
        }
        if (potion == null) {
            potion = Inventory.getFirst(item ->
                item.getName().startsWith(ITEM_SUPER_RESTORE));
        }
        if (potion == null) {
            potion = Inventory.getFirst(item ->
                item.getName().startsWith(ITEM_REVITALISATION));
        }

        if (potion == null) {
            return false;
        }

        potion.drop();
        return true;
    }

    // ========== Getters and Setters ==========

    public CoxRaid getCurrentRaid() {
        return currentRaid;
    }

    public void setCurrentRaid(CoxRaid raid) {
        this.currentRaid = raid;
    }

    public List<RoomData> getRoomDataList() {
        return roomDataList;
    }

    public boolean isInRaid() {
        return inRaid;
    }

    public RoomData getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(RoomData room) {
        this.currentRoom = room;
    }

    public RoomData getNextRoom() {
        return nextRoom;
    }

    public void setNextRoom(RoomData room) {
        this.nextRoom = room;
    }

    public int getLastCombatTick() {
        return lastCombatTick;
    }

    public int getGrubsDepositedCount() {
        return grubsDepositedCount;
    }

    public void setGrubsDepositedCount(int count) {
        this.grubsDepositedCount = count;
    }

    public int getBugsDepositedCount() {
        return bugsDepositedCount;
    }

    public void setBugsDepositedCount(int count) {
        this.bugsDepositedCount = count;
    }

    public int getTotalPointsGained() {
        return totalPointsGained;
    }

    public void setTotalPointsGained(int points) {
        this.totalPointsGained = points;
    }

    public int getEquipmentSwapCount() {
        return equipmentSwapCount;
    }

    public int getRaidPartyState() {
        return raidPartyState;
    }

    public boolean hasOverlaySupport() {
        return hasOverlaySupport;
    }

    public void setOverlaySupport(boolean support) {
        this.hasOverlaySupport = support;
    }

    public EquipmentSetup getMageSetup() {
        return mageSetup;
    }

    public void setMageSetup(EquipmentSetup setup) {
        this.mageSetup = setup;
    }

    public EquipmentSetup getRangeSetup() {
        return rangeSetup;
    }

    public void setRangeSetup(EquipmentSetup setup) {
        this.rangeSetup = setup;
    }

    public EquipmentSetup getMeleeSetup() {
        return meleeSetup;
    }

    public void setMeleeSetup(EquipmentSetup setup) {
        this.meleeSetup = setup;
    }

    public EquipmentSetup getOlmSetup() {
        return olmSetup;
    }

    public void setOlmSetup(EquipmentSetup setup) {
        this.olmSetup = setup;
    }

    public CoxPrayerHelper getPrayerHelper() {
        return prayerHelper;
    }

    public CoxEquipmentHelper getEquipmentHelper() {
        return equipmentHelper;
    }

    public CoxRaidEventHandler getRaidEventHandler() {
        return raidEventHandler;
    }
}
