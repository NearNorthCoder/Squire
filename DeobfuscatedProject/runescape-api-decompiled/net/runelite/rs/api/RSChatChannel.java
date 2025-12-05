/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.ChatLineBuffer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.ChatLineBuffer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSMessage;

public interface RSChatChannel
extends ChatLineBuffer {
    @Import(value="messages")
    public RSMessage[] getLines();

    @Import(value="count")
    public int getLength();

    @Import(value="count")
    public void setLength(int var1);
}

