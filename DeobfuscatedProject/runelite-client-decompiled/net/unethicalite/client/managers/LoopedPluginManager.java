/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Provider
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 */
package net.unethicalite.client.managers;

import gg.squire.client.plugins.MouseRecorderRegions;
import gg.squire.client.plugins.SquireUtil;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.config.PluginConfigurationDescriptor;
import net.runelite.client.plugins.config.PluginListPanel;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.plugins.LoopedPlugin;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.plugins.SettingsPlugin;
import net.unethicalite.api.plugins.Task;
import net.unethicalite.api.plugins.TaskPlugin;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class LoopedPluginManager {
    private static final Logger log = LoggerFactory.getLogger(LoopedPluginManager.class);
    private final EventBus eventBus;
    @Inject
    private ConfigManager configManager;
    @Inject
    private Provider<PluginListPanel> pluginListPanelProvider;
    @Inject
    private Client client;
    private LoopedPlugin loopedPlugin = null;
    private Thread currentLoop = null;

    @Inject
    LoopedPluginManager(EventBus eventBus) {
        this.eventBus = eventBus;
        eventBus.register(this);
    }

    public void unregister() {
        if (this.currentLoop == null || this.loopedPlugin == null) {
            return;
        }
        while (this.currentLoop.isAlive() || this.loopedPlugin.isRunning()) {
            this.loopedPlugin.stop();
        }
        if (this.loopedPlugin instanceof Script) {
            Script script = (Script)this.loopedPlugin;
            script.onStop();
            script.getPaint().clear();
        }
        if (this.loopedPlugin instanceof TaskPlugin) {
            for (Task task : ((TaskPlugin)this.loopedPlugin).getTasks()) {
                if (!task.subscribe()) continue;
                this.eventBus.unregister(task);
            }
        }
        this.currentLoop = null;
        this.loopedPlugin = null;
        this.client.setQueuedMenu(null);
    }

    public void submit(Plugin plugin) {
        if (!(plugin instanceof LoopedPlugin)) {
            log.error("Only LoopedPlugins may be submitted to the LoopedPluginManager");
            return;
        }
        if (this.currentLoop != null && this.currentLoop.isAlive()) {
            log.debug("A plugin is already running, stopping it");
            Executors.newSingleThreadExecutor().execute(this::unregister);
        }
        log.debug("Registering {} as a LoopedPlugin", (Object)plugin.getClass().getSimpleName());
        this.loopedPlugin = (LoopedPlugin)plugin;
        if (this.loopedPlugin instanceof TaskPlugin) {
            for (Task task : ((TaskPlugin)this.loopedPlugin).getTasks()) {
                if (!task.subscribe()) continue;
                this.eventBus.register(task);
            }
        }
        if (plugin instanceof Script) {
            Script script = (Script)plugin;
            script.getPaint().clear();
            script.onStart(Static.getScriptArgs());
            this.setMouseRecordings();
        }
        this.currentLoop = new Thread(this.loopedPlugin);
        this.currentLoop.start();
    }

    protected void setMouseRecordings() {
        List<MouseRecording> bestFitting;
        boolean isUtil = this.getClass().isAnnotationPresent(SquireUtil.class);
        if (Game.getState() != GameState.LOGGED_IN && !isUtil) {
            return;
        }
        if (this.getClass().isAnnotationPresent(MouseRecorderRegions.class)) {
            MouseRecorderRegions annotation = this.getClass().getAnnotation(MouseRecorderRegions.class);
            int[] regions = annotation.regions();
            bestFitting = MouseRecording.findBestFitting(regions);
        } else {
            int[] regions = Static.getClient().getMapRegions();
            if (isUtil) {
                regions = null;
            }
            bestFitting = MouseRecording.findBestFitting(regions);
        }
        if (bestFitting.isEmpty()) {
            return;
        }
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int r = bestFitting.size();
        int s = random.nextInt(0, r);
        int actual = (int)((double)r - Math.sqrt(r * r - s * s));
        MouseRecording using = bestFitting.get(actual);
        InteractionManager.setRecording(using);
    }

    public boolean isPluginRegistered() {
        return this.currentLoop != null && this.currentLoop.isAlive() && this.loopedPlugin != null && this.loopedPlugin.isRunning();
    }

    @Subscribe
    private void onPluginChanged(PluginChanged pluginChanged) {
        Plugin plugin = pluginChanged.getPlugin();
        if (pluginChanged.isLoaded()) {
            if (plugin instanceof SettingsPlugin) {
                SettingsPlugin settingsPlugin = (SettingsPlugin)plugin;
                PluginListPanel pluginListPanel = (PluginListPanel)this.pluginListPanelProvider.get();
                pluginListPanel.addFakePlugin(new PluginConfigurationDescriptor(settingsPlugin.getPluginName(), settingsPlugin.getPluginDescription(), settingsPlugin.getPluginTags(), settingsPlugin.getConfig(), this.configManager.getConfigDescriptor(settingsPlugin.getConfig())));
                pluginListPanel.rebuildPluginList();
                return;
            }
            if (plugin instanceof LoopedPlugin) {
                this.submit(plugin);
            }
        } else if (plugin instanceof LoopedPlugin && plugin == this.loopedPlugin) {
            this.unregister();
        }
    }
}

