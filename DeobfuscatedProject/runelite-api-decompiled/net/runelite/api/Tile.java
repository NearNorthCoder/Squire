/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.List;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.Locatable;
import net.runelite.api.Point;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.TileItem;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

public interface Tile
extends Locatable {
    public DecorativeObject getDecorativeObject();

    public void setDecorativeObject(DecorativeObject var1);

    public GameObject[] getGameObjects();

    public ItemLayer getItemLayer();

    public GroundObject getGroundObject();

    public void setGroundObject(GroundObject var1);

    public WallObject getWallObject();

    public void setWallObject(WallObject var1);

    public SceneTilePaint getSceneTilePaint();

    public SceneTileModel getSceneTileModel();

    @Override
    public WorldPoint getWorldLocation();

    public Point getSceneLocation();

    @Override
    public LocalPoint getLocalLocation();

    @Override
    public int getPlane();

    public int getRenderLevel();

    public int getPhysicalLevel();

    public boolean hasLineOfSightTo(Tile var1);

    public List<Tile> pathTo(Tile var1);

    public List<TileItem> getGroundItems();

    public Tile getBridge();

    public void walkHere();

    @Override
    public int getWorldX();

    @Override
    public int getWorldY();

    public boolean isEmpty();

    public boolean isObstructed();

    public int getGameObjectsCount();
}

