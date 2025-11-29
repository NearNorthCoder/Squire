/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.cox.tasks;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

/**
 * CombatCalculator - Performs combat-related calculations for raids.
 *
 * This class provides utility methods for calculating damage, effectiveness,
 * and other combat metrics used during Chambers of Xeric encounters.
 * The calculations take into account player stats, modifiers, and raid scaling.
 */
public class CombatCalculator {

    static {
        CombatCalculator.initializeMapper();
    }

    /**
     * Calculates a base combat value.
     * Formula: (value1 + 8) * (value2 + 9)
     *
     * @param value1 the first combat value
     * @param value2 the second combat value
     * @return the calculated base value
     */
    public static int calculateBaseValue(int value1, int value2) {
        return (value1 + 8) * (value2 + 9);
    }

    /**
     * Calculates combat effectiveness with scaling.
     * Compares two scaled values and returns an effectiveness ratio.
     *
     * @param baseValue1 the first base value
     * @param baseValue2 the second base value
     * @param multiplier1 the first multiplier
     * @param multiplier2 the second multiplier
     * @param scaleValue1 the first scaling value
     * @param scaleValue2 the second scaling value
     * @return the effectiveness ratio between 0.0 and 1.0
     */
    public static double calculateEffectiveness(int baseValue1, int baseValue2,
                                                double multiplier1, double multiplier2,
                                                int scaleValue1, int scaleValue2) {
        double scaledValue1 = calculateScaledValue(baseValue1, baseValue2, multiplier1, multiplier2);
        double scaledValue2 = calculateBaseValue(scaleValue1, scaleValue2);

        if (compare(scaledValue1, scaledValue2) > 0) {
            return 1.0 - (scaledValue2 + 8.0) / (2.0 * (scaledValue1 + 64.0));
        }
        return scaledValue1 / (2.0 * (scaledValue2 + 64.0));
    }

    /**
     * Compares two double values.
     *
     * @param value1 the first value
     * @param value2 the second value
     * @return negative if value1 < value2, 0 if equal, positive if value1 > value2
     */
    private static int compare(double value1, double value2) {
        return value1 == value2 ? 0 : (value1 > value2 ? 1 : -1);
    }

    /**
     * Calculates a scaled combat value.
     * Formula: (scaledBase(baseValue, multiplier2) * (value + 9)) * multiplier1
     *
     * @param baseValue the base value
     * @param value the value to scale with
     * @param multiplier1 the primary multiplier
     * @param multiplier2 the secondary multiplier
     * @return the scaled value
     */
    public static int calculateScaledValue(int baseValue, int value,
                                          double multiplier1, double multiplier2) {
        return (int)((double)(applyScaling(baseValue, multiplier2) * (value + 9)) * multiplier1);
    }

    /**
     * Applies scaling to a base value.
     * Formula: (baseValue * multiplier) + 64 + 1
     *
     * @param baseValue the base value to scale
     * @param multiplier the scaling multiplier
     * @return the scaled base value
     */
    public static int applyScaling(int baseValue, double multiplier) {
        return (int)((double)baseValue * multiplier) + 64 + 1;
    }

    /**
     * Calculates a modified combat value with division.
     * Formula: (scaledValue(value2, multiplier2) * (value1 + 9) + 100) / 4
     *
     * @param value1 the first value
     * @param value2 the second value
     * @param multiplier1 the first multiplier (unused in this calculation)
     * @param multiplier2 the second multiplier
     * @return the modified combat value
     */
    public static int calculateModifiedValue(int value1, int value2,
                                            double multiplier1, double multiplier2) {
        return (applyScaling(value2, multiplier2) * (value1 + 9) + 100) / 4;
    }

    /**
     * Calculates damage per second based on player combat stats.
     * Takes into account Strength and Attack levels along with various modifiers.
     *
     * @param gearBonus1 the first gear bonus
     * @param multiplier1 the first multiplier
     * @param gearBonus2 the second gear bonus
     * @param multiplier2 the second multiplier
     * @param scaleValue1 the first scaling value
     * @param scaleValue2 the second scaling value
     * @param weaponSpeed the weapon attack speed
     * @return the calculated damage per second
     */
    public static double calculateDamagePerSecond(int gearBonus1, double multiplier1,
                                                  int gearBonus2, double multiplier2,
                                                  int scaleValue1, int scaleValue2,
                                                  int weaponSpeed) {
        int strengthLevel = Skills.getLevel(Skill.STRENGTH);
        int attackLevel = Skills.getLevel(Skill.ATTACK);

        double accuracy = calculateEffectiveness(attackLevel, gearBonus2, 1.0, multiplier2,
                                                scaleValue1, scaleValue2);
        double maxHit = calculateScaledValue(gearBonus1, strengthLevel, 1.0, multiplier1);

        return accuracy * maxHit / 2.0 / ((double)weaponSpeed * 0.6);
    }

    /**
     * Applies a simple scaling multiplier.
     * Formula: (value * multiplier) + 64 + 1
     *
     * @param value the value to scale
     * @param multiplier the scaling multiplier
     * @return the scaled value
     */
    public static int applySimpleScaling(int value, double multiplier) {
        return (int)((double)value * multiplier) + 64 + 1;
    }

    /**
     * Initializes the mapper (placeholder for generated code).
     */
    private static void initializeMapper() {
        // Generated initialization code
    }
}
