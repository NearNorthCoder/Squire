/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.ColorTextureOverride;
import net.runelite.api.kit.KitType;

public interface PlayerComposition {
    @Deprecated
    public boolean isFemale();

    public int getGender();

    public int[] getColors();

    public int[] getEquipmentIds();

    public int getEquipmentId(KitType var1);

    public int getKitId(KitType var1);

    public void setHash();

    public void setTransformedNpcId(int var1);

    @Nullable
    public ColorTextureOverride[] getColorTextureOverrides();
}

