/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.DecorativeObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSWallDecoration
extends DecorativeObject {
    @Import(value="tag")
    public long getHash();

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="z")
    public int getZ();

    @Import(value="xOffset")
    public int getXOffset();

    @Import(value="yOffset")
    public int getYOffset();

    @Import(value="orientation2")
    public int getOrientation();

    @Import(value="renderable1")
    public RSRenderable getRenderable();

    @Import(value="renderable2")
    public RSRenderable getRenderable2();

    @Import(value="flags")
    public int getConfig();

    public void setPlane(int var1);
}

