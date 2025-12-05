/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.plugins.fw;

import gg.squire.client.plugins.SquirePlugin;
import java.util.function.BooleanSupplier;

public abstract class Task {
    private int tickSleep;
    private int tickSleepIncrement;
    private BooleanSupplier condition;

    public abstract boolean run();

    public void sleep(int ticks) {
        this.tickSleep = ticks;
    }

    public void sleepWhile(int ticks, BooleanSupplier condition) {
        this.condition = condition;
        this.tickSleep = ticks;
        this.tickSleepIncrement = ticks;
    }

    public boolean sleeping() {
        if (this.condition != null && this.condition.getAsBoolean()) {
            this.tickSleep = this.tickSleepIncrement;
            return true;
        }
        if (this.condition != null) {
            this.condition = null;
            this.tickSleepIncrement = 0;
            this.tickSleep = 0;
            return false;
        }
        --this.tickSleep;
        if (this.tickSleep <= 0) {
            this.tickSleep = 0;
            return false;
        }
        return true;
    }

    public void tick(SquirePlugin plugin, int diff) {
        SquirePlugin.PLUGIN_SLEEPS.compute(plugin.getResourceName(), (k, v) -> v == null ? 0 : v + diff);
    }

    public void tick(SquirePlugin plugin) {
        this.tick(plugin, -1);
    }

    public void unfreeze(SquirePlugin plugin) {
        SquirePlugin.PLUGIN_SLEEPS.put(plugin.getResourceName(), 0);
    }

    public void globalSleep(SquirePlugin plugin, int ticks) {
        this.tick(plugin, ticks);
    }

    public int getTickSleep() {
        return this.tickSleep;
    }

    public int getTickSleepIncrement() {
        return this.tickSleepIncrement;
    }

    public BooleanSupplier getCondition() {
        return this.condition;
    }
}

