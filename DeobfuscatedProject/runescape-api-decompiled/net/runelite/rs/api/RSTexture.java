/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Texture
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Texture;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSTexture
extends Texture,
RSNode {
    @Import(value="pixels")
    public int[] getPixels();

    @Import(value="animationDirection")
    public int getAnimationDirection();

    @Import(value="animationSpeed")
    public int getAnimationSpeed();

    @Import(value="isLoaded")
    public boolean isLoaded();
}

