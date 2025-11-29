package gg.squire.mahoghomes.model;

import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/model/Contract.class */
public enum Contract {
    BEGINNER("Plank", 1),
    NOVICE("Oak plank", 2),
    ADEPT("Teak plank", 3),
    EXPERT("Mahogany plank", 4),
    PROGRESSIVE(null, 5);
    
    private final String itemName;
    private final int dialogOption;

    Contract(String itemName, int dialogOption) {
        this.itemName = itemName;
        this.dialogOption = dialogOption;
    }

    public String getItemName() {
        if (this != PROGRESSIVE) {
            return this.itemName;
        }
        int level = Skills.getLevel(Skill.CONSTRUCTION);
        if (level >= 70) {
            return EXPERT.itemName;
        }
        if (level >= 50) {
            return ADEPT.itemName;
        }
        if (level >= 20) {
            return NOVICE.itemName;
        }
        return BEGINNER.itemName;
    }

    public int getDialogOption() {
        if (this != PROGRESSIVE) {
            return this.dialogOption;
        }
        int level = Skills.getLevel(Skill.CONSTRUCTION);
        if (level >= 70) {
            return EXPERT.dialogOption;
        }
        if (level >= 50) {
            return ADEPT.dialogOption;
        }
        if (level >= 20) {
            return NOVICE.dialogOption;
        }
        return BEGINNER.dialogOption;
    }
}
