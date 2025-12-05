/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.FontTypeFace
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.FontTypeFace;
import net.runelite.mapping.Import;

public interface RSAbstractFont
extends FontTypeFace {
    @Import(value="stringWidth")
    public int getTextWidth(String var1);

    @Import(value="ascent")
    public int getBaseline();

    @Import(value="draw")
    public void drawTextLeftAligned(String var1, int var2, int var3, int var4, int var5);

    @Import(value="draw0")
    public void draw0(String var1, int var2, int var3);

    @Import(value="decodeTag")
    public void decodeTag(String var1);

    @Import(value="kerning")
    public byte[] getKerning();

    @Import(value="drawWidgetText")
    public int drawRSWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11);
}

