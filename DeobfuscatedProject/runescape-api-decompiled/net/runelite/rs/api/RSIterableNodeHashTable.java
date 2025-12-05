/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IndexedObjectSet
 *  net.runelite.api.IterableHashTable
 *  net.runelite.api.Node
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IndexedObjectSet;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSIterableNodeHashTable
extends IterableHashTable,
IndexedObjectSet {
    @Import(value="get")
    public RSNode get(long var1);

    @Import(value="put")
    public void put(Node var1, long var2);
}

