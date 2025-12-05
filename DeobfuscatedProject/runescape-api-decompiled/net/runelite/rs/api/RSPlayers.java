/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSPlayers {
    @Import(value="count")
    public int getCount();

    @Import(value="indices")
    public int[] getIndices();
}

