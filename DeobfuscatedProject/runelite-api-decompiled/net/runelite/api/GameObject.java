/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Point;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;

public interface GameObject
extends TileObject {
    public int sizeX();

    public int sizeY();

    public Point getSceneMinLocation();

    public Point getSceneMaxLocation();

    public Shape getConvexHull();

    public int getOrientation();

    public Renderable getRenderable();

    public int getModelOrientation();

    public int getConfig();

    @Override
    public WorldArea getWorldArea();
}

