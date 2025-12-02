/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ExternalPluginsChanged
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.PluginInstantiationException
 *  net.runelite.client.plugins.PluginManager
 *  net.runelite.client.plugins.recorder.MouseRecording
 *  net.runelite.client.ui.ClientUI
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.config.SquireConfig
 *  net.unethicalite.client.managers.interaction.InteractionManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.client.plugins;

import gg.squire.client.Squire;
import gg.squire.client.core.loader.net.NetUtils;
import gg.squire.client.event.RecordingChangeRequested;
import gg.squire.client.plugins.MouseRecorderRegions;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.plugins.fw.TaskManager;
import java.awt.Component;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.runelite.api.GameState;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ExternalPluginsChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginInstantiationException;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.plugins.recorder.MouseRecording;
import net.runelite.client.ui.ClientUI;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
import net.unethicalite.client.config.SquireConfig;
import net.unethicalite.client.managers.interaction.InteractionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SquirePlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(SquirePlugin.class);
    public static final Map<String, Integer> PLUGIN_SLEEPS = new HashMap<String, Integer>();
    private static int swapFrequency = 30;
    @Inject
    private TaskManager manager;
    private boolean paused;
    private Instant started;
    private Duration stopAfter = Duration.ofMinutes(360L);
    @Inject
    private EventBus eventBus;
    @Inject
    private SquireConfig squireConfig;
    private boolean enabled = false;
    private Instant lastMouseRecordingChange = Instant.now();
    private boolean active = true;

    public static void setSwapFrequency(int minutes) {
        swapFrequency = minutes;
    }

    public void sleepOtherPlugins() {
        PluginManager pluginManager = Static.getPluginManager();
        for (Plugin plugin : pluginManager.getPlugins()) {
            if (!pluginManager.isPluginEnabled(plugin) || !(plugin instanceof SquirePlugin)) continue;
            PLUGIN_SLEEPS.put(((SquirePlugin)plugin).getResourceName(), 1);
        }
        PLUGIN_SLEEPS.remove(this.getResourceName());
    }

    public void unsleepAll() {
        PLUGIN_SLEEPS.clear();
    }

    public void sleepOnlySelf() {
        PLUGIN_SLEEPS.clear();
        PLUGIN_SLEEPS.put(this.getResourceName(), 1);
    }

    public Duration getRuntime() {
        return Duration.between(this.started, Instant.now());
    }

    @Subscribe(priority=-2.1474836E9f)
    public void onGameTick(GameTick gameTick) {
        Duration swapTime;
        if (!this.isUtility()) {
            InteractionManager.setHelper((boolean)false);
        }
        if ((swapTime = Duration.between(Instant.now(), this.lastMouseRecordingChange)).toMinutes() > (long)SquirePlugin.getSwapFrequency()) {
            RecordingChangeRequested event = new RecordingChangeRequested().setSince(swapTime);
            this.eventBus.post((Object)event);
            this.lastMouseRecordingChange = Instant.now();
        }
    }

    @Subscribe(priority=-100.0f)
    public void onMouseRecordingChange(RecordingChangeRequested recording) {
        if (recording.isCancelled()) {
            Duration extraWaitDuration = Duration.ofMillis(recording.getWait());
            Duration subtractDuration = recording.getSince().minus(extraWaitDuration);
            this.lastMouseRecordingChange = Instant.now().minus(subtractDuration);
        } else {
            this.lastMouseRecordingChange = Instant.now();
            MouseRecording old = InteractionManager.getRecording();
            if (old != null && !((Object)((Object)this)).getClass().isAnnotationPresent(SquireUtil.class)) {
                MouseRecording.deprecate((MouseRecording)old);
            }
            this.setMouseRecordings();
        }
    }

    public boolean isPaintDisabled() {
        return this.squireConfig.disablePaint();
    }

    public boolean debugOverlaysDisabled() {
        return this.squireConfig.disableDebugOverlay();
    }

    protected abstract Class<?>[] tasks();

    protected abstract void onStart();

    protected abstract void onStop();

    protected boolean setMouseRecordings() {
        List bestFitting;
        boolean isScriptEnabledThroughCli;
        boolean isUtil = ((Object)((Object)this)).getClass().isAnnotationPresent(SquireUtil.class);
        boolean bl = isScriptEnabledThroughCli = Static.getScript() != null && Static.getScript().equalsIgnoreCase(this.getName());
        if (Game.getState() != GameState.LOGGED_IN && !isUtil && !isScriptEnabledThroughCli) {
            return false;
        }
        if (((Object)((Object)this)).getClass().isAnnotationPresent(MouseRecorderRegions.class)) {
            MouseRecorderRegions annotation = ((Object)((Object)this)).getClass().getAnnotation(MouseRecorderRegions.class);
            int[] regions = annotation.regions();
            bestFitting = MouseRecording.findBestFitting((int[])regions);
        } else {
            int[] regions = Static.getClient().getMapRegions();
            if (isUtil || isScriptEnabledThroughCli) {
                regions = null;
            }
            bestFitting = MouseRecording.findBestFitting((int[])regions);
        }
        if (bestFitting.size() == 0) {
            if (isUtil || isScriptEnabledThroughCli) {
                return true;
            }
            SwingUtilities.invokeLater(() -> JOptionPane.showMessageDialog((Component)ClientUI.getFrame(), "No mouse recordings have been made!\nPlease make some mouse recordings before starting this plugin.\n", "Error starting plugin", 2));
            return false;
        }
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int r = bestFitting.size();
        int s = random.nextInt(0, r);
        int actual = (int)((double)r - Math.sqrt(r * r - s * s));
        MouseRecording using = (MouseRecording)bestFitting.get(actual);
        InteractionManager.setRecording((MouseRecording)using);
        return true;
    }

    public static boolean setGlobalMouseRecordings() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return false;
        }
        int[] regions = Static.getClient().getMapRegions();
        List bestFitting = MouseRecording.findBestFitting((int[])regions);
        if (bestFitting.size() == 0) {
            return true;
        }
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int r = bestFitting.size();
        int s = random.nextInt(0, r);
        int actual = (int)((double)r - Math.sqrt(r * r - s * s));
        MouseRecording using = (MouseRecording)bestFitting.get(actual);
        InteractionManager.setRecording((MouseRecording)using);
        return true;
    }

    public String getResourceName() {
        PluginDescriptor pds = ((Object)((Object)this)).getClass().getAnnotation(PluginDescriptor.class);
        if (pds == null) {
            return "unknown";
        }
        return pds.name().toLowerCase(Locale.ROOT).replace("squire", "").trim().replaceAll(" ", "-");
    }

    protected void startUp() throws Exception {
        super.startUp();
        this.active = true;
        boolean conf = NetUtils.confirm(this);
        if (conf) {
            this.started = Instant.now();
            Class<?>[] tasks = this.tasks();
            if (!this.setMouseRecordings()) {
                this.eventBus.unregister((Object)this);
                log.info("Stopping plugin {} because mouse recordings could not be set.", (Object)((Object)((Object)this)).getClass().getSimpleName());
                this.forceStop();
                return;
            }
            this.manager.registerTasks(this.getInjector(), tasks);
            this.manager.start(this);
            this.onStart();
        } else {
            this.forceStop();
            log.info("Stopping plugin {} because authentication failed (could be instance limit too).", (Object)((Object)((Object)this)).getClass().getSimpleName());
        }
    }

    protected void shutDown() throws Exception {
        Squire.setPluginEnabled(this, false);
        this.eventBus.unregister((Object)this);
        this.onStop();
        this.manager.stop();
        InteractionManager.setRecording(null);
        super.shutDown();
    }

    public void forceStop() {
        Executors.newScheduledThreadPool(1).schedule(() -> {
            try {
                this.shutDown();
                SwingUtilities.invokeLater(() -> {
                    try {
                        Static.getPluginManager().stopPlugin((Plugin)this);
                    }
                    catch (PluginInstantiationException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
            Static.getPluginManager().setPluginEnabled((Plugin)this, false);
            this.eventBus.post((Object)new ExternalPluginsChanged());
        }, 1L, TimeUnit.SECONDS);
    }

    public boolean isUtility() {
        return ((Object)((Object)this)).getClass().isAnnotationPresent(SquireUtil.class);
    }

    public Integer getMaxInstances() {
        return Integer.MAX_VALUE;
    }

    public boolean canPause() {
        return this.manager.canPause();
    }

    public void setActive(boolean active) {
        this.active = active;
        if (!active) {
            this.eventBus.unregister((Object)this);
            this.manager.stop();
        } else {
            this.eventBus.register((Object)this);
            this.manager.start(this);
        }
    }

    public String getVersion() {
        PluginDescriptor pds = ((Object)((Object)this)).getClass().getAnnotation(PluginDescriptor.class);
        if (pds == null) {
            return "unknown";
        }
        return pds.version();
    }

    public void setTaskManager(TaskManager taskManager) {
        this.manager = taskManager;
    }

    public void init() {
        this.enabled = true;
    }

    public static int getSwapFrequency() {
        return swapFrequency;
    }

    public TaskManager getManager() {
        return this.manager;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public Instant getStarted() {
        return this.started;
    }

    public void setStopAfter(Duration stopAfter) {
        this.stopAfter = stopAfter;
    }

    public Duration getStopAfter() {
        return this.stopAfter;
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
