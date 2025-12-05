/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.FriendsChatManager
 *  net.runelite.api.FriendsChatMember
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.FriendsChatManager;
import net.runelite.api.FriendsChatMember;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUserList;

public interface RSFriendsChat
extends RSUserList<FriendsChatMember>,
FriendsChatManager {
    @Import(value="owner")
    public String getOwner();

    @Import(value="name")
    public String getName();

    @Import(value="rank")
    public int getRank();

    @Import(value="minKick")
    public byte getMinKickRank();
}

