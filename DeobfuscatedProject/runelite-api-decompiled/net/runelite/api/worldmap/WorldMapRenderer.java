/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.worldmap;

import net.runelite.api.worldmap.WorldMapRegion;

public interface WorldMapRenderer {
    public boolean isLoaded();

    public WorldMapRegion[][] getMapRegions();
}

