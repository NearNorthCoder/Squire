/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.mahoghomes.model;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;

public enum Contract {
    BEGINNER("Plank", 1),
    NOVICE("Oak plank", 2),
    ADEPT("Teak plank", 3),
    EXPERT("Mahogany plank", 4),
    PROGRESSIVE(null, 5);

    private final String itemName;
    private final int dialogOption;

    private Contract(String itemName, int dialogOption) {
        this.itemName = itemName;
        this.dialogOption = dialogOption;
    }

    public String getItemName() {
        if (this != PROGRESSIVE) {
            return this.itemName;
        }
        int level = Skills.getLevel((Skill)Skill.CONSTRUCTION);
        if (level >= 70) {
            return Contract.EXPERT.itemName;
        }
        if (level >= 50) {
            return Contract.ADEPT.itemName;
        }
        if (level >= 20) {
            return Contract.NOVICE.itemName;
        }
        return Contract.BEGINNER.itemName;
    }

    public int getDialogOption() {
        if (this != PROGRESSIVE) {
            return this.dialogOption;
        }
        int level = Skills.getLevel((Skill)Skill.CONSTRUCTION);
        if (level >= 70) {
            return Contract.EXPERT.dialogOption;
        }
        if (level >= 50) {
            return Contract.ADEPT.dialogOption;
        }
        if (level >= 20) {
            return Contract.NOVICE.dialogOption;
        }
        return Contract.BEGINNER.dialogOption;
    }
}

