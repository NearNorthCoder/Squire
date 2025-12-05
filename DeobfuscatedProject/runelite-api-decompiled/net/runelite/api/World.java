/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.EnumSet;
import net.runelite.api.WorldType;

public interface World {
    public EnumSet<WorldType> getTypes();

    public void setTypes(EnumSet<WorldType> var1);

    public int getPlayerCount();

    public void setPlayerCount(int var1);

    public int getLocation();

    public void setLocation(int var1);

    public int getIndex();

    public void setIndex(int var1);

    public int getId();

    public void setId(int var1);

    public String getActivity();

    public void setActivity(String var1);

    public String getAddress();

    public void setAddress(String var1);

    default public boolean isMembers() {
        return this.getTypes().contains((Object)WorldType.MEMBERS);
    }

    default public boolean isAllPkWorld() {
        return WorldType.isAllPKWorld(this.getTypes());
    }

    default public boolean isSkillTotal() {
        return this.getTypes().contains((Object)WorldType.SKILL_TOTAL);
    }

    default public boolean isTournament() {
        return this.getTypes().contains((Object)WorldType.NOSAVE_MODE) || this.getTypes().contains((Object)WorldType.TOURNAMENT_WORLD);
    }

    default public boolean isBeta() {
        return this.getTypes().contains((Object)WorldType.BETA_WORLD);
    }

    default public boolean isLeague() {
        return this.getTypes().contains((Object)WorldType.SEASONAL);
    }

    default public boolean isQuestSpeedRun() {
        return this.getTypes().contains((Object)WorldType.QUEST_SPEEDRUNNING);
    }

    default public boolean isNormal() {
        return !this.isBeta() && !this.isAllPkWorld() && !this.isSkillTotal() && !this.isTournament() && !this.isLeague() && !this.isPvpArena() && !this.isQuestSpeedRun() && !this.isFreshStart();
    }

    default public boolean isPvpArena() {
        return this.getTypes().contains((Object)WorldType.PVP_ARENA);
    }

    default public boolean isFreshStart() {
        return this.getTypes().contains((Object)WorldType.FRESH_START_WORLD);
    }
}

