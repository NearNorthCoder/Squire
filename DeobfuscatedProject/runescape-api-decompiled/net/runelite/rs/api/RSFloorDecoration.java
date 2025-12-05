/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GroundObject
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.GroundObject;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSFloorDecoration
extends GroundObject {
    @Import(value="tag")
    public long getHash();

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="z")
    public int getZ();

    @Import(value="renderable")
    public RSRenderable getRenderable();

    @Import(value="flags")
    public int getConfig();

    public void setPlane(int var1);
}

