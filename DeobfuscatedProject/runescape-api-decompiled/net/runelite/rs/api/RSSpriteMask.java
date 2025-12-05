/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSSpriteMask {
    @Import(value="width")
    public int getWidth();

    @Import(value="height")
    public int getHeight();

    @Import(value="contains")
    public boolean contains(int var1, int var2);

    @Import(value="xWidths")
    public int[] getXWidths();

    @Import(value="xStarts")
    public int[] getXStarts();
}

