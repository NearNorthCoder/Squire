/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.RenderOverview
 *  net.runelite.api.worldmap.WorldMap
 *  net.runelite.api.worldmap.WorldMapData
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.RenderOverview;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSCoord;
import net.runelite.rs.api.RSWorldMapArea;
import net.runelite.rs.api.RSWorldMapRenderer;

public interface RSWorldMap
extends WorldMap,
RenderOverview {
    @Import(value="centerTileX")
    public int getWorldMapX();

    @Import(value="centerTileY")
    public int getWorldMapY();

    @Import(value="zoom")
    public float getWorldMapZoom();

    @Import(value="worldMapTargetX")
    public int getWorldMapTargetX();

    @Import(value="worldMapTargetY")
    public int getWorldMapTargetY();

    @Import(value="worldMapDisplayWidth")
    public int getWorldMapDisplayWidth();

    @Import(value="worldMapDisplayHeight")
    public int getWorldMapDisplayHeight();

    @Import(value="worldMapDisplayX")
    public int getWorldMapDisplayX();

    @Import(value="worldMapDisplayY")
    public int getWorldMapDisplayY();

    @Import(value="setWorldMapPosition")
    public void setWorldMapPosition(int var1, int var2, boolean var3);

    @Import(value="setWorldMapPositionTarget")
    public void setWorldMapPositionTarget(int var1, int var2);

    @Import(value="worldMapRenderer")
    public RSWorldMapRenderer getWorldMapRenderer();

    @Import(value="initializeWorldMapManager")
    public void initializeWorldMap(WorldMapData var1);

    @Import(value="getCurrentMapArea")
    public RSWorldMapArea getWorldMapData();

    @Import(value="mouseCoord")
    public RSCoord getMouseCoord();

    @Import(value="getDisplayX")
    public int getDisplayX();

    @Import(value="getDisplayY")
    public int getDisplayY();
}

