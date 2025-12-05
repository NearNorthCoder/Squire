/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.clan;

import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.clan.ClanChannelMember;

public interface ClanChannel {
    public String getName();

    public List<ClanChannelMember> getMembers();

    @Nullable
    public ClanChannelMember findMember(String var1);
}

