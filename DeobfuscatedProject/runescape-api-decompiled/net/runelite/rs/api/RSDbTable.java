/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.util.List;
import net.runelite.mapping.Import;

public interface RSDbTable {
    @Import(value="columns")
    public List getColumns();
}

