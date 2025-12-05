/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ColorTextureOverride
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ColorTextureOverride;
import net.runelite.mapping.Import;

public interface RSPlayerCompositionColorTextureOverride
extends ColorTextureOverride {
    @Import(value="playerCompositionRecolorTo")
    public short[] getPlayerCompositionRecolorTo();

    @Import(value="playerCompositionRetextureTo")
    public short[] getPlayerCompositionRetextureTo();
}

