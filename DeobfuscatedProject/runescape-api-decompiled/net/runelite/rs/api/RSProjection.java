/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Projection
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Projection;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSRenderable;

public interface RSProjection
extends Projection {
    @Import(value="draw")
    public void draw(RSRenderable var1, int var2, int var3, int var4, int var5, long var6);
}

