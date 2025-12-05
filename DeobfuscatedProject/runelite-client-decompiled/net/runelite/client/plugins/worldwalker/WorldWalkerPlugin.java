/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.MenuOpened
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.PacketBufferNode
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.events.PacketSent
 */
package net.runelite.client.plugins.worldwalker;

import com.google.inject.Provides;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.cluescrolls.ClueScrollWorldMapPoint;
import net.runelite.client.plugins.unethicalite.regions.PathBuilt;
import net.runelite.client.plugins.worldwalker.FarmingPatchLocation;
import net.runelite.client.plugins.worldwalker.FarmingRegion;
import net.runelite.client.plugins.worldwalker.FarmingWorld;
import net.runelite.client.plugins.worldwalker.WorldWalkerPluginConfig;
import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.PacketSent;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.utils.CoordUtils;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire World Walker", description="Right click anywhere within the World Map to walk there")
@Singleton
public class WorldWalkerPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(WorldWalkerPlugin.class);
    public static final String SQUIRE_COLOR = "<col=ffcf40>";
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Map<String, Boolean> mapToggles = new HashMap<String, Boolean>();
    private int totalExtraToggled = 0;
    private WorldPoint mapPoint;
    private WorldPoint last;
    @Inject
    private WorldMapPointManager worldMapPointManager;
    @Inject
    private WorldWalkerPluginConfig config;
    @Inject
    private FarmingWorld farmingWorld;
    @Inject
    private Client client;
    @Inject
    private EventBus eventBus;
    private final KeyListener bankHotKeyListener = new KeyListener(){

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (WorldWalkerPlugin.this.config.nearestBankHotkey().matches(e)) {
                BankLocation nearest = BankLocation.getNearest();
                if (nearest == null) {
                    return;
                }
                WorldWalkerPlugin.this.setMapPoint(nearest.getArea().getCenter());
                e.consume();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };
    private Point lastMenuOpenClicked = null;
    @Inject
    private KeyManager keyManager;

    @Override
    public void startUp() throws Exception {
        this.keyManager.registerKeyListener(this.bankHotKeyListener);
    }

    @Override
    public void shutDown() {
        this.mapToggles.clear();
        this.totalExtraToggled = 0;
        this.mapPoint = null;
        this.keyManager.unregisterKeyListener(this.bankHotKeyListener);
    }

    @Subscribe
    public void onGameTick(GameTick event) {
        this.walk();
    }

    @Provides
    public WorldWalkerPluginConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(WorldWalkerPluginConfig.class);
    }

    private void walk() {
        if (Movement.isWalking()) {
            return;
        }
        if (this.mapPoint == null) {
            return;
        }
        if (this.mapPoint.distanceTo(Players.getLocal().getWorldLocation()) <= 2) {
            this.last = this.mapPoint;
            this.mapPoint = null;
            return;
        }
        Walker.walkTo(this.mapPoint);
    }

    @Subscribe
    public void onMenuOpened(MenuOpened first) {
        Widget worldMap;
        String target;
        String string = target = first.getMenuEntries().length == 0 ? "" : first.getMenuEntries()[0].getTarget();
        if (this.mapPoint != null) {
            Static.getClient().createMenuEntry(-2).setOption("<col=ffcf40>Clear destination").setTarget(target).setType(MenuAction.RUNELITE).onClick(e -> {
                this.mapPoint = null;
            });
        }
        if (first.getFirstEntry().getOption().contains("World Map")) {
            if (this.last != null) {
                Static.getClient().createMenuEntry(-2).setOption("<col=ffcf40>Walk to last location").setTarget(target).setType(MenuAction.RUNELITE).onClick(e -> this.setMapPoint(this.last));
            }
            for (WorldMapPoint wmp : this.worldMapPointManager.getWorldMapPoints()) {
                if (!(wmp instanceof ClueScrollWorldMapPoint)) continue;
                Static.getClient().createMenuEntry(-2).setOption("<col=ffcf40>Walk to " + wmp.getName()).setTarget(target).setType(MenuAction.RUNELITE).onClick(e -> this.setMapPoint(wmp.getWorldPoint()));
            }
        }
        if ((worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW)) == null) {
            return;
        }
        Point mouse = Static.getClient().getMouseCanvasPosition();
        if (!worldMap.getBounds().contains(mouse.getX(), mouse.getY())) {
            return;
        }
        if (this.lastMenuOpenClicked == null) {
            this.lastMenuOpenClicked = mouse;
        }
        this.addWalkToPatches(target);
        this.addWalkToBank(target);
        Static.getClient().createMenuEntry(-2).setOption("<col=ffcf40>Walk here").setTarget(target).setType(MenuAction.RUNELITE).onClick(e -> this.setMapPoint(CoordUtils.worldMapToWorldPoint(mouse)));
    }

    private void addWalkToBank(String target) {
        if (this.config.bank()) {
            Static.getClient().createMenuEntry(-2).setOption(String.format("%sWalk to bank", SQUIRE_COLOR)).setTarget(target).setType(MenuAction.RUNELITE).onClick(ce -> {
                BankLocation nearest = BankLocation.getNearest();
                if (nearest == null) {
                    return;
                }
                this.setMapPoint(nearest.getArea().getCenter());
            });
        }
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event) {
        if (event.getMenuAction() != MenuAction.RUNELITE) {
            this.lastMenuOpenClicked = null;
            return;
        }
        if (this.mapToggles.keySet().stream().noneMatch(s -> event.getMenuOption().contains((CharSequence)s))) {
            this.lastMenuOpenClicked = null;
            return;
        }
        event.setConsumed(true);
        this.openMenuAgain();
    }

    private int estimateMenuHeight() {
        int count = this.client.getMenuOptionCount();
        boolean extra = true;
        for (int i = 0; i < count; ++i) {
            String option = this.client.getMenuOptions()[count];
            if (option == null || !option.contains("Patches")) continue;
            extra = false;
            break;
        }
        if (extra) {
            count += this.totalExtraToggled + this.mapToggles.keySet().size();
        }
        int height = 0;
        for (int i = 0; i < count; ++i) {
            height += (count - 1 - i) * 15 + 31;
        }
        return height;
    }

    private void openMenuAgain() {
        Point mouse = this.client.getMouseCanvasPosition();
        int dy = this.estimateMenuHeight() - this.client.getMenuHeight();
        Point clicking = new Point(this.client.getMenuX(), this.client.getMenuY() + dy);
        this.executor.submit(() -> Mouse.pressed(clicking.getX(), clicking.getY(), Static.getClient().getCanvas(), System.currentTimeMillis(), 3));
    }

    private void addWalkToPatch(String target, Predicate<FarmingPatchLocation> test) {
        for (FarmingPatchLocation location : FarmingPatchLocation.values()) {
            if (test.test(location)) continue;
            for (WorldPoint loc : location.getLocations()) {
                ++this.totalExtraToggled;
                Static.getClient().createMenuEntry(-2).setOption("<col=ffcf40>- " + this.farmingWorld.getRegionsForLocation(loc).stream().map(FarmingRegion::getName).findAny().orElse("Unknown")).setTarget(target).setType(MenuAction.RUNELITE).onClick(e -> this.setMapPoint(loc));
            }
        }
    }

    private void addWalkToPatches(String target) {
        this.totalExtraToggled = 0;
        if (this.config.herbSpots()) {
            this.addWalkToDropdown("Herb Patches", target, location -> location != FarmingPatchLocation.HERB && location != FarmingPatchLocation.ALLOTMENT_HERB_FLOWER);
        }
        if (this.config.treeSpots()) {
            this.addWalkToDropdown("Tree Patches", target, location -> location != FarmingPatchLocation.TREE && location != FarmingPatchLocation.HARDWOOD && location != FarmingPatchLocation.REDWOOD);
        }
        if (this.config.fruitTreeSpots()) {
            this.addWalkToDropdown("Fruit Tree Patches", target, location -> location != FarmingPatchLocation.FRUIT_TREE && location != FarmingPatchLocation.CELASTRUS_FRUIT_TREE);
        }
    }

    private void addWalkToDropdown(String key, String target, Predicate<FarmingPatchLocation> test) {
        boolean toggled = this.mapToggles.computeIfAbsent(key, x -> false);
        if (toggled) {
            this.addWalkToPatch(target, test);
        }
        Static.getClient().createMenuEntry(-2).setOption(String.format(SQUIRE_COLOR + (toggled ? "^ %s " : "%s >"), key)).setTarget(target).setType(MenuAction.RUNELITE).onClick(ce -> this.mapToggles.put(key, !toggled));
    }

    private void setMapPoint(WorldPoint wp) {
        this.mapPoint = Walker.nearestWalkableTile(wp);
        this.eventBus.post(new PathBuilt(Walker.buildPath(this.mapPoint)));
        Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
        if (worldMap == null) {
            return;
        }
        Keyboard.type('\u001b');
    }

    @Subscribe
    public void onPacketSent(PacketSent packetSent) {
        PacketBufferNode packetBufferNode = packetSent.getPacketBufferNode();
        if (packetBufferNode == null) {
            return;
        }
        ClientPacket clientPacket = packetBufferNode.getClientPacket();
        if (clientPacket == null) {
            return;
        }
        if (clientPacket.getId() == 80) {
            log.debug("Detect modified client packet was sent?");
        }
        if (Game.getState() != GameState.LOGGED_IN) {
            return;
        }
        ClientPacket packet = packetBufferNode.getClientPacket();
        if (packet == null) {
            return;
        }
        Object packetName = (String)Static.getClientPacket().getClientPackets().get(packet);
        if ("REFLECTION_CHECK_REPLY".equals(packetName) || "NO_TIMEOUT".equals(packetName)) {
            return;
        }
        if (packetName == null) {
            packetName = "Unknown (" + packet.getId() + ")";
        }
        log.debug((String)packetName + " " + String.valueOf(packetBufferNode.getPacketBuffer().getWrites()));
    }
}

