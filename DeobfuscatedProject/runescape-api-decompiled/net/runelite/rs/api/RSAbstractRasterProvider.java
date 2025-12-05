/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.BufferProvider
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.BufferProvider;
import net.runelite.mapping.Import;

public interface RSAbstractRasterProvider
extends BufferProvider {
    @Import(value="pixels")
    public int[] getPixels();

    @Import(value="width")
    public int getWidth();

    @Import(value="height")
    public int getHeight();

    @Import(value="apply")
    public void setRaster();
}

