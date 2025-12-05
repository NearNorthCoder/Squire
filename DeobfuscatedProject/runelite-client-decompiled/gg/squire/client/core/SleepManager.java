/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 */
package gg.squire.client.core;

import com.google.inject.Singleton;

@Singleton
public class SleepManager {
    private int sleepTicks = 0;

    public void sleep(int ticks) {
        this.sleepTicks = ticks;
    }

    public boolean isSleeping() {
        if (this.sleepTicks <= 0) {
            return false;
        }
        --this.sleepTicks;
        return true;
    }
}

