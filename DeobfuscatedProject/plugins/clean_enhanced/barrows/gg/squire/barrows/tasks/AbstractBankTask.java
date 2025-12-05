/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Abstract base class for banking-related tasks.
 * Provides common functionality for tasks that require banking.
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.GearManager;
import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import net.unethicalite.api.items.Bank;

/**
 * Abstract base class for tasks that involve banking.
 * Handles common preconditions for banking tasks.
 */
public abstract class AbstractBankTask extends Task {
    protected final SquireBarrows plugin;
    protected final SquireBarrowsConfig config;
    protected final GearManager gearManager;

    protected AbstractBankTask(SquireBarrows plugin, SquireBarrowsConfig config) {
        this.plugin = plugin;
        this.config = config;
        this.gearManager = plugin.getGearManager();
    }

    @Override
    public boolean run() {
        // Don't run banking tasks if banking is disabled
        if (!this.config.useBank()) {
            return false;
        }

        // Don't run if banking flag is not set
        if (!this.plugin.shouldBank()) {
            return false;
        }

        // Don't run if bank is not open
        if (!Bank.isOpen()) {
            return false;
        }

        return this.execute();
    }

    /**
     * Executes the specific banking logic for this task.
     * Subclasses must implement this method.
     *
     * @return True if the task executed successfully
     */
    protected abstract boolean execute();
}
