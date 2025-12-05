/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Tile
 *  net.runelite.api.TileItem
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSTileItem
extends RSRenderable,
TileItem {
    @Import(value="id")
    public int getId();

    @Import(value="id")
    public void setId(int var1);

    @Import(value="quantity")
    public int getQuantity();

    @Import(value="quantity")
    public void setQuantity(int var1);

    @Import(value="visibleTime")
    public int getVisibleTime();

    @Import(value="despawnTime")
    public int getDespawnTime();

    @Import(value="ownership")
    public int getOwnership();

    @Import(value="isPrivate")
    public boolean isPrivate();

    public int getX();

    public void setX(int var1);

    public int getY();

    public void setY(int var1);

    public Tile getTile();
}

