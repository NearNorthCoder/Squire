/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NpcOverrides
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.NpcOverrides;
import net.runelite.mapping.Import;

public interface RSNpcOverrides
extends NpcOverrides {
    @Import(value="modelIds")
    public int[] getModelIds();

    @Import(value="recolorTo")
    public short[] getColorToReplaceWith();

    @Import(value="retextureTo")
    public short[] getTextureToReplaceWith();

    @Import(value="useLocalPlayer")
    public boolean useLocalPlayer();
}

