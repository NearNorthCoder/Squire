/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.GameObject;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSGameObject
extends GameObject {
    @Import(value="renderable")
    public RSRenderable getRenderable();

    @Import(value="startX")
    public int getStartX();

    @Import(value="startY")
    public int getStartY();

    @Import(value="endX")
    public int getEndX();

    @Import(value="endY")
    public int getEndY();

    @Import(value="centerX")
    public int getX();

    @Import(value="centerY")
    public int getY();

    @Import(value="z")
    public int getZ();

    @Import(value="orientation")
    public int getModelOrientation();

    @Import(value="tag")
    public long getHash();

    @Import(value="flags")
    public int getConfig();

    public int getPlane();

    public void setPlane(int var1);
}

