/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.FriendContainer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.FriendContainer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSIgnoreList;
import net.runelite.rs.api.RSUsername;

public interface RSFriendSystem {
    @Import(value="friendsList")
    public FriendContainer getFriendContainer();

    @Import(value="ignoreList")
    public RSIgnoreList getIgnoreContainer();

    @Import(value="isFriended")
    public boolean isFriended(RSUsername var1, boolean var2);

    @Import(value="isIgnored")
    public boolean isIgnored(RSUsername var1);

    @Import(value="addFriend")
    public void addFriend(String var1);

    @Import(value="removeFriend")
    public void removeFriend(String var1);

    @Import(value="addIgnore")
    public void addIgnore(String var1);

    @Import(value="removeIgnore")
    public void removeIgnore(String var1, boolean var2);
}

