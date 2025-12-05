/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSModel;

public interface RSSpotAnimationDefinition {
    @Import(value="getModel")
    public RSModel getModel(int var1);

    @Import(value="recolorFrom")
    public void setRecolorFrom(short[] var1);

    @Import(value="recolorTo")
    public void setRecolorTo(short[] var1);

    @Import(value="sequence")
    public int getSequence();
}

