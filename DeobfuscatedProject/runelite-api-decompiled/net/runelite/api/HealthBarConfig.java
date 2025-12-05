/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.SpritePixels;

public interface HealthBarConfig {
    public SpritePixels getHealthBarFrontSprite();

    public SpritePixels getHealthBarBackSprite();

    public int getHealthBarFrontSpriteId();

    public void setPadding(int var1);
}

