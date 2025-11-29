/*
 * Deobfuscated TOA Combat Potion Enum
 * Represents combat boosting potions used during TOA
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents combat potions that can be used to boost stats in TOA.
 *
 * Each potion has:
 * - A display name
 * - A flat boost amount
 * - A percentage boost based on level
 * - The skills it affects
 */
public enum CombatPotion {
    SUPER_COMBAT("Super combat potion", 5, 15, Skill.STRENGTH, Skill.ATTACK, Skill.DEFENCE),
    DIVINE_SUPER_COMBAT("Divine super combat potion", 5, 15, Skill.STRENGTH, Skill.ATTACK, Skill.DEFENCE),
    SUPER_STRENGTH("Super strength", 5, 15, Skill.STRENGTH),
    SUPER_ATTACK("Super attack", 5, 15, Skill.ATTACK),
    SUPER_DEFENCE("Super defence", 5, 15, Skill.DEFENCE),
    RANGING_POTION("Ranging potion", 4, 10, Skill.RANGED),
    DIVINE_RANGING_POTION("Divine ranging potion", 4, 10, Skill.RANGED),
    BASTION_POTION("Bastion potion", 4, 10, Skill.RANGED, Skill.DEFENCE),
    MAGIC_POTION("Magic potion", 4, 0, Skill.MAGIC),
    DIVINE_MAGIC_POTION("Divine magic potion", 4, 0, Skill.MAGIC),
    ANCIENT_BREW("Ancient brew", 2, 5, Skill.MAGIC);

    /** Display name of the potion */
    private final String name;

    /** Flat boost amount */
    private final int boostAmount;

    /** Percentage of level to add */
    private final int percentage;

    /** Skills affected by this potion */
    private final Skill[] skills;

    CombatPotion(String name, int boostAmount, int percentage, Skill... skills) {
        this.name = name;
        this.boostAmount = boostAmount;
        this.percentage = percentage;
        this.skills = skills;
    }

    /**
     * Get the display name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the skills affected by this potion
     */
    public Skill[] getSkills() {
        return this.skills;
    }

    /**
     * Calculate the boosted level for a skill
     */
    public int calculateBoostedLevel(Skill skill) {
        return this.boostAmount + Skills.getLevel(skill) * this.percentage / 100;
    }

    /**
     * Check if a skill is relevant for a weapon style
     */
    public static boolean isSkillRelevantForStyle(Skill skill, WeaponStyle style) {
        switch (skill) {
            case ATTACK:
            case STRENGTH:
            case DEFENCE:
                return style == WeaponStyle.MELEE;
            case RANGED:
                return style == WeaponStyle.RANGE;
            case MAGIC:
                return style == WeaponStyle.MAGIC;
            default:
                return false;
        }
    }

    /**
     * Get relevant potions for the currently equipped weapon
     */
    public static CombatPotion[] getRelevantPotions(Item weapon) {
        if (weapon == null) {
            return new CombatPotion[0];
        }

        WeaponStyle style = WeaponMap.StyleMap.getOrDefault(weapon.getId(), WeaponStyle.MELEE);
        List<CombatPotion> relevant = new ArrayList<>();

        for (CombatPotion potion : values()) {
            for (Skill skill : potion.getSkills()) {
                if (isSkillRelevantForStyle(skill, style)) {
                    relevant.add(potion);
                    break;
                }
            }
        }

        return relevant.toArray(new CombatPotion[0]);
    }
}
