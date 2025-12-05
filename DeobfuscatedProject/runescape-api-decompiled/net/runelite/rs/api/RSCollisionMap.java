/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.CollisionData
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.CollisionData;
import net.runelite.mapping.Import;

public interface RSCollisionMap
extends CollisionData {
    @Import(value="flags")
    public int[][] getFlags();
}

