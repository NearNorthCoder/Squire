/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.clan;

import java.time.LocalDate;
import net.runelite.api.clan.ClanRank;

public interface ClanMember {
    public String getName();

    public ClanRank getRank();

    public LocalDate getJoinDate();
}

