/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NodeCache
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.NodeCache;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSDualNode;
import net.runelite.rs.api.RSIterableDualNodeQueue;
import net.runelite.rs.api.RSIterableNodeHashTable;

public interface RSEvictingDualNodeHashTable
extends NodeCache {
    @Import(value="get")
    public RSDualNode get(long var1);

    @Import(value="put")
    public void put(RSDualNode var1, long var2);

    @Import(value="dualNode")
    public RSDualNode getDualNode();

    @Import(value="clear")
    public void reset();

    @Import(value="capacity")
    public int getCapacity();

    @Import(value="capacity")
    public void setCapacity(int var1);

    @Import(value="remainingCapacity")
    public int getRemainingCapacity();

    @Import(value="remainingCapacity")
    public void setRemainingCapacity(int var1);

    @Import(value="deque")
    public RSIterableDualNodeQueue getDeque();

    @Import(value="hashTable")
    public void setHashTable(RSIterableNodeHashTable var1);

    public float getThreshold();

    public void setThreshold(float var1);

    public int getTmpCapacity();

    public void setTmpCapacity(int var1);

    public boolean isTrashing();

    public void resize(int var1);

    public void increaseCapacity(int var1);
}

