/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ScriptPostFired
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.events.PacketSent
 */
package net.runelite.client.plugins.unethicalite;

import gg.squire.client.Squire;
import gg.squire.client.core.loader.SquirePluginManager;
import gg.squire.client.plugins.fw.PluginScheduler;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.MouseListener;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.recorder.MouseClick;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.runelite.client.plugins.unethicalite.regions.RegionHandler;
import net.runelite.client.plugins.unethicalite.ui.SquirePanel;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.account.GameAccount;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.events.PacketSent;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.plugins.SettingsPlugin;
import net.unethicalite.api.script.blocking_events.BlockingEventManager;
import net.unethicalite.api.script.blocking_events.LoginEvent;
import net.unethicalite.client.config.SquireConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire", hidden=true)
public class SquirePlugin
extends SettingsPlugin
implements MouseListener {
    private static final Logger log = LoggerFactory.getLogger(SquirePlugin.class);
    private static final Set<Integer> REFRESH_WIDGET_IDS = Set.of(Integer.valueOf(WidgetInfo.QUEST_COMPLETED_NAME_TEXT.getGroupId()), Integer.valueOf(WidgetInfo.LEVEL_UP_LEVEL.getGroupId()));
    private static final Set<String> pathfinderConfigKeys = Set.of("useTransports", "useTeleports", "avoidWilderness", "usePoh", "hasMountedGlory", "hasMountedDigsitePendant", "hasMountedMythicalCape", "hasMountedXericsTalisman", "hasJewelryBox");
    private static final boolean INVENTORY_CHANGED = false;
    private static final boolean EQUIPMENT_CHANGED = false;
    private static final boolean CONFIG_CHANGED = false;
    @Inject
    private SquireConfig config;
    @Inject
    private MouseManager manager;
    @Inject
    private Client client;
    private MouseRecording recording;
    @Inject
    private EventBus eventBus;
    @Inject
    private RegionHandler regionHandler;
    @Inject
    private ClientToolbar clientToolbar;
    @Inject
    private SquirePluginManager pluginManager;
    @Inject
    private PluginScheduler pluginScheduler;
    private NavigationButton navButton;
    private SquirePanel squirePanel;
    @Inject
    private ConfigManager configManager;
    private String profileKey;
    private GameAccount gameAccount;
    @Inject
    private BlockingEventManager blockingEventManager;
    private LoginEvent loginEvent = null;
    private CompletableFuture<Void> loginFuture;

    @Override
    protected void startUp() throws Exception {
        SwingUtilities.invokeLater(() -> this.pluginManager.reload());
        this.manager.registerMouseListener(this);
        this.eventBus.register(this.regionHandler);
        this.profileKey = null;
        this.gameAccount = Game.getGameAccount();
        BufferedImage icon = ImageUtil.loadImageResource(this.getClass(), "openosrs.png");
        this.squirePanel = new SquirePanel(this.eventBus, this, icon);
        this.navButton = NavigationButton.builder().tooltip("Squire").icon(icon).priority(-1).panel(this.squirePanel).build();
        this.eventBus.register(this.squirePanel);
        this.clientToolbar.addNavigation(this.navButton);
        if (this.gameAccount != null) {
            this.loginEvent = this.blockingEventManager.getLoginEvent();
            this.loginFuture = CompletableFuture.runAsync(() -> {
                while (this.loginEvent.validate() && this.gameAccount != null) {
                    this.loginEvent.loop();
                    Time.sleep(1500L);
                }
            });
        }
    }

    @Override
    protected void shutDown() throws Exception {
        this.manager.unregisterMouseListener(this);
        this.squirePanel.shutdown();
        this.clientToolbar.removeNavigation(this.navButton);
        this.eventBus.unregister(this.regionHandler);
        this.eventBus.unregister(this.squirePanel);
        this.pluginManager.unload(null);
        this.pluginManager.postChangedEvent();
    }

    @Subscribe
    private void onScriptEvent(ScriptPostFired e) {
        if (e.getScriptId() != 683) {
            return;
        }
        Bank.enterBankPin();
    }

    @Subscribe
    public void onConfigButtonClicked(ConfigButtonClicked e) {
        if (!e.getGroup().equals("squire")) {
            return;
        }
        switch (e.getKey()) {
            case "reload": {
                SwingUtilities.invokeLater(() -> this.pluginManager.reload());
                break;
            }
            case "logs": {
                try {
                    File file = Squire.SQUIRE_HOME.toPath().resolve("logs").toFile();
                    if (!file.exists() && !file.mkdirs()) {
                        JOptionPane.showMessageDialog(null, "Failed to create logs directory");
                        return;
                    }
                    Desktop.getDesktop().open(Squire.SQUIRE_HOME.toPath().resolve("logs").toFile());
                    break;
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(this.client.getCanvas(), "Failed to open logs folder", "Error", 0);
                }
            }
        }
    }

    @Override
    public Config getConfig() {
        return this.config;
    }

    @Override
    public String getPluginName() {
        return "Squire";
    }

    @Override
    public String getPluginDescription() {
        return "Squire settings";
    }

    @Override
    public String[] getPluginTags() {
        return new String[]{"squire"};
    }

    public void startNewRecording() {
        this.recording = new MouseRecording();
    }

    public void stopRecording() {
        this.recording.export();
        this.recording = null;
    }

    public boolean isRecording() {
        return this.recording != null;
    }

    @Override
    public MouseEvent mouseClicked(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    @Override
    public MouseEvent mousePressed(MouseEvent mouseEvent) {
        if (!this.isRecording()) {
            return mouseEvent;
        }
        this.recording.addClick(new MouseClick(mouseEvent.getPoint()));
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseReleased(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseExited(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseDragged(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    @Override
    public MouseEvent mouseMoved(MouseEvent mouseEvent) {
        if (!this.isRecording()) {
            return mouseEvent;
        }
        this.recording.addMovement(mouseEvent);
        return mouseEvent;
    }

    @Subscribe
    public void onGameStateChanged(GameStateChanged changed) {
        if (Game.isLoggedIn()) {
            this.gameAccount = null;
            this.loginFuture = null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (!this.isRecording()) {
            return;
        }
        Player localPlayer = this.client.getLocalPlayer();
        if (localPlayer == null) {
            return;
        }
        for (int id : this.client.getMapRegions()) {
            this.recording.getRegions().add(id);
        }
    }

    @Subscribe
    public void onPacketSent(PacketSent packetSent) {
    }

    public void reloadPlugins() {
        SwingUtilities.invokeLater(() -> this.pluginManager.reload());
    }
}

