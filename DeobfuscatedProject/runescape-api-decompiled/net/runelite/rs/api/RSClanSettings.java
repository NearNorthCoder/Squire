/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.clan.ClanSettings
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.clan.ClanSettings;
import net.runelite.mapping.Import;

public interface RSClanSettings
extends ClanSettings {
    @Import(value="name")
    public String getName();

    @Import(value="memberCount")
    public int getMemberCount();

    @Import(value="memberNames")
    public String[] getMemberNames();

    @Import(value="memberRanks")
    public byte[] getMemberRanks();

    @Import(value="getSortedMembers")
    public int[] getSortedMembers();

    @Import(value="getTitleGroupValue")
    public Integer getTitleGroupValue(int var1);
}

