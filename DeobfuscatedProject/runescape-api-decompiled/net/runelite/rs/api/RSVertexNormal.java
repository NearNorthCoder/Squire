/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSVertexNormal {
    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();

    @Import(value="z")
    public int getZ();
}

