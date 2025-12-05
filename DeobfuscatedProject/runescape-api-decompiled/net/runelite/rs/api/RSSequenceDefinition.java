/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Animation
 *  net.runelite.api.SequenceDefinition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Animation;
import net.runelite.api.SequenceDefinition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNode;

public interface RSSequenceDefinition
extends RSNode,
SequenceDefinition,
Animation {
    @Import(value="frameCount")
    public int getFrameCount();

    @Import(value="frameIds")
    public int[] getFrameIDs();

    @Import(value="frameLengths")
    public int[] getFrameLengths();

    @Import(value="chatFrameIds")
    public int[] getChatFrameIds();

    @Import(value="transformSpotAnimationModel")
    public RSModel transformSpotAnimationModel(RSModel var1, int var2);

    @Import(value="isCachedModelIdSet")
    public boolean isCachedModelIdSet();

    @Import(value="SequenceDefinition_cachedModelId")
    public int getCachedModelId();

    @Import(value="getNumFramesWhenCachedModelSet")
    public int getNumFramesWhenCachedModelSet();

    public void setId(int var1);
}

