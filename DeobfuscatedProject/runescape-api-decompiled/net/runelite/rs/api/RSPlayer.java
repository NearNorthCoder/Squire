/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.Player;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSPlayerComposition;
import net.runelite.rs.api.RSUsername;

public interface RSPlayer
extends RSActor,
Player {
    @Import(value="username")
    public RSUsername getRsName();

    default public int getId() {
        return this.getIndex();
    }

    @Import(value="appearance")
    public RSPlayerComposition getPlayerComposition();

    @Import(value="combatLevel")
    public int getCombatLevel();

    @Import(value="skillLevel")
    public int getTotalLevel();

    @Import(value="team")
    public int getTeam();

    @Import(value="isFriendsChatMember")
    public boolean isFriendsChatMember();

    @Import(value="isClanMember")
    public boolean isClanMember();

    @Import(value="isFriend")
    public boolean isFriend();

    public boolean isFriended();

    @Import(value="headIconPrayer")
    public int getRsOverheadIcon();

    @Import(value="headIconPk")
    public int getRsSkullIcon();

    @Import(value="skillLevel")
    public int getRSSkillLevel();
}

