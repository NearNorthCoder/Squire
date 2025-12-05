/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.worldmap;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.api.worldmap.WorldMapRenderer;

public interface WorldMap {
    public Point getWorldMapPosition();

    public float getWorldMapZoom();

    public void setWorldMapPositionTarget(WorldPoint var1);

    public WorldMapRenderer getWorldMapRenderer();

    public void initializeWorldMap(WorldMapData var1);

    public WorldMapData getWorldMapData();

    public WorldPoint getMouseLocation();

    public int getX(int var1);

    public int getY(int var1);

    public WorldPoint getWorldPoint(int var1, int var2);

    public WorldPoint getWorldPointFromMap(int var1, int var2);

    public int getWorldMapDisplayWidth();

    public int getWorldMapDisplayHeight();

    public int getWorldMapDisplayX();

    public int getWorldMapDisplayY();

    public int getWorldMapX(int var1);

    public int getWorldMapY(int var1);

    public int getDisplayX();

    public int getDisplayY();

    public int getWorldMapX();

    public int getWorldMapY();
}

