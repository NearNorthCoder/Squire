/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDbTableType {
    @Import(value="types")
    public int[][] getTypes();

    @Import(value="defaultValues")
    public Object[][] getDefaultValues();
}

