/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Renderable
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.awt.Rectangle;
import net.runelite.api.Renderable;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSSceneNode;

public interface RSRenderable
extends RSSceneNode,
Renderable {
    @Import(value="height")
    public int getModelHeight();

    @Import(value="height")
    public void setModelHeight(int var1);

    @Import(value="getModel")
    public RSModel getModel();

    public void updateBounds();

    public Rectangle getCachedBounds();
}

