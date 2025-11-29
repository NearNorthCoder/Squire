/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  net.runelite.api.Skill
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Skill;

/**
 * CombatSkillMapper - Maps combat skills to array indices for switch-like behavior.
 *
 * This class provides a mapping from RuneLite's Skill enum to integer indices,
 * specifically for the five main combat skills used in Tombs of Amascut.
 * The decompiler generated this as a switch statement replacement.
 */
class CombatSkillMapper {

    /**
     * Array mapping Skill enum ordinals to combat skill indices.
     * Used for switch-like behavior in combat calculations.
     */
    static final int[] SKILL_TO_INDEX;

    /**
     * Initializes the index values array.
     * Values: [1, 2, 3, 4, 5] representing each combat skill type.
     */
    private static void initializeIndices() {
        INDICES = new int[5];
        CombatSkillMapper.INDICES[0] = 1;  // Attack
        CombatSkillMapper.INDICES[1] = 2;  // Strength
        CombatSkillMapper.INDICES[2] = 3;  // Defence
        CombatSkillMapper.INDICES[3] = 4;  // Ranged (0xA ^ 0x16 ^ 0x43 ^ 0x5B = 4)
        CombatSkillMapper.INDICES[4] = 5;  // Magic (1 ^ 4 = 5)
    }

    static {
        // Initialize skill indices first
        CombatSkillMapper.initializeIndices();

        // Create mapping array sized for all Skill enum values
        SKILL_TO_INDEX = new int[Skill.values().length];

        // Map each combat skill to its corresponding index
        try {
            CombatSkillMapper.SKILL_TO_INDEX[Skill.ATTACK.ordinal()] = INDICES[0];
        } catch (NoSuchFieldError e) {
            // Ignore if skill not found
        }

        try {
            CombatSkillMapper.SKILL_TO_INDEX[Skill.STRENGTH.ordinal()] = INDICES[1];
        } catch (NoSuchFieldError e) {
            // Ignore if skill not found
        }

        try {
            CombatSkillMapper.SKILL_TO_INDEX[Skill.DEFENCE.ordinal()] = INDICES[2];
        } catch (NoSuchFieldError e) {
            // Ignore if skill not found
        }

        try {
            CombatSkillMapper.SKILL_TO_INDEX[Skill.RANGED.ordinal()] = INDICES[3];
        } catch (NoSuchFieldError e) {
            // Ignore if skill not found
        }

        try {
            CombatSkillMapper.SKILL_TO_INDEX[Skill.MAGIC.ordinal()] = INDICES[4];
        } catch (NoSuchFieldError e) {
            // Ignore if skill not found
        }
    }

    // Static helper array used during initialization
    private static int[] INDICES;
}
