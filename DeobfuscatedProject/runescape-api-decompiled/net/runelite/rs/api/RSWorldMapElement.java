/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.worldmap.MapElementConfig
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;
import net.runelite.rs.api.RSSpritePixels;

public interface RSWorldMapElement
extends RSDualNode,
MapElementConfig {
    @Import(value="getSpriteBool")
    public RSSpritePixels getMapIcon(boolean var1);

    @Import(value="category")
    public int getCategory();
}

