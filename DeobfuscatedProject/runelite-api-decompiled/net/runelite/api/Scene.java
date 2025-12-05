/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;

public interface Scene {
    public Tile[][][] getTiles();

    public Tile[][][] getExtendedTiles();

    public void addItem(int var1, int var2, WorldPoint var3);

    public void removeItem(int var1, int var2, WorldPoint var3);

    public int getDrawDistance();

    public void setDrawDistance(int var1);

    public int getMinLevel();

    public void setMinLevel(int var1);

    public void removeTile(Tile var1);

    public void removeGameObject(GameObject var1);

    public void removeGameObject(int var1, int var2, int var3);

    public void removeWallObject(WallObject var1);

    public void removeWallObject(int var1, int var2, int var3);

    public void removeDecorativeObject(DecorativeObject var1);

    public void removeDecorativeObject(int var1, int var2, int var3);

    public void removeGroundObject(GroundObject var1);

    public void removeGroundObject(int var1, int var2, int var3);

    public void generateHouses();

    public void setRoofRemovalMode(int var1);

    public short[][][] getUnderlayIds();

    public short[][][] getOverlayIds();

    public byte[][][] getTileShapes();

    public int[][][] getTileHeights();

    public byte[][][] getExtendedTileSettings();

    public void setExtendedTileSettings(byte[][][] var1);

    public int getBaseX();

    public int getBaseY();

    public boolean isInstance();

    public int[][][] getInstanceTemplateChunks();

    public void setSelectedSceneTileX(int var1);

    public void setSelectedSceneTileY(int var1);

    public void setViewportWalking(boolean var1);

    public int getWorldViewId();
}

