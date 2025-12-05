/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.ParamHolder;

public interface ObjectComposition
extends ParamHolder {
    public int getId();

    public String getName();

    public String[] getActions();

    public int getMapSceneId();

    public void setMapSceneId(int var1);

    public int getMapIconId();

    public void setMapIconId(int var1);

    public int[] getImpostorIds();

    public ObjectComposition getImpostor();

    public int getAccessBitMask();

    public int getTransformVarbit();

    public int getVarbitId();

    public int getVarPlayerId();

    public int getSizeX();

    public int getSizeY();
}

