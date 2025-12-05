/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.WorldMapData
 *  net.runelite.api.worldmap.WorldMapData
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.WorldMapData;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSCoord;

public interface RSWorldMapArea
extends net.runelite.api.worldmap.WorldMapData,
WorldMapData {
    @Import(value="containsPosition")
    public boolean surfaceContainsPosition(int var1, int var2);

    @Import(value="origin")
    public RSCoord getRSOrigin();

    @Import(value="coord")
    public RSCoord coord(int var1, int var2);

    @Import(value="getRegionLowX")
    public int getRegionLowX();

    @Import(value="getRegionLowY")
    public int getRegionLowY();
}

