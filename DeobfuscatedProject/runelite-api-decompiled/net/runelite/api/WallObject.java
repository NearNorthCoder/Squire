/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Shape;
import net.runelite.api.Model;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface WallObject
extends TileObject {
    public int getOrientationA();

    public int getOrientationB();

    public int getConfig();

    public Shape getConvexHull();

    public Shape getConvexHull2();

    public Renderable getRenderable1();

    public Renderable getRenderable2();

    public Model getModelA();

    public Model getModelB();
}

