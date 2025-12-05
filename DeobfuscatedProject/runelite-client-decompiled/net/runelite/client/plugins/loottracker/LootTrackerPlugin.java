/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  lombok.NonNull
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MessageNode
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Scene
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.WorldType
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.PostClientTick
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.http.api.loottracker.GameItem
 *  net.runelite.http.api.loottracker.LootRecord
 *  net.runelite.http.api.loottracker.LootRecordType
 *  org.apache.commons.text.WordUtils
 */
package net.runelite.client.plugins.loottracker;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import lombok.NonNull;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.MenuAction;
import net.runelite.api.MessageNode;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Scene;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.WorldType;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.PostClientTick;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.client.account.AccountSession;
import net.runelite.client.account.SessionManager;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ClientShutdown;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.ConfigSync;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.events.PlayerLootReceived;
import net.runelite.client.events.RuneScapeProfileChanged;
import net.runelite.client.events.SessionClose;
import net.runelite.client.events.SessionOpen;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemStack;
import net.runelite.client.game.LootManager;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.ConfigLoot;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.plugins.loottracker.LootTrackerClient;
import net.runelite.client.plugins.loottracker.LootTrackerConfig;
import net.runelite.client.plugins.loottracker.LootTrackerItem;
import net.runelite.client.plugins.loottracker.LootTrackerPanel;
import net.runelite.client.plugins.loottracker.LootTrackerPriceType;
import net.runelite.client.plugins.loottracker.LootTrackerRecord;
import net.runelite.client.plugins.loottracker.NpcMetadata;
import net.runelite.client.plugins.loottracker.PluginLootReceived;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.runelite.client.util.QuantityFormatter;
import net.runelite.client.util.Text;
import net.runelite.http.api.loottracker.GameItem;
import net.runelite.http.api.loottracker.LootRecord;
import net.runelite.http.api.loottracker.LootRecordType;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Loot Tracker", description="Tracks loot from monsters and minigames", tags={"drops"})
public class LootTrackerPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(LootTrackerPlugin.class);
    private static final int MAX_DROPS = 1024;
    private static final Duration MAX_AGE = Duration.ofDays(365L);
    private static final Pattern CLUE_SCROLL_PATTERN = Pattern.compile("You have completed [0-9]+ ([a-z]+) Treasure Trails?\\.");
    private static final int THEATRE_OF_BLOOD_REGION = 12867;
    private static final int THEATRE_OF_BLOOD_LOBBY = 14642;
    @VisibleForTesting
    static final String HERBIBOAR_LOOTED_MESSAGE = "You harvest herbs from the herbiboar, whereupon it escapes.";
    private static final String HERBIBOAR_EVENT = "Herbiboar";
    private static final Pattern HERBIBOAR_HERB_SACK_PATTERN = Pattern.compile(".+(Grimy .+?) herb.+");
    private static final String SEEDPACK_EVENT = "Seed pack";
    private static final String HESPORI_LOOTED_MESSAGE = "You have successfully cleared this patch for new crops.";
    private static final String HESPORI_EVENT = "Hespori";
    private static final int HESPORI_REGION = 5021;
    private static final String CHEST_LOOTED_MESSAGE = "You find some treasure in the chest!";
    private static final Pattern ROGUES_CHEST_PATTERN = Pattern.compile("You find (a|some)([a-z\\s]*) inside.");
    private static final Pattern LARRAN_LOOTED_PATTERN = Pattern.compile("You have opened Larran's (big|small) chest .*");
    private static final String OTHER_CHEST_LOOTED_MESSAGE = "You steal some loot from the chest.";
    private static final String DORGESH_KAAN_CHEST_LOOTED_MESSAGE = "You find treasure inside!";
    private static final String GRUBBY_CHEST_LOOTED_MESSAGE = "You have opened the Grubby Chest";
    private static final String ANCIENT_CHEST_LOOTED_MESSAGE = "You open the chest and find";
    private static final Pattern HAM_CHEST_LOOTED_PATTERN = Pattern.compile("Your (?<key>[a-z]+) key breaks in the lock.*");
    private static final int HAM_STOREROOM_REGION = 10321;
    private static final Map<Integer, String> CHEST_EVENT_TYPES = new ImmutableMap.Builder<Integer, String>().put(5179, "Brimstone Chest").put(11573, "Crystal Chest").put(12093, "Larran's big chest").put(12127, "The Gauntlet").put(13113, "Larran's small chest").put(13151, "Elven Crystal Chest").put(5277, "Stone chest").put(10835, "Dorgesh-Kaan Chest").put(10834, "Dorgesh-Kaan Chest").put(7323, "Grubby Chest").put(8593, "Isle of Souls Chest").put(7827, "Dark Chest").put(13117, "Rogues' Chest").put(13156, "Chest (Ancient Vault)").put(12348, "Muddy Chest").build();
    private static final Set<String> SLAYER_CHEST_EVENT_TYPES = ImmutableSet.of("Brimstone Chest", "Larran's big chest", "Larran's small chest");
    private static final Pattern SHADE_CHEST_NO_KEY_PATTERN = Pattern.compile("You need a [a-z]+ key with a [a-z]+ trim to open this chest .*");
    private static final Map<Integer, String> SHADE_CHEST_OBJECTS = new ImmutableMap.Builder<Integer, String>().put(4111, "Bronze key red").put(4112, "Bronze key brown").put(4113, "Bronze key crimson").put(4114, "Bronze key black").put(4115, "Bronze key purple").put(4116, "Steel key red").put(4117, "Steel key brown").put(4118, "Steel key crimson").put(4119, "Steel key black").put(4120, "Steel key purple").put(4121, "Black key red").put(4122, "Black key brown").put(4123, "Black key crimson").put(4124, "Black key black").put(4125, "Black key purple").put(4126, "Silver key red").put(4127, "Silver key brown").put(4128, "Silver key crimson").put(4129, "Silver key black").put(4130, "Silver key purple").put(41212, "Gold key red").put(41213, "Gold key brown").put(41214, "Gold key crimson").put(41215, "Gold key black").put(41216, "Gold key purple").build();
    private static final String COFFIN_LOOTED_MESSAGE = "You push the coffin lid aside.";
    private static final String HALLOWED_SEPULCHRE_COFFIN_EVENT = "Coffin (Hallowed Sepulchre)";
    private static final Set<Integer> HALLOWED_SEPULCHRE_MAP_REGIONS = ImmutableSet.of(Integer.valueOf(8797), Integer.valueOf(10077), Integer.valueOf(9308), Integer.valueOf(10074), Integer.valueOf(9050));
    private static final String HALLOWED_SACK_EVENT = "Hallowed Sack";
    private static final Set<Integer> LAST_MAN_STANDING_REGIONS = ImmutableSet.of(Integer.valueOf(13658), Integer.valueOf(13659), Integer.valueOf(13660), Integer.valueOf(13914), Integer.valueOf(13915), Integer.valueOf(13916), new Integer[]{13918, 13919, 13920, 14174, 14175, 14176, 14430, 14431, 14432});
    private static final Pattern PICKPOCKET_REGEX = Pattern.compile("You pick (the )?(?<target>.+)'s? pocket.*");
    private static final String BIRDNEST_EVENT = "Bird nest";
    private static final Set<Integer> BIRDNEST_IDS = ImmutableSet.of(Integer.valueOf(5070), Integer.valueOf(5071), Integer.valueOf(5072), Integer.valueOf(5073), Integer.valueOf(5074), Integer.valueOf(7413), new Integer[]{13653, 22798, 22800});
    private static final Pattern BIRDHOUSE_PATTERN = Pattern.compile("You dismantle and discard the trap, retrieving (?:(?:a|\\d{1,2}) nests?, )?10 dead birds, \\d{1,3} feathers and (\\d,?\\d{1,3}) Hunter XP\\.");
    private static final Map<Integer, String> BIRDHOUSE_XP_TO_TYPE = new ImmutableMap.Builder<Integer, String>().put(280, "Regular Bird House").put(420, "Oak Bird House").put(560, "Willow Bird House").put(700, "Teak Bird House").put(820, "Maple Bird House").put(960, "Mahogany Bird House").put(1020, "Yew Bird House").put(1140, "Magic Bird House").put(1200, "Redwood Bird House").build();
    private static final Multimap<String, String> PICKPOCKET_DISAMBIGUATION_MAP = ImmutableMultimap.of("H.A.M. Member", "Man", "H.A.M. Member", "Woman");
    private static final String CASKET_EVENT = "Casket";
    private static final String ORE_PACK_VM_EVENT = "Ore Pack (Volcanic Mine)";
    private static final String WINTERTODT_SUPPLY_CRATE_EVENT = "Supply crate (Wintertodt)";
    private static final String BAG_FULL_OF_GEMS_PERCY_EVENT = "Bag full of gems (Percy)";
    private static final String BAG_FULL_OF_GEMS_BELONA_EVENT = "Bag full of gems (Belona)";
    private static final String BAG_FULL_OF_GEMS_DUSURI_EVENT = "Bag full of gems (Dusuri)";
    private static final String SPOILS_OF_WAR_EVENT = "Spoils of war";
    private static final Set<Integer> SOUL_WARS_REGIONS = ImmutableSet.of(Integer.valueOf(8493), Integer.valueOf(8749), Integer.valueOf(9005));
    private static final String TEMPOROSS_EVENT = "Reward pool (Tempoross)";
    private static final String TEMPOROSS_CASKET_EVENT = "Casket (Tempoross)";
    private static final String TEMPOROSS_LOOT_STRING = "You found some loot: ";
    private static final int TEMPOROSS_REGION = 12588;
    private static final String GUARDIANS_OF_THE_RIFT_EVENT = "Guardians of the Rift";
    private static final String GUARDIANS_OF_THE_RIFT_LOOT_STRING = "You found some loot: ";
    private static final int GUARDIANS_OF_THE_RIFT_REGION = 14484;
    private static final String MAHOGANY_CRATE_EVENT = "Supply crate (Mahogany Homes)";
    private static final Set<Integer> IMPLING_JARS = ImmutableSet.of(Integer.valueOf(11238), Integer.valueOf(11240), Integer.valueOf(11242), Integer.valueOf(11244), Integer.valueOf(11246), Integer.valueOf(11248), new Integer[]{11250, 11252, 11254, 23768, 11256, 19732});
    private static final String IMPLING_CATCH_MESSAGE = "You manage to catch the impling and acquire some loot.";
    private static final String CHAMBERS_OF_XERIC = "Chambers of Xeric";
    private static final String THEATRE_OF_BLOOD = "Theatre of Blood";
    private static final String TOMBS_OF_AMASCUT = "Tombs of Amascut";
    private static final int FONT_OF_CONSUMPTION_REGION = 12106;
    private static final String FONT_OF_CONSUMPTION_USE_MESSAGE = "You place the Unsired into the Font of Consumption...";
    private static final Set<Character> VOWELS = ImmutableSet.of(Character.valueOf('a'), Character.valueOf('e'), Character.valueOf('i'), Character.valueOf('o'), Character.valueOf('u'));
    @Inject
    private ClientToolbar clientToolbar;
    @Inject
    private ItemManager itemManager;
    @Inject
    private SpriteManager spriteManager;
    @Inject
    private LootTrackerConfig config;
    @Inject
    private Client client;
    @Inject
    private ClientThread clientThread;
    @Inject
    private SessionManager sessionManager;
    @Inject
    private ScheduledExecutorService executor;
    @Inject
    private EventBus eventBus;
    @Inject
    private ChatMessageManager chatMessageManager;
    @Inject
    private LootManager lootManager;
    @Inject
    private ConfigManager configManager;
    @Inject
    private Gson gson;
    @Inject
    private LootTrackerClient lootTrackerClient;
    private LootTrackerPanel panel;
    private NavigationButton navButton;
    private boolean chestLooted;
    private boolean lastLoadingIntoInstance;
    private String lastPickpocketTarget;
    private List<String> ignoredItems = new ArrayList<String>();
    private List<String> ignoredEvents = new ArrayList<String>();
    private InventoryID inventoryId;
    private Multiset<Integer> inventorySnapshot;
    private InvChangeCallback inventorySnapshotCb;
    private String groundSnapshotName;
    private int groundSnapshotCombatLevel;
    private int groundSnapshotCycleDelay;
    private Multiset<Integer> groundSnapshot;
    private int groundSnapshotRegion;
    private final List<LootRecord> queuedLoots = new ArrayList<LootRecord>();
    private String profileKey;

    private static Collection<ItemStack> stack(Collection<ItemStack> items) {
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        for (ItemStack item : items) {
            int quantity = 0;
            for (ItemStack i : list) {
                if (i.getId() != item.getId()) continue;
                quantity = i.getQuantity();
                list.remove(i);
                break;
            }
            if (quantity > 0) {
                list.add(new ItemStack(item.getId(), item.getQuantity() + quantity));
                continue;
            }
            list.add(item);
        }
        return list;
    }

    @Provides
    LootTrackerConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(LootTrackerConfig.class);
    }

    @Subscribe
    public void onSessionOpen(SessionOpen sessionOpen) {
        AccountSession accountSession = this.sessionManager.getAccountSession();
        if (accountSession.getUuid() != null) {
            this.lootTrackerClient.setUuid(accountSession.getUuid());
        } else {
            this.lootTrackerClient.setUuid(null);
        }
    }

    @Subscribe
    public void onSessionClose(SessionClose sessionClose) {
        this.lootTrackerClient.setUuid(null);
    }

    @Subscribe
    public void onConfigSync(ConfigSync configSync) {
        this.submitLoot();
    }

    @Subscribe
    public void onRuneScapeProfileChanged(RuneScapeProfileChanged e) {
        String profileKey = this.configManager.getRSProfileKey();
        if (profileKey == null) {
            return;
        }
        if (profileKey.equals(this.profileKey)) {
            return;
        }
        this.switchProfile(profileKey);
    }

    private void switchProfile(String profileKey) {
        this.executor.execute(() -> {
            this.submitLoot();
            this.profileKey = profileKey;
            log.debug("Switched to profile {}", (Object)profileKey);
            if (!this.config.syncPanel()) {
                return;
            }
            int drops = 0;
            ArrayList loots = new ArrayList();
            Instant old = Instant.now().minus(MAX_AGE);
            for (String key : this.configManager.getRSProfileConfigurationKeys("loottracker", profileKey, "drops_")) {
                ConfigLoot configLoot;
                String json = this.configManager.getConfiguration("loottracker", profileKey, key);
                try {
                    configLoot = this.gson.fromJson(json, ConfigLoot.class);
                }
                catch (JsonSyntaxException ex) {
                    log.warn("Removing loot with malformed json: {}", (Object)json, (Object)ex);
                    this.configManager.unsetConfiguration("loottracker", profileKey, key);
                    continue;
                }
                if (configLoot.last.isBefore(old)) {
                    log.debug("Removing old loot for {} {}", (Object)configLoot.type, (Object)configLoot.name);
                    this.configManager.unsetConfiguration("loottracker", profileKey, key);
                    continue;
                }
                if (drops >= 1024 && !loots.isEmpty() && ((ConfigLoot)loots.get((int)0)).last.isAfter(configLoot.last)) continue;
                LootTrackerPlugin.sortedInsert(loots, configLoot, Comparator.comparing(ConfigLoot::getLast));
                if ((drops += configLoot.numDrops()) < 1024) continue;
                ConfigLoot top = (ConfigLoot)loots.remove(0);
                drops -= top.numDrops();
            }
            log.debug("Loaded {} records", (Object)loots.size());
            this.clientThread.invokeLater(() -> {
                if (this.client.getGameState().getState() < GameState.LOGIN_SCREEN.getState()) {
                    return false;
                }
                List records = loots.stream().map(this::convertToLootTrackerRecord).collect(Collectors.toList());
                SwingUtilities.invokeLater(() -> {
                    this.panel.clearRecords();
                    this.panel.addRecords(records);
                });
                return true;
            });
        });
    }

    private static <T> void sortedInsert(List<T> list, T value, Comparator<? super T> c) {
        int idx = Collections.binarySearch(list, value, c);
        list.add(idx < 0 ? -idx - 1 : idx, value);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event) {
        if (event.getGroup().equals("loottracker") && ("ignoredItems".equals(event.getKey()) || "ignoredEvents".equals(event.getKey()))) {
            this.ignoredItems = Text.fromCSV(this.config.getIgnoredItems());
            this.ignoredEvents = Text.fromCSV(this.config.getIgnoredEvents());
            SwingUtilities.invokeLater(this.panel::updateIgnoredRecords);
        }
    }

    @Override
    protected void startUp() throws Exception {
        String profileKey;
        this.profileKey = null;
        this.ignoredItems = Text.fromCSV(this.config.getIgnoredItems());
        this.ignoredEvents = Text.fromCSV(this.config.getIgnoredEvents());
        this.panel = new LootTrackerPanel(this, this.itemManager, this.config);
        this.spriteManager.getSpriteAsync(900, 0, this.panel::loadHeaderIcon);
        BufferedImage icon = ImageUtil.loadImageResource(this.getClass(), "panel_icon.png");
        this.navButton = NavigationButton.builder().tooltip("Loot Tracker").icon(icon).priority(5).panel(this.panel).build();
        this.clientToolbar.addNavigation(this.navButton);
        AccountSession accountSession = this.sessionManager.getAccountSession();
        if (accountSession != null) {
            this.lootTrackerClient.setUuid(accountSession.getUuid());
        }
        if ((profileKey = this.configManager.getRSProfileKey()) != null) {
            this.switchProfile(profileKey);
        }
    }

    @Override
    protected void shutDown() {
        this.submitLoot();
        this.clientToolbar.removeNavigation(this.navButton);
        this.lootTrackerClient.setUuid(null);
        this.chestLooted = false;
    }

    @Subscribe
    public void onClientShutdown(ClientShutdown event) {
        CompletableFuture<Void> future = this.submitLoot();
        if (future != null) {
            event.waitFor(future);
        }
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged event) {
        boolean inInstancedRegion = this.client.isInInstancedRegion();
        if (event.getGameState() == GameState.LOADING && inInstancedRegion != this.lastLoadingIntoInstance) {
            this.lastLoadingIntoInstance = inInstancedRegion;
            this.chestLooted = false;
        }
    }

    void addLoot(@NonNull String name, int combatLevel, LootRecordType type, Object metadata, Collection<ItemStack> items) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.addLoot(name, combatLevel, type, metadata, items, 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void addLoot(@NonNull String name, int combatLevel, LootRecordType type, Object metadata, Collection<ItemStack> items, int amount) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        LootTrackerItem[] entries = this.buildEntries(LootTrackerPlugin.stack(items));
        SwingUtilities.invokeLater(() -> this.panel.add(name, type, combatLevel, entries, amount));
        LootRecord lootRecord = new LootRecord(name, type, metadata, LootTrackerPlugin.toGameItems(items), Instant.now(), this.getLootWorldId(), Integer.valueOf(amount), null);
        List<LootRecord> list = this.queuedLoots;
        synchronized (list) {
            this.queuedLoots.add(lootRecord);
        }
        this.eventBus.post(new LootReceived(name, combatLevel, type, items, amount));
    }

    private Integer getLootWorldId() {
        EnumSet worldType = this.client.getWorldType();
        return worldType.contains(WorldType.SEASONAL) || worldType.contains(WorldType.TOURNAMENT_WORLD) || worldType.contains(WorldType.BETA_WORLD) ? Integer.valueOf(this.client.getWorld()) : null;
    }

    @Subscribe
    public void onNpcDespawned(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        if (npc.getId() == 12204 || npc.getId() == 12206) {
            HashMultiset<Integer> ground = HashMultiset.create();
            Scene scene = this.client.getScene();
            Tile[][] p0 = scene.getTiles()[0];
            Arrays.stream(p0).flatMap(Arrays::stream).filter(Objects::nonNull).map(Tile::getGroundItems).filter(Objects::nonNull).flatMap(Collection::stream).forEach(item -> ground.add(item.getId(), item.getQuantity()));
            this.groundSnapshotName = npc.getName();
            this.groundSnapshotCombatLevel = npc.getCombatLevel();
            this.groundSnapshotRegion = WorldPoint.fromLocalInstance((Client)this.client, (LocalPoint)npc.getLocalLocation()).getRegionID();
            this.groundSnapshot = ground;
            this.groundSnapshotCycleDelay = 59;
            log.debug("Ground snapshot: Recorded ground items {} on cycle {} region {}", ground, this.client.getGameCycle(), this.groundSnapshotRegion);
        }
    }

    @Subscribe
    public void onPostClientTick(PostClientTick postClientTick) {
        if (this.groundSnapshotCycleDelay > 0) {
            --this.groundSnapshotCycleDelay;
            if (this.groundSnapshotCycleDelay == 0) {
                log.debug("Ground snapshot: Loot timeout");
                this.groundSnapshotName = null;
                this.groundSnapshotCombatLevel = 0;
                this.groundSnapshot = null;
                return;
            }
            int region = WorldPoint.fromLocalInstance((Client)this.client, (LocalPoint)this.client.getLocalPlayer().getLocalLocation()).getRegionID();
            if (region != this.groundSnapshotRegion) {
                log.debug("Ground snapshot: In wrong region {} != {}", (Object)region, (Object)this.groundSnapshotRegion);
                return;
            }
            HashMultiset ground = HashMultiset.create();
            Scene scene = this.client.getScene();
            Tile[][] p0 = scene.getTiles()[0];
            Arrays.stream(p0).flatMap(Arrays::stream).filter(Objects::nonNull).map(Tile::getGroundItems).filter(Objects::nonNull).flatMap(Collection::stream).forEach(item -> ground.add(item.getId(), item.getQuantity()));
            Multiset diff = Multisets.difference(ground, this.groundSnapshot);
            if (diff.isEmpty()) {
                log.debug("Ground snapshot: No loot yet");
                return;
            }
            log.debug("Ground snapshot: Loot received {} on cycle {}", (Object)diff, (Object)this.client.getGameCycle());
            List<ItemStack> items = diff.entrySet().stream().map(e -> new ItemStack((Integer)e.getElement(), e.getCount())).collect(Collectors.toList());
            this.addLoot(this.groundSnapshotName, this.groundSnapshotCombatLevel, LootRecordType.NPC, null, items);
            this.groundSnapshotName = null;
            this.groundSnapshotCombatLevel = 0;
            this.groundSnapshot = null;
            this.groundSnapshotCycleDelay = 0;
        }
    }

    private Object buildNpcMetadata(NPC npc) {
        if (this.client.getWorldType().contains(WorldType.SEASONAL)) {
            NpcMetadata md = new NpcMetadata();
            md.setId(npc.getId());
            md.setR1(this.client.getVarbitValue(10049));
            md.setR2(this.client.getVarbitValue(10050));
            md.setR3(this.client.getVarbitValue(10051));
            md.setR4(this.client.getVarbitValue(10052));
            md.setR5(this.client.getVarbitValue(10053));
            md.setR6(this.client.getVarbitValue(11696));
            md.setR7(this.client.getVarbitValue(17301));
            md.setR8(this.client.getVarbitValue(17302));
            return md;
        }
        return npc.getId();
    }

    @Subscribe
    public void onNpcLootReceived(NpcLootReceived npcLootReceived) {
        NPC npc = npcLootReceived.getNpc();
        Collection<ItemStack> items = npcLootReceived.getItems();
        String name = npc.getName();
        int combat = npc.getCombatLevel();
        this.addLoot(name, combat, LootRecordType.NPC, this.buildNpcMetadata(npc), items);
        if (this.config.npcKillChatMessage()) {
            String prefix = VOWELS.contains(Character.valueOf(Character.toLowerCase(name.charAt(0)))) ? "an" : "a";
            this.lootReceivedChatMessage(items, prefix + " " + name);
        }
    }

    @Subscribe
    public void onPluginLootReceived(PluginLootReceived event) {
        log.debug("Plugin loot received from {}: {}", (Object)event.getSource().getName(), (Object)event.getItems());
        this.addLoot(event.getName(), event.getCombatLevel(), event.getType(), event.getItems(), event.getItems());
    }

    @Subscribe
    public void onPlayerLootReceived(PlayerLootReceived playerLootReceived) {
        if (this.isPlayerWithinMapRegion(LAST_MAN_STANDING_REGIONS) || this.isPlayerWithinMapRegion(SOUL_WARS_REGIONS)) {
            return;
        }
        Player player = playerLootReceived.getPlayer();
        Collection<ItemStack> items = playerLootReceived.getItems();
        String name = player.getName();
        int combat = player.getCombatLevel();
        this.addLoot(name, combat, LootRecordType.PLAYER, null, items);
        if (this.config.pvpKillChatMessage()) {
            this.lootReceivedChatMessage(items, name);
        }
    }

    @Subscribe
    public void onWidgetLoaded(WidgetLoaded widgetLoaded) {
        ItemContainer container;
        String event;
        Object metadata = null;
        switch (widgetLoaded.getGroupId()) {
            case 155: {
                event = "Barrows";
                container = this.client.getItemContainer(InventoryID.BARROWS_REWARD);
                break;
            }
            case 539: {
                if (this.chestLooted) {
                    return;
                }
                event = CHAMBERS_OF_XERIC;
                container = this.client.getItemContainer(InventoryID.CHAMBERS_OF_XERIC_CHEST);
                this.chestLooted = true;
                break;
            }
            case 23: {
                if (this.chestLooted || !this.inTobChestRegion()) {
                    return;
                }
                event = THEATRE_OF_BLOOD;
                container = this.client.getItemContainer(InventoryID.THEATRE_OF_BLOOD_CHEST);
                this.chestLooted = true;
                break;
            }
            case 771: {
                if (this.chestLooted) {
                    return;
                }
                int raidLevel = this.client.getVarbitValue(14380);
                int teamSize = Math.min(this.client.getVarbitValue(14346), 1) + Math.min(this.client.getVarbitValue(14347), 1) + Math.min(this.client.getVarbitValue(14348), 1) + Math.min(this.client.getVarbitValue(14349), 1) + Math.min(this.client.getVarbitValue(14350), 1) + Math.min(this.client.getVarbitValue(14351), 1) + Math.min(this.client.getVarbitValue(14352), 1) + Math.min(this.client.getVarbitValue(14353), 1);
                int raidDamage = this.client.getVarbitValue(14325);
                event = TOMBS_OF_AMASCUT;
                container = this.client.getItemContainer(InventoryID.TOA_REWARD_CHEST);
                metadata = new int[]{raidLevel, teamSize, raidDamage};
                this.chestLooted = true;
                break;
            }
            case 616: {
                event = "Kingdom of Miscellania";
                container = this.client.getItemContainer(InventoryID.KINGDOM_OF_MISCELLANIA);
                break;
            }
            case 367: {
                event = "Fishing Trawler";
                metadata = this.client.getBoostedSkillLevel(Skill.FISHING);
                container = this.client.getItemContainer(InventoryID.FISHING_TRAWLER_REWARD);
                break;
            }
            case 607: {
                event = "Drift Net";
                metadata = this.client.getBoostedSkillLevel(Skill.FISHING);
                container = this.client.getItemContainer(InventoryID.DRIFT_NET_FISHING_REWARD);
                break;
            }
            case 742: {
                if (this.chestLooted) {
                    return;
                }
                event = "Loot Chest";
                container = this.client.getItemContainer(InventoryID.WILDERNESS_LOOT_CHEST);
                this.chestLooted = true;
                break;
            }
            case 868: {
                event = "Lunar Chest";
                container = this.client.getItemContainer(InventoryID.LUNAR_CHEST);
                break;
            }
            case 864: {
                if (this.chestLooted) {
                    return;
                }
                event = "Fortis Colosseum";
                container = this.client.getItemContainer(InventoryID.FORTIS_COLOSSEUM_REWARD_CHEST);
                this.chestLooted = true;
                break;
            }
            default: {
                return;
            }
        }
        if (container == null) {
            return;
        }
        Collection items = Arrays.stream(container.getItems()).filter(item -> item.getId() > 0).map(item -> new ItemStack(item.getId(), item.getQuantity())).collect(Collectors.toList());
        if (this.config.showRaidsLootValue() && (event.equals(THEATRE_OF_BLOOD) || event.equals(CHAMBERS_OF_XERIC) || event.equals(TOMBS_OF_AMASCUT))) {
            long totalValue = items.stream().filter(item -> item.getId() > -1).mapToLong(item -> this.config.priceType() == LootTrackerPriceType.GRAND_EXCHANGE ? (long)this.itemManager.getItemPrice(item.getId()) * (long)item.getQuantity() : (long)this.itemManager.getItemComposition(item.getId()).getHaPrice() * (long)item.getQuantity()).sum();
            String chatMessage = new ChatMessageBuilder().append(ChatColorType.NORMAL).append("Your loot is worth around ").append(ChatColorType.HIGHLIGHT).append(QuantityFormatter.formatNumber(totalValue)).append(ChatColorType.NORMAL).append(" coins.").build();
            this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.FRIENDSCHATNOTIFICATION).runeLiteFormattedMessage(chatMessage).build());
        }
        if (items.isEmpty()) {
            log.debug("No items to find for Event: {} | Container: {}", (Object)event, (Object)container);
            return;
        }
        this.addLoot(event, -1, LootRecordType.EVENT, metadata, items);
    }

    @Subscribe
    public void onChatMessage(ChatMessage event) {
        ChatMessageType chatType = event.getType();
        if (chatType != ChatMessageType.GAMEMESSAGE && chatType != ChatMessageType.SPAM && chatType != ChatMessageType.MESBOX) {
            return;
        }
        String message = event.getMessage();
        if (message.equals(CHEST_LOOTED_MESSAGE) || message.equals(OTHER_CHEST_LOOTED_MESSAGE) || message.equals(DORGESH_KAAN_CHEST_LOOTED_MESSAGE) || message.startsWith(GRUBBY_CHEST_LOOTED_MESSAGE) || message.startsWith(ANCIENT_CHEST_LOOTED_MESSAGE) || LARRAN_LOOTED_PATTERN.matcher(message).matches() || ROGUES_CHEST_PATTERN.matcher(message).matches()) {
            int regionID = this.client.getLocalPlayer().getWorldLocation().getRegionID();
            log.debug("Chest loot matched '{}' region {}", (Object)message, (Object)regionID);
            if (!CHEST_EVENT_TYPES.containsKey(regionID)) {
                return;
            }
            if (SLAYER_CHEST_EVENT_TYPES.contains(CHEST_EVENT_TYPES.get(regionID))) {
                this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, CHEST_EVENT_TYPES.get(regionID), this.client.getBoostedSkillLevel(Skill.FISHING)));
                return;
            }
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, CHEST_EVENT_TYPES.get(regionID)));
            return;
        }
        if (message.equals(COFFIN_LOOTED_MESSAGE) && this.isPlayerWithinMapRegion(HALLOWED_SEPULCHRE_MAP_REGIONS)) {
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, HALLOWED_SEPULCHRE_COFFIN_EVENT));
            return;
        }
        if (message.equals(HERBIBOAR_LOOTED_MESSAGE)) {
            if (this.processHerbiboarHerbSackLoot(event.getTimestamp())) {
                return;
            }
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, HERBIBOAR_EVENT, this.client.getBoostedSkillLevel(Skill.HERBLORE)));
            return;
        }
        int regionID = this.client.getLocalPlayer().getWorldLocation().getRegionID();
        if (5021 == regionID && message.equals(HESPORI_LOOTED_MESSAGE)) {
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, HESPORI_EVENT));
            return;
        }
        Matcher hamStoreroomMatcher = HAM_CHEST_LOOTED_PATTERN.matcher(message);
        if (hamStoreroomMatcher.matches() && regionID == 10321) {
            String keyType = hamStoreroomMatcher.group("key");
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, String.format("H.A.M. chest (%s)", keyType)));
            return;
        }
        Matcher pickpocketMatcher = PICKPOCKET_REGEX.matcher(message);
        if (pickpocketMatcher.matches()) {
            String pickpocketTarget = WordUtils.capitalize((String)pickpocketMatcher.group("target"));
            if (PICKPOCKET_DISAMBIGUATION_MAP.get(this.lastPickpocketTarget).contains(pickpocketTarget)) {
                pickpocketTarget = this.lastPickpocketTarget;
            }
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.PICKPOCKET, pickpocketTarget));
            return;
        }
        Matcher m = CLUE_SCROLL_PATTERN.matcher(Text.removeTags(message));
        if (m.find()) {
            String eventType;
            String type;
            switch (type = m.group(1).toLowerCase()) {
                case "beginner": {
                    eventType = "Clue Scroll (Beginner)";
                    break;
                }
                case "easy": {
                    eventType = "Clue Scroll (Easy)";
                    break;
                }
                case "medium": {
                    eventType = "Clue Scroll (Medium)";
                    break;
                }
                case "hard": {
                    eventType = "Clue Scroll (Hard)";
                    break;
                }
                case "elite": {
                    eventType = "Clue Scroll (Elite)";
                    break;
                }
                case "master": {
                    eventType = "Clue Scroll (Master)";
                    break;
                }
                default: {
                    log.debug("Unrecognized clue type: {}", (Object)type);
                    return;
                }
            }
            this.onInvChange(InventoryID.BARROWS_REWARD, this.collectInvItems(LootRecordType.EVENT, eventType));
            return;
        }
        if (SHADE_CHEST_NO_KEY_PATTERN.matcher(message).matches()) {
            this.resetEvent();
            return;
        }
        Matcher matcher = BIRDHOUSE_PATTERN.matcher(message);
        if (matcher.matches()) {
            int xp = Integer.parseInt(matcher.group(1));
            String type = BIRDHOUSE_XP_TO_TYPE.get(xp);
            if (type == null) {
                log.debug("Unknown bird house type {}", (Object)xp);
                return;
            }
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, type, this.client.getBoostedSkillLevel(Skill.HUNTER)));
            return;
        }
        if (regionID == 12588 && message.startsWith("You found some loot: ")) {
            this.onInvChange(this.collectInvItems(LootRecordType.EVENT, TEMPOROSS_EVENT, this.client.getBoostedSkillLevel(Skill.FISHING)));
            return;
        }
        if (regionID == 14484 && message.startsWith("You found some loot: ")) {
            this.onInvChange(this.collectInvItems(LootRecordType.EVENT, GUARDIANS_OF_THE_RIFT_EVENT, this.client.getBoostedSkillLevel(Skill.RUNECRAFT)));
            return;
        }
        if (message.equals(IMPLING_CATCH_MESSAGE)) {
            this.onInvChange(this.collectInvItems(LootRecordType.EVENT, this.client.getLocalPlayer().getInteracting().getName()));
        }
        if (regionID == 12106 && message.equals(FONT_OF_CONSUMPTION_USE_MESSAGE)) {
            this.onInvChange(this.collectInvItems(LootRecordType.EVENT, "Unsired"));
        }
    }

    @Subscribe
    public void onItemContainerChanged(ItemContainerChanged event) {
        if (event.getContainerId() == InventoryID.WILDERNESS_LOOT_CHEST.getId() && Arrays.stream(event.getItemContainer().getItems()).noneMatch(i -> i.getId() > -1)) {
            log.debug("Resetting chest loot flag");
            this.chestLooted = false;
        }
        if (this.inventoryId == null || event.getContainerId() != this.inventoryId.getId()) {
            return;
        }
        ItemContainer inventoryContainer = event.getItemContainer();
        HashMultiset currentInventory = HashMultiset.create();
        Arrays.stream(inventoryContainer.getItems()).forEach(item -> currentInventory.add(item.getId(), item.getQuantity()));
        WorldPoint playerLocation = this.client.getLocalPlayer().getWorldLocation();
        Collection<ItemStack> groundItems = this.lootManager.getItemSpawns(playerLocation);
        Multiset diff = Multisets.difference(currentInventory, this.inventorySnapshot);
        Multiset<Integer> diffr = Multisets.difference(this.inventorySnapshot, currentInventory);
        List<ItemStack> items = diff.entrySet().stream().map(e -> new ItemStack((Integer)e.getElement(), e.getCount())).collect(Collectors.toList());
        log.debug("Inv change: {} Ground items: {}", (Object)items, (Object)groundItems);
        if (this.inventorySnapshotCb != null) {
            this.inventorySnapshotCb.accept(items, groundItems, diffr);
        }
        this.inventoryId = null;
        this.inventorySnapshot = null;
        this.inventorySnapshotCb = null;
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event) {
        if (LootTrackerPlugin.isNPCOp(event.getMenuAction()) && event.getMenuOption().equals("Pickpocket")) {
            this.lastPickpocketTarget = Text.removeTags(event.getMenuTarget());
        } else if (LootTrackerPlugin.isObjectOp(event.getMenuAction()) && event.getMenuOption().equals("Open") && SHADE_CHEST_OBJECTS.containsKey(event.getId())) {
            this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, SHADE_CHEST_OBJECTS.get(event.getId())));
        } else if (event.isItemOp()) {
            if (event.getItemId() == 22993 && (event.getMenuOption().equals("Take") || event.getMenuOption().equals("Take-all"))) {
                this.onInvChange(this.collectInvItems(LootRecordType.EVENT, SEEDPACK_EVENT));
            } else if (event.getMenuOption().equals("Search") && BIRDNEST_IDS.contains(event.getItemId())) {
                this.onInvChange(this.collectInvItems(LootRecordType.EVENT, BIRDNEST_EVENT));
            } else if (event.getMenuOption().equals("Open")) {
                switch (event.getItemId()) {
                    case 405: {
                        this.onInvChange(this.collectInvItems(LootRecordType.EVENT, CASKET_EVENT));
                        break;
                    }
                    case 19473: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, BAG_FULL_OF_GEMS_PERCY_EVENT));
                        break;
                    }
                    case 24853: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, BAG_FULL_OF_GEMS_BELONA_EVENT));
                        break;
                    }
                    case 25537: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, BAG_FULL_OF_GEMS_DUSURI_EVENT));
                        break;
                    }
                    case 20703: 
                    case 20791: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, WINTERTODT_SUPPLY_CRATE_EVENT));
                        break;
                    }
                    case 25342: {
                        this.onInvChange(this.collectInvItems(LootRecordType.EVENT, SPOILS_OF_WAR_EVENT));
                        break;
                    }
                    case 25590: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, TEMPOROSS_CASKET_EVENT));
                        break;
                    }
                    case 25647: 
                    case 25649: 
                    case 25651: 
                    case 26908: 
                    case 27293: 
                    case 27622: 
                    case 28082: 
                    case 28084: 
                    case 28086: 
                    case 28088: 
                    case 28090: 
                    case 28092: 
                    case 28094: 
                    case 28096: 
                    case 28098: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, this.itemManager.getItemComposition(event.getItemId()).getName()));
                        break;
                    }
                    case 24884: {
                        this.onInvChange(this.collectInvItems(LootRecordType.EVENT, MAHOGANY_CRATE_EVENT, this.client.getBoostedSkillLevel(Skill.CONSTRUCTION)));
                        break;
                    }
                    case 24946: {
                        this.onInvChange(this.collectInvAndGroundItems(LootRecordType.EVENT, HALLOWED_SACK_EVENT));
                        break;
                    }
                    case 27693: {
                        this.onInvChange(this.collectInvItems(LootRecordType.EVENT, ORE_PACK_VM_EVENT));
                        break;
                    }
                    case 29242: 
                    case 29244: 
                    case 29246: 
                    case 29248: 
                    case 29250: {
                        int itemId = event.getItemId();
                        this.onInvChange((invItems, groundItems, removedItems) -> {
                            int cnt = removedItems.count(itemId);
                            if (cnt > 0) {
                                String name = this.itemManager.getItemComposition(itemId).getMembersName();
                                this.addLoot(name, -1, LootRecordType.EVENT, null, invItems, cnt);
                            }
                        });
                    }
                }
            } else if (event.getMenuOption().equals("Loot") && IMPLING_JARS.contains(event.getItemId())) {
                int itemId = event.getItemId();
                this.onInvChange((invItems, groundItems, removedItems) -> {
                    int cnt = removedItems.count(itemId);
                    if (cnt > 0) {
                        String name = this.itemManager.getItemComposition(itemId).getMembersName();
                        this.addLoot(name, -1, LootRecordType.EVENT, null, invItems, cnt);
                    }
                });
            }
        }
    }

    private static boolean isNPCOp(MenuAction menuAction) {
        int id = menuAction.getId();
        return id >= MenuAction.NPC_FIRST_OPTION.getId() && id <= MenuAction.NPC_FIFTH_OPTION.getId();
    }

    private static boolean isObjectOp(MenuAction menuAction) {
        int id = menuAction.getId();
        return id >= MenuAction.GAME_OBJECT_FIRST_OPTION.getId() && id <= MenuAction.GAME_OBJECT_FOURTH_OPTION.getId() || id == MenuAction.GAME_OBJECT_FIFTH_OPTION.getId();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    private CompletableFuture<Void> submitLoot() {
        ArrayList<LootRecord> copy;
        List<LootRecord> list = this.queuedLoots;
        synchronized (list) {
            if (this.queuedLoots.isEmpty()) {
                return null;
            }
            copy = new ArrayList<LootRecord>(this.queuedLoots);
            this.queuedLoots.clear();
        }
        this.saveLoot(copy);
        log.debug("Submitting {} loot records", (Object)copy.size());
        return this.lootTrackerClient.submit(copy);
    }

    private Collection<ConfigLoot> combine(List<LootRecord> records) {
        HashMap<ConfigLoot, ConfigLoot> map = new HashMap<ConfigLoot, ConfigLoot>();
        for (LootRecord record : records) {
            ConfigLoot key = new ConfigLoot(record.getType(), record.getEventId());
            ConfigLoot loot = map.computeIfAbsent(key, k -> key);
            loot.kills += record.getAmount().intValue();
            for (GameItem item : record.getDrops()) {
                loot.add(item.getId(), item.getQty());
            }
        }
        return map.values();
    }

    private void saveLoot(List<LootRecord> records) {
        Instant now = Instant.now();
        Collection<ConfigLoot> combinedRecords = this.combine(records);
        for (ConfigLoot record : combinedRecords) {
            ConfigLoot lootConfig = this.getLootConfig(record.type, record.name);
            if (lootConfig == null) {
                lootConfig = record;
            } else {
                lootConfig.kills += record.kills;
                for (int i = 0; i < record.drops.length; i += 2) {
                    lootConfig.add(record.drops[i], record.drops[i + 1]);
                }
            }
            lootConfig.last = now;
            this.setLootConfig(lootConfig.type, lootConfig.name, lootConfig);
        }
    }

    private void resetEvent() {
        this.inventoryId = null;
        this.inventorySnapshot = null;
        this.inventorySnapshotCb = null;
    }

    private InvChangeCallback collectInvItems(LootRecordType type, String event) {
        return this.collectInvItems(type, event, null);
    }

    private InvChangeCallback collectInvItems(LootRecordType type, String event, Object metadata) {
        return (invItems, groundItems, removedItems) -> this.addLoot(event, -1, type, metadata, invItems);
    }

    private InvChangeCallback collectInvAndGroundItems(LootRecordType type, String event) {
        return this.collectInvAndGroundItems(type, event, null);
    }

    private InvChangeCallback collectInvAndGroundItems(LootRecordType type, String event, Object metadata) {
        return (invItems, groundItems, removedItems) -> {
            ArrayList<ItemStack> combined = new ArrayList<ItemStack>();
            combined.addAll(invItems);
            combined.addAll(groundItems);
            this.addLoot(event, -1, type, metadata, combined);
        };
    }

    private void onInvChange(InvChangeCallback cb) {
        this.onInvChange(InventoryID.INVENTORY, cb);
    }

    private void onInvChange(InventoryID inv, InvChangeCallback cb) {
        this.inventoryId = inv;
        this.inventorySnapshot = HashMultiset.create();
        this.inventorySnapshotCb = cb;
        ItemContainer itemContainer = this.client.getItemContainer(inv);
        if (itemContainer != null) {
            Arrays.stream(itemContainer.getItems()).forEach(item -> this.inventorySnapshot.add(item.getId(), item.getQuantity()));
        }
    }

    private boolean processHerbiboarHerbSackLoot(int timestamp) {
        ArrayList<ItemStack> herbs = new ArrayList<ItemStack>();
        for (MessageNode messageNode : this.client.getMessages()) {
            Matcher matcher;
            if (messageNode.getTimestamp() != timestamp || messageNode.getType() != ChatMessageType.SPAM || !(matcher = HERBIBOAR_HERB_SACK_PATTERN.matcher(messageNode.getValue())).matches()) continue;
            herbs.add(new ItemStack(this.itemManager.search(matcher.group(1)).get(0).getId(), 1));
        }
        if (herbs.isEmpty()) {
            return false;
        }
        int herbloreLevel = this.client.getBoostedSkillLevel(Skill.HERBLORE);
        this.addLoot(HERBIBOAR_EVENT, -1, LootRecordType.EVENT, herbloreLevel, herbs);
        return true;
    }

    @VisibleForTesting
    boolean inTobChestRegion() {
        int region = WorldPoint.fromLocalInstance((Client)this.client, (LocalPoint)this.client.getLocalPlayer().getLocalLocation()).getRegionID();
        return region == 12867 || region == 14642;
    }

    void toggleItem(String name, boolean ignore) {
        LinkedHashSet<String> ignoredItemSet = new LinkedHashSet<String>(this.ignoredItems);
        if (ignore) {
            ignoredItemSet.add(name);
        } else {
            ignoredItemSet.remove(name);
        }
        this.config.setIgnoredItems(Text.toCSV(ignoredItemSet));
    }

    boolean isIgnored(String name) {
        return this.ignoredItems.contains(name);
    }

    void toggleEvent(String name, boolean ignore) {
        LinkedHashSet<String> ignoredSet = new LinkedHashSet<String>(this.ignoredEvents);
        if (ignore) {
            ignoredSet.add(name);
        } else {
            ignoredSet.remove(name);
        }
        this.config.setIgnoredEvents(Text.toCSV(ignoredSet));
    }

    boolean isEventIgnored(String name) {
        return this.ignoredEvents.contains(name);
    }

    private LootTrackerItem buildLootTrackerItem(int itemId, int quantity) {
        ItemComposition itemComposition = this.itemManager.getItemComposition(itemId);
        int gePrice = this.itemManager.getItemPrice(itemId);
        int haPrice = itemComposition.getHaPrice();
        boolean ignored = this.ignoredItems.contains(itemComposition.getMembersName());
        return new LootTrackerItem(itemId, itemComposition.getMembersName(), quantity, gePrice, haPrice, ignored);
    }

    private LootTrackerItem[] buildEntries(Collection<ItemStack> itemStacks) {
        return (LootTrackerItem[])itemStacks.stream().map(itemStack -> this.buildLootTrackerItem(itemStack.getId(), itemStack.getQuantity())).toArray(LootTrackerItem[]::new);
    }

    private static Collection<GameItem> toGameItems(Collection<ItemStack> items) {
        return items.stream().map(item -> new GameItem(item.getId(), item.getQuantity())).collect(Collectors.toList());
    }

    private LootTrackerRecord convertToLootTrackerRecord(ConfigLoot configLoot) {
        LootTrackerItem[] items = new LootTrackerItem[configLoot.drops.length / 2];
        for (int i = 0; i < configLoot.drops.length; i += 2) {
            int id = configLoot.drops[i];
            int qty = configLoot.drops[i + 1];
            items[i >> 1] = this.buildLootTrackerItem(id, qty);
        }
        return new LootTrackerRecord(configLoot.name, "", configLoot.type, items, configLoot.kills);
    }

    private boolean isPlayerWithinMapRegion(Set<Integer> definedMapRegions) {
        int[] mapRegions;
        for (int region : mapRegions = this.client.getMapRegions()) {
            if (!definedMapRegions.contains(region)) continue;
            return true;
        }
        return false;
    }

    private void lootReceivedChatMessage(Collection<ItemStack> items, String name) {
        long totalPrice = items.stream().mapToLong(item -> this.config.priceType() == LootTrackerPriceType.GRAND_EXCHANGE ? (long)this.itemManager.getItemPrice(item.getId()) * (long)item.getQuantity() : (long)this.itemManager.getItemComposition(item.getId()).getHaPrice() * (long)item.getQuantity()).sum();
        String message = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("You've killed ").append(name).append(" for ").append(QuantityFormatter.quantityToStackSize(totalPrice)).append(" loot.").build();
        this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.CONSOLE).runeLiteFormattedMessage(message).build());
    }

    ConfigLoot getLootConfig(LootRecordType type, String name) {
        String profile = this.profileKey;
        if (Strings.isNullOrEmpty(profile)) {
            log.debug("Trying to get loot with no profile!");
            return null;
        }
        String json = this.configManager.getConfiguration("loottracker", profile, "drops_" + String.valueOf(type) + "_" + name);
        if (json == null) {
            return null;
        }
        return this.gson.fromJson(json, ConfigLoot.class);
    }

    void setLootConfig(LootRecordType type, String name, ConfigLoot loot) {
        String profile = this.profileKey;
        if (Strings.isNullOrEmpty(profile)) {
            log.debug("Trying to set loot with no profile!");
            return;
        }
        String json = this.gson.toJson(loot);
        this.configManager.setConfiguration("loottracker", profile, "drops_" + String.valueOf(type) + "_" + name, json);
    }

    void removeLootConfig(LootRecordType type, String name) {
        String profile = this.profileKey;
        if (Strings.isNullOrEmpty(profile)) {
            log.debug("Trying to remove loot with no profile!");
            return;
        }
        this.configManager.unsetConfiguration("loottracker", profile, "drops_" + String.valueOf(type) + "_" + name);
    }

    void removeAllLoot() {
        String profile = this.profileKey;
        if (Strings.isNullOrEmpty(profile)) {
            log.debug("Trying to clear loot with no profile!");
            return;
        }
        for (String key : this.configManager.getRSProfileConfigurationKeys("loottracker", profile, "drops_")) {
            this.configManager.unsetConfiguration("loottracker", profile, key);
        }
    }

    LootTrackerClient getLootTrackerClient() {
        return this.lootTrackerClient;
    }

    @FunctionalInterface
    static interface InvChangeCallback {
        public void accept(Collection<ItemStack> var1, Collection<ItemStack> var2, Multiset<Integer> var3);
    }
}

