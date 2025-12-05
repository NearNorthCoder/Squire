/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MessageNode
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.MessageNode;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUsername;

public interface RSMessage
extends MessageNode {
    @Import(value="count")
    public int getId();

    @Import(value="type")
    public int getRSType();

    @Import(value="sender")
    public String getName();

    @Import(value="sender")
    public void setName(String var1);

    @Import(value="prefix")
    public String getSender();

    @Import(value="prefix")
    public void setSender(String var1);

    @Import(value="text")
    public String getValue();

    @Import(value="text")
    public void setValue(String var1);

    @Import(value="isFromFriend")
    public boolean isFromFriend();

    @Import(value="senderUsername")
    public RSUsername getSenderUsername();
}

