/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.ParamHolder;

public interface NPCComposition
extends ParamHolder {
    public String getName();

    public int[] getModels();

    public String[] getActions();

    public boolean isClickable();

    public boolean isInteractible();

    public boolean isMinimapVisible();

    public int getId();

    public int getCombatLevel();

    public int[] getConfigs();

    public NPCComposition transform();

    public int getSize();

    public int getIndex();

    public void setIndex(int var1);

    public int getTransformVarbit();

    public int getTransformVarp();

    public boolean isFollower();

    @Nullable
    public short[] getColorToReplace();

    @Nullable
    public short[] getColorToReplaceWith();

    public int getWidthScale();

    public int getHeightScale();
}

