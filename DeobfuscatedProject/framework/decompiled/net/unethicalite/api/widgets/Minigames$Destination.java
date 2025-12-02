/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Quest
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 */
package net.unethicalite.api.widgets;

import java.util.Arrays;
import net.runelite.api.Quest;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Widgets;

public static enum Minigames.Destination {
    BARBARIAN_ASSAULT(1, "Barbarian Assault", new WorldPoint(2531, 3577, 0), false),
    BLAST_FURNACE(2, "Blast Furnace", new WorldPoint(2933, 10183, 0), true),
    BURTHORPE_GAMES_ROOM(3, "Burthorpe Games Room", new WorldPoint(2208, 4938, 0), true),
    CASTLE_WARS(4, "Castle Wars", new WorldPoint(2439, 3092, 0), false),
    CLAN_WARS(5, "Clan Wars", new WorldPoint(3151, 3636, 0), false),
    DAGANNOTH_KINGS(6, "Dagannoth Kings", null, true),
    FISHING_TRAWLER(7, "Fishing Trawler", new WorldPoint(2658, 3158, 0), true),
    GIANTS_FOUNDARY(8, "Giants' Foundry", new WorldPoint(3361, 3147, 0), true),
    GOD_WARS(9, "God Wars", null, true),
    GUARDIANS_OF_THE_RIFT(10, "Guardians of the Rift", new WorldPoint(3616, 9478, 0), true),
    LAST_MAN_STANDING(11, "Last Man Standing", new WorldPoint(3149, 3635, 0), false),
    NIGHTMARE_ZONE(12, "Nightmare Zone", new WorldPoint(2611, 3121, 0), true),
    PEST_CONTROL(13, "Pest Control", new WorldPoint(2653, 2655, 0), true),
    PLAYER_OWNED_HOUSES(14, "Player Owned Houses", null, false),
    RAT_PITS(15, "Rat Pits", new WorldPoint(3263, 3406, 0), true),
    SHADES_OF_MORTTON(16, "Shades of Mort'ton", new WorldPoint(3500, 3300, 0), true),
    SHIELD_OF_ARRAV(17, "Shield of Arrav", null, true),
    SHOOTING_STARS(18, "Shooting Stars", null, true),
    SOUL_WARS(19, "Soul Wars", new WorldPoint(2209, 2857, 0), true),
    THEATRE_OF_BLOOD(20, "Theatre of Blood", null, true),
    TITHE_FARM(21, "Tithe Farm", new WorldPoint(1793, 3501, 0), true),
    TROUBLE_BREWING(22, "Trouble Brewing", new WorldPoint(3811, 3021, 0), true),
    TZHAAR_FIGHT_PIT(23, "TzHaar Fight Pit", new WorldPoint(2402, 5181, 0), true),
    VOLCANIC_MINE(24, "Volcanic Mine", null, true),
    NONE(-1, "None", null, false);

    private final int index;
    private final String name;
    private final WorldPoint location;
    private final boolean members;

    public boolean canUse() {
        if (!this.hasDestination()) {
            return false;
        }
        if (this.members && !Worlds.inMembersWorld()) {
            return false;
        }
        switch (this) {
            case BURTHORPE_GAMES_ROOM: 
            case CASTLE_WARS: 
            case CLAN_WARS: 
            case LAST_MAN_STANDING: 
            case SOUL_WARS: 
            case TZHAAR_FIGHT_PIT: 
            case GIANTS_FOUNDARY: {
                return true;
            }
            case BARBARIAN_ASSAULT: {
                return Vars.getBit(3251) >= 1;
            }
            case BLAST_FURNACE: {
                return Vars.getBit(575) >= 1;
            }
            case FISHING_TRAWLER: {
                return Skills.getLevel(Skill.FISHING) >= 15;
            }
            case GUARDIANS_OF_THE_RIFT: {
                return Quests.isFinished(Quest.TEMPLE_OF_THE_EYE);
            }
            case NIGHTMARE_ZONE: {
                return NMZ_QUESTS.stream().filter(Quests::isFinished).count() >= 5L;
            }
            case PEST_CONTROL: {
                return Players.getLocal().getCombatLevel() >= 40;
            }
            case RAT_PITS: {
                return Quests.isFinished(Quest.RATCATCHERS);
            }
            case SHADES_OF_MORTTON: {
                return Quests.isFinished(Quest.SHADES_OF_MORTTON);
            }
            case TROUBLE_BREWING: {
                return Quests.isFinished(Quest.CABIN_FEVER) && Skills.getLevel(Skill.COOKING) >= 40;
            }
            case TITHE_FARM: {
                return false;
            }
        }
        return false;
    }

    public boolean hasDestination() {
        return this.location != null;
    }

    public static Minigames.Destination getCurrent() {
        Widget selectedTeleport = MINIGAMES_DESTINATION.get();
        if (Widgets.isVisible(selectedTeleport)) {
            return Minigames.Destination.byName(selectedTeleport.getText());
        }
        return NONE;
    }

    public static Minigames.Destination byName(String name) {
        return Arrays.stream(Minigames.Destination.values()).filter(x -> x.getName().equals(name)).findFirst().orElse(NONE);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public WorldPoint getLocation() {
        return this.location;
    }

    public boolean isMembers() {
        return this.members;
    }

    private Minigames.Destination(int index, String name, WorldPoint location, boolean members) {
        this.index = index;
        this.name = name;
        this.location = location;
        this.members = members;
    }
}
