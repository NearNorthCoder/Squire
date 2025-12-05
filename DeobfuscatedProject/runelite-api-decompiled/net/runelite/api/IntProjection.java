/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.Projection;

public interface IntProjection
extends Projection {
    public int getCameraX();

    public int getCameraY();

    public int getCameraZ();

    public float getPitchSin();

    public float getPitchCos();

    public float getYawSin();

    public float getYawCos();
}

