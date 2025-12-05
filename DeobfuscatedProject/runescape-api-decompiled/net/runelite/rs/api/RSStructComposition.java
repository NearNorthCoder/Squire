/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IterableHashTable
 *  net.runelite.api.StructComposition
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IterableHashTable;
import net.runelite.api.StructComposition;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSIterableNodeHashTable;

public interface RSStructComposition
extends StructComposition {
    public int getId();

    public void setId(int var1);

    @Import(value="params")
    public RSIterableNodeHashTable getParams();

    @Import(value="params")
    public void setParams(IterableHashTable var1);

    @Import(value="params")
    public void setParams(RSIterableNodeHashTable var1);
}

