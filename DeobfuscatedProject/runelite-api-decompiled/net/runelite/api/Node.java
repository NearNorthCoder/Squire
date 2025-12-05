/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

public interface Node {
    public Node getNext();

    public Node getPrevious();

    public void unlink();

    public long getHash();
}

