/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.HashTable
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.HashTable;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSNodeHashTable
extends HashTable {
    @Import(value="get")
    public RSNode get(long var1);

    @Import(value="size")
    public int getSize();

    @Import(value="buckets")
    public RSNode[] getBuckets();
}

