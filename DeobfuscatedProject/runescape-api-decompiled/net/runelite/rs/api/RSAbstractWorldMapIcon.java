/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.worldmap.WorldMapIcon
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSCoord;

public interface RSAbstractWorldMapIcon
extends WorldMapIcon {
    @Import(value="getElement")
    public int getType();

    @Import(value="coord1")
    public RSCoord getRSCoordinate();
}

