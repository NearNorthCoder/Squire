/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.PlayerComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.PlayerComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSPlayerCompositionColorTextureOverride;

public interface RSPlayerComposition
extends PlayerComposition {
    @Import(value="gender")
    public int getGender();

    @Deprecated
    default public boolean isFemale() {
        return this.getGender() == 1;
    }

    @Import(value="bodyColors")
    public int[] getColors();

    @Import(value="hash")
    public long getHash();

    @Import(value="equipment")
    public int[] getEquipmentIds();

    @Import(value="npcTransformId")
    public void setTransformedNpcId(int var1);

    @Import(value="setHash")
    public void setHash();

    @Import(value="playerCompositionColorTextureOverrides")
    public RSPlayerCompositionColorTextureOverride[] getColorTextureOverrides();
}

