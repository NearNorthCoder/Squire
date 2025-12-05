/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Node
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Node;
import net.runelite.mapping.Import;

public interface RSNode
extends Node {
    @Import(value="previous")
    public RSNode getNext();

    @Import(value="previous")
    public void setNext(RSNode var1);

    @Import(value="next")
    public RSNode getPrevious();

    @Import(value="next")
    public void setPrevious(RSNode var1);

    @Import(value="key")
    public long getHash();

    @Import(value="remove")
    public void unlink();

    public void onUnlink();
}

