/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Frames
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Frames;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAnimation;
import net.runelite.rs.api.RSDualNode;

public interface RSFrames
extends RSDualNode,
Frames {
    @Import(value="frames")
    public RSAnimation[] getFrames();
}

