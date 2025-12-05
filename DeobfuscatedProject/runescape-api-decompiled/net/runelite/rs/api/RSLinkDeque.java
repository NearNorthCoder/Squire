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
import net.runelite.rs.api.RSLink;

public interface RSLinkDeque
extends Deque {
    @Import(value="current")
    public RSLink getCurrent();

    @Import(value="current")
    public void setCurrent(RSLink var1);

    @Import(value="sentinel")
    public RSLink getSentinel();

    @Import(value="last")
    public RSLink last();

    @Import(value="previous")
    public RSLink previous();

    @Import(value="addFirst")
    public void addFirst(RSLink var1);
}

