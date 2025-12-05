/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TextureProvider
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.TextureProvider;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSTexture;

public interface RSTextureProvider
extends TextureProvider {
    @Import(value="brightness")
    public double getBrightness();

    @Import(value="setBrightness")
    public void setBrightness(double var1);

    @Import(value="capacity")
    public void setMaxSize(int var1);

    @Import(value="remaining")
    public void setSize(int var1);

    @Import(value="textures")
    public RSTexture[] getTextures();

    @Import(value="getTexturePixels")
    public int[] load(int var1);

    @Import(value="getAverageTextureRGB")
    public int getDefaultColor(int var1);
}

