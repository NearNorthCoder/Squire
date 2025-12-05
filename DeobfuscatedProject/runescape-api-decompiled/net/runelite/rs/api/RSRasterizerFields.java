/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSRasterizerFields {
    @Import(value="zoom")
    public int getZoom();

    @Import(value="zoom")
    public void setZoom(int var1);

    @Import(value="clipMidX2")
    public int getClipMidX2();

    @Import(value="clipMidX2")
    public void setClipMidX2(int var1);

    @Import(value="clipMidY2")
    public int getClipMidY2();

    @Import(value="clipMidY2")
    public void setClipMidY2(int var1);

    @Import(value="clipNegativeMidX")
    public int getClipNegativeMidX();

    @Import(value="clipNegativeMidX")
    public void setClipNegativeMidX(int var1);

    @Import(value="clipNegativeMidY")
    public int getClipNegativeMidY();

    @Import(value="clipMidX")
    public int getClipMidX();

    @Import(value="clipMidY")
    public int getClipMidY();

    @Import(value="clipped")
    public boolean isClipped();

    @Import(value="clipped")
    public void setClipped(boolean var1);

    @Import(value="alpha")
    public int getAlpha();

    @Import(value="alpha")
    public void setAlpha(int var1);
}

