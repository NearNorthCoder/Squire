/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.IndexedObjectSet
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.IndexedObjectSet;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSSceneNode;

public interface RSIndexedObjectSet
extends IndexedObjectSet {
    default public Object byIndex(int var1) {
        return this.nodeByIndex(var1);
    }

    @Import(value="nodeByIndex")
    public RSSceneNode nodeByIndex(long var1);
}

