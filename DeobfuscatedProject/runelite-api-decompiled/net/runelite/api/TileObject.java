/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Point;
import net.unethicalite.api.SceneEntity;

public interface TileObject
extends SceneEntity {
    public static final int HASH_PLANE_SHIFT = 60;

    public long getHash();

    public int getX();

    public int getY();

    public int getZ();

    @Override
    public int getPlane();

    @Override
    public int getId();

    @Nullable
    public Point getCanvasLocation();

    @Nullable
    public Point getCanvasLocation(int var1);

    @Nullable
    public Polygon getCanvasTilePoly();

    @Nullable
    public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3);

    @Nullable
    public Point getMinimapLocation();

    @Nullable
    public Shape getClickbox();

    @Override
    public String getName();

    @Override
    public String[] getActions();

    public Point menuPoint();

    public ObjectComposition getTransformedComposition();

    public void setTransformedComposition(ObjectComposition var1);

    public int getActualId();
}

