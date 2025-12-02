/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package net.unethicalite.api.game;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public enum BoostingPotion {
    DIVINE_SUPER_COMBAT("Divine super combat potion", 5, 15, Skill.STRENGTH, Skill.ATTACK, Skill.DEFENCE),
    SUPER_COMBAT("Super combat potion", 5, 15, Skill.STRENGTH, Skill.ATTACK, Skill.DEFENCE),
    SUPER_STRENGTH("Super strength", 5, 15, Skill.STRENGTH),
    SUPER_ATTACK("Super attack", 5, 15, Skill.ATTACK),
    SUPER_DEFENCE("Super defence", 5, 15, Skill.DEFENCE),
    ATTACK_POTION("Attack potion", 3, 10, Skill.ATTACK),
    STRENGTH_POTION("Strength potion", 3, 10, Skill.STRENGTH),
    DEFENSE_POTION("Defence potion", 3, 10, Skill.DEFENCE),
    DIVINE_RANGING_POTION("Divine ranging potion", 4, 10, Skill.RANGED),
    DIVINE_BASTION_POTION("Divine bastion potion", 4, 10, Skill.RANGED, Skill.DEFENCE),
    RANGING_POTION("Ranging potion", 4, 10, Skill.RANGED),
    BASTION_POTION("Bastion potion", 4, 10, Skill.RANGED, Skill.DEFENCE),
    DIVINE_MAGIC_POTION("Divine magic potion", 4, 0, Skill.MAGIC),
    MAGIC_POTION("Magic potion", 4, 0, Skill.MAGIC),
    ANCIENT_BREW("Ancient brew", 2, 5, Skill.MAGIC);

    private final String name;
    private final int percentage;
    private final Skill[] skills;
    private final int boostAmount;

    private BoostingPotion(String name, int boostAmount, int percentage, Skill ... skills) {
        this.name = name;
        this.percentage = percentage;
        this.skills = skills;
        this.boostAmount = boostAmount;
    }

    public int getBoostAmount(Skill skill) {
        return this.boostAmount + Skills.getLevel(skill) * this.percentage / 100;
    }

    public String getName() {
        return this.name;
    }

    public Skill[] getSkills() {
        return this.skills;
    }
}
