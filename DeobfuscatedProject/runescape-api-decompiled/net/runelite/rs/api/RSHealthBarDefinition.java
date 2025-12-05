/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HealthBarConfig
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.HealthBarConfig;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;
import net.runelite.rs.api.RSSpritePixels;

public interface RSHealthBarDefinition
extends RSDualNode,
HealthBarConfig {
    @Import(value="width")
    public int getHealthScale();

    @Import(value="frontSpriteID")
    public int getHealthBarFrontSpriteId();

    @Import(value="getFrontSprite")
    public RSSpritePixels getHealthBarFrontSprite();

    @Import(value="getBackSprite")
    public RSSpritePixels getHealthBarBackSprite();

    @Import(value="widthPadding")
    public void setPadding(int var1);
}

