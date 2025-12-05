/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skeleton
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Skeleton;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSSkeleton
extends RSNode,
Skeleton {
    @Import(value="count")
    public int getCount();

    @Import(value="transformTypes")
    public int[] getTypes();

    @Import(value="labels")
    public int[][] getList();
}

