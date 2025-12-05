/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.Arrays;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.Renderable;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.SceneEntity;

public interface TileItem
extends Renderable,
SceneEntity {
    public static final int OWNERSHIP_NONE = 0;
    public static final int OWNERSHIP_SELF = 1;
    public static final int OWNERSHIP_OTHER = 2;
    public static final int OWNERSHIP_GROUP = 3;

    @Override
    public int getId();

    public int getQuantity();

    public int getVisibleTime();

    public int getDespawnTime();

    public int getOwnership();

    public boolean isPrivate();

    public Tile getTile();

    public void pickup();

    @Override
    public String getName();

    @Override
    default public int distanceTo(Locatable locatable) {
        return this.getTile().distanceTo(locatable.getWorldLocation());
    }

    @Override
    default public int distanceTo(WorldPoint point) {
        return this.getTile().distanceTo(point);
    }

    @Override
    default public WorldPoint getWorldLocation() {
        return this.getTile().getWorldLocation();
    }

    @Override
    default public WorldArea getWorldArea() {
        return this.getTile().getWorldArea();
    }

    @Override
    default public LocalPoint getLocalLocation() {
        if (this.getTile() == null) {
            return null;
        }
        return this.getTile().getLocalLocation();
    }

    public boolean canPickup();

    public boolean isTradable();

    public boolean isStackable();

    public boolean isMembers();

    public int getNotedId();

    public boolean isNoted();

    public int getStorePrice();

    public String[] getInventoryActions();

    default public List<String> inventoryActions() {
        return Arrays.asList(this.getInventoryActions());
    }

    default public boolean hasInventoryAction(String action) {
        return this.inventoryActions().contains(action);
    }
}

