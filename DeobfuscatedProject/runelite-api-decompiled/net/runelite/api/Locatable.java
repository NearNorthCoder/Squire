/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Positionable;

public interface Locatable
extends Positionable {
    @Override
    public WorldPoint getWorldLocation();

    public WorldArea getWorldArea();

    public LocalPoint getLocalLocation();

    default public int distanceTo(Locatable locatable) {
        return locatable.getWorldLocation().distanceTo(this.getWorldLocation());
    }

    default public int distanceTo(WorldPoint point) {
        return point.distanceTo(this.getWorldLocation());
    }

    @Override
    default public int getWorldX() {
        return this.getWorldLocation().getX();
    }

    @Override
    default public int getWorldY() {
        return this.getWorldLocation().getY();
    }

    @Override
    default public int getPlane() {
        return this.getWorldLocation().getPlane();
    }
}

