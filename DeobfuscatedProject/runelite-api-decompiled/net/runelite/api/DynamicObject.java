/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.Animation;
import net.runelite.api.Renderable;

public interface DynamicObject
extends Renderable {
    public Animation getAnimation();

    public int getAnimationID();

    public int getAnimFrame();

    public int getAnimCycleCount();

    public int getAnimCycle();
}

