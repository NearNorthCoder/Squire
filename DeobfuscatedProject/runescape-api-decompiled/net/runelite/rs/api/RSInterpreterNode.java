/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSInterpreterNode {
    @Import(value="array")
    public int[] getArray();

    @Import(value="length")
    public int getSize();
}

