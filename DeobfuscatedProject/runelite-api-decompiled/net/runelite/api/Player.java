/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Polygon;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.HeadIcon;
import net.runelite.api.PlayerComposition;
import net.runelite.api.SkullIcon;

public interface Player
extends Actor {
    @Override
    public int getId();

    @Override
    public int getCombatLevel();

    public int getPlayerId();

    @Nullable
    public PlayerComposition getPlayerComposition();

    public Polygon[] getPolygons();

    public int getTeam();

    public boolean isFriendsChatMember();

    public boolean isFriend();

    public boolean isClanMember();

    @Nullable
    public HeadIcon getOverheadIcon();

    @Nullable
    public SkullIcon getSkullIcon();

    public int getRSSkillLevel();

    @Override
    public String[] getActions();

    public int getIndex();

    public boolean isIdle();

    @Override
    default public boolean isAnimating() {
        return this.getAnimation() != -1;
    }
}

