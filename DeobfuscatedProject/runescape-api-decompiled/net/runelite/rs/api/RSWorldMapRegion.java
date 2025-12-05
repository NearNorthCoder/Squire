/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.worldmap.WorldMapRegion
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.util.List;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.mapping.Import;

public interface RSWorldMapRegion
extends WorldMapRegion {
    @Import(value="icons")
    public List icons();
}

