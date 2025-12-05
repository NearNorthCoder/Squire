/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.PendingLogin
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.PendingLogin;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUsername;

public interface RSFriendLoginUpdate
extends PendingLogin {
    @Import(value="username")
    public RSUsername getRsName();

    @Import(value="world")
    public short getWorld();
}

