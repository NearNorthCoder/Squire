/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.PluginChanged
 *  net.runelite.client.plugins.Plugin
 */
package gg.squire.client.plugins.fw;

import com.google.inject.Singleton;
import gg.squire.client.plugins.Scheduled;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.PluginChanged;
import net.runelite.client.plugins.Plugin;

@Singleton
public class PluginScheduler {
    private final Queue<Scheduled> schedule = new LinkedList<Scheduled>();
    private SquirePlugin main;
    private SquirePlugin scheduled;

    public void setMain(SquirePlugin main) {
        this.main = main;
    }

    public void schedule(Scheduled s) {
        if (!(s instanceof SquirePlugin)) {
            throw new IllegalArgumentException("Scheduled must be a SquirePlugin");
        }
        this.schedule.add(s);
    }

    @Subscribe
    public void onPluginEnabled(PluginChanged pluginChanged) {
        Plugin plugin = pluginChanged.getPlugin();
        if (!pluginChanged.isLoaded() || !(plugin instanceof SquirePlugin)) {
            return;
        }
        SquirePlugin squirePlugin = (SquirePlugin)plugin;
        if (((Object)((Object)squirePlugin)).getClass().isAnnotationPresent(SquireUtil.class)) {
            return;
        }
        if (squirePlugin instanceof Scheduled) {
            this.schedule((Scheduled)((Object)squirePlugin));
        } else {
            this.setMain(squirePlugin);
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (!this.needsScheduling()) {
            return;
        }
        this.run();
    }

    public boolean needsScheduling() {
        return !this.schedule.isEmpty() && this.schedule.peek().condition();
    }

    private void handleScheduled() {
        Scheduled s = (Scheduled)((Object)this.scheduled);
        if (!s.condition()) {
            if (!s.afterFinish()) {
                return;
            }
            this.main.setActive(true);
            if (s.requeue()) {
                this.schedule.add(s);
                this.scheduled = null;
            }
        }
    }

    public void run() {
        if (this.scheduled != null) {
            this.handleScheduled();
        }
        if (this.schedule.isEmpty()) {
            return;
        }
        Scheduled s = this.schedule.peek();
        if (!this.main.canPause() || !s.condition()) {
            return;
        }
        this.main.setActive(false);
        if (!s.beforeStart()) {
            return;
        }
        this.scheduled = (SquirePlugin)((Object)this.schedule.remove());
    }
}
