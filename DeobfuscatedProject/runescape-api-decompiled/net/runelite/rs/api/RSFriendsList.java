/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Deque
 *  net.runelite.api.FriendContainer
 *  net.runelite.api.PendingLogin
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Deque;
import net.runelite.api.FriendContainer;
import net.runelite.api.PendingLogin;
import net.runelite.mapping.Import;

public interface RSFriendsList
extends FriendContainer {
    @Import(value="friendLoginUpdates")
    public Deque<PendingLogin> getPendingLogins();
}

