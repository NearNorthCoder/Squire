/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.clan.ClanChannelMember
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.clan.ClanChannelMember;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSUsername;

public interface RSClanChannelMember
extends ClanChannelMember {
    @Import(value="rank")
    public byte getRSRank();

    @Import(value="world")
    public int getWorld();

    @Import(value="username")
    public RSUsername getUsername();
}

