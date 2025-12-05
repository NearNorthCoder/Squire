/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.Model;
import net.runelite.api.Renderable;
import net.runelite.api.TileObject;

public interface ItemLayer
extends TileObject {
    public int getHeight();

    public Renderable getBottom();

    public Renderable getMiddle();

    public Renderable getTop();

    public Model getModelBottom();

    public Model getModelMiddle();

    public Model getModelTop();
}

