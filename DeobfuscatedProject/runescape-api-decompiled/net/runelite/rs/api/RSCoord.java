/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSCoord {
    @Import(value="plane")
    public int getPlane();

    @Import(value="x")
    public int getX();

    @Import(value="y")
    public int getY();
}

