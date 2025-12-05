/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.AABB
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.AABB;
import net.runelite.mapping.Import;

public interface RSAABB
extends AABB {
    @Import(value="xMid")
    public int getCenterX();

    @Import(value="yMid")
    public int getCenterY();

    @Import(value="zMid")
    public int getCenterZ();

    @Import(value="xMidOffset")
    public int getExtremeX();

    @Import(value="yMidOffset")
    public int getExtremeY();

    @Import(value="zMidOffset")
    public int getExtremeZ();
}

