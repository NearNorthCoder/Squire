/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.coords.LocalPoint;

public interface AmbientSoundEffect {
    public int getSoundEffectId();

    @Nullable
    public int[] getBackgroundSoundEffectIds();

    public int getPlane();

    public LocalPoint getMinPosition();

    public LocalPoint getMaxPosition();
}

