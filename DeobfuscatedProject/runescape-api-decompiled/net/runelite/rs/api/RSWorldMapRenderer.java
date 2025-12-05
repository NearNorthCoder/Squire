/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.worldmap.WorldMapRenderer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.worldmap.WorldMapRenderer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSWorldMapRegion;

public interface RSWorldMapRenderer
extends WorldMapRenderer {
    @Import(value="isLoaded")
    public boolean isLoaded();

    @Import(value="regions")
    public RSWorldMapRegion[][] getMapRegions();

    @Import(value="tileX")
    public int getSurfaceOffsetX();

    @Import(value="tileY")
    public int getSurfaceOffsetY();

    @Import(value="getPixelsPerTile")
    public float getPixelsPerTile(int var1, int var2);
}

