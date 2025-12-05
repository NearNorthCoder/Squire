/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ItemLayer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ItemLayer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSItemLayer
extends ItemLayer {
    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="z")
    public int getZ();

    @Import(value="tag")
    public long getHash();

    @Import(value="height")
    public int getHeight();

    @Import(value="first")
    public RSRenderable getTop();

    @Import(value="second")
    public RSRenderable getMiddle();

    @Import(value="third")
    public RSRenderable getBottom();

    public void setPlane(int var1);
}

