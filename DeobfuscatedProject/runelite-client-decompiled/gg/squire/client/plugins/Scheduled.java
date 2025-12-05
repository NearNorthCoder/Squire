/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.client.plugins;

public interface Scheduled {
    public boolean beforeStart();

    public boolean afterFinish();

    public boolean condition();

    public boolean requeue();
}

