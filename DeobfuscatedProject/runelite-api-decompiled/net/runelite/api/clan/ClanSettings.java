/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.clan;

import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanTitle;

public interface ClanSettings {
    public String getName();

    public List<ClanMember> getMembers();

    @Nullable
    public ClanMember findMember(String var1);

    @Nullable
    public ClanTitle titleForRank(ClanRank var1);
}

