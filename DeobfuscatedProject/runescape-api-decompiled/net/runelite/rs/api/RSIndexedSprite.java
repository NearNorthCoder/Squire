/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IndexedSprite
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IndexedSprite;
import net.runelite.mapping.Import;

public interface RSIndexedSprite
extends IndexedSprite {
    @Import(value="pixels")
    public byte[] getPixels();

    @Import(value="pixels")
    public void setPixels(byte[] var1);

    @Import(value="palette")
    public int[] getPalette();

    @Import(value="palette")
    public void setPalette(int[] var1);

    @Import(value="width")
    public int getOriginalWidth();

    @Import(value="width")
    public void setOriginalWidth(int var1);

    @Import(value="height")
    public int getOriginalHeight();

    @Import(value="height")
    public void setOriginalHeight(int var1);

    @Import(value="subHeight")
    public int getHeight();

    @Import(value="subHeight")
    public void setHeight(int var1);

    @Import(value="xOffset")
    public int getOffsetX();

    @Import(value="xOffset")
    public void setOffsetX(int var1);

    @Import(value="yOffset")
    public int getOffsetY();

    @Import(value="yOffset")
    public void setOffsetY(int var1);

    @Import(value="subWidth")
    public int getWidth();

    @Import(value="subWidth")
    public void setWidth(int var1);

    @Import(value="zoomAdjust")
    public void zoomAdjust(int var1, int var2, int var3, int var4);

    @Import(value="drawAt")
    public void drawAt(int var1, int var2);
}

