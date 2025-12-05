/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSDbRowType {
    @Import(value="tableId")
    public int getTableId();

    @Import(value="getColumnType")
    public Object[] getColumnType(int var1);
}

