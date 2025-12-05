/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import net.runelite.api.DualNode;

public interface SequenceDefinition
extends DualNode {
    public int getFrameCount();

    public int[] getFrameIDs();

    public int[] getFrameLengths();

    public int[] getChatFrameIds();
}

