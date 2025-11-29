/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.cox.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

/**
 * Base task class for Chambers of Xeric (CoX) plugin tasks.
 * Extends the core Task framework and provides common functionality
 * for all CoX-specific tasks including pause checking and instance validation.
 */
public abstract class CoxTask
extends Task {
    protected WorldPoint safeSpot;

    @Inject
    protected SquireChambersConfig config;

    @Inject
    protected SquireChambersPlugin plugin;

    @Inject
    protected Client client;

    public CoxTask() {
        this.safeSpot = new WorldPoint(0, 1, 2);
    }

    /**
     * Main task execution method that checks pre-conditions before running the task.
     * Validates that the plugin is not paused and that the player is not in an instanced region.
     *
     * @return true if the task should continue executing, false otherwise
     */
    public boolean run() {
        if (this.config.pause()) {
            return false;
        }
        if (!this.client.isInInstancedRegion()) {
            return false;
        }
        return this.execute();
    }

    /**
     * Executes the specific task logic.
     * Subclasses must implement this method to define their task behavior.
     *
     * @return true if the task executed successfully, false otherwise
     */
    protected abstract boolean execute();

    static {
        CoxTask.var3();
    }
}
