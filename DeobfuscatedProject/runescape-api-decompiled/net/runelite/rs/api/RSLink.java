/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSLink {
    @Import(value="previous")
    public RSLink getPrevious();

    @Import(value="previous")
    public void setPrevious(RSLink var1);

    @Import(value="next")
    public RSLink next();

    @Import(value="next")
    public RSLink getNext();

    @Import(value="next")
    public void setNext(RSLink var1);

    @Import(value="remove")
    public void remove();
}

