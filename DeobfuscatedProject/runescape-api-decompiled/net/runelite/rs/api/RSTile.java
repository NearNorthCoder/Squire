/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.DecorativeObject
 *  net.runelite.api.GameObject
 *  net.runelite.api.GroundObject
 *  net.runelite.api.ItemLayer
 *  net.runelite.api.SceneTileModel
 *  net.runelite.api.SceneTilePaint
 *  net.runelite.api.Tile
 *  net.runelite.api.WallObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.mapping.Import;

public interface RSTile
extends Tile {
    @Import(value="gameObjects")
    public GameObject[] getGameObjects();

    @Import(value="gameObjectsCount")
    public int getGameObjectsCount();

    @Import(value="itemLayer")
    public ItemLayer getItemLayer();

    @Import(value="wallDecoration")
    public DecorativeObject getDecorativeObject();

    @Import(value="wallDecoration")
    public void setDecorativeObject(DecorativeObject var1);

    @Import(value="floorDecoration")
    public GroundObject getGroundObject();

    @Import(value="floorDecoration")
    public void setGroundObject(GroundObject var1);

    @Import(value="boundaryObject")
    public WallObject getWallObject();

    @Import(value="boundaryObject")
    public void setWallObject(WallObject var1);

    @Import(value="paint")
    public SceneTilePaint getSceneTilePaint();

    @Import(value="paint")
    public void setSceneTilePaint(SceneTilePaint var1);

    @Import(value="model")
    public SceneTileModel getSceneTileModel();

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="plane")
    public int getPlane();

    @Import(value="originalPlane")
    public int getRenderLevel();

    @Import(value="minPlane")
    public int getPhysicalLevel();

    @Import(value="gameObjectsEdgeMask")
    public int getFlags();

    @Import(value="linkedBelowTile")
    public RSTile getBridge();

    @Import(value="drawPrimary")
    public boolean isDraw();

    @Import(value="drawPrimary")
    public void setDraw(boolean var1);

    @Import(value="drawSecondary")
    public boolean isVisible();

    @Import(value="drawSecondary")
    public void setVisible(boolean var1);

    @Import(value="drawGameObjects")
    public void setDrawEntities(boolean var1);

    @Import(value="drawGameObjectEdges")
    public void setWallCullDirection(int var1);
}

