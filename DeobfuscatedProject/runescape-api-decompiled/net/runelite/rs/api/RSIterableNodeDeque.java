/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSIterableNodeDeque {
    @Import(value="sentinel")
    public RSNode getCurrent();

    @Import(value="last")
    public RSNode getLast();
}

