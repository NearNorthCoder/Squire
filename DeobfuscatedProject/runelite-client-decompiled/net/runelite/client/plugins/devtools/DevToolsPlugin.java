/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.formdev.flatlaf.extras.FlatInspector
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Experience
 *  net.runelite.api.IndexedSprite
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.VarbitComposition
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.events.CommandExecuted
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.api.events.ScriptCallbackEvent
 *  net.runelite.api.events.StatChanged
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.kit.KitType
 */
package net.runelite.client.plugins.devtools;

import ch.qos.logback.classic.Level;
import com.formdev.flatlaf.extras.FlatInspector;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.inject.Provides;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Experience;
import net.runelite.api.IndexedSprite;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.VarbitComposition;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.CommandExecuted;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.StatChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.kit.KitType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.devtools.CameraOverlay;
import net.runelite.client.plugins.devtools.DevToolsButton;
import net.runelite.client.plugins.devtools.DevToolsConfig;
import net.runelite.client.plugins.devtools.DevToolsOverlay;
import net.runelite.client.plugins.devtools.DevToolsPanel;
import net.runelite.client.plugins.devtools.LocationOverlay;
import net.runelite.client.plugins.devtools.SceneOverlay;
import net.runelite.client.plugins.devtools.SoundEffectOverlay;
import net.runelite.client.plugins.devtools.WorldMapLocationOverlay;
import net.runelite.client.plugins.devtools.WorldMapRegionOverlay;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.JagexColors;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.HotkeyListener;
import net.runelite.client.util.ImageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Developer Tools", tags={"panel"})
public class DevToolsPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(DevToolsPlugin.class);
    private static final List<MenuAction> EXAMINE_MENU_ACTIONS = ImmutableList.of(MenuAction.EXAMINE_ITEM, MenuAction.EXAMINE_ITEM_GROUND, MenuAction.EXAMINE_NPC, MenuAction.EXAMINE_OBJECT);
    @Inject
    private Client client;
    @Inject
    private ClientToolbar clientToolbar;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private DevToolsOverlay overlay;
    @Inject
    private LocationOverlay locationOverlay;
    @Inject
    private SceneOverlay sceneOverlay;
    @Inject
    private CameraOverlay cameraOverlay;
    @Inject
    private WorldMapLocationOverlay worldMapLocationOverlay;
    @Inject
    private WorldMapRegionOverlay mapRegionOverlay;
    @Inject
    private SoundEffectOverlay soundEffectOverlay;
    @Inject
    private EventBus eventBus;
    @Inject
    private ConfigManager configManager;
    @Inject
    private ChatMessageManager chatMessageManager;
    @Inject
    private DevToolsConfig config;
    private DevToolsButton players;
    private DevToolsButton npcs;
    private DevToolsButton groundItems;
    private DevToolsButton groundObjects;
    private DevToolsButton gameObjects;
    private DevToolsButton graphicsObjects;
    private DevToolsButton walls;
    private DevToolsButton decorations;
    private DevToolsButton projectiles;
    private DevToolsButton location;
    private DevToolsButton chunkBorders;
    private DevToolsButton mapSquares;
    private DevToolsButton loadingLines;
    private DevToolsButton validMovement;
    private DevToolsButton movementFlags;
    private DevToolsButton lineOfSight;
    private DevToolsButton cameraPosition;
    private DevToolsButton worldMapLocation;
    private DevToolsButton tileLocation;
    private DevToolsButton interacting;
    private DevToolsButton examine;
    private DevToolsButton detachedCamera;
    private DevToolsButton widgetInspector;
    private DevToolsButton varInspector;
    private DevToolsButton soundEffects;
    private DevToolsButton scriptInspector;
    private DevToolsButton inventoryInspector;
    private DevToolsButton roofs;
    private DevToolsButton shell;
    private DevToolsButton menus;
    private DevToolsButton uiDefaultsInspector;
    private NavigationButton navButton;
    private final HotkeyListener swingInspectorHotkeyListener = new HotkeyListener(() -> this.config.swingInspectorHotkey()){
        Object inspector;

        @Override
        public void hotkeyPressed() {
            Window window = KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow();
            try {
                if (this.inspector == null) {
                    JRootPane rootPane = ((RootPaneContainer)((Object)window)).getRootPane();
                    FlatInspector fi = new FlatInspector(rootPane);
                    fi.setEnabled(true);
                    this.inspector = fi;
                    fi.addPropertyChangeListener(ev -> {
                        if ("enabled".equals(ev.getPropertyName()) && !fi.isEnabled() && this.inspector == ev.getSource()) {
                            this.inspector = null;
                        }
                    });
                } else {
                    ((FlatInspector)this.inspector).setEnabled(false);
                }
            }
            catch (Exception | LinkageError e) {
                log.warn("unable to open swing inspector", e);
                JOptionPane.showMessageDialog(window, "The swing inspector is not available.");
            }
        }
    };
    private final AWTEventListener swingInspectorKeyListener = rawEv -> {
        if (rawEv instanceof KeyEvent) {
            KeyEvent kev = (KeyEvent)rawEv;
            if (kev.getID() == 401) {
                this.swingInspectorHotkeyListener.keyPressed(kev);
            } else if (kev.getID() == 402) {
                this.swingInspectorHotkeyListener.keyReleased(kev);
            }
        }
    };

    @Provides
    DevToolsConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(DevToolsConfig.class);
    }

    @Override
    protected void startUp() throws Exception {
        this.players = new DevToolsButton("Players");
        this.npcs = new DevToolsButton("NPCs");
        this.groundItems = new DevToolsButton("Ground Items");
        this.groundObjects = new DevToolsButton("Ground Objects");
        this.gameObjects = new DevToolsButton("Game Objects");
        this.graphicsObjects = new DevToolsButton("Graphics Objects");
        this.walls = new DevToolsButton("Walls");
        this.decorations = new DevToolsButton("Decorations");
        this.projectiles = new DevToolsButton("Projectiles");
        this.location = new DevToolsButton("Location");
        this.worldMapLocation = new DevToolsButton("World Map Location");
        this.tileLocation = new DevToolsButton("Tile Location");
        this.cameraPosition = new DevToolsButton("Camera Position");
        this.chunkBorders = new DevToolsButton("Chunk Borders");
        this.mapSquares = new DevToolsButton("Map Squares");
        this.loadingLines = new DevToolsButton("Loading Lines");
        this.lineOfSight = new DevToolsButton("Line Of Sight");
        this.validMovement = new DevToolsButton("Valid Movement");
        this.movementFlags = new DevToolsButton("Movement Flags");
        this.interacting = new DevToolsButton("Interacting");
        this.examine = new DevToolsButton("Examine");
        this.detachedCamera = new DevToolsButton("Detached Camera");
        this.widgetInspector = new DevToolsButton("Widget Inspector");
        this.varInspector = new DevToolsButton("Var Inspector");
        this.soundEffects = new DevToolsButton("Sound Effects");
        this.scriptInspector = new DevToolsButton("Script Inspector");
        this.inventoryInspector = new DevToolsButton("Inventory Inspector");
        this.roofs = new DevToolsButton("Roofs");
        this.shell = new DevToolsButton("Shell");
        this.menus = new DevToolsButton("Menus");
        this.uiDefaultsInspector = new DevToolsButton("Swing Defaults");
        this.overlayManager.add(this.overlay);
        this.overlayManager.add(this.locationOverlay);
        this.overlayManager.add(this.sceneOverlay);
        this.overlayManager.add(this.cameraOverlay);
        this.overlayManager.add(this.worldMapLocationOverlay);
        this.overlayManager.add(this.mapRegionOverlay);
        this.overlayManager.add(this.soundEffectOverlay);
        DevToolsPanel panel = (DevToolsPanel)this.injector.getInstance(DevToolsPanel.class);
        BufferedImage icon = ImageUtil.loadImageResource(this.getClass(), "devtools_icon.png");
        this.navButton = NavigationButton.builder().tooltip("Developer Tools").icon(icon).priority(1).panel(panel).build();
        this.clientToolbar.addNavigation(this.navButton);
        this.eventBus.register(this.soundEffectOverlay);
        Toolkit.getDefaultToolkit().addAWTEventListener(this.swingInspectorKeyListener, 8L);
    }

    @Override
    protected void shutDown() throws Exception {
        this.eventBus.unregister(this.soundEffectOverlay);
        this.overlayManager.remove(this.overlay);
        this.overlayManager.remove(this.locationOverlay);
        this.overlayManager.remove(this.sceneOverlay);
        this.overlayManager.remove(this.cameraOverlay);
        this.overlayManager.remove(this.worldMapLocationOverlay);
        this.overlayManager.remove(this.mapRegionOverlay);
        this.overlayManager.remove(this.soundEffectOverlay);
        this.clientToolbar.removeNavigation(this.navButton);
        Toolkit.getDefaultToolkit().removeAWTEventListener(this.swingInspectorKeyListener);
    }

    @Subscribe
    public void onCommandExecuted(CommandExecuted commandExecuted) {
        CharSequence[] args = commandExecuted.getArguments();
        switch (commandExecuted.getCommand().toLowerCase()) {
            case "logger": {
                String message;
                ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger("ROOT");
                Level currentLoggerLevel = logger.getLevel();
                if (args.length < 1) {
                    message = "Logger level is currently set to " + String.valueOf(currentLoggerLevel);
                } else {
                    Level newLoggerLevel = Level.toLevel((String)args[0], currentLoggerLevel);
                    logger.setLevel(newLoggerLevel);
                    message = "Logger level has been set to " + String.valueOf(newLoggerLevel);
                }
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", message, null);
                break;
            }
            case "getvarp": {
                int varp = Integer.parseInt(args[0]);
                int[] varps = this.client.getVarps();
                int value = varps[varp];
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "VarPlayer " + varp + ": " + value, null);
                break;
            }
            case "setvarp": {
                int varp = Integer.parseInt(args[0]);
                int value = Integer.parseInt((String)args[1]);
                int[] varps = this.client.getVarps();
                varps[varp] = value;
                this.client.queueChangedVarp(varp);
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Set VarPlayer " + varp + " to " + value, null);
                VarbitChanged varbitChanged = new VarbitChanged();
                varbitChanged.setVarpId(varp);
                varbitChanged.setValue(value);
                this.eventBus.post(varbitChanged);
                break;
            }
            case "getvarb": {
                int varbit = Integer.parseInt(args[0]);
                int value = this.client.getVarbitValue(this.client.getVarps(), varbit);
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Varbit " + varbit + ": " + value, null);
                break;
            }
            case "setvarb": {
                int varbit = Integer.parseInt(args[0]);
                int value = Integer.parseInt((String)args[1]);
                this.client.setVarbitValue(this.client.getVarps(), varbit, value);
                VarbitComposition varbitComposition = this.client.getVarbit(varbit);
                this.client.queueChangedVarp(varbitComposition.getIndex());
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Set varbit " + varbit + " to " + value, null);
                VarbitChanged varbitChanged = new VarbitChanged();
                varbitChanged.setVarbitId(varbit);
                varbitChanged.setValue(value);
                this.eventBus.post(varbitChanged);
                break;
            }
            case "addxp": {
                int level;
                Skill skill = Skill.valueOf((String)args[0].toUpperCase());
                int xp = Integer.parseInt((String)args[1]);
                int totalXp = this.client.getSkillExperience(skill) + xp;
                this.client.getBoostedSkillLevels()[skill.ordinal()] = level = Math.min(Experience.getLevelForXp((int)totalXp), 99);
                this.client.getRealSkillLevels()[skill.ordinal()] = level;
                this.client.getSkillExperiences()[skill.ordinal()] = totalXp;
                this.client.queueChangedSkill(skill);
                StatChanged statChanged = new StatChanged(skill, totalXp, level, level);
                this.eventBus.post(statChanged);
                break;
            }
            case "setstat": {
                Skill skill = Skill.valueOf((String)args[0].toUpperCase());
                int level = Integer.parseInt((String)args[1]);
                level = Ints.constrainToRange(level, 1, 99);
                int xp = Experience.getXpForLevel((int)level);
                this.client.getBoostedSkillLevels()[skill.ordinal()] = level;
                this.client.getRealSkillLevels()[skill.ordinal()] = level;
                this.client.getSkillExperiences()[skill.ordinal()] = xp;
                this.client.queueChangedSkill(skill);
                StatChanged statChanged = new StatChanged(skill, xp, level, level);
                this.eventBus.post(statChanged);
                break;
            }
            case "anim": {
                int id = Integer.parseInt(args[0]);
                Player localPlayer = this.client.getLocalPlayer();
                localPlayer.setAnimation(id);
                localPlayer.setAnimationFrame(0);
                break;
            }
            case "gfx": {
                int id = Integer.parseInt(args[0]);
                Player localPlayer = this.client.getLocalPlayer();
                localPlayer.setGraphic(id);
                localPlayer.setSpotAnimFrame(0);
                break;
            }
            case "transform": {
                int id = Integer.parseInt(args[0]);
                Player player = this.client.getLocalPlayer();
                player.getPlayerComposition().setTransformedNpcId(id);
                player.setIdlePoseAnimation(-1);
                player.setPoseAnimation(-1);
                break;
            }
            case "wear": {
                int slot = Integer.parseInt(args[0]);
                int id = Integer.parseInt((String)args[1]);
                Player player = this.client.getLocalPlayer();
                player.getPlayerComposition().getEquipmentIds()[slot] = id + 512;
                player.getPlayerComposition().setHash();
                break;
            }
            case "tex": {
                Player player = this.client.getLocalPlayer();
                player.getPlayerComposition().getEquipmentIds()[KitType.CAPE.getIndex()] = 7082;
                player.getPlayerComposition().getEquipmentIds()[KitType.SHIELD.getIndex()] = 4668;
                player.getPlayerComposition().setHash();
                break;
            }
            case "alpha": {
                Player player = this.client.getLocalPlayer();
                player.getPlayerComposition().getEquipmentIds()[KitType.HEAD.getIndex()] = 6621;
                player.getPlayerComposition().getEquipmentIds()[KitType.AMULET.getIndex()] = 20878;
                player.getPlayerComposition().getEquipmentIds()[KitType.CAPE.getIndex()] = 6623;
                player.getPlayerComposition().getEquipmentIds()[KitType.TORSO.getIndex()] = 6619;
                player.getPlayerComposition().getEquipmentIds()[KitType.SHIELD.getIndex()] = 13329;
                player.getPlayerComposition().getEquipmentIds()[KitType.ARMS.getIndex()] = -1;
                player.getPlayerComposition().getEquipmentIds()[KitType.LEGS.getIndex()] = 6620;
                player.getPlayerComposition().getEquipmentIds()[KitType.HAIR.getIndex()] = -1;
                player.getPlayerComposition().getEquipmentIds()[KitType.HANDS.getIndex()] = 6110;
                player.getPlayerComposition().getEquipmentIds()[KitType.BOOTS.getIndex()] = 6106;
                player.getPlayerComposition().setHash();
                break;
            }
            case "sound": {
                int id = Integer.parseInt(args[0]);
                this.client.playSoundEffect(id);
                break;
            }
            case "msg": {
                this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", String.join((CharSequence)" ", args), "");
                break;
            }
            case "setconf": {
                String message;
                String group = args[0];
                Object key = args[1];
                String value = "";
                for (int i = 2; i < args.length; ++i) {
                    if (((String)args[i]).equals("=")) {
                        value = String.join((CharSequence)" ", Arrays.copyOfRange(args, i + 1, args.length));
                        break;
                    }
                    key = (String)key + " " + (String)args[i];
                }
                String current = this.configManager.getConfiguration(group, (String)key);
                if (value.isEmpty()) {
                    this.configManager.unsetConfiguration(group, (String)key);
                    message = String.format("Unset configuration %s.%s (was: %s)", group, key, current);
                } else {
                    this.configManager.setConfiguration(group, (String)key, value);
                    message = String.format("Set configuration %s.%s to %s (was: %s)", group, key, value, current);
                }
                this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.GAMEMESSAGE).runeLiteFormattedMessage(new ChatMessageBuilder().append(message).build()).build());
                break;
            }
            case "getconf": {
                String group = args[0];
                String key = String.join((CharSequence)" ", Arrays.copyOfRange(args, 1, args.length));
                String value = this.configManager.getConfiguration(group, key);
                String message = String.format("%s.%s = %s", group, key, value);
                this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.GAMEMESSAGE).runeLiteFormattedMessage(new ChatMessageBuilder().append(message).build()).build());
                break;
            }
            case "modicons": {
                ChatMessageBuilder builder = new ChatMessageBuilder();
                IndexedSprite[] modIcons = this.client.getModIcons();
                for (int i = 0; i < modIcons.length; ++i) {
                    builder.append(i + "=").img(i);
                    if (i == modIcons.length - 1) continue;
                    builder.append(", ");
                }
                this.chatMessageManager.queue(QueuedMessage.builder().type(ChatMessageType.GAMEMESSAGE).runeLiteFormattedMessage(builder.build()).build());
                break;
            }
        }
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event) {
        if (!this.examine.isActive()) {
            return;
        }
        MenuAction action = MenuAction.of((int)event.getType());
        if (EXAMINE_MENU_ACTIONS.contains(action)) {
            MenuEntry entry = event.getMenuEntry();
            int identifier = event.getIdentifier();
            Object info = "ID: ";
            if (action == MenuAction.EXAMINE_NPC) {
                NPC npc = entry.getNpc();
                assert (npc != null);
                info = (String)info + npc.getId();
            } else {
                info = (String)info + identifier;
                if (action == MenuAction.EXAMINE_OBJECT) {
                    WorldPoint point = WorldPoint.fromScene((Client)this.client, (int)entry.getParam0(), (int)entry.getParam1(), (int)this.client.getPlane());
                    info = (String)info + " X: " + point.getX() + " Y: " + point.getY();
                }
            }
            entry.setTarget(entry.getTarget() + " " + ColorUtil.prependColorTag("(" + (String)info + ")", JagexColors.MENU_TARGET));
        }
    }

    @Subscribe
    public void onScriptCallbackEvent(ScriptCallbackEvent ev) {
        if ("devtoolsEnabled".equals(ev.getEventName())) {
            this.client.getIntStack()[this.client.getIntStackSize() - 1] = 1;
        }
    }

    @Subscribe
    public void onClientTick(ClientTick clientTick) {
        if (this.menus.isActive() && !this.client.isMenuOpen()) {
            for (int i = 0; i < 100; ++i) {
                int i_ = i;
                if (i % 30 == 0) {
                    MenuEntry parent = this.client.createMenuEntry(1).setOption("pmenu" + i).setTarget("devtools").setType(MenuAction.RUNELITE_SUBMENU);
                    for (int j = 0; j < 4; ++j) {
                        int j_ = j;
                        this.client.createMenuEntry(1).setOption("submenu" + j).setTarget("devtools").setType(MenuAction.RUNELITE).setParent(parent).onClick(c -> this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "menu " + i_ + " sub " + j_, null));
                    }
                    continue;
                }
                this.client.createMenuEntry(1).setOption("menu" + i).setTarget("devtools").setType(MenuAction.RUNELITE).onClick(c -> this.client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "menu " + i_, null));
            }
        }
    }

    public Client getClient() {
        return this.client;
    }

    public ClientToolbar getClientToolbar() {
        return this.clientToolbar;
    }

    public OverlayManager getOverlayManager() {
        return this.overlayManager;
    }

    public DevToolsOverlay getOverlay() {
        return this.overlay;
    }

    public LocationOverlay getLocationOverlay() {
        return this.locationOverlay;
    }

    public SceneOverlay getSceneOverlay() {
        return this.sceneOverlay;
    }

    public CameraOverlay getCameraOverlay() {
        return this.cameraOverlay;
    }

    public WorldMapLocationOverlay getWorldMapLocationOverlay() {
        return this.worldMapLocationOverlay;
    }

    public WorldMapRegionOverlay getMapRegionOverlay() {
        return this.mapRegionOverlay;
    }

    public SoundEffectOverlay getSoundEffectOverlay() {
        return this.soundEffectOverlay;
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public ConfigManager getConfigManager() {
        return this.configManager;
    }

    public ChatMessageManager getChatMessageManager() {
        return this.chatMessageManager;
    }

    public DevToolsConfig getConfig() {
        return this.config;
    }

    public DevToolsButton getPlayers() {
        return this.players;
    }

    public DevToolsButton getNpcs() {
        return this.npcs;
    }

    public DevToolsButton getGroundItems() {
        return this.groundItems;
    }

    public DevToolsButton getGroundObjects() {
        return this.groundObjects;
    }

    public DevToolsButton getGameObjects() {
        return this.gameObjects;
    }

    public DevToolsButton getGraphicsObjects() {
        return this.graphicsObjects;
    }

    public DevToolsButton getWalls() {
        return this.walls;
    }

    public DevToolsButton getDecorations() {
        return this.decorations;
    }

    public DevToolsButton getProjectiles() {
        return this.projectiles;
    }

    public DevToolsButton getLocation() {
        return this.location;
    }

    public DevToolsButton getChunkBorders() {
        return this.chunkBorders;
    }

    public DevToolsButton getMapSquares() {
        return this.mapSquares;
    }

    public DevToolsButton getLoadingLines() {
        return this.loadingLines;
    }

    public DevToolsButton getValidMovement() {
        return this.validMovement;
    }

    public DevToolsButton getMovementFlags() {
        return this.movementFlags;
    }

    public DevToolsButton getLineOfSight() {
        return this.lineOfSight;
    }

    public DevToolsButton getCameraPosition() {
        return this.cameraPosition;
    }

    public DevToolsButton getWorldMapLocation() {
        return this.worldMapLocation;
    }

    public DevToolsButton getTileLocation() {
        return this.tileLocation;
    }

    public DevToolsButton getInteracting() {
        return this.interacting;
    }

    public DevToolsButton getExamine() {
        return this.examine;
    }

    public DevToolsButton getDetachedCamera() {
        return this.detachedCamera;
    }

    public DevToolsButton getWidgetInspector() {
        return this.widgetInspector;
    }

    public DevToolsButton getVarInspector() {
        return this.varInspector;
    }

    public DevToolsButton getSoundEffects() {
        return this.soundEffects;
    }

    public DevToolsButton getScriptInspector() {
        return this.scriptInspector;
    }

    public DevToolsButton getInventoryInspector() {
        return this.inventoryInspector;
    }

    public DevToolsButton getRoofs() {
        return this.roofs;
    }

    public DevToolsButton getShell() {
        return this.shell;
    }

    public DevToolsButton getMenus() {
        return this.menus;
    }

    public DevToolsButton getUiDefaultsInspector() {
        return this.uiDefaultsInspector;
    }

    public NavigationButton getNavButton() {
        return this.navButton;
    }

    public HotkeyListener getSwingInspectorHotkeyListener() {
        return this.swingInspectorHotkeyListener;
    }

    public AWTEventListener getSwingInspectorKeyListener() {
        return this.swingInspectorKeyListener;
    }
}

