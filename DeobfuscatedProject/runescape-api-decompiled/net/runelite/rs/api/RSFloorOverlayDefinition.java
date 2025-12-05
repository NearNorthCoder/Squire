/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSBuffer;

public interface RSFloorOverlayDefinition {
    @Import(value="primaryRgb")
    public int getPrimaryRgb();

    @Import(value="texture")
    public int getTexture();

    @Import(value="decode")
    public void decode(RSBuffer var1, int var2);

    @Import(value="postDecode")
    public void postDecode();
}

