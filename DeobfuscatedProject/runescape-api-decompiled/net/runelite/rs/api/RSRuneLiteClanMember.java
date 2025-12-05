/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.clan.ClanRank
 */
package net.runelite.rs.api;

import net.runelite.api.MenuEntry;
import net.runelite.api.clan.ClanRank;

public interface RSRuneLiteClanMember
extends MenuEntry {
    public ClanRank getRank();

    public String getName();
}

