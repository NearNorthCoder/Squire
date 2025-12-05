/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Deque
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Deque;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSNode;

public interface RSNodeDeque
extends Deque {
    @Import(value="current")
    public RSNode getCurrent();

    @Import(value="sentinel")
    public RSNode getSentinel();

    @Import(value="last")
    public RSNode last();

    @Import(value="previous")
    public RSNode previous();

    @Import(value="addFirst")
    public void addFirst(RSNode var1);

    @Import(value="addLast")
    public void addLast(RSNode var1);

    @Import(value="removeLast")
    public RSNode removeLast();

    @Import(value="clear")
    public void clear();
}

