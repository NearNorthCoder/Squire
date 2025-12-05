/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.Skeleton;

public interface Animation {
    public Skeleton getSkeleton();

    public int getTransformCount();

    public int[] getTransformTypes();

    public int[] getTranslatorX();

    public int[] getTranslatorY();

    public int[] getTranslatorZ();

    public boolean isShowing();

    public int getId();

    public int getNumFrames();

    public int getRestartMode();

    public void setRestartMode(int var1);
}

