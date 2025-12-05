/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;

public interface NpcOverrides {
    @Nullable
    public int[] getModelIds();

    @Nullable
    public short[] getColorToReplaceWith();

    @Nullable
    public short[] getTextureToReplaceWith();

    public boolean useLocalPlayer();
}

