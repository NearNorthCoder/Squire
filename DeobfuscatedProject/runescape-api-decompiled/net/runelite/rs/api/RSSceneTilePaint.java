/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.SceneTilePaint
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.SceneTilePaint;
import net.runelite.mapping.Import;

public interface RSSceneTilePaint
extends SceneTilePaint {
    @Import(value="rgb")
    public int getRBG();

    @Import(value="swColor")
    public int getSwColor();

    @Import(value="seColor")
    public int getSeColor();

    @Import(value="nwColor")
    public int getNwColor();

    @Import(value="neColor")
    public int getNeColor();

    @Import(value="isFlat")
    public boolean isFlat();

    @Import(value="texture")
    public int getTexture();

    @Import(value="rgb")
    public void setRBG(int var1);

    @Import(value="swColor")
    public void setSwColor(int var1);

    @Import(value="seColor")
    public void setSeColor(int var1);

    @Import(value="nwColor")
    public void setNwColor(int var1);

    @Import(value="neColor")
    public void setNeColor(int var1);

    @Import(value="isFlat")
    public void setIsFlat(boolean var1);

    @Import(value="texture")
    public void setTexture(int var1);
}

