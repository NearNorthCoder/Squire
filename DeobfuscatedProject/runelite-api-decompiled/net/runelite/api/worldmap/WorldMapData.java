/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.worldmap;

import net.runelite.api.coords.WorldPoint;

public interface WorldMapData {
    public boolean surfaceContainsPosition(int var1, int var2);

    public WorldPoint getOrigin();
}

