/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.clan.ClanChannel
 *  net.runelite.api.clan.ClanChannelMember
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.util.List;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanChannelMember;
import net.runelite.mapping.Import;

public interface RSClanChannel
extends ClanChannel {
    @Import(value="name")
    public String getName();

    @Import(value="members")
    public List<ClanChannelMember> getMembers();

    @Import(value="getSortedMembers")
    public int[] getSortedMembers();
}

