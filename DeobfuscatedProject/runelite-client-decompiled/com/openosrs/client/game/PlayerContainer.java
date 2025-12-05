/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Player
 */
package com.openosrs.client.game;

import com.openosrs.client.game.AttackStyle;
import com.openosrs.client.game.CombatStats;
import java.util.LinkedHashMap;
import net.runelite.api.Player;
import net.runelite.client.hiscore.HiscoreResult;

public class PlayerContainer {
    private AttackStyle attackStyle = AttackStyle.UNKNOWN;
    private AttackStyle weakness;
    private HiscoreResult skills;
    private LinkedHashMap<Integer, Integer> gear = new LinkedHashMap();
    private LinkedHashMap<Integer, Integer> riskedGear;
    private MeleeStyle meleeStyle = MeleeStyle.STAB;
    private Player player;
    private String location = "N/A";
    private String name;
    private String targetString;
    private CombatStats combatStats;
    private boolean httpRetry;
    private boolean hiscoresRequested;
    private boolean scouted;
    private boolean attacking;
    private boolean friend;
    private boolean clan;
    private int hpLevel = 0;
    private int potionBoost;
    private int prayerLevel;
    private int risk;
    private int scoutTimer;
    private int shield;
    private int timer;
    private int weapon;
    private int wildyLevel;

    PlayerContainer(Player player) {
        this.name = player.getName();
        this.player = player;
        this.riskedGear = new LinkedHashMap();
        this.scoutTimer = 500;
        this.scouted = false;
        this.skills = null;
        this.targetString = "";
        this.weakness = AttackStyle.UNKNOWN;
    }

    void reset() {
        this.setMeleeStyle(MeleeStyle.NONE);
        if (this.getTimer() > 0) {
            this.setTimer(this.getTimer() - 1);
            if (this.getTimer() == 0) {
                this.setAttacking(false);
            }
        }
    }

    public AttackStyle getAttackStyle() {
        return this.attackStyle;
    }

    public AttackStyle getWeakness() {
        return this.weakness;
    }

    public HiscoreResult getSkills() {
        return this.skills;
    }

    public LinkedHashMap<Integer, Integer> getGear() {
        return this.gear;
    }

    public LinkedHashMap<Integer, Integer> getRiskedGear() {
        return this.riskedGear;
    }

    public MeleeStyle getMeleeStyle() {
        return this.meleeStyle;
    }

    public Player getPlayer() {
        return this.player;
    }

    public String getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getTargetString() {
        return this.targetString;
    }

    public CombatStats getCombatStats() {
        return this.combatStats;
    }

    public boolean isHttpRetry() {
        return this.httpRetry;
    }

    public boolean isHiscoresRequested() {
        return this.hiscoresRequested;
    }

    public boolean isScouted() {
        return this.scouted;
    }

    public boolean isAttacking() {
        return this.attacking;
    }

    public boolean isFriend() {
        return this.friend;
    }

    public boolean isClan() {
        return this.clan;
    }

    public int getHpLevel() {
        return this.hpLevel;
    }

    public int getPotionBoost() {
        return this.potionBoost;
    }

    public int getPrayerLevel() {
        return this.prayerLevel;
    }

    public int getRisk() {
        return this.risk;
    }

    public int getScoutTimer() {
        return this.scoutTimer;
    }

    public int getShield() {
        return this.shield;
    }

    public int getTimer() {
        return this.timer;
    }

    public int getWeapon() {
        return this.weapon;
    }

    public int getWildyLevel() {
        return this.wildyLevel;
    }

    public void setAttackStyle(AttackStyle attackStyle) {
        this.attackStyle = attackStyle;
    }

    public void setWeakness(AttackStyle weakness) {
        this.weakness = weakness;
    }

    public void setSkills(HiscoreResult skills) {
        this.skills = skills;
    }

    public void setGear(LinkedHashMap<Integer, Integer> gear) {
        this.gear = gear;
    }

    public void setRiskedGear(LinkedHashMap<Integer, Integer> riskedGear) {
        this.riskedGear = riskedGear;
    }

    public void setMeleeStyle(MeleeStyle meleeStyle) {
        this.meleeStyle = meleeStyle;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTargetString(String targetString) {
        this.targetString = targetString;
    }

    public void setCombatStats(CombatStats combatStats) {
        this.combatStats = combatStats;
    }

    public void setHttpRetry(boolean httpRetry) {
        this.httpRetry = httpRetry;
    }

    public void setHiscoresRequested(boolean hiscoresRequested) {
        this.hiscoresRequested = hiscoresRequested;
    }

    public void setScouted(boolean scouted) {
        this.scouted = scouted;
    }

    public void setAttacking(boolean attacking) {
        this.attacking = attacking;
    }

    public void setFriend(boolean friend) {
        this.friend = friend;
    }

    public void setClan(boolean clan) {
        this.clan = clan;
    }

    public void setHpLevel(int hpLevel) {
        this.hpLevel = hpLevel;
    }

    public void setPotionBoost(int potionBoost) {
        this.potionBoost = potionBoost;
    }

    public void setPrayerLevel(int prayerLevel) {
        this.prayerLevel = prayerLevel;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setScoutTimer(int scoutTimer) {
        this.scoutTimer = scoutTimer;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public void setWildyLevel(int wildyLevel) {
        this.wildyLevel = wildyLevel;
    }

    public String toString() {
        return "PlayerContainer(attackStyle=" + String.valueOf((Object)this.getAttackStyle()) + ", weakness=" + String.valueOf((Object)this.getWeakness()) + ", skills=" + String.valueOf(this.getSkills()) + ", gear=" + String.valueOf(this.getGear()) + ", riskedGear=" + String.valueOf(this.getRiskedGear()) + ", meleeStyle=" + String.valueOf((Object)this.getMeleeStyle()) + ", location=" + this.getLocation() + ", name=" + this.getName() + ", targetString=" + this.getTargetString() + ", combatStats=" + String.valueOf(this.getCombatStats()) + ", httpRetry=" + this.isHttpRetry() + ", hiscoresRequested=" + this.isHiscoresRequested() + ", scouted=" + this.isScouted() + ", attacking=" + this.isAttacking() + ", friend=" + this.isFriend() + ", clan=" + this.isClan() + ", hpLevel=" + this.getHpLevel() + ", potionBoost=" + this.getPotionBoost() + ", prayerLevel=" + this.getPrayerLevel() + ", risk=" + this.getRisk() + ", scoutTimer=" + this.getScoutTimer() + ", shield=" + this.getShield() + ", timer=" + this.getTimer() + ", weapon=" + this.getWeapon() + ", wildyLevel=" + this.getWildyLevel() + ")";
    }

    static enum MeleeStyle {
        CRUSH,
        SLASH,
        STAB,
        NONE;

    }
}

