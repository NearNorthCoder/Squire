/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.AmbientSoundEffect
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.AmbientSoundEffect;
import net.runelite.mapping.Import;

public interface RSObjectSound
extends AmbientSoundEffect {
    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="maxX")
    public int getMaxX();

    @Import(value="maxY")
    public int getMaxY();

    @Import(value="soundEffectId")
    public int getSoundEffectId();

    @Import(value="soundEffectIds")
    public int[] getBackgroundSoundEffectIds();

    @Import(value="plane")
    public int getPlane();
}

