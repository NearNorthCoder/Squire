/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.SpritePixels
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.SpritePixels;
import net.runelite.mapping.Import;

public interface RSSpritePixels
extends SpritePixels {
    @Import(value="drawTransBgAt")
    public void drawAt(int var1, int var2);

    @Import(value="subWidth")
    public int getWidth();

    @Import(value="subHeight")
    public int getHeight();

    @Import(value="width")
    public int getMaxWidth();

    @Import(value="width")
    public void setMaxWidth(int var1);

    @Import(value="height")
    public int getMaxHeight();

    @Import(value="height")
    public void setMaxHeight(int var1);

    @Import(value="xOffset")
    public int getOffsetX();

    @Import(value="xOffset")
    public void setOffsetX(int var1);

    @Import(value="yOffset")
    public int getOffsetY();

    @Import(value="yOffset")
    public void setOffsetY(int var1);

    @Import(value="pixels")
    public int[] getPixels();

    @Import(value="setRaster")
    public void setRaster();

    @Import(value="drawRotatedMaskedCenteredAround")
    public void drawRotatedMaskedCenteredAround(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12);
}

